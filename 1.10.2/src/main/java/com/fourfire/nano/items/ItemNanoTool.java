package com.fourfire.nano.items;

import java.util.Set;

import com.fourfire.nano.Reference;
import com.google.common.collect.Sets;

import net.minecraft.block.Block;
import net.minecraft.item.ItemTool;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.util.EnumHelper;

public class ItemNanoTool extends ItemTool{

	private static final Set<Block> EFFECTIVE_BLOCKS = Sets.newHashSet(new Block[] {});
	
	public ItemNanoTool(String unlocalizedName) {
		super(EnumHelper.addToolMaterial(Reference.MODID + ":NanoTool", 0, 256, 0, 1, 0), EFFECTIVE_BLOCKS);
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(Reference.MODID, unlocalizedName));
		
	}

	
}
