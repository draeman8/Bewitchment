package com.bewitchment.common.item.tool;

import com.bewitchment.api.BewitchmentAPI;
import com.bewitchment.client.core.IModelRegister;
import com.bewitchment.client.handler.ModelHandler;
import com.bewitchment.common.core.helper.MobHelper;
import com.bewitchment.common.core.statics.ModCreativeTabs;
import com.bewitchment.common.integration.thaumcraft.ThaumcraftCompatBridge;
import com.bewitchment.common.item.ModMaterials;
import com.bewitchment.common.lib.LibItemName;
import com.bewitchment.common.lib.LibMod;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.entity.monster.*;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.List;

/**
 * Created by Joseph on 6/14/2018.
 */
public class ItemColdIronPickaxe extends ItemPickaxe implements IModelRegister {

	public ItemColdIronPickaxe() {
		super(ModMaterials.TOOL_COLD_IRON);
		setRegistryName(LibItemName.COLD_IRON_PICKAXE);
		setTranslationKey(LibMod.MOD_ID + "." + LibItemName.COLD_IRON_PICKAXE);
		setCreativeTab(ModCreativeTabs.ITEMS_CREATIVE_TAB);
	}

	@Override
	public boolean hitEntity(ItemStack stack, EntityLivingBase target, @Nonnull EntityLivingBase attacker) {
		if (!target.world.isRemote) {
			if ((target.getCreatureAttribute() == BewitchmentAPI.getAPI().DEMON || target.getCreatureAttribute() == BewitchmentAPI.getAPI().SPIRIT || target instanceof EntityEnderman || target instanceof EntityBlaze || target instanceof EntityVex || target instanceof EntityEndermite || target instanceof EntityGhast || target instanceof EntityWither || target instanceof EntityGuardian || MobHelper.isSpirit(target) || MobHelper.isDemon(target) || ThaumcraftCompatBridge.isTCSpiritMob(target)) && attacker instanceof EntityPlayer) {
				target.attackEntityFrom(DamageSource.causePlayerDamage((EntityPlayer) attacker), 12);
				stack.damageItem(5, attacker);
			} else {
				stack.damageItem(1, attacker);
			}
		}

		return true;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, @Nullable World player, List<String> tooltip, ITooltipFlag advanced) {
		tooltip.add(TextFormatting.GRAY + I18n.format("tooltip.bewitchment." + getToolMaterialName() + "_tool" + "_description.name"));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModel() {
		ModelHandler.registerModel(this, 0);
	}
}