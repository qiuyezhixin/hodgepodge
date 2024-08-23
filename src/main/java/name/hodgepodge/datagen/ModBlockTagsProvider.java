package name.hodgepodge.datagen;

import name.hodgepodge.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagsProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagsProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }
    @Override
    protected  void  configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.ECHO_BLOCK)
                .add(ModBlocks.ECHO_ORE)
                .add(ModBlocks.DEEPSLATE_ECHO_ORE)
                .add(ModBlocks.RAW_ECHO_BLOCK);

        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.ECHO_BLOCK)
                .add(ModBlocks.ECHO_ORE)
                .add(ModBlocks.DEEPSLATE_ECHO_ORE)
                .add(ModBlocks.RAW_ECHO_BLOCK);
    }
}
