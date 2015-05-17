package ca.zeor.modtest.blocks;

import ca.zeor.modtest.help.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockBariumOre extends Block
{
	public BlockBariumOre()
	{
		super(Material.iron);
		setCreativeTab(CreativeTabs.tabMisc);
		setBlockName("BariumOre");
		setBlockTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
	}
}
