package name.hodgepodge.item;

import name.hodgepodge.Hodgepodge;
import net.minecraft.item.*;
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
    public static final Item ECHO_APPLE = registerIiems("echo_apple", new Item(new Item.Settings().food(ModFoodComponents.ECHO_APPLE)));
    public static final Item ECHO_CARROT = registerIiems("echo_carrot", new Item(new Item.Settings().food(ModFoodComponents.ECHO_CARROT)));

    public static final Item ECHO_SWORD = registerIiems("echo_sword", new SwordItem(ModToolMaterials.ECHO_INGOT,
            new Item.Settings().fireproof().attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.ECHO_INGOT, 4, -2.4f))));
    public static final Item ECHO_AXE = registerIiems("echo_axe", new AxeItem(ModToolMaterials.ECHO_INGOT,
            new Item.Settings().fireproof().attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.ECHO_INGOT, 6, -3.0f))));
    public static final Item ECHO_PICKAXE = registerIiems("echo_pickaxe", new PickaxeItem(ModToolMaterials.ECHO_INGOT,
            new Item.Settings().fireproof().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.ECHO_INGOT, 2, -2.8f))));
    public static final Item ECHO_SHOVEL = registerIiems("echo_shovel", new ShovelItem(ModToolMaterials.ECHO_INGOT,
            new Item.Settings().fireproof().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.ECHO_INGOT, 2, -3.0f))));
    public static final Item ECHO_HOE = registerIiems("echo_hoe", new HoeItem(ModToolMaterials.ECHO_INGOT,
            new Item.Settings().fireproof().attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.ECHO_INGOT, -5, 0.0f))));

    public static final Item ECHO_HELMET = registerIiems("echo_helmet", new ArmorItem(ModArmorMaterials.ECHO_INGOT, ArmorItem.Type.HELMET,
            new Item.Settings().fireproof().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(45))));
    public static final Item ECHO_CHESTPLATE = registerIiems("echo_chestplate", new ArmorItem(ModArmorMaterials.ECHO_INGOT, ArmorItem.Type.CHESTPLATE,
            new Item.Settings().fireproof().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(45))));
    public static final Item ECHO_LEGGINGS = registerIiems("echo_leggings", new ArmorItem(ModArmorMaterials.ECHO_INGOT, ArmorItem.Type.LEGGINGS,
            new Item.Settings().fireproof().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(45))));
    public static final Item ECHO_BOOTS = registerIiems("echo_boots", new ArmorItem(ModArmorMaterials.ECHO_INGOT, ArmorItem.Type.BOOTS,
            new Item.Settings().fireproof().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(45))));

    public static Item registerIiems(String id, Item item) {
        return Registry.register(Registries.ITEM, RegistryKey.of(Registries.ITEM.getKey(), Identifier.of(Hodgepodge.MOD_ID, id)), item);
    }

    public static void registerModItems() {
        Hodgepodge.LOGGER.info("Registering Items");
    }
}
