package tragicneko.tragicmc.worldgen.schematic;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.tileentity.TileEntitySign;
import net.minecraft.world.World;
import tragicneko.tragicmc.TragicBlocks;
import tragicneko.tragicmc.TragicConfig;
import tragicneko.tragicmc.TragicItems;

public class SchematicCorruptedSpire extends Schematic {

	/**
	 * x = 1, y = 0, z = 2
	 */
	public static Block eroded = TragicBlocks.ErodedStone;
	/**
	 * Meta for spike is 14
	 */
	public static Block spike = TragicBlocks.DarkStone;
	public static Block bedrock = Blocks.bedrock;
	public static Block chest = TragicBlocks.SoulChest;
	public static Block cell = TragicBlocks.CelledBlock;
	public static Block lamp = TragicBlocks.CelledLamp;
	public static Block sign = Blocks.wall_sign;
	public static Block spawner = Blocks.mob_spawner;
	/**
	 * Meta for Aegar is 10, Wither is 0, Apis is 2, Skultar is 3, Empariah is 6, Time Controller is 7
	 */
	public static Block summon = TragicBlocks.SummonBlock;

	public SchematicCorruptedSpire() {
		super(128, 52, 36);
	}

	@Override
	public boolean generateStructure(int variant, World world, Random rand, int x, int y, int z) {
		/*
		for (int i = 1; i < 31; i++)
		{
			if (i == 1)
			{
				this.generateFirstFloor(world, rand, x, y, z);
				continue;
			}
			else if (i == 30)
			{
				this.generateTopFloor(world, rand, x, y, z);
				continue;
			}
			else if (i % 5 == 0)
			{
				this.generateBossFloor(world, rand, x, y, z, i);
				continue;
			}
			else
			{
				this.generateNormalFloor(world, rand, x, y, z, i);
			}
		} */
		//this won't be used until I add the schematic for each floor type, then I'll do testing to make sure it's generating correctly
		this.generateFirstFloor(world, rand, x, y, z);
		return true;
	}

