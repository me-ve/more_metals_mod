package com.meve.moremetals.blocks;

import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class SilverBlock extends Block {

    public SilverBlock() {
        super(Block.Properties.create(Material.IRON)
                .hardnessAndResistance(3.0f, 6.0f)
                .sound(SoundType.METAL)
                .harvestLevel(2)
                .harvestTool(ToolType.PICKAXE)
                .setRequiresTool());
    }
}