package ca.zeor.mcsolaris;

/**
 * @author Demetry
 * @brief This is the main mod class!
 */

import ca.demetry.mcsolaris.proxy.CommonProxy;
import ca.demetry.mcsolaris.world.World;
import ca.zeor.mcsolaris.crafting.Recipes;
import ca.zeor.mcsolaris.help.Reference;
import ca.zeor.mcsolaris.init.ModBlocks;
import ca.zeor.mcsolaris.init.ModItems;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;


@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)

public class MCSolaris 
{
	@Instance(Reference.MODID)
	public static MCSolaris instance; 
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy; 
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		ModItems.init();
		ModBlocks.init();
		Recipes.init();
		World.init();
		
		proxy.registerTileEntities();
	}

	@Mod.EventHandler
	public void Init(FMLInitializationEvent event)
	{
		proxy.registerNetworkStuff();
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
}
