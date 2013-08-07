package com.Whatsmename.OaGP.crafting;

import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.Whatsmename.OaGP.block.ModBlocks;
import com.Whatsmename.OaGP.item.ModItems;

import cpw.mods.fml.common.registry.GameRegistry;

public class OaGP_Recipes {

	public static void recipesInit(){
	
	GameRegistry.addShapelessRecipe(new ItemStack(ModItems.PimpCane), new Object[]{
		new ItemStack(Block.mycelium), new ItemStack(ModItems.LegacyCane)
	});
	
	GameRegistry.addShapelessRecipe(new ItemStack(ModItems.PimpCane2), new Object[]{
		new ItemStack(Block.plantRed), new ItemStack(ModItems.LegacyCane)
	});
	
	GameRegistry.addShapelessRecipe(new ItemStack(ModItems.PimpCane), new Object[]{
		new ItemStack(Block.mycelium), new ItemStack(ModItems.PimpCane2)
	});

	GameRegistry.addShapelessRecipe(new ItemStack(ModItems.ingotCopper, 9), new Object[]{
		new ItemStack(ModBlocks.blockCopper)
	});
	
	GameRegistry.addShapelessRecipe(new ItemStack(ModItems.ingotLead, 9), new Object[]{
		new ItemStack(ModBlocks.blockLead)
	});
	
	GameRegistry.addShapelessRecipe(new ItemStack(ModItems.ingotDepUran, 9), new Object[]{
		new ItemStack(ModBlocks.blockDepUran)
	});
	
	GameRegistry.addShapelessRecipe(new ItemStack(ModItems.ItemLegacy, 9), new Object[]{
		new ItemStack(ModBlocks.blockLegacy)
	});
	
	GameRegistry.addRecipe(new ItemStack(ModBlocks.blockDepUran), new Object[]{
		"DDD", "DDD", "DDD", 'D', ModItems.ingotDepUran
	});
	
	GameRegistry.addRecipe(new ItemStack(ModBlocks.blockLegacy), new Object[]{
		"LLL", "LLL", "LLL", 'L', ModItems.ItemLegacy
	});

	GameRegistry.addRecipe(new ItemStack(ModItems.IronRod), new Object[]{
		"##I", "#I#", "I##", 'I', Item.ingotIron
	});
	
	GameRegistry.addRecipe(new ItemStack(ModItems.LegacyRod), new Object[]{
		"##L", "#L#", "L##", 'L', ModItems.ItemLegacy
	});
	
	GameRegistry.addRecipe(new ItemStack(ModItems.PimpCane2), new Object[]{
		"##G", "RL#", "N##", 'L', ModItems.LegacyRod, 'G', Item.ingotGold, 'R', Block.plantRed, 'N', Item.goldNugget
	});
	
	GameRegistry.addRecipe(new ItemStack(ModItems.PimpCane), new Object[]{
		"##G", "ML#", "N##", 'L', ModItems.LegacyRod, 'G', Item.ingotGold, 'M', Block.mycelium, 'N', Item.goldNugget
	});
	
	GameRegistry.addRecipe(new ItemStack(ModItems.LegacyCane), new Object[]{
		"##G", "#L#", "N##", 'L', ModItems.LegacyRod, 'G', Item.ingotGold, 'N', Item.goldNugget
	});
	
	GameRegistry.addSmelting(ModBlocks.oreDepUranium.blockID, new ItemStack(ModItems.ingotDepUran), 2F);
	GameRegistry.addSmelting(ModBlocks.oreCopper.blockID, new ItemStack(ModItems.ingotCopper), 2F);
	GameRegistry.addSmelting(ModBlocks.oreLead.blockID, new ItemStack(ModItems.ingotLead), 2F);	
	GameRegistry.addSmelting(ModBlocks.oreLegacy.blockID, new ItemStack(ModItems.ItemLegacy), 2F);
	GameRegistry.addSmelting(ModBlocks.blockLegacy.blockID, new ItemStack(ModItems.ItemLegacy, 9), 2F);
	
	ItemStack enchant = new ItemStack(ModItems.ItemDepUranSpade);
	enchant.addEnchantment(Enchantment.silkTouch, 1);
	GameRegistry.addShapedRecipe(enchant, new Object[]{
		"GDG","GSG","GDG",'G', Block.blockGold, 'S', ModItems.ItemDepUranSpade, 'D', Item.diamond
	});

	ItemStack enchant1 = new ItemStack(ModItems.ItemDepUranSpade);
	enchant1.addEnchantment(Enchantment.unbreaking, 4);
	GameRegistry.addShapelessRecipe(enchant1, new Object[]{
		ModItems.ItemDepUranSpade, ModItems.ItemLegacy
	});
	ItemStack enchant2 = new ItemStack(ModItems.ItemDepUranPickaxe);
	enchant2.addEnchantment(Enchantment.fortune, 4);
	GameRegistry.addShapedRecipe(enchant2, new Object[]{
		"GDG","GPG","GDG",'G', Block.blockGold, 'P', ModItems.ItemDepUranPickaxe, 'D', Item.diamond
	});
	
	ItemStack enchant3 = new ItemStack(ModItems.ItemDepUranPickaxe);
	enchant3.addEnchantment(Enchantment.unbreaking, 4);
	GameRegistry.addShapelessRecipe(enchant3, new Object[]{
		ModItems.ItemDepUranPickaxe, ModItems.ItemLegacy
	});
  }
}

