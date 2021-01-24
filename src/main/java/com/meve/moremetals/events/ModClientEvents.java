package com.meve.moremetals.events;

import com.meve.moremetals.MoreMetals;
import com.meve.moremetals.init.ModBlocks;
import com.meve.moremetals.init.ModItems;
import com.meve.moremetals.items.DaggerItem;
import com.meve.moremetals.util.enums.ModItemTier;
import net.minecraft.client.gui.screen.inventory.CraftingScreen;
import net.minecraft.entity.CreatureAttribute;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.monster.ZombieEntity;
import net.minecraft.entity.passive.SheepEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.item.ToolItem;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.text.NBTTextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.GuiOpenEvent;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = MoreMetals.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class ModClientEvents {
    @SubscribeEvent(priority = EventPriority.HIGHEST)
    public static void onAttackMonsterWithSilver(AttackEntityEvent event) {
        Item heldItem = event.getEntityLiving().getHeldItemMainhand().getItem();
        boolean isSilverWeapon =
                (
                        heldItem == ModItems.SILVER_AXE.get() ||
                        heldItem == ModItems.SILVER_DAGGER.get() ||
                        heldItem == ModItems.SILVER_SWORD.get()
                );
        if (isSilverWeapon) {
            if (event.getTarget().isAlive()) {
                LivingEntity target = (LivingEntity) event.getTarget();
                if(target.isEntityUndead()) {
                    float bonusDamage = 1.25F;
                        /*if(!event.getPlayer().getEntityWorld().isRemote) {
                                PlayerEntity player = event.getPlayer();
                                String msg = TextFormatting.RED + "Target HP: " + target.getHealth() + ", additional damage: " + bonusDamage;
                                player.sendMessage(new StringTextComponent(msg), player.getUniqueID());
                            }*/
                    target.setHealth(target.getHealth() - bonusDamage);
                }
            }
        }
    }
}


