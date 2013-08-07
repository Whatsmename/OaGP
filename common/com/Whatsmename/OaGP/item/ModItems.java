package com.Whatsmename.OaGP.item;

import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraftforge.common.EnumHelper;

import com.Whatsmename.OaGP.lib.ItemIDs;
import com.Whatsmename.OaGP.lib.Strings;

public class ModItems {
	
	public static Item LegacyRod;
	public static Item PimpCane;
	public static Item PimpCane2;
	public static Item ItemDepUranPickaxe;
	public static Item ItemDepUranSpade;
	public static Item ItemDepUranHoe;
	public static Item ItemDepUranAxe;
	public static Item LegacyCane;
	public static EnumToolMaterial DepUranToolMaterial;
	public static Item ItemLegacy;
	public static ItemDepUranIngot ingotDepUran;
	public static ItemLeadIngot ingotLead;
	public static ItemCopperIngot ingotCopper;
	public static Item IronRod;
	public static Item E99;
	
	public static void ItemInit(){
		
		
		DepUranToolMaterial = EnumHelper.addToolMaterial(Strings.DEPURANTOOLMATERIAL, 4, 3200, 15.0F, 4, 35);
		
		PimpCane = new ItemPimpCane(ItemIDs.PIMPCANE_ID);
		PimpCane2 = new ItemPimpCane2(ItemIDs.PIMPCANE2_ID);
		LegacyCane = new ItemLegacyCane(ItemIDs.LEGACYCANE_ID);
		ItemDepUranPickaxe = new ItemDepUranPickaxe(ItemIDs.ITEMDEPURANPICKAXE_ID, DepUranToolMaterial);
		ItemDepUranAxe = new ItemDepUranAxe(ItemIDs.ITEMDEPURANAXE_ID,DepUranToolMaterial);
		ItemDepUranHoe = new ItemDepUranHoe(ItemIDs.ITEMDEPURANHOE_ID,DepUranToolMaterial);
		ItemDepUranSpade = new ItemDepUranSpade(ItemIDs.ITEMDEPURANSPADE_ID,DepUranToolMaterial);
		ItemLegacy = new ItemLegacy(ItemIDs.ITEMLEGACY_ID);
		ingotDepUran = new ItemDepUranIngot(ItemIDs.ITEMDEPURANINGOT_ID);
		ingotCopper = new ItemCopperIngot(ItemIDs.ITEMCOPPERINGOT_ID);
		ingotLead = new ItemLeadIngot(ItemIDs.ITEMLEADINGOT_ID);
		LegacyRod = new ItemLegacyRod(ItemIDs.ITEMLEGACYROD_ID);
		IronRod = new ItemIronRod(ItemIDs.ITEMIRONROD_ID);
		E99 = new E99(ItemIDs.E99_ID);
	};
}