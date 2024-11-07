package com.kamieniasty.armadillo_scute_armor.item;

import com.kamieniasty.armadillo_scute_armor.ArmadilloScuteArmor;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item ARMADILLO_PLAYER_HELMET = registerItem("armadillo_player_helmet",
            new ArmorItem(ModArmorMaterials.ARMADILLO_PLAYER, ArmorItem.Type.HELMET, new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(10))));
    public static final Item ARMADILLO_PLAYER_CHESTPLATE = registerItem("armadillo_player_chestplate",
            new ArmorItem(ModArmorMaterials.ARMADILLO_PLAYER, ArmorItem.Type.CHESTPLATE, new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(10))));
    public static final Item ARMADILLO_PLAYER_LEGGINGS = registerItem("armadillo_player_leggings",
            new ArmorItem(ModArmorMaterials.ARMADILLO_PLAYER, ArmorItem.Type.LEGGINGS, new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(10))));
    public static final Item ARMADILLO_PLAYER_BOOTS = registerItem("armadillo_player_boots",
            new ArmorItem(ModArmorMaterials.ARMADILLO_PLAYER, ArmorItem.Type.BOOTS, new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(10))));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(ArmadilloScuteArmor.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ArmadilloScuteArmor.LOGGER.info("Registering Mod Items for " + ArmadilloScuteArmor.MOD_ID);
    }
}
