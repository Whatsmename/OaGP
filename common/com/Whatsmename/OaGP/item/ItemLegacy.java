package com.Whatsmename.OaGP.item;

import com.Whatsmename.OaGP.OaGP;
import com.Whatsmename.OaGP.lib.Strings;

public class ItemLegacy extends ItemOaGP {

	public ItemLegacy(int id) {
		super(id);
		this.setCreativeTab(OaGP.TabOaGP);
		this.setUnlocalizedName(Strings.ITEMLEGACY_NAME);
	}
}
