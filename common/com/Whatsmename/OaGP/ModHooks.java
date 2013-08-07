package com.Whatsmename.OaGP;

import com.Whatsmename.OaGP.block.ModBlocks;
import com.Whatsmename.OaGP.item.ModItems;

import net.minecraftforge.common.ForgeHooks;
import net.minecraftforge.common.MinecraftForge;

public class ModHooks extends ForgeHooks{
	public static void initTools() {
        MinecraftForge.setToolClass(ModItems.ItemDepUranPickaxe, "pickaxe", 4);
        MinecraftForge.setToolClass(ModItems.ItemDepUranAxe, "axe", 4);
        MinecraftForge.setToolClass(ModItems.ItemDepUranSpade, "shovel", 4);
        
        MinecraftForge.setBlockHarvestLevel(ModBlocks.oreDepUranium, "pickaxe", 3);
		MinecraftForge.setBlockHarvestLevel(ModBlocks.oreLegacy, "pickaxe", 4);
	}
}