	/**
	 * Generates the first floor, with a large 3x2 opening and plenty of lighting in the first room
	 * @param world
	 * @param rand
	 * @param x
	 * @param y
	 * @param z
	 */
	public void generateFirstFloor(World world, Random rand, int x, int y, int z)
	{
		//generates floor with entrance on ground floor
		//x - 15, z - 25 is bottom left corner of schematic
		//x + 19, z + 26 is top right corner

		//first layer
		//1st row
		world.setBlock(x - 15, y, z - 19, spike, 14, 2);
		world.setBlock(x - 15, y, z - 18, cell);
		world.setBlock(x - 15, y, z - 17, cell);
		world.setBlock(x - 15, y, z - 16, cell);
		world.setBlock(x - 15, y, z - 15, cell);
		world.setBlock(x - 15, y, z - 14, spike, 14, 2);

		world.setBlock(x - 15, y, z - 2, spike, 14, 2);
		world.setBlock(x - 15, y, z - 1, cell);
		world.setBlock(x - 15, y, z, cell);
		world.setBlock(x - 15, y, z + 1, cell);
		world.setBlock(x - 15, y, z + 2, cell);
		world.setBlock(x - 15, y, z + 3, spike, 14, 2);

		world.setBlock(x - 15, y, z + 15, spike, 14, 2);
		world.setBlock(x - 15, y, z + 16, cell);
		world.setBlock(x - 15, y, z + 17, cell);
		world.setBlock(x - 15, y, z + 18, cell);
		world.setBlock(x - 15, y, z + 19, cell);
		world.setBlock(x - 15, y, z + 20, spike, 14, 2);

		//2nd row
		world.setBlock(x - 14, y, z - 20, eroded, 1, 2);
		world.setBlock(x - 14, y, z - 19, bedrock);
		world.setBlock(x - 14, y, z - 18, bedrock);
		world.setBlock(x - 14, y, z - 17, bedrock);
		world.setBlock(x - 14, y, z - 16, bedrock);
		world.setBlock(x - 14, y, z - 15, bedrock);
		world.setBlock(x - 14, y, z - 14, bedrock);
		world.setBlock(x - 14, y, z - 13, eroded, 1, 2);

		world.setBlock(x - 14, y, z - 3, eroded, 1, 2);
		world.setBlock(x - 14, y, z - 2, bedrock);
		world.setBlock(x - 14, y, z - 1, bedrock);
		world.setBlock(x - 14, y, z, bedrock);
		world.setBlock(x - 14, y, z + 1, bedrock);
		world.setBlock(x - 14, y, z + 2, bedrock);
		world.setBlock(x - 14, y, z + 3, bedrock);
		world.setBlock(x - 14, y, z + 4, eroded, 1, 2);

		world.setBlock(x - 14, y, z + 14, eroded, 1, 2);
		world.setBlock(x - 14, y, z + 15, bedrock);
		world.setBlock(x - 14, y, z + 16, bedrock);
		world.setBlock(x - 14, y, z + 17, bedrock);
		world.setBlock(x - 14, y, z + 18, bedrock);
		world.setBlock(x - 14, y, z + 19, bedrock);
		world.setBlock(x - 14, y, z + 20, bedrock);
		world.setBlock(x - 14, y, z + 21, eroded, 1, 2);

		//3rd row
		world.setBlock(x - 13, y, z - 21, spike, 14, 2);
		world.setBlock(x - 13, y, z - 20, bedrock);
		world.setBlock(x - 13, y, z - 19, bedrock);
		world.setBlock(x - 13, y, z - 18, cell);
		world.setBlock(x - 13, y, z - 17, cell);
		world.setBlock(x - 13, y, z - 16, cell);
		world.setBlock(x - 13, y, z - 15, cell);
		world.setBlock(x - 13, y, z - 14, bedrock);
		world.setBlock(x - 13, y, z - 13, bedrock);
		world.setBlock(x - 13, y, z - 12, spike, 14, 2);

		world.setBlock(x - 13, y, z - 4, spike, 14, 2);
		world.setBlock(x - 13, y, z - 3, bedrock);
		world.setBlock(x - 13, y, z - 2, bedrock);
		world.setBlock(x - 13, y, z - 1, cell);
		world.setBlock(x - 13, y, z, cell);
		world.setBlock(x - 13, y, z + 1, cell);
		world.setBlock(x - 13, y, z + 2, cell);
		world.setBlock(x - 13, y, z + 3, bedrock);
		world.setBlock(x - 13, y, z + 4, bedrock);
		world.setBlock(x - 13, y, z + 5, spike, 14, 2);

		world.setBlock(x - 13, y, z + 13, spike, 14, 2);
		world.setBlock(x - 13, y, z + 14, bedrock);
		world.setBlock(x - 13, y, z + 15, bedrock);
		world.setBlock(x - 13, y, z + 16, cell);
		world.setBlock(x - 13, y, z + 17, cell);
		world.setBlock(x - 13, y, z + 18, cell);
		world.setBlock(x - 13, y, z + 19, cell);
		world.setBlock(x - 13, y, z + 20, bedrock);
		world.setBlock(x - 13, y, z + 21, bedrock);
		world.setBlock(x - 13, y, z + 22, spike, 14, 2);

		//4th row
		world.setBlock(x - 12, y, z - 22, eroded, 1, 2);
		world.setBlock(x - 12, y, z - 21, bedrock);
		world.setBlock(x - 12, y, z - 20, bedrock);
		world.setBlock(x - 12, y, z - 19, spike, 14, 2);
		world.setBlock(x - 12, y, z - 18, eroded, 1, 2);
		world.setBlock(x - 12, y, z - 17, eroded, 1, 2);
		world.setBlock(x - 12, y, z - 16, eroded, 1, 2);
		world.setBlock(x - 12, y, z - 15, eroded, 1, 2);
		world.setBlock(x - 12, y, z - 14, spike, 14, 2);
		world.setBlock(x - 12, y, z - 13, bedrock);
		world.setBlock(x - 12, y, z - 12, bedrock);
		world.setBlock(x - 12, y, z - 11, eroded, 1, 2);

		world.setBlock(x - 12, y, z - 5, eroded, 1, 2);
		world.setBlock(x - 12, y, z - 4, bedrock);
		world.setBlock(x - 12, y, z - 3, bedrock);
		world.setBlock(x - 12, y, z - 2, spike, 14, 2);
		world.setBlock(x - 12, y, z - 1, eroded, 1, 2);
		world.setBlock(x - 12, y, z, eroded, 1, 2);
		world.setBlock(x - 12, y, z + 1, eroded, 1, 2);
		world.setBlock(x - 12, y, z + 2, eroded, 1, 2);
		world.setBlock(x - 12, y, z + 3, spike, 14, 2);
		world.setBlock(x - 12, y, z + 4, bedrock);
		world.setBlock(x - 12, y, z + 5, bedrock);
		world.setBlock(x - 12, y, z + 6, eroded, 1, 2);

		world.setBlock(x - 12, y, z + 12, eroded, 1, 2);
		world.setBlock(x - 12, y, z + 13, bedrock);
		world.setBlock(x - 12, y, z + 14, bedrock);
		world.setBlock(x - 12, y, z + 15, spike, 14, 2);
		world.setBlock(x - 12, y, z + 16, eroded, 1, 2);
		world.setBlock(x - 12, y, z + 17, eroded, 1, 2);
		world.setBlock(x - 12, y, z + 18, eroded, 1, 2);
		world.setBlock(x - 12, y, z + 19, eroded, 1, 2);
		world.setBlock(x - 12, y, z + 20, spike, 14, 2);
		world.setBlock(x - 12, y, z + 21, bedrock);
		world.setBlock(x - 12, y, z + 22, bedrock);
		world.setBlock(x - 12, y, z + 23, eroded, 1, 2);

		//5th row
		world.setBlock(x - 11, y, z - 23, spike, 14, 2);
		world.setBlock(x - 11, y, z - 22, bedrock);
		world.setBlock(x - 11, y, z - 21, bedrock);
		world.setBlock(x - 11, y, z - 20, spike, 14, 2);
		world.setBlock(x - 11, y, z - 19, eroded, 1, 2);
		world.setBlock(x - 11, y, z - 18, eroded);
		world.setBlock(x - 11, y, z - 17, eroded);
		world.setBlock(x - 11, y, z - 16, eroded);
		world.setBlock(x - 11, y, z - 15, eroded);
		world.setBlock(x - 11, y, z - 14, eroded, 1, 2);
		world.setBlock(x - 11, y, z - 13, spike, 14, 2);
		world.setBlock(x - 11, y, z - 12, bedrock);
		world.setBlock(x - 11, y, z - 11, bedrock);
		world.setBlock(x - 11, y, z - 10, spike, 14, 2);

		world.setBlock(x - 11, y, z - 6, spike, 14, 2);
		world.setBlock(x - 11, y, z - 5, bedrock);
		world.setBlock(x - 11, y, z - 4, bedrock);
		world.setBlock(x - 11, y, z - 3, spike, 14, 2);
		world.setBlock(x - 11, y, z - 2, eroded, 1, 2);
		world.setBlock(x - 11, y, z - 1, eroded);
		world.setBlock(x - 11, y, z, eroded);
		world.setBlock(x - 11, y, z + 1, eroded);
		world.setBlock(x - 11, y, z + 2, eroded);
		world.setBlock(x - 11, y, z + 3, eroded, 1, 2);
		world.setBlock(x - 11, y, z + 4, spike, 14, 2);
		world.setBlock(x - 11, y, z + 5, bedrock);
		world.setBlock(x - 11, y, z + 6, bedrock);
		world.setBlock(x - 11, y, z + 7, spike, 14, 2);

		world.setBlock(x - 11, y, z + 11, spike, 14, 2);
		world.setBlock(x - 11, y, z + 12, bedrock);
		world.setBlock(x - 11, y, z + 13, bedrock);
		world.setBlock(x - 11, y, z + 14, spike, 14, 2);
		world.setBlock(x - 11, y, z + 15, eroded, 1, 2);
		world.setBlock(x - 11, y, z + 16, eroded);
		world.setBlock(x - 11, y, z + 17, eroded);
		world.setBlock(x - 11, y, z + 18, eroded);
		world.setBlock(x - 11, y, z + 19, eroded);
		world.setBlock(x - 11, y, z + 20, eroded, 1, 2);
		world.setBlock(x - 11, y, z + 21, spike, 14, 2);
		world.setBlock(x - 11, y, z + 22, bedrock);
		world.setBlock(x - 11, y, z + 23, bedrock);
		world.setBlock(x - 11, y, z + 24, spike, 14, 2);

		//6th row
		world.setBlock(x - 10, y, z - 24, eroded, 1, 2);
		world.setBlock(x - 10, y, z - 23, bedrock);
		world.setBlock(x - 10, y, z - 22, bedrock);
		world.setBlock(x - 10, y, z - 21, spike, 14, 2);
		world.setBlock(x - 10, y, z - 20, eroded, 1, 2);
		world.setBlock(x - 10, y, z - 19, eroded);
		world.setBlock(x - 10, y, z - 18, eroded);
		world.setBlock(x - 10, y, z - 17, eroded);
		world.setBlock(x - 10, y, z - 16, eroded);
		world.setBlock(x - 10, y, z - 15, eroded);
		world.setBlock(x - 10, y, z - 14, eroded);
		world.setBlock(x - 10, y, z - 13, eroded, 1, 2);
		world.setBlock(x - 10, y, z - 12, spike, 14, 2);
		world.setBlock(x - 10, y, z - 11, bedrock);
		world.setBlock(x - 10, y, z - 10, bedrock);
		world.setBlock(x - 10, y, z - 9, eroded, 1, 2);
		world.setBlock(x - 10, y, z - 8, spike, 14, 2);
		world.setBlock(x - 10, y, z - 7, eroded, 1, 2);
		world.setBlock(x - 10, y, z - 6, bedrock);
		world.setBlock(x - 10, y, z - 5, bedrock);
		world.setBlock(x - 10, y, z - 4, spike, 14, 2);
		world.setBlock(x - 10, y, z - 3, eroded, 1, 2);
		world.setBlock(x - 10, y, z - 2, eroded);
		world.setBlock(x - 10, y, z - 1, eroded);
		world.setBlock(x - 10, y, z, eroded);
		world.setBlock(x - 10, y, z + 1, eroded);
		world.setBlock(x - 10, y, z + 2, eroded);
		world.setBlock(x - 10, y, z + 3, eroded);
		world.setBlock(x - 10, y, z + 4, eroded, 1, 2);
		world.setBlock(x - 10, y, z + 5, spike, 14, 2);
		world.setBlock(x - 10, y, z + 6, bedrock);
		world.setBlock(x - 10, y, z + 7, bedrock);
		world.setBlock(x - 10, y, z + 8, eroded, 1, 2);
		world.setBlock(x - 10, y, z + 9, spike, 14, 2);
		world.setBlock(x - 10, y, z + 10, eroded, 1, 2);
		world.setBlock(x - 10, y, z + 11, bedrock);
		world.setBlock(x - 10, y, z + 12, bedrock);
		world.setBlock(x - 10, y, z + 13, spike, 14, 2);
		world.setBlock(x - 10, y, z + 14, eroded, 1, 2);
		world.setBlock(x - 10, y, z + 15, eroded);
		world.setBlock(x - 10, y, z + 16, eroded);
		world.setBlock(x - 10, y, z + 17, eroded);
		world.setBlock(x - 10, y, z + 18, eroded);
		world.setBlock(x - 10, y, z + 19, eroded);
		world.setBlock(x - 10, y, z + 20, eroded);
		world.setBlock(x - 10, y, z + 21, eroded, 1, 2);
		world.setBlock(x - 10, y, z + 22, spike, 14, 2);
		world.setBlock(x - 10, y, z + 23, bedrock);
		world.setBlock(x - 10, y, z + 24, bedrock);
		world.setBlock(x - 10, y, z + 25, eroded, 1, 2);

		//7th row
		world.setBlock(x - 9, y, z - 25, spike, 14, 2);
		world.setBlock(x - 9, y, z - 24, bedrock);
		world.setBlock(x - 9, y, z - 23, bedrock);
		world.setBlock(x - 9, y, z - 22, spike, 14, 2);
		world.setBlock(x - 9, y, z - 21, eroded, 1, 2);
		world.setBlock(x - 9, y, z - 20, eroded);
		world.setBlock(x - 9, y, z - 19, eroded);
		world.setBlock(x - 9, y, z - 18, eroded);
		world.setBlock(x - 9, y, z - 17, eroded, 1, 2);
		world.setBlock(x - 9, y, z - 16, eroded, 1, 2);
		world.setBlock(x - 9, y, z - 15, eroded);
		world.setBlock(x - 9, y, z - 14, eroded);
		world.setBlock(x - 9, y, z - 13, eroded);
		world.setBlock(x - 9, y, z - 12, eroded, 1, 2);
		world.setBlock(x - 9, y, z - 11, spike, 14, 2);
		world.setBlock(x - 9, y, z - 10, bedrock);
		world.setBlock(x - 9, y, z - 9, bedrock);
		world.setBlock(x - 9, y, z - 8, bedrock);
		world.setBlock(x - 9, y, z - 7, bedrock);
		world.setBlock(x - 9, y, z - 6, bedrock);
		world.setBlock(x - 9, y, z - 5, spike, 14, 2);
		world.setBlock(x - 9, y, z - 4, eroded, 1, 2);
		world.setBlock(x - 9, y, z - 3, eroded);
		world.setBlock(x - 9, y, z - 2, eroded);
		world.setBlock(x - 9, y, z - 1, eroded);
		world.setBlock(x - 9, y, z, eroded, 1, 2);
		world.setBlock(x - 9, y, z + 1, eroded, 1, 2);
		world.setBlock(x - 9, y, z + 2, eroded);
		world.setBlock(x - 9, y, z + 3, eroded);
		world.setBlock(x - 9, y, z + 4, eroded);
		world.setBlock(x - 9, y, z + 5, eroded, 1, 2);
		world.setBlock(x - 9, y, z + 6, spike, 14, 2);
		world.setBlock(x - 9, y, z + 7, bedrock);
		world.setBlock(x - 9, y, z + 8, bedrock);
		world.setBlock(x - 9, y, z + 9, bedrock);
		world.setBlock(x - 9, y, z + 10, bedrock);
		world.setBlock(x - 9, y, z + 11, bedrock);
		world.setBlock(x - 9, y, z + 12, spike, 14, 2);
		world.setBlock(x - 9, y, z + 13, eroded, 1, 2);
		world.setBlock(x - 9, y, z + 14, eroded);
		world.setBlock(x - 9, y, z + 15, eroded);
		world.setBlock(x - 9, y, z + 16, eroded);
		world.setBlock(x - 9, y, z + 17, eroded, 1, 2);
		world.setBlock(x - 9, y, z + 18, eroded, 1, 2);
		world.setBlock(x - 9, y, z + 19, eroded);
		world.setBlock(x - 9, y, z + 20, eroded);
		world.setBlock(x - 9, y, z + 21, eroded);
		world.setBlock(x - 9, y, z + 22, eroded, 1, 2);
		world.setBlock(x - 9, y, z + 23, spike, 14, 2);
		world.setBlock(x - 9, y, z + 24, bedrock);
		world.setBlock(x - 9, y, z + 25, bedrock);
		world.setBlock(x - 9, y, z + 26, spike, 14, 2);

		//8th row
		world.setBlock(x - 8, y, z - 25, cell);
		world.setBlock(x - 8, y, z - 24, bedrock);
		world.setBlock(x - 8, y, z - 23, cell);
		world.setBlock(x - 8, y, z - 22, eroded, 1, 2);
		world.setBlock(x - 8, y, z - 21, eroded);
		world.setBlock(x - 8, y, z - 20, eroded);
		world.setBlock(x - 8, y, z - 19, eroded);
		world.setBlock(x - 8, y, z - 18, eroded, 1, 2);
		world.setBlock(x - 8, y, z - 17, eroded, 2, 2);
		world.setBlock(x - 8, y, z - 16, eroded, 2, 2);
		world.setBlock(x - 8, y, z - 15, eroded, 1, 2);
		world.setBlock(x - 8, y, z - 14, eroded);
		world.setBlock(x - 8, y, z - 13, eroded);
		world.setBlock(x - 8, y, z - 12, eroded);
		world.setBlock(x - 8, y, z - 11, eroded, 1, 2);
		world.setBlock(x - 8, y, z - 10, cell);
		world.setBlock(x - 8, y, z - 9, bedrock);
		world.setBlock(x - 8, y, z - 8, cell);
		world.setBlock(x - 8, y, z - 7, bedrock);
		world.setBlock(x - 8, y, z - 6, cell);
		world.setBlock(x - 8, y, z - 5, eroded, 1, 2);
		world.setBlock(x - 8, y, z - 4, eroded);
		world.setBlock(x - 8, y, z - 3, eroded);
		world.setBlock(x - 8, y, z - 2, eroded);
		world.setBlock(x - 8, y, z - 1, eroded, 1, 2);
		world.setBlock(x - 8, y, z, eroded, 2, 2);
		world.setBlock(x - 8, y, z + 1, eroded, 2, 2);
		world.setBlock(x - 8, y, z + 2, eroded, 1, 2);
		world.setBlock(x - 8, y, z + 3, eroded);
		world.setBlock(x - 8, y, z + 4, eroded);
		world.setBlock(x - 8, y, z + 5, eroded);
		world.setBlock(x - 8, y, z + 6, eroded, 1, 2);
		world.setBlock(x - 8, y, z + 7, cell);
		world.setBlock(x - 8, y, z + 8, bedrock);
		world.setBlock(x - 8, y, z + 9, cell);
		world.setBlock(x - 8, y, z + 10, bedrock);
		world.setBlock(x - 8, y, z + 11, cell);
		world.setBlock(x - 8, y, z + 12, eroded, 1, 2);
		world.setBlock(x - 8, y, z + 13, eroded);
		world.setBlock(x - 8, y, z + 14, eroded);
		world.setBlock(x - 8, y, z + 15, eroded);
		world.setBlock(x - 8, y, z + 16, eroded, 1, 2);
		world.setBlock(x - 8, y, z + 17, eroded, 2, 2);
		world.setBlock(x - 8, y, z + 18, eroded, 2, 2);
		world.setBlock(x - 8, y, z + 19, eroded, 1, 2);
		world.setBlock(x - 8, y, z + 20, eroded);
		world.setBlock(x - 8, y, z + 21, eroded);
		world.setBlock(x - 8, y, z + 22, eroded);
		world.setBlock(x - 8, y, z + 23, eroded, 1, 2);
		world.setBlock(x - 8, y, z + 24, cell);
		world.setBlock(x - 8, y, z + 25, bedrock);
		world.setBlock(x - 8, y, z + 26, cell);

		//9th row
		world.setBlock(x - 7, y, z - 25, cell);
		world.setBlock(x - 7, y, z - 24, bedrock);
		world.setBlock(x - 7, y, z - 23, cell);
		world.setBlock(x - 7, y, z - 22, eroded, 1, 2);
		world.setBlock(x - 7, y, z - 21, eroded);
		world.setBlock(x - 7, y, z - 20, eroded);
		world.setBlock(x - 7, y, z - 19, eroded, 1, 2);
		world.setBlock(x - 7, y, z - 18, eroded, 2, 2);
		world.setBlock(x - 7, y, z - 17, eroded, 2, 2);
		world.setBlock(x - 7, y, z - 16, eroded, 2, 2);
		world.setBlock(x - 7, y, z - 15, eroded, 2, 2);
		world.setBlock(x - 7, y, z - 14, eroded, 1, 2);
		world.setBlock(x - 7, y, z - 13, eroded);
		world.setBlock(x - 7, y, z - 12, eroded);
		world.setBlock(x - 7, y, z - 11, eroded, 1, 2);
		world.setBlock(x - 7, y, z - 10, cell);
		world.setBlock(x - 7, y, z - 9, bedrock);
		world.setBlock(x - 7, y, z - 8, cell);
		world.setBlock(x - 7, y, z - 7, bedrock);
		world.setBlock(x - 7, y, z - 6, cell);
		world.setBlock(x - 7, y, z - 5, eroded, 1, 2);
		world.setBlock(x - 7, y, z - 4, eroded);
		world.setBlock(x - 7, y, z - 3, eroded);
		world.setBlock(x - 7, y, z - 2, eroded, 1, 2);
		world.setBlock(x - 7, y, z - 1, eroded, 2, 2);
		world.setBlock(x - 7, y, z, eroded, 2, 2);
		world.setBlock(x - 7, y, z + 1, eroded, 2, 2);
		world.setBlock(x - 7, y, z + 2, eroded, 2, 2);
		world.setBlock(x - 7, y, z + 3, eroded, 1, 2);
		world.setBlock(x - 7, y, z + 4, eroded);
		world.setBlock(x - 7, y, z + 5, eroded);
		world.setBlock(x - 7, y, z + 6, eroded, 1, 2);
		world.setBlock(x - 7, y, z + 7, cell);
		world.setBlock(x - 7, y, z + 8, bedrock);
		world.setBlock(x - 7, y, z + 9, cell);
		world.setBlock(x - 7, y, z + 10, bedrock);
		world.setBlock(x - 7, y, z + 11, cell);
		world.setBlock(x - 7, y, z + 12, eroded, 1, 2);
		world.setBlock(x - 7, y, z + 13, eroded);
		world.setBlock(x - 7, y, z + 14, eroded);
		world.setBlock(x - 7, y, z + 15, eroded, 1, 2);
		world.setBlock(x - 7, y, z + 16, eroded, 2, 2);
		world.setBlock(x - 7, y, z + 17, eroded, 2, 2);
		world.setBlock(x - 7, y, z + 18, eroded, 2, 2);
		world.setBlock(x - 7, y, z + 19, eroded, 2, 2);
		world.setBlock(x - 7, y, z + 20, eroded, 1, 2);
		world.setBlock(x - 7, y, z + 21, eroded);
		world.setBlock(x - 7, y, z + 22, eroded);
		world.setBlock(x - 7, y, z + 23, eroded, 1, 2);
		world.setBlock(x - 7, y, z + 24, cell);
		world.setBlock(x - 7, y, z + 25, bedrock);
		world.setBlock(x - 7, y, z + 26, cell);

		//10th row
		world.setBlock(x - 6, y, z - 25, cell);
		world.setBlock(x - 6, y, z - 24, bedrock);
		world.setBlock(x - 6, y, z - 23, cell);
		world.setBlock(x - 6, y, z - 22, eroded, 1, 2);
		world.setBlock(x - 6, y, z - 21, eroded);
		world.setBlock(x - 6, y, z - 20, eroded);
		world.setBlock(x - 6, y, z - 19, eroded, 1, 2);
		world.setBlock(x - 6, y, z - 18, eroded, 2, 2);
		world.setBlock(x - 6, y, z - 17, eroded, 2, 2);
		world.setBlock(x - 6, y, z - 16, eroded, 2, 2);
		world.setBlock(x - 6, y, z - 15, eroded, 2, 2);
		world.setBlock(x - 6, y, z - 14, eroded, 1, 2);
		world.setBlock(x - 6, y, z - 13, eroded);
		world.setBlock(x - 6, y, z - 12, eroded);
		world.setBlock(x - 6, y, z - 11, eroded, 1, 2);
		world.setBlock(x - 6, y, z - 10, cell);
		world.setBlock(x - 6, y, z - 9, bedrock);
		world.setBlock(x - 6, y, z - 8, cell);
		world.setBlock(x - 6, y, z - 7, bedrock);
		world.setBlock(x - 6, y, z - 6, cell);
		world.setBlock(x - 6, y, z - 5, eroded, 1, 2);
		world.setBlock(x - 6, y, z - 4, eroded);
		world.setBlock(x - 6, y, z - 3, eroded);
		world.setBlock(x - 6, y, z - 2, eroded, 1, 2);
		world.setBlock(x - 6, y, z - 1, eroded, 2, 2);
		world.setBlock(x - 6, y, z, eroded, 2, 2);
		world.setBlock(x - 6, y, z + 1, eroded, 2, 2);
		world.setBlock(x - 6, y, z + 2, eroded, 2, 2);
		world.setBlock(x - 6, y, z + 3, eroded, 1, 2);
		world.setBlock(x - 6, y, z + 4, eroded);
		world.setBlock(x - 6, y, z + 5, eroded);
		world.setBlock(x - 6, y, z + 6, eroded, 1, 2);
		world.setBlock(x - 6, y, z + 7, cell);
		world.setBlock(x - 6, y, z + 8, bedrock);
		world.setBlock(x - 6, y, z + 9, cell);
		world.setBlock(x - 6, y, z + 10, bedrock);
		world.setBlock(x - 6, y, z + 11, cell);
		world.setBlock(x - 6, y, z + 12, eroded, 1, 2);
		world.setBlock(x - 6, y, z + 13, eroded);
		world.setBlock(x - 6, y, z + 14, eroded);
		world.setBlock(x - 6, y, z + 15, eroded, 1, 2);
		world.setBlock(x - 6, y, z + 16, eroded, 2, 2);
		world.setBlock(x - 6, y, z + 17, eroded, 2, 2);
		world.setBlock(x - 6, y, z + 18, eroded, 2, 2);
		world.setBlock(x - 6, y, z + 19, eroded, 2, 2);
		world.setBlock(x - 6, y, z + 20, eroded, 1, 2);
		world.setBlock(x - 6, y, z + 21, eroded);
		world.setBlock(x - 6, y, z + 22, eroded);
		world.setBlock(x - 6, y, z + 23, eroded, 1, 2);
		world.setBlock(x - 6, y, z + 24, cell);
		world.setBlock(x - 6, y, z + 25, bedrock);
		world.setBlock(x - 6, y, z + 26, cell);

		//11th row
		world.setBlock(x - 5, y, z - 25, cell);
		world.setBlock(x - 5, y, z - 24, bedrock);
		world.setBlock(x - 5, y, z - 23, cell);
		world.setBlock(x - 5, y, z - 22, eroded, 1, 2);
		world.setBlock(x - 5, y, z - 21, eroded);
		world.setBlock(x - 5, y, z - 20, eroded);
		world.setBlock(x - 5, y, z - 19, eroded);
		world.setBlock(x - 5, y, z - 18, eroded, 1, 2);
		world.setBlock(x - 5, y, z - 17, eroded, 2, 2);
		world.setBlock(x - 5, y, z - 16, eroded, 2, 2);
		world.setBlock(x - 5, y, z - 15, eroded, 1, 2);
		world.setBlock(x - 5, y, z - 14, eroded);
		world.setBlock(x - 5, y, z - 13, eroded);
		world.setBlock(x - 5, y, z - 12, eroded);
		world.setBlock(x - 5, y, z - 11, eroded, 1, 2);
		world.setBlock(x - 5, y, z - 10, cell);
		world.setBlock(x - 5, y, z - 9, bedrock);
		world.setBlock(x - 5, y, z - 8, cell);
		world.setBlock(x - 5, y, z - 7, bedrock);
		world.setBlock(x - 5, y, z - 6, cell);
		world.setBlock(x - 5, y, z - 5, eroded, 1, 2);
		world.setBlock(x - 5, y, z - 4, eroded);
		world.setBlock(x - 5, y, z - 3, eroded);
		world.setBlock(x - 5, y, z - 2, eroded);
		world.setBlock(x - 5, y, z - 1, eroded, 1, 2);
		world.setBlock(x - 5, y, z, eroded, 2, 2);
		world.setBlock(x - 5, y, z + 1, eroded, 2, 2);
		world.setBlock(x - 5, y, z + 2, eroded, 1, 2);
		world.setBlock(x - 5, y, z + 3, eroded);
		world.setBlock(x - 5, y, z + 4, eroded);
		world.setBlock(x - 5, y, z + 5, eroded);
		world.setBlock(x - 5, y, z + 6, eroded, 1, 2);
		world.setBlock(x - 5, y, z + 7, cell);
		world.setBlock(x - 5, y, z + 8, bedrock);
		world.setBlock(x - 5, y, z + 9, cell);
		world.setBlock(x - 5, y, z + 10, bedrock);
		world.setBlock(x - 5, y, z + 11, cell);
		world.setBlock(x - 5, y, z + 12, eroded, 1, 2);
		world.setBlock(x - 5, y, z + 13, eroded);
		world.setBlock(x - 5, y, z + 14, eroded);
		world.setBlock(x - 5, y, z + 15, eroded);
		world.setBlock(x - 5, y, z + 16, eroded, 1, 2);
		world.setBlock(x - 5, y, z + 17, eroded, 2, 2);
		world.setBlock(x - 5, y, z + 18, eroded, 2, 2);
		world.setBlock(x - 5, y, z + 19, eroded, 1, 2);
		world.setBlock(x - 5, y, z + 20, eroded);
		world.setBlock(x - 5, y, z + 21, eroded);
		world.setBlock(x - 5, y, z + 22, eroded);
		world.setBlock(x - 5, y, z + 23, eroded, 1, 2);
		world.setBlock(x - 5, y, z + 24, cell);
		world.setBlock(x - 5, y, z + 25, bedrock);
		world.setBlock(x - 5, y, z + 26, cell);

		//12th row
		world.setBlock(x - 4, y, z - 25, spike, 14, 2);
		world.setBlock(x - 4, y, z - 24, bedrock);
		world.setBlock(x - 4, y, z - 23, bedrock);
		world.setBlock(x - 4, y, z - 22, spike, 14, 2);
		world.setBlock(x - 4, y, z - 21, eroded, 1, 2);
		world.setBlock(x - 4, y, z - 20, eroded);
		world.setBlock(x - 4, y, z - 19, eroded);
		world.setBlock(x - 4, y, z - 18, eroded);
		world.setBlock(x - 4, y, z - 17, eroded, 1, 2);
		world.setBlock(x - 4, y, z - 16, eroded, 1, 2);
		world.setBlock(x - 4, y, z - 15, eroded);
		world.setBlock(x - 4, y, z - 14, eroded);
		world.setBlock(x - 4, y, z - 13, eroded);
		world.setBlock(x - 4, y, z - 12, eroded, 1, 2);
		world.setBlock(x - 4, y, z - 11, spike, 14, 2);
		world.setBlock(x - 4, y, z - 10, bedrock);
		world.setBlock(x - 4, y, z - 9, bedrock);
		world.setBlock(x - 4, y, z - 8, bedrock);
		world.setBlock(x - 4, y, z - 7, bedrock);
		world.setBlock(x - 4, y, z - 6, bedrock);
		world.setBlock(x - 4, y, z - 5, spike, 14, 2);
		world.setBlock(x - 4, y, z - 4, eroded, 1, 2);
		world.setBlock(x - 4, y, z - 3, eroded);
		world.setBlock(x - 4, y, z - 2, eroded);
		world.setBlock(x - 4, y, z - 1, eroded);
		world.setBlock(x - 4, y, z, eroded, 1, 2);
		world.setBlock(x - 4, y, z + 1, eroded, 1, 2);
		world.setBlock(x - 4, y, z + 2, eroded);
		world.setBlock(x - 4, y, z + 3, eroded);
		world.setBlock(x - 4, y, z + 4, eroded);
		world.setBlock(x - 4, y, z + 5, eroded, 1, 2);
		world.setBlock(x - 4, y, z + 6, spike, 14, 2);
		world.setBlock(x - 4, y, z + 7, bedrock);
		world.setBlock(x - 4, y, z + 8, bedrock);
		world.setBlock(x - 4, y, z + 9, bedrock);
		world.setBlock(x - 4, y, z + 10, bedrock);
		world.setBlock(x - 4, y, z + 11, bedrock);
		world.setBlock(x - 4, y, z + 12, spike, 14, 2);
		world.setBlock(x - 4, y, z + 13, eroded, 1, 2);
		world.setBlock(x - 4, y, z + 14, eroded);
		world.setBlock(x - 4, y, z + 15, eroded);
		world.setBlock(x - 4, y, z + 16, eroded);
		world.setBlock(x - 4, y, z + 17, eroded, 1, 2);
		world.setBlock(x - 4, y, z + 18, eroded, 1, 2);
		world.setBlock(x - 4, y, z + 19, eroded);
		world.setBlock(x - 4, y, z + 20, eroded);
		world.setBlock(x - 4, y, z + 21, eroded);
		world.setBlock(x - 4, y, z + 22, eroded, 1, 2);
		world.setBlock(x - 4, y, z + 23, spike, 14, 2);
		world.setBlock(x - 4, y, z + 24, bedrock);
		world.setBlock(x - 4, y, z + 25, bedrock);
		world.setBlock(x - 4, y, z + 26, spike, 14, 2);

		//13th row
		world.setBlock(x - 3, y, z - 24, eroded, 1, 2);
		world.setBlock(x - 3, y, z - 23, bedrock);
		world.setBlock(x - 3, y, z - 22, bedrock);
		world.setBlock(x - 3, y, z - 21, spike, 14, 2);
		world.setBlock(x - 3, y, z - 20, eroded, 1, 2);
		world.setBlock(x - 3, y, z - 19, eroded);
		world.setBlock(x - 3, y, z - 18, eroded);
		world.setBlock(x - 3, y, z - 17, eroded);
		world.setBlock(x - 3, y, z - 16, eroded);
		world.setBlock(x - 3, y, z - 15, eroded);
		world.setBlock(x - 3, y, z - 14, eroded);
		world.setBlock(x - 3, y, z - 13, eroded, 1, 2);
		world.setBlock(x - 3, y, z - 12, spike, 14, 2);
		world.setBlock(x - 3, y, z - 11, bedrock);
		world.setBlock(x - 3, y, z - 10, bedrock);
		world.setBlock(x - 3, y, z - 9, eroded, 1, 2);
		world.setBlock(x - 3, y, z - 8, spike, 14, 2);
		world.setBlock(x - 3, y, z - 7, eroded, 1, 2);
		world.setBlock(x - 3, y, z - 6, bedrock);
		world.setBlock(x - 3, y, z - 5, bedrock);
		world.setBlock(x - 3, y, z - 4, spike, 14, 2);
		world.setBlock(x - 3, y, z - 3, eroded, 1, 2);
		world.setBlock(x - 3, y, z - 2, eroded);
		world.setBlock(x - 3, y, z - 1, eroded);
		world.setBlock(x - 3, y, z, eroded);
		world.setBlock(x - 3, y, z + 1, eroded);
		world.setBlock(x - 3, y, z + 2, eroded);
		world.setBlock(x - 3, y, z + 3, eroded);
		world.setBlock(x - 3, y, z + 4, eroded, 1, 2);
		world.setBlock(x - 3, y, z + 5, spike, 14, 2);
		world.setBlock(x - 3, y, z + 6, bedrock);
		world.setBlock(x - 3, y, z + 7, bedrock);
		world.setBlock(x - 3, y, z + 8, eroded, 1, 2);
		world.setBlock(x - 3, y, z + 9, spike, 14, 2);
		world.setBlock(x - 3, y, z + 10, eroded, 1, 2);
		world.setBlock(x - 3, y, z + 11, bedrock);
		world.setBlock(x - 3, y, z + 12, bedrock);
		world.setBlock(x - 3, y, z + 13, spike, 14, 2);
		world.setBlock(x - 3, y, z + 14, eroded, 1, 2);
		world.setBlock(x - 3, y, z + 15, eroded);
		world.setBlock(x - 3, y, z + 16, eroded);
		world.setBlock(x - 3, y, z + 17, eroded);
		world.setBlock(x - 3, y, z + 18, eroded);
		world.setBlock(x - 3, y, z + 19, eroded);
		world.setBlock(x - 3, y, z + 20, eroded);
		world.setBlock(x - 3, y, z + 21, eroded, 1, 2);
		world.setBlock(x - 3, y, z + 22, spike, 14, 2);
		world.setBlock(x - 3, y, z + 23, bedrock);
		world.setBlock(x - 3, y, z + 24, bedrock);
		world.setBlock(x - 3, y, z + 25, eroded, 1, 2);

		//14th row
		world.setBlock(x - 2, y, z - 23, spike, 14, 2);
		world.setBlock(x - 2, y, z - 22, bedrock);
		world.setBlock(x - 2, y, z - 21, bedrock);
		world.setBlock(x - 2, y, z - 20, spike, 14, 2);
		world.setBlock(x - 2, y, z - 19, eroded, 1, 2);
		world.setBlock(x - 2, y, z - 18, eroded);
		world.setBlock(x - 2, y, z - 17, eroded);
		world.setBlock(x - 2, y, z - 16, eroded);
		world.setBlock(x - 2, y, z - 15, eroded);
		world.setBlock(x - 2, y, z - 14, eroded, 1, 2);
		world.setBlock(x - 2, y, z - 13, spike, 14, 2);
		world.setBlock(x - 2, y, z - 12, bedrock);
		world.setBlock(x - 2, y, z - 11, bedrock);
		world.setBlock(x - 2, y, z - 10, spike, 14, 2);
		world.setBlock(x - 2, y, z - 9, spike, 14, 2);
		world.setBlock(x - 2, y, z - 8, spike, 14, 2);
		world.setBlock(x - 2, y, z - 7, spike, 14, 2);
		world.setBlock(x - 2, y, z - 6, spike, 14, 2);
		world.setBlock(x - 2, y, z - 5, bedrock);
		world.setBlock(x - 2, y, z - 4, bedrock);
		world.setBlock(x - 2, y, z - 3, spike, 14, 2);
		world.setBlock(x - 2, y, z - 2, eroded, 1, 2);
		world.setBlock(x - 2, y, z - 1, eroded);
		world.setBlock(x - 2, y, z, eroded);
		world.setBlock(x - 2, y, z + 1, eroded);
		world.setBlock(x - 2, y, z + 2, eroded);
		world.setBlock(x - 2, y, z + 3, eroded, 1, 2);
		world.setBlock(x - 2, y, z + 4, spike, 14, 2);
		world.setBlock(x - 2, y, z + 5, bedrock);
		world.setBlock(x - 2, y, z + 6, bedrock);
		world.setBlock(x - 2, y, z + 7, spike, 14, 2);
		world.setBlock(x - 2, y, z + 8, spike, 14, 2);
		world.setBlock(x - 2, y, z + 9, spike, 14, 2);
		world.setBlock(x - 2, y, z + 10, spike, 14, 2);
		world.setBlock(x - 2, y, z + 11, spike, 14, 2);
		world.setBlock(x - 2, y, z + 12, bedrock);
		world.setBlock(x - 2, y, z + 13, bedrock);
		world.setBlock(x - 2, y, z + 14, spike, 14, 2);
		world.setBlock(x - 2, y, z + 15, eroded, 1, 2);
		world.setBlock(x - 2, y, z + 16, eroded);
		world.setBlock(x - 2, y, z + 17, eroded);
		world.setBlock(x - 2, y, z + 18, eroded);
		world.setBlock(x - 2, y, z + 19, eroded);
		world.setBlock(x - 2, y, z + 20, eroded, 1, 2);
		world.setBlock(x - 2, y, z + 21, spike, 14, 2);
		world.setBlock(x - 2, y, z + 22, bedrock);
		world.setBlock(x - 2, y, z + 23, bedrock);
		world.setBlock(x - 2, y, z + 24, spike, 14, 2);

		//15th row
		world.setBlock(x - 1, y, z - 22, eroded, 1, 2);
		world.setBlock(x - 1, y, z - 21, bedrock);
		world.setBlock(x - 1, y, z - 20, bedrock);
		world.setBlock(x - 1, y, z - 19, spike, 14, 2);
		world.setBlock(x - 1, y, z - 18, eroded, 1, 2);
		world.setBlock(x - 1, y, z - 17, eroded, 1, 2);
		world.setBlock(x - 1, y, z - 16, eroded, 1, 2);
		world.setBlock(x - 1, y, z - 15, eroded, 1, 2);
		world.setBlock(x - 1, y, z - 14, spike, 14, 2);
		world.setBlock(x - 1, y, z - 13, bedrock);
		world.setBlock(x - 1, y, z - 12, bedrock);
		world.setBlock(x - 1, y, z - 11, spike, 14, 2);
		world.setBlock(x - 1, y, z - 10, eroded, 2, 2);
		world.setBlock(x - 1, y, z - 9, spike, 14, 2);
		world.setBlock(x - 1, y, z - 8, spike, 14, 2);
		world.setBlock(x - 1, y, z - 7, spike, 14, 2);
		world.setBlock(x - 1, y, z - 6, spike, 14, 2);
		world.setBlock(x - 1, y, z - 5, eroded, 1, 2);
		world.setBlock(x - 1, y, z - 4, bedrock);
		world.setBlock(x - 1, y, z - 3, bedrock);
		world.setBlock(x - 1, y, z - 2, spike, 14, 2);
		world.setBlock(x - 1, y, z - 1, eroded, 1, 2);
		world.setBlock(x - 1, y, z, eroded, 1, 2);
		world.setBlock(x - 1, y, z + 1, eroded, 1, 2);
		world.setBlock(x - 1, y, z + 2, eroded, 1, 2);
		world.setBlock(x - 1, y, z + 3, spike, 14, 2);
		world.setBlock(x - 1, y, z + 4, bedrock);
		world.setBlock(x - 1, y, z + 5, bedrock);
		world.setBlock(x - 1, y, z + 6, eroded, 1, 2);
		world.setBlock(x - 1, y, z + 7, spike, 14, 2);
		world.setBlock(x - 1, y, z + 8, spike, 14, 2);
		world.setBlock(x - 1, y, z + 9, spike, 14, 2);
		world.setBlock(x - 1, y, z + 10, spike, 14, 2);
		world.setBlock(x - 1, y, z + 11, eroded, 2, 2);
		world.setBlock(x - 1, y, z + 12, spike, 14, 2);
		world.setBlock(x - 1, y, z + 13, bedrock);
		world.setBlock(x - 1, y, z + 14, bedrock);
		world.setBlock(x - 1, y, z + 15, spike, 14, 2);
		world.setBlock(x - 1, y, z + 16, eroded, 1, 2);
		world.setBlock(x - 1, y, z + 17, eroded, 1, 2);
		world.setBlock(x - 1, y, z + 18, eroded, 1, 2);
		world.setBlock(x - 1, y, z + 19, eroded, 1, 2);
		world.setBlock(x - 1, y, z + 20, spike, 14, 2);
		world.setBlock(x - 1, y, z + 21, bedrock);
		world.setBlock(x - 1, y, z + 22, bedrock);
		world.setBlock(x - 1, y, z + 23, eroded, 1, 2);

		//16th row
		world.setBlock(x, y, z - 21, spike, 14, 2);
		world.setBlock(x, y, z - 20, bedrock);
		world.setBlock(x, y, z - 19, bedrock);
		world.setBlock(x, y, z - 18, cell);
		world.setBlock(x, y, z - 17, cell);
		world.setBlock(x, y, z - 16, cell);
		world.setBlock(x, y, z - 15, cell);
		world.setBlock(x, y, z - 14, bedrock);
		world.setBlock(x, y, z - 13, bedrock);
		world.setBlock(x, y, z - 12, spike, 14, 2);

		world.setBlock(x, y, z - 11, eroded);
		world.setBlock(x, y, z - 10, eroded);
		world.setBlock(x, y, z - 9, eroded, 2, 2);
		world.setBlock(x, y, z - 8, eroded, 2, 2);
		world.setBlock(x, y, z - 7, spike, 14, 2);
		world.setBlock(x, y, z - 6, spike, 14, 2);
		world.setBlock(x, y, z - 5, spike, 14, 2);

		world.setBlock(x, y, z - 4, spike, 14, 2);
		world.setBlock(x, y, z - 3, bedrock);
		world.setBlock(x, y, z - 2, bedrock);
		world.setBlock(x, y, z - 1, cell);
		world.setBlock(x, y, z, cell);
		world.setBlock(x, y, z + 1, cell);
		world.setBlock(x, y, z + 2, cell);
		world.setBlock(x, y, z + 3, bedrock);
		world.setBlock(x, y, z + 4, bedrock);
		world.setBlock(x, y, z + 5, spike, 14, 2);

		world.setBlock(x, y, z + 6, spike, 14, 2);
		world.setBlock(x, y, z + 7, spike, 14, 2);
		world.setBlock(x, y, z + 8, spike, 14, 2);
		world.setBlock(x, y, z + 9, eroded, 2, 2);
		world.setBlock(x, y, z + 10, eroded, 2, 2);
		world.setBlock(x, y, z + 11, eroded);
		world.setBlock(x, y, z + 12, eroded);

		world.setBlock(x, y, z + 13, spike, 14, 2);
		world.setBlock(x, y, z + 14, bedrock);
		world.setBlock(x, y, z + 15, bedrock);
		world.setBlock(x, y, z + 16, cell);
		world.setBlock(x, y, z + 17, cell);
		world.setBlock(x, y, z + 18, cell);
		world.setBlock(x, y, z + 19, cell);
		world.setBlock(x, y, z + 20, bedrock);
		world.setBlock(x, y, z + 21, bedrock);
		world.setBlock(x, y, z + 22, spike, 14, 2);

		//17th row
		world.setBlock(x + 1, y, z - 20, eroded, 1, 2);
		world.setBlock(x + 1, y, z - 19, bedrock);
		world.setBlock(x + 1, y, z - 18, bedrock);
		world.setBlock(x + 1, y, z - 17, bedrock);
		world.setBlock(x + 1, y, z - 16, bedrock);
		world.setBlock(x + 1, y, z - 15, bedrock);
		world.setBlock(x + 1, y, z - 14, bedrock);
		world.setBlock(x + 1, y, z - 13, spike, 14, 2);
		world.setBlock(x + 1, y, z - 12, eroded, 2, 2);
		world.setBlock(x + 1, y, z - 11, eroded);
		world.setBlock(x + 1, y, z - 10, eroded);
		world.setBlock(x + 1, y, z - 9, eroded);
		world.setBlock(x + 1, y, z - 8, eroded);
		world.setBlock(x + 1, y, z - 7, eroded, 2, 2);
		world.setBlock(x + 1, y, z - 6, spike, 14, 2);
		world.setBlock(x + 1, y, z - 5, spike, 14, 2);
		world.setBlock(x + 1, y, z - 4, spike, 14, 2);
		world.setBlock(x + 1, y, z - 3, eroded, 1, 2);
		world.setBlock(x + 1, y, z - 2, bedrock);
		world.setBlock(x + 1, y, z - 1, bedrock);
		world.setBlock(x + 1, y, z, bedrock);
		world.setBlock(x + 1, y, z + 1, bedrock);
		world.setBlock(x + 1, y, z + 2, bedrock);
		world.setBlock(x + 1, y, z + 3, bedrock);
		world.setBlock(x + 1, y, z + 4, eroded, 1, 2);
		world.setBlock(x + 1, y, z + 5, spike, 14, 2);
		world.setBlock(x + 1, y, z + 6, spike, 14, 2);
		world.setBlock(x + 1, y, z + 7, spike, 14, 2);
		world.setBlock(x + 1, y, z + 8, eroded, 2, 2);
		world.setBlock(x + 1, y, z + 9, eroded);
		world.setBlock(x + 1, y, z + 10, eroded);
		world.setBlock(x + 1, y, z + 11, eroded);
		world.setBlock(x + 1, y, z + 12, eroded);
		world.setBlock(x + 1, y, z + 13, eroded, 2, 2);
		world.setBlock(x + 1, y, z + 14, spike, 14, 2);
		world.setBlock(x + 1, y, z + 15, bedrock);
		world.setBlock(x + 1, y, z + 16, bedrock);
		world.setBlock(x + 1, y, z + 17, bedrock);
		world.setBlock(x + 1, y, z + 18, bedrock);
		world.setBlock(x + 1, y, z + 19, bedrock);
		world.setBlock(x + 1, y, z + 20, bedrock);
		world.setBlock(x + 1, y, z + 21, eroded, 1, 2);

		//18th row
		world.setBlock(x + 2, y, z - 19, spike, 14, 2);
		world.setBlock(x + 2, y, z - 18, cell);
		world.setBlock(x + 2, y, z - 17, cell);
		world.setBlock(x + 2, y, z - 16, cell);
		world.setBlock(x + 2, y, z - 15, cell);
		world.setBlock(x + 2, y, z - 14, bedrock);
		world.setBlock(x + 2, y, z - 13, spike, 14, 2);
		world.setBlock(x + 2, y, z - 12, spike, 14, 2);
		world.setBlock(x + 2, y, z - 11, eroded, 2, 2);
		world.setBlock(x + 2, y, z - 10, eroded);
		world.setBlock(x + 2, y, z - 9, eroded);
		world.setBlock(x + 2, y, z - 8, eroded);
		world.setBlock(x + 2, y, z - 7, eroded);
		world.setBlock(x + 2, y, z - 6, eroded, 2, 2);
		world.setBlock(x + 2, y, z - 5, spike, 14, 2);
		world.setBlock(x + 2, y, z - 4, spike, 14, 2);
		world.setBlock(x + 2, y, z - 3, spike, 14, 2);
		world.setBlock(x + 2, y, z - 2, bedrock);
		world.setBlock(x + 2, y, z - 1, cell);
		world.setBlock(x + 2, y, z, cell);
		world.setBlock(x + 2, y, z + 1, cell);
		world.setBlock(x + 2, y, z + 2, cell);
		world.setBlock(x + 2, y, z + 3, bedrock);
		world.setBlock(x + 2, y, z + 4, spike, 14, 2);
		world.setBlock(x + 2, y, z + 5, spike, 14, 2);
		world.setBlock(x + 2, y, z + 6, spike, 14, 2);
		world.setBlock(x + 2, y, z + 7, eroded, 2, 2);
		world.setBlock(x + 2, y, z + 8, eroded);
		world.setBlock(x + 2, y, z + 9, eroded);
		world.setBlock(x + 2, y, z + 10, eroded);
		world.setBlock(x + 2, y, z + 11, eroded);
		world.setBlock(x + 2, y, z + 12, eroded, 2, 2);
		world.setBlock(x + 2, y, z + 13, spike, 14, 2);
		world.setBlock(x + 2, y, z + 14, spike, 14, 2);
		world.setBlock(x + 2, y, z + 15, bedrock);
		world.setBlock(x + 2, y, z + 16, cell);
		world.setBlock(x + 2, y, z + 17, cell);
		world.setBlock(x + 2, y, z + 18, cell);
		world.setBlock(x + 2, y, z + 19, cell);
		world.setBlock(x + 2, y, z + 20, spike, 14, 2);

		//19th row
		world.setBlock(x + 3, y, z - 15, eroded, 1, 2);
		world.setBlock(x + 3, y, z - 14, bedrock);
		world.setBlock(x + 3, y, z - 13, bedrock);
		world.setBlock(x + 3, y, z - 12, spike, 14, 2);
		world.setBlock(x + 3, y, z - 11, eroded, 2, 2);
		world.setBlock(x + 3, y, z - 10, eroded);
		world.setBlock(x + 3, y, z - 9, eroded);
		world.setBlock(x + 3, y, z - 8, eroded);
		world.setBlock(x + 3, y, z - 7, eroded);
		world.setBlock(x + 3, y, z - 6, eroded, 2, 2);
		world.setBlock(x + 3, y, z - 5, spike, 14, 2);
		world.setBlock(x + 3, y, z - 4, spike, 14, 2);
		world.setBlock(x + 3, y, z - 3, eroded, 1, 2);
		world.setBlock(x + 3, y, z - 2, bedrock);
		world.setBlock(x + 3, y, z - 1, bedrock);
		world.setBlock(x + 3, y, z, bedrock);
		world.setBlock(x + 3, y, z + 1, bedrock);
		world.setBlock(x + 3, y, z + 2, bedrock);
		world.setBlock(x + 3, y, z + 3, bedrock);
		world.setBlock(x + 3, y, z + 4, eroded, 1, 2);
		world.setBlock(x + 3, y, z + 5, spike, 14, 2);
		world.setBlock(x + 3, y, z + 6, spike, 14, 2);
		world.setBlock(x + 3, y, z + 7, eroded, 2, 2);
		world.setBlock(x + 3, y, z + 8, eroded);
		world.setBlock(x + 3, y, z + 9, eroded);
		world.setBlock(x + 3, y, z + 10, eroded);
		world.setBlock(x + 3, y, z + 11, eroded);
		world.setBlock(x + 3, y, z + 12, eroded, 2, 2);
		world.setBlock(x + 3, y, z + 13, spike, 14, 2);
		world.setBlock(x + 3, y, z + 14, bedrock);
		world.setBlock(x + 3, y, z + 15, bedrock);
		world.setBlock(x + 3, y, z + 16, eroded, 1, 2);

		//20th row
		world.setBlock(x + 4, y, z - 14, spike, 14, 2);
		world.setBlock(x + 4, y, z - 13, bedrock);
		world.setBlock(x + 4, y, z - 12, spike, 14, 2);
		world.setBlock(x + 4, y, z - 11, spike, 14, 2);
		world.setBlock(x + 4, y, z - 10, eroded, 2, 2);
		world.setBlock(x + 4, y, z - 9, eroded);
		world.setBlock(x + 4, y, z - 8, eroded);
		world.setBlock(x + 4, y, z - 7, eroded);
		world.setBlock(x + 4, y, z - 6, eroded);
		world.setBlock(x + 4, y, z - 5, eroded, 2, 2);
		world.setBlock(x + 4, y, z - 4, spike, 14, 2);
		world.setBlock(x + 4, y, z - 3, bedrock);
		world.setBlock(x + 4, y, z - 2, bedrock);
		world.setBlock(x + 4, y, z - 1, cell);
		world.setBlock(x + 4, y, z, cell);
		world.setBlock(x + 4, y, z + 1, cell);
		world.setBlock(x + 4, y, z + 2, cell);
		world.setBlock(x + 4, y, z + 3, bedrock);
		world.setBlock(x + 4, y, z + 4, bedrock);
		world.setBlock(x + 4, y, z + 5, spike, 14, 2);
		world.setBlock(x + 4, y, z + 6, eroded, 2, 2);
		world.setBlock(x + 4, y, z + 7, eroded);
		world.setBlock(x + 4, y, z + 8, eroded);
		world.setBlock(x + 4, y, z + 9, eroded);
		world.setBlock(x + 4, y, z + 10, eroded);
		world.setBlock(x + 4, y, z + 11, eroded, 2, 2);
		world.setBlock(x + 4, y, z + 12, spike, 14, 2);
		world.setBlock(x + 4, y, z + 13, spike, 14, 2);
		world.setBlock(x + 4, y, z + 14, bedrock);
		world.setBlock(x + 4, y, z + 15, spike, 14, 2);

		//21st row
		world.setBlock(x + 5, y, z - 14, spike, 14, 2);
		world.setBlock(x + 5, y, z - 13, bedrock);
		world.setBlock(x + 5, y, z - 12, bedrock);
		world.setBlock(x + 5, y, z - 11, spike, 14, 2);
		world.setBlock(x + 5, y, z - 10, spike, 14, 2);
		world.setBlock(x + 5, y, z - 9, eroded, 2, 2);
		world.setBlock(x + 5, y, z - 8, eroded, 2, 2);
		world.setBlock(x + 5, y, z - 7, eroded);
		world.setBlock(x + 5, y, z - 6, eroded);
		world.setBlock(x + 5, y, z - 5, spike, 14, 2);
		world.setBlock(x + 5, y, z - 4, bedrock);
		world.setBlock(x + 5, y, z - 3, bedrock);
		world.setBlock(x + 5, y, z - 2, spike, 14, 2);
		world.setBlock(x + 5, y, z - 1, eroded, 1, 2);
		world.setBlock(x + 5, y, z, eroded, 1, 2);
		world.setBlock(x + 5, y, z + 1, eroded, 1, 2);
		world.setBlock(x + 5, y, z + 2, eroded, 1, 2);
		world.setBlock(x + 5, y, z + 3, spike, 14, 2);
		world.setBlock(x + 5, y, z + 4, bedrock);
		world.setBlock(x + 5, y, z + 5, bedrock);
		world.setBlock(x + 5, y, z + 6, spike, 14, 2);
		world.setBlock(x + 5, y, z + 7, eroded);
		world.setBlock(x + 5, y, z + 8, eroded);
		world.setBlock(x + 5, y, z + 9, eroded, 2, 2);
		world.setBlock(x + 5, y, z + 10, eroded, 2, 2);
		world.setBlock(x + 5, y, z + 11, spike, 14, 2);
		world.setBlock(x + 5, y, z + 12, spike, 14, 2);
		world.setBlock(x + 5, y, z + 13, bedrock);
		world.setBlock(x + 5, y, z + 14, bedrock);
		world.setBlock(x + 5, y, z + 15, spike, 14, 2);

		//22nd row
		world.setBlock(x + 6, y, z - 13, spike, 14, 2);
		world.setBlock(x + 6, y, z - 12, bedrock);
		world.setBlock(x + 6, y, z - 11, bedrock);
		world.setBlock(x + 6, y, z - 10, spike, 14, 2);
		world.setBlock(x + 6, y, z - 9, spike, 14, 2);
		world.setBlock(x + 6, y, z - 8, spike, 14, 2);
		world.setBlock(x + 6, y, z - 7, eroded, 2, 2);
		world.setBlock(x + 6, y, z - 6, spike, 14, 2);
		world.setBlock(x + 6, y, z - 5, bedrock);
		world.setBlock(x + 6, y, z - 4, bedrock);
		world.setBlock(x + 6, y, z - 3, spike, 14, 2);
		world.setBlock(x + 6, y, z - 2, eroded, 1, 2);
		world.setBlock(x + 6, y, z - 1, eroded);
		world.setBlock(x + 6, y, z, eroded);
		world.setBlock(x + 6, y, z + 1, eroded);
		world.setBlock(x + 6, y, z + 2, eroded);
		world.setBlock(x + 6, y, z + 3, eroded, 1, 2);
		world.setBlock(x + 6, y, z + 4, spike, 14, 2);
		world.setBlock(x + 6, y, z + 5, bedrock);
		world.setBlock(x + 6, y, z + 6, bedrock);
		world.setBlock(x + 6, y, z + 7, spike, 14, 2);
		world.setBlock(x + 6, y, z + 8, eroded, 2, 2);
		world.setBlock(x + 6, y, z + 9, spike, 14, 2);
		world.setBlock(x + 6, y, z + 10, spike, 14, 2);
		world.setBlock(x + 6, y, z + 11, spike, 14, 2);
		world.setBlock(x + 6, y, z + 12, bedrock);
		world.setBlock(x + 6, y, z + 13, bedrock);
		world.setBlock(x + 6, y, z + 14, spike, 14, 2);

		//23rd row
		world.setBlock(x + 7, y, z - 13, eroded, 1, 2);
		world.setBlock(x + 7, y, z - 12, spike, 14, 2);
		world.setBlock(x + 7, y, z - 11, bedrock);
		world.setBlock(x + 7, y, z - 10, bedrock);
		world.setBlock(x + 7, y, z - 9, bedrock);
		world.setBlock(x + 7, y, z - 8, spike, 14, 2);
		world.setBlock(x + 7, y, z - 7, spike, 14, 2);
		world.setBlock(x + 7, y, z - 6, bedrock);
		world.setBlock(x + 7, y, z - 5, bedrock);
		world.setBlock(x + 7, y, z - 4, spike, 14, 2);
		world.setBlock(x + 7, y, z - 3, eroded, 1, 2);
		world.setBlock(x + 7, y, z - 2, eroded);
		world.setBlock(x + 7, y, z - 1, eroded);
		world.setBlock(x + 7, y, z, eroded);
		world.setBlock(x + 7, y, z + 1, eroded);
		world.setBlock(x + 7, y, z + 2, eroded);
		world.setBlock(x + 7, y, z + 3, eroded);
		world.setBlock(x + 7, y, z + 4, eroded, 1, 2);
		world.setBlock(x + 7, y, z + 5, spike, 14, 2);
		world.setBlock(x + 7, y, z + 6, bedrock);
		world.setBlock(x + 7, y, z + 7, bedrock);
		world.setBlock(x + 7, y, z + 8, spike, 14, 2);
		world.setBlock(x + 7, y, z + 9, spike, 14, 2);
		world.setBlock(x + 7, y, z + 10, bedrock);
		world.setBlock(x + 7, y, z + 11, bedrock);
		world.setBlock(x + 7, y, z + 12, bedrock);
		world.setBlock(x + 7, y, z + 13, spike, 14, 2);
		world.setBlock(x + 7, y, z + 14, eroded, 1, 2);

		//24th row
		world.setBlock(x + 8, y, z - 11, spike, 14, 2);
		world.setBlock(x + 8, y, z - 10, spike, 14, 2);
		world.setBlock(x + 8, y, z - 9, bedrock);
		world.setBlock(x + 8, y, z - 8, bedrock);
		world.setBlock(x + 8, y, z - 7, bedrock);
		world.setBlock(x + 8, y, z - 6, bedrock);
		world.setBlock(x + 8, y, z - 5, spike, 14, 2);
		world.setBlock(x + 8, y, z - 4, eroded, 1, 2);
		world.setBlock(x + 8, y, z - 3, eroded);
		world.setBlock(x + 8, y, z - 2, eroded);
		world.setBlock(x + 8, y, z - 1, eroded);
		world.setBlock(x + 8, y, z, eroded, 1, 2);
		world.setBlock(x + 8, y, z + 1, eroded, 1, 2);
		world.setBlock(x + 8, y, z + 2, eroded);
		world.setBlock(x + 8, y, z + 3, eroded);
		world.setBlock(x + 8, y, z + 4, eroded);
		world.setBlock(x + 8, y, z + 5, eroded, 1, 2);
		world.setBlock(x + 8, y, z + 6, spike, 14, 2);
		world.setBlock(x + 8, y, z + 7, bedrock);
		world.setBlock(x + 8, y, z + 8, bedrock);
		world.setBlock(x + 8, y, z + 9, bedrock);
		world.setBlock(x + 8, y, z + 10, bedrock);
		world.setBlock(x + 8, y, z + 11, spike, 14, 2);
		world.setBlock(x + 8, y, z + 12, spike, 14, 2);

		//25th row
		world.setBlock(x + 9, y, z - 9, eroded, 1, 2);
		world.setBlock(x + 9, y, z - 8, cell);
		world.setBlock(x + 9, y, z - 7, bedrock);
		world.setBlock(x + 9, y, z - 6, cell);
		world.setBlock(x + 9, y, z - 5, eroded, 1, 2);
		world.setBlock(x + 9, y, z - 4, eroded);
		world.setBlock(x + 9, y, z - 3, eroded);
		world.setBlock(x + 9, y, z - 2, eroded);
		world.setBlock(x + 9, y, z - 1, eroded, 1, 2);
		world.setBlock(x + 9, y, z, eroded, 2, 2);
		world.setBlock(x + 9, y, z + 1, eroded, 2, 2);
		world.setBlock(x + 9, y, z + 2, eroded, 1, 2);
		world.setBlock(x + 9, y, z + 3, eroded);
		world.setBlock(x + 9, y, z + 4, eroded);
		world.setBlock(x + 9, y, z + 5, eroded);
		world.setBlock(x + 9, y, z + 6, eroded, 1, 2);
		world.setBlock(x + 9, y, z + 7, cell);
		world.setBlock(x + 9, y, z + 8, bedrock);
		world.setBlock(x + 9, y, z + 9, cell);
		world.setBlock(x + 9, y, z + 10, eroded, 1, 2);

		//26th row
		world.setBlock(x + 10, y, z - 8, cell);
		world.setBlock(x + 10, y, z - 7, bedrock);
		world.setBlock(x + 10, y, z - 6, cell);
		world.setBlock(x + 10, y, z - 5, eroded, 1, 2);
		world.setBlock(x + 10, y, z - 4, eroded);
		world.setBlock(x + 10, y, z - 3, eroded);
		world.setBlock(x + 10, y, z - 2, eroded, 1, 2);
		world.setBlock(x + 10, y, z - 1, eroded, 2, 2);
		world.setBlock(x + 10, y, z, eroded, 2, 2);
		world.setBlock(x + 10, y, z + 1, eroded, 2, 2);
		world.setBlock(x + 10, y, z + 2, eroded, 2, 2);
		world.setBlock(x + 10, y, z + 3, eroded, 1, 2);
		world.setBlock(x + 10, y, z + 4, eroded);
		world.setBlock(x + 10, y, z + 5, eroded);
		world.setBlock(x + 10, y, z + 6, eroded, 1, 2);
		world.setBlock(x + 10, y, z + 7, cell);
		world.setBlock(x + 10, y, z + 8, bedrock);
		world.setBlock(x + 10, y, z + 9, cell);

		//27th row
		world.setBlock(x + 11, y, z - 8, cell);
		world.setBlock(x + 11, y, z - 7, bedrock);
		world.setBlock(x + 11, y, z - 6, cell);
		world.setBlock(x + 11, y, z - 5, eroded, 1, 2);
		world.setBlock(x + 11, y, z - 4, eroded);
		world.setBlock(x + 11, y, z - 3, eroded);
		world.setBlock(x + 11, y, z - 2, eroded, 1, 2);
		world.setBlock(x + 11, y, z - 1, eroded, 2, 2);
		world.setBlock(x + 11, y, z, eroded, 2, 2);
		world.setBlock(x + 11, y, z + 1, eroded, 2, 2);
		world.setBlock(x + 11, y, z + 2, eroded, 2, 2);
		world.setBlock(x + 11, y, z + 3, eroded, 1, 2);
		world.setBlock(x + 11, y, z + 4, eroded);
		world.setBlock(x + 11, y, z + 5, eroded);
		world.setBlock(x + 11, y, z + 6, eroded, 1, 2);
		world.setBlock(x + 11, y, z + 7, cell);
		world.setBlock(x + 11, y, z + 8, bedrock);
		world.setBlock(x + 11, y, z + 9, cell);

		//28th row
		world.setBlock(x + 12, y, z - 8, cell);
		world.setBlock(x + 12, y, z - 7, bedrock);
		world.setBlock(x + 12, y, z - 6, cell);
		world.setBlock(x + 12, y, z - 5, eroded, 1, 2);
		world.setBlock(x + 12, y, z - 4, eroded);
		world.setBlock(x + 12, y, z - 3, eroded);
		world.setBlock(x + 12, y, z - 2, eroded);
		world.setBlock(x + 12, y, z - 1, eroded, 1, 2);
		world.setBlock(x + 12, y, z, eroded, 2, 2);
		world.setBlock(x + 12, y, z + 1, eroded, 2, 2);
		world.setBlock(x + 12, y, z + 2, eroded, 1, 2);
		world.setBlock(x + 12, y, z + 3, eroded);
		world.setBlock(x + 12, y, z + 4, eroded);
		world.setBlock(x + 12, y, z + 5, eroded);
		world.setBlock(x + 12, y, z + 6, eroded, 1, 2);
		world.setBlock(x + 12, y, z + 7, cell);
		world.setBlock(x + 12, y, z + 8, bedrock);
		world.setBlock(x + 12, y, z + 9, cell);

		//29th row
		world.setBlock(x + 13, y, z - 8, spike, 14, 2);
		world.setBlock(x + 13, y, z - 7, bedrock);
		world.setBlock(x + 13, y, z - 6, bedrock);
		world.setBlock(x + 13, y, z - 5, spike, 14, 2);
		world.setBlock(x + 13, y, z - 4, eroded, 1, 2);
		world.setBlock(x + 13, y, z - 3, eroded);
		world.setBlock(x + 13, y, z - 2, eroded);
		world.setBlock(x + 13, y, z - 1, eroded);
		world.setBlock(x + 13, y, z, eroded, 1, 2);
		world.setBlock(x + 13, y, z + 1, eroded, 1, 2);
		world.setBlock(x + 13, y, z + 2, eroded);
		world.setBlock(x + 13, y, z + 3, eroded);
		world.setBlock(x + 13, y, z + 4, eroded);
		world.setBlock(x + 13, y, z + 5, eroded, 1, 2);
		world.setBlock(x + 13, y, z + 6, spike, 14, 2);
		world.setBlock(x + 13, y, z + 7, bedrock);
		world.setBlock(x + 13, y, z + 8, bedrock);
		world.setBlock(x + 13, y, z + 9, spike, 14, 2);

		//30th row
		world.setBlock(x + 14, y, z - 7, eroded, 1, 2);
		world.setBlock(x + 14, y, z - 6, bedrock);
		world.setBlock(x + 14, y, z - 5, bedrock);
		world.setBlock(x + 14, y, z - 4, spike, 14, 2);
		world.setBlock(x + 14, y, z - 3, eroded, 1, 2);
		world.setBlock(x + 14, y, z - 2, eroded);
		world.setBlock(x + 14, y, z - 1, eroded);
		world.setBlock(x + 14, y, z, eroded);
		world.setBlock(x + 14, y, z + 1, eroded);
		world.setBlock(x + 14, y, z + 2, eroded);
		world.setBlock(x + 14, y, z + 3, eroded);
		world.setBlock(x + 14, y, z + 4, eroded, 1, 2);
		world.setBlock(x + 14, y, z + 5, spike, 14, 2);
		world.setBlock(x + 14, y, z + 6, bedrock);
		world.setBlock(x + 14, y, z + 7, bedrock);
		world.setBlock(x + 14, y, z + 8, eroded, 1, 2);

		//31st row
		world.setBlock(x + 15, y, z - 6, spike, 14, 2);
		world.setBlock(x + 15, y, z - 5, bedrock);
		world.setBlock(x + 15, y, z - 4, bedrock);
		world.setBlock(x + 15, y, z - 3, spike, 14, 2);
		world.setBlock(x + 15, y, z - 2, eroded, 1, 2);
		world.setBlock(x + 15, y, z - 1, eroded);
		world.setBlock(x + 15, y, z, eroded);
		world.setBlock(x + 15, y, z + 1, eroded);
		world.setBlock(x + 15, y, z + 2, eroded);
		world.setBlock(x + 15, y, z + 3, eroded, 1, 2);
		world.setBlock(x + 15, y, z + 4, spike, 14, 2);
		world.setBlock(x + 15, y, z + 5, bedrock);
		world.setBlock(x + 15, y, z + 6, bedrock);
		world.setBlock(x + 15, y, z + 7, spike, 14, 2);

		//32nd row
		world.setBlock(x + 16, y, z - 5, eroded, 1, 2);
		world.setBlock(x + 16, y, z - 4, bedrock);
		world.setBlock(x + 16, y, z - 3, bedrock);
		world.setBlock(x + 16, y, z - 2, spike, 14, 2);
		world.setBlock(x + 16, y, z - 1, eroded, 1, 2);
		world.setBlock(x + 16, y, z, eroded, 1, 2);
		world.setBlock(x + 16, y, z + 1, eroded, 1, 2);
		world.setBlock(x + 16, y, z + 2, eroded, 1, 2);
		world.setBlock(x + 16, y, z + 3, spike, 14, 2);
		world.setBlock(x + 16, y, z + 4, bedrock);
		world.setBlock(x + 16, y, z + 5, bedrock);
		world.setBlock(x + 16, y, z + 6, eroded, 1, 2);

		//33rd row
		world.setBlock(x + 17, y, z - 4, spike, 14, 2);
		world.setBlock(x + 17, y, z - 3, bedrock);
		world.setBlock(x + 17, y, z - 2, bedrock);
		world.setBlock(x + 17, y, z - 1, cell);
		world.setBlock(x + 17, y, z, cell);
		world.setBlock(x + 17, y, z + 1, cell);
		world.setBlock(x + 17, y, z + 2, cell);
		world.setBlock(x + 17, y, z + 3, bedrock);
		world.setBlock(x + 17, y, z + 4, bedrock);
		world.setBlock(x + 17, y, z + 5, spike, 14, 2);

		//34th row
		world.setBlock(x + 18, y, z - 3, eroded, 1, 2);
		world.setBlock(x + 18, y ,z - 2, bedrock);
		world.setBlock(x + 18, y ,z - 1, bedrock);
		world.setBlock(x + 18, y ,z, bedrock);
		world.setBlock(x + 18, y ,z + 1, bedrock);
		world.setBlock(x + 18, y ,z + 2, bedrock);
		world.setBlock(x + 18, y ,z + 3, bedrock);
		world.setBlock(x + 18, y, z + 4, eroded, 1, 2);

		//35th row
		world.setBlock(x + 19, y, z - 2, spike, 14, 2);
		world.setBlock(x + 19, y, z - 1, cell);
		world.setBlock(x + 19, y, z, cell);
		world.setBlock(x + 19, y, z + 1, cell);
		world.setBlock(x + 19, y, z + 2, cell);
		world.setBlock(x + 19, y, z + 3, spike, 14, 2);

		for (int i = 0; i < 2; i++) //Second/Third layer
		{
			y++;
			//1st row
			world.setBlock(x - 15, y, z - 19, spike, 14, 2);
			world.setBlock(x - 15, y, z - 18, cell);
			world.setBlock(x - 15, y, z - 17, cell);
			world.setBlock(x - 15, y, z - 16, cell);
			world.setBlock(x - 15, y, z - 15, cell);
			world.setBlock(x - 15, y, z - 14, spike, 14, 2);

			world.setBlock(x - 15, y, z - 2, spike, 14, 2);
			world.setBlock(x - 15, y, z - 1, cell);
			world.setBlockToAir(x - 15, y, z);
			world.setBlockToAir(x - 15, y, z + 1);
			world.setBlock(x - 15, y, z + 2, cell);
			world.setBlock(x - 15, y, z + 3, spike, 14, 2);

			world.setBlock(x - 15, y, z + 15, spike, 14, 2);
			world.setBlock(x - 15, y, z + 16, cell);
			world.setBlock(x - 15, y, z + 17, cell);
			world.setBlock(x - 15, y, z + 18, cell);
			world.setBlock(x - 15, y, z + 19, cell);
			world.setBlock(x - 15, y, z + 20, spike, 14, 2);

			//2nd row
			world.setBlock(x - 14, y, z - 20, eroded, 1, 2);
			world.setBlock(x - 14, y, z - 19, bedrock);
			world.setBlock(x - 14, y, z - 18, bedrock);
			world.setBlock(x - 14, y, z - 17, bedrock);
			world.setBlock(x - 14, y, z - 16, bedrock);
			world.setBlock(x - 14, y, z - 15, bedrock);
			world.setBlock(x - 14, y, z - 14, bedrock);
			world.setBlock(x - 14, y, z - 13, eroded, 1, 2);

			world.setBlock(x - 14, y, z - 3, eroded, 1, 2);
			world.setBlock(x - 14, y, z - 2, bedrock);
			world.setBlock(x - 14, y, z - 1, bedrock);
			world.setBlockToAir(x - 14, y, z);
			world.setBlockToAir(x - 14, y, z + 1);
			world.setBlock(x - 14, y, z + 2, bedrock);
			world.setBlock(x - 14, y, z + 3, bedrock);
			world.setBlock(x - 14, y, z + 4, eroded, 1, 2);

			world.setBlock(x - 14, y, z + 14, eroded, 1, 2);
			world.setBlock(x - 14, y, z + 15, bedrock);
			world.setBlock(x - 14, y, z + 16, bedrock);
			world.setBlock(x - 14, y, z + 17, bedrock);
			world.setBlock(x - 14, y, z + 18, bedrock);
			world.setBlock(x - 14, y, z + 19, bedrock);
			world.setBlock(x - 14, y, z + 20, bedrock);
			world.setBlock(x - 14, y, z + 21, eroded, 1, 2);

			//3rd row
			world.setBlock(x - 13, y, z - 21, spike, 14, 2);
			world.setBlock(x - 13, y, z - 20, bedrock);
			world.setBlock(x - 13, y, z - 19, bedrock);
			world.setBlock(x - 13, y, z - 18, cell);
			world.setBlock(x - 13, y, z - 17, cell);
			world.setBlock(x - 13, y, z - 16, cell);
			world.setBlock(x - 13, y, z - 15, cell);
			world.setBlock(x - 13, y, z - 14, bedrock);
			world.setBlock(x - 13, y, z - 13, bedrock);
			world.setBlock(x - 13, y, z - 12, spike, 14, 2);

			world.setBlock(x - 13, y, z - 4, spike, 14, 2);
			world.setBlock(x - 13, y, z - 3, bedrock);
			world.setBlock(x - 13, y, z - 2, bedrock);
			world.setBlock(x - 13, y, z - 1, cell);
			world.setBlockToAir(x - 13, y, z);
			world.setBlockToAir(x - 13, y, z + 1);
			world.setBlock(x - 13, y, z + 2, cell);
			world.setBlock(x - 13, y, z + 3, bedrock);
			world.setBlock(x - 13, y, z + 4, bedrock);
			world.setBlock(x - 13, y, z + 5, spike, 14, 2);

			world.setBlock(x - 13, y, z + 13, spike, 14, 2);
			world.setBlock(x - 13, y, z + 14, bedrock);
			world.setBlock(x - 13, y, z + 15, bedrock);
			world.setBlock(x - 13, y, z + 16, cell);
			world.setBlock(x - 13, y, z + 17, cell);
			world.setBlock(x - 13, y, z + 18, cell);
			world.setBlock(x - 13, y, z + 19, cell);
			world.setBlock(x - 13, y, z + 20, bedrock);
			world.setBlock(x - 13, y, z + 21, bedrock);
			world.setBlock(x - 13, y, z + 22, spike, 14, 2);

			//4th row
			world.setBlock(x - 12, y, z - 22, eroded, 1, 2);
			world.setBlock(x - 12, y, z - 21, bedrock);
			world.setBlock(x - 12, y, z - 20, bedrock);
			world.setBlock(x - 12, y, z - 19, spike, 14, 2);
			world.setBlockToAir(x - 12, y, z - 18);
			world.setBlockToAir(x - 12, y, z - 17);
			world.setBlockToAir(x - 12, y, z - 16);
			world.setBlockToAir(x - 12, y, z - 15);
			world.setBlock(x - 12, y, z - 14, spike, 14, 2);
			world.setBlock(x - 12, y, z - 13, bedrock);
			world.setBlock(x - 12, y, z - 12, bedrock);
			world.setBlock(x - 12, y, z - 11, eroded, 1, 2);

			world.setBlock(x - 12, y, z - 5, eroded, 1, 2);
			world.setBlock(x - 12, y, z - 4, bedrock);
			world.setBlock(x - 12, y, z - 3, bedrock);
			world.setBlock(x - 12, y, z - 2, spike, 14, 2);
			world.setBlockToAir(x - 12, y, z - 1);
			world.setBlockToAir(x - 12, y, z);
			world.setBlockToAir(x - 12, y, z + 1);
			world.setBlockToAir(x - 12, y, z + 2);
			world.setBlock(x - 12, y, z + 3, spike, 14, 2);
			world.setBlock(x - 12, y, z + 4, bedrock);
			world.setBlock(x - 12, y, z + 5, bedrock);
			world.setBlock(x - 12, y, z + 6, eroded, 1, 2);

			world.setBlock(x - 12, y, z + 12, eroded, 1, 2);
			world.setBlock(x - 12, y, z + 13, bedrock);
			world.setBlock(x - 12, y, z + 14, bedrock);
			world.setBlock(x - 12, y, z + 15, spike, 14, 2);
			world.setBlockToAir(x - 12, y, z + 16);
			world.setBlockToAir(x - 12, y, z + 17);
			world.setBlockToAir(x - 12, y, z + 18);
			world.setBlockToAir(x - 12, y, z + 19);
			world.setBlock(x - 12, y, z + 20, spike, 14, 2);
			world.setBlock(x - 12, y, z + 21, bedrock);
			world.setBlock(x - 12, y, z + 22, bedrock);
			world.setBlock(x - 12, y, z + 23, eroded, 1, 2);

			//5th row
			world.setBlock(x - 11, y, z - 23, spike, 14, 2);
			world.setBlock(x - 11, y, z - 22, bedrock);
			world.setBlock(x - 11, y, z - 21, bedrock);
			world.setBlock(x - 11, y, z - 20, spike, 14, 2);
			world.setBlockToAir(x - 11, y, z - 19);
			world.setBlockToAir(x - 11, y, z - 18);
			world.setBlockToAir(x - 11, y, z - 17);
			world.setBlockToAir(x - 11, y, z - 16);
			world.setBlockToAir(x - 11, y, z - 15);
			world.setBlockToAir(x - 11, y, z - 14);
			world.setBlock(x - 11, y, z - 13, spike, 14, 2);
			world.setBlock(x - 11, y, z - 12, bedrock);
			world.setBlock(x - 11, y, z - 11, bedrock);
			world.setBlock(x - 11, y, z - 10, spike, 14, 2);

			world.setBlock(x - 11, y, z - 6, spike, 14, 2);
			world.setBlock(x - 11, y, z - 5, bedrock);
			world.setBlock(x - 11, y, z - 4, bedrock);
			world.setBlock(x - 11, y, z - 3, spike, 14, 2);
			world.setBlockToAir(x - 11, y, z - 2);
			world.setBlockToAir(x - 11, y, z - 1);
			world.setBlockToAir(x - 11, y, z);
			world.setBlockToAir(x - 11, y, z + 1);
			world.setBlockToAir(x - 11, y, z + 2);
			world.setBlockToAir(x - 11, y, z + 3);
			world.setBlock(x - 11, y, z + 4, spike, 14, 2);
			world.setBlock(x - 11, y, z + 5, bedrock);
			world.setBlock(x - 11, y, z + 6, bedrock);
			world.setBlock(x - 11, y, z + 7, spike, 14, 2);

			world.setBlock(x - 11, y, z + 11, spike, 14, 2);
			world.setBlock(x - 11, y, z + 12, bedrock);
			world.setBlock(x - 11, y, z + 13, bedrock);
			world.setBlock(x - 11, y, z + 14, spike, 14, 2);
			world.setBlockToAir(x - 11, y, z + 15);
			world.setBlockToAir(x - 11, y, z + 16);
			world.setBlockToAir(x - 11, y, z + 17);
			world.setBlockToAir(x - 11, y, z + 18);
			world.setBlockToAir(x - 11, y, z + 19);
			world.setBlockToAir(x - 11, y, z + 20);
			world.setBlock(x - 11, y, z + 21, spike, 14, 2);
			world.setBlock(x - 11, y, z + 22, bedrock);
			world.setBlock(x - 11, y, z + 23, bedrock);
			world.setBlock(x - 11, y, z + 24, spike, 14, 2);

			//6th row
			world.setBlock(x - 10, y, z - 24, eroded, 1, 2);
			world.setBlock(x - 10, y, z - 23, bedrock);
			world.setBlock(x - 10, y, z - 22, bedrock);
			world.setBlock(x - 10, y, z - 21, spike, 14, 2);
			world.setBlockToAir(x - 10, y, z - 20);
			world.setBlockToAir(x - 10, y, z - 19);
			world.setBlockToAir(x - 10, y, z - 18);
			world.setBlockToAir(x - 10, y, z - 17);
			world.setBlockToAir(x - 10, y, z - 16);
			world.setBlockToAir(x - 10, y, z - 15);
			world.setBlockToAir(x - 10, y, z - 14);
			world.setBlockToAir(x - 10, y, z - 13);
			world.setBlock(x - 10, y, z - 12, spike, 14, 2);
			world.setBlock(x - 10, y, z - 11, bedrock);
			world.setBlock(x - 10, y, z - 10, bedrock);
			world.setBlock(x - 10, y, z - 9, eroded, 1, 2);
			world.setBlock(x - 10, y, z - 8, spike, 14, 2);
			world.setBlock(x - 10, y, z - 7, eroded, 1, 2);
			world.setBlock(x - 10, y, z - 6, bedrock);
			world.setBlock(x - 10, y, z - 5, bedrock);
			world.setBlock(x - 10, y, z - 4, spike, 14, 2);
			world.setBlockToAir(x - 10, y, z - 3);
			world.setBlockToAir(x - 10, y, z - 2);
			world.setBlockToAir(x - 10, y, z - 1);
			world.setBlockToAir(x - 10, y, z);
			world.setBlockToAir(x - 10, y, z + 1);
			world.setBlockToAir(x - 10, y, z + 2);
			world.setBlockToAir(x - 10, y, z + 3);
			world.setBlockToAir(x - 10, y, z + 4);
			world.setBlock(x - 10, y, z + 5, spike, 14, 2);
			world.setBlock(x - 10, y, z + 6, bedrock);
			world.setBlock(x - 10, y, z + 7, bedrock);
			world.setBlock(x - 10, y, z + 8, eroded, 1, 2);
			world.setBlock(x - 10, y, z + 9, spike, 14, 2);
			world.setBlock(x - 10, y, z + 10, eroded, 1, 2);
			world.setBlock(x - 10, y, z + 11, bedrock);
			world.setBlock(x - 10, y, z + 12, bedrock);
			world.setBlock(x - 10, y, z + 13, spike, 14, 2);
			world.setBlockToAir(x - 10, y, z + 14);
			world.setBlockToAir(x - 10, y, z + 15);
			world.setBlockToAir(x - 10, y, z + 16);
			world.setBlockToAir(x - 10, y, z + 17);
			world.setBlockToAir(x - 10, y, z + 18);
			world.setBlockToAir(x - 10, y, z + 19);
			world.setBlockToAir(x - 10, y, z + 20);
			world.setBlockToAir(x - 10, y, z + 21);
			world.setBlock(x - 10, y, z + 22, spike, 14, 2);
			world.setBlock(x - 10, y, z + 23, bedrock);
			world.setBlock(x - 10, y, z + 24, bedrock);
			world.setBlock(x - 10, y, z + 25, eroded, 1, 2);

			//7th row
			world.setBlock(x - 9, y, z - 25, spike, 14, 2);
			world.setBlock(x - 9, y, z - 24, bedrock);
			world.setBlock(x - 9, y, z - 23, bedrock);
			world.setBlock(x - 9, y, z - 22, spike, 14, 2);
			world.setBlockToAir(x - 9, y, z - 21);
			world.setBlockToAir(x - 9, y, z - 20);
			world.setBlockToAir(x - 9, y, z - 19);
			world.setBlockToAir(x - 9, y, z - 18);
			world.setBlockToAir(x - 9, y, z - 17);
			world.setBlockToAir(x - 9, y, z - 16);
			world.setBlockToAir(x - 9, y, z - 15);
			world.setBlockToAir(x - 9, y, z - 14);
			world.setBlockToAir(x - 9, y, z - 13);
			world.setBlockToAir(x - 9, y, z - 12);
			world.setBlock(x - 9, y, z - 11, spike, 14, 2);
			world.setBlock(x - 9, y, z - 10, bedrock);
			world.setBlock(x - 9, y, z - 9, bedrock);
			world.setBlock(x - 9, y, z - 8, bedrock);
			world.setBlock(x - 9, y, z - 7, bedrock);
			world.setBlock(x - 9, y, z - 6, bedrock);
			world.setBlock(x - 9, y, z - 5, spike, 14, 2);
			world.setBlockToAir(x - 9, y, z - 4);
			world.setBlockToAir(x - 9, y, z - 3);
			world.setBlockToAir(x - 9, y, z - 2);
			world.setBlockToAir(x - 9, y, z - 1);
			world.setBlockToAir(x - 9, y, z);
			world.setBlockToAir(x - 9, y, z + 1);
			world.setBlockToAir(x - 9, y, z + 2);
			world.setBlockToAir(x - 9, y, z + 3);
			world.setBlockToAir(x - 9, y, z + 4);
			world.setBlockToAir(x - 9, y, z + 5);
			world.setBlock(x - 9, y, z + 6, spike, 14, 2);
			world.setBlock(x - 9, y, z + 7, bedrock);
			world.setBlock(x - 9, y, z + 8, bedrock);
			world.setBlock(x - 9, y, z + 9, bedrock);
			world.setBlock(x - 9, y, z + 10, bedrock);
			world.setBlock(x - 9, y, z + 11, bedrock);
			world.setBlock(x - 9, y, z + 12, spike, 14, 2);
			world.setBlockToAir(x - 9, y, z + 13);
			world.setBlockToAir(x - 9, y, z + 14);
			world.setBlockToAir(x - 9, y, z + 15);
			world.setBlockToAir(x - 9, y, z + 16);
			world.setBlockToAir(x - 9, y, z + 17);
			world.setBlockToAir(x - 9, y, z + 18);
			world.setBlockToAir(x - 9, y, z + 19);
			world.setBlockToAir(x - 9, y, z + 20);
			world.setBlockToAir(x - 9, y, z + 21);
			world.setBlockToAir(x - 9, y, z + 22);
			world.setBlock(x - 9, y, z + 23, spike, 14, 2);
			world.setBlock(x - 9, y, z + 24, bedrock);
			world.setBlock(x - 9, y, z + 25, bedrock);
			world.setBlock(x - 9, y, z + 26, spike, 14, 2);

			//8th row
			world.setBlock(x - 8, y, z - 25, cell);
			world.setBlock(x - 8, y, z - 24, bedrock);
			world.setBlock(x - 8, y, z - 23, cell);
			world.setBlockToAir(x - 8, y, z - 22);
			world.setBlockToAir(x - 8, y, z - 21);
			world.setBlockToAir(x - 8, y, z - 20);
			world.setBlockToAir(x - 8, y, z - 19);
			world.setBlockToAir(x - 8, y, z - 18);
			world.setBlockToAir(x - 8, y, z - 17);
			world.setBlockToAir(x - 8, y, z - 16);
			world.setBlockToAir(x - 8, y, z - 15);
			world.setBlockToAir(x - 8, y, z - 14);
			world.setBlockToAir(x - 8, y, z - 13);
			world.setBlockToAir(x - 8, y, z - 12);
			world.setBlockToAir(x - 8, y, z - 11);
			world.setBlock(x - 8, y, z - 10, cell);
			world.setBlock(x - 8, y, z - 9, bedrock);
			world.setBlock(x - 8, y, z - 8, cell);
			world.setBlock(x - 8, y, z - 7, bedrock);
			world.setBlock(x - 8, y, z - 6, cell);
			world.setBlockToAir(x - 8, y, z - 5);
			world.setBlockToAir(x - 8, y, z - 4);
			world.setBlockToAir(x - 8, y, z - 3);
			world.setBlockToAir(x - 8, y, z - 2);
			world.setBlockToAir(x - 8, y, z - 1);
			world.setBlockToAir(x - 8, y, z);
			world.setBlockToAir(x - 8, y, z + 1);
			world.setBlockToAir(x - 8, y, z + 2);
			world.setBlockToAir(x - 8, y, z + 3);
			world.setBlockToAir(x - 8, y, z + 4);
			world.setBlockToAir(x - 8, y, z + 5);
			world.setBlockToAir(x - 8, y, z + 6);
			world.setBlock(x - 8, y, z + 7, cell);
			world.setBlock(x - 8, y, z + 8, bedrock);
			world.setBlock(x - 8, y, z + 9, cell);
			world.setBlock(x - 8, y, z + 10, bedrock);
			world.setBlock(x - 8, y, z + 11, cell);
			world.setBlockToAir(x - 8, y, z + 12);
			world.setBlockToAir(x - 8, y, z + 13);
			world.setBlockToAir(x - 8, y, z + 14);
			world.setBlockToAir(x - 8, y, z + 15);
			world.setBlockToAir(x - 8, y, z + 16);
			world.setBlockToAir(x - 8, y, z + 17);
			world.setBlockToAir(x - 8, y, z + 18);
			world.setBlockToAir(x - 8, y, z + 19);
			world.setBlockToAir(x - 8, y, z + 20);
			world.setBlockToAir(x - 8, y, z + 21);
			world.setBlockToAir(x - 8, y, z + 22);
			world.setBlockToAir(x - 8, y, z + 23);
			world.setBlock(x - 8, y, z + 24, cell);
			world.setBlock(x - 8, y, z + 25, bedrock);
			world.setBlock(x - 8, y, z + 26, cell);

			//9th row
			world.setBlock(x - 7, y, z - 25, cell);
			world.setBlock(x - 7, y, z - 24, bedrock);
			world.setBlock(x - 7, y, z - 23, cell);
			world.setBlockToAir(x - 7, y, z - 22);
			world.setBlockToAir(x - 7, y, z - 21);
			world.setBlockToAir(x - 7, y, z - 20);
			world.setBlockToAir(x - 7, y, z - 19);
			world.setBlockToAir(x - 7, y, z - 18);
			world.setBlockToAir(x - 7, y, z - 17);
			world.setBlockToAir(x - 7, y, z - 16);
			world.setBlockToAir(x - 7, y, z - 15);
			world.setBlockToAir(x - 7, y, z - 14);
			world.setBlockToAir(x - 7, y, z - 13);
			world.setBlockToAir(x - 7, y, z - 12);
			world.setBlockToAir(x - 7, y, z - 11);
			world.setBlockToAir(x - 7, y, z - 10);
			world.setBlockToAir(x - 7, y, z - 9);
			world.setBlockToAir(x - 7, y, z - 8);
			world.setBlockToAir(x - 7, y, z - 7);
			world.setBlockToAir(x - 7, y, z - 6);
			world.setBlockToAir(x - 7, y, z - 5);
			world.setBlockToAir(x - 7, y, z - 4);
			world.setBlockToAir(x - 7, y, z - 3);
			world.setBlockToAir(x - 7, y, z - 2);
			world.setBlockToAir(x - 7, y, z - 1);
			world.setBlockToAir(x - 7, y, z);
			world.setBlockToAir(x - 7, y, z + 1);
			world.setBlockToAir(x - 7, y, z + 2);
			world.setBlockToAir(x - 7, y, z + 3);
			world.setBlockToAir(x - 7, y, z + 4);
			world.setBlockToAir(x - 7, y, z + 5);
			world.setBlockToAir(x - 7, y, z + 6);
			world.setBlockToAir(x - 7, y, z + 7);
			world.setBlockToAir(x - 7, y, z + 8);
			world.setBlockToAir(x - 7, y, z + 9);
			world.setBlockToAir(x - 7, y, z + 10);
			world.setBlockToAir(x - 7, y, z + 11);
			world.setBlockToAir(x - 7, y, z + 12);
			world.setBlockToAir(x - 7, y, z + 13);
			world.setBlockToAir(x - 7, y, z + 14);
			world.setBlockToAir(x - 7, y, z + 15);
			world.setBlockToAir(x - 7, y, z + 16);
			world.setBlockToAir(x - 7, y, z + 17);
			world.setBlockToAir(x - 7, y, z + 18);
			world.setBlockToAir(x - 7, y, z + 19);
			world.setBlockToAir(x - 7, y, z + 20);
			world.setBlockToAir(x - 7, y, z + 21);
			world.setBlockToAir(x - 7, y, z + 22);
			world.setBlockToAir(x - 7, y, z + 23);
			world.setBlock(x - 7, y, z + 24, cell);
			world.setBlock(x - 7, y, z + 25, bedrock);
			world.setBlock(x - 7, y, z + 26, cell);

			//10th row
			world.setBlock(x - 6, y, z - 25, cell);
			world.setBlock(x - 6, y, z - 24, bedrock);
			world.setBlock(x - 6, y, z - 23, cell);
			world.setBlockToAir(x - 6, y, z - 22);
			world.setBlockToAir(x - 6, y, z - 21);
			world.setBlockToAir(x - 6, y, z - 20);
			world.setBlockToAir(x - 6, y, z - 19);
			world.setBlockToAir(x - 6, y, z - 18);
			world.setBlockToAir(x - 6, y, z - 17);
			world.setBlockToAir(x - 6, y, z - 16);
			world.setBlockToAir(x - 6, y, z - 15);
			world.setBlockToAir(x - 6, y, z - 14);
			world.setBlockToAir(x - 6, y, z - 13);
			world.setBlockToAir(x - 6, y, z - 12);
			world.setBlockToAir(x - 6, y, z - 11);
			world.setBlockToAir(x - 6, y, z - 10);
			world.setBlockToAir(x - 6, y, z - 9);
			world.setBlockToAir(x - 6, y, z - 8);
			world.setBlockToAir(x - 6, y, z - 7);
			world.setBlockToAir(x - 6, y, z - 6);
			world.setBlockToAir(x - 6, y, z - 5);
			world.setBlockToAir(x - 6, y, z - 4);
			world.setBlockToAir(x - 6, y, z - 3);
			world.setBlockToAir(x - 6, y, z - 2);
			world.setBlockToAir(x - 6, y, z - 1);
			world.setBlockToAir(x - 6, y, z);
			world.setBlockToAir(x - 6, y, z + 1);
			world.setBlockToAir(x - 6, y, z + 2);
			world.setBlockToAir(x - 6, y, z + 3);
			world.setBlockToAir(x - 6, y, z + 4);
			world.setBlockToAir(x - 6, y, z + 5);
			world.setBlockToAir(x - 6, y, z + 6);
			world.setBlockToAir(x - 6, y, z + 7);
			world.setBlockToAir(x - 6, y, z + 8);
			world.setBlockToAir(x - 6, y, z + 9);
			world.setBlockToAir(x - 6, y, z + 10);
			world.setBlockToAir(x - 6, y, z + 11);
			world.setBlockToAir(x - 6, y, z + 12);
			world.setBlockToAir(x - 6, y, z + 13);
			world.setBlockToAir(x - 6, y, z + 14);
			world.setBlockToAir(x - 6, y, z + 15);
			world.setBlockToAir(x - 6, y, z + 16);
			world.setBlockToAir(x - 6, y, z + 17);
			world.setBlockToAir(x - 6, y, z + 18);
			world.setBlockToAir(x - 6, y, z + 19);
			world.setBlockToAir(x - 6, y, z + 20);
			world.setBlockToAir(x - 6, y, z + 21);
			world.setBlockToAir(x - 6, y, z + 22);
			world.setBlockToAir(x - 6, y, z + 23);
			world.setBlock(x - 6, y, z + 24, cell);
			world.setBlock(x - 6, y, z + 25, bedrock);
			world.setBlock(x - 6, y, z + 26, cell);

			//11th row
			world.setBlock(x - 5, y, z - 25, cell);
			world.setBlock(x - 5, y, z - 24, bedrock);
			world.setBlock(x - 5, y, z - 23, cell);
			world.setBlockToAir(x - 5, y, z - 22);
			world.setBlockToAir(x - 5, y, z - 21);
			world.setBlockToAir(x - 5, y, z - 20);
			world.setBlockToAir(x - 5, y, z - 19);
			world.setBlockToAir(x - 5, y, z - 18);
			world.setBlockToAir(x - 5, y, z - 17);
			world.setBlockToAir(x - 5, y, z - 16);
			world.setBlockToAir(x - 5, y, z - 15);
			world.setBlockToAir(x - 5, y, z - 14);
			world.setBlockToAir(x - 5, y, z - 13);
			world.setBlockToAir(x - 5, y, z - 12);
			world.setBlockToAir(x - 5, y, z - 11);
			world.setBlock(x - 5, y, z - 10, cell);
			world.setBlock(x - 5, y, z - 9, bedrock);
			world.setBlock(x - 5, y, z - 8, cell);
			world.setBlock(x - 5, y, z - 7, bedrock);
			world.setBlock(x - 5, y, z - 6, cell);
			world.setBlockToAir(x - 5, y, z - 5);
			world.setBlockToAir(x - 5, y, z - 4);
			world.setBlockToAir(x - 5, y, z - 3);
			world.setBlockToAir(x - 5, y, z - 2);
			world.setBlockToAir(x - 5, y, z - 1);
			world.setBlockToAir(x - 5, y, z);
			world.setBlockToAir(x - 5, y, z + 1);
			world.setBlockToAir(x - 5, y, z + 2);
			world.setBlockToAir(x - 5, y, z + 3);
			world.setBlockToAir(x - 5, y, z + 4);
			world.setBlockToAir(x - 5, y, z + 5);
			world.setBlockToAir(x - 5, y, z + 6);
			world.setBlock(x - 5, y, z + 7, cell);
			world.setBlock(x - 5, y, z + 8, bedrock);
			world.setBlock(x - 5, y, z + 9, cell);
			world.setBlock(x - 5, y, z + 10, bedrock);
			world.setBlock(x - 5, y, z + 11, cell);
			world.setBlockToAir(x - 5, y, z + 12);
			world.setBlockToAir(x - 5, y, z + 13);
			world.setBlockToAir(x - 5, y, z + 14);
			world.setBlockToAir(x - 5, y, z + 15);
			world.setBlockToAir(x - 5, y, z + 16);
			world.setBlockToAir(x - 5, y, z + 17);
			world.setBlockToAir(x - 5, y, z + 18);
			world.setBlockToAir(x - 5, y, z + 19);
			world.setBlockToAir(x - 5, y, z + 20);
			world.setBlockToAir(x - 5, y, z + 21);
			world.setBlockToAir(x - 5, y, z + 22);
			world.setBlockToAir(x - 5, y, z + 23);
			world.setBlock(x - 5, y, z + 24, cell);
			world.setBlock(x - 5, y, z + 25, bedrock);
			world.setBlock(x - 5, y, z + 26, cell);

			//12th row
			world.setBlock(x - 4, y, z - 25, spike, 14, 2);
			world.setBlock(x - 4, y, z - 24, bedrock);
			world.setBlock(x - 4, y, z - 23, bedrock);
			world.setBlock(x - 4, y, z - 22, spike, 14, 2);
			world.setBlockToAir(x - 4, y, z - 21);
			world.setBlockToAir(x - 4, y, z - 20);
			world.setBlockToAir(x - 4, y, z - 19);
			world.setBlockToAir(x - 4, y, z - 18);
			world.setBlockToAir(x - 4, y, z - 17);
			world.setBlockToAir(x - 4, y, z - 16);
			world.setBlockToAir(x - 4, y, z - 15);
			world.setBlockToAir(x - 4, y, z - 14);
			world.setBlockToAir(x - 4, y, z - 13);
			world.setBlockToAir(x - 4, y, z - 12);
			world.setBlock(x - 4, y, z - 11, spike, 14, 2);
			world.setBlock(x - 4, y, z - 10, bedrock);
			world.setBlock(x - 4, y, z - 9, bedrock);
			world.setBlock(x - 4, y, z - 8, bedrock);
			world.setBlock(x - 4, y, z - 7, bedrock);
			world.setBlock(x - 4, y, z - 6, bedrock);
			world.setBlock(x - 4, y, z - 5, spike, 14, 2);
			world.setBlockToAir(x - 4, y, z - 4);
			world.setBlockToAir(x - 4, y, z - 3);
			world.setBlockToAir(x - 4, y, z - 2);
			world.setBlockToAir(x - 4, y, z - 1);
			world.setBlockToAir(x - 4, y, z);
			world.setBlockToAir(x - 4, y, z + 1);
			world.setBlockToAir(x - 4, y, z + 2);
			world.setBlockToAir(x - 4, y, z + 3);
			world.setBlockToAir(x - 4, y, z + 4);
			world.setBlockToAir(x - 4, y, z + 5);
			world.setBlock(x - 4, y, z + 6, spike, 14, 2);
			world.setBlock(x - 4, y, z + 7, bedrock);
			world.setBlock(x - 4, y, z + 8, bedrock);
			world.setBlock(x - 4, y, z + 9, bedrock);
			world.setBlock(x - 4, y, z + 10, bedrock);
			world.setBlock(x - 4, y, z + 11, bedrock);
			world.setBlock(x - 4, y, z + 12, spike, 14, 2);
			world.setBlockToAir(x - 4, y, z + 13);
			world.setBlockToAir(x - 4, y, z + 14);
			world.setBlockToAir(x - 4, y, z + 15);
			world.setBlockToAir(x - 4, y, z + 16);
			world.setBlockToAir(x - 4, y, z + 17);
			world.setBlockToAir(x - 4, y, z + 18);
			world.setBlockToAir(x - 4, y, z + 19);
			world.setBlockToAir(x - 4, y, z + 20);
			world.setBlockToAir(x - 4, y, z + 21);
			world.setBlockToAir(x - 4, y, z + 22);
			world.setBlock(x - 4, y, z + 23, spike, 14, 2);
			world.setBlock(x - 4, y, z + 24, bedrock);
			world.setBlock(x - 4, y, z + 25, bedrock);
			world.setBlock(x - 4, y, z + 26, spike, 14, 2);

			//13th row
			world.setBlock(x - 3, y, z - 24, eroded, 1, 2);
			world.setBlock(x - 3, y, z - 23, bedrock);
			world.setBlock(x - 3, y, z - 22, bedrock);
			world.setBlock(x - 3, y, z - 21, spike, 14, 2);
			world.setBlockToAir(x - 3, y, z - 20);
			world.setBlockToAir(x - 3, y, z - 19);
			world.setBlockToAir(x - 3, y, z - 18);
			world.setBlockToAir(x - 3, y, z - 17);
			world.setBlockToAir(x - 3, y, z - 16);
			world.setBlockToAir(x - 3, y, z - 15);
			world.setBlockToAir(x - 3, y, z - 14);
			world.setBlockToAir(x - 3, y, z - 13);
			world.setBlockToAir(x - 3, y, z - 12);
			world.setBlock(x - 3, y, z - 11, bedrock);
			world.setBlock(x - 3, y, z - 10, bedrock);
			world.setBlock(x - 3, y, z - 9, eroded, 1, 2);
			world.setBlock(x - 3, y, z - 8, spike, 14, 2);
			world.setBlock(x - 3, y, z - 7, eroded, 1, 2);
			world.setBlock(x - 3, y, z - 6, bedrock);
			world.setBlock(x - 3, y, z - 5, bedrock);
			world.setBlock(x - 3, y, z - 4, spike, 14, 2);
			world.setBlockToAir(x - 3, y, z - 3);
			world.setBlockToAir(x - 3, y, z - 2);
			world.setBlockToAir(x - 3, y, z - 1);
			world.setBlockToAir(x - 3, y, z);
			world.setBlockToAir(x - 3, y, z + 1);
			world.setBlockToAir(x - 3, y, z + 2);
			world.setBlockToAir(x - 3, y, z + 3);
			world.setBlockToAir(x - 3, y, z + 4);
			world.setBlock(x - 3, y, z + 5, spike, 14, 2);
			world.setBlock(x - 3, y, z + 6, bedrock);
			world.setBlock(x - 3, y, z + 7, bedrock);
			world.setBlock(x - 3, y, z + 8, eroded, 1, 2);
			world.setBlock(x - 3, y, z + 9, spike, 14, 2);
			world.setBlock(x - 3, y, z + 10, eroded, 1, 2);
			world.setBlock(x - 3, y, z + 11, bedrock);
			world.setBlock(x - 3, y, z + 12, bedrock);
			world.setBlockToAir(x - 3, y, z + 13);
			world.setBlockToAir(x - 3, y, z + 14);
			world.setBlockToAir(x - 3, y, z + 15);
			world.setBlockToAir(x - 3, y, z + 16);
			world.setBlockToAir(x - 3, y, z + 17);
			world.setBlockToAir(x - 3, y, z + 18);
			world.setBlockToAir(x - 3, y, z + 19);
			world.setBlockToAir(x - 3, y, z + 20);
			world.setBlockToAir(x - 3, y, z + 21);
			world.setBlock(x - 3, y, z + 22, spike, 14, 2);
			world.setBlock(x - 3, y, z + 23, bedrock);
			world.setBlock(x - 3, y, z + 24, bedrock);
			world.setBlock(x - 3, y, z + 25, eroded, 1, 2);

			//14th row
			world.setBlock(x - 2, y, z - 23, spike, 14, 2);
			world.setBlock(x - 2, y, z - 22, bedrock);
			world.setBlock(x - 2, y, z - 21, bedrock);
			world.setBlock(x - 2, y, z - 20, spike, 14, 2);
			world.setBlockToAir(x - 2, y, z - 19);
			world.setBlockToAir(x - 2, y, z - 18);
			world.setBlockToAir(x - 2, y, z - 17);
			world.setBlockToAir(x - 2, y, z - 16);
			world.setBlockToAir(x - 2, y, z - 15);
			world.setBlockToAir(x - 2, y, z - 14);
			world.setBlockToAir(x - 2, y, z - 13);
			world.setBlockToAir(x - 2, y, z - 12);
			world.setBlockToAir(x - 2, y, z - 11);
			world.setBlock(x - 2, y, z - 10, spike, 14, 2);
			world.setBlock(x - 2, y, z - 9, spike, 14, 2);
			world.setBlock(x - 2, y, z - 8, spike, 14, 2);
			world.setBlock(x - 2, y, z - 7, spike, 14, 2);
			world.setBlock(x - 2, y, z - 6, spike, 14, 2);
			world.setBlock(x - 2, y, z - 5, bedrock);
			world.setBlock(x - 2, y, z - 4, bedrock);
			world.setBlock(x - 2, y, z - 3, spike, 14, 2);
			world.setBlockToAir(x - 2, y, z - 2);
			world.setBlockToAir(x - 2, y, z - 1);
			world.setBlockToAir(x - 2, y, z);
			world.setBlockToAir(x - 2, y, z + 1);
			world.setBlockToAir(x - 2, y, z + 2);
			world.setBlockToAir(x - 2, y, z + 3);
			world.setBlock(x - 2, y, z + 4, spike, 14, 2);
			world.setBlock(x - 2, y, z + 5, bedrock);
			world.setBlock(x - 2, y, z + 6, bedrock);
			world.setBlock(x - 2, y, z + 7, spike, 14, 2);
			world.setBlock(x - 2, y, z + 8, spike, 14, 2);
			world.setBlock(x - 2, y, z + 9, spike, 14, 2);
			world.setBlock(x - 2, y, z + 10, spike, 14, 2);
			world.setBlock(x - 2, y, z + 11, spike, 14, 2);
			world.setBlockToAir(x - 2, y, z + 12);
			world.setBlockToAir(x - 2, y, z + 13);
			world.setBlockToAir(x - 2, y, z + 14);
			world.setBlockToAir(x - 2, y, z + 15);
			world.setBlockToAir(x - 2, y, z + 16);
			world.setBlockToAir(x - 2, y, z + 17);
			world.setBlockToAir(x - 2, y, z + 18);
			world.setBlockToAir(x - 2, y, z + 19);
			world.setBlockToAir(x - 2, y, z + 20);
			world.setBlock(x - 2, y, z + 21, spike, 14, 2);
			world.setBlock(x - 2, y, z + 22, bedrock);
			world.setBlock(x - 2, y, z + 23, bedrock);
			world.setBlock(x - 2, y, z + 24, spike, 14, 2);

			//15th row
			world.setBlock(x - 1, y, z - 22, eroded, 1, 2);
			world.setBlock(x - 1, y, z - 21, bedrock);
			world.setBlock(x - 1, y, z - 20, bedrock);
			world.setBlock(x - 1, y, z - 19, spike, 14, 2);
			world.setBlockToAir(x - 1, y, z - 18);
			world.setBlockToAir(x - 1, y, z - 17);
			world.setBlockToAir(x - 1, y, z - 16);
			world.setBlockToAir(x - 1, y, z - 15);
			world.setBlock(x - 1, y, z - 14, spike, 14, 2);
			world.setBlockToAir(x - 1, y, z - 13);
			world.setBlockToAir(x - 1, y, z - 12);
			world.setBlockToAir(x - 1, y, z - 11);
			world.setBlockToAir(x - 1, y, z - 10);
			world.setBlock(x - 1, y, z - 9, spike, 14, 2);
			world.setBlock(x - 1, y, z - 8, spike, 14, 2);
			world.setBlock(x - 1, y, z - 7, spike, 14, 2);
			world.setBlock(x - 1, y, z - 6, spike, 14, 2);
			world.setBlock(x - 1, y, z - 5, eroded, 1, 2);
			world.setBlock(x - 1, y, z - 4, bedrock);
			world.setBlock(x - 1, y, z - 3, bedrock);
			world.setBlock(x - 1, y, z - 2, spike, 14, 2);
			world.setBlockToAir(x - 1, y, z - 1);
			world.setBlockToAir(x - 1, y, z);
			world.setBlockToAir(x - 1, y, z + 1);
			world.setBlockToAir(x - 1, y, z + 2);
			world.setBlock(x - 1, y, z + 3, spike, 14, 2);
			world.setBlock(x - 1, y, z + 4, bedrock);
			world.setBlock(x - 1, y, z + 5, bedrock);
			world.setBlock(x - 1, y, z + 6, eroded, 1, 2);
			world.setBlock(x - 1, y, z + 7, spike, 14, 2);
			world.setBlock(x - 1, y, z + 8, spike, 14, 2);
			world.setBlock(x - 1, y, z + 9, spike, 14, 2);
			world.setBlock(x - 1, y, z + 10, spike, 14, 2);
			world.setBlockToAir(x - 1, y, z + 11);
			world.setBlockToAir(x - 1, y, z + 12);
			world.setBlockToAir(x - 1, y, z + 13);
			world.setBlockToAir(x - 1, y, z + 14);
			world.setBlock(x - 1, y, z + 15, spike, 14, 2);
			world.setBlockToAir(x - 1, y, z + 16);
			world.setBlockToAir(x - 1, y, z + 17);
			world.setBlockToAir(x - 1, y, z + 18);
			world.setBlockToAir(x - 1, y, z + 19);
			world.setBlock(x - 1, y, z + 20, spike, 14, 2);
			world.setBlock(x - 1, y, z + 21, bedrock);
			world.setBlock(x - 1, y, z + 22, bedrock);
			world.setBlock(x - 1, y, z + 23, eroded, 1, 2);

			//16th row
			world.setBlock(x, y, z - 21, spike, 14, 2);
			world.setBlock(x, y, z - 20, bedrock);
			world.setBlock(x, y, z - 19, bedrock);
			world.setBlock(x, y, z - 18, cell);
			world.setBlock(x, y, z - 17, cell);
			world.setBlock(x, y, z - 16, cell);
			world.setBlock(x, y, z - 15, cell);
			world.setBlock(x, y, z - 14, bedrock);
			world.setBlockToAir(x, y, z - 13);
			world.setBlockToAir(x, y, z - 12);

			world.setBlockToAir(x, y, z - 11);
			world.setBlockToAir(x, y, z - 10);
			world.setBlockToAir(x, y, z - 9);
			world.setBlockToAir(x, y, z - 8);
			world.setBlock(x, y, z - 7, spike, 14, 2);
			world.setBlock(x, y, z - 6, spike, 14, 2);
			world.setBlock(x, y, z - 5, spike, 14, 2);

			world.setBlock(x, y, z - 4, spike, 14, 2);
			world.setBlock(x, y, z - 3, bedrock);
			world.setBlock(x, y, z - 2, bedrock);
			world.setBlock(x, y, z - 1, cell);
			world.setBlock(x, y, z, cell);
			world.setBlock(x, y, z + 1, cell);
			world.setBlock(x, y, z + 2, cell);
			world.setBlock(x, y, z + 3, bedrock);
			world.setBlock(x, y, z + 4, bedrock);
			world.setBlock(x, y, z + 5, spike, 14, 2);

			world.setBlock(x, y, z + 6, spike, 14, 2);
			world.setBlock(x, y, z + 7, spike, 14, 2);
			world.setBlock(x, y, z + 8, spike, 14, 2);
			world.setBlockToAir(x, y, z + 9);
			world.setBlockToAir(x, y, z + 10);
			world.setBlockToAir(x, y, z + 11);
			world.setBlockToAir(x, y, z + 12);

			world.setBlockToAir(x, y, z + 13);
			world.setBlockToAir(x, y, z + 14);
			world.setBlock(x, y, z + 15, bedrock);
			world.setBlock(x, y, z + 16, cell);
			world.setBlock(x, y, z + 17, cell);
			world.setBlock(x, y, z + 18, cell);
			world.setBlock(x, y, z + 19, cell);
			world.setBlock(x, y, z + 20, bedrock);
			world.setBlock(x, y, z + 21, bedrock);
			world.setBlock(x, y, z + 22, spike, 14, 2);

			//17th row
			world.setBlock(x + 1, y, z - 20, eroded, 1, 2);
			world.setBlock(x + 1, y, z - 19, bedrock);
			world.setBlock(x + 1, y, z - 18, bedrock);
			world.setBlock(x + 1, y, z - 17, bedrock);
			world.setBlock(x + 1, y, z - 16, bedrock);
			world.setBlock(x + 1, y, z - 15, bedrock);
			world.setBlock(x + 1, y, z - 14, bedrock);
			world.setBlock(x + 1, y, z - 13, spike, 14, 2);
			world.setBlockToAir(x + 1, y, z - 12);
			world.setBlockToAir(x + 1, y, z - 11);
			world.setBlockToAir(x + 1, y, z - 10);
			world.setBlockToAir(x + 1, y, z - 9);
			world.setBlockToAir(x + 1, y, z - 8);
			world.setBlockToAir(x + 1, y, z - 7);
			world.setBlock(x + 1, y, z - 6, spike, 14, 2);
			world.setBlock(x + 1, y, z - 5, spike, 14, 2);
			world.setBlock(x + 1, y, z - 4, spike, 14, 2);
			world.setBlock(x + 1, y, z - 3, eroded, 1, 2);
			world.setBlock(x + 1, y, z - 2, bedrock);
			world.setBlock(x + 1, y, z - 1, bedrock);
			world.setBlock(x + 1, y, z, bedrock);
			world.setBlock(x + 1, y, z + 1, bedrock);
			world.setBlock(x + 1, y, z + 2, bedrock);
			world.setBlock(x + 1, y, z + 3, bedrock);
			world.setBlock(x + 1, y, z + 4, eroded, 1, 2);
			world.setBlock(x + 1, y, z + 5, spike, 14, 2);
			world.setBlock(x + 1, y, z + 6, spike, 14, 2);
			world.setBlock(x + 1, y, z + 7, spike, 14, 2);
			world.setBlockToAir(x + 1, y, z + 8);
			world.setBlockToAir(x + 1, y, z + 9);
			world.setBlockToAir(x + 1, y, z + 10);
			world.setBlockToAir(x + 1, y, z + 11);
			world.setBlockToAir(x + 1, y, z + 12);
			world.setBlockToAir(x + 1, y, z + 13);
			world.setBlock(x + 1, y, z + 14, spike, 14, 2);
			world.setBlock(x + 1, y, z + 15, bedrock);
			world.setBlock(x + 1, y, z + 16, bedrock);
			world.setBlock(x + 1, y, z + 17, bedrock);
			world.setBlock(x + 1, y, z + 18, bedrock);
			world.setBlock(x + 1, y, z + 19, bedrock);
			world.setBlock(x + 1, y, z + 20, bedrock);
			world.setBlock(x + 1, y, z + 21, eroded, 1, 2);

			//18th row
			world.setBlock(x + 2, y, z - 19, spike, 14, 2);
			world.setBlock(x + 2, y, z - 18, cell);
			world.setBlock(x + 2, y, z - 17, cell);
			world.setBlock(x + 2, y, z - 16, cell);
			world.setBlock(x + 2, y, z - 15, cell);
			world.setBlock(x + 2, y, z - 14, bedrock);
			world.setBlock(x + 2, y, z - 13, spike, 14, 2);
			world.setBlock(x + 2, y, z - 12, spike, 14, 2);
			world.setBlockToAir(x + 2, y, z - 11);
			world.setBlockToAir(x + 2, y, z - 10);
			world.setBlockToAir(x + 2, y, z - 9);
			world.setBlockToAir(x + 2, y, z - 8);
			world.setBlockToAir(x + 2, y, z - 7);
			world.setBlockToAir(x + 2, y, z - 6);
			world.setBlock(x + 2, y, z - 5, spike, 14, 2);
			world.setBlock(x + 2, y, z - 4, spike, 14, 2);
			world.setBlock(x + 2, y, z - 3, spike, 14, 2);
			world.setBlock(x + 2, y, z - 2, bedrock);
			world.setBlock(x + 2, y, z - 1, cell);
			world.setBlock(x + 2, y, z, cell);
			world.setBlock(x + 2, y, z + 1, cell);
			world.setBlock(x + 2, y, z + 2, cell);
			world.setBlock(x + 2, y, z + 3, bedrock);
			world.setBlock(x + 2, y, z + 4, spike, 14, 2);
			world.setBlock(x + 2, y, z + 5, spike, 14, 2);
			world.setBlock(x + 2, y, z + 6, spike, 14, 2);
			world.setBlockToAir(x + 2, y, z + 7);
			world.setBlockToAir(x + 2, y, z + 8);
			world.setBlockToAir(x + 2, y, z + 9);
			world.setBlockToAir(x + 2, y, z + 10);
			world.setBlockToAir(x + 2, y, z + 11);
			world.setBlockToAir(x + 2, y, z + 12);
			world.setBlock(x + 2, y, z + 13, spike, 14, 2);
			world.setBlock(x + 2, y, z + 14, spike, 14, 2);
			world.setBlock(x + 2, y, z + 15, bedrock);
			world.setBlock(x + 2, y, z + 16, cell);
			world.setBlock(x + 2, y, z + 17, cell);
			world.setBlock(x + 2, y, z + 18, cell);
			world.setBlock(x + 2, y, z + 19, cell);
			world.setBlock(x + 2, y, z + 20, spike, 14, 2);

			//19th row
			world.setBlock(x + 3, y, z - 15, eroded, 1, 2);
			world.setBlock(x + 3, y, z - 14, bedrock);
			world.setBlock(x + 3, y, z - 13, bedrock);
			world.setBlock(x + 3, y, z - 12, spike, 14, 2);
			world.setBlockToAir(x + 3, y, z - 11);
			world.setBlockToAir(x + 3, y, z - 10);
			world.setBlockToAir(x + 3, y, z - 9);
			world.setBlockToAir(x + 3, y, z - 8);
			world.setBlockToAir(x + 3, y, z - 7);
			world.setBlockToAir(x + 3, y, z - 6);
			world.setBlock(x + 3, y, z - 5, spike, 14, 2);
			world.setBlock(x + 3, y, z - 4, spike, 14, 2);
			world.setBlock(x + 3, y, z - 3, eroded, 1, 2);
			world.setBlock(x + 3, y, z - 2, bedrock);
			world.setBlock(x + 3, y, z - 1, bedrock);
			world.setBlock(x + 3, y, z, bedrock);
			world.setBlock(x + 3, y, z + 1, bedrock);
			world.setBlock(x + 3, y, z + 2, bedrock);
			world.setBlock(x + 3, y, z + 3, bedrock);
			world.setBlock(x + 3, y, z + 4, eroded, 1, 2);
			world.setBlock(x + 3, y, z + 5, spike, 14, 2);
			world.setBlock(x + 3, y, z + 6, spike, 14, 2);
			world.setBlockToAir(x + 3, y, z + 7);
			world.setBlockToAir(x + 3, y, z + 8);
			world.setBlockToAir(x + 3, y, z + 9);
			world.setBlockToAir(x + 3, y, z + 10);
			world.setBlockToAir(x + 3, y, z + 11);
			world.setBlockToAir(x + 3, y, z + 12);
			world.setBlock(x + 3, y, z + 13, spike, 14, 2);
			world.setBlock(x + 3, y, z + 14, bedrock);
			world.setBlock(x + 3, y, z + 15, bedrock);
			world.setBlock(x + 3, y, z + 16, eroded, 1, 2);

			//20th row
			world.setBlock(x + 4, y, z - 14, spike, 14, 2);
			world.setBlock(x + 4, y, z - 13, bedrock);
			world.setBlock(x + 4, y, z - 12, spike, 14, 2);
			world.setBlock(x + 4, y, z - 11, spike, 14, 2);
			world.setBlockToAir(x + 4, y, z - 10);
			world.setBlockToAir(x + 4, y, z - 9);
			world.setBlockToAir(x + 4, y, z - 8);
			world.setBlockToAir(x + 4, y, z - 7);
			world.setBlockToAir(x + 4, y, z - 6);
			world.setBlockToAir(x + 4, y, z - 5);
			world.setBlock(x + 4, y, z - 4, spike, 14, 2);
			world.setBlock(x + 4, y, z - 3, bedrock);
			world.setBlock(x + 4, y, z - 2, bedrock);
			world.setBlock(x + 4, y, z - 1, cell);
			world.setBlock(x + 4, y, z, cell);
			world.setBlock(x + 4, y, z + 1, cell);
			world.setBlock(x + 4, y, z + 2, cell);
			world.setBlock(x + 4, y, z + 3, bedrock);
			world.setBlock(x + 4, y, z + 4, bedrock);
			world.setBlock(x + 4, y, z + 5, spike, 14, 2);
			world.setBlockToAir(x + 4, y, z + 6);
			world.setBlockToAir(x + 4, y, z + 7);
			world.setBlockToAir(x + 4, y, z + 8);
			world.setBlockToAir(x + 4, y, z + 9);
			world.setBlockToAir(x + 4, y, z + 10);
			world.setBlockToAir(x + 4, y, z + 11);
			world.setBlock(x + 4, y, z + 12, spike, 14, 2);
			world.setBlock(x + 4, y, z + 13, spike, 14, 2);
			world.setBlock(x + 4, y, z + 14, bedrock);
			world.setBlock(x + 4, y, z + 15, spike, 14, 2);

			//21st row
			world.setBlock(x + 5, y, z - 14, spike, 14, 2);
			world.setBlock(x + 5, y, z - 13, bedrock);
			world.setBlock(x + 5, y, z - 12, bedrock);
			world.setBlock(x + 5, y, z - 11, spike, 14, 2);
			world.setBlock(x + 5, y, z - 10, spike, 14, 2);
			world.setBlockToAir(x + 5, y, z - 9);
			world.setBlockToAir(x + 5, y, z - 8);
			world.setBlockToAir(x + 5, y, z - 7);
			world.setBlockToAir(x + 5, y, z - 6);
			world.setBlockToAir(x + 5, y, z - 5);
			world.setBlockToAir(x + 5, y, z - 4);
			world.setBlockToAir(x + 5, y, z - 3);
			world.setBlock(x + 5, y, z - 2, spike, 14, 2);
			world.setBlockToAir(x + 5, y, z - 1);
			world.setBlockToAir(x + 5, y, z);
			world.setBlockToAir(x + 5, y, z + 1);
			world.setBlockToAir(x + 5, y, z + 2);
			world.setBlock(x + 5, y, z + 3, spike, 14, 2);
			world.setBlockToAir(x + 5, y, z + 4);
			world.setBlockToAir(x + 5, y, z + 5);
			world.setBlockToAir(x + 5, y, z + 6);
			world.setBlockToAir(x + 5, y, z + 7);
			world.setBlockToAir(x + 5, y, z + 8);
			world.setBlockToAir(x + 5, y, z + 9);
			world.setBlockToAir(x + 5, y, z + 10);
			world.setBlock(x + 5, y, z + 11, spike, 14, 2);
			world.setBlock(x + 5, y, z + 12, spike, 14, 2);
			world.setBlock(x + 5, y, z + 13, bedrock);
			world.setBlock(x + 5, y, z + 14, bedrock);
			world.setBlock(x + 5, y, z + 15, spike, 14, 2);

			//22nd row
			world.setBlock(x + 6, y, z - 13, spike, 14, 2);
			world.setBlock(x + 6, y, z - 12, bedrock);
			world.setBlock(x + 6, y, z - 11, bedrock);
			world.setBlock(x + 6, y, z - 10, spike, 14, 2);
			world.setBlock(x + 6, y, z - 9, spike, 14, 2);
			world.setBlock(x + 6, y, z - 8, spike, 14, 2);
			world.setBlockToAir(x + 6, y, z - 7);
			world.setBlockToAir(x + 6, y, z - 6);
			world.setBlockToAir(x + 6, y, z - 5);
			world.setBlockToAir(x + 6, y, z - 4);
			world.setBlockToAir(x + 6, y, z - 3);
			world.setBlockToAir(x + 6, y, z - 2);
			world.setBlockToAir(x + 6, y, z - 1);
			world.setBlockToAir(x + 6, y, z);
			world.setBlockToAir(x + 6, y, z + 1);
			world.setBlockToAir(x + 6, y, z + 2);
			world.setBlockToAir(x + 6, y, z + 3);
			world.setBlockToAir(x + 6, y, z + 4);
			world.setBlockToAir(x + 6, y, z + 5);
			world.setBlockToAir(x + 6, y, z + 6);
			world.setBlockToAir(x + 6, y, z + 7);
			world.setBlockToAir(x + 6, y, z + 8);
			world.setBlock(x + 6, y, z + 9, spike, 14, 2);
			world.setBlock(x + 6, y, z + 10, spike, 14, 2);
			world.setBlock(x + 6, y, z + 11, spike, 14, 2);
			world.setBlock(x + 6, y, z + 12, bedrock);
			world.setBlock(x + 6, y, z + 13, bedrock);
			world.setBlock(x + 6, y, z + 14, spike, 14, 2);

			//23rd row
			world.setBlock(x + 7, y, z - 13, eroded, 1, 2);
			world.setBlock(x + 7, y, z - 12, spike, 14, 2);
			world.setBlock(x + 7, y, z - 11, bedrock);
			world.setBlock(x + 7, y, z - 10, bedrock);
			world.setBlock(x + 7, y, z - 9, bedrock);
			world.setBlock(x + 7, y, z - 8, spike, 14, 2);
			world.setBlock(x + 7, y, z - 7, spike, 14, 2);
			world.setBlock(x + 7, y, z - 6, bedrock);
			world.setBlockToAir(x + 7, y, z - 5);
			world.setBlockToAir(x + 7, y, z - 4);
			world.setBlockToAir(x + 7, y, z - 3);
			world.setBlockToAir(x + 7, y, z - 2);
			world.setBlockToAir(x + 7, y, z - 1);
			world.setBlockToAir(x + 7, y, z);
			world.setBlockToAir(x + 7, y, z + 1);
			world.setBlockToAir(x + 7, y, z + 2);
			world.setBlockToAir(x + 7, y, z + 3);
			world.setBlockToAir(x + 7, y, z + 4);
			world.setBlockToAir(x + 7, y, z + 5);
			world.setBlockToAir(x + 7, y, z + 6);
			world.setBlock(x + 7, y, z + 7, bedrock);
			world.setBlock(x + 7, y, z + 8, spike, 14, 2);
			world.setBlock(x + 7, y, z + 9, spike, 14, 2);
			world.setBlock(x + 7, y, z + 10, bedrock);
			world.setBlock(x + 7, y, z + 11, bedrock);
			world.setBlock(x + 7, y, z + 12, bedrock);
			world.setBlock(x + 7, y, z + 13, spike, 14, 2);
			world.setBlock(x + 7, y, z + 14, eroded, 1, 2);

			//24th row
			world.setBlock(x + 8, y, z - 11, spike, 14, 2);
			world.setBlock(x + 8, y, z - 10, spike, 14, 2);
			world.setBlock(x + 8, y, z - 9, bedrock);
			world.setBlock(x + 8, y, z - 8, bedrock);
			world.setBlock(x + 8, y, z - 7, bedrock);
			world.setBlock(x + 8, y, z - 6, bedrock);
			world.setBlock(x + 8, y, z - 5, spike, 14, 2);
			world.setBlockToAir(x + 8, y, z - 4);
			world.setBlockToAir(x + 8, y, z - 3);
			world.setBlockToAir(x + 8, y, z - 2);
			world.setBlockToAir(x + 8, y, z - 1);
			world.setBlockToAir(x + 8, y, z);
			world.setBlockToAir(x + 8, y, z + 1);
			world.setBlockToAir(x + 8, y, z + 2);
			world.setBlockToAir(x + 8, y, z + 3);
			world.setBlockToAir(x + 8, y, z + 4);
			world.setBlockToAir(x + 8, y, z + 5);
			world.setBlock(x + 8, y, z + 6, spike, 14, 2);
			world.setBlock(x + 8, y, z + 7, bedrock);
			world.setBlock(x + 8, y, z + 8, bedrock);
			world.setBlock(x + 8, y, z + 9, bedrock);
			world.setBlock(x + 8, y, z + 10, bedrock);
			world.setBlock(x + 8, y, z + 11, spike, 14, 2);
			world.setBlock(x + 8, y, z + 12, spike, 14, 2);

			//25th row
			world.setBlock(x + 9, y, z - 9, eroded, 1, 2);
			world.setBlock(x + 9, y, z - 8, cell);
			world.setBlock(x + 9, y, z - 7, bedrock);
			world.setBlock(x + 9, y, z - 6, cell);
			world.setBlockToAir(x + 9, y, z - 5);
			world.setBlockToAir(x + 9, y, z - 4);
			world.setBlockToAir(x + 9, y, z - 3);
			world.setBlockToAir(x + 9, y, z - 2);
			world.setBlockToAir(x + 9, y, z - 1);
			world.setBlockToAir(x + 9, y, z);
			world.setBlockToAir(x + 9, y, z + 1);
			world.setBlockToAir(x + 9, y, z + 2);
			world.setBlockToAir(x + 9, y, z + 3);
			world.setBlockToAir(x + 9, y, z + 4);
			world.setBlockToAir(x + 9, y, z + 5);
			world.setBlockToAir(x + 9, y, z + 6);
			world.setBlock(x + 9, y, z + 7, cell);
			world.setBlock(x + 9, y, z + 8, bedrock);
			world.setBlock(x + 9, y, z + 9, cell);
			world.setBlock(x + 9, y, z + 10, eroded, 1, 2);

			//26th row
			world.setBlock(x + 10, y, z - 8, cell);
			world.setBlock(x + 10, y, z - 7, bedrock);
			world.setBlock(x + 10, y, z - 6, cell);
			world.setBlockToAir(x + 10, y, z - 5);
			world.setBlockToAir(x + 10, y, z - 4);
			world.setBlockToAir(x + 10, y, z - 3);
			world.setBlockToAir(x + 10, y, z - 2);
			world.setBlockToAir(x + 10, y, z - 1);
			world.setBlockToAir(x + 10, y, z);
			world.setBlockToAir(x + 10, y, z + 1);
			world.setBlockToAir(x + 10, y, z + 2);
			world.setBlockToAir(x + 10, y, z + 3);
			world.setBlockToAir(x + 10, y, z + 4);
			world.setBlockToAir(x + 10, y, z + 5);
			world.setBlockToAir(x + 10, y, z + 6);
			world.setBlock(x + 10, y, z + 7, cell);
			world.setBlock(x + 10, y, z + 8, bedrock);
			world.setBlock(x + 10, y, z + 9, cell);

			//27th row
			world.setBlock(x + 11, y, z - 8, cell);
			world.setBlock(x + 11, y, z - 7, bedrock);
			world.setBlock(x + 11, y, z - 6, cell);
			world.setBlockToAir(x + 11, y, z - 5);
			world.setBlockToAir(x + 11, y, z - 4);
			world.setBlockToAir(x + 11, y, z - 3);
			world.setBlockToAir(x + 11, y, z - 2);
			world.setBlockToAir(x + 11, y, z - 1);
			world.setBlockToAir(x + 11, y, z);
			world.setBlockToAir(x + 11, y, z + 1);
			world.setBlockToAir(x + 11, y, z + 2);
			world.setBlockToAir(x + 11, y, z + 3);
			world.setBlockToAir(x + 11, y, z + 4);
			world.setBlockToAir(x + 11, y, z + 5);
			world.setBlockToAir(x + 11, y, z + 6);
			world.setBlock(x + 11, y, z + 7, cell);
			world.setBlock(x + 11, y, z + 8, bedrock);
			world.setBlock(x + 11, y, z + 9, cell);

			//28th row
			world.setBlock(x + 12, y, z - 8, cell);
			world.setBlock(x + 12, y, z - 7, bedrock);
			world.setBlock(x + 12, y, z - 6, cell);
			world.setBlockToAir(x + 12, y, z - 5);
			world.setBlockToAir(x + 12, y, z - 4);
			world.setBlockToAir(x + 12, y, z - 3);
			world.setBlockToAir(x + 12, y, z - 2);
			world.setBlockToAir(x + 12, y, z - 1);
			world.setBlockToAir(x + 12, y, z);
			world.setBlockToAir(x + 12, y, z + 1);
			world.setBlockToAir(x + 12, y, z + 2);
			world.setBlockToAir(x + 12, y, z + 3);
			world.setBlockToAir(x + 12, y, z + 4);
			world.setBlockToAir(x + 12, y, z + 5);
			world.setBlockToAir(x + 12, y, z + 6);
			world.setBlock(x + 12, y, z + 7, cell);
			world.setBlock(x + 12, y, z + 8, bedrock);
			world.setBlock(x + 12, y, z + 9, cell);

			//29th row
			world.setBlock(x + 13, y, z - 8, spike, 14, 2);
			world.setBlock(x + 13, y, z - 7, bedrock);
			world.setBlock(x + 13, y, z - 6, bedrock);
			world.setBlock(x + 13, y, z - 5, spike, 14, 2);
			world.setBlockToAir(x + 13, y, z - 4);
			world.setBlockToAir(x + 13, y, z - 3);
			world.setBlockToAir(x + 13, y, z - 2);
			world.setBlockToAir(x + 13, y, z - 1);
			world.setBlockToAir(x + 13, y, z);
			world.setBlockToAir(x + 13, y, z + 1);
			world.setBlockToAir(x + 13, y, z + 2);
			world.setBlockToAir(x + 13, y, z + 3);
			world.setBlockToAir(x + 13, y, z + 4);
			world.setBlockToAir(x + 13, y, z + 5);
			world.setBlock(x + 13, y, z + 6, spike, 14, 2);
			world.setBlock(x + 13, y, z + 7, bedrock);
			world.setBlock(x + 13, y, z + 8, bedrock);
			world.setBlock(x + 13, y, z + 9, spike, 14, 2);

			//30th row
			world.setBlock(x + 14, y, z - 7, eroded, 1, 2);
			world.setBlock(x + 14, y, z - 6, bedrock);
			world.setBlock(x + 14, y, z - 5, bedrock);
			world.setBlock(x + 14, y, z - 4, spike, 14, 2);
			world.setBlockToAir(x + 14, y, z - 3);
			world.setBlockToAir(x + 14, y, z - 2);
			world.setBlockToAir(x + 14, y, z - 1);
			world.setBlockToAir(x + 14, y, z);
			world.setBlockToAir(x + 14, y, z + 1);
			world.setBlockToAir(x + 14, y, z + 2);
			world.setBlockToAir(x + 14, y, z + 3);
			world.setBlockToAir(x + 14, y, z + 4);
			world.setBlock(x + 14, y, z + 5, spike, 14, 2);
			world.setBlock(x + 14, y, z + 6, bedrock);
			world.setBlock(x + 14, y, z + 7, bedrock);
			world.setBlock(x + 14, y, z + 8, eroded, 1, 2);

			//31st row
			world.setBlock(x + 15, y, z - 6, spike, 14, 2);
			world.setBlock(x + 15, y, z - 5, bedrock);
			world.setBlock(x + 15, y, z - 4, bedrock);
			world.setBlock(x + 15, y, z - 3, spike, 14, 2);
			world.setBlockToAir(x + 15, y, z - 2);
			world.setBlockToAir(x + 15, y, z - 1);
			world.setBlockToAir(x + 15, y, z);
			world.setBlockToAir(x + 15, y, z + 1);
			world.setBlockToAir(x + 15, y, z + 2);
			world.setBlockToAir(x + 15, y, z + 3);
			world.setBlock(x + 15, y, z + 4, spike, 14, 2);
			world.setBlock(x + 15, y, z + 5, bedrock);
			world.setBlock(x + 15, y, z + 6, bedrock);
			world.setBlock(x + 15, y, z + 7, spike, 14, 2);

			//32nd row
			world.setBlock(x + 16, y, z - 5, eroded, 1, 2);
			world.setBlock(x + 16, y, z - 4, bedrock);
			world.setBlock(x + 16, y, z - 3, bedrock);
			world.setBlock(x + 16, y, z - 2, spike, 14, 2);
			world.setBlockToAir(x + 16, y, z - 1);
			world.setBlockToAir(x + 16, y, z);
			world.setBlockToAir(x + 16, y, z + 1);
			world.setBlockToAir(x + 16, y, z + 2);
			world.setBlock(x + 16, y, z + 3, spike, 14, 2);
			world.setBlock(x + 16, y, z + 4, bedrock);
			world.setBlock(x + 16, y, z + 5, bedrock);
			world.setBlock(x + 16, y, z + 6, eroded, 1, 2);

			//33rd row
			world.setBlock(x + 17, y, z - 4, spike, 14, 2);
			world.setBlock(x + 17, y, z - 3, bedrock);
			world.setBlock(x + 17, y, z - 2, bedrock);
			world.setBlock(x + 17, y, z - 1, cell);
			world.setBlock(x + 17, y, z, cell);
			world.setBlock(x + 17, y, z + 1, cell);
			world.setBlock(x + 17, y, z + 2, cell);
			world.setBlock(x + 17, y, z + 3, bedrock);
			world.setBlock(x + 17, y, z + 4, bedrock);
			world.setBlock(x + 17, y, z + 5, spike, 14, 2);

			//34th row
			world.setBlock(x + 18, y, z - 3, eroded, 1, 2);
			world.setBlock(x + 18, y ,z - 2, bedrock);
			world.setBlock(x + 18, y ,z - 1, bedrock);
			world.setBlock(x + 18, y ,z, bedrock);
			world.setBlock(x + 18, y ,z + 1, bedrock);
			world.setBlock(x + 18, y ,z + 2, bedrock);
			world.setBlock(x + 18, y ,z + 3, bedrock);
			world.setBlock(x + 18, y, z + 4, eroded, 1, 2);

			//35th row
			world.setBlock(x + 19, y, z - 2, spike, 14, 2);
			world.setBlock(x + 19, y, z - 1, cell);
			world.setBlock(x + 19, y, z, cell);
			world.setBlock(x + 19, y, z + 1, cell);
			world.setBlock(x + 19, y, z + 2, cell);
			world.setBlock(x + 19, y, z + 3, spike, 14, 2);
		}

		world.setBlock(x - 1, y, z, sign, 4, 2);
		this.addSignContents(world, x - 1, y, z, 1, "Floor 1");
		world.setBlock(x - 1, y, z + 1, sign, 4, 2);
		this.addSignContents(world, x - 1, y, z + 1, 1, "Tranquil");
		this.addSignContents(world, x - 1, y, z + 1, 2, "Beginnings!");

		this.generateFirstFloor2(world, rand, x, y, z);
	}
	
