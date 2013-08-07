package com.Whatsmename.OaGP.block;

import java.util.Random;

import net.minecraft.block.material.Material;

import com.Whatsmename.OaGP.OaGP;
import com.Whatsmename.OaGP.item.ModItems;
import com.Whatsmename.OaGP.lib.Strings;

public class OreE99 extends BlockOaGP{
	public OreE99(int id){
		super(id, Material.rock);
		this.setHardness(5);
		this.setCreativeTab(OaGP.TabOaGP);
		this.setUnlocalizedName(Strings.OREE99_NAME);
	}
	public int quantityDropped(int par1){
        	return (1);
	}

	public int idDropped(int par1, Random par2Random, int par3){
        return ModItems.E99.itemID;
	}
}