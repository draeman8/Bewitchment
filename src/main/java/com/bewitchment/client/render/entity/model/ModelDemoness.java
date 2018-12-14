package com.bewitchment.client.render.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * demoness2 - cybercat5555
 * Created using Tabula 5.1.0
 */
public class ModelDemoness extends ModelBase {
	public ModelRenderer bipedBody;
	public ModelRenderer tail01;
	public ModelRenderer lWing01;
	public ModelRenderer rWing01;
	public ModelRenderer boobs;
	public ModelRenderer bipedHead;
	public ModelRenderer bipedLeftArm;
	public ModelRenderer bipedRightArm;
	public ModelRenderer stomach;
	public ModelRenderer bipedLeftLeg;
	public ModelRenderer bipedRightLeg;
	public ModelRenderer tail02;
	public ModelRenderer tail03;
	public ModelRenderer tail04;
	public ModelRenderer tail05;
	public ModelRenderer tailTip01;
	public ModelRenderer tailTip02;
	public ModelRenderer lWing02;
	public ModelRenderer lWing03;
	public ModelRenderer lWingMembrane;
	public ModelRenderer lWing04;
	public ModelRenderer rWing02;
	public ModelRenderer rWing03;
	public ModelRenderer rWingMembrane;
	public ModelRenderer rWing04;
	public ModelRenderer lHorn01;
	public ModelRenderer rHorn01;
	public ModelRenderer hair01;
	public ModelRenderer hair02;
	public ModelRenderer lHorn02a;
	public ModelRenderer lHorn02b;
	public ModelRenderer lHorn02c;
	public ModelRenderer lHorn03d;
	public ModelRenderer lHorn03a;
	public ModelRenderer lHorn03b;
	public ModelRenderer lHorn03c;
	public ModelRenderer lHorn03d_1;
	public ModelRenderer lHorn04;
	public ModelRenderer lHorn05;
	public ModelRenderer rHorn02a;
	public ModelRenderer rHorn02b;
	public ModelRenderer rHorn02c;
	public ModelRenderer rHorn03d;
	public ModelRenderer rHorn03a;
	public ModelRenderer rHorn03b;
	public ModelRenderer rHorn03c;
	public ModelRenderer rHorn03d_1;
	public ModelRenderer rHorn04;
	public ModelRenderer rHorn05;
	public ModelRenderer loincloth;
	public ModelRenderer loincloth02;
	public ModelRenderer lLeg02;
	public ModelRenderer lLeg03;
	public ModelRenderer lHoof;
	public ModelRenderer rLeg02;
	public ModelRenderer rLeg03;
	public ModelRenderer rHoof;