	public void generateFirstFloor2(World world, Random rand, int x, int y, int z) //split to second method due to memory constraints
	{
		y++;
		//Fourth layer
		//1st row
		world.setBlock(x - 15, y, z - 19, spike, 14, 2);
		world.setBlock(x - 15, y, z - 18, cell);
		world.setBlock(x - 15, y, z - 17, cell);
		world.setBlock(x - 15, y, z - 16, cell);
		world.setBlock(x - 15, y, z - 15, cell);
		world.setBlock(x - 15, y, z - 14, spike, 14, 2);

		world.setBlock(x - 15, y, z - 2, spike, 14, 2);
		world.setBlock(x - 15, y, z - 1, cell);
		world.setBlockToAir(x - 15, y, z);
		world.setBlockToAir(x - 15, y, z + 1);
		world.setBlock(x - 15, y, z + 2, cell);
		world.setBlock(x - 15, y, z + 3, spike, 14, 2);

		world.setBlock(x - 15, y, z + 15, spike, 14, 2);
		world.setBlock(x - 15, y, z + 16, cell);
		world.setBlock(x - 15, y, z + 17, cell);
		world.setBlock(x - 15, y, z + 18, cell);
		world.setBlock(x - 15, y, z + 19, cell);
		world.setBlock(x - 15, y, z + 20, spike, 14, 2);

		//2nd row
		world.setBlock(x - 14, y, z - 20, eroded, 1, 2);
		world.setBlock(x - 14, y, z - 19, bedrock);
		world.setBlock(x - 14, y, z - 18, bedrock);
		world.setBlock(x - 14, y, z - 17, bedrock);
		world.setBlock(x - 14, y, z - 16, bedrock);
		world.setBlock(x - 14, y, z - 15, bedrock);
		world.setBlock(x - 14, y, z - 14, bedrock);
		world.setBlock(x - 14, y, z - 13, eroded, 1, 2);

		world.setBlock(x - 14, y, z - 3, eroded, 1, 2);
		world.setBlock(x - 14, y, z - 2, bedrock);
		world.setBlock(x - 14, y, z - 1, bedrock);
		world.setBlockToAir(x - 14, y, z);
		world.setBlockToAir(x - 14, y, z + 1);
		world.setBlock(x - 14, y, z + 2, bedrock);
		world.setBlock(x - 14, y, z + 3, bedrock);
		world.setBlock(x - 14, y, z + 4, eroded, 1, 2);

		world.setBlock(x - 14, y, z + 14, eroded, 1, 2);
		world.setBlock(x - 14, y, z + 15, bedrock);
		world.setBlock(x - 14, y, z + 16, bedrock);
		world.setBlock(x - 14, y, z + 17, bedrock);
		world.setBlock(x - 14, y, z + 18, bedrock);
		world.setBlock(x - 14, y, z + 19, bedrock);
		world.setBlock(x - 14, y, z + 20, bedrock);
		world.setBlock(x - 14, y, z + 21, eroded, 1, 2);

		//3rd row
		world.setBlock(x - 13, y, z - 21, spike, 14, 2);
		world.setBlock(x - 13, y, z - 20, bedrock);
		world.setBlock(x - 13, y, z - 19, bedrock);
		world.setBlock(x - 13, y, z - 18, cell);
		world.setBlock(x - 13, y, z - 17, cell);
		world.setBlock(x - 13, y, z - 16, cell);
		world.setBlock(x - 13, y, z - 15, cell);
		world.setBlock(x - 13, y, z - 14, bedrock);
		world.setBlock(x - 13, y, z - 13, bedrock);
		world.setBlock(x - 13, y, z - 12, spike, 14, 2);

		world.setBlock(x - 13, y, z - 4, spike, 14, 2);
		world.setBlock(x - 13, y, z - 3, bedrock);
		world.setBlock(x - 13, y, z - 2, bedrock);
		world.setBlock(x - 13, y, z - 1, cell);
		world.setBlockToAir(x - 13, y, z);
		world.setBlockToAir(x - 13, y, z + 1);
		world.setBlock(x - 13, y, z + 2, cell);
		world.setBlock(x - 13, y, z + 3, bedrock);
		world.setBlock(x - 13, y, z + 4, bedrock);
		world.setBlock(x - 13, y, z + 5, spike, 14, 2);

		world.setBlock(x - 13, y, z + 13, spike, 14, 2);
		world.setBlock(x - 13, y, z + 14, bedrock);
		world.setBlock(x - 13, y, z + 15, bedrock);
		world.setBlock(x - 13, y, z + 16, cell);
		world.setBlock(x - 13, y, z + 17, cell);
		world.setBlock(x - 13, y, z + 18, cell);
		world.setBlock(x - 13, y, z + 19, cell);
		world.setBlock(x - 13, y, z + 20, bedrock);
		world.setBlock(x - 13, y, z + 21, bedrock);
		world.setBlock(x - 13, y, z + 22, spike, 14, 2);

		//4th row
		world.setBlock(x - 12, y, z - 22, eroded, 1, 2);
		world.setBlock(x - 12, y, z - 21, bedrock);
		world.setBlock(x - 12, y, z - 20, bedrock);
		world.setBlock(x - 12, y, z - 19, spike, 14, 2);
		world.setBlockToAir(x - 12, y, z - 18);
		world.setBlockToAir(x - 12, y, z - 17);
		world.setBlockToAir(x - 12, y, z - 16);
		world.setBlockToAir(x - 12, y, z - 15);
		world.setBlock(x - 12, y, z - 14, spike, 14, 2);
		world.setBlock(x - 12, y, z - 13, bedrock);
		world.setBlock(x - 12, y, z - 12, bedrock);
		world.setBlock(x - 12, y, z - 11, eroded, 1, 2);

		world.setBlock(x - 12, y, z - 5, eroded, 1, 2);
		world.setBlock(x - 12, y, z - 4, bedrock);
		world.setBlock(x - 12, y, z - 3, bedrock);
		world.setBlock(x - 12, y, z - 2, spike, 14, 2);
		world.setBlockToAir(x - 12, y, z - 1);
		world.setBlockToAir(x - 12, y, z);
		world.setBlockToAir(x - 12, y, z + 1);
		world.setBlockToAir(x - 12, y, z + 2);
		world.setBlock(x - 12, y, z + 3, spike, 14, 2);
		world.setBlock(x - 12, y, z + 4, bedrock);
		world.setBlock(x - 12, y, z + 5, bedrock);
		world.setBlock(x - 12, y, z + 6, eroded, 1, 2);

		world.setBlock(x - 12, y, z + 12, eroded, 1, 2);
		world.setBlock(x - 12, y, z + 13, bedrock);
		world.setBlock(x - 12, y, z + 14, bedrock);
		world.setBlock(x - 12, y, z + 15, spike, 14, 2);
		world.setBlockToAir(x - 12, y, z + 16);
		world.setBlockToAir(x - 12, y, z + 17);
		world.setBlockToAir(x - 12, y, z + 18);
		world.setBlockToAir(x - 12, y, z + 19);
		world.setBlock(x - 12, y, z + 20, spike, 14, 2);
		world.setBlock(x - 12, y, z + 21, bedrock);
		world.setBlock(x - 12, y, z + 22, bedrock);
		world.setBlock(x - 12, y, z + 23, eroded, 1, 2);

		//5th row
		world.setBlock(x - 11, y, z - 23, spike, 14, 2);
		world.setBlock(x - 11, y, z - 22, bedrock);
		world.setBlock(x - 11, y, z - 21, bedrock);
		world.setBlock(x - 11, y, z - 20, spike, 14, 2);
		world.setBlockToAir(x - 11, y, z - 19);
		world.setBlockToAir(x - 11, y, z - 18);
		world.setBlockToAir(x - 11, y, z - 17);
		world.setBlockToAir(x - 11, y, z - 16);
		world.setBlockToAir(x - 11, y, z - 15);
		world.setBlockToAir(x - 11, y, z - 14);
		world.setBlock(x - 11, y, z - 13, spike, 14, 2);
		world.setBlock(x - 11, y, z - 12, bedrock);
		world.setBlock(x - 11, y, z - 11, bedrock);
		world.setBlock(x - 11, y, z - 10, spike, 14, 2);

		world.setBlock(x - 11, y, z - 6, spike, 14, 2);
		world.setBlock(x - 11, y, z - 5, bedrock);
		world.setBlock(x - 11, y, z - 4, bedrock);
		world.setBlock(x - 11, y, z - 3, spike, 14, 2);
		world.setBlockToAir(x - 11, y, z - 2);
		world.setBlockToAir(x - 11, y, z - 1);
		world.setBlockToAir(x - 11, y, z);
		world.setBlockToAir(x - 11, y, z + 1);
		world.setBlockToAir(x - 11, y, z + 2);
		world.setBlockToAir(x - 11, y, z + 3);
		world.setBlock(x - 11, y, z + 4, spike, 14, 2);
		world.setBlock(x - 11, y, z + 5, bedrock);
		world.setBlock(x - 11, y, z + 6, bedrock);
		world.setBlock(x - 11, y, z + 7, spike, 14, 2);

		world.setBlock(x - 11, y, z + 11, spike, 14, 2);
		world.setBlock(x - 11, y, z + 12, bedrock);
		world.setBlock(x - 11, y, z + 13, bedrock);
		world.setBlock(x - 11, y, z + 14, spike, 14, 2);
		world.setBlockToAir(x - 11, y, z + 15);
		world.setBlockToAir(x - 11, y, z + 16);
		world.setBlockToAir(x - 11, y, z + 17);
		world.setBlockToAir(x - 11, y, z + 18);
		world.setBlockToAir(x - 11, y, z + 19);
		world.setBlockToAir(x - 11, y, z + 20);
		world.setBlock(x - 11, y, z + 21, spike, 14, 2);
		world.setBlock(x - 11, y, z + 22, bedrock);
		world.setBlock(x - 11, y, z + 23, bedrock);
		world.setBlock(x - 11, y, z + 24, spike, 14, 2);

		//6th row
		world.setBlock(x - 10, y, z - 24, eroded, 1, 2);
		world.setBlock(x - 10, y, z - 23, bedrock);
		world.setBlock(x - 10, y, z - 22, bedrock);
		world.setBlock(x - 10, y, z - 21, spike, 14, 2);
		world.setBlockToAir(x - 10, y, z - 20);
		world.setBlockToAir(x - 10, y, z - 19);
		world.setBlockToAir(x - 10, y, z - 18);
		world.setBlockToAir(x - 10, y, z - 17);
		world.setBlockToAir(x - 10, y, z - 16);
		world.setBlockToAir(x - 10, y, z - 15);
		world.setBlockToAir(x - 10, y, z - 14);
		world.setBlockToAir(x - 10, y, z - 13);
		world.setBlock(x - 10, y, z - 12, spike, 14, 2);
		world.setBlock(x - 10, y, z - 11, bedrock);
		world.setBlock(x - 10, y, z - 10, bedrock);
		world.setBlock(x - 10, y, z - 9, eroded, 1, 2);
		world.setBlock(x - 10, y, z - 8, spike, 14, 2);
		world.setBlock(x - 10, y, z - 7, eroded, 1, 2);
		world.setBlock(x - 10, y, z - 6, bedrock);
		world.setBlock(x - 10, y, z - 5, bedrock);
		world.setBlock(x - 10, y, z - 4, spike, 14, 2);
		world.setBlock(x - 10, y, z - 3, lamp);
		world.setBlockToAir(x - 10, y, z - 2);
		world.setBlockToAir(x - 10, y, z - 1);
		world.setBlockToAir(x - 10, y, z);
		world.setBlockToAir(x - 10, y, z + 1);
		world.setBlockToAir(x - 10, y, z + 2);
		world.setBlockToAir(x - 10, y, z + 3);
		world.setBlock(x - 10, y, z + 4, lamp);
		world.setBlock(x - 10, y, z + 5, spike, 14, 2);
		world.setBlock(x - 10, y, z + 6, bedrock);
		world.setBlock(x - 10, y, z + 7, bedrock);
		world.setBlock(x - 10, y, z + 8, eroded, 1, 2);
		world.setBlock(x - 10, y, z + 9, spike, 14, 2);
		world.setBlock(x - 10, y, z + 10, eroded, 1, 2);
		world.setBlock(x - 10, y, z + 11, bedrock);
		world.setBlock(x - 10, y, z + 12, bedrock);
		world.setBlock(x - 10, y, z + 13, spike, 14, 2);
		world.setBlockToAir(x - 10, y, z + 14);
		world.setBlockToAir(x - 10, y, z + 15);
		world.setBlockToAir(x - 10, y, z + 16);
		world.setBlockToAir(x - 10, y, z + 17);
		world.setBlockToAir(x - 10, y, z + 18);
		world.setBlockToAir(x - 10, y, z + 19);
		world.setBlockToAir(x - 10, y, z + 20);
		world.setBlockToAir(x - 10, y, z + 21);
		world.setBlock(x - 10, y, z + 22, spike, 14, 2);
		world.setBlock(x - 10, y, z + 23, bedrock);
		world.setBlock(x - 10, y, z + 24, bedrock);
		world.setBlock(x - 10, y, z + 25, eroded, 1, 2);

		//7th row
		world.setBlock(x - 9, y, z - 25, spike, 14, 2);
		world.setBlock(x - 9, y, z - 24, bedrock);
		world.setBlock(x - 9, y, z - 23, bedrock);
		world.setBlock(x - 9, y, z - 22, spike, 14, 2);
		world.setBlockToAir(x - 9, y, z - 21);
		world.setBlockToAir(x - 9, y, z - 20);
		world.setBlockToAir(x - 9, y, z - 19);
		world.setBlockToAir(x - 9, y, z - 18);
		world.setBlockToAir(x - 9, y, z - 17);
		world.setBlockToAir(x - 9, y, z - 16);
		world.setBlockToAir(x - 9, y, z - 15);
		world.setBlockToAir(x - 9, y, z - 14);
		world.setBlockToAir(x - 9, y, z - 13);
		world.setBlockToAir(x - 9, y, z - 12);
		world.setBlock(x - 9, y, z - 11, spike, 14, 2);
		world.setBlock(x - 9, y, z - 10, bedrock);
		world.setBlock(x - 9, y, z - 9, bedrock);
		world.setBlock(x - 9, y, z - 8, bedrock);
		world.setBlock(x - 9, y, z - 7, bedrock);
		world.setBlock(x - 9, y, z - 6, bedrock);
		world.setBlock(x - 9, y, z - 5, spike, 14, 2);
		world.setBlockToAir(x - 9, y, z - 4);
		world.setBlockToAir(x - 9, y, z - 3);
		world.setBlockToAir(x - 9, y, z - 2);
		world.setBlockToAir(x - 9, y, z - 1);
		world.setBlockToAir(x - 9, y, z);
		world.setBlockToAir(x - 9, y, z + 1);
		world.setBlockToAir(x - 9, y, z + 2);
		world.setBlockToAir(x - 9, y, z + 3);
		world.setBlockToAir(x - 9, y, z + 4);
		world.setBlockToAir(x - 9, y, z + 5);
		world.setBlock(x - 9, y, z + 6, spike, 14, 2);
		world.setBlock(x - 9, y, z + 7, bedrock);
		world.setBlock(x - 9, y, z + 8, bedrock);
		world.setBlock(x - 9, y, z + 9, bedrock);
		world.setBlock(x - 9, y, z + 10, bedrock);
		world.setBlock(x - 9, y, z + 11, bedrock);
		world.setBlock(x - 9, y, z + 12, spike, 14, 2);
		world.setBlockToAir(x - 9, y, z + 13);
		world.setBlockToAir(x - 9, y, z + 14);
		world.setBlockToAir(x - 9, y, z + 15);
		world.setBlockToAir(x - 9, y, z + 16);
		world.setBlockToAir(x - 9, y, z + 17);
		world.setBlockToAir(x - 9, y, z + 18);
		world.setBlockToAir(x - 9, y, z + 19);
		world.setBlockToAir(x - 9, y, z + 20);
		world.setBlockToAir(x - 9, y, z + 21);
		world.setBlockToAir(x - 9, y, z + 22);
		world.setBlock(x - 9, y, z + 23, spike, 14, 2);
		world.setBlock(x - 9, y, z + 24, bedrock);
		world.setBlock(x - 9, y, z + 25, bedrock);
		world.setBlock(x - 9, y, z + 26, spike, 14, 2);

		//8th row
		world.setBlock(x - 8, y, z - 25, cell);
		world.setBlock(x - 8, y, z - 24, bedrock);
		world.setBlock(x - 8, y, z - 23, cell);
		world.setBlockToAir(x - 8, y, z - 22);
		world.setBlockToAir(x - 8, y, z - 21);
		world.setBlockToAir(x - 8, y, z - 20);
		world.setBlockToAir(x - 8, y, z - 19);
		world.setBlockToAir(x - 8, y, z - 18);
		world.setBlockToAir(x - 8, y, z - 17);
		world.setBlockToAir(x - 8, y, z - 16);
		world.setBlockToAir(x - 8, y, z - 15);
		world.setBlockToAir(x - 8, y, z - 14);
		world.setBlockToAir(x - 8, y, z - 13);
		world.setBlockToAir(x - 8, y, z - 12);
		world.setBlockToAir(x - 8, y, z - 11);
		world.setBlock(x - 8, y, z - 10, cell);
		world.setBlock(x - 8, y, z - 9, bedrock);
		world.setBlock(x - 8, y, z - 8, cell);
		world.setBlock(x - 8, y, z - 7, bedrock);
		world.setBlock(x - 8, y, z - 6, cell);
		world.setBlockToAir(x - 8, y, z - 5);
		world.setBlockToAir(x - 8, y, z - 4);
		world.setBlockToAir(x - 8, y, z - 3);
		world.setBlockToAir(x - 8, y, z - 2);
		world.setBlockToAir(x - 8, y, z - 1);
		world.setBlockToAir(x - 8, y, z);
		world.setBlockToAir(x - 8, y, z + 1);
		world.setBlockToAir(x - 8, y, z + 2);
		world.setBlockToAir(x - 8, y, z + 3);
		world.setBlockToAir(x - 8, y, z + 4);
		world.setBlockToAir(x - 8, y, z + 5);
		world.setBlockToAir(x - 8, y, z + 6);
		world.setBlock(x - 8, y, z + 7, cell);
		world.setBlock(x - 8, y, z + 8, bedrock);
		world.setBlock(x - 8, y, z + 9, cell);
		world.setBlock(x - 8, y, z + 10, bedrock);
		world.setBlock(x - 8, y, z + 11, cell);
		world.setBlockToAir(x - 8, y, z + 12);
		world.setBlockToAir(x - 8, y, z + 13);
		world.setBlockToAir(x - 8, y, z + 14);
		world.setBlockToAir(x - 8, y, z + 15);
		world.setBlockToAir(x - 8, y, z + 16);
		world.setBlockToAir(x - 8, y, z + 17);
		world.setBlockToAir(x - 8, y, z + 18);
		world.setBlockToAir(x - 8, y, z + 19);
		world.setBlockToAir(x - 8, y, z + 20);
		world.setBlockToAir(x - 8, y, z + 21);
		world.setBlockToAir(x - 8, y, z + 22);
		world.setBlockToAir(x - 8, y, z + 23);
		world.setBlock(x - 8, y, z + 24, cell);
		world.setBlock(x - 8, y, z + 25, bedrock);
		world.setBlock(x - 8, y, z + 26, cell);

		//9th row
		world.setBlock(x - 7, y, z - 25, cell);
		world.setBlock(x - 7, y, z - 24, bedrock);
		world.setBlock(x - 7, y, z - 23, cell);
		world.setBlockToAir(x - 7, y, z - 22);
		world.setBlockToAir(x - 7, y, z - 21);
		world.setBlockToAir(x - 7, y, z - 20);
		world.setBlockToAir(x - 7, y, z - 19);
		world.setBlockToAir(x - 7, y, z - 18);
		world.setBlockToAir(x - 7, y, z - 17);
		world.setBlockToAir(x - 7, y, z - 16);
		world.setBlockToAir(x - 7, y, z - 15);
		world.setBlockToAir(x - 7, y, z - 14);
		world.setBlockToAir(x - 7, y, z - 13);
		world.setBlockToAir(x - 7, y, z - 12);
		world.setBlockToAir(x - 7, y, z - 11);
		world.setBlock(x - 7, y, z - 10, cell);
		world.setBlock(x - 7, y, z - 9, bedrock);
		world.setBlock(x - 7, y, z - 8, cell);
		world.setBlock(x - 7, y, z - 7, bedrock);
		world.setBlock(x - 7, y, z - 6, cell);
		world.setBlockToAir(x - 7, y, z - 5);
		world.setBlockToAir(x - 7, y, z - 4);
		world.setBlockToAir(x - 7, y, z - 3);
		world.setBlockToAir(x - 7, y, z - 2);
		world.setBlockToAir(x - 7, y, z - 1);
		world.setBlockToAir(x - 7, y, z);
		world.setBlockToAir(x - 7, y, z + 1);
		world.setBlockToAir(x - 7, y, z + 2);
		world.setBlockToAir(x - 7, y, z + 3);
		world.setBlockToAir(x - 7, y, z + 4);
		world.setBlockToAir(x - 7, y, z + 5);
		world.setBlockToAir(x - 7, y, z + 6);
		world.setBlock(x - 7, y, z + 7, cell);
		world.setBlock(x - 7, y, z + 8, bedrock);
		world.setBlock(x - 7, y, z + 9, cell);
		world.setBlock(x - 7, y, z + 10, bedrock);
		world.setBlock(x - 7, y, z + 11, cell);
		world.setBlockToAir(x - 7, y, z + 12);
		world.setBlockToAir(x - 7, y, z + 13);
		world.setBlockToAir(x - 7, y, z + 14);
		world.setBlockToAir(x - 7, y, z + 15);
		world.setBlockToAir(x - 7, y, z + 16);
		world.setBlockToAir(x - 7, y, z + 17);
		world.setBlockToAir(x - 7, y, z + 18);
		world.setBlockToAir(x - 7, y, z + 19);
		world.setBlockToAir(x - 7, y, z + 20);
		world.setBlockToAir(x - 7, y, z + 21);
		world.setBlockToAir(x - 7, y, z + 22);
		world.setBlockToAir(x - 7, y, z + 23);
		world.setBlock(x - 7, y, z + 24, cell);
		world.setBlock(x - 7, y, z + 25, bedrock);
		world.setBlock(x - 7, y, z + 26, cell);

		//10th row
		world.setBlock(x - 6, y, z - 25, cell);
		world.setBlock(x - 6, y, z - 24, bedrock);
		world.setBlock(x - 6, y, z - 23, cell);
		world.setBlockToAir(x - 6, y, z - 22);
		world.setBlockToAir(x - 6, y, z - 21);
		world.setBlockToAir(x - 6, y, z - 20);
		world.setBlockToAir(x - 6, y, z - 19);
		world.setBlockToAir(x - 6, y, z - 18);
		world.setBlockToAir(x - 6, y, z - 17);
		world.setBlockToAir(x - 6, y, z - 16);
		world.setBlockToAir(x - 6, y, z - 15);
		world.setBlockToAir(x - 6, y, z - 14);
		world.setBlockToAir(x - 6, y, z - 13);
		world.setBlockToAir(x - 6, y, z - 12);
		world.setBlockToAir(x - 6, y, z - 11);
		world.setBlock(x - 6, y, z - 10, cell);
		world.setBlock(x - 6, y, z - 9, bedrock);
		world.setBlock(x - 6, y, z - 8, cell);
		world.setBlock(x - 6, y, z - 7, bedrock);
		world.setBlock(x - 6, y, z - 6, cell);
		world.setBlockToAir(x - 6, y, z - 5);
		world.setBlockToAir(x - 6, y, z - 4);
		world.setBlockToAir(x - 6, y, z - 3);
		world.setBlockToAir(x - 6, y, z - 2);
		world.setBlockToAir(x - 6, y, z - 1);
		world.setBlockToAir(x - 6, y, z);
		world.setBlockToAir(x - 6, y, z + 1);
		world.setBlockToAir(x - 6, y, z + 2);
		world.setBlockToAir(x - 6, y, z + 3);
		world.setBlockToAir(x - 6, y, z + 4);
		world.setBlockToAir(x - 6, y, z + 5);
		world.setBlockToAir(x - 6, y, z + 6);
		world.setBlock(x - 6, y, z + 7, cell);
		world.setBlock(x - 6, y, z + 8, bedrock);
		world.setBlock(x - 6, y, z + 9, cell);
		world.setBlock(x - 6, y, z + 10, bedrock);
		world.setBlock(x - 6, y, z + 11, cell);
		world.setBlockToAir(x - 6, y, z + 12);
		world.setBlockToAir(x - 6, y, z + 13);
		world.setBlockToAir(x - 6, y, z + 14);
		world.setBlockToAir(x - 6, y, z + 15);
		world.setBlockToAir(x - 6, y, z + 16);
		world.setBlockToAir(x - 6, y, z + 17);
		world.setBlockToAir(x - 6, y, z + 18);
		world.setBlockToAir(x - 6, y, z + 19);
		world.setBlockToAir(x - 6, y, z + 20);
		world.setBlockToAir(x - 6, y, z + 21);
		world.setBlockToAir(x - 6, y, z + 22);
		world.setBlockToAir(x - 6, y, z + 23);
		world.setBlock(x - 6, y, z + 24, cell);
		world.setBlock(x - 6, y, z + 25, bedrock);
		world.setBlock(x - 6, y, z + 26, cell);

		//11th row
		world.setBlock(x - 5, y, z - 25, cell);
		world.setBlock(x - 5, y, z - 24, bedrock);
		world.setBlock(x - 5, y, z - 23, cell);
		world.setBlockToAir(x - 5, y, z - 22);
		world.setBlockToAir(x - 5, y, z - 21);
		world.setBlockToAir(x - 5, y, z - 20);
		world.setBlockToAir(x - 5, y, z - 19);
		world.setBlockToAir(x - 5, y, z - 18);
		world.setBlockToAir(x - 5, y, z - 17);
		world.setBlockToAir(x - 5, y, z - 16);
		world.setBlockToAir(x - 5, y, z - 15);
		world.setBlockToAir(x - 5, y, z - 14);
		world.setBlockToAir(x - 5, y, z - 13);
		world.setBlockToAir(x - 5, y, z - 12);
		world.setBlockToAir(x - 5, y, z - 11);
		world.setBlock(x - 5, y, z - 10, cell);
		world.setBlock(x - 5, y, z - 9, bedrock);
		world.setBlock(x - 5, y, z - 8, cell);
		world.setBlock(x - 5, y, z - 7, bedrock);
		world.setBlock(x - 5, y, z - 6, cell);
		world.setBlockToAir(x - 5, y, z - 5);
		world.setBlockToAir(x - 5, y, z - 4);
		world.setBlockToAir(x - 5, y, z - 3);
		world.setBlockToAir(x - 5, y, z - 2);
		world.setBlockToAir(x - 5, y, z - 1);
		world.setBlockToAir(x - 5, y, z);
		world.setBlockToAir(x - 5, y, z + 1);
		world.setBlockToAir(x - 5, y, z + 2);
		world.setBlockToAir(x - 5, y, z + 3);
		world.setBlockToAir(x - 5, y, z + 4);
		world.setBlockToAir(x - 5, y, z + 5);
		world.setBlockToAir(x - 5, y, z + 6);
		world.setBlock(x - 5, y, z + 7, cell);
		world.setBlock(x - 5, y, z + 8, bedrock);
		world.setBlock(x - 5, y, z + 9, cell);
		world.setBlock(x - 5, y, z + 10, bedrock);
		world.setBlock(x - 5, y, z + 11, cell);
		world.setBlockToAir(x - 5, y, z + 12);
		world.setBlockToAir(x - 5, y, z + 13);
		world.setBlockToAir(x - 5, y, z + 14);
		world.setBlockToAir(x - 5, y, z + 15);
		world.setBlockToAir(x - 5, y, z + 16);
		world.setBlockToAir(x - 5, y, z + 17);
		world.setBlockToAir(x - 5, y, z + 18);
		world.setBlockToAir(x - 5, y, z + 19);
		world.setBlockToAir(x - 5, y, z + 20);
		world.setBlockToAir(x - 5, y, z + 21);
		world.setBlockToAir(x - 5, y, z + 22);
		world.setBlockToAir(x - 5, y, z + 23);
		world.setBlock(x - 5, y, z + 24, cell);
		world.setBlock(x - 5, y, z + 25, bedrock);
		world.setBlock(x - 5, y, z + 26, cell);

		//12th row
		world.setBlock(x - 4, y, z - 25, spike, 14, 2);
		world.setBlock(x - 4, y, z - 24, bedrock);
		world.setBlock(x - 4, y, z - 23, bedrock);
		world.setBlock(x - 4, y, z - 22, spike, 14, 2);
		world.setBlockToAir(x - 4, y, z - 21);
		world.setBlockToAir(x - 4, y, z - 20);
		world.setBlockToAir(x - 4, y, z - 19);
		world.setBlockToAir(x - 4, y, z - 18);
		world.setBlockToAir(x - 4, y, z - 17);
		world.setBlockToAir(x - 4, y, z - 16);
		world.setBlockToAir(x - 4, y, z - 15);
		world.setBlockToAir(x - 4, y, z - 14);
		world.setBlockToAir(x - 4, y, z - 13);
		world.setBlockToAir(x - 4, y, z - 12);
		world.setBlock(x - 4, y, z - 11, spike, 14, 2);
		world.setBlock(x - 4, y, z - 10, bedrock);
		world.setBlock(x - 4, y, z - 9, bedrock);
		world.setBlock(x - 4, y, z - 8, bedrock);
		world.setBlock(x - 4, y, z - 7, bedrock);
		world.setBlock(x - 4, y, z - 6, bedrock);
		world.setBlock(x - 4, y, z - 5, spike, 14, 2);
		world.setBlockToAir(x - 4, y, z - 4);
		world.setBlockToAir(x - 4, y, z - 3);
		world.setBlockToAir(x - 4, y, z - 2);
		world.setBlockToAir(x - 4, y, z - 1);
		world.setBlockToAir(x - 4, y, z);
		world.setBlockToAir(x - 4, y, z + 1);
		world.setBlockToAir(x - 4, y, z + 2);
		world.setBlockToAir(x - 4, y, z + 3);
		world.setBlockToAir(x - 4, y, z + 4);
		world.setBlockToAir(x - 4, y, z + 5);
		world.setBlock(x - 4, y, z + 6, spike, 14, 2);
		world.setBlock(x - 4, y, z + 7, bedrock);
		world.setBlock(x - 4, y, z + 8, bedrock);
		world.setBlock(x - 4, y, z + 9, bedrock);
		world.setBlock(x - 4, y, z + 10, bedrock);
		world.setBlock(x - 4, y, z + 11, bedrock);
		world.setBlock(x - 4, y, z + 12, spike, 14, 2);
		world.setBlockToAir(x - 4, y, z + 13);
		world.setBlockToAir(x - 4, y, z + 14);
		world.setBlockToAir(x - 4, y, z + 15);
		world.setBlockToAir(x - 4, y, z + 16);
		world.setBlockToAir(x - 4, y, z + 17);
		world.setBlockToAir(x - 4, y, z + 18);
		world.setBlockToAir(x - 4, y, z + 19);
		world.setBlockToAir(x - 4, y, z + 20);
		world.setBlockToAir(x - 4, y, z + 21);
		world.setBlockToAir(x - 4, y, z + 22);
		world.setBlock(x - 4, y, z + 23, spike, 14, 2);
		world.setBlock(x - 4, y, z + 24, bedrock);
		world.setBlock(x - 4, y, z + 25, bedrock);
		world.setBlock(x - 4, y, z + 26, spike, 14, 2);

		//13th row
		world.setBlock(x - 3, y, z - 24, eroded, 1, 2);
		world.setBlock(x - 3, y, z - 23, bedrock);
		world.setBlock(x - 3, y, z - 22, bedrock);
		world.setBlock(x - 3, y, z - 21, spike, 14, 2);
		world.setBlockToAir(x - 3, y, z - 20);
		world.setBlockToAir(x - 3, y, z - 19);
		world.setBlockToAir(x - 3, y, z - 18);
		world.setBlockToAir(x - 3, y, z - 17);
		world.setBlockToAir(x - 3, y, z - 16);
		world.setBlockToAir(x - 3, y, z - 15);
		world.setBlockToAir(x - 3, y, z - 14);
		world.setBlockToAir(x - 3, y, z - 13);
		world.setBlockToAir(x - 3, y, z - 12);
		world.setBlock(x - 3, y, z - 11, bedrock);
		world.setBlock(x - 3, y, z - 10, bedrock);
		world.setBlock(x - 3, y, z - 9, eroded, 1, 2);
		world.setBlock(x - 3, y, z - 8, spike, 14, 2);
		world.setBlock(x - 3, y, z - 7, eroded, 1, 2);
		world.setBlock(x - 3, y, z - 6, bedrock);
		world.setBlock(x - 3, y, z - 5, bedrock);
		world.setBlock(x - 3, y, z - 4, spike, 14, 2);
		world.setBlock(x - 3, y, z - 3, lamp);
		world.setBlockToAir(x - 3, y, z - 2);
		world.setBlockToAir(x - 3, y, z - 1);
		world.setBlockToAir(x - 3, y, z);
		world.setBlockToAir(x - 3, y, z + 1);
		world.setBlockToAir(x - 3, y, z + 2);
		world.setBlockToAir(x - 3, y, z + 3);
		world.setBlock(x - 3, y, z + 4, lamp);
		world.setBlock(x - 3, y, z + 5, spike, 14, 2);
		world.setBlock(x - 3, y, z + 6, bedrock);
		world.setBlock(x - 3, y, z + 7, bedrock);
		world.setBlock(x - 3, y, z + 8, eroded, 1, 2);
		world.setBlock(x - 3, y, z + 9, spike, 14, 2);
		world.setBlock(x - 3, y, z + 10, eroded, 1, 2);
		world.setBlock(x - 3, y, z + 11, bedrock);
		world.setBlock(x - 3, y, z + 12, bedrock);
		world.setBlockToAir(x - 3, y, z + 13);
		world.setBlockToAir(x - 3, y, z + 14);
		world.setBlockToAir(x - 3, y, z + 15);
		world.setBlockToAir(x - 3, y, z + 16);
		world.setBlockToAir(x - 3, y, z + 17);
		world.setBlockToAir(x - 3, y, z + 18);
		world.setBlockToAir(x - 3, y, z + 19);
		world.setBlockToAir(x - 3, y, z + 20);
		world.setBlockToAir(x - 3, y, z + 21);
		world.setBlock(x - 3, y, z + 22, spike, 14, 2);
		world.setBlock(x - 3, y, z + 23, bedrock);
		world.setBlock(x - 3, y, z + 24, bedrock);
		world.setBlock(x - 3, y, z + 25, eroded, 1, 2);

		//14th row
		world.setBlock(x - 2, y, z - 23, spike, 14, 2);
		world.setBlock(x - 2, y, z - 22, bedrock);
		world.setBlock(x - 2, y, z - 21, bedrock);
		world.setBlock(x - 2, y, z - 20, spike, 14, 2);
		world.setBlockToAir(x - 2, y, z - 19);
		world.setBlockToAir(x - 2, y, z - 18);
		world.setBlockToAir(x - 2, y, z - 17);
		world.setBlockToAir(x - 2, y, z - 16);
		world.setBlockToAir(x - 2, y, z - 15);
		world.setBlockToAir(x - 2, y, z - 14);
		world.setBlockToAir(x - 2, y, z - 13);
		world.setBlockToAir(x - 2, y, z - 12);
		world.setBlockToAir(x - 2, y, z - 11);
		world.setBlock(x - 2, y, z - 10, spike, 14, 2);
		world.setBlock(x - 2, y, z - 9, spike, 14, 2);
		world.setBlock(x - 2, y, z - 8, spike, 14, 2);
		world.setBlock(x - 2, y, z - 7, spike, 14, 2);
		world.setBlock(x - 2, y, z - 6, spike, 14, 2);
		world.setBlock(x - 2, y, z - 5, bedrock);
		world.setBlock(x - 2, y, z - 4, bedrock);
		world.setBlock(x - 2, y, z - 3, spike, 14, 2);
		world.setBlockToAir(x - 2, y, z - 2);
		world.setBlockToAir(x - 2, y, z - 1);
		world.setBlockToAir(x - 2, y, z);
		world.setBlockToAir(x - 2, y, z + 1);
		world.setBlockToAir(x - 2, y, z + 2);
		world.setBlockToAir(x - 2, y, z + 3);
		world.setBlock(x - 2, y, z + 4, spike, 14, 2);
		world.setBlock(x - 2, y, z + 5, bedrock);
		world.setBlock(x - 2, y, z + 6, bedrock);
		world.setBlock(x - 2, y, z + 7, spike, 14, 2);
		world.setBlock(x - 2, y, z + 8, spike, 14, 2);
		world.setBlock(x - 2, y, z + 9, spike, 14, 2);
		world.setBlock(x - 2, y, z + 10, spike, 14, 2);
		world.setBlock(x - 2, y, z + 11, spike, 14, 2);
		world.setBlockToAir(x - 2, y, z + 12);
		world.setBlockToAir(x - 2, y, z + 13);
		world.setBlockToAir(x - 2, y, z + 14);
		world.setBlockToAir(x - 2, y, z + 15);
		world.setBlockToAir(x - 2, y, z + 16);
		world.setBlockToAir(x - 2, y, z + 17);
		world.setBlockToAir(x - 2, y, z + 18);
		world.setBlockToAir(x - 2, y, z + 19);
		world.setBlockToAir(x - 2, y, z + 20);
		world.setBlock(x - 2, y, z + 21, spike, 14, 2);
		world.setBlock(x - 2, y, z + 22, bedrock);
		world.setBlock(x - 2, y, z + 23, bedrock);
		world.setBlock(x - 2, y, z + 24, spike, 14, 2);

		//15th row
		world.setBlock(x - 1, y, z - 22, eroded, 1, 2);
		world.setBlock(x - 1, y, z - 21, bedrock);
		world.setBlock(x - 1, y, z - 20, bedrock);
		world.setBlock(x - 1, y, z - 19, spike, 14, 2);
		world.setBlockToAir(x - 1, y, z - 18);
		world.setBlockToAir(x - 1, y, z - 17);
		world.setBlockToAir(x - 1, y, z - 16);
		world.setBlockToAir(x - 1, y, z - 15);
		world.setBlock(x - 1, y, z - 14, spike, 14, 2);
		world.setBlockToAir(x - 1, y, z - 13);
		world.setBlockToAir(x - 1, y, z - 12);
		world.setBlockToAir(x - 1, y, z - 11);
		world.setBlockToAir(x - 1, y, z - 10);
		world.setBlock(x - 1, y, z - 9, spike, 14, 2);
		world.setBlock(x - 1, y, z - 8, spike, 14, 2);
		world.setBlock(x - 1, y, z - 7, spike, 14, 2);
		world.setBlock(x - 1, y, z - 6, spike, 14, 2);
		world.setBlock(x - 1, y, z - 5, eroded, 1, 2);
		world.setBlock(x - 1, y, z - 4, bedrock);
		world.setBlock(x - 1, y, z - 3, bedrock);
		world.setBlock(x - 1, y, z - 2, spike, 14, 2);
		world.setBlockToAir(x - 1, y, z - 1);
		world.setBlockToAir(x - 1, y, z);
		world.setBlockToAir(x - 1, y, z + 1);
		world.setBlockToAir(x - 1, y, z + 2);
		world.setBlock(x - 1, y, z + 3, spike, 14, 2);
		world.setBlock(x - 1, y, z + 4, bedrock);
		world.setBlock(x - 1, y, z + 5, bedrock);
		world.setBlock(x - 1, y, z + 6, eroded, 1, 2);
		world.setBlock(x - 1, y, z + 7, spike, 14, 2);
		world.setBlock(x - 1, y, z + 8, spike, 14, 2);
		world.setBlock(x - 1, y, z + 9, spike, 14, 2);
		world.setBlock(x - 1, y, z + 10, spike, 14, 2);
		world.setBlockToAir(x - 1, y, z + 11);
		world.setBlockToAir(x - 1, y, z + 12);
		world.setBlockToAir(x - 1, y, z + 13);
		world.setBlockToAir(x - 1, y, z + 14);
		world.setBlock(x - 1, y, z + 15, spike, 14, 2);
		world.setBlockToAir(x - 1, y, z + 16);
		world.setBlockToAir(x - 1, y, z + 17);
		world.setBlockToAir(x - 1, y, z + 18);
		world.setBlockToAir(x - 1, y, z + 19);
		world.setBlock(x - 1, y, z + 20, spike, 14, 2);
		world.setBlock(x - 1, y, z + 21, bedrock);
		world.setBlock(x - 1, y, z + 22, bedrock);
		world.setBlock(x - 1, y, z + 23, eroded, 1, 2);

		//16th row
		world.setBlock(x, y, z - 21, spike, 14, 2);
		world.setBlock(x, y, z - 20, bedrock);
		world.setBlock(x, y, z - 19, bedrock);
		world.setBlock(x, y, z - 18, cell);
		world.setBlock(x, y, z - 17, cell);
		world.setBlock(x, y, z - 16, cell);
		world.setBlock(x, y, z - 15, cell);
		world.setBlock(x, y, z - 14, bedrock);
		world.setBlockToAir(x, y, z - 13);
		world.setBlockToAir(x, y, z - 12);

		world.setBlockToAir(x, y, z - 11);
		world.setBlockToAir(x, y, z - 10);
		world.setBlockToAir(x, y, z - 9);
		world.setBlockToAir(x, y, z - 8);
		world.setBlock(x, y, z - 7, spike, 14, 2);
		world.setBlock(x, y, z - 6, spike, 14, 2);
		world.setBlock(x, y, z - 5, spike, 14, 2);

		world.setBlock(x, y, z - 4, spike, 14, 2);
		world.setBlock(x, y, z - 3, bedrock);
		world.setBlock(x, y, z - 2, bedrock);
		world.setBlock(x, y, z - 1, cell);
		world.setBlock(x, y, z, cell);
		world.setBlock(x, y, z + 1, cell);
		world.setBlock(x, y, z + 2, cell);
		world.setBlock(x, y, z + 3, bedrock);
		world.setBlock(x, y, z + 4, bedrock);
		world.setBlock(x, y, z + 5, spike, 14, 2);

		world.setBlock(x, y, z + 6, spike, 14, 2);
		world.setBlock(x, y, z + 7, spike, 14, 2);
		world.setBlock(x, y, z + 8, spike, 14, 2);
		world.setBlockToAir(x, y, z + 9);
		world.setBlockToAir(x, y, z + 10);
		world.setBlockToAir(x, y, z + 11);
		world.setBlockToAir(x, y, z + 12);

		world.setBlockToAir(x, y, z + 13);
		world.setBlockToAir(x, y, z + 14);
		world.setBlock(x, y, z + 15, bedrock);
		world.setBlock(x, y, z + 16, cell);
		world.setBlock(x, y, z + 17, cell);
		world.setBlock(x, y, z + 18, cell);
		world.setBlock(x, y, z + 19, cell);
		world.setBlock(x, y, z + 20, bedrock);
		world.setBlock(x, y, z + 21, bedrock);
		world.setBlock(x, y, z + 22, spike, 14, 2);

		//17th row
		world.setBlock(x + 1, y, z - 20, eroded, 1, 2);
		world.setBlock(x + 1, y, z - 19, bedrock);
		world.setBlock(x + 1, y, z - 18, bedrock);
		world.setBlock(x + 1, y, z - 17, bedrock);
		world.setBlock(x + 1, y, z - 16, bedrock);
		world.setBlock(x + 1, y, z - 15, bedrock);
		world.setBlock(x + 1, y, z - 14, bedrock);
		world.setBlock(x + 1, y, z - 13, spike, 14, 2);
		world.setBlockToAir(x + 1, y, z - 12);
		world.setBlockToAir(x + 1, y, z - 11);
		world.setBlockToAir(x + 1, y, z - 10);
		world.setBlockToAir(x + 1, y, z - 9);
		world.setBlockToAir(x + 1, y, z - 8);
		world.setBlockToAir(x + 1, y, z - 7);
		world.setBlock(x + 1, y, z - 6, spike, 14, 2);
		world.setBlock(x + 1, y, z - 5, spike, 14, 2);
		world.setBlock(x + 1, y, z - 4, spike, 14, 2);
		world.setBlock(x + 1, y, z - 3, eroded, 1, 2);
		world.setBlock(x + 1, y, z - 2, bedrock);
		world.setBlock(x + 1, y, z - 1, bedrock);
		world.setBlock(x + 1, y, z, bedrock);
		world.setBlock(x + 1, y, z + 1, bedrock);
		world.setBlock(x + 1, y, z + 2, bedrock);
		world.setBlock(x + 1, y, z + 3, bedrock);
		world.setBlock(x + 1, y, z + 4, eroded, 1, 2);
		world.setBlock(x + 1, y, z + 5, spike, 14, 2);
		world.setBlock(x + 1, y, z + 6, spike, 14, 2);
		world.setBlock(x + 1, y, z + 7, spike, 14, 2);
		world.setBlockToAir(x + 1, y, z + 8);
		world.setBlockToAir(x + 1, y, z + 9);
		world.setBlockToAir(x + 1, y, z + 10);
		world.setBlockToAir(x + 1, y, z + 11);
		world.setBlockToAir(x + 1, y, z + 12);
		world.setBlockToAir(x + 1, y, z + 13);
		world.setBlock(x + 1, y, z + 14, spike, 14, 2);
		world.setBlock(x + 1, y, z + 15, bedrock);
		world.setBlock(x + 1, y, z + 16, bedrock);
		world.setBlock(x + 1, y, z + 17, bedrock);
		world.setBlock(x + 1, y, z + 18, bedrock);
		world.setBlock(x + 1, y, z + 19, bedrock);
		world.setBlock(x + 1, y, z + 20, bedrock);
		world.setBlock(x + 1, y, z + 21, eroded, 1, 2);

		//18th row
		world.setBlock(x + 2, y, z - 19, spike, 14, 2);
		world.setBlock(x + 2, y, z - 18, cell);
		world.setBlock(x + 2, y, z - 17, cell);
		world.setBlock(x + 2, y, z - 16, cell);
		world.setBlock(x + 2, y, z - 15, cell);
		world.setBlock(x + 2, y, z - 14, bedrock);
		world.setBlock(x + 2, y, z - 13, spike, 14, 2);
		world.setBlock(x + 2, y, z - 12, spike, 14, 2);
		world.setBlockToAir(x + 2, y, z - 11);
		world.setBlockToAir(x + 2, y, z - 10);
		world.setBlockToAir(x + 2, y, z - 9);
		world.setBlockToAir(x + 2, y, z - 8);
		world.setBlockToAir(x + 2, y, z - 7);
		world.setBlockToAir(x + 2, y, z - 6);
		world.setBlock(x + 2, y, z - 5, spike, 14, 2);
		world.setBlock(x + 2, y, z - 4, spike, 14, 2);
		world.setBlock(x + 2, y, z - 3, spike, 14, 2);
		world.setBlock(x + 2, y, z - 2, bedrock);
		world.setBlock(x + 2, y, z - 1, cell);
		world.setBlock(x + 2, y, z, cell);
		world.setBlock(x + 2, y, z + 1, cell);
		world.setBlock(x + 2, y, z + 2, cell);
		world.setBlock(x + 2, y, z + 3, bedrock);
		world.setBlock(x + 2, y, z + 4, spike, 14, 2);
		world.setBlock(x + 2, y, z + 5, spike, 14, 2);
		world.setBlock(x + 2, y, z + 6, spike, 14, 2);
		world.setBlockToAir(x + 2, y, z + 7);
		world.setBlockToAir(x + 2, y, z + 8);
		world.setBlockToAir(x + 2, y, z + 9);
		world.setBlockToAir(x + 2, y, z + 10);
		world.setBlockToAir(x + 2, y, z + 11);
		world.setBlockToAir(x + 2, y, z + 12);
		world.setBlock(x + 2, y, z + 13, spike, 14, 2);
		world.setBlock(x + 2, y, z + 14, spike, 14, 2);
		world.setBlock(x + 2, y, z + 15, bedrock);
		world.setBlock(x + 2, y, z + 16, cell);
		world.setBlock(x + 2, y, z + 17, cell);
		world.setBlock(x + 2, y, z + 18, cell);
		world.setBlock(x + 2, y, z + 19, cell);
		world.setBlock(x + 2, y, z + 20, spike, 14, 2);

		//19th row
		world.setBlock(x + 3, y, z - 15, eroded, 1, 2);
		world.setBlock(x + 3, y, z - 14, bedrock);
		world.setBlock(x + 3, y, z - 13, bedrock);
		world.setBlock(x + 3, y, z - 12, spike, 14, 2);
		world.setBlockToAir(x + 3, y, z - 11);
		world.setBlockToAir(x + 3, y, z - 10);
		world.setBlockToAir(x + 3, y, z - 9);
		world.setBlockToAir(x + 3, y, z - 8);
		world.setBlockToAir(x + 3, y, z - 7);
		world.setBlockToAir(x + 3, y, z - 6);
		world.setBlock(x + 3, y, z - 5, spike, 14, 2);
		world.setBlock(x + 3, y, z - 4, spike, 14, 2);
		world.setBlock(x + 3, y, z - 3, eroded, 1, 2);
		world.setBlock(x + 3, y, z - 2, bedrock);
		world.setBlock(x + 3, y, z - 1, bedrock);
		world.setBlock(x + 3, y, z, bedrock);
		world.setBlock(x + 3, y, z + 1, bedrock);
		world.setBlock(x + 3, y, z + 2, bedrock);
		world.setBlock(x + 3, y, z + 3, bedrock);
		world.setBlock(x + 3, y, z + 4, eroded, 1, 2);
		world.setBlock(x + 3, y, z + 5, spike, 14, 2);
		world.setBlock(x + 3, y, z + 6, spike, 14, 2);
		world.setBlockToAir(x + 3, y, z + 7);
		world.setBlockToAir(x + 3, y, z + 8);
		world.setBlockToAir(x + 3, y, z + 9);
		world.setBlockToAir(x + 3, y, z + 10);
		world.setBlockToAir(x + 3, y, z + 11);
		world.setBlockToAir(x + 3, y, z + 12);
		world.setBlock(x + 3, y, z + 13, spike, 14, 2);
		world.setBlock(x + 3, y, z + 14, bedrock);
		world.setBlock(x + 3, y, z + 15, bedrock);
		world.setBlock(x + 3, y, z + 16, eroded, 1, 2);

		//20th row
		world.setBlock(x + 4, y, z - 14, spike, 14, 2);
		world.setBlock(x + 4, y, z - 13, bedrock);
		world.setBlock(x + 4, y, z - 12, spike, 14, 2);
		world.setBlock(x + 4, y, z - 11, spike, 14, 2);
		world.setBlock(x + 4, y, z - 10, lamp);
		world.setBlockToAir(x + 4, y, z - 9);
		world.setBlockToAir(x + 4, y, z - 8);
		world.setBlockToAir(x + 4, y, z - 7);
		world.setBlockToAir(x + 4, y, z - 6);
		world.setBlockToAir(x + 4, y, z - 5);
		world.setBlock(x + 4, y, z - 4, spike, 14, 2);
		world.setBlock(x + 4, y, z - 3, bedrock);
		world.setBlock(x + 4, y, z - 2, bedrock);
		world.setBlock(x + 4, y, z - 1, cell);
		world.setBlock(x + 4, y, z, cell);
		world.setBlock(x + 4, y, z + 1, cell);
		world.setBlock(x + 4, y, z + 2, cell);
		world.setBlock(x + 4, y, z + 3, bedrock);
		world.setBlock(x + 4, y, z + 4, bedrock);
		world.setBlock(x + 4, y, z + 5, spike, 14, 2);
		world.setBlockToAir(x + 4, y, z + 6);
		world.setBlockToAir(x + 4, y, z + 7);
		world.setBlockToAir(x + 4, y, z + 8);
		world.setBlockToAir(x + 4, y, z + 9);
		world.setBlockToAir(x + 4, y, z + 10);
		world.setBlock(x + 4, y, z + 11, lamp);
		world.setBlock(x + 4, y, z + 12, spike, 14, 2);
		world.setBlock(x + 4, y, z + 13, spike, 14, 2);
		world.setBlock(x + 4, y, z + 14, bedrock);
		world.setBlock(x + 4, y, z + 15, spike, 14, 2);

		//21st row
		world.setBlock(x + 5, y, z - 14, spike, 14, 2);
		world.setBlock(x + 5, y, z - 13, bedrock);
		world.setBlock(x + 5, y, z - 12, bedrock);
		world.setBlock(x + 5, y, z - 11, spike, 14, 2);
		world.setBlock(x + 5, y, z - 10, spike, 14, 2);
		world.setBlockToAir(x + 5, y, z - 9);
		world.setBlockToAir(x + 5, y, z - 8);
		world.setBlockToAir(x + 5, y, z - 7);
		world.setBlockToAir(x + 5, y, z - 6);
		world.setBlockToAir(x + 5, y, z - 5);
		world.setBlockToAir(x + 5, y, z - 4);
		world.setBlockToAir(x + 5, y, z - 3);
		world.setBlock(x + 5, y, z - 2, spike, 14, 2);
		world.setBlockToAir(x + 5, y, z - 1);
		world.setBlockToAir(x + 5, y, z);
		world.setBlockToAir(x + 5, y, z + 1);
		world.setBlockToAir(x + 5, y, z + 2);
		world.setBlock(x + 5, y, z + 3, spike, 14, 2);
		world.setBlockToAir(x + 5, y, z + 4);
		world.setBlockToAir(x + 5, y, z + 5);
		world.setBlockToAir(x + 5, y, z + 6);
		world.setBlockToAir(x + 5, y, z + 7);
		world.setBlockToAir(x + 5, y, z + 8);
		world.setBlockToAir(x + 5, y, z + 9);
		world.setBlockToAir(x + 5, y, z + 10);
		world.setBlock(x + 5, y, z + 11, spike, 14, 2);
		world.setBlock(x + 5, y, z + 12, spike, 14, 2);
		world.setBlock(x + 5, y, z + 13, bedrock);
		world.setBlock(x + 5, y, z + 14, bedrock);
		world.setBlock(x + 5, y, z + 15, spike, 14, 2);

		//22nd row
		world.setBlock(x + 6, y, z - 13, spike, 14, 2);
		world.setBlock(x + 6, y, z - 12, bedrock);
		world.setBlock(x + 6, y, z - 11, bedrock);
		world.setBlock(x + 6, y, z - 10, spike, 14, 2);
		world.setBlock(x + 6, y, z - 9, spike, 14, 2);
		world.setBlock(x + 6, y, z - 8, spike, 14, 2);
		world.setBlockToAir(x + 6, y, z - 7);
		world.setBlockToAir(x + 6, y, z - 6);
		world.setBlockToAir(x + 6, y, z - 5);
		world.setBlockToAir(x + 6, y, z - 4);
		world.setBlockToAir(x + 6, y, z - 3);
		world.setBlockToAir(x + 6, y, z - 2);
		world.setBlockToAir(x + 6, y, z - 1);
		world.setBlockToAir(x + 6, y, z);
		world.setBlockToAir(x + 6, y, z + 1);
		world.setBlockToAir(x + 6, y, z + 2);
		world.setBlockToAir(x + 6, y, z + 3);
		world.setBlockToAir(x + 6, y, z + 4);
		world.setBlockToAir(x + 6, y, z + 5);
		world.setBlockToAir(x + 6, y, z + 6);
		world.setBlockToAir(x + 6, y, z + 7);
		world.setBlockToAir(x + 6, y, z + 8);
		world.setBlock(x + 6, y, z + 9, spike, 14, 2);
		world.setBlock(x + 6, y, z + 10, spike, 14, 2);
		world.setBlock(x + 6, y, z + 11, spike, 14, 2);
		world.setBlock(x + 6, y, z + 12, bedrock);
		world.setBlock(x + 6, y, z + 13, bedrock);
		world.setBlock(x + 6, y, z + 14, spike, 14, 2);

		//23rd row
		world.setBlock(x + 7, y, z - 13, eroded, 1, 2);
		world.setBlock(x + 7, y, z - 12, spike, 14, 2);
		world.setBlock(x + 7, y, z - 11, bedrock);
		world.setBlock(x + 7, y, z - 10, bedrock);
		world.setBlock(x + 7, y, z - 9, bedrock);
		world.setBlock(x + 7, y, z - 8, spike, 14, 2);
		world.setBlock(x + 7, y, z - 7, spike, 14, 2);
		world.setBlock(x + 7, y, z - 6, bedrock);
		world.setBlockToAir(x + 7, y, z - 5);
		world.setBlockToAir(x + 7, y, z - 4);
		world.setBlockToAir(x + 7, y, z - 3);
		world.setBlockToAir(x + 7, y, z - 2);
		world.setBlockToAir(x + 7, y, z - 1);
		world.setBlockToAir(x + 7, y, z);
		world.setBlockToAir(x + 7, y, z + 1);
		world.setBlockToAir(x + 7, y, z + 2);
		world.setBlockToAir(x + 7, y, z + 3);
		world.setBlockToAir(x + 7, y, z + 4);
		world.setBlockToAir(x + 7, y, z + 5);
		world.setBlockToAir(x + 7, y, z + 6);
		world.setBlock(x + 7, y, z + 7, bedrock);
		world.setBlock(x + 7, y, z + 8, spike, 14, 2);
		world.setBlock(x + 7, y, z + 9, spike, 14, 2);
		world.setBlock(x + 7, y, z + 10, bedrock);
		world.setBlock(x + 7, y, z + 11, bedrock);
		world.setBlock(x + 7, y, z + 12, bedrock);
		world.setBlock(x + 7, y, z + 13, spike, 14, 2);
		world.setBlock(x + 7, y, z + 14, eroded, 1, 2);

		//24th row
		world.setBlock(x + 8, y, z - 11, spike, 14, 2);
		world.setBlock(x + 8, y, z - 10, spike, 14, 2);
		world.setBlock(x + 8, y, z - 9, bedrock);
		world.setBlock(x + 8, y, z - 8, bedrock);
		world.setBlock(x + 8, y, z - 7, bedrock);
		world.setBlock(x + 8, y, z - 6, bedrock);
		world.setBlock(x + 8, y, z - 5, spike, 14, 2);
		world.setBlockToAir(x + 8, y, z - 4);
		world.setBlockToAir(x + 8, y, z - 3);
		world.setBlockToAir(x + 8, y, z - 2);
		world.setBlockToAir(x + 8, y, z - 1);
		world.setBlockToAir(x + 8, y, z);
		world.setBlockToAir(x + 8, y, z + 1);
		world.setBlockToAir(x + 8, y, z + 2);
		world.setBlockToAir(x + 8, y, z + 3);
		world.setBlockToAir(x + 8, y, z + 4);
		world.setBlockToAir(x + 8, y, z + 5);
		world.setBlock(x + 8, y, z + 6, spike, 14, 2);
		world.setBlock(x + 8, y, z + 7, bedrock);
		world.setBlock(x + 8, y, z + 8, bedrock);
		world.setBlock(x + 8, y, z + 9, bedrock);
		world.setBlock(x + 8, y, z + 10, bedrock);
		world.setBlock(x + 8, y, z + 11, spike, 14, 2);
		world.setBlock(x + 8, y, z + 12, spike, 14, 2);

		//25th row
		world.setBlock(x + 9, y, z - 9, eroded, 1, 2);
		world.setBlock(x + 9, y, z - 8, cell);
		world.setBlock(x + 9, y, z - 7, bedrock);
		world.setBlock(x + 9, y, z - 6, cell);
		world.setBlockToAir(x + 9, y, z - 5);
		world.setBlockToAir(x + 9, y, z - 4);
		world.setBlockToAir(x + 9, y, z - 3);
		world.setBlockToAir(x + 9, y, z - 2);
		world.setBlockToAir(x + 9, y, z - 1);
		world.setBlockToAir(x + 9, y, z);
		world.setBlockToAir(x + 9, y, z + 1);
		world.setBlockToAir(x + 9, y, z + 2);
		world.setBlockToAir(x + 9, y, z + 3);
		world.setBlockToAir(x + 9, y, z + 4);
		world.setBlockToAir(x + 9, y, z + 5);
		world.setBlockToAir(x + 9, y, z + 6);
		world.setBlock(x + 9, y, z + 7, cell);
		world.setBlock(x + 9, y, z + 8, bedrock);
		world.setBlock(x + 9, y, z + 9, cell);
		world.setBlock(x + 9, y, z + 10, eroded, 1, 2);

		//26th row
		world.setBlock(x + 10, y, z - 8, cell);
		world.setBlock(x + 10, y, z - 7, bedrock);
		world.setBlock(x + 10, y, z - 6, cell);
		world.setBlockToAir(x + 10, y, z - 5);
		world.setBlockToAir(x + 10, y, z - 4);
		world.setBlockToAir(x + 10, y, z - 3);
		world.setBlockToAir(x + 10, y, z - 2);
		world.setBlockToAir(x + 10, y, z - 1);
		world.setBlockToAir(x + 10, y, z);
		world.setBlockToAir(x + 10, y, z + 1);
		world.setBlockToAir(x + 10, y, z + 2);
		world.setBlockToAir(x + 10, y, z + 3);
		world.setBlockToAir(x + 10, y, z + 4);
		world.setBlockToAir(x + 10, y, z + 5);
		world.setBlockToAir(x + 10, y, z + 6);
		world.setBlock(x + 10, y, z + 7, cell);
		world.setBlock(x + 10, y, z + 8, bedrock);
		world.setBlock(x + 10, y, z + 9, cell);

		//27th row
		world.setBlock(x + 11, y, z - 8, cell);
		world.setBlock(x + 11, y, z - 7, bedrock);
		world.setBlock(x + 11, y, z - 6, cell);
		world.setBlockToAir(x + 11, y, z - 5);
		world.setBlockToAir(x + 11, y, z - 4);
		world.setBlockToAir(x + 11, y, z - 3);
		world.setBlockToAir(x + 11, y, z - 2);
		world.setBlockToAir(x + 11, y, z - 1);
		world.setBlockToAir(x + 11, y, z);
		world.setBlockToAir(x + 11, y, z + 1);
		world.setBlockToAir(x + 11, y, z + 2);
		world.setBlockToAir(x + 11, y, z + 3);
		world.setBlockToAir(x + 11, y, z + 4);
		world.setBlockToAir(x + 11, y, z + 5);
		world.setBlockToAir(x + 11, y, z + 6);
		world.setBlock(x + 11, y, z + 7, cell);
		world.setBlock(x + 11, y, z + 8, bedrock);
		world.setBlock(x + 11, y, z + 9, cell);

		//28th row
		world.setBlock(x + 12, y, z - 8, cell);
		world.setBlock(x + 12, y, z - 7, bedrock);
		world.setBlock(x + 12, y, z - 6, cell);
		world.setBlockToAir(x + 12, y, z - 5);
		world.setBlockToAir(x + 12, y, z - 4);
		world.setBlockToAir(x + 12, y, z - 3);
		world.setBlockToAir(x + 12, y, z - 2);
		world.setBlockToAir(x + 12, y, z - 1);
		world.setBlockToAir(x + 12, y, z);
		world.setBlockToAir(x + 12, y, z + 1);
		world.setBlockToAir(x + 12, y, z + 2);
		world.setBlockToAir(x + 12, y, z + 3);
		world.setBlockToAir(x + 12, y, z + 4);
		world.setBlockToAir(x + 12, y, z + 5);
		world.setBlockToAir(x + 12, y, z + 6);
		world.setBlock(x + 12, y, z + 7, cell);
		world.setBlock(x + 12, y, z + 8, bedrock);
		world.setBlock(x + 12, y, z + 9, cell);

		//29th row
		world.setBlock(x + 13, y, z - 8, spike, 14, 2);
		world.setBlock(x + 13, y, z - 7, bedrock);
		world.setBlock(x + 13, y, z - 6, bedrock);
		world.setBlock(x + 13, y, z - 5, spike, 14, 2);
		world.setBlockToAir(x + 13, y, z - 4);
		world.setBlockToAir(x + 13, y, z - 3);
		world.setBlockToAir(x + 13, y, z - 2);
		world.setBlockToAir(x + 13, y, z - 1);
		world.setBlockToAir(x + 13, y, z);
		world.setBlockToAir(x + 13, y, z + 1);
		world.setBlockToAir(x + 13, y, z + 2);
		world.setBlockToAir(x + 13, y, z + 3);
		world.setBlockToAir(x + 13, y, z + 4);
		world.setBlockToAir(x + 13, y, z + 5);
		world.setBlock(x + 13, y, z + 6, spike, 14, 2);
		world.setBlock(x + 13, y, z + 7, bedrock);
		world.setBlock(x + 13, y, z + 8, bedrock);
		world.setBlock(x + 13, y, z + 9, spike, 14, 2);

		//30th row
		world.setBlock(x + 14, y, z - 7, eroded, 1, 2);
		world.setBlock(x + 14, y, z - 6, bedrock);
		world.setBlock(x + 14, y, z - 5, bedrock);
		world.setBlock(x + 14, y, z - 4, spike, 14, 2);
		world.setBlockToAir(x + 14, y, z - 3);
		world.setBlockToAir(x + 14, y, z - 2);
		world.setBlockToAir(x + 14, y, z - 1);
		world.setBlockToAir(x + 14, y, z);
		world.setBlockToAir(x + 14, y, z + 1);
		world.setBlockToAir(x + 14, y, z + 2);
		world.setBlockToAir(x + 14, y, z + 3);
		world.setBlockToAir(x + 14, y, z + 4);
		world.setBlock(x + 14, y, z + 5, spike, 14, 2);
		world.setBlock(x + 14, y, z + 6, bedrock);
		world.setBlock(x + 14, y, z + 7, bedrock);
		world.setBlock(x + 14, y, z + 8, eroded, 1, 2);

		//31st row
		world.setBlock(x + 15, y, z - 6, spike, 14, 2);
		world.setBlock(x + 15, y, z - 5, bedrock);
		world.setBlock(x + 15, y, z - 4, bedrock);
		world.setBlock(x + 15, y, z - 3, spike, 14, 2);
		world.setBlockToAir(x + 15, y, z - 2);
		world.setBlockToAir(x + 15, y, z - 1);
		world.setBlockToAir(x + 15, y, z);
		world.setBlockToAir(x + 15, y, z + 1);
		world.setBlockToAir(x + 15, y, z + 2);
		world.setBlockToAir(x + 15, y, z + 3);
		world.setBlock(x + 15, y, z + 4, spike, 14, 2);
		world.setBlock(x + 15, y, z + 5, bedrock);
		world.setBlock(x + 15, y, z + 6, bedrock);
		world.setBlock(x + 15, y, z + 7, spike, 14, 2);

		//32nd row
		world.setBlock(x + 16, y, z - 5, eroded, 1, 2);
		world.setBlock(x + 16, y, z - 4, bedrock);
		world.setBlock(x + 16, y, z - 3, bedrock);
		world.setBlock(x + 16, y, z - 2, spike, 14, 2);
		world.setBlockToAir(x + 16, y, z - 1);
		world.setBlockToAir(x + 16, y, z);
		world.setBlockToAir(x + 16, y, z + 1);
		world.setBlockToAir(x + 16, y, z + 2);
		world.setBlock(x + 16, y, z + 3, spike, 14, 2);
		world.setBlock(x + 16, y, z + 4, bedrock);
		world.setBlock(x + 16, y, z + 5, bedrock);
		world.setBlock(x + 16, y, z + 6, eroded, 1, 2);

		//33rd row
		world.setBlock(x + 17, y, z - 4, spike, 14, 2);
		world.setBlock(x + 17, y, z - 3, bedrock);
		world.setBlock(x + 17, y, z - 2, bedrock);
		world.setBlock(x + 17, y, z - 1, cell);
		world.setBlock(x + 17, y, z, cell);
		world.setBlock(x + 17, y, z + 1, cell);
		world.setBlock(x + 17, y, z + 2, cell);
		world.setBlock(x + 17, y, z + 3, bedrock);
		world.setBlock(x + 17, y, z + 4, bedrock);
		world.setBlock(x + 17, y, z + 5, spike, 14, 2);

		//34th row
		world.setBlock(x + 18, y, z - 3, eroded, 1, 2);
		world.setBlock(x + 18, y ,z - 2, bedrock);
		world.setBlock(x + 18, y ,z - 1, bedrock);
		world.setBlock(x + 18, y ,z, bedrock);
		world.setBlock(x + 18, y ,z + 1, bedrock);
		world.setBlock(x + 18, y ,z + 2, bedrock);
		world.setBlock(x + 18, y ,z + 3, bedrock);
		world.setBlock(x + 18, y, z + 4, eroded, 1, 2);

		//35th row
		world.setBlock(x + 19, y, z - 2, spike, 14, 2);
		world.setBlock(x + 19, y, z - 1, cell);
		world.setBlock(x + 19, y, z, cell);
		world.setBlock(x + 19, y, z + 1, cell);
		world.setBlock(x + 19, y, z + 2, cell);
		world.setBlock(x + 19, y, z + 3, spike, 14, 2);

		y++;
		//Fifth layer
		//1st row
		world.setBlock(x - 15, y, z - 19, spike, 14, 2);
		world.setBlock(x - 15, y, z - 18, cell);
		world.setBlock(x - 15, y, z - 17, cell);
		world.setBlock(x - 15, y, z - 16, cell);
		world.setBlock(x - 15, y, z - 15, cell);
		world.setBlock(x - 15, y, z - 14, spike, 14, 2);

		world.setBlock(x - 15, y, z - 2, spike, 14, 2);
		world.setBlock(x - 15, y, z - 1, cell);
		world.setBlock(x - 15, y, z, cell);
		world.setBlock(x - 15, y, z + 1, cell);
		world.setBlock(x - 15, y, z + 2, cell);
		world.setBlock(x - 15, y, z + 3, spike, 14, 2);

		world.setBlock(x - 15, y, z + 15, spike, 14, 2);
		world.setBlock(x - 15, y, z + 16, cell);
		world.setBlock(x - 15, y, z + 17, cell);
		world.setBlock(x - 15, y, z + 18, cell);
		world.setBlock(x - 15, y, z + 19, cell);
		world.setBlock(x - 15, y, z + 20, spike, 14, 2);

		//2nd row
		world.setBlock(x - 14, y, z - 20, eroded, 1, 2);
		world.setBlock(x - 14, y, z - 19, bedrock);
		world.setBlock(x - 14, y, z - 18, bedrock);
		world.setBlock(x - 14, y, z - 17, bedrock);
		world.setBlock(x - 14, y, z - 16, bedrock);
		world.setBlock(x - 14, y, z - 15, bedrock);
		world.setBlock(x - 14, y, z - 14, bedrock);
		world.setBlock(x - 14, y, z - 13, eroded, 1, 2);

		world.setBlock(x - 14, y, z - 3, eroded, 1, 2);
		world.setBlock(x - 14, y, z - 2, bedrock);
		world.setBlock(x - 14, y, z - 1, bedrock);
		world.setBlock(x - 14, y, z, bedrock);
		world.setBlock(x - 14, y, z + 1, bedrock);
		world.setBlock(x - 14, y, z + 2, bedrock);
		world.setBlock(x - 14, y, z + 3, bedrock);
		world.setBlock(x - 14, y, z + 4, eroded, 1, 2);

		world.setBlock(x - 14, y, z + 14, eroded, 1, 2);
		world.setBlock(x - 14, y, z + 15, bedrock);
		world.setBlock(x - 14, y, z + 16, bedrock);
		world.setBlock(x - 14, y, z + 17, bedrock);
		world.setBlock(x - 14, y, z + 18, bedrock);
		world.setBlock(x - 14, y, z + 19, bedrock);
		world.setBlock(x - 14, y, z + 20, bedrock);
		world.setBlock(x - 14, y, z + 21, eroded, 1, 2);

		//3rd row
		world.setBlock(x - 13, y, z - 21, spike, 14, 2);
		world.setBlock(x - 13, y, z - 20, bedrock);
		world.setBlock(x - 13, y, z - 19, bedrock);
		world.setBlock(x - 13, y, z - 18, cell);
		world.setBlock(x - 13, y, z - 17, cell);
		world.setBlock(x - 13, y, z - 16, cell);
		world.setBlock(x - 13, y, z - 15, cell);
		world.setBlock(x - 13, y, z - 14, bedrock);
		world.setBlock(x - 13, y, z - 13, bedrock);
		world.setBlock(x - 13, y, z - 12, spike, 14, 2);

		world.setBlock(x - 13, y, z - 4, spike, 14, 2);
		world.setBlock(x - 13, y, z - 3, bedrock);
		world.setBlock(x - 13, y, z - 2, bedrock);
		world.setBlock(x - 13, y, z - 1, cell);
		world.setBlock(x - 13, y, z, cell);
		world.setBlock(x - 13, y, z + 1, cell);
		world.setBlock(x - 13, y, z + 2, cell);
		world.setBlock(x - 13, y, z + 3, bedrock);
		world.setBlock(x - 13, y, z + 4, bedrock);
		world.setBlock(x - 13, y, z + 5, spike, 14, 2);

		world.setBlock(x - 13, y, z + 13, spike, 14, 2);
		world.setBlock(x - 13, y, z + 14, bedrock);
		world.setBlock(x - 13, y, z + 15, bedrock);
		world.setBlock(x - 13, y, z + 16, cell);
		world.setBlock(x - 13, y, z + 17, cell);
		world.setBlock(x - 13, y, z + 18, cell);
		world.setBlock(x - 13, y, z + 19, cell);
		world.setBlock(x - 13, y, z + 20, bedrock);
		world.setBlock(x - 13, y, z + 21, bedrock);
		world.setBlock(x - 13, y, z + 22, spike, 14, 2);

		//4th row
		world.setBlock(x - 12, y, z - 22, eroded, 1, 2);
		world.setBlock(x - 12, y, z - 21, bedrock);
		world.setBlock(x - 12, y, z - 20, bedrock);
		world.setBlock(x - 12, y, z - 19, spike, 14, 2);
		world.setBlock(x - 12, y, z - 18, eroded, 1, 2);
		world.setBlock(x - 12, y, z - 17, eroded, 1, 2);
		world.setBlock(x - 12, y, z - 16, eroded, 1, 2);
		world.setBlock(x - 12, y, z - 15, eroded, 1, 2);
		world.setBlock(x - 12, y, z - 14, spike, 14, 2);
		world.setBlock(x - 12, y, z - 13, bedrock);
		world.setBlock(x - 12, y, z - 12, bedrock);
		world.setBlock(x - 12, y, z - 11, eroded, 1, 2);

		world.setBlock(x - 12, y, z - 5, eroded, 1, 2);
		world.setBlock(x - 12, y, z - 4, bedrock);
		world.setBlock(x - 12, y, z - 3, bedrock);
		world.setBlock(x - 12, y, z - 2, spike, 14, 2);
		world.setBlock(x - 12, y, z - 1, eroded, 1, 2);
		world.setBlock(x - 12, y, z, eroded, 1, 2);
		world.setBlock(x - 12, y, z + 1, eroded, 1, 2);
		world.setBlock(x - 12, y, z + 2, eroded, 1, 2);
		world.setBlock(x - 12, y, z + 3, spike, 14, 2);
		world.setBlock(x - 12, y, z + 4, bedrock);
		world.setBlock(x - 12, y, z + 5, bedrock);
		world.setBlock(x - 12, y, z + 6, eroded, 1, 2);

		world.setBlock(x - 12, y, z + 12, eroded, 1, 2);
		world.setBlock(x - 12, y, z + 13, bedrock);
		world.setBlock(x - 12, y, z + 14, bedrock);
		world.setBlock(x - 12, y, z + 15, spike, 14, 2);
		world.setBlock(x - 12, y, z + 16, eroded, 1, 2);
		world.setBlock(x - 12, y, z + 17, eroded, 1, 2);
		world.setBlock(x - 12, y, z + 18, eroded, 1, 2);
		world.setBlock(x - 12, y, z + 19, eroded, 1, 2);
		world.setBlock(x - 12, y, z + 20, spike, 14, 2);
		world.setBlock(x - 12, y, z + 21, bedrock);
		world.setBlock(x - 12, y, z + 22, bedrock);
		world.setBlock(x - 12, y, z + 23, eroded, 1, 2);

		//5th row
		world.setBlock(x - 11, y, z - 23, spike, 14, 2);
		world.setBlock(x - 11, y, z - 22, bedrock);
		world.setBlock(x - 11, y, z - 21, bedrock);
		world.setBlock(x - 11, y, z - 20, spike, 14, 2);
		world.setBlock(x - 11, y, z - 19, eroded, 1, 2);
		world.setBlockToAir(x - 11, y, z - 18);
		world.setBlockToAir(x - 11, y, z - 17);
		world.setBlockToAir(x - 11, y, z - 16);
		world.setBlockToAir(x - 11, y, z - 15);
		world.setBlock(x - 11, y, z - 14, eroded, 1, 2);
		world.setBlock(x - 11, y, z - 13, spike, 14, 2);
		world.setBlock(x - 11, y, z - 12, bedrock);
		world.setBlock(x - 11, y, z - 11, bedrock);
		world.setBlock(x - 11, y, z - 10, spike, 14, 2);

		world.setBlock(x - 11, y, z - 6, spike, 14, 2);
		world.setBlock(x - 11, y, z - 5, bedrock);
		world.setBlock(x - 11, y, z - 4, bedrock);
		world.setBlock(x - 11, y, z - 3, spike, 14, 2);
		world.setBlock(x - 11, y, z - 2, eroded, 1, 2);
		world.setBlockToAir(x - 11, y, z - 1);
		world.setBlockToAir(x - 11, y, z);
		world.setBlockToAir(x - 11, y, z + 1);
		world.setBlockToAir(x - 11, y, z + 2);
		world.setBlock(x - 11, y, z + 3, eroded, 1, 2);
		world.setBlock(x - 11, y, z + 4, spike, 14, 2);
		world.setBlock(x - 11, y, z + 5, bedrock);
		world.setBlock(x - 11, y, z + 6, bedrock);
		world.setBlock(x - 11, y, z + 7, spike, 14, 2);

		world.setBlock(x - 11, y, z + 11, spike, 14, 2);
		world.setBlock(x - 11, y, z + 12, bedrock);
		world.setBlock(x - 11, y, z + 13, bedrock);
		world.setBlock(x - 11, y, z + 14, spike, 14, 2);
		world.setBlock(x - 11, y, z + 15, eroded, 1, 2);
		world.setBlockToAir(x - 11, y, z + 16);
		world.setBlockToAir(x - 11, y, z + 17);
		world.setBlockToAir(x - 11, y, z + 18);
		world.setBlockToAir(x - 11, y, z + 19);
		world.setBlock(x - 11, y, z + 20, eroded, 1, 2);
		world.setBlock(x - 11, y, z + 21, spike, 14, 2);
		world.setBlock(x - 11, y, z + 22, bedrock);
		world.setBlock(x - 11, y, z + 23, bedrock);
		world.setBlock(x - 11, y, z + 24, spike, 14, 2);

		//6th row
		world.setBlock(x - 10, y, z - 24, eroded, 1, 2);
		world.setBlock(x - 10, y, z - 23, bedrock);
		world.setBlock(x - 10, y, z - 22, bedrock);
		world.setBlock(x - 10, y, z - 21, spike, 14, 2);
		world.setBlock(x - 10, y, z - 20, eroded, 1, 2);
		world.setBlockToAir(x - 10, y, z - 19);
		world.setBlockToAir(x - 10, y, z - 18);
		world.setBlockToAir(x - 10, y, z - 17);
		world.setBlockToAir(x - 10, y, z - 16);
		world.setBlockToAir(x - 10, y, z - 15);
		world.setBlockToAir(x - 10, y, z - 14);
		world.setBlock(x - 10, y, z - 13, eroded, 1, 2);
		world.setBlock(x - 10, y, z - 12, spike, 14, 2);
		world.setBlock(x - 10, y, z - 11, bedrock);
		world.setBlock(x - 10, y, z - 10, bedrock);
		world.setBlock(x - 10, y, z - 9, eroded, 1, 2);
		world.setBlock(x - 10, y, z - 8, spike, 14, 2);
		world.setBlock(x - 10, y, z - 7, eroded, 1, 2);
		world.setBlock(x - 10, y, z - 6, bedrock);
		world.setBlock(x - 10, y, z - 5, bedrock);
		world.setBlock(x - 10, y, z - 4, spike, 14, 2);
		world.setBlock(x - 10, y, z - 3, eroded, 1, 2);
		world.setBlockToAir(x - 10, y, z - 2);
		world.setBlockToAir(x - 10, y, z - 1);
		world.setBlockToAir(x - 10, y, z);
		world.setBlockToAir(x - 10, y, z + 1);
		world.setBlockToAir(x - 10, y, z + 2);
		world.setBlockToAir(x - 10, y, z + 3);
		world.setBlock(x - 10, y, z + 4, eroded, 1, 2);
		world.setBlock(x - 10, y, z + 5, spike, 14, 2);
		world.setBlock(x - 10, y, z + 6, bedrock);
		world.setBlock(x - 10, y, z + 7, bedrock);
		world.setBlock(x - 10, y, z + 8, eroded, 1, 2);
		world.setBlock(x - 10, y, z + 9, spike, 14, 2);
		world.setBlock(x - 10, y, z + 10, eroded, 1, 2);
		world.setBlock(x - 10, y, z + 11, bedrock);
		world.setBlock(x - 10, y, z + 12, bedrock);
		world.setBlock(x - 10, y, z + 13, spike, 14, 2);
		world.setBlock(x - 10, y, z + 14, eroded, 1, 2);
		world.setBlockToAir(x - 10, y, z + 15);
		world.setBlockToAir(x - 10, y, z + 16);
		world.setBlockToAir(x - 10, y, z + 17);
		world.setBlockToAir(x - 10, y, z + 18);
		world.setBlockToAir(x - 10, y, z + 19);
		world.setBlockToAir(x - 10, y, z + 20);
		world.setBlock(x - 10, y, z + 21, eroded, 1, 2);
		world.setBlock(x - 10, y, z + 22, spike, 14, 2);
		world.setBlock(x - 10, y, z + 23, bedrock);
		world.setBlock(x - 10, y, z + 24, bedrock);
		world.setBlock(x - 10, y, z + 25, eroded, 1, 2);

		//7th row
		world.setBlock(x - 9, y, z - 25, spike, 14, 2);
		world.setBlock(x - 9, y, z - 24, bedrock);
		world.setBlock(x - 9, y, z - 23, bedrock);
		world.setBlock(x - 9, y, z - 22, spike, 14, 2);
		world.setBlock(x - 9, y, z - 21, eroded, 1, 2);
		world.setBlockToAir(x - 9, y, z - 20);
		world.setBlockToAir(x - 9, y, z - 19);
		world.setBlockToAir(x - 9, y, z - 18);
		world.setBlock(x - 9, y, z - 17, eroded, 1, 2);
		world.setBlock(x - 9, y, z - 16, eroded, 1, 2);
		world.setBlockToAir(x - 9, y, z - 15);
		world.setBlockToAir(x - 9, y, z - 14);
		world.setBlockToAir(x - 9, y, z - 13);
		world.setBlock(x - 9, y, z - 12, eroded, 1, 2);
		world.setBlock(x - 9, y, z - 11, spike, 14, 2);
		world.setBlock(x - 9, y, z - 10, bedrock);
		world.setBlock(x - 9, y, z - 9, bedrock);
		world.setBlock(x - 9, y, z - 8, bedrock);
		world.setBlock(x - 9, y, z - 7, bedrock);
		world.setBlock(x - 9, y, z - 6, bedrock);
		world.setBlock(x - 9, y, z - 5, spike, 14, 2);
		world.setBlock(x - 9, y, z - 4, eroded, 1, 2);
		world.setBlockToAir(x - 9, y, z - 3);
		world.setBlockToAir(x - 9, y, z - 2);
		world.setBlockToAir(x - 9, y, z - 1);
		world.setBlock(x - 9, y, z, eroded, 1, 2);
		world.setBlock(x - 9, y, z + 1, eroded, 1, 2);
		world.setBlockToAir(x - 9, y, z + 2);
		world.setBlockToAir(x - 9, y, z + 3);
		world.setBlockToAir(x - 9, y, z + 4);
		world.setBlock(x - 9, y, z + 5, eroded, 1, 2);
		world.setBlock(x - 9, y, z + 6, spike, 14, 2);
		world.setBlock(x - 9, y, z + 7, bedrock);
		world.setBlock(x - 9, y, z + 8, bedrock);
		world.setBlock(x - 9, y, z + 9, bedrock);
		world.setBlock(x - 9, y, z + 10, bedrock);
		world.setBlock(x - 9, y, z + 11, bedrock);
		world.setBlock(x - 9, y, z + 12, spike, 14, 2);
		world.setBlock(x - 9, y, z + 13, eroded, 1, 2);
		world.setBlockToAir(x - 9, y, z + 14);
		world.setBlockToAir(x - 9, y, z + 15);
		world.setBlockToAir(x - 9, y, z + 16);
		world.setBlock(x - 9, y, z + 17, eroded, 1, 2);
		world.setBlock(x - 9, y, z + 18, eroded, 1, 2);
		world.setBlockToAir(x - 9, y, z + 19);
		world.setBlockToAir(x - 9, y, z + 20);
		world.setBlockToAir(x - 9, y, z + 21);
		world.setBlock(x - 9, y, z + 22, eroded, 1, 2);
		world.setBlock(x - 9, y, z + 23, spike, 14, 2);
		world.setBlock(x - 9, y, z + 24, bedrock);
		world.setBlock(x - 9, y, z + 25, bedrock);
		world.setBlock(x - 9, y, z + 26, spike, 14, 2);

		//8th row
		world.setBlock(x - 8, y, z - 25, cell);
		world.setBlock(x - 8, y, z - 24, bedrock);
		world.setBlock(x - 8, y, z - 23, cell);
		world.setBlock(x - 8, y, z - 22, eroded, 1, 2);
		world.setBlockToAir(x - 8, y, z - 21);
		world.setBlockToAir(x - 8, y, z - 20);
		world.setBlockToAir(x - 8, y, z - 19);
		world.setBlock(x - 8, y, z - 18, eroded, 1, 2);
		world.setBlock(x - 8, y, z - 17, eroded, 2, 2);
		world.setBlock(x - 8, y, z - 16, eroded, 2, 2);
		world.setBlock(x - 8, y, z - 15, eroded, 1, 2);
		world.setBlockToAir(x - 8, y, z - 14);
		world.setBlockToAir(x - 8, y, z - 13);
		world.setBlockToAir(x - 8, y, z - 12);
		world.setBlock(x - 8, y, z - 11, eroded, 1, 2);
		world.setBlock(x - 8, y, z - 10, cell);
		world.setBlock(x - 8, y, z - 9, bedrock);
		world.setBlock(x - 8, y, z - 8, cell);
		world.setBlock(x - 8, y, z - 7, bedrock);
		world.setBlock(x - 8, y, z - 6, cell);
		world.setBlock(x - 8, y, z - 5, eroded, 1, 2);
		world.setBlockToAir(x - 8, y, z - 4);
		world.setBlockToAir(x - 8, y, z - 3);
		world.setBlockToAir(x - 8, y, z - 2);
		world.setBlock(x - 8, y, z - 1, eroded, 1, 2);
		world.setBlock(x - 8, y, z, eroded, 2, 2);
		world.setBlock(x - 8, y, z + 1, eroded, 2, 2);
		world.setBlock(x - 8, y, z + 2, eroded, 1, 2);
		world.setBlockToAir(x - 8, y, z + 3);
		world.setBlockToAir(x - 8, y, z + 4);
		world.setBlockToAir(x - 8, y, z + 5);
		world.setBlock(x - 8, y, z + 6, eroded, 1, 2);
		world.setBlock(x - 8, y, z + 7, cell);
		world.setBlock(x - 8, y, z + 8, bedrock);
		world.setBlock(x - 8, y, z + 9, cell);
		world.setBlock(x - 8, y, z + 10, bedrock);
		world.setBlock(x - 8, y, z + 11, cell);
		world.setBlock(x - 8, y, z + 12, eroded, 1, 2);
		world.setBlockToAir(x - 8, y, z + 13);
		world.setBlockToAir(x - 8, y, z + 14);
		world.setBlockToAir(x - 8, y, z + 15);
		world.setBlock(x - 8, y, z + 16, eroded, 1, 2);
		world.setBlock(x - 8, y, z + 17, eroded, 2, 2);
		world.setBlock(x - 8, y, z + 18, eroded, 2, 2);
		world.setBlock(x - 8, y, z + 19, eroded, 1, 2);
		world.setBlockToAir(x - 8, y, z + 20);
		world.setBlockToAir(x - 8, y, z + 21);
		world.setBlockToAir(x - 8, y, z + 22);
		world.setBlock(x - 8, y, z + 23, eroded, 1, 2);
		world.setBlock(x - 8, y, z + 24, cell);
		world.setBlock(x - 8, y, z + 25, bedrock);
		world.setBlock(x - 8, y, z + 26, cell);

		//9th row
		world.setBlock(x - 7, y, z - 25, cell);
		world.setBlock(x - 7, y, z - 24, bedrock);
		world.setBlock(x - 7, y, z - 23, cell);
		world.setBlock(x - 7, y, z - 22, eroded, 1, 2);
		world.setBlockToAir(x - 7, y, z - 21);
		world.setBlockToAir(x - 7, y, z - 20);
		world.setBlock(x - 7, y, z - 19, eroded, 1, 2);
		world.setBlock(x - 7, y, z - 18, eroded, 2, 2);
		world.setBlock(x - 7, y, z - 17, eroded, 2, 2);
		world.setBlock(x - 7, y, z - 16, eroded, 2, 2);
		world.setBlock(x - 7, y, z - 15, eroded, 2, 2);
		world.setBlock(x - 7, y, z - 14, eroded, 1, 2);
		world.setBlockToAir(x - 7, y, z - 13);
		world.setBlockToAir(x - 7, y, z - 12);
		world.setBlock(x - 7, y, z - 11, eroded, 1, 2);
		world.setBlock(x - 7, y, z - 10, cell);
		world.setBlock(x - 7, y, z - 9, bedrock);
		world.setBlock(x - 7, y, z - 8, cell);
		world.setBlock(x - 7, y, z - 7, bedrock);
		world.setBlock(x - 7, y, z - 6, cell);
		world.setBlock(x - 7, y, z - 5, eroded, 1, 2);
		world.setBlockToAir(x - 7, y, z - 4);
		world.setBlockToAir(x - 7, y, z - 3);
		world.setBlock(x - 7, y, z - 2, eroded, 1, 2);
		world.setBlock(x - 7, y, z - 1, eroded, 2, 2);
		world.setBlock(x - 7, y, z, eroded, 2, 2);
		world.setBlock(x - 7, y, z + 1, eroded, 2, 2);
		world.setBlock(x - 7, y, z + 2, eroded, 2, 2);
		world.setBlock(x - 7, y, z + 3, eroded, 1, 2);
		world.setBlockToAir(x - 7, y, z + 4);
		world.setBlockToAir(x - 7, y, z + 5);
		world.setBlock(x - 7, y, z + 6, eroded, 1, 2);
		world.setBlock(x - 7, y, z + 7, cell);
		world.setBlock(x - 7, y, z + 8, bedrock);
		world.setBlock(x - 7, y, z + 9, cell);
		world.setBlock(x - 7, y, z + 10, bedrock);
		world.setBlock(x - 7, y, z + 11, cell);
		world.setBlock(x - 7, y, z + 12, eroded, 1, 2);
		world.setBlockToAir(x - 7, y, z + 13);
		world.setBlockToAir(x - 7, y, z + 14);
		world.setBlock(x - 7, y, z + 15, eroded, 1, 2);
		world.setBlock(x - 7, y, z + 16, eroded, 2, 2);
		world.setBlock(x - 7, y, z + 17, eroded, 2, 2);
		world.setBlock(x - 7, y, z + 18, eroded, 2, 2);
		world.setBlock(x - 7, y, z + 19, eroded, 2, 2);
		world.setBlock(x - 7, y, z + 20, eroded, 1, 2);
		world.setBlockToAir(x - 7, y, z + 21);
		world.setBlockToAir(x - 7, y, z + 22);
		world.setBlock(x - 7, y, z + 23, eroded, 1, 2);
		world.setBlock(x - 7, y, z + 24, cell);
		world.setBlock(x - 7, y, z + 25, bedrock);
		world.setBlock(x - 7, y, z + 26, cell);

		//10th row
		world.setBlock(x - 6, y, z - 25, cell);
		world.setBlock(x - 6, y, z - 24, bedrock);
		world.setBlock(x - 6, y, z - 23, cell);
		world.setBlock(x - 6, y, z - 22, eroded, 1, 2);
		world.setBlockToAir(x - 6, y, z - 21);
		world.setBlockToAir(x - 6, y, z - 20);
		world.setBlock(x - 6, y, z - 19, eroded, 1, 2);
		world.setBlock(x - 6, y, z - 18, eroded, 2, 2);
		world.setBlock(x - 6, y, z - 17, eroded, 2, 2);
		world.setBlock(x - 6, y, z - 16, eroded, 2, 2);
		world.setBlock(x - 6, y, z - 15, eroded, 2, 2);
		world.setBlock(x - 6, y, z - 14, eroded, 1, 2);
		world.setBlockToAir(x - 6, y, z - 13);
		world.setBlockToAir(x - 6, y, z - 12);
		world.setBlock(x - 6, y, z - 11, eroded, 1, 2);
		world.setBlock(x - 6, y, z - 10, cell);
		world.setBlock(x - 6, y, z - 9, bedrock);
		world.setBlock(x - 6, y, z - 8, cell);
		world.setBlock(x - 6, y, z - 7, bedrock);
		world.setBlock(x - 6, y, z - 6, cell);
		world.setBlock(x - 6, y, z - 5, eroded, 1, 2);
		world.setBlockToAir(x - 6, y, z - 4);
		world.setBlockToAir(x - 6, y, z - 3);
		world.setBlock(x - 6, y, z - 2, eroded, 1, 2);
		world.setBlock(x - 6, y, z - 1, eroded, 2, 2);
		world.setBlock(x - 6, y, z, eroded, 2, 2);
		world.setBlock(x - 6, y, z + 1, eroded, 2, 2);
		world.setBlock(x - 6, y, z + 2, eroded, 2, 2);
		world.setBlock(x - 6, y, z + 3, eroded, 1, 2);
		world.setBlockToAir(x - 6, y, z + 4);
		world.setBlockToAir(x - 6, y, z + 5);
		world.setBlock(x - 6, y, z + 6, eroded, 1, 2);
		world.setBlock(x - 6, y, z + 7, cell);
		world.setBlock(x - 6, y, z + 8, bedrock);
		world.setBlock(x - 6, y, z + 9, cell);
		world.setBlock(x - 6, y, z + 10, bedrock);
		world.setBlock(x - 6, y, z + 11, cell);
		world.setBlock(x - 6, y, z + 12, eroded, 1, 2);
		world.setBlockToAir(x - 6, y, z + 13);
		world.setBlockToAir(x - 6, y, z + 14);
		world.setBlock(x - 6, y, z + 15, eroded, 1, 2);
		world.setBlock(x - 6, y, z + 16, eroded, 2, 2);
		world.setBlock(x - 6, y, z + 17, eroded, 2, 2);
		world.setBlock(x - 6, y, z + 18, eroded, 2, 2);
		world.setBlock(x - 6, y, z + 19, eroded, 2, 2);
		world.setBlock(x - 6, y, z + 20, eroded, 1, 2);
		world.setBlockToAir(x - 6, y, z + 21);
		world.setBlockToAir(x - 6, y, z + 22);
		world.setBlock(x - 6, y, z + 23, eroded, 1, 2);
		world.setBlock(x - 6, y, z + 24, cell);
		world.setBlock(x - 6, y, z + 25, bedrock);
		world.setBlock(x - 6, y, z + 26, cell);

		//11th row
		world.setBlock(x - 5, y, z - 25, cell);
		world.setBlock(x - 5, y, z - 24, bedrock);
		world.setBlock(x - 5, y, z - 23, cell);
		world.setBlock(x - 5, y, z - 22, eroded, 1, 2);
		world.setBlockToAir(x - 5, y, z - 21);
		world.setBlockToAir(x - 5, y, z - 20);
		world.setBlockToAir(x - 5, y, z - 19);
		world.setBlock(x - 5, y, z - 18, eroded, 1, 2);
		world.setBlock(x - 5, y, z - 17, eroded, 2, 2);
		world.setBlock(x - 5, y, z - 16, eroded, 2, 2);
		world.setBlock(x - 5, y, z - 15, eroded, 1, 2);
		world.setBlockToAir(x - 5, y, z - 14);
		world.setBlockToAir(x - 5, y, z - 13);
		world.setBlockToAir(x - 5, y, z - 12);
		world.setBlock(x - 5, y, z - 11, eroded, 1, 2);
		world.setBlock(x - 5, y, z - 10, cell);
		world.setBlock(x - 5, y, z - 9, bedrock);
		world.setBlock(x - 5, y, z - 8, cell);
		world.setBlock(x - 5, y, z - 7, bedrock);
		world.setBlock(x - 5, y, z - 6, cell);
		world.setBlock(x - 5, y, z - 5, eroded, 1, 2);
		world.setBlockToAir(x - 5, y, z - 4);
		world.setBlockToAir(x - 5, y, z - 3);
		world.setBlockToAir(x - 5, y, z - 2);
		world.setBlock(x - 5, y, z - 1, eroded, 1, 2);
		world.setBlock(x - 5, y, z, eroded, 2, 2);
		world.setBlock(x - 5, y, z + 1, eroded, 2, 2);
		world.setBlock(x - 5, y, z + 2, eroded, 1, 2);
		world.setBlockToAir(x - 5, y, z + 3);
		world.setBlockToAir(x - 5, y, z + 4);
		world.setBlockToAir(x - 5, y, z + 5);
		world.setBlock(x - 5, y, z + 6, eroded, 1, 2);
		world.setBlock(x - 5, y, z + 7, cell);
		world.setBlock(x - 5, y, z + 8, bedrock);
		world.setBlock(x - 5, y, z + 9, cell);
		world.setBlock(x - 5, y, z + 10, bedrock);
		world.setBlock(x - 5, y, z + 11, cell);
		world.setBlock(x - 5, y, z + 12, eroded, 1, 2);
		world.setBlockToAir(x - 5, y, z + 13);
		world.setBlockToAir(x - 5, y, z + 14);
		world.setBlockToAir(x - 5, y, z + 15);
		world.setBlock(x - 5, y, z + 16, eroded, 1, 2);
		world.setBlock(x - 5, y, z + 17, eroded, 2, 2);
		world.setBlock(x - 5, y, z + 18, eroded, 2, 2);
		world.setBlock(x - 5, y, z + 19, eroded, 1, 2);
		world.setBlockToAir(x - 5, y, z + 20);
		world.setBlockToAir(x - 5, y, z + 21);
		world.setBlockToAir(x - 5, y, z + 22);
		world.setBlock(x - 5, y, z + 23, eroded, 1, 2);
		world.setBlock(x - 5, y, z + 24, cell);
		world.setBlock(x - 5, y, z + 25, bedrock);
		world.setBlock(x - 5, y, z + 26, cell);

		//12th row
		world.setBlock(x - 4, y, z - 25, spike, 14, 2);
		world.setBlock(x - 4, y, z - 24, bedrock);
		world.setBlock(x - 4, y, z - 23, bedrock);
		world.setBlock(x - 4, y, z - 22, spike, 14, 2);
		world.setBlock(x - 4, y, z - 21, eroded, 1, 2);
		world.setBlockToAir(x - 4, y, z - 20);
		world.setBlockToAir(x - 4, y, z - 19);
		world.setBlockToAir(x - 4, y, z - 18);
		world.setBlock(x - 4, y, z - 17, eroded, 1, 2);
		world.setBlock(x - 4, y, z - 16, eroded, 1, 2);
		world.setBlockToAir(x - 4, y, z - 15);
		world.setBlockToAir(x - 4, y, z - 14);
		world.setBlockToAir(x - 4, y, z - 13);
		world.setBlock(x - 4, y, z - 12, eroded, 1, 2);
		world.setBlock(x - 4, y, z - 11, spike, 14, 2);
		world.setBlock(x - 4, y, z - 10, bedrock);
		world.setBlock(x - 4, y, z - 9, bedrock);
		world.setBlock(x - 4, y, z - 8, bedrock);
		world.setBlock(x - 4, y, z - 7, bedrock);
		world.setBlock(x - 4, y, z - 6, bedrock);
		world.setBlock(x - 4, y, z - 5, spike, 14, 2);
		world.setBlock(x - 4, y, z - 4, eroded, 1, 2);
		world.setBlockToAir(x - 4, y, z - 3);
		world.setBlockToAir(x - 4, y, z - 2);
		world.setBlockToAir(x - 4, y, z - 1); 
		world.setBlock(x - 4, y, z, eroded, 1, 2);
		world.setBlock(x - 4, y, z + 1, eroded, 1, 2);
		world.setBlockToAir(x - 4, y, z + 2);
		world.setBlockToAir(x - 4, y, z + 3);
		world.setBlockToAir(x - 4, y, z + 4);
		world.setBlock(x - 4, y, z + 5, eroded, 1, 2);
		world.setBlock(x - 4, y, z + 6, spike, 14, 2);
		world.setBlock(x - 4, y, z + 7, bedrock);
		world.setBlock(x - 4, y, z + 8, bedrock);
		world.setBlock(x - 4, y, z + 9, bedrock);
		world.setBlock(x - 4, y, z + 10, bedrock);
		world.setBlock(x - 4, y, z + 11, bedrock);
		world.setBlock(x - 4, y, z + 12, spike, 14, 2);
		world.setBlock(x - 4, y, z + 13, eroded, 1, 2);
		world.setBlockToAir(x - 4, y, z + 14);
		world.setBlockToAir(x - 4, y, z + 15);
		world.setBlockToAir(x - 4, y, z + 16);
		world.setBlock(x - 4, y, z + 17, eroded, 1, 2);
		world.setBlock(x - 4, y, z + 18, eroded, 1, 2);
		world.setBlockToAir(x - 4, y, z + 19);
		world.setBlockToAir(x - 4, y, z + 20);
		world.setBlockToAir(x - 4, y, z + 21);
		world.setBlock(x - 4, y, z + 22, eroded, 1, 2);
		world.setBlock(x - 4, y, z + 23, spike, 14, 2);
		world.setBlock(x - 4, y, z + 24, bedrock);
		world.setBlock(x - 4, y, z + 25, bedrock);
		world.setBlock(x - 4, y, z + 26, spike, 14, 2);

		//13th row
		world.setBlock(x - 3, y, z - 24, eroded, 1, 2);
		world.setBlock(x - 3, y, z - 23, bedrock);
		world.setBlock(x - 3, y, z - 22, bedrock);
		world.setBlock(x - 3, y, z - 21, spike, 14, 2);
		world.setBlock(x - 3, y, z - 20, eroded, 1, 2);
		world.setBlockToAir(x - 3, y, z - 19);
		world.setBlockToAir(x - 3, y, z - 18);
		world.setBlockToAir(x - 3, y, z - 17);
		world.setBlockToAir(x - 3, y, z - 16);
		world.setBlockToAir(x - 3, y, z - 15);
		world.setBlockToAir(x - 3, y, z - 14);
		world.setBlock(x - 3, y, z - 13, eroded, 1, 2);
		world.setBlock(x - 3, y, z - 12, spike, 14, 2);
		world.setBlock(x - 3, y, z - 11, bedrock);
		world.setBlock(x - 3, y, z - 10, bedrock);
		world.setBlock(x - 3, y, z - 9, eroded, 1, 2);
		world.setBlock(x - 3, y, z - 8, spike, 14, 2);
		world.setBlock(x - 3, y, z - 7, eroded, 1, 2);
		world.setBlock(x - 3, y, z - 6, bedrock);
		world.setBlock(x - 3, y, z - 5, bedrock);
		world.setBlock(x - 3, y, z - 4, spike, 14, 2);
		world.setBlock(x - 3, y, z - 3, eroded, 1, 2);
		world.setBlockToAir(x - 3, y, z - 2);
		world.setBlockToAir(x - 3, y, z - 1);
		world.setBlockToAir(x - 3, y, z);
		world.setBlockToAir(x - 3, y, z + 1);
		world.setBlockToAir(x - 3, y, z + 2);
		world.setBlockToAir(x - 3, y, z + 3);
		world.setBlock(x - 3, y, z + 4, eroded, 1, 2);
		world.setBlock(x - 3, y, z + 5, spike, 14, 2);
		world.setBlock(x - 3, y, z + 6, bedrock);
		world.setBlock(x - 3, y, z + 7, bedrock);
		world.setBlock(x - 3, y, z + 8, eroded, 1, 2);
		world.setBlock(x - 3, y, z + 9, spike, 14, 2);
		world.setBlock(x - 3, y, z + 10, eroded, 1, 2);
		world.setBlock(x - 3, y, z + 11, bedrock);
		world.setBlock(x - 3, y, z + 12, bedrock);
		world.setBlock(x - 3, y, z + 13, spike, 14, 2);
		world.setBlock(x - 3, y, z + 14, eroded, 1, 2);
		world.setBlockToAir(x - 3, y, z + 15);
		world.setBlockToAir(x - 3, y, z + 16);
		world.setBlockToAir(x - 3, y, z + 17);
		world.setBlockToAir(x - 3, y, z + 18);
		world.setBlockToAir(x - 3, y, z + 19);
		world.setBlockToAir(x - 3, y, z + 20);
		world.setBlock(x - 3, y, z + 21, eroded, 1, 2);
		world.setBlock(x - 3, y, z + 22, spike, 14, 2);
		world.setBlock(x - 3, y, z + 23, bedrock);
		world.setBlock(x - 3, y, z + 24, bedrock);
		world.setBlock(x - 3, y, z + 25, eroded, 1, 2);

		//14th row
		world.setBlock(x - 2, y, z - 23, spike, 14, 2);
		world.setBlock(x - 2, y, z - 22, bedrock);
		world.setBlock(x - 2, y, z - 21, bedrock);
		world.setBlock(x - 2, y, z - 20, spike, 14, 2);
		world.setBlock(x - 2, y, z - 19, eroded, 1, 2);
		world.setBlockToAir(x - 2, y, z - 18);
		world.setBlockToAir(x - 2, y, z - 17);
		world.setBlockToAir(x - 2, y, z - 16);
		world.setBlockToAir(x - 2, y, z - 15);
		world.setBlock(x - 2, y, z - 14, eroded, 1, 2);
		world.setBlock(x - 2, y, z - 13, spike, 14, 2);
		world.setBlock(x - 2, y, z - 12, bedrock);
		world.setBlock(x - 2, y, z - 11, bedrock);
		world.setBlock(x - 2, y, z - 10, spike, 14, 2);
		world.setBlock(x - 2, y, z - 9, spike, 14, 2);
		world.setBlock(x - 2, y, z - 8, spike, 14, 2);
		world.setBlock(x - 2, y, z - 7, spike, 14, 2);
		world.setBlock(x - 2, y, z - 6, spike, 14, 2);
		world.setBlock(x - 2, y, z - 5, bedrock);
		world.setBlock(x - 2, y, z - 4, bedrock);
		world.setBlock(x - 2, y, z - 3, spike, 14, 2);
		world.setBlock(x - 2, y, z - 2, eroded, 1, 2);
		world.setBlockToAir(x - 2, y, z - 1);
		world.setBlockToAir(x - 2, y, z);
		world.setBlockToAir(x - 2, y, z + 1);
		world.setBlockToAir(x - 2, y, z + 2);
		world.setBlock(x - 2, y, z + 3, eroded, 1, 2);
		world.setBlock(x - 2, y, z + 4, spike, 14, 2);
		world.setBlock(x - 2, y, z + 5, bedrock);
		world.setBlock(x - 2, y, z + 6, bedrock);
		world.setBlock(x - 2, y, z + 7, spike, 14, 2);
		world.setBlock(x - 2, y, z + 8, spike, 14, 2);
		world.setBlock(x - 2, y, z + 9, spike, 14, 2);
		world.setBlock(x - 2, y, z + 10, spike, 14, 2);
		world.setBlock(x - 2, y, z + 11, spike, 14, 2);
		world.setBlock(x - 2, y, z + 12, bedrock);
		world.setBlock(x - 2, y, z + 13, bedrock);
		world.setBlock(x - 2, y, z + 14, spike, 14, 2);
		world.setBlock(x - 2, y, z + 15, eroded, 1, 2);
		world.setBlockToAir(x - 2, y, z + 16);
		world.setBlockToAir(x - 2, y, z + 17);
		world.setBlockToAir(x - 2, y, z + 18);
		world.setBlockToAir(x - 2, y, z + 19);
		world.setBlock(x - 2, y, z + 20, eroded, 1, 2);
		world.setBlock(x - 2, y, z + 21, spike, 14, 2);
		world.setBlock(x - 2, y, z + 22, bedrock);
		world.setBlock(x - 2, y, z + 23, bedrock);
		world.setBlock(x - 2, y, z + 24, spike, 14, 2);

		//15th row
		world.setBlock(x - 1, y, z - 22, eroded, 1, 2);
		world.setBlock(x - 1, y, z - 21, bedrock);
		world.setBlock(x - 1, y, z - 20, bedrock);
		world.setBlock(x - 1, y, z - 19, spike, 14, 2);
		world.setBlock(x - 1, y, z - 18, eroded, 1, 2);
		world.setBlock(x - 1, y, z - 17, eroded, 1, 2);
		world.setBlock(x - 1, y, z - 16, eroded, 1, 2);
		world.setBlock(x - 1, y, z - 15, eroded, 1, 2);
		world.setBlock(x - 1, y, z - 14, spike, 14, 2);
		world.setBlock(x - 1, y, z - 13, bedrock);
		world.setBlock(x - 1, y, z - 12, bedrock);
		world.setBlock(x - 1, y, z - 11, spike, 14, 2);
		world.setBlock(x - 1, y, z - 10, eroded, 2, 2);
		world.setBlock(x - 1, y, z - 9, spike, 14, 2);
		world.setBlock(x - 1, y, z - 8, spike, 14, 2);
		world.setBlock(x - 1, y, z - 7, spike, 14, 2);
		world.setBlock(x - 1, y, z - 6, spike, 14, 2);
		world.setBlock(x - 1, y, z - 5, eroded, 1, 2);
		world.setBlock(x - 1, y, z - 4, bedrock);
		world.setBlock(x - 1, y, z - 3, bedrock);
		world.setBlock(x - 1, y, z - 2, spike, 14, 2);
		world.setBlock(x - 1, y, z - 1, eroded, 1, 2);
		world.setBlock(x - 1, y, z, eroded, 1, 2);
		world.setBlock(x - 1, y, z + 1, eroded, 1, 2);
		world.setBlock(x - 1, y, z + 2, eroded, 1, 2);
		world.setBlock(x - 1, y, z + 3, spike, 14, 2);
		world.setBlock(x - 1, y, z + 4, bedrock);
		world.setBlock(x - 1, y, z + 5, bedrock);
		world.setBlock(x - 1, y, z + 6, eroded, 1, 2);
		world.setBlock(x - 1, y, z + 7, spike, 14, 2);
		world.setBlock(x - 1, y, z + 8, spike, 14, 2);
		world.setBlock(x - 1, y, z + 9, spike, 14, 2);
		world.setBlock(x - 1, y, z + 10, spike, 14, 2);
		world.setBlock(x - 1, y, z + 11, eroded, 2, 2);
		world.setBlock(x - 1, y, z + 12, spike, 14, 2);
		world.setBlock(x - 1, y, z + 13, bedrock);
		world.setBlock(x - 1, y, z + 14, bedrock);
		world.setBlock(x - 1, y, z + 15, spike, 14, 2);
		world.setBlock(x - 1, y, z + 16, eroded, 1, 2);
		world.setBlock(x - 1, y, z + 17, eroded, 1, 2);
		world.setBlock(x - 1, y, z + 18, eroded, 1, 2);
		world.setBlock(x - 1, y, z + 19, eroded, 1, 2);
		world.setBlock(x - 1, y, z + 20, spike, 14, 2);
		world.setBlock(x - 1, y, z + 21, bedrock);
		world.setBlock(x - 1, y, z + 22, bedrock);
		world.setBlock(x - 1, y, z + 23, eroded, 1, 2);

		//16th row
		world.setBlock(x, y, z - 21, spike, 14, 2);
		world.setBlock(x, y, z - 20, bedrock);
		world.setBlock(x, y, z - 19, bedrock);
		world.setBlock(x, y, z - 18, cell);
		world.setBlock(x, y, z - 17, cell);
		world.setBlock(x, y, z - 16, cell);
		world.setBlock(x, y, z - 15, cell);
		world.setBlock(x, y, z - 14, bedrock);
		world.setBlock(x, y, z - 13, bedrock);
		world.setBlock(x, y, z - 12, spike, 14, 2);

		world.setBlockToAir(x, y, z - 11);
		world.setBlockToAir(x, y, z - 10);
		world.setBlock(x, y, z - 9, eroded, 2, 2);
		world.setBlock(x, y, z - 8, eroded, 2, 2);
		world.setBlock(x, y, z - 7, spike, 14, 2);
		world.setBlock(x, y, z - 6, spike, 14, 2);
		world.setBlock(x, y, z - 5, spike, 14, 2);

		world.setBlock(x, y, z - 4, spike, 14, 2);
		world.setBlock(x, y, z - 3, bedrock);
		world.setBlock(x, y, z - 2, bedrock);
		world.setBlock(x, y, z - 1, cell);
		world.setBlock(x, y, z, cell);
		world.setBlock(x, y, z + 1, cell);
		world.setBlock(x, y, z + 2, cell);
		world.setBlock(x, y, z + 3, bedrock);
		world.setBlock(x, y, z + 4, bedrock);
		world.setBlock(x, y, z + 5, spike, 14, 2);

		world.setBlock(x, y, z + 6, spike, 14, 2);
		world.setBlock(x, y, z + 7, spike, 14, 2);
		world.setBlock(x, y, z + 8, spike, 14, 2);
		world.setBlock(x, y, z + 9, eroded, 2, 2);
		world.setBlock(x, y, z + 10, eroded, 2, 2);
		world.setBlockToAir(x, y, z + 11);
		world.setBlockToAir(x, y, z + 12);

		world.setBlock(x, y, z + 13, spike, 14, 2);
		world.setBlock(x, y, z + 14, bedrock);
		world.setBlock(x, y, z + 15, bedrock);
		world.setBlock(x, y, z + 16, cell);
		world.setBlock(x, y, z + 17, cell);
		world.setBlock(x, y, z + 18, cell);
		world.setBlock(x, y, z + 19, cell);
		world.setBlock(x, y, z + 20, bedrock);
		world.setBlock(x, y, z + 21, bedrock);
		world.setBlock(x, y, z + 22, spike, 14, 2);

		//17th row
		world.setBlock(x + 1, y, z - 20, eroded, 1, 2);
		world.setBlock(x + 1, y, z - 19, bedrock);
		world.setBlock(x + 1, y, z - 18, bedrock);
		world.setBlock(x + 1, y, z - 17, bedrock);
		world.setBlock(x + 1, y, z - 16, bedrock);
		world.setBlock(x + 1, y, z - 15, bedrock);
		world.setBlock(x + 1, y, z - 14, bedrock);
		world.setBlock(x + 1, y, z - 13, spike, 14, 2);
		world.setBlock(x + 1, y, z - 12, eroded, 2, 2);
		world.setBlockToAir(x + 1, y, z - 11);
		world.setBlockToAir(x + 1, y, z - 10);
		world.setBlockToAir(x + 1, y, z - 9);
		world.setBlockToAir(x + 1, y, z - 8);
		world.setBlock(x + 1, y, z - 7, eroded, 2, 2);
		world.setBlock(x + 1, y, z - 6, spike, 14, 2);
		world.setBlock(x + 1, y, z - 5, spike, 14, 2);
		world.setBlock(x + 1, y, z - 4, spike, 14, 2);
		world.setBlock(x + 1, y, z - 3, eroded, 1, 2);
		world.setBlock(x + 1, y, z - 2, bedrock);
		world.setBlock(x + 1, y, z - 1, bedrock);
		world.setBlock(x + 1, y, z, bedrock);
		world.setBlock(x + 1, y, z + 1, bedrock);
		world.setBlock(x + 1, y, z + 2, bedrock);
		world.setBlock(x + 1, y, z + 3, bedrock);
		world.setBlock(x + 1, y, z + 4, eroded, 1, 2);
		world.setBlock(x + 1, y, z + 5, spike, 14, 2);
		world.setBlock(x + 1, y, z + 6, spike, 14, 2);
		world.setBlock(x + 1, y, z + 7, spike, 14, 2);
		world.setBlock(x + 1, y, z + 8, eroded, 2, 2);
		world.setBlockToAir(x + 1, y, z + 9);
		world.setBlockToAir(x + 1, y, z + 10);
		world.setBlockToAir(x + 1, y, z + 11);
		world.setBlockToAir(x + 1, y, z + 12);
		world.setBlock(x + 1, y, z + 13, eroded, 2, 2);
		world.setBlock(x + 1, y, z + 14, spike, 14, 2);
		world.setBlock(x + 1, y, z + 15, bedrock);
		world.setBlock(x + 1, y, z + 16, bedrock);
		world.setBlock(x + 1, y, z + 17, bedrock);
		world.setBlock(x + 1, y, z + 18, bedrock);
		world.setBlock(x + 1, y, z + 19, bedrock);
		world.setBlock(x + 1, y, z + 20, bedrock);
		world.setBlock(x + 1, y, z + 21, eroded, 1, 2);

		//18th row
		world.setBlock(x + 2, y, z - 19, spike, 14, 2);
		world.setBlock(x + 2, y, z - 18, cell);
		world.setBlock(x + 2, y, z - 17, cell);
		world.setBlock(x + 2, y, z - 16, cell);
		world.setBlock(x + 2, y, z - 15, cell);
		world.setBlock(x + 2, y, z - 14, bedrock);
		world.setBlock(x + 2, y, z - 13, spike, 14, 2);
		world.setBlock(x + 2, y, z - 12, spike, 14, 2);
		world.setBlock(x + 2, y, z - 11, eroded, 2, 2);
		world.setBlockToAir(x + 2, y, z - 10);
		world.setBlockToAir(x + 2, y, z - 9);
		world.setBlockToAir(x + 2, y, z - 8);
		world.setBlockToAir(x + 2, y, z - 7);
		world.setBlock(x + 2, y, z - 6, eroded, 2, 2);
		world.setBlock(x + 2, y, z - 5, spike, 14, 2);
		world.setBlock(x + 2, y, z - 4, spike, 14, 2);
		world.setBlock(x + 2, y, z - 3, spike, 14, 2);
		world.setBlock(x + 2, y, z - 2, bedrock);
		world.setBlock(x + 2, y, z - 1, cell);
		world.setBlock(x + 2, y, z, cell);
		world.setBlock(x + 2, y, z + 1, cell);
		world.setBlock(x + 2, y, z + 2, cell);
		world.setBlock(x + 2, y, z + 3, bedrock);
		world.setBlock(x + 2, y, z + 4, spike, 14, 2);
		world.setBlock(x + 2, y, z + 5, spike, 14, 2);
		world.setBlock(x + 2, y, z + 6, spike, 14, 2);
		world.setBlock(x + 2, y, z + 7, eroded, 2, 2);
		world.setBlockToAir(x + 2, y, z + 8);
		world.setBlockToAir(x + 2, y, z + 9);
		world.setBlockToAir(x + 2, y, z + 10);
		world.setBlockToAir(x + 2, y, z + 11);
		world.setBlock(x + 2, y, z + 12, eroded, 2, 2);
		world.setBlock(x + 2, y, z + 13, spike, 14, 2);
		world.setBlock(x + 2, y, z + 14, spike, 14, 2);
		world.setBlock(x + 2, y, z + 15, bedrock);
		world.setBlock(x + 2, y, z + 16, cell);
		world.setBlock(x + 2, y, z + 17, cell);
		world.setBlock(x + 2, y, z + 18, cell);
		world.setBlock(x + 2, y, z + 19, cell);
		world.setBlock(x + 2, y, z + 20, spike, 14, 2);

		//19th row
		world.setBlock(x + 3, y, z - 15, eroded, 1, 2);
		world.setBlock(x + 3, y, z - 14, bedrock);
		world.setBlock(x + 3, y, z - 13, bedrock);
		world.setBlock(x + 3, y, z - 12, spike, 14, 2);
		world.setBlock(x + 3, y, z - 11, eroded, 2, 2);
		world.setBlockToAir(x + 3, y, z - 10);
		world.setBlockToAir(x + 3, y, z - 9);
		world.setBlockToAir(x + 3, y, z - 8);
		world.setBlockToAir(x + 3, y, z - 7);
		world.setBlock(x + 3, y, z - 6, eroded, 2, 2);
		world.setBlock(x + 3, y, z - 5, spike, 14, 2);
		world.setBlock(x + 3, y, z - 4, spike, 14, 2);
		world.setBlock(x + 3, y, z - 3, eroded, 1, 2);
		world.setBlock(x + 3, y, z - 2, bedrock);
		world.setBlock(x + 3, y, z - 1, bedrock);
		world.setBlock(x + 3, y, z, bedrock);
		world.setBlock(x + 3, y, z + 1, bedrock);
		world.setBlock(x + 3, y, z + 2, bedrock);
		world.setBlock(x + 3, y, z + 3, bedrock);
		world.setBlock(x + 3, y, z + 4, eroded, 1, 2);
		world.setBlock(x + 3, y, z + 5, spike, 14, 2);
		world.setBlock(x + 3, y, z + 6, spike, 14, 2);
		world.setBlock(x + 3, y, z + 7, eroded, 2, 2);
		world.setBlockToAir(x + 3, y, z + 8);
		world.setBlockToAir(x + 3, y, z + 9);
		world.setBlockToAir(x + 3, y, z + 10);
		world.setBlockToAir(x + 3, y, z + 11);
		world.setBlock(x + 3, y, z + 12, eroded, 2, 2);
		world.setBlock(x + 3, y, z + 13, spike, 14, 2);
		world.setBlock(x + 3, y, z + 14, bedrock);
		world.setBlock(x + 3, y, z + 15, bedrock);
		world.setBlock(x + 3, y, z + 16, eroded, 1, 2);

		//20th row
		world.setBlock(x + 4, y, z - 14, spike, 14, 2);
		world.setBlock(x + 4, y, z - 13, bedrock);
		world.setBlock(x + 4, y, z - 12, spike, 14, 2);
		world.setBlock(x + 4, y, z - 11, spike, 14, 2);
		world.setBlock(x + 4, y, z - 10, spike, 14, 2);
		world.setBlockToAir(x + 4, y, z - 9);
		world.setBlockToAir(x + 4, y, z - 8);
		world.setBlockToAir(x + 4, y, z - 7);
		world.setBlockToAir(x + 4, y, z - 6);
		world.setBlock(x + 4, y, z - 5, eroded, 2, 2);
		world.setBlock(x + 4, y, z - 4, spike, 14, 2);
		world.setBlock(x + 4, y, z - 3, bedrock);
		world.setBlock(x + 4, y, z - 2, bedrock);
		world.setBlock(x + 4, y, z - 1, cell);
		world.setBlock(x + 4, y, z, cell);
		world.setBlock(x + 4, y, z + 1, cell);
		world.setBlock(x + 4, y, z + 2, cell);
		world.setBlock(x + 4, y, z + 3, bedrock);
		world.setBlock(x + 4, y, z + 4, bedrock);
		world.setBlock(x + 4, y, z + 5, spike, 14, 2);
		world.setBlock(x + 4, y, z + 6, eroded, 2, 2);
		world.setBlockToAir(x + 4, y, z + 7);
		world.setBlockToAir(x + 4, y, z + 8);
		world.setBlockToAir(x + 4, y, z + 9);
		world.setBlockToAir(x + 4, y, z + 10);
		world.setBlock(x + 4, y, z + 11, spike, 14, 2);
		world.setBlock(x + 4, y, z + 12, spike, 14, 2);
		world.setBlock(x + 4, y, z + 13, spike, 14, 2);
		world.setBlock(x + 4, y, z + 14, bedrock);
		world.setBlock(x + 4, y, z + 15, spike, 14, 2);

		//21st row
		world.setBlock(x + 5, y, z - 14, spike, 14, 2);
		world.setBlock(x + 5, y, z - 13, bedrock);
		world.setBlock(x + 5, y, z - 12, bedrock);
		world.setBlock(x + 5, y, z - 11, spike, 14, 2);
		world.setBlock(x + 5, y, z - 10, spike, 14, 2);
		world.setBlock(x + 5, y, z - 9, eroded, 2, 2);
		world.setBlock(x + 5, y, z - 8, eroded, 2, 2);
		world.setBlockToAir(x + 5, y, z - 7);
		world.setBlockToAir(x + 5, y, z - 6);
		world.setBlock(x + 5, y, z - 5, spike, 14, 2);
		world.setBlock(x + 5, y, z - 4, bedrock);
		world.setBlock(x + 5, y, z - 3, bedrock);
		world.setBlock(x + 5, y, z - 2, spike, 14, 2);
		world.setBlock(x + 5, y, z - 1, eroded, 2, 2);
		world.setBlock(x + 5, y, z, eroded, 2, 2);
		world.setBlock(x + 5, y, z + 1, eroded, 2, 2);
		world.setBlock(x + 5, y, z + 2, eroded, 2, 2);
		world.setBlock(x + 5, y, z + 3, spike, 14, 2);
		world.setBlock(x + 5, y, z + 4, bedrock);
		world.setBlock(x + 5, y, z + 5, bedrock);
		world.setBlock(x + 5, y, z + 6, spike, 14, 2);
		world.setBlockToAir(x + 5, y, z + 7);
		world.setBlockToAir(x + 5, y, z + 8);
		world.setBlock(x + 5, y, z + 9, eroded, 2, 2);
		world.setBlock(x + 5, y, z + 10, eroded, 2, 2);
		world.setBlock(x + 5, y, z + 11, spike, 14, 2);
		world.setBlock(x + 5, y, z + 12, spike, 14, 2);
		world.setBlock(x + 5, y, z + 13, bedrock);
		world.setBlock(x + 5, y, z + 14, bedrock);
		world.setBlock(x + 5, y, z + 15, spike, 14, 2);

		//22nd row
		world.setBlock(x + 6, y, z - 13, spike, 14, 2);
		world.setBlock(x + 6, y, z - 12, bedrock);
		world.setBlock(x + 6, y, z - 11, bedrock);
		world.setBlock(x + 6, y, z - 10, spike, 14, 2);
		world.setBlock(x + 6, y, z - 9, spike, 14, 2);
		world.setBlock(x + 6, y, z - 8, spike, 14, 2);
		world.setBlock(x + 6, y, z - 7, eroded, 2, 2);
		world.setBlock(x + 6, y, z - 6, spike, 14, 2);
		world.setBlock(x + 6, y, z - 5, bedrock);
		world.setBlock(x + 6, y, z - 4, bedrock);
		world.setBlock(x + 6, y, z - 3, spike, 14, 2);
		world.setBlock(x + 6, y, z - 2, eroded, 1, 2);
		world.setBlockToAir(x + 6, y, z - 1);
		world.setBlockToAir(x + 6, y, z);
		world.setBlockToAir(x + 6, y, z + 1);
		world.setBlockToAir(x + 6, y, z + 2);
		world.setBlock(x + 6, y, z + 3, eroded, 1, 2);
		world.setBlock(x + 6, y, z + 4, spike, 14, 2);
		world.setBlock(x + 6, y, z + 5, bedrock);
		world.setBlock(x + 6, y, z + 6, bedrock);
		world.setBlock(x + 6, y, z + 7, spike, 14, 2);
		world.setBlock(x + 6, y, z + 8, eroded, 2, 2);
		world.setBlock(x + 6, y, z + 9, spike, 14, 2);
		world.setBlock(x + 6, y, z + 10, spike, 14, 2);
		world.setBlock(x + 6, y, z + 11, spike, 14, 2);
		world.setBlock(x + 6, y, z + 12, bedrock);
		world.setBlock(x + 6, y, z + 13, bedrock);
		world.setBlock(x + 6, y, z + 14, spike, 14, 2);

		//23rd row
		world.setBlock(x + 7, y, z - 13, eroded, 1, 2);
		world.setBlock(x + 7, y, z - 12, spike, 14, 2);
		world.setBlock(x + 7, y, z - 11, bedrock);
		world.setBlock(x + 7, y, z - 10, bedrock);
		world.setBlock(x + 7, y, z - 9, bedrock);
		world.setBlock(x + 7, y, z - 8, spike, 14, 2);
		world.setBlock(x + 7, y, z - 7, spike, 14, 2);
		world.setBlock(x + 7, y, z - 6, bedrock);
		world.setBlock(x + 7, y, z - 5, bedrock);
		world.setBlock(x + 7, y, z - 4, spike, 14, 2);
		world.setBlock(x + 7, y, z - 3, eroded, 1, 2);
		world.setBlockToAir(x + 7, y, z - 2);
		world.setBlockToAir(x + 7, y, z - 1);
		world.setBlockToAir(x + 7, y, z);
		world.setBlockToAir(x + 7, y, z + 1);
		world.setBlockToAir(x + 7, y, z + 2);
		world.setBlockToAir(x + 7, y, z + 3);
		world.setBlock(x + 7, y, z + 4, eroded, 1, 2);
		world.setBlock(x + 7, y, z + 5, spike, 14, 2);
		world.setBlock(x + 7, y, z + 6, bedrock);
		world.setBlock(x + 7, y, z + 7, bedrock);
		world.setBlock(x + 7, y, z + 8, spike, 14, 2);
		world.setBlock(x + 7, y, z + 9, spike, 14, 2);
		world.setBlock(x + 7, y, z + 10, bedrock);
		world.setBlock(x + 7, y, z + 11, bedrock);
		world.setBlock(x + 7, y, z + 12, bedrock);
		world.setBlock(x + 7, y, z + 13, spike, 14, 2);
		world.setBlock(x + 7, y, z + 14, eroded, 1, 2);

		//24th row
		world.setBlock(x + 8, y, z - 11, spike, 14, 2);
		world.setBlock(x + 8, y, z - 10, spike, 14, 2);
		world.setBlock(x + 8, y, z - 9, bedrock);
		world.setBlock(x + 8, y, z - 8, bedrock);
		world.setBlock(x + 8, y, z - 7, bedrock);
		world.setBlock(x + 8, y, z - 6, bedrock);
		world.setBlock(x + 8, y, z - 5, spike, 14, 2);
		world.setBlock(x + 8, y, z - 4, eroded, 1, 2);
		world.setBlockToAir(x + 8, y, z - 3);
		world.setBlockToAir(x + 8, y, z - 2);
		world.setBlockToAir(x + 8, y, z - 1);
		world.setBlock(x + 8, y, z, eroded, 1, 2);
		world.setBlock(x + 8, y, z + 1, eroded, 1, 2);
		world.setBlockToAir(x + 8, y, z + 2);
		world.setBlockToAir(x + 8, y, z + 3);
		world.setBlockToAir(x + 8, y, z + 4);
		world.setBlock(x + 8, y, z + 5, eroded, 1, 2);
		world.setBlock(x + 8, y, z + 6, spike, 14, 2);
		world.setBlock(x + 8, y, z + 7, bedrock);
		world.setBlock(x + 8, y, z + 8, bedrock);
		world.setBlock(x + 8, y, z + 9, bedrock);
		world.setBlock(x + 8, y, z + 10, bedrock);
		world.setBlock(x + 8, y, z + 11, spike, 14, 2);
		world.setBlock(x + 8, y, z + 12, spike, 14, 2);

		//25th row
		world.setBlock(x + 9, y, z - 9, eroded, 1, 2);
		world.setBlock(x + 9, y, z - 8, cell);
		world.setBlock(x + 9, y, z - 7, bedrock);
		world.setBlock(x + 9, y, z - 6, cell);
		world.setBlock(x + 9, y, z - 5, eroded, 1, 2);
		world.setBlockToAir(x + 9, y, z - 4);
		world.setBlockToAir(x + 9, y, z - 3);
		world.setBlockToAir(x + 9, y, z - 2);
		world.setBlock(x + 9, y, z - 1, eroded, 1, 2);
		world.setBlock(x + 9, y, z, eroded, 2, 2);
		world.setBlock(x + 9, y, z + 1, eroded, 2, 2);
		world.setBlock(x + 9, y, z + 2, eroded, 1, 2);
		world.setBlockToAir(x + 9, y, z + 3);
		world.setBlockToAir(x + 9, y, z + 4);
		world.setBlockToAir(x + 9, y, z + 5);
		world.setBlock(x + 9, y, z + 6, eroded, 1, 2);
		world.setBlock(x + 9, y, z + 7, cell);
		world.setBlock(x + 9, y, z + 8, bedrock);
		world.setBlock(x + 9, y, z + 9, cell);
		world.setBlock(x + 9, y, z + 10, eroded, 1, 2);

		//26th row
		world.setBlock(x + 10, y, z - 8, cell);
		world.setBlock(x + 10, y, z - 7, bedrock);
		world.setBlock(x + 10, y, z - 6, cell);
		world.setBlock(x + 10, y, z - 5, eroded, 1, 2);
		world.setBlockToAir(x + 10, y, z - 4);
		world.setBlockToAir(x + 10, y, z - 3);
		world.setBlock(x + 10, y, z - 2, eroded, 1, 2);
		world.setBlock(x + 10, y, z - 1, eroded, 2, 2);
		world.setBlock(x + 10, y, z, eroded, 2, 2);
		world.setBlock(x + 10, y, z + 1, eroded, 2, 2);
		world.setBlock(x + 10, y, z + 2, eroded, 2, 2);
		world.setBlock(x + 10, y, z + 3, eroded, 1, 2);
		world.setBlockToAir(x + 10, y, z + 4);
		world.setBlockToAir(x + 10, y, z + 5);
		world.setBlock(x + 10, y, z + 6, eroded, 1, 2);
		world.setBlock(x + 10, y, z + 7, cell);
		world.setBlock(x + 10, y, z + 8, bedrock);
		world.setBlock(x + 10, y, z + 9, cell);

		//27th row
		world.setBlock(x + 11, y, z - 8, cell);
		world.setBlock(x + 11, y, z - 7, bedrock);
		world.setBlock(x + 11, y, z - 6, cell);
		world.setBlock(x + 11, y, z - 5, eroded, 1, 2);
		world.setBlockToAir(x + 11, y, z - 4);
		world.setBlockToAir(x + 11, y, z - 3);
		world.setBlock(x + 11, y, z - 2, eroded, 1, 2);
		world.setBlock(x + 11, y, z - 1, eroded, 2, 2);
		world.setBlock(x + 11, y, z, eroded, 2, 2);
		world.setBlock(x + 11, y, z + 1, eroded, 2, 2);
		world.setBlock(x + 11, y, z + 2, eroded, 2, 2);
		world.setBlock(x + 11, y, z + 3, eroded, 1, 2);
		world.setBlockToAir(x + 11, y, z + 4);
		world.setBlockToAir(x + 11, y, z + 5);
		world.setBlock(x + 11, y, z + 6, eroded, 1, 2);
		world.setBlock(x + 11, y, z + 7, cell);
		world.setBlock(x + 11, y, z + 8, bedrock);
		world.setBlock(x + 11, y, z + 9, cell);

		//28th row
		world.setBlock(x + 12, y, z - 8, cell);
		world.setBlock(x + 12, y, z - 7, bedrock);
		world.setBlock(x + 12, y, z - 6, cell);
		world.setBlock(x + 12, y, z - 5, eroded, 1, 2);
		world.setBlockToAir(x + 12, y, z - 4);
		world.setBlockToAir(x + 12, y, z - 3);
		world.setBlockToAir(x + 12, y, z - 2);
		world.setBlock(x + 12, y, z - 1, eroded, 1, 2);
		world.setBlock(x + 12, y, z, eroded, 2, 2);
		world.setBlock(x + 12, y, z + 1, eroded, 2, 2);
		world.setBlock(x + 12, y, z + 2, eroded, 1, 2);
		world.setBlockToAir(x + 12, y, z + 3);
		world.setBlockToAir(x + 12, y, z + 4);
		world.setBlockToAir(x + 12, y, z + 5);
		world.setBlock(x + 12, y, z + 6, eroded, 1, 2);
		world.setBlock(x + 12, y, z + 7, cell);
		world.setBlock(x + 12, y, z + 8, bedrock);
		world.setBlock(x + 12, y, z + 9, cell);

		//29th row
		world.setBlock(x + 13, y, z - 8, spike, 14, 2);
		world.setBlock(x + 13, y, z - 7, bedrock);
		world.setBlock(x + 13, y, z - 6, bedrock);
		world.setBlock(x + 13, y, z - 5, spike, 14, 2);
		world.setBlock(x + 13, y, z - 4, eroded, 1, 2);
		world.setBlockToAir(x + 13, y, z - 3);
		world.setBlockToAir(x + 13, y, z - 2);
		world.setBlockToAir(x + 13, y, z - 1);
		world.setBlock(x + 13, y, z, eroded, 1, 2);
		world.setBlock(x + 13, y, z + 1, eroded, 1, 2);
		world.setBlockToAir(x + 13, y, z + 2);
		world.setBlockToAir(x + 13, y, z + 3);
		world.setBlockToAir(x + 13, y, z + 4);
		world.setBlock(x + 13, y, z + 5, eroded, 1, 2);
		world.setBlock(x + 13, y, z + 6, spike, 14, 2);
		world.setBlock(x + 13, y, z + 7, bedrock);
		world.setBlock(x + 13, y, z + 8, bedrock);
		world.setBlock(x + 13, y, z + 9, spike, 14, 2);

		//30th row
		world.setBlock(x + 14, y, z - 7, eroded, 1, 2);
		world.setBlock(x + 14, y, z - 6, bedrock);
		world.setBlock(x + 14, y, z - 5, bedrock);
		world.setBlock(x + 14, y, z - 4, spike, 14, 2);
		world.setBlock(x + 14, y, z - 3, eroded, 1, 2);
		world.setBlockToAir(x + 14, y, z - 2);
		world.setBlockToAir(x + 14, y, z - 1);
		world.setBlockToAir(x + 14, y, z);
		world.setBlockToAir(x + 14, y, z + 1);
		world.setBlockToAir(x + 14, y, z + 2);
		world.setBlockToAir(x + 14, y, z + 3);
		world.setBlock(x + 14, y, z + 4, eroded, 1, 2);
		world.setBlock(x + 14, y, z + 5, spike, 14, 2);
		world.setBlock(x + 14, y, z + 6, bedrock);
		world.setBlock(x + 14, y, z + 7, bedrock);
		world.setBlock(x + 14, y, z + 8, eroded, 1, 2);

		//31st row
		world.setBlock(x + 15, y, z - 6, spike, 14, 2);
		world.setBlock(x + 15, y, z - 5, bedrock);
		world.setBlock(x + 15, y, z - 4, bedrock);
		world.setBlock(x + 15, y, z - 3, spike, 14, 2);
		world.setBlock(x + 15, y, z - 2, eroded, 1, 2);
		world.setBlockToAir(x + 15, y, z - 1);
		world.setBlockToAir(x + 15, y, z);
		world.setBlockToAir(x + 15, y, z + 1);
		world.setBlockToAir(x + 15, y, z + 2);
		world.setBlock(x + 15, y, z + 3, eroded, 1, 2);
		world.setBlock(x + 15, y, z + 4, spike, 14, 2);
		world.setBlock(x + 15, y, z + 5, bedrock);
		world.setBlock(x + 15, y, z + 6, bedrock);
		world.setBlock(x + 15, y, z + 7, spike, 14, 2);

		//32nd row
		world.setBlock(x + 16, y, z - 5, eroded, 1, 2);
		world.setBlock(x + 16, y, z - 4, bedrock);
		world.setBlock(x + 16, y, z - 3, bedrock);
		world.setBlock(x + 16, y, z - 2, spike, 14, 2);
		world.setBlock(x + 16, y, z - 1, eroded, 1, 2);
		world.setBlock(x + 16, y, z, eroded, 1, 2);
		world.setBlock(x + 16, y, z + 1, eroded, 1, 2);
		world.setBlock(x + 16, y, z + 2, eroded, 1, 2);
		world.setBlock(x + 16, y, z + 3, spike, 14, 2);
		world.setBlock(x + 16, y, z + 4, bedrock);
		world.setBlock(x + 16, y, z + 5, bedrock);
		world.setBlock(x + 16, y, z + 6, eroded, 1, 2);

		//33rd row
		world.setBlock(x + 17, y, z - 4, spike, 14, 2);
		world.setBlock(x + 17, y, z - 3, bedrock);
		world.setBlock(x + 17, y, z - 2, bedrock);
		world.setBlock(x + 17, y, z - 1, cell);
		world.setBlock(x + 17, y, z, cell);
		world.setBlock(x + 17, y, z + 1, cell);
		world.setBlock(x + 17, y, z + 2, cell);
		world.setBlock(x + 17, y, z + 3, bedrock);
		world.setBlock(x + 17, y, z + 4, bedrock);
		world.setBlock(x + 17, y, z + 5, spike, 14, 2);

		//34th row
		world.setBlock(x + 18, y, z - 3, eroded, 1, 2);
		world.setBlock(x + 18, y ,z - 2, bedrock);
		world.setBlock(x + 18, y ,z - 1, bedrock);
		world.setBlock(x + 18, y ,z, bedrock);
		world.setBlock(x + 18, y ,z + 1, bedrock);
		world.setBlock(x + 18, y ,z + 2, bedrock);
		world.setBlock(x + 18, y ,z + 3, bedrock);
		world.setBlock(x + 18, y, z + 4, eroded, 1, 2);

		//35th row
		world.setBlock(x + 19, y, z - 2, spike, 14, 2);
		world.setBlock(x + 19, y, z - 1, cell);
		world.setBlock(x + 19, y, z, cell);
		world.setBlock(x + 19, y, z + 1, cell);
		world.setBlock(x + 19, y, z + 2, cell);
		world.setBlock(x + 19, y, z + 3, spike, 14, 2);
		
		this.generateBedrockLayer(world, rand, x, y + 1, z);
		this.placeSpawners(world, rand, x + 10, y - 3, z, false);
		this.placeSpawners(world, rand, x - 7, y - 3, z - 17, false);
		this.placeSpawners(world, rand, x - 7, y - 3, z + 18, false);
	}
	
