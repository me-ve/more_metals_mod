package com.meve.moremetals.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class SilverBlock extends Block {

    public SilverBlock() {
        super(Block.Properties.copy(Blocks.IRON_BLOCK));
    }
}