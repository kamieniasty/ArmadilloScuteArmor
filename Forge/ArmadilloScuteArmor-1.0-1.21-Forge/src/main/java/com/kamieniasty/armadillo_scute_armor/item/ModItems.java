package com.kamieniasty.armadillo_scute_armor.item;

import com.kamieniasty.armadillo_scute_armor.ArmadilloScuteArmor;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ArmadilloScuteArmor.MOD_ID);

    public static final RegistryObject<Item> ARMADILLO_PLAYER_HELMET = ITEMS.register("armadillo_player_helmet",
            () -> new ArmorItem(ModArmorMaterials.ARMADILLO_PLAYER, ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(10))));
    public static final RegistryObject<Item> ARMADILLO_PLAYER_CHESTPLATE = ITEMS.register("armadillo_player_chestplate",
            () -> new ArmorItem(ModArmorMaterials.ARMADILLO_PLAYER, ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(10))));
    public static final RegistryObject<Item> ARMADILLO_PLAYER_LEGGINGS = ITEMS.register("armadillo_player_leggings",
            () -> new ArmorItem(ModArmorMaterials.ARMADILLO_PLAYER, ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(10))));
    public static final RegistryObject<Item> ARMADILLO_PLAYER_BOOTS = ITEMS.register("armadillo_player_boots",
            () -> new ArmorItem(ModArmorMaterials.ARMADILLO_PLAYER, ArmorItem.Type.BOOTS, new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(10))));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}


