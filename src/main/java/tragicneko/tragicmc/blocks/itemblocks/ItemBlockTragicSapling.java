package tragicneko.tragicmc.blocks.itemblocks;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlockWithMetadata;
import net.minecraft.item.ItemStack;

public class ItemBlockTragicSapling extends TragicItemBlock {

	private static final String[] subNames = new String[] {"painted", "bleached", "ashen", "hallowed", "darkwood"};

	public ItemBlockTragicSapling(Block block) {
		super(block, subNames);
		this.setUnlocalizedName("tragicmc.sapling");
	}

	@Override
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par2List, boolean par4)
	{
		par2List.add("These must be grown with bone meal.");
	}
}
