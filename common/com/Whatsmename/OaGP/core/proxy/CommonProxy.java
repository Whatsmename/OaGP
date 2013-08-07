package com.Whatsmename.OaGP.core.proxy;

import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

import com.Whatsmename.OaGP.block.ModBlocks;
import com.Whatsmename.OaGP.crafting.OaGP_Recipes;
import com.Whatsmename.OaGP.item.ModItems;

public class CommonProxy extends OaGP_Recipes{

	public void registerTileEntitySpecialRenderer() {
		
	}

	public void registerRenderThings() {
		
	}
	
	public static void registerOre(){
		OreDictionary.registerOre("ingotCopper", new ItemStack(ModItems.ingotCopper));
		OreDictionary.registerOre("ingotLead", new ItemStack(ModItems.ingotLead));
		OreDictionary.registerOre("IronRod", new ItemStack(ModItems.IronRod));
		OreDictionary.registerOre("itemLegacy", new ItemStack(ModItems.ItemLegacy));
		OreDictionary.registerOre("LegacyRod", new ItemStack(ModItems.LegacyRod));
		OreDictionary.registerOre("blockCopper", new ItemStack(ModBlocks.blockCopper));
		OreDictionary.registerOre("blockLead", new ItemStack(ModBlocks.blockLead));
		OreDictionary.registerOre("oreCopper", new ItemStack( ModBlocks.oreCopper));
		OreDictionary.registerOre("oreLead", new ItemStack(ModBlocks.oreLead));
		OreDictionary.registerOre("blockCopper", new ItemStack(ModBlocks.blockCopper));
		OreDictionary.registerOre("blockLead", new ItemStack(ModBlocks.blockLead));
		OreDictionary.registerOre("blockLegacy", new ItemStack(ModBlocks.blockLegacy));
	}
}
