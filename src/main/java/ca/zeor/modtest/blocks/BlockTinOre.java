package ca.zeor.modtest.blocks;

import ca.zeor.modtest.help.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockTinOre extends Block
{
	public BlockTinOre()
	{
		super(Material.iron);
		setCreativeTab(CreativeTabs.tabMisc);
		setBlockName("TinOre");
		setBlockTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
	}
}
