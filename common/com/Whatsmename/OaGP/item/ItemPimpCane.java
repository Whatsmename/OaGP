package com.Whatsmename.OaGP.item;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.Whatsmename.OaGP.OaGP;
import com.Whatsmename.OaGP.lib.Reference;
import com.Whatsmename.OaGP.lib.Strings;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemPimpCane extends ItemOaGP {
	private int weaponDamage;
    public ItemPimpCane(int id){
		super(id);
		this.setCreativeTab(OaGP.TabOaGP);
		this.setUnlocalizedName(Strings.PIMPCANE_NAME);
		this.maxStackSize = 1;
        this.setMaxDamage(Reference.ULTIMATE_DAMAGE);
        this.setWeaponDamage(Reference.ULTIMATE_DAMAGE);
	}
	
	public boolean hitEntity(ItemStack par1ItemStack, EntityLiving par2EntityLiving, EntityLiving par3EntityLiving)
    {
        par1ItemStack.damageItem(1, par3EntityLiving);
        return true;
    }

	public void setWeaponDamage(int weaponDamage) {
		this.weaponDamage = weaponDamage;
	}

	public int getWeaponDamage() {
		return weaponDamage;
	}
	
	public int getDamageVsEntity(Entity par1Entity)
    {
        return this.weaponDamage;
    }

    @SideOnly(Side.CLIENT)

    /**
     * Returns True is the item is renderer in full 3D when hold.
     */
    public boolean isFull3D()
    {
        return true;
    }

    /**
     * returns the action that specifies what animation to play when the items is being used
     */
    public EnumAction getItemUseAction(ItemStack par1ItemStack)
    {
        return EnumAction.block;
    }
    
    public int getMaxItemUseDuration(ItemStack par1ItemStack)
    {
        return 72000;
    }

    /**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
     */
    public boolean onItemUse(ItemStack is, EntityPlayer player, World w, int x, int y, int z, int l, float f, float f1, float f3){
    	if(w.getBlockId(x, y, z) == Block.stone.blockID){ //Vice versa
    		w.setBlock(x, y, z, Block.blockGold.blockID);
    	}
    return false;
    }
    
    public boolean hasEffect(ItemStack is){
    	return true;
    }
}
