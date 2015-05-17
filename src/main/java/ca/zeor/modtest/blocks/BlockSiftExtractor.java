package ca.zeor.modtest.blocks;

/**
 * @author Demetry
 * @brief This is the Block Class for the sift extractor
 */

import java.util.Random;

import ca.demetry.modtest.GUI.GUIs;
import ca.demetry.modtest.machines.TileEntitySiftExtractor;
import ca.zeor.modtest.ModTest;
import ca.zeor.modtest.help.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

@SuppressWarnings("all")
public class BlockSiftExtractor extends Block implements ITileEntityProvider{

	public BlockSiftExtractor() {
		super(Material.iron);
		setCreativeTab(CreativeTabs.tabMisc);
		setBlockName("SiftExtractor");
		setBlockTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
	}

	@Override
	public TileEntity createNewTileEntity(World worldm, int meta) {
		return new TileEntitySiftExtractor();
	}
	
	@Override
	public boolean hasTileEntity(int m){
		return true;
	}
	
	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int meta, float hitX, float hitY, float hitZ){
		if(world.isRemote){
			if(world.getTileEntity(x, y, z) != null){
				player.openGui(ModTest.instance, GUIs.SIFT_EXTRACTOR.ordinal(), world, x, y, z);
				return true;
			}
		}
		return true;
	}
}
