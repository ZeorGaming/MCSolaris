package ca.demetry.mcsolaris.proxy;

import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import ca.demetry.mcsolaris.handlers.GuiHandler;
import ca.demetry.mcsolaris.machines.tileentities.TileEntitySiftExtractor;
import ca.zeor.mcsolaris.MCSolaris;

/**
 * @author Demetry
 * TODO: Create this class
 */

public class CommonProxy {
	public void registerNetworkStuff(){
		NetworkRegistry.INSTANCE.registerGuiHandler(MCSolaris.instance, new GuiHandler());
	}
	public void registerTileEntities(){
		GameRegistry.registerTileEntity(TileEntitySiftExtractor.class, TileEntitySiftExtractor.publicName);
	}
}
