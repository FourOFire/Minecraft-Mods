package com.fourfire.nano.init;

import com.fourfire.nano.Reference;
import com.fourfire.nano.items.ItemNanoClump;
import com.fourfire.nano.util.Utils;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class NanoItems {
	
	public static Item NanobotClump;
	public static Item NanoRegen;
	
	public static void init(){
		NanobotClump = new ItemNanoClump("NanobotClump", "NanobotClump");
	}
	
	public static void register(){
		registerItem(NanobotClump);
		registerItem(NanoRegen);
	}
	
	public static void registerRenders(){
		registerRender(NanobotClump);
		registerRender(NanoRegen);
	}
	public static void registerItem(Item item){
		GameRegistry.register(item);
		Utils.getLogger().info("Registered item " + item.getUnlocalizedName().substring(5));
	}
	
	
	public static void registerRender(Item item){
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(new ResourceLocation(Reference.MODID, item.getUnlocalizedName().substring(5)), "inventory"));
		Utils.getLogger().info("Registered render for " + item.getUnlocalizedName().substring(5));
	}
}
