package truth.foodables.blocks.blockentities;


import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.Inventories;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.network.packet.s2c.play.BlockEntityUpdateS2CPacket;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.RegistryWrapper.WrapperLookup;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import truth.foodables.registry.ModBlocks;
import truth.foodables.registry.ModRecipes;

import java.util.Optional;

public class DryingRackEntity extends BlockEntity implements Inventory{

    public Item result;
    public Optional<Integer> index = Optional.of(-1);
    public Optional<Integer> dryingTime = Optional.of(-1);
    private int processTime;
    private DefaultedList<ItemStack> inventory = DefaultedList.ofSize(1, ItemStack.EMPTY);

    public DryingRackEntity(BlockPos pos, BlockState state) {
        super(ModBlocks.DRYING_RACK_ENTITY, pos, state);
    }

    @Override
    public void readNbt(NbtCompound nbt, WrapperLookup registryLookup) {
        super.readNbt(nbt, registryLookup);
        this.dryingTime = nbt.getInt("Drying_Time");
        this.index = nbt.getInt("Rack_Index");
        this.inventory.clear();
        Inventories.readNbt(nbt, inventory, registryLookup);
        if (!isEmpty() && !ModRecipes.RACK_RESULT_ITEM_LIST.isEmpty() && index.get() >= 0 && ModRecipes.RACK_RESULT_ITEM_LIST.size() > index.get())
            this.result = ModRecipes.RACK_RESULT_ITEM_LIST.get(index.get());
    }

    @Override
    public void writeNbt(NbtCompound nbt, WrapperLookup registryLookup) {
        super.writeNbt(nbt, registryLookup);
        nbt.putInt("Drying_Time", dryingTime.get());
        nbt.putInt("Rack_Index", index.get());
        Inventories.writeNbt(nbt, inventory, registryLookup);
    }

    public static void serverTick(World world, BlockPos pos, BlockState state, DryingRackEntity blockEntity) {
        blockEntity.update();
    }

    private void update() {
        if (!this.world.isClient && !isEmpty() && ModRecipes.RACK_ITEM_LIST.contains(this.getStack(0).getItem()) && dryingTime.get() > 0) {
            ++this.processTime;
            if (this.processTime >= this.dryingTime.get()) {
                this.setStack(0, new ItemStack(result));
                this.processTime = 0;
            }
        }
    }

    @Override
    public void markDirty() {
        super.markDirty();
        sendUpdate();
    }

    private void sendUpdate() {
        if (this.world != null) {
        BlockState state = this.world.getBlockState(this.pos);
        (this.world).updateListeners(this.pos, state, state, 3);
        }
    }

    @Override
    public void clear() {
        this.inventory.clear();
        this.markDirty();
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
        return this.inventory.get(0);
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
    public void setStack(int slot, ItemStack stack) {
        this.clear();
        this.inventory.set(0, stack);
        this.markDirty();
    }

    @Override
    public ItemStack removeStack(int slot) {
        this.markDirty();
        return Inventories.removeStack(this.inventory, slot);
    }

    @Override
    public boolean canPlayerUse(PlayerEntity player) {
        return true;
    }

    @Override
    public BlockEntityUpdateS2CPacket toUpdatePacket() {
        return BlockEntityUpdateS2CPacket.create(this);
    }

    @Override
    public NbtCompound toInitialChunkDataNbt(RegistryWrapper.WrapperLookup registryLookup) {
        return this.createNbt(registryLookup);
    }

}
