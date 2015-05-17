package ca.zeor.modtest;

import ca.demetry.modtest.GUI.GUIs;
import ca.demetry.modtest.GUI.GuiSiftExtractor;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler {

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {

		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if (ID == GUIs.SIFT_EXTRACTOR.ordinal()) return new GuiSiftExtractor(player, world, x, y, z);
		else return null;
	}

}
