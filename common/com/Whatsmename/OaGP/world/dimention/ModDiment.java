package com.Whatsmename.OaGP.world.dimention;

import net.minecraftforge.common.DimensionManager;

import com.Whatsmename.OaGP.OaGP;
import com.Whatsmename.OaGP.world.WorldProviderOaGP;

public class ModDiment extends OaGP{

	public static int DimID = 40;
	
	public static void DimentInit(){
		DimensionManager.registerProviderType(DimID, WorldProviderOaGP.class, true);
		DimensionManager.registerDimension(DimID, DimID);
	}
}
