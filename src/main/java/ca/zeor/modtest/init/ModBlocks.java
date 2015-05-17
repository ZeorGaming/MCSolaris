package ca.zeor.modtest.init;

/**
 * @Author: Zeoic, Demetry
 * @Date: 051715
 * @brief: This mod registers all the block classes 
 */

import ca.zeor.modtest.blocks.*;
import ca.zeor.modtest.help.RegisterHelper;

public class ModBlocks {
	
    public static void init()
    {
    	RegisterHelper.registerBlock(new BlockSolariumOre());
    	RegisterHelper.registerBlock(new BlockBariumOre());
    	RegisterHelper.registerBlock(new BlockLeadOre());
    	RegisterHelper.registerBlock(new BlockPhosphorusOre());
    	RegisterHelper.registerBlock(new BlockSilverOre());
    	RegisterHelper.registerBlock(new BlockTinOre());
    	RegisterHelper.registerBlock(new BlockSiftExtractor());
    }
}
