package ca.zeor.mcsolaris.blocks;

import ca.demetry.mcsolaris.creativetabs.SolarisCreativeTabs;
import ca.zeor.mcsolaris.help.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material; 

public class BlockSolariumOre extends Block
{
	public BlockSolariumOre()
	{
		super(Material.iron);
		setCreativeTab(SolarisCreativeTabs.solarisTab);
		setBlockName("SolariumOre");
		setBlockTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setStepSound(soundTypeStone);
		setHardness(3F);
		setResistance(10.0F);
		setHarvestLevel("pickaxe", 2);
	}
}
