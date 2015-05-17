package ca.demetry.modtest.GUI;

import java.io.FileNotFoundException;

import ca.zeor.modtest.help.Reference;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class GuiSiftExtractor extends GuiScreen{
	private int x, y, z;
	private EntityPlayer player; 
	private World world; 
	private int xSize, ySize; 
	
	private ResourceLocation background;
	
	public GuiSiftExtractor(EntityPlayer player, World world, int x, int y, int z){
		this.setX(x);
		this.setY(y);
		this.setZ(z);
		this.setPlayer(player);
		this.setWorld(world);
		this.setxSize(176);
		this.setySize(214);
		
		try{
			background = new ResourceLocation(Reference.MODID.toLowerCase() + ":" + "textures/guis/sift_extractor.png");
		}catch(Exception e){
			e.printStackTrace();
			System.exit(e.hashCode());
		}
	}
	
	@Override
	public void drawScreen(int mouseX, int mouseY, float renderPartialTicks){
		this.mc.getTextureManager().bindTexture(background);
		
		int x = (this.width - xSize) / 2;
		int y = (this.height - ySize) / 2;
		drawTexturedModalRect(x, y, 0, 0, xSize, ySize);
	}

	@Override
	public boolean doesGuiPauseGame(){
		return false;
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	public EntityPlayer getPlayer() {
		return player;
	}

	public void setPlayer(EntityPlayer player) {
		this.player = player;
	}

	public World getWorld() {
		return world;
	}

	public void setWorld(World world) {
		this.world = world;
	}

	public int getxSize() {
		return xSize;
	}

	public void setxSize(int xSize) {
		this.xSize = xSize;
	}

	public int getySize() {
		return ySize;
	}

	public void setySize(int ySize) {
		this.ySize = ySize;
	}
}
