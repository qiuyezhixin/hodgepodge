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
                            entries.add(ModItems.ECHO_STAR);
                            entries.add(ModItems.ECHO_APPLE);
                            entries.add(ModItems.ECHO_CARROT);
                            entries.add(ModItems.CHILI_SEEDS);
                            entries.add(ModItems.CHILI);
                            entries.add(ModItems.PITAYA_SEEDS);
                            entries.add(ModItems.PITAYA);

                            entries.add(ModItems.ECHO_SWORD);
                            entries.add(ModItems.ECHO_AXE);
                            entries.add(ModItems.ECHO_PICKAXE);
                            entries.add(ModItems.ECHO_SHOVEL);
                            entries.add(ModItems.ECHO_HOE);

                            entries.add(ModItems.ECHO_HELMET);
                            entries.add(ModItems.ECHO_CHESTPLATE);
                            entries.add(ModItems.ECHO_LEGGINGS);
                            entries.add(ModItems.ECHO_BOOTS);

                            entries.add(ModBlocks.ECHO_BLOCK);
                            entries.add(ModBlocks.ECHO_ORE);
                            entries.add(ModBlocks.DEEPSLATE_ECHO_ORE);
                            entries.add(ModBlocks.RAW_ECHO_BLOCK);
                            entries.add(ModBlocks.ECHO_COBBLESTONE);

                            entries.add(ModBlocks.ECHO_COBBLESTONE_STAIRS);
                            entries.add(ModBlocks.ECHO_COBBLESTONE_SLAB);
                            entries.add(ModBlocks.ECHO_COBBLESTONE_BUTTON);
                            entries.add(ModBlocks.ECHO_COBBLESTONE_PRESSURE_PLATE);
                            entries.add(ModBlocks.ECHO_COBBLESTONE_FENCE);
                            entries.add(ModBlocks.ECHO_COBBLESTONE_FENCE_GATE);
                            entries.add(ModBlocks.ECHO_COBBLESTONE_WALL);
                            entries.add(ModBlocks.ECHO_COBBLESTONE_TRAPDOOR);
                            entries.add(ModBlocks.ECHO_COBBLESTONE_DOOR);

                        }).build());
        Hodgepodge.LOGGER.info("registering Item Groups");
    }
}
