package name.hodgepodge.datagen;

import name.hodgepodge.Hodgepodge;
import name.hodgepodge.block.ModBlocks;
import name.hodgepodge.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.RecipeProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.CampfireCookingRecipe;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import static net.minecraft.data.client.TextureMap.pattern;

public class ModRecipesProvider extends FabricRecipeProvider {
    public static final List<ItemConvertible> ECHO_INGOT = List.of(ModItems.RAW_ECHO);
    public ModRecipesProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.ECHO_INGOT,
                RecipeCategory.BUILDING_BLOCKS, ModBlocks.ECHO_BLOCK);
        offerSmelting(exporter, ECHO_INGOT, RecipeCategory.MISC, ModItems.ECHO_INGOT,
                1.7f, 200, "echo_ingot");
        offerBlasting(exporter, ECHO_INGOT, RecipeCategory.MISC, ModItems.ECHO_INGOT,
                1.7f, 200, "echo_ingot");
        offerFoodCookingRecipe(exporter, "campfire_cooking", RecipeSerializer.CAMPFIRE_COOKING, CampfireCookingRecipe::new,
                600, ModItems.RAW_ECHO, ModItems.ECHO_INGOT, 0.35f);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Items.SUGAR, 1)
                .pattern(" # ")
                .pattern("#X#")
                .pattern(" # ")
                .input('#', Ingredient.ofItems(ModItems.ECHO_INGOT))
                .input('X', Ingredient.ofItems(Items.NETHER_STAR))
                .criterion("has_item", RecipeProvider.conditionsFromItem(ModItems.ECHO_INGOT))
                .criterion("has_item", RecipeProvider.conditionsFromItem(Items.NETHER_STAR))
                .offerTo(exporter, Identifier.of(Hodgepodge.MOD_ID, "echo_star"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModItems.ECHO_INGOT)
                .input(Items.NETHERITE_INGOT)
                .input(Items.ECHO_SHARD)
                .input(Items.ECHO_SHARD)
                .input(Items.ECHO_SHARD)
                .input(Items.ECHO_SHARD)
                .criterion("has_item", RecipeProvider.conditionsFromItem(Items.NETHERITE_INGOT))
                .criterion("has_item", RecipeProvider.conditionsFromItem(Items.ECHO_SHARD))
                .offerTo(exporter, Identifier.of(Hodgepodge.MOD_ID, "echo_ingot_echo"));
    }
}
