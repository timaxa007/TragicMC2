package tragicneko.tragicmc.client.model.armor;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * ModelDarkArmor - TragicNeko
 * Created using Tabula 4.1.1
 */
public class ModelOverlordArmor extends ModelBiped {
	
    public ModelRenderer shape57;
    public ModelRenderer shape58;
    public ModelRenderer shape59;
    public ModelRenderer shape60;
    public ModelRenderer shape61;
    public ModelRenderer shape13;
    public ModelRenderer shape27;
    public ModelRenderer shape28;
    public ModelRenderer shape29;
    public ModelRenderer shape30;
    public ModelRenderer shape76;
    public ModelRenderer shape77;
    public ModelRenderer shape86;
    public ModelRenderer shape102;
    public ModelRenderer shape103;
    public ModelRenderer shape104;
    public ModelRenderer shape105;
    public ModelRenderer shape106;
    public ModelRenderer shape107;
    public ModelRenderer shape108;
    public ModelRenderer shape109;
    public ModelRenderer shape52;
    public ModelRenderer shape53;
    public ModelRenderer shape54;
    public ModelRenderer shape55;
    public ModelRenderer shape56;
    public ModelRenderer shape31;
    public ModelRenderer shape44;
    public ModelRenderer shape45;
    public ModelRenderer shape84;
    public ModelRenderer shape85;
    public ModelRenderer shape87;
    public ModelRenderer shape88;
    public ModelRenderer shape89;
    public ModelRenderer shape90;
    public ModelRenderer shape91;
    public ModelRenderer shape92;
    public ModelRenderer shape93;
    public ModelRenderer shape94;
    public ModelRenderer shape95;
    public ModelRenderer shape96;
    public ModelRenderer shape97;
    public ModelRenderer shape62;
    public ModelRenderer shape64;
    public ModelRenderer shape70;
    public ModelRenderer shape98;
    public ModelRenderer shape100;
    public ModelRenderer shape63;
    public ModelRenderer shape65;
    public ModelRenderer shape71;
    public ModelRenderer shape99;
    public ModelRenderer shape101;
    
    public final int armorType;

