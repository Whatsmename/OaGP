package com.Whatsmename.OaGP.world.dimention;

import net.minecraft.util.ChunkCoordinates;

public class EightDayPortalPosition extends ChunkCoordinates {
	public long field_85087_d;
	final EightDayTeleporter field_85088_e;
	public EightDayPortalPosition(EightDayTeleporter eightDayTeleporter, int par2, int par3, int par4, long par5) {
		super(par2, par3, par4);
		this.field_85088_e = eightDayTeleporter;
		this.field_85087_d = par5;
	}
}