package com.kamieniasty.armadillo_scute_armor.datagen;

import com.kamieniasty.armadillo_scute_armor.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.item.ArmorItem;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ARMADILLO_PLAYER_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ARMADILLO_PLAYER_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ARMADILLO_PLAYER_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ARMADILLO_PLAYER_BOOTS));
    }
}
