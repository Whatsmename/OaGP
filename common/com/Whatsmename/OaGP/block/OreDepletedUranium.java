package com.Whatsmename.OaGP.block;

import net.minecraft.block.material.Material;
import com.Whatsmename.OaGP.OaGP;
import com.Whatsmename.OaGP.lib.Strings;

public class OreDepletedUranium extends BlockOaGP{
	public OreDepletedUranium(int id){
		super(id, Material.rock);
		this.setHardness(50);
		this.setCreativeTab(OaGP.TabOaGP);
		this.setUnlocalizedName(Strings.OREDEPURANIUM_NAME);
	}
}

