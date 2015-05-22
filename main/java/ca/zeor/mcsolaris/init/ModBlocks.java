package ca.zeor.mcsolaris.init;

/**
 * @Author: Zeoic, Demetry
 * @Date: 051715
 * @brief: This mod registers all the block classes 
 */


import net.minecraft.block.Block;
import net.minecraftforge.oredict.OreDictionary;
import ca.zeor.mcsolaris.blocks.*;
import ca.demetry.mcsolaris.machines.blocks.*;
import ca.demetry.mcsolaris.random.RandomTextureGenerator;
import ca.zeor.mcsolaris.help.RegisterHelper;

public class ModBlocks {
	
	public static Block[] blocks = {
		new BlockSolariumOre(),
		new BlockLeadOre(),
		new BlockPhosphorusOre(),
		new BlockSilverOre(),
		new BlockTinOre(),
		new BlockBariumOre(),
		new BlockSiftExtractor(),
		new BlockSolarPanel()
	};
	
	public static Block SolariumOre = blocks[0];
	public static Block LeadOre = blocks[1];
	public static Block PhosphorusOre = blocks[2];
	public static Block SilverOre = blocks[3];
	public static Block TinOre = blocks[4];
	public static Block BariumOre = blocks[5];
	public static Block SiftExtractor = blocks[6];
	public static Block SolarPanel = blocks[7];
	
	public static Block[] buildingBlocks = new Block[150];
	
    public static void init()
    {
    	for(int i = 0; i < buildingBlocks.length; i++){
    		new RandomTextureGenerator(i);
    		RegisterHelper.registerBlock(new BlockBuildingBlock(i));
    	}
    	
    	for(Block _block : blocks){
    		RegisterHelper.registerBlock(_block);
    		
    		if(_block.getUnlocalizedName().substring(_block.getUnlocalizedName().length() - 3, _block.getUnlocalizedName().length()).equals("Ore")){
    			OreDictionary.registerOre(_block.getUnlocalizedName(), _block);
    		}
    	}
    }
}
