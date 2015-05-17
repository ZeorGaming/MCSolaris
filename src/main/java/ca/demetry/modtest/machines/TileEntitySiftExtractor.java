package ca.demetry.modtest.machines;

/**
 * @author Demetry
 * @date 051715
 */

import net.minecraft.tileentity.TileEntity;

public class TileEntitySiftExtractor extends TileEntity{
	public static final String publicName = "tileEntitySiftExtractor";
	private String name = "tileEntitySiftExtractor";
	
	public String getName(){
		return name;
	}
	
	@Override
	public void updateEntity(){
		//TODO: Unused Method Stub PLS FILL ME !!!!
		this.worldObj.setWorldTime(1000); // This is just for testing!!
	}
	
	
}
