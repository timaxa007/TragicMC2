package tragicneko.tragicmc.items.weapons;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.DamageSource;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class WeaponSwordOfJustice extends ItemSword {

	public WeaponSwordOfJustice(ToolMaterial p_i45356_1_) {
		super(p_i45356_1_);
		this.setMaxDamage(1);
	}
	
	public boolean hitEntity(ItemStack stack, EntityLivingBase entity, EntityLivingBase entity2)
    {
		if (entity2 instanceof EntityPlayer && !entity.worldObj.isRemote) entity.attackEntityFrom(DamageSource.causePlayerDamage((EntityPlayer) entity2), Float.MAX_VALUE);
		if (entity2 instanceof EntityPlayer && !entity.worldObj.isRemote && !((EntityPlayer) entity2).capabilities.isCreativeMode) stack.stackSize--;
		return super.hitEntity(stack, entity, entity2);
    }
	
	@SideOnly(Side.CLIENT)
	public EnumRarity getRarity(ItemStack par1ItemStack)
	{
		return EnumRarity.epic;
	}

	@SideOnly(Side.CLIENT)
	public boolean hasEffect(ItemStack par1ItemStack, int passes)
	{
		return true;
	}
}
