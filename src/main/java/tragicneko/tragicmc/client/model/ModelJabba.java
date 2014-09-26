package tragicneko.tragicmc.client.model;

import java.util.Random;

import tragicneko.tragicmc.entity.mob.EntityJabba;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.MathHelper;

public class ModelJabba extends ModelBase
{
	protected ModelRenderer head;
	protected ModelRenderer body;
	protected ModelRenderer body2;
	protected ModelRenderer body3;
	protected ModelRenderer head2;

	private ModelRenderer leftPincer;
	private ModelRenderer rightPincer;
	private ModelRenderer leftTailPincer;
	private ModelRenderer rightTailPincer;

	public ModelJabba()
	{
		textureWidth = 64;
		textureHeight = 64;

		//Actual head and pincers
		head = new ModelRenderer(this, 32, 4);
		head.addBox(-4F, -4F, -8F, 8, 8, 8);
		head.setRotationPoint(0F, 18F, -3F);
		leftPincer = new ModelRenderer(this, 0, 32);
		leftPincer.addBox(1F, -1F, -12F, 4, 4, 4);
		head.addChild(leftPincer);
		rightPincer = new ModelRenderer(this, 0, 32);
		rightPincer.addBox(-5F, -1F, -12F, 4, 4, 4);
		head.addChild(rightPincer);

		//First body part
		body = new ModelRenderer(this, 0, 0);
		body.addBox(-3F, -3F, -3F, 6, 6, 6);
		body.setRotationPoint(0F, 18F, 0F);

		//Second body part
		body2 = new ModelRenderer(this, 0, 14);
		body2.addBox(-4F, -4F, -6F, 8, 8, 8);
		body2.setRotationPoint(0F, 18F, 9F);

		//Third body part
		body3 = new ModelRenderer(this, 0, 0);
		body3.addBox(-3F, -3F, -3F, 6, 6, 6);
		body3.setRotationPoint(0F, 18F, 14F);

		//Tail head and pincers
		head2 = new ModelRenderer(this, 32, 4);
		head2.addBox(-4F, -4F, 0F, 8, 8, 8);
		head2.setRotationPoint(0F, 18F, 17F);
		leftTailPincer = new ModelRenderer(this, 0, 32);
		leftTailPincer.addBox(1F, -1F, 8F, 4, 4, 4);
		head2.addChild(leftTailPincer);
		rightTailPincer = new ModelRenderer(this, 0, 32);
		rightTailPincer.addBox(-5F, -1F, 8F, 4, 4, 4);
		head2.addChild(rightTailPincer);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		head.render(f5);
		body.render(f5);
		body2.render(f5);
		body3.render(f5);
		head2.render(f5);
	}

	public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity entity)
	{
		this.head.rotateAngleY = par4 / (180F / (float)Math.PI);
		this.head.rotateAngleX = par5 / (180F / (float)Math.PI);
		this.head2.rotateAngleY = par4 / (180F / (float)Math.PI);
		this.head2.rotateAngleX = par5 / (180F / (float)Math.PI);
	}

	public void setLivingAnimations(EntityLivingBase entity, float par1, float par2, float par3)
	{				
		EntityJabba jab = (EntityJabba) entity;
		int i = jab.getAttackTicks();

		if (i > 0)
		{
			leftPincer.rotateAngleY = -0.15F + 0.15F * this.simplifyAngle((float)i - par3, 10.0F);
			rightPincer.rotateAngleY = -(-0.15F + 0.15F * this.simplifyAngle((float)i - par3, 10.0F));
			leftTailPincer.rotateAngleY = 0.1F + 0.15F * this.simplifyAngle((float)i - par3, 10.0F);
			rightTailPincer.rotateAngleY = -(0.1F + 0.15F * this.simplifyAngle((float)i - par3, 10.0F));
		}
		else
		{
			leftPincer.rotateAngleY = 0.0F;
			rightPincer.rotateAngleY = 0.0F;
			leftTailPincer.rotateAngleY = 0.0F;
			rightTailPincer.rotateAngleY = 0.0F;
		}
	}

	private float simplifyAngle(float par1, float par2)
	{
		return (Math.abs(par1 % par2 - par2 * 0.5F) - par2 * 0.25F) / (par2 * 0.25F);
	}

}
