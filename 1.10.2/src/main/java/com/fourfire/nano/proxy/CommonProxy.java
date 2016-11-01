package com.fourfire.nano.proxy;

import com.fourfire.nano.init.NanoItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


public class CommonProxy 
{
	
	public void registerRenders() {
		
	}
	
    public void preInit(FMLPreInitializationEvent e)
    {

    }
    

    
    public void init(FMLInitializationEvent e)
    {
//    	Main.Nanobot_Gel = new NanoBlock(Material.ROCK, "nanomachines", 2.0F, 30.0F, NanoBlock.HarvestToolEnum.SHOVEL, NanoBlock.HarvestLevelEnum.DIAMOND, CreativeTabs.MISC, 1, 8, 64, 1, 54, 255, new Block[]{Blocks.GRASS, Blocks.SAND, Blocks.CLAY}, new Block[]{Blocks.COAL_ORE}, 16, true, false, false);
    	
//    	Main.Nanobot_Gel.setDrops(Main.Nanobot_Clump);
    	
//    	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.Nanobot_Gel, 1), new Object[]{Main.Nanobot_Clump});
    }

    
    public void postInit(FMLPostInitializationEvent e)
    {
    	
    }

}
