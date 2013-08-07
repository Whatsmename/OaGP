package com.Whatsmename.OaGP;

import java.io.File;

import net.minecraft.creativetab.CreativeTabs;

import com.Whatsmename.OaGP.block.ModBlocks;
import com.Whatsmename.OaGP.core.handler.ConfigurationHander;
import com.Whatsmename.OaGP.core.handler.LocalizationHandler;
import com.Whatsmename.OaGP.core.handler.ModFuelHandler;
import com.Whatsmename.OaGP.core.handler.OaGPPacketHandler;
import com.Whatsmename.OaGP.core.proxy.CommonProxy;
import com.Whatsmename.OaGP.crafting.OaGP_Recipes;
import com.Whatsmename.OaGP.crafting.OreDictionary_Recipes;
import com.Whatsmename.OaGP.creativetab.TabOaGP;
import com.Whatsmename.OaGP.item.ModItems;
import com.Whatsmename.OaGP.lib.Reference;
import com.Whatsmename.OaGP.world.biome.ModBiomes;
import com.Whatsmename.OaGP.world.dimention.ModDiment;
import com.Whatsmename.OaGP.world.generator.WorldGeneratorOaGP;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;


@Mod(
		modid= Reference.MOD_ID ,
		name = Reference.MOD_NAME,
		version = Reference.VERSION)

@NetworkMod(
		channels = {Reference.CHANNEL_NAME},
		packetHandler = OaGPPacketHandler.class,
		serverSideRequired = false,
		clientSideRequired = true)

public class OaGP{
	
	@Instance("OaGP")
	public static OaGP instance;
	
	WorldGeneratorOaGP worldGenerator = new WorldGeneratorOaGP();
	
	//private com.Whatsmename.OaGP.gui.HandlerGUI HandlerGUI = new com.Whatsmename.OaGP.gui.HandlerGUI();
	
	@SidedProxy(
			clientSide = Reference.CLIENT_PROXY_LOCATION,
			serverSide = Reference.COMMON_PROXY_LOCATION)
	
	public static CommonProxy proxy;
	
	public static CreativeTabs TabOaGP = new TabOaGP(CreativeTabs.getNextID(), Reference.MOD_ID);

	public static ModBiomes BiomeMinersParadise;
	
	@PreInit
	public void preInit(FMLPreInitializationEvent event){		
		LocalizationHandler.loadLanguages();
		
		ConfigurationHander.init(new File(event.getModConfigurationDirectory().getAbsolutePath() + File.separator + Reference.CHANNEL_NAME + File.separator + Reference.MOD_ID + ".cfg"));
		
		ModDiment.DimentInit();
		
		ModBiomes.BiomeInit();
		
		ModItems.ItemInit();
		
		ModBlocks.BlocksInit();
		
		CommonProxy.registerOre();
		
		OreDictionary_Recipes.recipesInit();
		
		ModHooks.initTools();
		
		OaGP_Recipes.recipesInit();
		
		GameRegistry.registerWorldGenerator(worldGenerator);
		
		GameRegistry.registerFuelHandler(new ModFuelHandler());
	}
	//@Init
	public void init(FMLInitializationEvent event){
		//NetworkRegistry.instance().registerGuiHandler(this, HandlerGUI);

		proxy.registerTileEntitySpecialRenderer();
		proxy.registerRenderThings();
	}
	
	@PostInit
	public void postInit(FMLPostInitializationEvent event){
		
	}
}
