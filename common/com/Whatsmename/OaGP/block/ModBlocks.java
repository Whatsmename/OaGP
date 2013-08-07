package com.Whatsmename.OaGP.block;

import net.minecraft.block.Block;

import com.Whatsmename.OaGP.block.machines.MinersAlter;
import com.Whatsmename.OaGP.block.machines.Smeltery;
import com.Whatsmename.OaGP.block.storage.BlockCopper;
import com.Whatsmename.OaGP.block.storage.BlockDepletedUranium;
import com.Whatsmename.OaGP.block.storage.BlockLead;
import com.Whatsmename.OaGP.block.storage.BlockLegacy;
import com.Whatsmename.OaGP.lib.BlockIDs;
import com.Whatsmename.OaGP.lib.Strings;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks {
	public static Block oreE99;
	public static Block oreLead;
	public static Block oreDepUranium;
	public static Block oreCopper;
	public static Block oreLegacy;
	public static Block blockLegacy;
	public static Block blockLead;
	public static Block blockCopper;
	public static Block blockDepUran;
	public static Block modPortal;
	//public static Block mechTable;
	//public static Block chestLegacy;
	public static Block minersAlter;
	public static Block smeltery;
	
	
	public static void BlocksInit(){
		oreE99 = new OreE99(BlockIDs.OREE99_ID);
		oreLead = new OreLead(BlockIDs.ORELEAD_ID);
		oreDepUranium = new OreDepletedUranium(BlockIDs.OREDEPURANIUM_ID);
		oreCopper = new OreCopper(BlockIDs.ORECOPPER_ID);
		oreLegacy = new OreLegacy(BlockIDs.ORELEGACY_ID);
		blockLegacy = new BlockLegacy(BlockIDs.BLOCKLEGACY_ID);
		blockLead = new BlockLead(BlockIDs.BLOCKLEAD_ID);
		blockCopper = new BlockCopper(BlockIDs.BLOCKCOPPER_ID);
		blockDepUran = new BlockDepletedUranium(BlockIDs.BLOCKDEPURAN_ID);
		modPortal = new ModPortal(BlockIDs.MODPORTAL_ID);
		//mechTable = new MechTable(BlockIDs.MACHTABLE_ID);
		//chestLegacy = new LegacyChest(BlockIDs.CHESTLEGACY_ID);
		minersAlter = new MinersAlter(BlockIDs.MINERSALTER_ID);
		smeltery = new Smeltery(BlockIDs.SMELTERY_ID);

		GameRegistry.registerBlock(oreE99, Strings.OREE99_NAME);
		GameRegistry.registerBlock(oreLead, Strings.ORELEAD_NAME);
		GameRegistry.registerBlock(oreDepUranium, Strings.OREDEPURANIUM_NAME);
		GameRegistry.registerBlock(oreCopper, Strings.ORECOPPER_NAME);
		GameRegistry.registerBlock(oreLegacy, Strings.ORELEGACY_NAME);
		GameRegistry.registerBlock(blockLegacy, Strings.BLOCKLEGACY_NAME);
		GameRegistry.registerBlock(blockLead, Strings.BLOCKLEAD_NAME);
		GameRegistry.registerBlock(blockCopper, Strings.BLOCKCOPPER_NAME);
		GameRegistry.registerBlock(blockDepUran, Strings.BLOCKDEPURAN_NAME);
		GameRegistry.registerBlock(modPortal, Strings.BLOCKPORTAL_NAME);
		//GameRegistry.registerBlock(mechTable, Strings.MACHTABLE_NAME);
		//GameRegistry.registerBlock(chestLegacy, Strings.CHESTLEGACY_NAME);
		GameRegistry.registerBlock(minersAlter, Strings.MINERSALTER_NAME);
		GameRegistry.registerBlock(smeltery, Strings.SMELTERY_NAME);
	}
}