	public void generateHole(World world, Random rand, int x, int y, int z)
	{
		for (int y1 = -2; y1 < 3; y1++)
		{
			world.setBlockToAir(x, y + y1, z);
			world.setBlockToAir(x + 1, y + y1, z);
			world.setBlockToAir(x + 1, y + y1, z + 1);
			world.setBlockToAir(x, y + y1, z + 1);
			
			world.setBlockToAir(x + 2, y + y1, z);
			world.setBlockToAir(x + 2, y + y1, z + 1);
			world.setBlockToAir(x - 1, y + y1, z);
			world.setBlockToAir(x - 1, y + y1, z + 1);
			
			world.setBlockToAir(x, y + y1, z + 2);
			world.setBlockToAir(x + 1, y + y1, z + 2);
			world.setBlockToAir(x, y + y1, z - 1);
			world.setBlockToAir(x + 1, y + y1, z - 1);
		}
	}
	
	public void placeSpawners(World world, Random rand, int x, int y, int z, boolean flag)
	{
		String s = flag ? this.getMiniBossForSpawner(rand) : this.getMobNameforSpawner(rand);
		
		world.setBlock(x + 1, y, z, spawner);
		this.setSpawnerMob(world, x + 1, y, z, s);
		
		world.setBlock(x, y, z, spawner);
		this.setSpawnerMob(world, x, y, z, s);
		
		world.setBlock(x + 1, y, z + 1, spawner);
		this.setSpawnerMob(world, x + 1, y, z + 1, s);
		
		world.setBlock(x, y, z + 1, spawner);
		this.setSpawnerMob(world, x, y, z + 1, s);
	}
	
