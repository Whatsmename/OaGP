package com.Whatsmename.OaGP.world.biome;

import net.minecraft.world.biome.BiomeGenBase;

import com.Whatsmename.OaGP.OaGP;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModBiomes extends OaGP{

	public static BiomeGenBase minersParadise;
	
	public static void BiomeInit(){
		minersParadise = new BiomeMinersParadise(40);
		
		GameRegistry.addBiome(minersParadise);
	}
}