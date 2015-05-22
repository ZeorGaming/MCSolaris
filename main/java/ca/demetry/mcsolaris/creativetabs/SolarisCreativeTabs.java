package ca.demetry.mcsolaris.creativetabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import ca.zeor.mcsolaris.init.ModItems;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class SolarisCreativeTabs {
	public static CreativeTabs solarisTab = new CreativeTabs("tabMcSolaris"){
		@Override
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem() {
			return ModItems.SolariumIngot;
		}
	};
}
