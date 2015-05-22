package ca.demetry.mcsolaris.machines.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ca.demetry.mcsolaris.creativetabs.SolarisCreativeTabs;
import ca.zeor.mcsolaris.help.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon; 

public class BlockSolarPanel extends Block{
	@SideOnly(Side.CLIENT)
	private IIcon top;
	public BlockSolarPanel(Material mat) {
		super(mat);
		initBlock();
	}
	
	public BlockSolarPanel(){
		super(Material.rock);
		initBlock();
	}
	
	private void initBlock(){
		setCreativeTab(SolarisCreativeTabs.solarisTab);
		setBlockName("SolarPanel");
		setBlockTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setStepSound(soundTypeStone);
		setHardness(3f);
		setResistance(10.0f);
		setHarvestLevel("pickaxe", 2);
	}
	
	@Override
	public void registerBlockIcons(IIconRegister iconRegister){
		this.blockIcon = iconRegister.registerIcon(Reference.MODID + ":SolarPanel_0");
		this.top = iconRegister.registerIcon(Reference.MODID + ":SolarPanel_1");
	}
	
	public IIcon getIcon(int side, int meta){
		if(side == 1){
			return this.top;
		}else{
			return this.blockIcon;
		}
	}
}
