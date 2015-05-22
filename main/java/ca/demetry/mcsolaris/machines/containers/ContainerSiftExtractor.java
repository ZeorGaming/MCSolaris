package ca.demetry.mcsolaris.machines.containers;

/**
 * 
 * @author Demetry
 *
 */

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ICrafting;
import net.minecraft.inventory.Slot;
import net.minecraft.inventory.SlotFurnace;
import net.minecraft.item.ItemStack;
import ca.demetry.mcsolaris.machines.recipes.SiftExtractorRecipe;
import ca.demetry.mcsolaris.machines.tileentities.TileEntitySiftExtractor;

public class ContainerSiftExtractor extends Container
{
	private TileEntitySiftExtractor sifter; 
	private int lastSiftTime;
	private int lastBurnTime; 
	private int lastItemBurnTime;
	
	public ContainerSiftExtractor(InventoryPlayer player, TileEntitySiftExtractor siftExtractor){
		this.sifter = siftExtractor;
		
		//add the machines slots
		this.addSlotToContainer(new Slot(sifter, 0, 56, 17));
		this.addSlotToContainer(new Slot(sifter, 0, 56, 53));
		this.addSlotToContainer(new SlotFurnace(player.player, sifter, 2, 116, 35));
		
		//get the players inventory and display it
		//TODO: CREATE A CLASS THAT DOES THIS!
		for(int i = 0; i < 3; ++i){
			for(int j = 0; j < 9; ++i){
				this.addSlotToContainer(new Slot(player, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
			}
		}
		
		for(int i = 0; i < 9; ++i){
			this.addSlotToContainer(new Slot(player, i, 8 + i * 18, 142));
		}
	}
	
	public void addCraftingToCrafters(ICrafting craft){
		super.addCraftingToCrafters(craft);
		craft.sendProgressBarUpdate(this, 0, this.sifter.currentBurnTime);
		craft.sendProgressBarUpdate(this, 1, this.sifter.furnaceBurnTime);
		craft.sendProgressBarUpdate(this, 2, this.sifter.furnaceCookTime);
	}
	
	public void detectAndSendChanges(){
		for(int i = 0; i < this.crafters.size(); ++i){
			ICrafting craft = (ICrafting) this.crafters.get(i);
		
			if(this.lastSiftTime != this.sifter.furnaceBurnTime){
				craft.sendProgressBarUpdate(this, 0, this.sifter.furnaceBurnTime);
			}
			
			if(this.lastBurnTime != this.sifter.currentBurnTime){
				craft.sendProgressBarUpdate(this, 0, this.sifter.currentBurnTime);
			}
			
			if(this.lastItemBurnTime != this.sifter.furnaceCookTime){
				craft.sendProgressBarUpdate(this, 0, this.sifter.furnaceCookTime);
			}
		}
		this.lastSiftTime = this.sifter.furnaceCookTime; 
		this.lastBurnTime = this.sifter.furnaceBurnTime; 
		this.lastItemBurnTime = this.sifter.currentBurnTime;
	}
	
	@Override
	public void updateProgressBar(int i, int j){
		switch(i){
			case 0 : this.sifter.furnaceBurnTime = j;
				break;
			case 1 : this.sifter.currentBurnTime = j;
				break;
			case 2 : this.sifter.furnaceCookTime = j;
				break;
		}
	}
	
	@Override
	public boolean canInteractWith(EntityPlayer player) {
		return this.sifter.isUseableByPlayer(player);
	}
	
	public ItemStack transferStackInSlot(EntityPlayer player, int i){
		ItemStack itemStack = null;
		
		Slot slot = (Slot) this.inventorySlots.get(i);
		
		if(slot != null && slot.getHasStack()){
			ItemStack _itemStack = slot.getStack();
			itemStack = _itemStack.copy();
			
			if(i == 2){
				if(!this.mergeItemStack(_itemStack, 3, 39, true)){
					return null;
				}
				slot.onSlotChange(_itemStack, itemStack);
			}else if(i != 1 && i != 0){
				if(SiftExtractorRecipe.smelting().getSmeltingResult(_itemStack) != null){
					if(!this.mergeItemStack(_itemStack, 0, 1, false)){
						return null;
					}
				}else if(TileEntitySiftExtractor.isItemFuel(_itemStack)){
					if(!this.mergeItemStack(_itemStack, 0, 2, false)){
						return null;
					}
				}else if(i >= 3 && i < 30){
					if(!this.mergeItemStack(_itemStack, 30, 39, false)){
						return null;
					}
				}else if(i >= 30 && i < 39 && !this.mergeItemStack(_itemStack, 3, 30, false)){
					return null;
				}
			}else if(!this.mergeItemStack(_itemStack, 3, 39, false)){
				return null;
			}
			if(_itemStack.stackSize == 0){
				slot.putStack((ItemStack)null);
			}else{
				slot.onSlotChanged();
			}
			if(_itemStack.stackSize == itemStack.stackSize){
				return null;
			}
			
			slot.onPickupFromSlot(player, _itemStack);
		}
		return itemStack;
	}
}