package com.fourfire.nano.init;

import com.fourfire.nano.Reference;
import com.fourfire.nano.blocks.BlockNanoGel;
import com.fourfire.nano.util.Utils;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class NanoBlocks {

	public static Block NanobotGel;
	
	public static void init(){
			NanobotGel = new BlockNanoGel("NanobotGel", "NanobotGel");
	}
		
	public static void register(){
	registerBlock(NanobotGel);
	}
		
	public static void registerRenders(){
	registerRender(NanobotGel);
	}
	
	public static void registerBlock(Block block){
	GameRegistry.register(block);
	GameRegistry.register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
	Utils.getLogger().info("Registered block " + block.getUnlocalizedName().substring(5));
	}
	

	public static void registerRender(Block block){
	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, 
	new ModelResourceLocation(new ResourceLocation(Reference.MODID, block.getUnlocalizedName().substring(5)), "inventory"));
	Utils.getLogger().info("Registered render for " + block.getUnlocalizedName().substring(5));
	}
	}
