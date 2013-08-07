package com.Whatsmename.OaGP.block.storage;

import net.minecraft.block.material.Material;

import com.Whatsmename.OaGP.OaGP;
import com.Whatsmename.OaGP.block.BlockOaGP;
import com.Whatsmename.OaGP.lib.Strings;

public class BlockDepletedUranium extends BlockOaGP {
	public BlockDepletedUranium(int id){
		super(id, Material.iron);
		this.setHardness(50);
		this.setCreativeTab(OaGP.TabOaGP);
		this.setUnlocalizedName(Strings.BLOCKDEPURAN_NAME);
	}
}
