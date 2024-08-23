package name.hodgepodge.datagen;

import name.hodgepodge.block.ModBlocks;
import name.hodgepodge.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelsProvider extends FabricModelProvider {
    public ModModelsProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ECHO_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ECHO_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_ECHO_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_ECHO_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.ECHO_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.ECHO_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ModItems.ECHO_UPGRADE_SMITHING_TEMPLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_ECHO, Models.GENERATED);
    }
}
