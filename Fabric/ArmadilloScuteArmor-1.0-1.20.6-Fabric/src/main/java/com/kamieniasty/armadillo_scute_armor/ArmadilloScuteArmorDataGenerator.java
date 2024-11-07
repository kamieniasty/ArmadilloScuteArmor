package com.kamieniasty.armadillo_scute_armor;

import com.kamieniasty.armadillo_scute_armor.datagen.ModItemTagProvider;
import com.kamieniasty.armadillo_scute_armor.datagen.ModModelProvider;
import com.kamieniasty.armadillo_scute_armor.datagen.ModRecipeProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class ArmadilloScuteArmorDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
		pack.addProvider(ModItemTagProvider::new);
		pack.addProvider(ModModelProvider::new);
		pack.addProvider(ModRecipeProvider::new);
	}
}
