package ca.zeor.modtest.init;

import ca.zeor.modtest.help.RegisterHelper;
import ca.zeor.modtest.items.ItemSolariumIngot;
import net.minecraft.item.Item;

public class ModItems 
{
	public static Item SolariumIngot = new ItemSolariumIngot().setUnlocalizedName("SolariumIngot");
	
    public static void init()
    {
    	RegisterHelper.registerItem(SolariumIngot);
    	
    	
    	
    	
    }
}
