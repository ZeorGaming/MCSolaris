package ca.zeor.modtest;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import ca.zeor.modtest.help.Reference;
import ca.zeor.modtest.init.ModBlocks;
import ca.zeor.modtest.init.ModItems;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)

public class ModTest 
{
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		ModItems.init();
		ModBlocks.init();
	}
	
	@Mod.EventHandler
	public void Init(FMLInitializationEvent event)
	{

	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
}
