package tragicneko.tragicmc.entity;

import tragicneko.tragicmc.TragicMC;
import tragicneko.tragicmc.entity.projectile.EntityProjectile;
import tragicneko.tragicmc.util.DamageHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityGuardianShield extends EntityProjectile {

	private boolean motionFlag;

	private double xOffset;
	private double zOffset;
	
	private float maxHealth = 20.0F;
	private float health = maxHealth;

	public EntityGuardianShield(World world) {
		super(world);
		this.motionFlag = false;
		this.preventEntitySpawning = true;
		this.setSize(1.5F, 3.5F);
	}
	
	public EntityGuardianShield(World par1World, EntityLivingBase par2EntityLivingBase, double par3, double par5, double par7) {
		super(par1World, par2EntityLivingBase, par3, par5, par7);
	}

	@Override
	public boolean canBePushed()
	{
		return false;
	}

	@Override
	public void setCurrentItemOrArmor(int i, ItemStack stack) {

	}

	@Override
	public ItemStack[] getLastActiveItems() {
		return new ItemStack[] {};
	}

	public EntityGuardianShield setShieldMaxHealth(float f)
	{
		this.maxHealth = f;
		this.setHealth(f);
		return this;
	}
	
	public void setHealth(float f)
	{
		this.health = f;
	}

	public void setShieldOffsets(double offx, double offz)
	{
		this.xOffset = offx;
		this.zOffset = offz;
	}

	@Override
	public boolean handleWaterMovement()
	{
		return false;
	}

	@Override
	public void setAir(int i) {}

	@Override
	public void fall(float f) {}

	@Override
	public void updateFallState(double d0, boolean flag) {}

	@Override
	public void readEntityFromNBT(NBTTagCompound tag) {
		super.readEntityFromNBT(tag);
		Entity entity = null;
		if (tag.hasKey("ownerID")) entity = this.worldObj.getEntityByID(tag.getInteger("ownerID"));
		if (entity != null && entity instanceof EntityLivingBase) this.shootingEntity = (EntityLivingBase) entity;
		if (tag.hasKey("motionFlag")) this.motionFlag = tag.getBoolean("motionFlag");
		if (tag.hasKey("offsetX")) this.xOffset = tag.getDouble("offsetX");
		if (tag.hasKey("offsetZ")) this.zOffset = tag.getDouble("offsetZ");
		if (tag.hasKey("health")) this.health = tag.getFloat("health");
		if (tag.hasKey("healthMax")) this.maxHealth = tag.getFloat("maxHealth");
	}

	@Override
	public void writeEntityToNBT(NBTTagCompound tag)
	{
		super.writeEntityToNBT(tag);
		if (this.shootingEntity != null) tag.setInteger("ownerID", this.shootingEntity.getEntityId());
		tag.setBoolean("motionFlag", this.motionFlag);
		tag.setDouble("offsetX", this.xOffset);
		tag.setDouble("offsetZ", this.zOffset);
		tag.setFloat("health", this.health);
		tag.setFloat("healthMax", this.maxHealth);
	}

	@Override
	public boolean attackEntityFrom(DamageSource src, float dmg)
	{
		if (src == DamageSource.inWall) return false;
		
		if (src.getEntity() != null && src.getEntity() == this.shootingEntity)
		{
			this.motionFlag = true;
			TragicMC.logInfo("Shield attacked by creator");
			return super.attackEntityFrom(src, dmg);
		}
		
		if (this.shootingEntity != null && !this.worldObj.isRemote)
		{
			this.health -= dmg;
			if (this.health <= 0F) this.setDead();
			TragicMC.logInfo("Shield damaged, health is " + health);
		}
		
		return super.attackEntityFrom(src, dmg);
	}

	@Override
	public void onUpdate()
	{
		if (!this.motionFlag && this.shootingEntity != null)
		{
			this.motionX = this.shootingEntity.motionX;
			this.motionY = this.shootingEntity.motionY;
			this.motionZ = this.shootingEntity.motionZ;

			this.setPosition(this.shootingEntity.posX + this.xOffset, this.shootingEntity.posY + 0.3, this.shootingEntity.posZ + this.zOffset);
		}
		else if (this.motionFlag)
		{
			super.onUpdate();
		}

		if (this.ticksExisted > 1200) this.setDead();
	}

	@Override
	protected void onImpact(MovingObjectPosition var1) {
		if (this.worldObj.isRemote || var1 == null) return;
		
		if (this.motionFlag)
		{
			if (var1.entityHit != null)
			{
				var1.entityHit.attackEntityFrom(this.shootingEntity != null ? DamageHelper.causeModMagicDamageToEntity(this.shootingEntity) : DamageSource.magic , this.maxHealth / 10.0F);
			}
			
			this.worldObj.createExplosion(this.shootingEntity != null ? this.shootingEntity : this, this.posX, this.posY, this.posZ, (this.maxHealth / 10.0F) * rand.nextFloat(), false);
		}
	}
}