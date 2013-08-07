package com.Whatsmename.OaGP.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

import com.Whatsmename.OaGP.block.ModBlocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TabOaGP extends CreativeTabs {
	public TabOaGP(int id, String name){
		super(id, name);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public ItemStack getIconItemStack(){
	
		return new ItemStack(ModBlocks.oreDepUranium,1,0);	
	}
}
