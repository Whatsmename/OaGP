package com.Whatsmename.OaGP.item;

import com.Whatsmename.OaGP.OaGP;
import com.Whatsmename.OaGP.lib.Strings;

public class ItemLeadIngot extends ItemOaGP {

	public ItemLeadIngot(int id) {
		super(id);
		this.setCreativeTab(OaGP.TabOaGP);
		this.setUnlocalizedName(Strings.ITEMLEADINGOT_NAME);
	}
}