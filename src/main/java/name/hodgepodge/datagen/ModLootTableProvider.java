package name.hodgepodge.datagen;

import name.hodgepodge.block.ModBlocks;
import name.hodgepodge.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.ECHO_BLOCK);
        addDrop(ModBlocks.ECHO_ORE, oreDrops(ModBlocks.ECHO_ORE, ModItems.ECHO_INGOT));
        addDrop(ModBlocks.DEEPSLATE_ECHO_ORE, oreDrops(ModBlocks.DEEPSLATE_ECHO_ORE, ModItems.ECHO_INGOT));
        addDrop(ModBlocks.RAW_ECHO_BLOCK);
    }
}
