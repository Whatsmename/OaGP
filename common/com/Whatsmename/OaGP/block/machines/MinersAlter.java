package com.Whatsmename.OaGP.block.machines;

import net.minecraft.block.material.Material;

import com.Whatsmename.OaGP.OaGP;
import com.Whatsmename.OaGP.block.BlockOaGP;
import com.Whatsmename.OaGP.lib.Strings;

public class MinersAlter extends BlockOaGP {
	public MinersAlter(int id){
		super(id, Material.rock);
		this.setHardness(60);
		this.setCreativeTab(OaGP.TabOaGP);
		this.setUnlocalizedName(Strings.MINERSALTER_NAME);
	}
	
	/*private ChunkCoordinates spawnChunk;
	
	public int onBlockPlaced(World par1World, int par1, int par2, int par3, int par5, float par6, float par7, float par8, int par9) {
		{
            this.playerLocation = new ChunkCoordinates(MathHelper.floor_double(this.posX), MathHelper.floor_double(this.posY), MathHelper.floor_double(this.posZ));
            this.wakeUpPlayer(true, true, false);
        }

        if (par1NBTTagCompound.hasKey("SpawnX") && par1NBTTagCompound.hasKey("SpawnY") && par1NBTTagCompound.hasKey("SpawnZ"))
        {
            this.spawnChunk = new ChunkCoordinates(par1NBTTagCompound.getInteger("SpawnX"), par1NBTTagCompound.getInteger("SpawnY"), par1NBTTagCompound.getInteger("SpawnZ"));
            this.spawnForced = par1NBTTagCompound.getBoolean("SpawnForced");
        }
		
		World.setSpawnLocation(posX, posY, posZ);
		return par9;
		}
		*/
}