    public ModelOverlordArmor(int i) {
    	this.armorType = i;
		this.textureWidth = 96;
		this.textureHeight = 32;
		
        this.bipedLeftArm = new ModelRenderer(this, 0, 16);
        this.bipedLeftArm.mirror = true;
        this.bipedLeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
        this.bipedLeftArm.addBox(0.0F, -2.5F, -3.0F, 6, 6, 6, 0.0F);
        this.shape28 = new ModelRenderer(this, 0, 0);
        this.shape28.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape28.addBox(-4.5F, -8.5F, -4.0F, 1, 5, 8, 0.0F);
        this.shape106 = new ModelRenderer(this, 48, 16);
        this.shape106.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape106.addBox(1.5F, -7.0F, 5.0F, 2, 2, 1, 0.0F);
        this.shape89 = new ModelRenderer(this, 48, 0);
        this.shape89.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape89.addBox(-2.0F, 7.5F, -4.0F, 4, 3, 1, 0.0F);
        this.shape45 = new ModelRenderer(this, 64, 0);
        this.shape45.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape45.addBox(5.0F, 6.5F, -4.0F, 1, 2, 7, 0.0F);
        this.shape63 = new ModelRenderer(this, 0, 0);
        this.shape63.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape63.addBox(-1.9F, 8.5F, -3.0F, 6, 4, 6, 0.0F);
        this.shape71 = new ModelRenderer(this, 48, 16);
        this.shape71.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape71.addBox(-0.9F, 9.5F, -4.0F, 4, 3, 1, 0.0F);
        this.shape94 = new ModelRenderer(this, 48, 0);
        this.shape94.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape94.addBox(-6.0F, 6.0F, 3.0F, 12, 4, 1, 0.0F);
        this.shape85 = new ModelRenderer(this, 48, 16);
        this.shape85.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape85.addBox(-4.0F, 1.5F, -4.0F, 2, 2, 1, 0.0F);
        this.shape93 = new ModelRenderer(this, 48, 0);
        this.shape93.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape93.addBox(-5.0F, 9.5F, -4.0F, 3, 1, 1, 0.0F);
        this.bipedHeadwear = new ModelRenderer(this, 32, 0);
        this.bipedHeadwear.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bipedHeadwear.addBox(-3.5F, -8.5F, -5.0F, 7, 6, 1, 0.0F);
        this.shape88 = new ModelRenderer(this, 48, 0);
        this.shape88.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape88.addBox(2.0F, 7.5F, -4.0F, 3, 1, 1, 0.0F);
        this.shape77 = new ModelRenderer(this, 0, 0);
        this.shape77.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape77.addBox(4.5F, -10.5F, -2.5F, 1, 8, 7, 0.0F);
        this.bipedRightLeg = new ModelRenderer(this, 0, 16);
        this.bipedRightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
        if (this.armorType == 2) this.bipedRightLeg.addBox(-3.0F, -0.5F, -2.5F, 5, 12, 5, 0.0F);
        this.shape91 = new ModelRenderer(this, 48, 0);
        this.shape91.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape91.addBox(-6.0F, 9.5F, -4.0F, 1, 2, 7, 0.0F);
        this.shape108 = new ModelRenderer(this, 0, 0);
        this.shape108.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape108.addBox(-7.5F, -8.0F, -1.5F, 2, 4, 5, 0.0F);
        this.shape64 = new ModelRenderer(this, 48, 0);
        this.shape64.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape64.addBox(-1.9F, 6.5F, -3.5F, 2, 2, 1, 0.0F);
        this.shape65 = new ModelRenderer(this, 48, 0);
        this.shape65.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape65.addBox(-0.1F, 6.5F, -3.5F, 2, 2, 1, 0.0F);
        this.shape76 = new ModelRenderer(this, 0, 0);
        this.shape76.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape76.addBox(-5.5F, -10.5F, -2.5F, 1, 8, 7, 0.0F);
        this.shape61 = new ModelRenderer(this, 48, 16);
        this.shape61.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape61.addBox(-4.5F, -3.5F, -0.5F, 2, 1, 2, 0.0F);
        this.shape59 = new ModelRenderer(this, 64, 16);
        this.shape59.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape59.addBox(-2.5F, -1.5F, 3.0F, 2, 2, 1, 0.0F);
        this.shape58 = new ModelRenderer(this, 64, 16);
        this.shape58.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape58.addBox(-3.0F, -1.0F, -4.0F, 2, 2, 1, 0.0F);
        this.shape29 = new ModelRenderer(this, 0, 0);
        this.shape29.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape29.addBox(3.5F, -8.5F, -4.0F, 1, 5, 8, 0.0F);
        this.shape103 = new ModelRenderer(this, 48, 16);
        this.shape103.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape103.addBox(-3.0F, -8.0F, -6.0F, 2, 2, 1, 0.0F);
        this.shape30 = new ModelRenderer(this, 0, 0);
        this.shape30.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape30.addBox(-4.5F, -8.5F, 4.0F, 9, 6, 1, 0.0F);
        this.bipedHead = new ModelRenderer(this, 0, 0);
        this.bipedHead.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bipedHead.addBox(-4.0F, -8.0F, -4.0F, 0, 0, 0, 0.0F);
        this.shape100 = new ModelRenderer(this, 48, 0);
        this.shape100.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape100.addBox(-3.4F, 6.0F, 1.0F, 5, 3, 3, 0.0F);
        this.shape56 = new ModelRenderer(this, 48, 16);
        this.shape56.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape56.addBox(2.0F, -3.5F, -2.0F, 2, 1, 2, 0.0F);
        this.shape54 = new ModelRenderer(this, 64, 16);
        this.shape54.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape54.addBox(1.0F, 0.0F, 3.0F, 2, 2, 1, 0.0F);
        this.shape53 = new ModelRenderer(this, 64, 16);
        this.shape53.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape53.addBox(1.0F, 0.5F, -4.0F, 2, 2, 1, 0.0F);
        this.shape44 = new ModelRenderer(this, 64, 0);
        this.shape44.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape44.addBox(-6.0F, 6.5F, -4.0F, 1, 2, 7, 0.0F);
        this.shape101 = new ModelRenderer(this, 48, 0);
        this.shape101.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape101.addBox(-1.4F, 6.0F, 1.0F, 5, 3, 3, 0.0F);
        this.shape57 = new ModelRenderer(this, 64, 16);
        this.shape57.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape57.addBox(-7.0F, -0.5F, 0.5F, 1, 2, 2, 0.0F);
        this.shape62 = new ModelRenderer(this, 0, 0);
        this.shape62.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape62.addBox(-3.9F, 8.5F, -3.0F, 6, 4, 6, 0.0F);
        this.shape31 = new ModelRenderer(this, 64, 0);
        this.shape31.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape31.addBox(-1.5F, 3.5F, -5.0F, 3, 3, 2, 0.0F);
        this.shape90 = new ModelRenderer(this, 48, 0);
        this.shape90.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape90.addBox(5.0F, 9.5F, -4.0F, 1, 2, 7, 0.0F);
        this.shape98 = new ModelRenderer(this, 48, 16);
        this.shape98.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape98.addBox(-1.9F, 2.0F, -3.5F, 3, 3, 1, 0.0F);
        this.shape104 = new ModelRenderer(this, 48, 16);
        this.shape104.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape104.addBox(0.0F, -10.5F, -2.0F, 2, 1, 2, 0.0F);
        this.bipedRightArm = new ModelRenderer(this, 0, 16);
        this.bipedRightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
        this.bipedRightArm.addBox(-6.0F, -2.5F, -3.0F, 6, 6, 6, 0.0F);
        this.shape84 = new ModelRenderer(this, 48, 16);
        this.shape84.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape84.addBox(0.5F, 0.0F, -4.0F, 2, 2, 1, 0.0F);
        this.shape27 = new ModelRenderer(this, 0, 0);
        this.shape27.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape27.addBox(-4.5F, -9.5F, -4.0F, 9, 1, 9, 0.0F);
        this.bipedEars = new ModelRenderer(this, 24, 0);
        this.bipedEars.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bipedEars.addBox(-3.0F, -6.0F, -1.0F, 0, 0, 0, 0.0F);
        this.shape13 = new ModelRenderer(this, 64, 0);
        this.shape13.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape13.addBox(-2.0F, -4.0F, -6.0F, 4, 2, 1, 0.0F);
        this.shape102 = new ModelRenderer(this, 48, 16);
        this.shape102.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape102.addBox(0.0F, -7.0F, -6.0F, 2, 2, 1, 0.0F);
        this.bipedBody = new ModelRenderer(this, 16, 16);
        this.bipedBody.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bipedBody.addBox(-5.0F, -0.5F, -3.0F, 10, 12, 6, 0.0F);
        this.shape86 = new ModelRenderer(this, 48, 0);
        this.shape86.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape86.addBox(-1.0F, -2.0F, -6.0F, 2, 1, 1, 0.0F);
        this.shape96 = new ModelRenderer(this, 48, 16);
        this.shape96.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape96.addBox(-4.0F, 0.0F, 3.0F, 2, 2, 1, 0.0F);
        this.shape70 = new ModelRenderer(this, 48, 16);
        this.shape70.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape70.addBox(-2.9F, 9.5F, -4.0F, 4, 3, 1, 0.0F);
        this.shape97 = new ModelRenderer(this, 48, 16);
        this.shape97.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape97.addBox(2.5F, 1.5F, 3.0F, 2, 2, 1, 0.0F);
        this.shape55 = new ModelRenderer(this, 0, 0);
        this.shape55.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape55.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.shape95 = new ModelRenderer(this, 48, 0);
        this.shape95.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape95.addBox(-1.0F, -1.0F, 3.0F, 2, 7, 1, 0.0F);
        this.shape52 = new ModelRenderer(this, 64, 16);
        this.shape52.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape52.addBox(6.0F, -1.5F, -2.0F, 1, 2, 2, 0.0F);
        this.setRotateAngle(shape52, 0.0F, 0.0F, 0.017453292519943295F);
        this.shape109 = new ModelRenderer(this, 48, 16);
        this.shape109.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape109.addBox(-3.0F, -5.0F, 5.0F, 2, 2, 1, 0.0F);
        this.shape60 = new ModelRenderer(this, 0, 0);
        this.shape60.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape60.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.shape107 = new ModelRenderer(this, 0, 0);
        this.shape107.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape107.addBox(5.5F, -8.0F, -1.5F, 2, 4, 5, 0.0F);
        this.bipedLeftLeg = new ModelRenderer(this, 0, 16);
        this.bipedLeftLeg.mirror = true;
        this.bipedLeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
        if (this.armorType == 2) this.bipedLeftLeg.addBox(-2.0F, -0.5F, -2.5F, 5, 12, 5, 0.0F);
        this.shape99 = new ModelRenderer(this, 48, 16);
        this.shape99.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape99.addBox(-0.9F, 2.0F, -3.5F, 3, 3, 1, 0.0F);
        this.shape87 = new ModelRenderer(this, 48, 0);
        this.shape87.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape87.addBox(-5.0F, 7.5F, -4.0F, 3, 1, 1, 0.0F);
        this.shape105 = new ModelRenderer(this, 48, 16);
        this.shape105.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape105.addBox(-2.5F, -10.5F, 1.0F, 2, 1, 2, 0.0F);
        this.shape92 = new ModelRenderer(this, 48, 0);
        this.shape92.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape92.addBox(2.0F, 9.5F, -4.0F, 3, 1, 1, 0.0F);
        this.bipedHeadwear.addChild(this.shape28);
        this.bipedHeadwear.addChild(this.shape106);
        this.bipedBody.addChild(this.shape89);
        this.bipedBody.addChild(this.shape45);
        if (this.armorType == 3) this.bipedLeftLeg.addChild(this.shape63);
        if (this.armorType == 3) this.bipedLeftLeg.addChild(this.shape71);
        this.bipedBody.addChild(this.shape94);
        this.bipedBody.addChild(this.shape85);
        this.bipedBody.addChild(this.shape93);
        this.bipedBody.addChild(this.shape88);
        this.bipedHeadwear.addChild(this.shape77);
        this.bipedBody.addChild(this.shape91);
        this.bipedHeadwear.addChild(this.shape108);
        if (this.armorType == 3) this.bipedRightLeg.addChild(this.shape64);
        if (this.armorType == 3) this.bipedLeftLeg.addChild(this.shape65);
        this.bipedHeadwear.addChild(this.shape76);
        this.bipedRightArm.addChild(this.shape61);
        this.bipedRightArm.addChild(this.shape59);
        this.bipedRightArm.addChild(this.shape58);
        this.bipedHeadwear.addChild(this.shape29);
        this.bipedHeadwear.addChild(this.shape103);
        this.bipedHeadwear.addChild(this.shape30);
        if (this.armorType == 3) this.bipedRightLeg.addChild(this.shape100);
        this.bipedLeftArm.addChild(this.shape56);
        this.bipedLeftArm.addChild(this.shape54);
        this.bipedLeftArm.addChild(this.shape53);
        this.bipedBody.addChild(this.shape44);
        if (this.armorType == 3) this.bipedLeftLeg.addChild(this.shape101);
        this.bipedRightArm.addChild(this.shape57);
        if (this.armorType == 3) this.bipedRightLeg.addChild(this.shape62);
        this.bipedBody.addChild(this.shape31);
        this.bipedBody.addChild(this.shape90);
        if (this.armorType == 2) this.bipedRightLeg.addChild(this.shape98);
        this.bipedHeadwear.addChild(this.shape104);
        this.bipedBody.addChild(this.shape84);
        this.bipedHeadwear.addChild(this.shape27);
        this.bipedHeadwear.addChild(this.shape13);
        this.bipedHeadwear.addChild(this.shape102);
        this.bipedHeadwear.addChild(this.shape86);
        this.bipedBody.addChild(this.shape96);
        if (this.armorType == 3) this.bipedRightLeg.addChild(this.shape70);
        this.bipedBody.addChild(this.shape97);
        this.bipedLeftArm.addChild(this.shape55);
        this.bipedBody.addChild(this.shape95);
        this.bipedLeftArm.addChild(this.shape52);
        this.bipedHeadwear.addChild(this.shape109);
        this.bipedRightArm.addChild(this.shape60);
        this.bipedHeadwear.addChild(this.shape107);
        if (this.armorType == 2) this.bipedLeftLeg.addChild(this.shape99);
        this.bipedBody.addChild(this.shape87);
        this.bipedHeadwear.addChild(this.shape105);
        this.bipedBody.addChild(this.shape92);
    }

