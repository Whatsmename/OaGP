package com.Whatsmename.OaGP.item;

import com.Whatsmename.OaGP.OaGP;
import com.Whatsmename.OaGP.lib.Strings;

public class ItemLegacyRod extends ItemOaGP {

	public ItemLegacyRod(int id) {
		super(id);
		this.setCreativeTab(OaGP.TabOaGP);
		this.setUnlocalizedName(Strings.ITEMLEGACYROD_NAME);
	}
}