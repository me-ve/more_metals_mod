package com.meve.moremetals.init;

import com.meve.moremetals.MoreMetals;
import com.meve.moremetals.items.DaggerItem;
import com.meve.moremetals.util.enums.ModArmorMaterial;
import com.meve.moremetals.util.enums.ModItemTier;
import net.minecraft.item.*;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MoreMetals.MOD_ID);

    // Items
    public static final RegistryObject<Item> SILVER_INGOT =
            ITEMS.register("silver_ingot",
            () -> new Item(new Item.Properties().group(MoreMetals.TAB)));

    // Block Items
    public static final RegistryObject<Item> SILVER_BLOCK_ITEM =
            ITEMS.register("silver_block_item",
            () -> new BlockItem(ModBlocks.SILVER_BLOCK.get(),
                    new Item.Properties().group(MoreMetals.TAB)));

    public static final RegistryObject<Item> SILVER_ORE_ITEM =
            ITEMS.register("silver_ore_item",
            () -> new BlockItem(ModBlocks.SILVER_ORE.get(),
                    new Item.Properties().group(MoreMetals.TAB)));

    // Tools
    public static final RegistryObject<DaggerItem> NETHERITE_DAGGER =
            ITEMS.register("netherite_dagger",
                    () -> new DaggerItem(ItemTier.NETHERITE,
                            1.5F,-1.9F,
                            new Item.Properties().group(MoreMetals.TAB)));

    public static final RegistryObject<DaggerItem> DIAMOND_DAGGER =
            ITEMS.register("diamond_dagger",
                    () -> new DaggerItem(ItemTier.DIAMOND,
                            1.5F,-1.9F,
                            new Item.Properties().group(MoreMetals.TAB)));

    public static final RegistryObject<DaggerItem> GOLD_DAGGER =
            ITEMS.register("gold_dagger",
                    () -> new DaggerItem(ItemTier.GOLD,
                            1.5F,-1.9F,
                            new Item.Properties().group(MoreMetals.TAB)));

    public static final RegistryObject<DaggerItem> SILVER_DAGGER =
            ITEMS.register("silver_dagger",
                    () -> new DaggerItem(ModItemTier.SILVER,
                            1.5F,-1.9F,
                            new Item.Properties().group(MoreMetals.TAB)));

    public static final RegistryObject<DaggerItem> IRON_DAGGER =
            ITEMS.register("iron_dagger",
                    () -> new DaggerItem(ItemTier.IRON,
                            1.5F,-1.9F,
                            new Item.Properties().group(MoreMetals.TAB)));

    public static final RegistryObject<DaggerItem> STONE_DAGGER =
            ITEMS.register("stone_dagger",
                    () -> new DaggerItem(ItemTier.STONE,
                            1.5F,-1.9F,
                            new Item.Properties().group(MoreMetals.TAB)));

    public static final RegistryObject<DaggerItem> WOODEN_DAGGER =
            ITEMS.register("wooden_dagger",
                    () -> new DaggerItem(ItemTier.WOOD,
                            1.5F,-1.9F,
                            new Item.Properties().group(MoreMetals.TAB)));

    public static final RegistryObject<SwordItem> SILVER_SWORD =
            ITEMS.register("silver_sword",
            () -> new SwordItem(ModItemTier.SILVER,
                    3,-2.4F,
                    new Item.Properties().group(MoreMetals.TAB)));

    public static final RegistryObject<PickaxeItem> SILVER_PICKAXE =
            ITEMS.register("silver_pickaxe",
            () -> new PickaxeItem(ModItemTier.SILVER,
                   1, -2.8F,
                    new Item.Properties().group(MoreMetals.TAB)));

    public static final RegistryObject<ShovelItem> SILVER_SHOVEL = ITEMS.register("silver_shovel",
            () -> new ShovelItem(ModItemTier.SILVER,
                   1.5F, -3.0F,
                    new Item.Properties().group(MoreMetals.TAB)));

    public static final RegistryObject<AxeItem> SILVER_AXE = ITEMS.register("silver_axe",
            () -> new AxeItem(ModItemTier.SILVER,
                    6, -3.1F,
                    new Item.Properties().group(MoreMetals.TAB)));

    public static final RegistryObject<HoeItem> SILVER_HOE = ITEMS.register("silver_hoe",
            () -> new HoeItem(ModItemTier.SILVER,
                    -2, -1.0F, new Item.Properties().group(MoreMetals.TAB)));

    // Armor

    public static final RegistryObject<ArmorItem> SILVER_HELMET = ITEMS.register("silver_helmet",
            () -> new ArmorItem(ModArmorMaterial.SILVER,
                    EquipmentSlotType.HEAD,
                    new Item.Properties().group(MoreMetals.TAB)));

    public static final RegistryObject<ArmorItem> SILVER_CHESTPLATE = ITEMS.register("silver_chestplate",
            () -> new ArmorItem(ModArmorMaterial.SILVER,
                    EquipmentSlotType.CHEST,
                    new Item.Properties().group(MoreMetals.TAB)));

    public static final RegistryObject<ArmorItem> SILVER_LEGGINGS = ITEMS.register("silver_leggins",
            () -> new ArmorItem(ModArmorMaterial.SILVER,
                    EquipmentSlotType.LEGS,
                    new Item.Properties().group(MoreMetals.TAB)));

    public static final RegistryObject<ArmorItem> SILVER_BOOTS = ITEMS.register("silver_boots",
            () -> new ArmorItem(ModArmorMaterial.SILVER,
                    EquipmentSlotType.FEET,
                    new Item.Properties().group(MoreMetals.TAB)));

}


