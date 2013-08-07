package com.Whatsmename.OaGP.block.storage;

import net.minecraft.block.material.Material;

import com.Whatsmename.OaGP.OaGP;
import com.Whatsmename.OaGP.block.BlockOaGP;
import com.Whatsmename.OaGP.lib.Strings;

public class BlockLegacy extends BlockOaGP {
	public BlockLegacy(int id){
		super(id, Material.rock);
		this.setHardness(60);
		this.setCreativeTab(OaGP.TabOaGP);
		this.setUnlocalizedName(Strings.BLOCKLEGACY_NAME);
	}
}