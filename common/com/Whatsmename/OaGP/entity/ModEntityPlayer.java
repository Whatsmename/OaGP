package com.Whatsmename.OaGP.entity;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.world.World;

public class ModEntityPlayer extends EntityPlayer {

	public ModEntityPlayer(World par1World) {
		super(par1World);
	}

	@Override
	public void sendChatToPlayer(String s) {}

	@Override
	public boolean canCommandSenderUseCommand(int i, String s) {
		return false;
	}

	@Override
	public ChunkCoordinates getPlayerCoordinates() {
		return null;
	}

	public void displayGUIMechTable(int par2, int par3, int par4) {}

}