    @Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
		this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);

		if (this.isChild)
		{
			float f6 = 2.0F;
			GL11.glPushMatrix();
			GL11.glScalef(1.5F / f6, 1.5F / f6, 1.5F / f6);
			GL11.glTranslatef(0.0F, 16.0F * f5, 0.0F);
			if (this.armorType == 0) this.bipedHead.render(f5);
			GL11.glPopMatrix();
			GL11.glPushMatrix();
			GL11.glScalef(1.0F / f6, 1.0F / f6, 1.0F / f6);
			GL11.glTranslatef(0.0F, 24.0F * f5, 0.0F);
			if (this.armorType == 1) this.bipedBody.render(f5);
			if (this.armorType == 1) this.bipedRightArm.render(f5);
			if (this.armorType == 1) this.bipedLeftArm.render(f5);
			if (this.armorType >= 2) this.bipedRightLeg.render(f5);
			if (this.armorType >= 2) this.bipedLeftLeg.render(f5);
			if (this.armorType == 0) this.bipedHeadwear.render(f5);
			GL11.glPopMatrix();
		}
		else
		{
			if (this.armorType == 0) this.bipedHead.render(f5);
			if (this.armorType == 1) this.bipedBody.render(f5);
			if (this.armorType == 1) this.bipedRightArm.render(f5);
			if (this.armorType == 1) this.bipedLeftArm.render(f5);
			if (this.armorType >= 2) this.bipedRightLeg.render(f5);
			if (this.armorType >= 2) this.bipedLeftLeg.render(f5);
			if (this.armorType == 0) this.bipedHeadwear.render(f5);
		}
	}

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
