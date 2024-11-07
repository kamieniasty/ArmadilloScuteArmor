package com.kamieniasty.armadillo_scute_armor.datagen;

import com.kamieniasty.armadillo_scute_armor.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.ARMADILLO_PLAYER_HELMET, ModItems.ARMADILLO_PLAYER_CHESTPLATE,
                        ModItems.ARMADILLO_PLAYER_LEGGINGS, ModItems.ARMADILLO_PLAYER_BOOTS);

        getOrCreateTagBuilder(ItemTags.ARMOR_ENCHANTABLE).add(
                ModItems.ARMADILLO_PLAYER_HELMET,
                ModItems.ARMADILLO_PLAYER_CHESTPLATE,
                ModItems.ARMADILLO_PLAYER_LEGGINGS,
                ModItems.ARMADILLO_PLAYER_BOOTS
        );
        getOrCreateTagBuilder(ItemTags.HEAD_ARMOR).add(ModItems.ARMADILLO_PLAYER_HELMET);
        getOrCreateTagBuilder(ItemTags.CHEST_ARMOR).add(ModItems.ARMADILLO_PLAYER_CHESTPLATE);
        getOrCreateTagBuilder(ItemTags.LEG_ARMOR).add(ModItems.ARMADILLO_PLAYER_LEGGINGS);
        getOrCreateTagBuilder(ItemTags.FOOT_ARMOR).add(ModItems.ARMADILLO_PLAYER_BOOTS);

        getOrCreateTagBuilder(ItemTags.HEAD_ARMOR_ENCHANTABLE).add(ModItems.ARMADILLO_PLAYER_HELMET);
        getOrCreateTagBuilder(ItemTags.CHEST_ARMOR_ENCHANTABLE).add(ModItems.ARMADILLO_PLAYER_CHESTPLATE);
        getOrCreateTagBuilder(ItemTags.LEG_ARMOR_ENCHANTABLE).add(ModItems.ARMADILLO_PLAYER_LEGGINGS);
        getOrCreateTagBuilder(ItemTags.FOOT_ARMOR_ENCHANTABLE).add(ModItems.ARMADILLO_PLAYER_BOOTS);
    }

}
