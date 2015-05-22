package ca.demetry.mcsolaris.machines.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import ca.demetry.mcsolaris.creativetabs.SolarisCreativeTabs;
import ca.zeor.mcsolaris.help.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockBuildingBlock extends Block{
	private int i;
	//not random
	public BlockBuildingBlock(int texId, Material mat, String name, float Resistance, float Hardness, String harvestTool, int harvestTier){
		super(mat);
		init(texId);
	}
	
	public BlockBuildingBlock(int i){
		super(Material.rock);
		init(i);
	}
	
	public void init(int i){
		this.setCreativeTab(SolarisCreativeTabs.solarisTab);
		this.setBlockName("RandomBuildBlock_" + i );
		this.i = i;
	}
	
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister){
		this.blockIcon = iconRegister.registerIcon(Reference.MODID + ":" + i);
	}
	
	public IIcon getIcon(int side, int meta){
		return this.blockIcon;
	}
	
	public boolean blockActivated(World world, int x, int y, int z, EntityPlayer player, int par6, float par7, float par8, float par9){
		return true;
	}
}
