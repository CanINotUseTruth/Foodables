package truth.foodables.blocks.blockentityrenderers;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.block.entity.BlockEntityRenderer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.item.ItemDisplayContext;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.RotationAxis;
import net.minecraft.util.math.Vec3d;
import truth.foodables.blocks.DryingRack;
import truth.foodables.blocks.blockentities.DryingRackEntity;

@Environment(EnvType.CLIENT)
public class DryingRackRenderer implements BlockEntityRenderer<DryingRackEntity> {

    public DryingRackRenderer(BlockEntityRendererFactory.Context context) {
    }

    @Override
    public void render(DryingRackEntity entity, float tickDelta, MatrixStack matrixStack, VertexConsumerProvider vertexConsumers, int light, int overlay, Vec3d cameraPos) {
        
        ItemRenderer itemRenderer = MinecraftClient.getInstance().getItemRenderer();
        ItemStack itemStack = entity.getStack(0);
        Direction dir = (Direction)entity.getCachedState().get(DryingRack.FACING);
        int k = (int)entity.getPos().asLong();

        if (!itemStack.isEmpty()) {
            matrixStack.push();
            switch(dir) {
                case NORTH:
                    matrixStack.translate(0.5F, 0.4375F, 0.90625F);
                    break;
                case SOUTH:
                    matrixStack.translate(0.5F, 0.4375F, 0.09500F);
                    matrixStack.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(180F));
                    break;
                case EAST:
                    matrixStack.translate(0.09500F, 0.4375F, 0.5F);
                    matrixStack.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(270F));
                    break;
                case WEST:
                    matrixStack.translate(0.90625F, 0.4375F, 0.5F);
                    matrixStack.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(90F));
                    break;
                default:
                    
            }
            itemRenderer.renderItem(itemStack, ItemDisplayContext.FIXED, light, overlay, matrixStack, vertexConsumers, entity.getWorld(), k);
            matrixStack.pop();
        }

    }
    
}