	public ModelDemoness() {
		this.textureWidth = 64;
		this.textureHeight = 64;
		this.rLeg02 = new ModelRenderer(this, 0, 30);
		this.rLeg02.mirror = true;
		this.rLeg02.setRotationPoint(0.0F, 5.7F, -0.4F);
		this.rLeg02.addBox(-1.5F, 0.0F, -2.0F, 3, 6, 4, 0.0F);
		this.setRotateAngle(rLeg02, 0.6981317007977318F, 0.0F, -0.10471975511965977F);
		this.rWing04 = new ModelRenderer(this, 24, 55);
		this.rWing04.mirror = true;
		this.rWing04.setRotationPoint(0.0F, 7.7F, 0.0F);
		this.rWing04.addBox(-0.5F, 0.0F, -0.5F, 1, 8, 1, 0.0F);
		this.setRotateAngle(rWing04, -0.41887902047863906F, 0.0F, 0.0F);
		this.rHorn01 = new ModelRenderer(this, 0, 0);
		this.rHorn01.mirror = true;
		this.rHorn01.setRotationPoint(-2.9F, -7.4F, -0.5F);
		this.rHorn01.addBox(-1.0F, -2.0F, -1.0F, 2, 2, 2, 0.0F);
		this.setRotateAngle(rHorn01, -0.17453292519943295F, -0.13962634015954636F, -0.13962634015954636F);
		this.rLeg03 = new ModelRenderer(this, 0, 41);
		this.rLeg03.mirror = true;
		this.rLeg03.setRotationPoint(0.0F, 5.2F, 0.2F);
		this.rLeg03.addBox(-1.0F, 0.0F, -1.5F, 2, 7, 3, 0.0F);
		this.setRotateAngle(rLeg03, -0.41887902047863906F, 0.0F, 0.0F);
		this.tail04 = new ModelRenderer(this, 15, 45);
		this.tail04.setRotationPoint(0.0F, 0.0F, 4.9F);
		this.tail04.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F);
		this.setRotateAngle(tail04, 0.13962634015954636F, 0.0F, 0.0F);
		this.lHorn02a = new ModelRenderer(this, 0, 4);
		this.lHorn02a.setRotationPoint(0.0F, -1.7F, 0.0F);
		this.lHorn02a.addBox(-0.8F, -2.0F, -0.8F, 1, 2, 1, 0.0F);
		this.setRotateAngle(lHorn02a, -0.17453292519943295F, 0.0F, 0.05235987755982988F);
		this.rHorn04 = new ModelRenderer(this, 4, 4);
		this.rHorn04.mirror = true;
		this.rHorn04.setRotationPoint(0.0F, -1.7F, 0.0F);
		this.rHorn04.addBox(-0.5F, -3.0F, -0.5F, 1, 3, 1, 0.0F);
		this.setRotateAngle(rHorn04, 0.05235987755982988F, 0.0F, -0.13962634015954636F);
		this.tail01 = new ModelRenderer(this, 13, 38);
		this.tail01.setRotationPoint(0.0F, 11.4F, 1.3F);
		this.tail01.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 4, 0.0F);
		this.setRotateAngle(tail01, -0.8726646259971648F, 0.0F, 0.0F);
		this.tailTip02 = new ModelRenderer(this, 25, 51);
		this.tailTip02.setRotationPoint(0.0F, 0.1F, 0.8F);
		this.tailTip02.addBox(-1.5F, -0.5F, -0.5F, 2, 1, 2, 0.0F);
		this.setRotateAngle(tailTip02, 0.0F, 0.7853981633974483F, 0.0F);
		this.rHorn03c = new ModelRenderer(this, 0, 4);
		this.rHorn03c.mirror = true;
		this.rHorn03c.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.rHorn03c.addBox(-0.7F, -2.0F, -0.3F, 1, 2, 1, 0.0F);
		this.lHorn03c = new ModelRenderer(this, 0, 4);
		this.lHorn03c.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.lHorn03c.addBox(-0.7F, -2.0F, -0.3F, 1, 2, 1, 0.0F);
		this.rHorn03d_1 = new ModelRenderer(this, 0, 4);
		this.rHorn03d_1.mirror = true;
		this.rHorn03d_1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.rHorn03d_1.addBox(-0.3F, -2.0F, -0.3F, 1, 2, 1, 0.0F);
		this.bipedLeftLeg = new ModelRenderer(this, 0, 17);
		this.bipedLeftLeg.setRotationPoint(2.1F, 12.2F, 0.1F);
		this.bipedLeftLeg.addBox(-2.0F, -1.0F, -2.5F, 4, 8, 5, 0.0F);
		this.setRotateAngle(bipedLeftLeg, -0.2617993877991494F, 0.0F, -0.10471975511965977F);
		this.bipedRightLeg = new ModelRenderer(this, 0, 17);
		this.bipedRightLeg.mirror = true;
		this.bipedRightLeg.setRotationPoint(-2.1F, 12.2F, 0.1F);
		this.bipedRightLeg.addBox(-2.0F, -1.0F, -2.5F, 4, 8, 5, 0.0F);
		this.setRotateAngle(bipedRightLeg, -0.2617993877991494F, 0.0F, 0.10471975511965977F);
		this.lWing02 = new ModelRenderer(this, 38, 52);
		this.lWing02.setRotationPoint(0.1F, 0.2F, 4.3F);
		this.lWing02.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 8, 0.0F);
		this.setRotateAngle(lWing02, 0.5235987755982988F, 0.0F, 0.0F);
		this.lWing04 = new ModelRenderer(this, 24, 55);
		this.lWing04.setRotationPoint(0.0F, 7.7F, 0.0F);
		this.lWing04.addBox(-0.5F, 0.0F, -0.5F, 1, 8, 1, 0.0F);
		this.setRotateAngle(lWing04, -0.41887902047863906F, 0.0F, 0.0F);
		this.lHorn03b = new ModelRenderer(this, 0, 4);
		this.lHorn03b.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.lHorn03b.addBox(-0.3F, -2.0F, -0.7F, 1, 2, 1, 0.0F);
		this.lHorn05 = new ModelRenderer(this, 43, 0);
		this.lHorn05.setRotationPoint(0.0F, -2.7F, 0.0F);
		this.lHorn05.addBox(-0.5F, -2.1F, -0.5F, 1, 2, 1, 0.0F);
		this.setRotateAngle(lHorn05, 0.05235987755982988F, 0.0F, -0.13962634015954636F);
		this.lLeg02 = new ModelRenderer(this, 0, 30);
		this.lLeg02.setRotationPoint(0.0F, 5.7F, -0.4F);
		this.lLeg02.addBox(-1.5F, 0.0F, -2.0F, 3, 6, 4, 0.0F);
		this.setRotateAngle(lLeg02, 0.6981317007977318F, 0.0F, 0.10471975511965977F);
		this.lHorn03a = new ModelRenderer(this, 0, 4);
		this.lHorn03a.setRotationPoint(0.0F, -1.6F, 0.0F);
		this.lHorn03a.addBox(-0.7F, -2.0F, -0.7F, 1, 2, 1, 0.0F);
		this.setRotateAngle(lHorn03a, -0.10471975511965977F, 0.0F, 0.10471975511965977F);
		this.bipedBody = new ModelRenderer(this, 19, 17);
		this.bipedBody.setRotationPoint(0.0F, -6.0F, 0.0F);
		this.bipedBody.addBox(-4.0F, 0.0F, -2.0F, 8, 6, 4, 0.0F);
		this.rWing01 = new ModelRenderer(this, 26, 38);
		this.rWing01.mirror = true;
		this.rWing01.setRotationPoint(-2.5F, 3.2F, 1.4F);
		this.rWing01.addBox(-1.0F, -1.5F, 0.0F, 2, 3, 5, 0.0F);
		this.setRotateAngle(rWing01, 0.27314402793711257F, -0.5235987755982988F, 0.0F);
		this.tail05 = new ModelRenderer(this, 15, 45);
		this.tail05.setRotationPoint(0.0F, 0.0F, 4.9F);
		this.tail05.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F);
		this.setRotateAngle(tail05, 0.22689280275926282F, 0.0F, 0.0F);
		this.lHorn02c = new ModelRenderer(this, 0, 4);
		this.lHorn02c.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.lHorn02c.addBox(-0.8F, -2.0F, -0.2F, 1, 2, 1, 0.0F);
		this.stomach = new ModelRenderer(this, 19, 27);
		this.stomach.setRotationPoint(0.0F, 6.0F, 0.0F);
		this.stomach.addBox(-3.5F, 0.0F, -2.0F, 7, 7, 4, 0.0F);
		this.loincloth02 = new ModelRenderer(this, 48, 8);
		this.loincloth02.setRotationPoint(0.0F, 7.8F, 0.0F);
		this.loincloth02.addBox(-3.0F, 0.05F, -0.53F, 6, 6, 1, 0.0F);
		this.setRotateAngle(loincloth02, 0.22689280275926282F, 0.0F, 0.0F);
		this.rHoof = new ModelRenderer(this, 0, 51);
		this.rHoof.mirror = true;
		this.rHoof.setRotationPoint(0.0F, 6.8F, 0.0F);
		this.rHoof.addBox(-1.5F, 0.0F, -2.9F, 3, 1, 4, 0.0F);
		this.lLeg03 = new ModelRenderer(this, 0, 41);
		this.lLeg03.setRotationPoint(0.0F, 5.2F, 0.2F);
		this.lLeg03.addBox(-1.0F, 0.0F, -1.5F, 2, 7, 3, 0.0F);
		this.setRotateAngle(lLeg03, -0.41887902047863906F, 0.0F, 0.0F);
		this.rHorn02b = new ModelRenderer(this, 0, 4);
		this.rHorn02b.mirror = true;
		this.rHorn02b.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.rHorn02b.addBox(-0.2F, -2.0F, -0.8F, 1, 2, 1, 0.0F);
		this.loincloth = new ModelRenderer(this, 48, 0);
		this.loincloth.setRotationPoint(0.0F, 4.6F, -1.9F);
		this.loincloth.addBox(-3.0F, 0.0F, -0.5F, 6, 8, 1, 0.0F);
		this.setRotateAngle(loincloth, -0.22689280275926282F, 0.0F, 0.0F);
		this.bipedRightArm = new ModelRenderer(this, 44, 16);
		this.bipedRightArm.mirror = true;
		this.bipedRightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		this.bipedRightArm.addBox(-2.0F, -2.0F, -2.0F, 3, 14, 4, 0.0F);
		this.setRotateAngle(bipedRightArm, 0.0F, 0.0F, 0.10000736613927509F);
		this.rHorn02c = new ModelRenderer(this, 0, 4);
		this.rHorn02c.mirror = true;
		this.rHorn02c.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.rHorn02c.addBox(-0.8F, -2.0F, -0.2F, 1, 2, 1, 0.0F);
		this.lWing03 = new ModelRenderer(this, 29, 54);
		this.lWing03.setRotationPoint(0.1F, -0.5F, 7.1F);
		this.lWing03.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
		this.setRotateAngle(lWing03, 0.20943951023931953F, 0.0F, 0.0F);
		this.rWingMembrane = new ModelRenderer(this, 41, 26);
		this.rWingMembrane.mirror = true;
		this.rWingMembrane.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.rWingMembrane.addBox(0.0F, 0.4F, -2.2F, 0, 14, 11, 0.0F);
		this.setRotateAngle(rWingMembrane, -0.091106186954104F, 0.0F, 0.0F);
		this.rHorn02a = new ModelRenderer(this, 0, 4);
		this.rHorn02a.mirror = true;
		this.rHorn02a.setRotationPoint(0.0F, -1.7F, 0.0F);
		this.rHorn02a.addBox(-0.8F, -2.0F, -0.8F, 1, 2, 1, 0.0F);
		this.setRotateAngle(rHorn02a, -0.17453292519943295F, 0.0F, -0.05235987755982988F);
		this.lHorn04 = new ModelRenderer(this, 4, 4);
		this.lHorn04.setRotationPoint(0.0F, -1.7F, 0.0F);
		this.lHorn04.addBox(-0.5F, -3.0F, -0.5F, 1, 3, 1, 0.0F);
		this.setRotateAngle(lHorn04, 0.05235987755982988F, 0.0F, 0.13962634015954636F);
		this.rWing03 = new ModelRenderer(this, 29, 54);
		this.rWing03.mirror = true;
		this.rWing03.setRotationPoint(-0.1F, -0.5F, 7.1F);
		this.rWing03.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
		this.setRotateAngle(rWing03, 0.20943951023931953F, 0.0F, 0.0F);
		this.hair02 = new ModelRenderer(this, 25, 0);
		this.hair02.mirror = true;
		this.hair02.setRotationPoint(0.0F, -6.9F, 3.2F);
		this.hair02.addBox(-4.0F, 0.0F, -0.1F, 8, 8, 1, 0.0F);
		this.setRotateAngle(hair02, 0.3490658503988659F, 0.0F, 0.0F);
		this.lHorn03d_1 = new ModelRenderer(this, 0, 4);
		this.lHorn03d_1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.lHorn03d_1.addBox(-0.3F, -2.0F, -0.3F, 1, 2, 1, 0.0F);
		this.tail02 = new ModelRenderer(this, 13, 38);
		this.tail02.setRotationPoint(0.0F, 0.0F, 3.8F);
		this.tail02.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 4, 0.0F);
		this.setRotateAngle(tail02, -0.13962634015954636F, 0.0F, 0.0F);
		this.lHorn01 = new ModelRenderer(this, 0, 0);
		this.lHorn01.setRotationPoint(2.9F, -7.4F, -0.5F);
		this.lHorn01.addBox(-1.0F, -2.0F, -1.0F, 2, 2, 2, 0.0F);
		this.setRotateAngle(lHorn01, -0.17453292519943295F, 0.13962634015954636F, 0.13962634015954636F);
		this.lWing01 = new ModelRenderer(this, 26, 38);
		this.lWing01.setRotationPoint(2.5F, 3.2F, 1.4F);
		this.lWing01.addBox(-1.0F, -1.5F, 0.0F, 2, 3, 5, 0.0F);
		this.setRotateAngle(lWing01, 0.27314402793711257F, 0.5235987755982988F, 0.0F);
		this.lHorn03d = new ModelRenderer(this, 0, 4);
		this.lHorn03d.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.lHorn03d.addBox(-0.2F, -2.0F, -0.2F, 1, 2, 1, 0.0F);
		this.bipedLeftArm = new ModelRenderer(this, 44, 16);
		this.bipedLeftArm.setRotationPoint(5.0F, 2.0F, -0.0F);
		this.bipedLeftArm.addBox(-1.0F, -2.0F, -2.0F, 3, 14, 4, 0.0F);
		this.setRotateAngle(bipedLeftArm, 0.0F, 0.0F, -0.10000736613927509F);
		this.rHorn03b = new ModelRenderer(this, 0, 4);
		this.rHorn03b.mirror = true;
		this.rHorn03b.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.rHorn03b.addBox(-0.3F, -2.0F, -0.7F, 1, 2, 1, 0.0F);
		this.tailTip01 = new ModelRenderer(this, 16, 52);
		this.tailTip01.setRotationPoint(0.0F, 0.0F, 4.5F);
		this.tailTip01.addBox(-1.0F, -0.5F, 0.0F, 2, 1, 2, 0.0F);
		this.setRotateAngle(tailTip01, 0.2617993877991494F, 0.0F, 0.0F);
		this.tail03 = new ModelRenderer(this, 15, 45);
		this.tail03.setRotationPoint(0.0F, 0.0F, 2.9F);
		this.tail03.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F);
		this.setRotateAngle(tail03, 0.06981317007977318F, 0.0F, 0.0F);
		this.rHorn05 = new ModelRenderer(this, 43, 0);
		this.rHorn05.mirror = true;
		this.rHorn05.setRotationPoint(0.0F, -2.7F, 0.0F);
		this.rHorn05.addBox(-0.5F, -2.1F, -0.5F, 1, 2, 1, 0.0F);
		this.setRotateAngle(rHorn05, 0.05235987755982988F, 0.0F, 0.13962634015954636F);
		this.boobs = new ModelRenderer(this, 0, 57);
		this.boobs.setRotationPoint(0.0F, 1.3F, -0.3F);
		this.boobs.addBox(-3.5F, 0.0F, -2.0F, 7, 4, 3, 0.0F);
		this.setRotateAngle(boobs, -0.4886921905584123F, 0.0F, 0.0F);
		this.bipedHead = new ModelRenderer(this, 0, 1);
		this.bipedHead.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.bipedHead.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F);
		this.hair01 = new ModelRenderer(this, 25, 0);
		this.hair01.setRotationPoint(0.0F, -4.4F, 3.2F);
		this.hair01.addBox(-4.0F, 0.0F, -0.1F, 8, 8, 1, 0.0F);
		this.setRotateAngle(hair01, 0.20943951023931953F, 0.0F, 0.0F);
		this.rWing02 = new ModelRenderer(this, 38, 52);
		this.rWing02.mirror = true;
		this.rWing02.setRotationPoint(-0.1F, 0.2F, 4.3F);
		this.rWing02.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 8, 0.0F);
		this.setRotateAngle(rWing02, 0.5235987755982988F, 0.0F, 0.0F);
		this.lHoof = new ModelRenderer(this, 0, 51);
		this.lHoof.setRotationPoint(0.0F, 6.8F, 0.0F);
		this.lHoof.addBox(-1.5F, 0.0F, -2.9F, 3, 1, 4, 0.0F);
		this.rHorn03d = new ModelRenderer(this, 0, 4);
		this.rHorn03d.mirror = true;
		this.rHorn03d.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.rHorn03d.addBox(-0.2F, -2.0F, -0.2F, 1, 2, 1, 0.0F);
		this.lHorn02b = new ModelRenderer(this, 0, 4);
		this.lHorn02b.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.lHorn02b.addBox(-0.2F, -2.0F, -0.8F, 1, 2, 1, 0.0F);
		this.rHorn03a = new ModelRenderer(this, 0, 4);
		this.rHorn03a.mirror = true;
		this.rHorn03a.setRotationPoint(0.0F, -1.6F, 0.0F);
		this.rHorn03a.addBox(-0.7F, -2.0F, -0.7F, 1, 2, 1, 0.0F);
		this.setRotateAngle(rHorn03a, -0.10471975511965977F, 0.0F, -0.10471975511965977F);
		this.lWingMembrane = new ModelRenderer(this, 41, 26);
		this.lWingMembrane.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.lWingMembrane.addBox(0.0F, 0.4F, -2.2F, 0, 14, 11, 0.0F);
		this.setRotateAngle(lWingMembrane, -0.091106186954104F, 0.0F, 0.0F);
		this.bipedRightLeg.addChild(this.rLeg02);
		this.rWing03.addChild(this.rWing04);
		this.bipedHead.addChild(this.rHorn01);
		this.rLeg02.addChild(this.rLeg03);
		this.tail03.addChild(this.tail04);
		this.lHorn01.addChild(this.lHorn02a);
		this.rHorn03a.addChild(this.rHorn04);
		this.bipedBody.addChild(this.tail01);
		this.tailTip01.addChild(this.tailTip02);
		this.rHorn03a.addChild(this.rHorn03c);
		this.lHorn03a.addChild(this.lHorn03c);
		this.rHorn03a.addChild(this.rHorn03d_1);
		this.bipedBody.addChild(this.bipedLeftLeg);
		this.bipedBody.addChild(this.bipedRightLeg);
		this.lWing01.addChild(this.lWing02);
		this.lWing03.addChild(this.lWing04);
		this.lHorn03a.addChild(this.lHorn03b);
		this.lHorn04.addChild(this.lHorn05);
		this.bipedLeftLeg.addChild(this.lLeg02);
		this.lHorn02a.addChild(this.lHorn03a);
		this.bipedBody.addChild(this.rWing01);
		this.tail04.addChild(this.tail05);
		this.lHorn02a.addChild(this.lHorn02c);
		this.bipedBody.addChild(this.stomach);
		this.loincloth.addChild(this.loincloth02);
		this.rLeg03.addChild(this.rHoof);
		this.lLeg02.addChild(this.lLeg03);
		this.rHorn02a.addChild(this.rHorn02b);
		this.stomach.addChild(this.loincloth);
		this.bipedBody.addChild(this.bipedRightArm);
		this.rHorn02a.addChild(this.rHorn02c);
		this.lWing02.addChild(this.lWing03);
		this.rWing02.addChild(this.rWingMembrane);
		this.rHorn01.addChild(this.rHorn02a);
		this.lHorn03a.addChild(this.lHorn04);
		this.rWing02.addChild(this.rWing03);
		this.bipedHead.addChild(this.hair02);
		this.lHorn03a.addChild(this.lHorn03d_1);
		this.tail01.addChild(this.tail02);
		this.bipedHead.addChild(this.lHorn01);
		this.bipedBody.addChild(this.lWing01);
		this.lHorn02a.addChild(this.lHorn03d);
		this.bipedBody.addChild(this.bipedLeftArm);
		this.rHorn03a.addChild(this.rHorn03b);
		this.tail05.addChild(this.tailTip01);
		this.tail02.addChild(this.tail03);
		this.rHorn04.addChild(this.rHorn05);
		this.bipedBody.addChild(this.boobs);
		this.bipedBody.addChild(this.bipedHead);
		this.bipedHead.addChild(this.hair01);
		this.rWing01.addChild(this.rWing02);
		this.lLeg03.addChild(this.lHoof);
		this.rHorn02a.addChild(this.rHorn03d);
		this.lHorn02a.addChild(this.lHorn02b);
		this.rHorn02a.addChild(this.rHorn03a);
		this.lWing02.addChild(this.lWingMembrane);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		this.bipedBody.render(f5);
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
