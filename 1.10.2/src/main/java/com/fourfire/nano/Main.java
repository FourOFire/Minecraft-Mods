package com.fourfire.nano;

import com.fourfire.nano.init.NanoBlocks;
import com.fourfire.nano.init.NanoItems;
import com.fourfire.nano.proxy.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.MODNAME, version = Reference.VERSION, dependencies = "required-after:FML")
public class Main 
{

	
//	public static NanoBlock Nanobot_Gel;
//	public static CustomItem Nanobot_Clump;
	
	@Mod.Instance(Reference.MODID)
	public static Main instance;
	
	@SidedProxy(serverSide = Reference.SERVER_PROXY_CLASS, clientSide = Reference.CLIENT_PROXY_CLASS)
	public static CommonProxy proxy;
	
    @EventHandler
    public void preInit(FMLPreInitializationEvent e)
    {
    	NanoItems.init();
    	NanoItems.register();
    	
    	NanoBlocks.init();
    	NanoBlocks.register();
//    	proxy.preInit(e);
    	proxy.registerRenders();
    }
    
    @EventHandler
    public void init(FMLInitializationEvent e)
    {

//    	proxy.init(e);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent e)
    {

//    	proxy.postInit(e);
    }
	
}
