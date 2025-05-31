package tayori.item.custom;

import com.google.common.collect.ImmutableList; // 或者 java.util.List 和 java.util.ArrayList
import com.google.common.collect.ImmutableMap;
import net.minecraft.entity.Entity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import tayori.item.ModArmor;

import java.util.List; // 引入 List
import java.util.Map;

public class ModArmoritem extends ArmorItem {
    // 将 Map 的值类型改为 List<StatusEffectInstance>
    private static final Map<ArmorMaterial, List<StatusEffectInstance>> MATERIAL_TO_EFFECTS_MAP =
            (new ImmutableMap.Builder<ArmorMaterial, List<StatusEffectInstance>>())
                    .put(ModArmor.DIAMOND_APPLE_MATERIAL, ImmutableList.of( // 使用 ImmutableList.of() 或 new ArrayList<>()
                            new StatusEffectInstance(StatusEffects.SPEED, 200, 2, false, false, true),
                            new StatusEffectInstance(StatusEffects.STRENGTH, 200, 2, false, false, true),
                            new StatusEffectInstance(StatusEffects.RESISTANCE, 200, 1, false, false, true),
                            new StatusEffectInstance(StatusEffects.REGENERATION, 200, 1, false, false, true)
                    ))
                    // 如果有其他材质和对应的效果列表，可以继续 .put()
                    .build();

    public ModArmoritem(ArmorMaterial material, Type type, Settings settings) {
        super(material, type, settings);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if (!world.isClient()) {
            if (entity instanceof PlayerEntity player && hasFullSuitOfArmor(player)) {
                // 检查玩家穿戴的盔甲是否是当前物品的材质
                ArmorItem armorItem = (ArmorItem) stack.getItem();
                ArmorMaterial currentMaterial = armorItem.getMaterial(); // 获取当前盔甲的材质
                evaluateStatusEffects(player, currentMaterial);
            }
        }
        super.inventoryTick(stack, world, entity, slot, selected);
    }

    private void evaluateStatusEffects(PlayerEntity player, ArmorMaterial currentArmorMaterial) {
        // 从新的 Map 中获取效果列表
        List<StatusEffectInstance> effectsToApply = MATERIAL_TO_EFFECTS_MAP.get(currentArmorMaterial);

        if (effectsToApply != null && hasCorrectArmorOn(currentArmorMaterial, player)) { // 确保玩家穿戴的是目标材质的整套盔甲
            for (StatusEffectInstance effectInstance : effectsToApply) {
                addStatusEffectForMaterial(player, effectInstance);
            }
        }
    }

    // 修改 addStatusEffectForMaterial 方法以接受单个效果
    private void addStatusEffectForMaterial(PlayerEntity player, StatusEffectInstance statusEffectInstance) {
        // 只有当玩家没有这个效果时才添加，避免效果叠加或覆盖问题 (除非特定设计)
        if (!player.hasStatusEffect(statusEffectInstance.getEffectType())) {
            player.addStatusEffect(new StatusEffectInstance(statusEffectInstance));
        }
        // 如果希望效果可以叠加或刷新，可以移除 !player.hasStatusEffect() 的判断，
        // 或者使用 player.addStatusEffect(new StatusEffectInstance(statusEffectInstance.getEffectType(), statusEffectInstance.getDuration(), statusEffectInstance.getAmplifier(), statusEffectInstance.isAmbient(), statusEffectInstance.shouldShowParticles(), statusEffectInstance.shouldShowIcon()));
        // 并确保效果的叠加逻辑符合预期。
    }


    // hasCorrectArmorOn 方法需要确保玩家穿戴的是 *特定材质* 的全套盔甲
    private boolean hasCorrectArmorOn(ArmorMaterial expectedMaterial, PlayerEntity player) {
        ItemStack boots = player.getInventory().getArmorStack(0);
        ItemStack leggings = player.getInventory().getArmorStack(1);
        ItemStack chestplate = player.getInventory().getArmorStack(2);
        ItemStack helmet = player.getInventory().getArmorStack(3);

        if (helmet.isEmpty() || leggings.isEmpty() || chestplate.isEmpty() || boots.isEmpty()) {
            return false; // 没有穿齐
        }

        // 检查每一件盔甲是否都是 ArmorItem 并且是期望的材质
        return helmet.getItem() instanceof ArmorItem && ((ArmorItem) helmet.getItem()).getMaterial() == expectedMaterial &&
                leggings.getItem() instanceof ArmorItem && ((ArmorItem) leggings.getItem()).getMaterial() == expectedMaterial &&
                chestplate.getItem() instanceof ArmorItem && ((ArmorItem) chestplate.getItem()).getMaterial() == expectedMaterial &&
                boots.getItem() instanceof ArmorItem && ((ArmorItem) boots.getItem()).getMaterial() == expectedMaterial;
    }

    // hasFullSuitOfArmor 只是检查是否穿了四件，不检查材质，可以保留或根据需要调整
    private boolean hasFullSuitOfArmor(PlayerEntity player) {
        ItemStack boots = player.getInventory().getArmorStack(0);
        ItemStack leggings = player.getInventory().getArmorStack(1);
        ItemStack chestplate = player.getInventory().getArmorStack(2);
        ItemStack helmet = player.getInventory().getArmorStack(3);

        return !helmet.isEmpty() && !leggings.isEmpty() && !chestplate.isEmpty() && !boots.isEmpty();
    }
}