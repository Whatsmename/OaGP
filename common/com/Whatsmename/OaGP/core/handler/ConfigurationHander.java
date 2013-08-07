package com.Whatsmename.OaGP.core.handler;

import java.io.File;
import java.util.logging.Level;

import net.minecraftforge.common.Configuration;

import com.Whatsmename.OaGP.lib.BlockIDs;
import com.Whatsmename.OaGP.lib.ItemIDs;
import com.Whatsmename.OaGP.lib.Reference;
import com.Whatsmename.OaGP.lib.Strings;

import cpw.mods.fml.common.FMLLog;

public class ConfigurationHander {
	public static Configuration config;
	public static void init(File file){
		config = new Configuration(file);
		
		try{
			config.load();
			
			BlockIDs.OREE99_ID = config.getBlock(Strings.OREE99_NAME, BlockIDs.OREE99_ID_DEFAULT).getInt(BlockIDs.OREE99_ID_DEFAULT);
			BlockIDs.ORELEAD_ID = config.getBlock(Strings.ORELEAD_NAME, BlockIDs.ORELEAD_ID_DEFAULT).getInt(BlockIDs.ORELEAD_ID_DEFAULT);
			BlockIDs.OREDEPURANIUM_ID = config.getBlock(Strings.OREDEPURANIUM_NAME, BlockIDs.OREDEPURANIUM_ID_DEFAULT).getInt(BlockIDs.OREDEPURANIUM_ID_DEFAULT);
			BlockIDs.ORECOPPER_ID = config.getBlock(Strings.ORECOPPER_NAME, BlockIDs.ORECOPPER_ID_DEFAULT).getInt(BlockIDs.ORECOPPER_ID_DEFAULT);
			BlockIDs.ORELEGACY_ID = config.getBlock(Strings.ORELEGACY_NAME, BlockIDs.ORELEGACY_ID_DEFAULT).getInt(BlockIDs.ORELEGACY_ID_DEFAULT);
			BlockIDs.BLOCKLEGACY_ID = config.getBlock(Strings.BLOCKLEGACY_NAME, BlockIDs.BLOCKLEGACY_ID_DEFAULT).getInt(BlockIDs.BLOCKLEGACY_ID_DEFAULT);
			BlockIDs.BLOCKLEAD_ID = config.getBlock(Strings.BLOCKLEAD_NAME, BlockIDs.BLOCKLEAD_ID_DEFAULT).getInt(BlockIDs.BLOCKLEAD_ID_DEFAULT);
			BlockIDs.BLOCKCOPPER_ID = config.getBlock(Strings.BLOCKCOPPER_NAME, BlockIDs.BLOCKCOPPER_ID_DEFAULT).getInt(BlockIDs.BLOCKCOPPER_ID_DEFAULT);
			BlockIDs.BLOCKDEPURAN_ID = config.getBlock(Strings.BLOCKDEPURAN_NAME, BlockIDs.BLOCKDEPURAN_ID_DEFAULT).getInt(BlockIDs.BLOCKDEPURAN_ID_DEFAULT);
			BlockIDs.OREE99_ID = config.getBlock(Strings.OREE99_NAME, BlockIDs.OREE99_ID_DEFAULT).getInt(BlockIDs.OREE99_ID_DEFAULT);
			//BlockIDs.MACHTABLE_ID = config.getBlock(Strings.MACHTABLE_NAME, BlockIDs.MACHTABLE_ID_DEFAULT).getInt(BlockIDs.MACHTABLE_ID_DEFAULT);
			//BlockIDs.CHESTLEGACY_ID = config.getBlock(Strings.CHESTLEGACY_NAME, BlockIDs.CHESTLEGACY_ID_DEFAULT).getInt(BlockIDs.CHESTLEGACY_ID_DEFAULT);
			BlockIDs.MINERSALTER_ID = config.getBlock(Strings.MINERSALTER_NAME, BlockIDs.MINERSALTER_ID_DEFAULT).getInt(BlockIDs.MINERSALTER_ID_DEFAULT);
			ItemIDs.PIMPCANE_ID = config.getItem(Strings.PIMPCANE_NAME, ItemIDs.PIMPCANE_ID_DEFAULT).getInt(ItemIDs.PIMPCANE_ID_DEFAULT);
			ItemIDs.PIMPCANE2_ID = config.getItem(Strings.PIMPCANE2_NAME, ItemIDs.PIMPCANE2_ID_DEFAULT).getInt(ItemIDs.PIMPCANE2_ID_DEFAULT);
			ItemIDs.LEGACYCANE_ID = config.getItem(Strings.LEGACYCANE_NAME, ItemIDs.LEGACYCANE_ID_DEFAULT).getInt(ItemIDs.LEGACYCANE_ID_DEFAULT);
			ItemIDs.ITEMDEPURANPICKAXE_ID = config.getItem(Strings.ITEMDEPURANPICKAXE_NAME, ItemIDs.ITEMDEPURANPICKAXE_ID_DEFAULT).getInt(ItemIDs.ITEMDEPURANPICKAXE_ID_DEFAULT);
			ItemIDs.ITEMDEPURANAXE_ID = config.getItem(Strings.ITEMDEPURANAXE_NAME, ItemIDs.ITEMDEPURANAXE_ID_DEFAULT).getInt(ItemIDs.ITEMDEPURANAXE_ID_DEFAULT);
			ItemIDs.ITEMDEPURANHOE_ID = config.getItem(Strings.ITEMDEPURANHOE_NAME, ItemIDs.ITEMDEPURANHOE_ID_DEFAULT).getInt(ItemIDs.ITEMDEPURANHOE_ID_DEFAULT);
			ItemIDs.ITEMDEPURANSPADE_ID = config.getItem(Strings.ITEMDEPURANSPADE_NAME, ItemIDs.ITEMDEPURANSPADE_ID_DEFAULT).getInt(ItemIDs.ITEMDEPURANSPADE_ID_DEFAULT);
			ItemIDs.ITEMLEGACY_ID = config.getItem(Strings.ITEMLEGACY_NAME, ItemIDs.ITEMLEGACY_ID_DEFAULT).getInt(ItemIDs.ITEMLEGACY_ID_DEFAULT);
			ItemIDs.ITEMDEPURANINGOT_ID = config.getItem(Strings.ITEMDEPURANINGOT_NAME, ItemIDs.ITEMDEPURANINGOT_ID_DEFAULT).getInt(ItemIDs.ITEMDEPURANINGOT_ID_DEFAULT);
			ItemIDs.ITEMCOPPERINGOT_ID = config.getItem(Strings.ITEMCOPPERINGOT_NAME, ItemIDs.ITEMCOPPERINGOT_ID_DEFAULT).getInt(ItemIDs.ITEMCOPPERINGOT_ID_DEFAULT);
			ItemIDs.ITEMLEADINGOT_ID = config.getItem(Strings.ITEMLEADINGOT_NAME, ItemIDs.ITEMLEADINGOT_ID_DEFAULT).getInt(ItemIDs.ITEMLEADINGOT_ID_DEFAULT);
			ItemIDs.ITEMLEGACYROD_ID = config.getItem(Strings.ITEMLEGACYROD_NAME, ItemIDs.ITEMLEGACYROD_ID_DEFAULT).getInt(ItemIDs.ITEMLEGACYROD_ID_DEFAULT);
			ItemIDs.ITEMIRONROD_ID = config.getItem(Strings.ITEMIRONROD_NAME, ItemIDs.ITEMIRONROD_ID_DEFAULT).getInt(ItemIDs.ITEMIRONROD_ID_DEFAULT);
			ItemIDs.E99_ID = config.getItem(Strings.E99_NAME, ItemIDs.E99_ID_DEFAULT).getInt(ItemIDs.E99_ID_DEFAULT);
		}
		catch(Exception e){
			FMLLog.log(Level.SEVERE, e, Reference.MOD_ID + "Has a problem loading the config file");
		}
		finally{
			config.save();
		}
		
	}
}
