package tragicneko.tragicmc.blocks.itemblocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;

public class ItemBlockStructureSeeds extends TragicItemBlock {

	private static String[] subNames = new String[] {"apisTemple", "desertTower", "forestTower", "mesaTower", "netherTower", "deathCircle", "iceTower", "obsidianCavern.random",
		"kitsuneDen", "celestialTemple", "timeAltar", "aegarTower"};

	public ItemBlockStructureSeeds(Block p_i45326_1_) {
		super(p_i45326_1_, subNames);
		this.setUnlocalizedName("tragicmc.structureSeed");
	}

	@Override
	@SideOnly(Side.CLIENT)
	public int getColorFromItemStack(ItemStack par1ItemStack, int par2)
	{
		int color = 0x000000;

		switch (par1ItemStack.getItemDamage())
		{
		case 0: //Apis Temple
			color = 0xEAD739;
			break;
		case 1: //Desert Tower
			color = 0xEAD2AD;
			break;
		case 2: //Forest tower
			color = 0xC3E799;
			break;
		case 3: //Mesa tower
			color = 0xEFBC59;
			break;
		case 4: //Nether tower
			color = 0xCD472D;
			break;
		case 5: //Death Circle
			color = 0x770300;
			break;
		case 6: //Ice Tower
			color = 0xD0FFEF;
			break;
		case 7:
			color = 0x797979;
			break;
		case 8: //Kitsune Den
			color = 0xAF0000;
			break;
		case 9: //Celestial Temple
			color = 0xAA23AA;
			break;
		case 10: //Time Altar
			color = 0x23FF23;
			break;
		case 11: //Aegar Tower
			color = 0xFFFFFF;
		default:
			break;
		}
		return color;
	}
}
