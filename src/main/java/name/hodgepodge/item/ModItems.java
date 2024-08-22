package name.hodgepodge.item;

import name.hodgepodge.Hodgepodge;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item ECHO_INGOT = registerIiems("echo_ingot", new Item(new Item.Settings()));
    public static final Item ECHO_NUGGET = registerIiems("echo_nugget", new Item(new Item.Settings()));
    public static final Item ECHO_UPGRADE_SMITHING_TEMPLATE = registerIiems("echo_upgrade_smithing_template", new Item(new Item.Settings()));
    public static final Item RAW_ECHO = registerIiems("raw_echo", new Item(new Item.Settings()));
    public static final Item ECHO_STAR = registerIiems("echo_star", new Item(new Item.Settings()));
    public static Item registerIiems(String id, Item item) {
        return Registry.register(Registries.ITEM, RegistryKey.of(Registries.ITEM.getKey(), Identifier.of(Hodgepodge.MOD_ID, id)), item);
    }

    public static void addItemToIG(FabricItemGroupEntries fabricItemGroupEntries) {
        fabricItemGroupEntries.add(ECHO_INGOT);
        fabricItemGroupEntries.add(ECHO_NUGGET);
        fabricItemGroupEntries.add(ECHO_UPGRADE_SMITHING_TEMPLATE);
        fabricItemGroupEntries.add(RAW_ECHO);
        fabricItemGroupEntries.add(ECHO_STAR);
    }
    public static void registerModItems() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemToIG);
        Hodgepodge.LOGGER.info("Registering Items");
    }
}
