package ca.zeor.modtest.init;

import ca.zeor.modtest.help.RegisterHelper;
import ca.zeor.modtest.items.TestModItem;
import net.minecraft.item.Item;

public class ModItems 
{
	public static Item testIngot = new TestModItem().setUnlocalizedName("testIngot");
	
    public static void init()
    {
    	RegisterHelper.registerItem(testIngot);
    	
    	
    	
    	
    }
}
