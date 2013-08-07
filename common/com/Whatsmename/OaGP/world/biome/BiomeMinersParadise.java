package com.Whatsmename.OaGP.world.biome;

import net.minecraft.block.Block;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenMinable;

public class BiomeMinersParadise extends BiomeGenBase {
	
	protected BiomeMinersParadise(int par1) {
		super(par1);
		this.setBiomeName("Miner's Paradise");
		this.setMinMaxHeight(50F, 200F);
		this.topBlock = (byte)Block.mycelium.blockID;
		this.theBiomeDecorator.grassPerChunk = 0;
		this.theBiomeDecorator.treesPerChunk = 0;
		this.theBiomeDecorator.flowersPerChunk = 0;
		this.theBiomeDecorator.deadBushPerChunk = 0;
		this.spawnableMonsterList.clear();
		this.spawnableCreatureList.clear();
		this.spawnableWaterCreatureList.clear();
		new WorldGenMinable(Block.silverfish.blockID, 8);
	}
 
    private boolean enableRain;
    
    public BiomeGenBase setDisableRain() {
        this.setEnableRain(false);
        return this;
    }

	public boolean isEnableRain() {
		return enableRain;
	}

	public void setEnableRain(boolean enableRain) {
		this.enableRain = enableRain;
	}
    
}