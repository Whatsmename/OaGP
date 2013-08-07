package com.Whatsmename.OaGP.item;

import com.Whatsmename.OaGP.OaGP;
import com.Whatsmename.OaGP.lib.Strings;


public class ItemIronRod extends ItemOaGP {

	public ItemIronRod(int id) {
		super(id);
		this.setCreativeTab(OaGP.TabOaGP);
		this.setUnlocalizedName(Strings.ITEMIRONROD_NAME);
	}
}