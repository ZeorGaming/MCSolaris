package ca.zeor.modtest;

/**
 * @author Demetry
 * @brief This is the main mod class!
 */

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import ca.demetry.modtest.proxy.CommonProxy;
import ca.zeor.modtest.help.Reference;
import ca.zeor.modtest.init.ModBlocks;
import ca.zeor.modtest.init.ModItems;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)

public class ModTest 
{
	@Mod.Instance()
	public static ModTest instance; 
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy; 
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		ModItems.init();
		ModBlocks.init();
	}

	@Mod.EventHandler
	public void Init(FMLInitializationEvent event)
	{
		proxy.registerTileEntities();
		NetworkRegistry.INSTANCE.registerGuiHandler(instance, new GuiHandler());
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
}
