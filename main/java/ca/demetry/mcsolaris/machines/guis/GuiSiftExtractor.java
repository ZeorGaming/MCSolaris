package ca.demetry.mcsolaris.machines.guis;

/**
 * @author Demetry
 */

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import ca.demetry.mcsolaris.machines.containers.ContainerSiftExtractor;
import ca.demetry.mcsolaris.machines.tileentities.TileEntitySiftExtractor;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class GuiSiftExtractor extends GuiContainer
{
	private static ResourceLocation guiTextures;
	private TileEntitySiftExtractor tileSiftExtractor;

	public GuiSiftExtractor(InventoryPlayer invPlayer, TileEntitySiftExtractor tile) {
		super(new ContainerSiftExtractor(invPlayer, tile));
		this.tileSiftExtractor = tile;
		
		try{ 
			guiTextures = new ResourceLocation("textures/gui/container/furnace.png");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
		
	protected void drawGuiContainerForegroundLayer(int par1, int par2){
		String string = this.tileSiftExtractor.hasCustomInventoryName() ? this.tileSiftExtractor.getInventoryName() : I18n.format(this.tileSiftExtractor.getInventoryName(), new Object[0]);
		this.fontRendererObj.drawString(string, this.xSize / 2 - this.fontRendererObj.getStringWidth(string), 6, 4210752);
		this.fontRendererObj.drawString(I18n.format("container.inventory", new Object[0]), 8, this.ySize - 94, 4210752);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float var1, int var2, int var3) {
		 GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
	        this.mc.getTextureManager().bindTexture(guiTextures);
	        int k = (this.width - this.xSize) / 2;
	        int l = (this.height - this.ySize) / 2;
	        this.drawTexturedModalRect(k, l, 0, 0, this.xSize, this.ySize);
	        int i1;

	        if (this.tileSiftExtractor.isBurning())
	        {
	            i1 = this.tileSiftExtractor.getBurnTimeRemainingScaled(12);
	            this.drawTexturedModalRect(k + 56, l + 36 + 12 - i1, 176, 12 - i1, 14, i1 + 2);
	        }

	        i1 = this.tileSiftExtractor.getCookProgressScaled(24);
	        this.drawTexturedModalRect(k + 79, l + 34, 176, 14, i1 + 1, 16);
	}

}