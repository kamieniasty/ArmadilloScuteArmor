package com.kamieniasty.armadillo_scute_armor;

import com.kamieniasty.armadillo_scute_armor.item.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ArmadilloScuteArmor implements ModInitializer {
	public static final String MOD_ID = "armadillo_scute_armor";
    public static final Logger LOGGER = LoggerFactory.getLogger("armadillo_scute_armor");

	public void onInitialize() {
		ModItems.registerModItems();

		LOGGER.info("Hello Fabric world!");

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> {
			entries.addAfter(Items.LEATHER_BOOTS, ModItems.ARMADILLO_PLAYER_HELMET);
			entries.addAfter(ModItems.ARMADILLO_PLAYER_HELMET, ModItems.ARMADILLO_PLAYER_CHESTPLATE);
			entries.addAfter(ModItems.ARMADILLO_PLAYER_CHESTPLATE, ModItems.ARMADILLO_PLAYER_LEGGINGS);
			entries.addAfter(ModItems.ARMADILLO_PLAYER_LEGGINGS, ModItems.ARMADILLO_PLAYER_BOOTS);
		});
	}
}