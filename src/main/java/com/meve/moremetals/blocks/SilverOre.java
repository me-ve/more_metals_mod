package com.meve.moremetals.blocks;

import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class SilverOre extends OreBlock{
    public SilverOre() {
        super(AbstractBlock.Properties.copy(Blocks.IRON_ORE));
    }
}
