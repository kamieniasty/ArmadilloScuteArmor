package com.kamieniasty.armadillo_scute_armor;

import com.kamieniasty.armadillo_scute_armor.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ArmadilloScuteArmor {
	public static final String MOD_ID = "armadillo_scute_armor";
    public static final Logger LOGGER = LoggerFactory.getLogger("armadillo_scute_armor");

	@Override
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