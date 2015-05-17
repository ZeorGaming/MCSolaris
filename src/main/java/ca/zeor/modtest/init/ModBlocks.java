package ca.zeor.modtest.init;

import ca.zeor.modtest.blocks.BlockTestOre;
import ca.zeor.modtest.help.RegisterHelper;
import net.minecraft.block.Block;

public class ModBlocks {
	public static Block testOre = new BlockTestOre();
    public static void init()
    {
    	
    	RegisterHelper.registerBlock(testOre);
    }
}
