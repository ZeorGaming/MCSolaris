package ca.zeor.mcsolaris.init;

/**
 * @Author: Zeoic, Demetry
 * @Date: 051715
 * @brief: This mod registers all the item classes.
 */

import net.minecraft.item.Item;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.oredict.OreDictionary;
import ca.zeor.mcsolaris.help.RegisterHelper;
import ca.zeor.mcsolaris.items.ItemBariumIngot;
import ca.zeor.mcsolaris.items.ItemBariumNugget;
import ca.zeor.mcsolaris.items.ItemCanisterEmpty;
import ca.zeor.mcsolaris.items.ItemJDBeef;
import ca.zeor.mcsolaris.items.ItemLeadIngot;
import ca.zeor.mcsolaris.items.ItemLeadNugget;
import ca.zeor.mcsolaris.items.ItemNitrogenCanister;
import ca.zeor.mcsolaris.items.ItemPhosphor;
import ca.zeor.mcsolaris.items.ItemSilicon;
import ca.zeor.mcsolaris.items.ItemSilverIngot;
import ca.zeor.mcsolaris.items.ItemSilverNugget;
import ca.zeor.mcsolaris.items.ItemSolariumIngot;
import ca.zeor.mcsolaris.items.ItemSolariumNugget;
import ca.zeor.mcsolaris.items.ItemTinIngot;
import ca.zeor.mcsolaris.items.ItemTinNugget;
import cpw.mods.fml.common.registry.GameRegistry;
@SuppressWarnings("all")
public class ModItems 
{
	public static Item SolariumIngot = new ItemSolariumIngot().setUnlocalizedName("SolariumIngot");
	public static Item TinIngot = new ItemTinIngot().setUnlocalizedName("TinIngot");
	public static Item LeadIngot = new ItemLeadIngot().setUnlocalizedName("LeadIngot");
	public static Item BariumIngot = new ItemBariumIngot().setUnlocalizedName("BariumIngot");
	public static Item Phosphor = new ItemPhosphor().setUnlocalizedName("Phosphor");
	public static Item SolariumNugget = new ItemSolariumNugget().setUnlocalizedName("SolariumNugget");
	public static Item TinNugget = new ItemTinNugget().setUnlocalizedName("TinNugget");
	public static Item LeadNugget = new ItemLeadNugget().setUnlocalizedName("LeadNugget");
	public static Item BariumNugget = new ItemBariumNugget().setUnlocalizedName("BariumNugget");
	public static Item SolarCell = new ItemPhosphor().setUnlocalizedName("SolarCell");
	public static Item SilverIngot = new ItemSilverIngot().setUnlocalizedName("SilverIngot");
	public static Item SilverNugget = new ItemSilverNugget().setUnlocalizedName("SilverNugget");
	public static Item CanisterEmpty = new ItemCanisterEmpty().setUnlocalizedName("CanisterEmpty");
	public static Item NitrogenCanister = new ItemNitrogenCanister().setUnlocalizedName("NitrogenCanister");
	public static Item Silicon = new ItemSilicon().setUnlocalizedName("Silicon");
	public static Item JDBeef = new ItemJDBeef(null, 0, 0, false, null).setUnlocalizedName("JDBeef");
	
    public static void init()
    {
    	RegisterHelper.registerItem(SolariumIngot);
    	RegisterHelper.registerItem(TinIngot);
    	RegisterHelper.registerItem(LeadIngot);
    	RegisterHelper.registerItem(BariumIngot);
    	RegisterHelper.registerItem(SilverIngot);
    	RegisterHelper.registerItem(SolariumNugget);
    	RegisterHelper.registerItem(TinNugget);
    	RegisterHelper.registerItem(LeadNugget);
    	RegisterHelper.registerItem(BariumNugget);
    	RegisterHelper.registerItem(SilverNugget);
    	RegisterHelper.registerItem(Phosphor);
    	RegisterHelper.registerItem(SolarCell);
    	RegisterHelper.registerItem(CanisterEmpty);
    	RegisterHelper.registerItem(NitrogenCanister);
    	RegisterHelper.registerItem(Silicon);
    	GameRegistry.registerItem(JDBeef = new ItemJDBeef("JDBeef", 2, 9001f, false,
    		    new PotionEffect(Potion.regeneration.id, 99999999, 4))
    		    .setAlwaysEdible(), "JDBeef");
    }
}
