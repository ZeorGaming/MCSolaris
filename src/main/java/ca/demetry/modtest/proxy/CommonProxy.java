package ca.demetry.modtest.proxy;

/**
 * @author Demetry
 * TODO: Create this class
 */
import ca.demetry.modtest.machines.TileEntitySiftExtractor;
import cpw.mods.fml.common.registry.GameRegistry;

public class CommonProxy {
	public void registerTileEntities(){
		GameRegistry.registerTileEntity(TileEntitySiftExtractor.class, TileEntitySiftExtractor.publicName);
	}
}
