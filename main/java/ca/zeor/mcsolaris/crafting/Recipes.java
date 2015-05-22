package ca.zeor.mcsolaris.crafting;

import net.minecraft.item.ItemStack;
import ca.zeor.mcsolaris.init.*;
import cpw.mods.fml.common.registry.GameRegistry;

public class Recipes {
	
	public static void init()
	{
		GameRegistry.addSmelting(ModBlocks.SolariumOre, new ItemStack(ModItems.SolariumIngot), 0.8F);
		GameRegistry.addSmelting(ModBlocks.BariumOre, new ItemStack(ModItems.BariumIngot), 0.8F);
		GameRegistry.addSmelting(ModBlocks.LeadOre, new ItemStack(ModItems.LeadIngot), 0.8F);
		GameRegistry.addSmelting(ModBlocks.SilverOre, new ItemStack(ModItems.SilverIngot), 0.8F);
		GameRegistry.addSmelting(ModBlocks.TinOre, new ItemStack(ModItems.TinIngot), 0.8F);
		
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.SolariumNugget, 9), new Object[] {new ItemStack(ModItems.SolariumIngot)});
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.BariumNugget, 9), new Object[] {new ItemStack(ModItems.BariumIngot)});
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.LeadNugget, 9), new Object[] {new ItemStack(ModItems.LeadIngot)});
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.SilverNugget, 9), new Object[] {new ItemStack(ModItems.SilverIngot)});
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.TinNugget, 9), new Object[] {new ItemStack(ModItems.TinIngot)});
		
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.SolariumIngot), new Object[] {new ItemStack(ModItems.SolariumNugget), ModItems.SolariumNugget, ModItems.SolariumNugget, ModItems.SolariumNugget, ModItems.SolariumNugget, ModItems.SolariumNugget, ModItems.SolariumNugget, ModItems.SolariumNugget, ModItems.SolariumNugget});
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.BariumIngot), new Object[] {new ItemStack(ModItems.BariumNugget), ModItems.BariumNugget, ModItems.BariumNugget, ModItems.BariumNugget, ModItems.BariumNugget, ModItems.BariumNugget, ModItems.BariumNugget, ModItems.BariumNugget, ModItems.BariumNugget});
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.LeadIngot), new Object[] {new ItemStack(ModItems.LeadNugget), ModItems.LeadNugget, ModItems.LeadNugget, ModItems.LeadNugget, ModItems.LeadNugget, ModItems.LeadNugget, ModItems.LeadNugget, ModItems.LeadNugget, ModItems.LeadNugget});
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.SilverIngot), new Object[] {new ItemStack(ModItems.SilverNugget), ModItems.SilverNugget, ModItems.SilverNugget, ModItems.SilverNugget, ModItems.SilverNugget, ModItems.SilverNugget, ModItems.SilverNugget, ModItems.SilverNugget, ModItems.SilverNugget});
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.TinIngot), new Object[] {new ItemStack(ModItems.TinNugget), ModItems.TinNugget, ModItems.TinNugget, ModItems.TinNugget, ModItems.TinNugget, ModItems.TinNugget, ModItems.TinNugget, ModItems.TinNugget, ModItems.TinNugget});
	}
}
