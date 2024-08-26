package name.hodgepodge.block;

import name.hodgepodge.Hodgepodge;
import name.hodgepodge.block.custom.CornCropBlock;
import name.hodgepodge.block.custom.StrawbrryCropBlock;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block ECHO_BLOCK = register("echo_block", new Block(AbstractBlock.Settings.create().requiresTool().strength(60f, 1300f)));
    public static final Block ECHO_ORE = register("echo_ore", new Block(AbstractBlock.Settings.create().requiresTool().strength(40f, 1300f)));
    public static final Block DEEPSLATE_ECHO_ORE = register("deepslate_echo_ore", new Block(AbstractBlock.Settings.create().requiresTool().strength(55f, 1300f)));
    public static final Block RAW_ECHO_BLOCK = register("raw_echo_block", new Block(AbstractBlock.Settings.create().requiresTool().strength(40f, 1300f)));
    public static final Block ECHO_COBBLESTONE = register("echo_cobblestone", new Block(AbstractBlock.Settings.create().requiresTool().strength(3f, 7f)));

    public static final Block ECHO_COBBLESTONE_STAIRS = register("echo_cobblestone_stairs",
            new StairsBlock(ECHO_COBBLESTONE.getDefaultState(), AbstractBlock.Settings.copy(ECHO_COBBLESTONE)));
    public static final Block ECHO_COBBLESTONE_SLAB = register("echo_cobblestone_slab",
            new SlabBlock(AbstractBlock.Settings.copy(ECHO_COBBLESTONE)));
    public static final Block ECHO_COBBLESTONE_BUTTON = register("echo_cobblestone_button",
            new ButtonBlock(BlockSetType.OAK, 10, AbstractBlock.Settings.copy(ECHO_COBBLESTONE).noCollision()));
    public static final Block ECHO_COBBLESTONE_PRESSURE_PLATE = register("echo_cobblestone_pressure_plate",
            new PressurePlateBlock(BlockSetType.OAK, AbstractBlock.Settings.copy(ECHO_COBBLESTONE).noCollision()));
    public static final Block ECHO_COBBLESTONE_FENCE = register("echo_cobblestone_fence",
            new FenceBlock(AbstractBlock.Settings.copy(ECHO_COBBLESTONE)));
    public static final Block ECHO_COBBLESTONE_FENCE_GATE = register("echo_cobblestone_fence_gate",
            new FenceGateBlock(WoodType.OAK, AbstractBlock.Settings.copy(ECHO_COBBLESTONE)));
    public static final Block ECHO_COBBLESTONE_WALL = register("echo_cobblestone_wall",
            new WallBlock(AbstractBlock.Settings.copy(ECHO_COBBLESTONE)));
    public static final Block ECHO_COBBLESTONE_DOOR = register("echo_cobblestone_door",
            new DoorBlock(BlockSetType.IRON, AbstractBlock.Settings.copy(ECHO_COBBLESTONE).nonOpaque()));
    public static final Block ECHO_COBBLESTONE_TRAPDOOR = register("echo_cobblestone_trapdoor",
            new TrapdoorBlock(BlockSetType.IRON, AbstractBlock.Settings.copy(ECHO_COBBLESTONE).nonOpaque()));

    public static final Block CHILI_SEEDS_FARMLAND = Registry.register(Registries.BLOCK , Identifier.of(Hodgepodge.MOD_ID, "chili_seeds_farmland"),
            new StrawbrryCropBlock(AbstractBlock.Settings.copy(Blocks.WHEAT)));
    public static final Block PITAYA_SEEDS_STAGE = Registry.register(Registries.BLOCK, Identifier.of(Hodgepodge.MOD_ID, "pitaya_seeds_stage"),
            new CornCropBlock(AbstractBlock.Settings.copy(Blocks.WHEAT)));

    public static void registerBlockItems(String id, Block block) {
        Item item = Registry.register(Registries.ITEM, Identifier.of(Hodgepodge.MOD_ID, id), new BlockItem(block, new Item.Settings()));
        if (item instanceof  BlockItem) {
            ((BlockItem)item).appendBlocks(Item.BLOCK_ITEMS, item);
        }
    }
    public static Block register(String id, Block block) {
        registerBlockItems(id, block);
        return Registry.register(Registries.BLOCK, Identifier.of(Hodgepodge.MOD_ID, id), block);
    }

    public static void registerModBlocks() {
        Hodgepodge.LOGGER.info("Registering Blocks");
    }
}