	public void generateBedrockLayer(World world, Random rand, int x, int y, int z)
	{
		//1st row
		world.setBlock(x - 15, y, z - 19, spike, 14, 2);
		world.setBlock(x - 15, y, z - 18, spike, 14, 2);
		world.setBlock(x - 15, y, z - 17, spike, 14, 2);
		world.setBlock(x - 15, y, z - 16, spike, 14, 2);
		world.setBlock(x - 15, y, z - 15, spike, 14, 2);
		world.setBlock(x - 15, y, z - 14, spike, 14, 2);

		world.setBlock(x - 15, y, z - 2, spike, 14, 2);
		world.setBlock(x - 15, y, z - 1, spike, 14, 2);
		world.setBlock(x - 15, y, z, spike, 14, 2);
		world.setBlock(x - 15, y, z + 1, spike, 14, 2);
		world.setBlock(x - 15, y, z + 2, spike, 14, 2);
		world.setBlock(x - 15, y, z + 3, spike, 14, 2);

		world.setBlock(x - 15, y, z + 15, spike, 14, 2);
		world.setBlock(x - 15, y, z + 16, spike, 14, 2);
		world.setBlock(x - 15, y, z + 17, spike, 14, 2);
		world.setBlock(x - 15, y, z + 18, spike, 14, 2);
		world.setBlock(x - 15, y, z + 19, spike, 14, 2);
		world.setBlock(x - 15, y, z + 20, spike, 14, 2);

		//2nd row
		world.setBlock(x - 14, y, z - 20, eroded, 1, 2);
		world.setBlock(x - 14, y, z - 19, bedrock);
		world.setBlock(x - 14, y, z - 18, bedrock);
		world.setBlock(x - 14, y, z - 17, bedrock);
		world.setBlock(x - 14, y, z - 16, bedrock);
		world.setBlock(x - 14, y, z - 15, bedrock);
		world.setBlock(x - 14, y, z - 14, bedrock);
		world.setBlock(x - 14, y, z - 13, eroded, 1, 2);

		world.setBlock(x - 14, y, z - 3, eroded, 1, 2);
		world.setBlock(x - 14, y, z - 2, bedrock);
		world.setBlock(x - 14, y, z - 1, bedrock);
		world.setBlock(x - 14, y, z, bedrock);
		world.setBlock(x - 14, y, z + 1, bedrock);
		world.setBlock(x - 14, y, z + 2, bedrock);
		world.setBlock(x - 14, y, z + 3, bedrock);
		world.setBlock(x - 14, y, z + 4, eroded, 1, 2);

		world.setBlock(x - 14, y, z + 14, eroded, 1, 2);
		world.setBlock(x - 14, y, z + 15, bedrock);
		world.setBlock(x - 14, y, z + 16, bedrock);
		world.setBlock(x - 14, y, z + 17, bedrock);
		world.setBlock(x - 14, y, z + 18, bedrock);
		world.setBlock(x - 14, y, z + 19, bedrock);
		world.setBlock(x - 14, y, z + 20, bedrock);
		world.setBlock(x - 14, y, z + 21, eroded, 1, 2);

		//3rd row
		world.setBlock(x - 13, y, z - 22, lamp);
		world.setBlock(x - 13, y, z - 21, spike, 14, 2);
		world.setBlock(x - 13, y, z - 20, bedrock);
		world.setBlock(x - 13, y, z - 19, bedrock);
		world.setBlock(x - 13, y, z - 18, bedrock);
		world.setBlock(x - 13, y, z - 17, bedrock);
		world.setBlock(x - 13, y, z - 16, bedrock);
		world.setBlock(x - 13, y, z - 15, bedrock);
		world.setBlock(x - 13, y, z - 14, bedrock);
		world.setBlock(x - 13, y, z - 13, bedrock);
		world.setBlock(x - 13, y, z - 12, spike, 14, 2);
		world.setBlock(x - 13, y, z - 11, lamp);

		world.setBlock(x - 13, y, z - 5, lamp);
		world.setBlock(x - 13, y, z - 4, spike, 14, 2);
		world.setBlock(x - 13, y, z - 3, bedrock);
		world.setBlock(x - 13, y, z - 2, bedrock);
		world.setBlock(x - 13, y, z - 1, bedrock);
		world.setBlock(x - 13, y, z, bedrock);
		world.setBlock(x - 13, y, z + 1, bedrock);
		world.setBlock(x - 13, y, z + 2, bedrock);
		world.setBlock(x - 13, y, z + 3, bedrock);
		world.setBlock(x - 13, y, z + 4, bedrock);
		world.setBlock(x - 13, y, z + 5, spike, 14, 2);
		world.setBlock(x - 13, y, z + 6, lamp);

		world.setBlock(x - 13, y, z + 14, lamp);
		world.setBlock(x - 13, y, z + 13, spike, 14, 2);
		world.setBlock(x - 13, y, z + 14, bedrock);
		world.setBlock(x - 13, y, z + 15, bedrock);
		world.setBlock(x - 13, y, z + 16, bedrock);
		world.setBlock(x - 13, y, z + 17, bedrock);
		world.setBlock(x - 13, y, z + 18, bedrock);
		world.setBlock(x - 13, y, z + 19, bedrock);
		world.setBlock(x - 13, y, z + 20, bedrock);
		world.setBlock(x - 13, y, z + 21, bedrock);
		world.setBlock(x - 13, y, z + 22, spike, 14, 2);
		world.setBlock(x - 13, y, z + 23, lamp);

		//4th row
		world.setBlock(x - 12, y, z - 22, eroded, 1, 2);
		world.setBlock(x - 12, y, z - 21, bedrock);
		world.setBlock(x - 12, y, z - 20, bedrock);
		world.setBlock(x - 12, y, z - 19, bedrock);
		world.setBlock(x - 12, y, z - 18, bedrock);
		world.setBlock(x - 12, y, z - 17, bedrock);
		world.setBlock(x - 12, y, z - 16, bedrock);
		world.setBlock(x - 12, y, z - 15, bedrock);
		world.setBlock(x - 12, y, z - 14, bedrock);
		world.setBlock(x - 12, y, z - 13, bedrock);
		world.setBlock(x - 12, y, z - 12, bedrock);
		world.setBlock(x - 12, y, z - 11, eroded, 1, 2);

		world.setBlock(x - 12, y, z - 5, eroded, 1, 2);
		world.setBlock(x - 12, y, z - 4, bedrock);
		world.setBlock(x - 12, y, z - 3, bedrock);
		world.setBlock(x - 12, y, z - 2, bedrock);
		world.setBlock(x - 12, y, z - 1, bedrock);
		world.setBlock(x - 12, y, z, bedrock);
		world.setBlock(x - 12, y, z + 1, bedrock);
		world.setBlock(x - 12, y, z + 2, bedrock);
		world.setBlock(x - 12, y, z + 3, bedrock);
		world.setBlock(x - 12, y, z + 4, bedrock);
		world.setBlock(x - 12, y, z + 5, bedrock);
		world.setBlock(x - 12, y, z + 6, eroded, 1, 2);

		world.setBlock(x - 12, y, z + 12, eroded, 1, 2);
		world.setBlock(x - 12, y, z + 13, bedrock);
		world.setBlock(x - 12, y, z + 14, bedrock);
		world.setBlock(x - 12, y, z + 15, bedrock);
		world.setBlock(x - 12, y, z + 16, bedrock);
		world.setBlock(x - 12, y, z + 17, bedrock);
		world.setBlock(x - 12, y, z + 18, bedrock);
		world.setBlock(x - 12, y, z + 19, bedrock);
		world.setBlock(x - 12, y, z + 20, bedrock);
		world.setBlock(x - 12, y, z + 21, bedrock);
		world.setBlock(x - 12, y, z + 22, bedrock);
		world.setBlock(x - 12, y, z + 23, eroded, 1, 2);

		//5th row
		world.setBlock(x - 11, y, z - 23, spike, 14, 2);
		world.setBlock(x - 11, y, z - 22, bedrock);
		world.setBlock(x - 11, y, z - 21, bedrock);
		world.setBlock(x - 11, y, z - 20, bedrock);
		world.setBlock(x - 11, y, z - 19, bedrock);
		world.setBlock(x - 11, y, z - 18, bedrock);
		world.setBlock(x - 11, y, z - 17, bedrock);
		world.setBlock(x - 11, y, z - 16, bedrock);
		world.setBlock(x - 11, y, z - 15, bedrock);
		world.setBlock(x - 11, y, z - 14, bedrock);
		world.setBlock(x - 11, y, z - 13, bedrock);
		world.setBlock(x - 11, y, z - 12, bedrock);
		world.setBlock(x - 11, y, z - 11, bedrock);
		world.setBlock(x - 11, y, z - 10, spike, 14, 2);

		world.setBlock(x - 11, y, z - 6, spike, 14, 2);
		world.setBlock(x - 11, y, z - 5, bedrock);
		world.setBlock(x - 11, y, z - 4, bedrock);
		world.setBlock(x - 11, y, z - 3, bedrock);
		world.setBlock(x - 11, y, z - 2, bedrock);
		world.setBlock(x - 11, y, z - 1, bedrock);
		world.setBlock(x - 11, y, z, bedrock);
		world.setBlock(x - 11, y, z + 1, bedrock);
		world.setBlock(x - 11, y, z + 2, bedrock);
		world.setBlock(x - 11, y, z + 3, bedrock);
		world.setBlock(x - 11, y, z + 4, bedrock);
		world.setBlock(x - 11, y, z + 5, bedrock);
		world.setBlock(x - 11, y, z + 6, bedrock);
		world.setBlock(x - 11, y, z + 7, spike, 14, 2);

		world.setBlock(x - 11, y, z + 11, spike, 14, 2);
		world.setBlock(x - 11, y, z + 12, bedrock);
		world.setBlock(x - 11, y, z + 13, bedrock);
		world.setBlock(x - 11, y, z + 14, bedrock);
		world.setBlock(x - 11, y, z + 15, bedrock);
		world.setBlock(x - 11, y, z + 16, bedrock);
		world.setBlock(x - 11, y, z + 17, bedrock);
		world.setBlock(x - 11, y, z + 18, bedrock);
		world.setBlock(x - 11, y, z + 19, bedrock);
		world.setBlock(x - 11, y, z + 20, bedrock);
		world.setBlock(x - 11, y, z + 21, bedrock);
		world.setBlock(x - 11, y, z + 22, bedrock);
		world.setBlock(x - 11, y, z + 23, bedrock);
		world.setBlock(x - 11, y, z + 24, spike, 14, 2);

		//6th row
		world.setBlock(x - 10, y, z - 24, eroded, 1, 2);
		for (int z1 = -23; z1 < -9; z1++) world.setBlock(x - 10, y, z + z1, bedrock);
		world.setBlock(x - 10, y, z - 9, eroded, 1, 2);
		world.setBlock(x - 10, y, z - 8, spike, 14, 2);
		world.setBlock(x - 10, y, z - 7, eroded, 1, 2);
		for (int z1 = -6; z1 < 8; z1++) world.setBlock(x - 10, y, z + z1, bedrock);
		world.setBlock(x - 10, y, z + 8, eroded, 1, 2);
		world.setBlock(x - 10, y, z + 9, spike, 14, 2);
		world.setBlock(x - 10, y, z + 10, eroded, 1, 2);
		for (int z1 = 11; z1 < 25; z1++) world.setBlock(x - 10, y, z + z1, bedrock);
		world.setBlock(x - 10, y, z + 25, eroded, 1, 2);

		//7th row
		world.setBlock(x - 9, y, z - 25, spike, 14, 2);
		for (int z1 = -24; z1 < 26; z1++) world.setBlock(x - 9, y, z + z1, bedrock);
		world.setBlock(x - 9, y, z + 26, spike, 14, 2);

		//8th row
		world.setBlock(x - 8, y, z - 25, spike, 14, 2);
		for (int z1 = -24; z1 < 26; z1++) world.setBlock(x - 8, y, z + z1, bedrock);
		world.setBlock(x - 8, y, z + 26, spike, 14, 2);

		//9th row
		world.setBlock(x - 7, y, z - 25, spike, 14, 2);
		for (int z1 = -24; z1 < 26; z1++) world.setBlock(x - 7, y, z + z1, bedrock);
		world.setBlock(x - 7, y, z + 26, spike, 14, 2);

		//10th row
		world.setBlock(x - 6, y, z - 25, spike, 14, 2);
		for (int z1 = -24; z1 < 26; z1++) world.setBlock(x - 6, y, z + z1, bedrock);
		world.setBlock(x - 6, y, z + 26, spike, 14, 2);

		//11th row
		world.setBlock(x - 5, y, z - 25, spike, 14, 2);
		for (int z1 = -24; z1 < 26; z1++) world.setBlock(x - 5, y, z + z1, bedrock);
		world.setBlock(x - 5, y, z + 26, spike, 14, 2);

		//12th row
		world.setBlock(x - 4, y, z - 25, spike, 14, 2);
		for (int z1 = -24; z1 < 26; z1++) world.setBlock(x - 4, y, z + z1, bedrock);
		world.setBlock(x - 4, y, z + 26, spike, 14, 2);

		//13th row
		world.setBlock(x - 3, y, z - 24, eroded, 1, 2);
		for (int z1 = -23; z1 < 25; z1++) world.setBlock(x - 3, y, z + z1, bedrock);
		world.setBlock(x - 3, y, z + 25, eroded, 1, 2);

		//14th row
		world.setBlock(x - 2, y, z - 23, spike, 14, 2);
		for (int z1 = -22; z1 < 24; z1++) world.setBlock(x - 2, y, z + z1, bedrock);
		world.setBlock(x - 2, y, z + 24, spike, 14, 2);

		//15th row
		world.setBlock(x - 1, y, z - 22, eroded, 1, 2);
		for (int z1 = -21; z1 < 23; z1++) world.setBlock(x - 1, y, z + z1, bedrock);
		world.setBlock(x - 1, y, z + 23, eroded, 1, 2);

		//16th row
		world.setBlock(x, y, z - 22, lamp);
		world.setBlock(x, y, z - 21, spike, 14, 2);
		for (int z1 = -20; z1 < 22; z1++) world.setBlock(x, y, z + z1, bedrock);
		world.setBlock(x, y, z + 22, spike, 14, 2);
		world.setBlock(x, y, z + 23, lamp);

		//17th row
		world.setBlock(x + 1, y, z - 20, eroded, 1, 2);
		for (int z1 = -19; z1 < 21; z1++) world.setBlock(x + 1, y, z + z1, bedrock);
		world.setBlock(x + 1, y, z + 21, eroded, 1, 2);

		//18th row
		world.setBlock(x + 2, y, z - 19, spike, 14, 2);
		world.setBlock(x + 2, y, z - 18, spike, 14, 2);
		world.setBlock(x + 2, y, z - 17, spike, 14, 2);
		for (int z1 = -16; z1 < 18; z1++) world.setBlock(x + 2, y, z + z1, bedrock);
		world.setBlock(x + 2, y, z + 18, spike, 14, 2);
		world.setBlock(x + 2, y, z + 19, spike, 14, 2);
		world.setBlock(x + 2, y, z + 20, spike, 14, 2);

		//19th row
		world.setBlock(x + 3, y, z - 15, eroded, 1, 2);
		for (int z1 = -14; z1 < 16; z1++) world.setBlock(x + 3, y, z + z1, bedrock);
		world.setBlock(x + 3, y, z + 16, eroded, 1, 2);

		//20th row
		world.setBlock(x + 4, y, z - 14, spike, 14, 2);
		for (int z1 = -13; z1 < 15; z1++) world.setBlock(x + 4, y, z + z1, bedrock);
		world.setBlock(x + 4, y, z + 15, spike, 14, 2);

		//21st row
		world.setBlock(x + 5, y, z - 14, spike, 14, 2);
		for (int z1 = -13; z1 < 15; z1++) world.setBlock(x + 5, y, z + z1, bedrock);
		world.setBlock(x + 5, y, z + 15, spike, 14, 2);

		//22nd row
		world.setBlock(x + 6, y, z - 13, spike, 14, 2);
		for (int z1 = -12; z1 < 14; z1++) world.setBlock(x + 6, y, z + z1, bedrock);
		world.setBlock(x + 6, y, z + 14, spike, 14, 2);

		//23rd row
		world.setBlock(x + 7, y, z - 13, eroded, 1, 2);
		world.setBlock(x + 7, y, z - 12, spike, 14, 2);
		for (int z1 = -11; z1 < 13; z1++) world.setBlock(x + 7, y, z + z1, bedrock);
		world.setBlock(x + 7, y, z + 13, spike, 14, 2);
		world.setBlock(x + 7, y, z + 14, eroded, 1, 2);

		//24th row
		world.setBlock(x + 8, y, z - 11, spike, 14, 2);
		world.setBlock(x + 8, y, z - 10, spike, 14, 2);
		for (int z1 = -9; z1 < 11; z1++) world.setBlock(x + 8, y, z + z1, bedrock);
		world.setBlock(x + 8, y, z + 11, spike, 14, 2);
		world.setBlock(x + 8, y, z + 12, spike, 14, 2);

		//25th row
		world.setBlock(x + 9, y, z - 9, eroded, 1, 2);
		world.setBlock(x + 9, y, z - 8, spike, 14, 2);
		for (int z1 = -7; z1 < 9; z1++) world.setBlock(x + 9, y, z + z1, bedrock);
		world.setBlock(x + 9, y, z + 9, spike, 14, 2);
		world.setBlock(x + 9, y, z + 10, eroded, 1, 2);

		//26th row
		world.setBlock(x + 10, y, z - 8, spike, 14, 2);
		for (int z1 = -7; z1 < 9; z1++) world.setBlock(x + 10, y, z + z1, bedrock);
		world.setBlock(x + 10, y, z + 9, spike, 14, 2);

		//27th row
		world.setBlock(x + 11, y, z - 8, spike, 14, 2);
		for (int z1 = -7; z1 < 9; z1++) world.setBlock(x + 11, y, z + z1, bedrock);
		world.setBlock(x + 11, y, z + 9, spike, 14, 2);

		//28th row
		world.setBlock(x + 12, y, z - 8, spike, 14, 2);
		for (int z1 = -7; z1 < 9; z1++) world.setBlock(x + 12, y, z + z1, bedrock);
		world.setBlock(x + 12, y, z + 9, spike, 14, 2);

		//29th row
		world.setBlock(x + 13, y, z - 8, spike, 14, 2);
		for (int z1 = -7; z1 < 9; z1++) world.setBlock(x + 13, y, z + z1, bedrock);
		world.setBlock(x + 13, y, z + 9, spike, 14, 2);

		//30th row
		world.setBlock(x + 14, y, z - 7, eroded, 1, 2);
		for (int z1 = -6; z1 < 8; z1++) world.setBlock(x + 14, y, z + z1, bedrock);
		world.setBlock(x + 14, y, z + 8, eroded, 1, 2);

		//31st row
		world.setBlock(x + 15, y, z - 6, spike, 14, 2);
		for (int z1 = -5; z1 < 7; z1++) world.setBlock(x + 15, y, z + z1, bedrock);
		world.setBlock(x + 15, y, z + 7, spike, 14, 2);

		//32nd row
		world.setBlock(x + 16, y, z - 6, lamp);
		world.setBlock(x + 16, y, z - 5, eroded, 1, 2);
		for (int z1 = -4; z1 < 6; z1++) world.setBlock(x + 16, y, z + z1, bedrock);
		world.setBlock(x + 16, y, z + 6, eroded, 1, 2);
		world.setBlock(x + 16, y, z + 7, lamp);

		//33rd row
		world.setBlock(x + 17, y, z - 4, spike, 14, 2);
		for (int z1 = -3; z1 < 5; z1++) world.setBlock(x + 17, y, z + z1, bedrock);
		world.setBlock(x + 17, y, z + 5, spike, 14, 2);

		//34th row
		world.setBlock(x + 18, y, z - 3, eroded, 1, 2);
		world.setBlock(x + 18, y ,z - 2, bedrock);
		world.setBlock(x + 18, y ,z - 1, bedrock);
		world.setBlock(x + 18, y ,z, bedrock);
		world.setBlock(x + 18, y ,z + 1, bedrock);
		world.setBlock(x + 18, y ,z + 2, bedrock);
		world.setBlock(x + 18, y ,z + 3, bedrock);
		world.setBlock(x + 18, y, z + 4, eroded, 1, 2);

		//35th row
		world.setBlock(x + 19, y, z - 2, spike, 14, 2);
		world.setBlock(x + 19, y, z - 1, spike, 14, 2);
		world.setBlock(x + 19, y, z, spike, 14, 2);
		world.setBlock(x + 19, y, z + 1, spike, 14, 2);
		world.setBlock(x + 19, y, z + 2, spike, 14, 2);
		world.setBlock(x + 19, y, z + 3, spike, 14, 2);
	}

