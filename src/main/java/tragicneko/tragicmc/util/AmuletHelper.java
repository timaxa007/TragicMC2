package tragicneko.tragicmc.util;

import static tragicneko.tragicmc.TragicMC.rand;

import java.util.UUID;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.IAttribute;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.MathHelper;
import tragicneko.tragicmc.items.ItemAmulet;
import tragicneko.tragicmc.items.ItemAmulet.AmuletModifier;

public class AmuletHelper {
	
	private static IAttribute[] attributes = new IAttribute[] {AmuletModifier.jumpHeight, AmuletModifier.luck, AmuletModifier.reach, AmuletModifier.resistance,
		AmuletModifier.knockbackResistance, AmuletModifier.attackDamage, AmuletModifier.maxHealth, AmuletModifier.movementSpeed};

	/**
	 * Gets the highest amulet level of the 3 integers passed in, if par3 is 0, only checks for the first two integers passed in
	 * @param par1
	 * @param par2
	 * @param par3
	 * @return
	 */
	public static int getAmuletWithHighestLevel(int par1, int par2, int par3)
	{
		if (par3 != 0)
		{
			if (par1 > par2 && par1 > par3)
			{
				return par1;
			}

			if (par2 > par1 && par2 > par3)
			{
				return par2;
			}

			if (par3 > par1 && par3 > par2)
			{
				return par3;
			}

			if (par1 == par2 && par1 == par3)
			{
				return par1;
			}
		}
		else
		{
			if (par1 > par2)
			{
				return par1;
			}

			if (par2 > par1)
			{
				return par2;
			}

			if (par1 == par2)
			{
				return par1;
			}
		}
		return (par1 * par2 * par3) / 3;
	}

	/**
	 * For getting the highest amulet level out of 2 amulets, will always return one of them if they are equal
	 * @param par1
	 * @param par2
	 * @return
	 */
	public static int getAmuletWithHighestLevel(int par1, int par2)
	{
		return getAmuletWithHighestLevel(par1, par2, 0);
	}

	/**
	 * Returns stacked percentages if all 3 amulets equipped are of the same kind, pass in the 3 percentages of successful effect use and returns the calculated
	 * stacked efficiency of the 3, first integer should be the highest amulet level, third should be lowest
	 * @param par1
	 * @param par2
	 * @param par3
	 * @return
	 */
	public static double getStackedEfficiency(int par1, int par2, int par3)
	{
		double d0 = par1 / 100;
		double d1 = par2 / 100;
		double d2 = par3 / 100;

		double d3 = (1 - d0) * d1;
		double d4 = (1 - (d0 + d3)) * d2;

		return d0 + d3 + d4;
	}

	/**
	 * Pass in the 3 amulets to check, returns an integer based on the amulets that are the same, 123 is all of them, 12 is the first two, etc., now does null
	 * check automatically and returns proper integer
	 * @param amu1
	 * @param amu2
	 * @param amu3
	 * @return
	 */
	public static int getSameAmulets(ItemAmulet amu1, ItemAmulet amu2, ItemAmulet amu3)
	{
		if (amu1 == null)
		{
			if (amu2 != null && amu3 != null)
			{
				if (amu2.getAmuletID() == amu3.getAmuletID())
				{
					return 23;
				}
			}
			return 0;
		}

		if (amu2 == null)
		{
			if (amu1 != null && amu3 != null)
			{
				if (amu1.getAmuletID() == amu3.getAmuletID())
				{
					return 13;
				}
			}
			return 0;
		}

		if (amu3 == null)
		{
			if (amu1 != null && amu2 != null)
			{
				if (amu1.getAmuletID() == amu2.getAmuletID())
				{
					return 12;
				}
			}
			return 0;
		}

		if (amu1.getAmuletID() == amu2.getAmuletID() && amu1.getAmuletID() == amu3.getAmuletID())
		{
			return 123;
		}

		if (amu1.getAmuletID() == amu2.getAmuletID() && amu1.getAmuletID() != amu3.getAmuletID())
		{
			return 12;
		}

		if (amu1.getAmuletID() == amu3.getAmuletID() && amu1.getAmuletID() != amu2.getAmuletID())
		{
			return 13;
		}

		if (amu2.getAmuletID() == amu3.getAmuletID() && amu1.getAmuletID() != amu3.getAmuletID())
		{
			return 23;
		}

		return 0;
	}
	
	public static int getAmuletLevel(ItemStack stack)
	{
		return stack != null && stack.hasTagCompound() && stack.getTagCompound().hasKey("amuletLevel") ? stack.getTagCompound().getInteger("amuletLevel") : 0;
	}
	
	public static AttributeModifier getRandomModifier(IAttribute attr)
	{
		double d0 = 0.0D;
		UUID uuid = null;

		if (attr == SharedMonsterAttributes.attackDamage)
		{
			d0 = rand.nextInt(20);
			uuid = UUID.fromString("237ab9b5-459c-4dcb-bcb8-4e8068ce9135");
		}
		else if (attr == SharedMonsterAttributes.knockbackResistance)
		{
			d0 = rand.nextInt(20) * 0.2;
			uuid = UUID.fromString("b41f1b8d-a0e7-42ee-acb4-a0f9c198626f");
		}
		else if (attr == SharedMonsterAttributes.maxHealth)
		{
			d0 = rand.nextInt(20);
			uuid = UUID.fromString("b06dedf7-fd45-442c-93b4-8fa70bc64d51");
		}
		else if (attr == SharedMonsterAttributes.movementSpeed)
		{
			d0 = rand.nextInt(20) * 0.02;
			uuid = UUID.fromString("1ab86156-baf5-4906-bb07-314a0e7faa59");
		}
		else if (attr == AmuletModifier.reach)
		{
			d0 = rand.nextInt(20) * 0.05;
			uuid = UUID.fromString("829ea197-31bf-4360-912e-93f6775fedc1");
		}
		else if (attr == AmuletModifier.jumpHeight)
		{
			d0 = rand.nextInt(10) * 0.25;
			uuid = UUID.fromString("8d325bc1-9b36-457f-a984-50cfed8331ed");
		}
		else if (attr == AmuletModifier.resistance)
		{
			d0 = rand.nextInt(10);
			uuid = UUID.fromString("f1695e8a-87f1-4491-bc02-90f3671d299e");
		}
		else if (attr == AmuletModifier.luck)
		{
			d0 = rand.nextDouble();
			uuid = UUID.fromString("1f5a801c-312a-4b26-aa7b-3170e63df540");
		}
		
		d0 = attr.clampValue(d0);

		return uuid == null ? null : new AttributeModifier(uuid, attr.getAttributeUnlocalizedName(), d0, 0);
	}
	
	public static IAttribute getRandomAttribute()
	{
		return attributes[rand.nextInt(attributes.length)];
	}
	
	public static NBTTagCompound writeAttributeModifierToNBT(IAttribute atr, AttributeModifier modif)
	{
		NBTTagCompound nbttagcompound = new NBTTagCompound();
		nbttagcompound.setString("Name", modif.getName());
		nbttagcompound.setDouble("Amount", modif.getAmount());
		nbttagcompound.setInteger("Operation", modif.getOperation());
		nbttagcompound.setLong("UUIDMost", modif.getID().getMostSignificantBits());
		nbttagcompound.setLong("UUIDLeast", modif.getID().getLeastSignificantBits());
		nbttagcompound.setString("AttributeName", atr.getAttributeUnlocalizedName());
		return nbttagcompound;
	}
}
