package com.fourfire.nano.items;

import com.fourfire.nano.Reference;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class NanoRegen extends Item{

public NanoRegen(String unlocalizedName, String registryName) {
	this.setUnlocalizedName(unlocalizedName);
	this.setRegistryName(new ResourceLocation(Reference.MODID));	
	}

    @Override
    	public ActionResult<ItemStack> onItemRightClick(ItemStack stack, World world, EntityPlayer player,
    			EnumHand hand) {
    		if(player.getHealth() < player.getMaxHealth()){
    			player.heal(2);
    			player.getHeldItem(hand).stackSize--;
    		}
    		return super.onItemRightClick(stack, world, player, hand);
    	}
}
