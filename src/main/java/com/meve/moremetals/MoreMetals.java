package com.meve.moremetals;

import com.meve.moremetals.init.ModBlocks;
import com.meve.moremetals.init.ModItems;
import com.meve.moremetals.world.gen.ModOreGen;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.DeferredWorkQueue;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("moremetals")
public class MoreMetals {

    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "moremetals";

    public MoreMetals() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        ModBlocks.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ModItems.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
        ModOreGen.registerOre();
        DeferredWorkQueue.runLater(() -> {
        });
    }

    private void doClientStuff(final FMLClientSetupEvent event) { }

    // Custom ItemGroup TAB
    public static final ItemGroup TAB = new ItemGroup("moreMetalsTab") {

        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.SILVER_DAGGER.get());
        }


    };


}
