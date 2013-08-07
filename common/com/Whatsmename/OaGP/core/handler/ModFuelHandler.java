package com.Whatsmename.OaGP.core.handler;

import com.Whatsmename.OaGP.lib.ItemIDs;

import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.IFuelHandler;


public class ModFuelHandler implements IFuelHandler{
	@Override
	public int getBurnTime(ItemStack fuel) { //This method sets burn time
		if(fuel.itemID == ItemIDs.E99_ID){
			return 4000; 
		}
	return 0;
	}
}