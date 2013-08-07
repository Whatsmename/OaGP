package com.Whatsmename.OaGP.item;

import com.Whatsmename.OaGP.OaGP;
import com.Whatsmename.OaGP.lib.Strings;

public class ItemDepUranIngot extends ItemOaGP {

	public ItemDepUranIngot(int id) {
		super(id);
		this.setCreativeTab(OaGP.TabOaGP);
		this.setUnlocalizedName(Strings.ITEMDEPURANINGOT_NAME);
	}
}
