package name.hodgepodge.datagen;

import name.hodgepodge.block.ModBlocks;
import name.hodgepodge.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModENUSLanProvider extends FabricLanguageProvider {
    public ModENUSLanProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput,"en_us", registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup registryLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add(ModItems.ECHO_INGOT, "Echo Ingot");
        translationBuilder.add(ModItems.ECHO_NUGGET, "Echo Nugget");
        translationBuilder.add(ModItems.ECHO_UPGRADE_SMITHING_TEMPLATE, "Smithing Template");
        translationBuilder.add(ModItems.RAW_ECHO, "Raw Echo");

        translationBuilder.add(ModBlocks.ECHO_BLOCK, "Echo Block");
        translationBuilder.add(ModBlocks.ECHO_ORE, "Echo Ore");
        translationBuilder.add(ModBlocks.DEEPSLATE_ECHO_ORE, "Deepslate Echo Ore");
        translationBuilder.add(ModBlocks.RAW_ECHO_BLOCK, "Raw Echo Block");

        translationBuilder.add("itemGroup.hodgepodge_group", "hodgepodge_group");
    }
}
