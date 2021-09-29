
package net.mcreator.moshispvpaddons.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

import net.mcreator.moshispvpaddons.block.LeiWoodPlanksBlock;
import net.mcreator.moshispvpaddons.MoshisPvpAddonsModElements;

@MoshisPvpAddonsModElements.ModElement.Tag
public class LeiPickAxeItem extends MoshisPvpAddonsModElements.ModElement {
	@ObjectHolder("moshis_pvp_addons:lei_pick_axe")
	public static final Item block = null;
	public LeiPickAxeItem(MoshisPvpAddonsModElements instance) {
		super(instance, 27);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 250;
			}

			public float getEfficiency() {
				return 6f;
			}

			public float getAttackDamage() {
				return 0f;
			}

			public int getHarvestLevel() {
				return 2;
			}

			public int getEnchantability() {
				return 14;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(LeiWoodPlanksBlock.block));
			}
		}, 1, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("lei_pick_axe"));
	}
}
