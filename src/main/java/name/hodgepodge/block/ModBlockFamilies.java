package name.hodgepodge.block;

import com.google.common.collect.Maps;
import net.minecraft.block.Block;
import net.minecraft.data.family.BlockFamily;
import net.minecraft.registry.Registries;

import java.util.Map;

public class ModBlockFamilies {
    public static final Map<Block, BlockFamily> BASE_BLOCKS_TO_FAMILIES = Maps.newHashMap();
    public static final BlockFamily ECHO_SHARD = register(ModBlocks.ECHO_COBBLESTONE)
            .stairs(ModBlocks.ECHO_COBBLESTONE_STAIRS)
            .slab(ModBlocks.ECHO_COBBLESTONE_SLAB)
            .button(ModBlocks.ECHO_COBBLESTONE_BUTTON)
            .pressurePlate(ModBlocks.ECHO_COBBLESTONE_PRESSURE_PLATE)
            .fence(ModBlocks.ECHO_COBBLESTONE_FENCE)
            .fenceGate(ModBlocks.ECHO_COBBLESTONE_FENCE_GATE)
            .wall(ModBlocks.ECHO_COBBLESTONE_WALL)
            .door(ModBlocks.ECHO_COBBLESTONE_DOOR)
            .trapdoor(ModBlocks.ECHO_COBBLESTONE_TRAPDOOR)
            .unlockCriterionName("has_echo_cobblestone")
            .build();
    public static BlockFamily.Builder register(Block baseBlock) {
        BlockFamily.Builder builder = new BlockFamily.Builder(baseBlock);
        BlockFamily blockFamily = (BlockFamily) BASE_BLOCKS_TO_FAMILIES.put(baseBlock, builder.build());
        if (blockFamily != null) {
            throw new IllegalStateException("Duplicate family definition for " + Registries.BLOCK.getId(baseBlock));
        } else {
            return builder;
        }
    }
}
