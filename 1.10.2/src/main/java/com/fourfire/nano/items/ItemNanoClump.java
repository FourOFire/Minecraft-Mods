package com.fourfire.nano.items;

import com.fourfire.nano.Reference;

import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

public class ItemNanoClump extends Item {
	public ItemNanoClump(String unlocalizedName, String registryName) {
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(Reference.MODID));
	}
}
