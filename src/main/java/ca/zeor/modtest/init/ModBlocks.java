package ca.zeor.modtest.init;

/**
 * @Author: Zeoic, Demetry
 * @Date: 051715
 * @brief: This mod registers all the block classes 
 */

import ca.zeor.modtest.blocks.*;
import ca.zeor.modtest.help.RegisterHelper;
import net.minecraft.block.Block;

public class ModBlocks {
	public static Block SolariumOre = new BlockSolariumOre();
	public static Block BariumOre = new BlockBariumOre();
	public static Block LeadOre = new BlockLeadOre();
	public static Block PhosphorusOre = new BlockPhosphorusOre();
	public static Block SilverOre = new BlockSilverOre();
	public static Block TinOre = new BlockTinOre();
	public static Block SiftExtractor = new SiftExtractor();
    public static void init()
    {
    	RegisterHelper.registerBlock(SolariumOre);
    	RegisterHelper.registerBlock(BariumOre);
    	RegisterHelper.registerBlock(LeadOre);
    	RegisterHelper.registerBlock(PhosphorusOre);
    	RegisterHelper.registerBlock(SilverOre);
    	RegisterHelper.registerBlock(TinOre);
    	RegisterHelper.registerBlock(SiftExtractor);
    }
}
