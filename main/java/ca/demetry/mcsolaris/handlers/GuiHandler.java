package ca.demetry.mcsolaris.handlers;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import ca.demetry.mcsolaris.machines.containers.ContainerSiftExtractor;
import ca.demetry.mcsolaris.machines.guis.GuiSiftExtractor;
import ca.demetry.mcsolaris.machines.tileentities.TileEntitySiftExtractor;
import cpw.mods.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler {

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		TileEntitySiftExtractor tileEntity = (TileEntitySiftExtractor) world.getTileEntity(x, y, z);
		return new ContainerSiftExtractor(player.inventory, tileEntity);
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world,	int x, int y, int z) {
		TileEntitySiftExtractor tileEntity = (TileEntitySiftExtractor) world.getTileEntity(x, y, z);
		return new GuiSiftExtractor(player.inventory, tileEntity);
	}
	
}
