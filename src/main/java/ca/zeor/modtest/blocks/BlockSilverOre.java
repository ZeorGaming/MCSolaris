package ca.zeor.modtest.blocks;

import ca.zeor.modtest.help.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockSilverOre extends Block
{
	public BlockSilverOre()
	{
		super(Material.iron);
		setCreativeTab(CreativeTabs.tabMisc);
		setBlockName("SilverOre");
		setBlockTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
	}
}