	public void generateBossFloor(World world, Random rand, int x, int y, int z, int meta)
	{
		//generates a larger empty room, every 10 floors is a normal boss spawner with mini-boss spawners (4), every 5 floors is mini-boss spawners only (5)
	}

	public void generateNormalFloor(World world, Random rand, int x, int y, int z, int floorNumber)
	{
		//generates a normal floor
		if ((floorNumber % 5) == 3) 
		{
			//generate a double soul chest with good stuff in it
			//this.applyChestContents(world, rand, x, y, z, TragicItems.AwesomeChestHook);
		}
	}

	public void generateTopFloor(World world, Random rand, int x, int y, int z)
	{
		//generates floor that the Aegar will appear in
	}

	public String getMobNameforSpawner(Random rand)
	{
		return this.getRandomEntityNameForSpawner(rand.nextInt(9));
	}

	public String getMiniBossForSpawner(Random rand)
	{
		return this.getRandomBossNameForSpawner(rand.nextInt(7));
	}
	
	public String getRandomEntityNameForSpawner(int i)
	{
		String s = TragicConfig.allowTragicNeko ? "TragicMC.TragicNeko" : "Skeleton";

		switch(i)
		{
		case 0:
			s = TragicConfig.allowMinotaur ? "TragicMC.Minotaur" : this.getRandomVanillaEntityNameForSpawner(i);
			break;
		case 1:
			s = TragicConfig.allowInkling ? "TragicMC.Inkling" : this.getRandomVanillaEntityNameForSpawner(i);
			break;
		case 2:
			s = TragicConfig.allowJabba ? "TragicMC.Jabba" : this.getRandomVanillaEntityNameForSpawner(i);
			break;
		case 3:
			s = TragicConfig.allowNorVox ? "TragicMC.NorVox" : this.getRandomVanillaEntityNameForSpawner(i);
			break;
		case 4:
			s = TragicConfig.allowRagr ? "TragicMC.Ragr" : this.getRandomVanillaEntityNameForSpawner(i);
			break;
		case 5:
			s = TragicConfig.allowTox ? "TragicMC.Tox" : this.getRandomVanillaEntityNameForSpawner(i);
			break;
		case 6:
			s = TragicConfig.allowGragul ? "TragicMC.Gragul" : this.getRandomVanillaEntityNameForSpawner(i);
			break;
		case 7:
			s = TragicConfig.allowCryse ? "TragicMC.Cryse" : this.getRandomVanillaEntityNameForSpawner(i);
			break;
		default:
			break;
		}
		return s;
	}

