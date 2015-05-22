package ca.demetry.mcsolaris.world;

import java.util.Random;

import ca.zeor.mcsolaris.init.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class WorldOreGenerator implements IWorldGenerator{

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch (world.provider.dimensionId) {
		case -1:
			generateNether(random, chunkX * 16, chunkZ * 16, world);
			break;
		case 0:
			generateSurface(random, chunkX * 16, chunkZ * 16, world);
			break;
		case 1:
			generateEnd(random, chunkX * 16, chunkZ * 16, world);
			break;
		default:
			;
		}
	}
	
	private void addOre(Block block, Block blockSpawn, Random random, World world, int posX, int posZ, int minY, int maxY, int minVeinSize, int maxVeinSize, int spawnChance) {
		for (int i = 0; i < spawnChance; i++) {
			int defaultChunkSize = 16;
			
			int xPos = posX + random.nextInt(defaultChunkSize);
			int yPos = minY + random.nextInt(maxY - minY);
			int zPos = posZ + random.nextInt(defaultChunkSize);
			
			new WorldGenMinable(block, (minVeinSize + random.nextInt(maxVeinSize - minVeinSize)), blockSpawn).generate(world, random, xPos, yPos, zPos);
		}
	}

	private void generateEnd(Random random, int i, int j, World world) {
		// TODO Auto-generated method stub
		
	}

	private void generateSurface(Random random, int i, int j, World world) {
		addOre(ModBlocks.SolariumOre, Blocks.stone, random, world, i, j, 20, 60, 3, 6, 5);
		addOre(ModBlocks.LeadOre, Blocks.stone, random, world, i, j, 20, 60, 2, 8, 10);
		addOre(ModBlocks.TinOre, Blocks.stone, random, world, i, j, 20, 60, 3, 8, 10);
		addOre(ModBlocks.BariumOre, Blocks.stone, random, world, i, j, 20, 60, 4, 14, 10);
		addOre(ModBlocks.PhosphorusOre, Blocks.stone, random, world, i, j, 20, 60, 4, 14, 10);
		addOre(ModBlocks.SilverOre, Blocks.stone, random, world, i, j, 20, 60, 1, 6, 5);
	}

	private void generateNether(Random random, int i, int j, World world) {
	}
}