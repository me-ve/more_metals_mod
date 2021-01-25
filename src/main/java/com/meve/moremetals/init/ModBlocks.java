package com.meve.moremetals.init;

import com.meve.moremetals.MoreMetals;
import com.meve.moremetals.blocks.SilverBlock;
import com.meve.moremetals.blocks.SilverOre;
import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MoreMetals.MOD_ID);

    public static final RegistryObject<Block> SILVER_BLOCK =
            BLOCKS.register("silver_block", SilverBlock::new);
    public static final RegistryObject<Block> SILVER_ORE =
            BLOCKS.register("silver_ore", SilverOre::new);
}
