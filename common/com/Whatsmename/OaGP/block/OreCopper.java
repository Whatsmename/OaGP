package com.Whatsmename.OaGP.block;

import net.minecraft.block.material.Material;

import com.Whatsmename.OaGP.OaGP;
import com.Whatsmename.OaGP.lib.Strings;

public class OreCopper extends BlockOaGP {
	public OreCopper(int id){
		super(id, Material.rock);
		this.setHardness(3);
		this.setCreativeTab(OaGP.TabOaGP);
		this.setUnlocalizedName(Strings.ORECOPPER_NAME);
	}
}