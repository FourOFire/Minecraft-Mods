package com.fourfire.nano.blocks;

import com.fourfire.nano.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.ResourceLocation;

public class BlockNanoGel extends Block {

	public BlockNanoGel(String unlocalizedName, String registryName) {
		super(Material.CLAY);
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(Reference.MODID, registryName));
		}
}
