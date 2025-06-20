package truth.foodables.blocks.blockentities;


import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.Inventories;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.network.listener.ClientPlayPacketListener;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.BlockEntityUpdateS2CPacket;
import net.minecraft.recipe.RecipeEntry;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.RegistryWrapper.WrapperLookup;
import net.minecraft.screen.PropertyDelegate;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import truth.foodables.recipe.DryingRackRecipe;
import truth.foodables.recipe.DryingRackRecipeInput;
import truth.foodables.registry.ModBlocks;
import truth.foodables.registry.ModRecipes;

import java.util.Optional;

public class DryingRackEntity extends BlockEntity implements Inventory{
    private DefaultedList<ItemStack> inventory = DefaultedList.ofSize(1, ItemStack.EMPTY);
    private static final int INPUT_SLOT = 0;

    protected final PropertyDelegate propertyDelegate;
    private Optional<Integer> progress = Optional.of(0);
    private Optional<Integer> maxProgress = Optional.of(2400);

    public Item result;

    public DryingRackEntity(BlockPos pos, BlockState state) {
        super(ModBlocks.DRYING_RACK_ENTITY, pos, state);
        this.propertyDelegate = new PropertyDelegate() {
            @Override
            public int get(int index) {
                return switch (index) {
                    case 0 -> DryingRackEntity.this.progress.orElseThrow();
                    case 1 -> DryingRackEntity.this.maxProgress.orElseThrow();
                    default -> 0;
                };
            }

            @Override
            public void set(int index, int value) {
                switch (index) {
                    case 0: DryingRackEntity.this.progress = Optional.of(value);
                    case 1: DryingRackEntity.this.maxProgress = Optional.of(value);
                }
            }

            @Override
            public int size() {
                return 1;
            }
        };
    }

    public DefaultedList<ItemStack> getItems() {
        return inventory;
    }

    @Override
    protected void writeNbt(NbtCompound nbt, RegistryWrapper.WrapperLookup registryLookup) {
        super.writeNbt(nbt, registryLookup);
        Inventories.writeNbt(nbt, inventory, registryLookup);
        nbt.putInt("drying_rack.progress", progress.orElseThrow());
        nbt.putInt("drying_rack.max_progress", maxProgress.orElseThrow());
    }

    @Override
    protected void readNbt(NbtCompound nbt, RegistryWrapper.WrapperLookup registryLookup) {
        Inventories.readNbt(nbt, inventory, registryLookup);
        progress = nbt.getInt("drying_rack.progress");
        maxProgress = nbt.getInt("drying_rack.max_progress");
        super.readNbt(nbt, registryLookup);
    }

    public void tick(World world, BlockPos pos, BlockState state) {
        if(hasRecipe()) {
            increaseCraftingProgress();
            markDirty(world, pos, state);

            if(hasCraftingFinished()) {
                craftItem();
                resetProgress();
            }
        } else {
            resetProgress();
        }
    }

    private void resetProgress() {
        this.progress = Optional.of(0);
        this.maxProgress = Optional.of(2400);
    }

    private void craftItem() {
        Optional<RecipeEntry<DryingRackRecipe>> recipe = getCurrentRecipe();

        ItemStack output = recipe.get().value().output();
        this.removeStack(INPUT_SLOT, 1);
        this.setStack(INPUT_SLOT, new ItemStack(output.getItem(),
                this.getStack(INPUT_SLOT).getCount() + output.getCount()));
    }

    private boolean hasCraftingFinished() {
        return this.progress.orElseThrow() >= this.maxProgress.orElseThrow();
    }

    private void increaseCraftingProgress() {
        this.progress = Optional.of(this.progress.orElseThrow() + 1);
    }

    private boolean hasRecipe() {
        Optional<RecipeEntry<DryingRackRecipe>> recipe = getCurrentRecipe();
        return recipe.isPresent();
    }

    private Optional<RecipeEntry<DryingRackRecipe>> getCurrentRecipe() {
        return ((ServerWorld) this.getWorld()).getRecipeManager()
                .getFirstMatch(ModRecipes.DRYING_RACK_RECIPE_TYPE, new DryingRackRecipeInput(inventory.get(INPUT_SLOT)), this.getWorld());
    }

    public boolean hasRecipe(ItemStack heldItem) {
        Optional<RecipeEntry<DryingRackRecipe>> recipe = checkHandheldRecipe(heldItem);
        return recipe.isPresent();
    }

    private Optional<RecipeEntry<DryingRackRecipe>> checkHandheldRecipe(ItemStack heldItem) {
        return ((ServerWorld) this.getWorld()).getRecipeManager()
                .getFirstMatch(ModRecipes.DRYING_RACK_RECIPE_TYPE, new DryingRackRecipeInput(heldItem), this.getWorld());
    }

    @Override
    public int size() {
        return 1;
    }

    @Override
    public boolean isEmpty() {
        return this.getStack(0).isEmpty();
    }

    @Override
    public ItemStack getStack(int slot) {
        return this.inventory.getFirst();
    }

    @Override
    public ItemStack removeStack(int slot, int amount) {
        ItemStack result = Inventories.splitStack(this.inventory, slot, 1);
        if (!result.isEmpty()) {
            markDirty();
        }
        return result;
    }

    @Override
    public ItemStack removeStack(int slot) {
        this.markDirty();
        return Inventories.removeStack(this.inventory, slot);
    }

    @Override
    public void setStack(int slot, ItemStack stack) {
        this.clear();
        this.inventory.set(0, stack);
        this.markDirty();
    }

    @Override
    public void clear() {
        this.inventory.clear();
        this.markDirty();
    }

    @Override
    public void markDirty() {
        sendUpdate();
        super.markDirty();
    }

    @Override
    public boolean canPlayerUse(PlayerEntity playerEntity) {
        return true;
    }

    private void sendUpdate() {
        if (this.world != null) {
            BlockState state = this.world.getBlockState(this.pos);
            (this.world).updateListeners(this.pos, state, state, 3);
        }
    }

    @Nullable
    @Override
    public BlockEntityUpdateS2CPacket toUpdatePacket() {
        return BlockEntityUpdateS2CPacket.create(this);
    }

    @Override
    public NbtCompound toInitialChunkDataNbt(RegistryWrapper.WrapperLookup registryLookup) {
        return createNbt(registryLookup);
    }

}
