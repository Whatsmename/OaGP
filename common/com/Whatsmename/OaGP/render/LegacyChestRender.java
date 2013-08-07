package com.Whatsmename.OaGP.render;

import com.Whatsmename.OaGP.entity.TileEntityLegacyChest;

import net.minecraft.client.model.ModelChest;
import net.minecraft.client.renderer.tileentity.TileEntityRenderer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;

public class LegacyChestRender implements IItemRenderer {

	private ModelChest chestModel;
	
	public LegacyChestRender(){
		setChestModel(new ModelChest());
	}
	
	@Override
	public boolean handleRenderType(ItemStack item, ItemRenderType type) {
		return true;
	}

	@Override
	public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item,
			ItemRendererHelper helper) {
		return true;
	}

	@Override
	public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
		TileEntityRenderer.instance.renderTileEntityAt(new TileEntityLegacyChest(), 0.0D, 0.0D, 0.0D, 0.0F);
	}

	public ModelChest getChestModel() {
		return chestModel;
	}

	public void setChestModel(ModelChest chestModel) {
		this.chestModel = chestModel;
	}

}