	public String getRandomVanillaEntityNameForSpawner(int i)
	{
		String s = "Skeleton";

		switch(i)
		{
		case 0:
			s = "Zombie";
			break;
		case 1:
			s = "Enderman";
			break;
		case 2:
			s = "Slime";
			break;
		case 3:
			s = "Blaze";
			break;
		case 4:
			s = "Spider";
			break;
		case 5:
			s = "Witch";
			break;
		default:
			break;
		}
		return s;
	}

	public String getRandomBossNameForSpawner(int i)
	{
		String s = TragicConfig.allowVoxStellarum ? "TragicMC.VoxStellarum" : "WitherBoss";
		switch(i)
		{
		case 0:
			s = TragicConfig.allowJarra ? "TragicMC.Jarra" : "WitherBoss";
			break;
		case 1:
			s = TragicConfig.allowMegaCryse ? "TragicMC.MegaCryse" : "WitherBoss";
			break;
		case 2:
			s = TragicConfig.allowKragul ? "TragicMC.Kragul" : "WitherBoss";
			break;
		case 3:
			s = TragicConfig.allowStinKing ? "TragicMC.StinKing" : "WitherBoss";
			break;
		case 4:
			s = TragicConfig.allowStinQueen ? "TragicMC.StinQueen" : "WitherBoss";
			break;
		case 5:
			s = "WitherBoss";
			break;
		default:
			break;
		}
		return s;
	}
}
