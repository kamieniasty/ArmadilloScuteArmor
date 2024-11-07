package com.kamieniasty.armadillo_scute_armor.datagen;

import com.kamieniasty.armadillo_scute_armor.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ARMADILLO_PLAYER_HELMET, 1)
                .pattern("SSS")
                .pattern("S S")
                .input('S', Items.ARMADILLO_SCUTE)
                .criterion(hasItem(Items.ARMADILLO_SCUTE), conditionsFromItem(Items.ARMADILLO_SCUTE))
                .criterion(hasItem(Items.ARMADILLO_SCUTE), conditionsFromItem(Items.ARMADILLO_SCUTE))
                .offerTo(exporter, Identifier.of(getRecipeName(ModItems.ARMADILLO_PLAYER_HELMET)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ARMADILLO_PLAYER_CHESTPLATE, 1)
                .pattern("S S")
                .pattern("SSS")
                .pattern("SSS")
                .input('S', Items.ARMADILLO_SCUTE)
                .criterion(hasItem(Items.ARMADILLO_SCUTE), conditionsFromItem(Items.ARMADILLO_SCUTE))
                .criterion(hasItem(Items.ARMADILLO_SCUTE), conditionsFromItem(Items.ARMADILLO_SCUTE))
                .offerTo(exporter, Identifier.of(getRecipeName(ModItems.ARMADILLO_PLAYER_CHESTPLATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ARMADILLO_PLAYER_LEGGINGS, 1)
                .pattern("SSS")
                .pattern("S S")
                .pattern("S S")
                .input('S', Items.ARMADILLO_SCUTE)
                .criterion(hasItem(Items.ARMADILLO_SCUTE), conditionsFromItem(Items.ARMADILLO_SCUTE))
                .criterion(hasItem(Items.ARMADILLO_SCUTE), conditionsFromItem(Items.ARMADILLO_SCUTE))
                .offerTo(exporter, Identifier.of(getRecipeName(ModItems.ARMADILLO_PLAYER_LEGGINGS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ARMADILLO_PLAYER_BOOTS, 1)
                .pattern("S S")
                .pattern("S S")
                .input('S', Items.ARMADILLO_SCUTE)
                .criterion(hasItem(Items.ARMADILLO_SCUTE), conditionsFromItem(Items.ARMADILLO_SCUTE))
                .criterion(hasItem(Items.ARMADILLO_SCUTE), conditionsFromItem(Items.ARMADILLO_SCUTE))
                .offerTo(exporter, Identifier.of(getRecipeName(ModItems.ARMADILLO_PLAYER_BOOTS)));
    }


}
