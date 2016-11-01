package com.fourfire.nano.proxy;

import com.fourfire.nano.init.NanoBlocks;
import com.fourfire.nano.init.NanoItems;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy
{

	@Override
	public void registerRenders() {
		NanoItems.registerRenders();
		NanoBlocks.registerRenders();
	}
	
    @Override
    public void preInit(FMLPreInitializationEvent e)
    {
    	super.preInit(e);
    }
    

    @Override
    public void init(FMLInitializationEvent e)
    {
    	super.init(e);
    	

    }

    @Override
    public void postInit(FMLPostInitializationEvent e)
    {
    	super.postInit(e);
    }
	
}