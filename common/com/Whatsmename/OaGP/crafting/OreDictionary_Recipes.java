package com.Whatsmename.OaGP.crafting;

import net.minecraftforge.oredict.ShapedOreRecipe;

import com.Whatsmename.OaGP.block.ModBlocks;
import com.Whatsmename.OaGP.item.ModItems;

import cpw.mods.fml.common.registry.GameRegistry;

public class OreDictionary_Recipes {
	public static void recipesInit(){

		GameRegistry.addRecipe(new ShapedOreRecipe(ModBlocks.blockLead, new Object[]{
				"LLL", "LLL", "LLL", 'L', "ingotLead"}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(ModBlocks.blockCopper, new Object[]{
				"CCC", "CCC", "CCC", 'C', "ingotCopper"}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.ItemDepUranPickaxe, new Object[]{
				"DDD", "#I#", "#I#", 'D', ModItems.ingotDepUran, 'I', "IronRod"}));

		GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.ItemDepUranAxe, new Object[]{
				"DD#", "#I#", "#I#", 'D', ModItems.ingotDepUran, 'I', "IronRod"}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.ItemDepUranSpade, new Object[]{
				"#D#", "#I#", "#I#", 'D', ModItems.ingotDepUran, 'I', "IronRod"}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.ItemDepUranHoe, new Object[]{
				"DD#", "#I#", "#I#", 'D', ModItems.ingotDepUran, 'I', "IronRod"}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(ModBlocks.minersAlter, new Object[]{
				"CIC", "LCL", "CIC", 'C', "ingotCopper", 'I', "ingotIron", 'L', "ingotLead"}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(ModBlocks.blockLegacy, new Object[]{
				"LLL", "LLL", "LLL", 'L', "itemLegacy"}));
			
		GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.LegacyRod, new Object[]{
				"##L", "#L#", "L##", 'L', "itemLegacy"}));
	}
}
