package com.Whatsmename.OaGP.block.storage;

import net.minecraft.block.material.Material;

import com.Whatsmename.OaGP.OaGP;
import com.Whatsmename.OaGP.block.BlockOaGP;
import com.Whatsmename.OaGP.lib.Strings;

public class BlockLead extends BlockOaGP {
	public BlockLead(int id){
		super(id, Material.iron);
		this.setHardness(3);
		this.setCreativeTab(OaGP.TabOaGP);
		this.setUnlocalizedName(Strings.BLOCKLEAD_NAME);
	}
}