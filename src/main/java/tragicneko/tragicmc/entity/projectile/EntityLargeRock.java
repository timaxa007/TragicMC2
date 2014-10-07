package tragicneko.tragicmc.entity.projectile;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import tragicneko.tragicmc.entity.boss.EntityYeti;
import tragicneko.tragicmc.entity.mob.EntityAbomination;
import tragicneko.tragicmc.main.TragicNewConfig;
import tragicneko.tragicmc.main.TragicPotions;

public class EntityLargeRock extends EntityProjectile {

	public EntityLargeRock(World world) {
		super(world);
		this.motionY += 0.45D;
	}

	public EntityLargeRock(World par1World, EntityLivingBase par2EntityLivingBase, double par3, double par5, double par7)
	{
		super(par1World, par2EntityLivingBase, par3, par5, par7);
		this.motionY += 0.45D;
	}

	protected float getMotionFactor()
	{
		return 0.869F;
	}

	@Override
	protected void onImpact(MovingObjectPosition mop) {
		if (mop == null || this.worldObj.isRemote) return;
		
		if (mop.entityHit != null) 
		{			
			mop.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.shootingEntity), 12.0F);

			if (this.rand.nextInt(4) == 0 && mop.entityHit instanceof EntityLivingBase && TragicNewConfig.allowStun)
			{
				((EntityLivingBase) mop.entityHit).addPotionEffect(new PotionEffect(TragicPotions.Stun.id, 60, 0));
			}
		}

		boolean flag = this.worldObj.getGameRules().getGameRuleBooleanValue("mobGriefing");
		this.worldObj.createExplosion(this.shootingEntity, this.posX, this.posY, this.posZ, rand.nextFloat() + 2.0F, flag);
		
		this.setDead();
	}

	@Override
	protected String getParticleString()
	{
		return "crit";
	}

	public void onUpdate()
	{
		super.onUpdate();
		
		this.motionY -= 0.0205D;
	}

}
