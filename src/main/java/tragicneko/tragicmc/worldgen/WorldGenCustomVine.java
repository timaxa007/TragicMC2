package tragicneko.tragicmc.worldgen;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.util.Direction;
import net.minecraft.util.Facing;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
import tragicneko.tragicmc.TragicBlocks;

public class WorldGenCustomVine extends WorldGenerator {

	public final Block theBlock;
	public final int maxHeight;

	public WorldGenCustomVine(Block block, int attempts)
	{
		this.theBlock = block;
		this.maxHeight = attempts;
	}

	@Override
	public boolean generate(World world, Random rand, int x, int y, int z)
	{
		int l = x;

		for (int i1 = z; y < this.maxHeight; ++y)
		{
			if (world.isAirBlock(x, y, z))
			{
				for (int j1 = 2; j1 <= 5; ++j1)
				{
					if (this.theBlock.canPlaceBlockOnSide(world, x, y, z, j1))
					{
						world.setBlock(x, y, z, this.theBlock, 1 << Direction.facingToDirection[Facing.oppositeSide[j1]], 2);
						break;
					}
				}
			}
			else
			{
				x = l + rand.nextInt(4) - rand.nextInt(4);
				z = i1 + rand.nextInt(4) - rand.nextInt(4);
			}
		}

		return true;
	}
}
