package tragicneko.tragicmc.worldgen.biome;

import net.minecraft.world.biome.BiomeGenBase;
import tragicneko.tragicmc.entity.mob.EntityNanoSwarm;
import tragicneko.tragicmc.main.TragicBlocks;

public class BiomeGenSynapse extends TragicBiome {

	public BiomeGenSynapse(int par1) {
		super(par1);
		this.spawnableMonsterList.clear();
        this.spawnableCreatureList.clear();
        this.spawnableWaterCreatureList.clear();
        this.spawnableCaveCreatureList.clear();
        this.spawnableCreatureList.add(new BiomeGenBase.SpawnListEntry(EntityNanoSwarm.class, 5, 0, 1));
		this.fillerBlock = TragicBlocks.CircuitBlock;
		this.topBlock = TragicBlocks.CircuitBlock;
		this.theBiomeDecorator = new BiomeDecoratorSynapse();
	}
}
