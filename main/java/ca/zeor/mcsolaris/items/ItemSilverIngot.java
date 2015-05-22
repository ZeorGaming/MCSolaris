package ca.zeor.mcsolaris.items;

import ca.demetry.mcsolaris.creativetabs.SolarisCreativeTabs;
import ca.zeor.mcsolaris.help.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

public class ItemSilverIngot extends Item{
	public ItemSilverIngot(){
		super();
		setCreativeTab(SolarisCreativeTabs.solarisTab);
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IIconRegister icon){
		itemIcon = icon.registerIcon(Reference.MODID + ":" + getUnlocalizedName().substring(5));
	}
}
