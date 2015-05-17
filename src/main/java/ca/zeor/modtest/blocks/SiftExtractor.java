package ca.zeor.modtest.blocks;

import ca.zeor.modtest.help.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class SiftExtractor extends Block{

	public SiftExtractor() {
		super(Material.iron);
		setCreativeTab(CreativeTabs.tabMisc);
		setBlockName("SiftExtractor");
		setBlockTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		
		
	}

}
