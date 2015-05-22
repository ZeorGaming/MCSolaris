package ca.zeor.mcsolaris.items;

import ca.demetry.mcsolaris.creativetabs.SolarisCreativeTabs;
import ca.zeor.mcsolaris.help.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

public class ItemSolariumNugget extends Item
{
	public ItemSolariumNugget()
	{
		super();
		setCreativeTab(SolarisCreativeTabs.solarisTab);
	}
	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IIconRegister par1IconRegister)
	{
		itemIcon = par1IconRegister.registerIcon(Reference.MODID + ":" + getUnlocalizedName().substring(5));
	}
}