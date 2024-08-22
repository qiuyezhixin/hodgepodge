package name.hodgepodge.item;

import name.hodgepodge.Hodgepodge;
import name.hodgepodge.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final RegistryKey<ItemGroup> HODGEPODGE_GROUP = register("hodgepodge_group");

    public static RegistryKey<ItemGroup> register(String id) {
        return RegistryKey.of(RegistryKeys.ITEM_GROUP, Identifier.of(Hodgepodge.MOD_ID, id));
    }

    public static void registerModItemGroups() {
        Registry.register(Registries.ITEM_GROUP, HODGEPODGE_GROUP,
                ItemGroup.create(ItemGroup.Row.TOP, 7)
                        .displayName(Text.translatable("itemGroup.hodgepodge_group"))
                        .icon(() -> new ItemStack(ModItems.ECHO_INGOT))
                        .entries((displayContext, entries) ->{
                            entries.add(ModItems.ECHO_INGOT);
                            entries.add(ModItems.ECHO_NUGGET);
                            entries.add(ModItems.ECHO_UPGRADE_SMITHING_TEMPLATE);
                            entries.add(ModItems.RAW_ECHO);

                            entries.add(ModBlocks.ECHO_BLOCK);
                            entries.add(ModBlocks.ECHO_ORE);
                            entries.add(ModBlocks.DEEPSLATE_ECHO_ORE);
                            entries.add(ModBlocks.RAW_ECHO_BLOCK);
                        }).build());
        Hodgepodge.LOGGER.info("registering Item Groups");
    }
}
