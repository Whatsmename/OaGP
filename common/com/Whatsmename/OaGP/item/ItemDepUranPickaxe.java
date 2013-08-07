package com.Whatsmename.OaGP.item;

import com.Whatsmename.OaGP.OaGP;
import com.Whatsmename.OaGP.lib.Reference;
import com.Whatsmename.OaGP.lib.Strings;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemDepUranPickaxe extends ItemPickaxe {

	public ItemDepUranPickaxe(int par1, EnumToolMaterial par2EnumToolMaterial) {
		super(par1, par2EnumToolMaterial);
		this.setUnlocalizedName(Strings.ITEMDEPURANPICKAXE_NAME);
		this.setCreativeTab(OaGP.TabOaGP);
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IconRegister register){
		itemIcon = register.registerIcon(Reference.MOD_ID + ":" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".")+1));
	}
	
	
	public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10){
		if(par3World.getBlockId(par4, par5, par6) != 0){
			par3World.setBlock(par4, par5 + 1, par6, Block.torchWood.blockID);
			return true;
		}
		return false;
	}
}
