package ca.zeor.modtest.init;

import ca.zeor.modtest.blocks.BlockSolariumOre;
import ca.zeor.modtest.help.RegisterHelper;
import net.minecraft.block.Block;

public class ModBlocks {
	public static Block SolariumOre = new BlockSolariumOre();
    public static void init()
    {
    	
    	RegisterHelper.registerBlock(SolariumOre);
    }
}
