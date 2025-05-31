package tayori.item; // 确保包名正确

import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.entity.EquipmentSlot; // 需要导入 EquipmentSlot

// 假设 DiamondApple 类和 DIAMOND_APPLE 物品在其他地方正确定义
// import tayori.item.DiamondApple;

public enum ModArmor implements ArmorMaterial {

    DIAMOND_APPLE_MATERIAL("diamond_apple",
            80,
            // 保护值数组，顺序: [BOOTS, LEGGINGS, CHESTPLATE, HELMET]
            // 如果你传入的 {6, 10, 8, 6} 是按 头, 胸, 腿, 脚 (H,C,L,B) 的顺序，
            // 那么对应到 [B, L, C, H] 应该是 {6, 8, 10, 6}
            new int[]{6, 8, 10, 6}, // 靴子(6), 护腿(8), 胸甲(10), 头盔(6) -- 请根据你的意图调整此数组
            25,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
            6.0f,
            0.1f,
            Ingredient.ofItems(DiamondApple.DIAMOND_APPLE) // 确保 DiamondApple.DIAMOND_APPLE 是正确的物品引用
    );

    private final String name;
    private final int durabilityMultiplier;
    private final int[] protectionAmounts; // 索引顺序: BOOTS, LEGGINGS, CHESTPLATE, HELMET
    private final int enchantability;
    private final SoundEvent equipSound;
    private final Ingredient repairIngredient;
    private final float toughness;
    private final float knockbackResistance;

    // 基础耐久值因子，顺序: BOOTS, LEGGINGS, CHESTPLATE, HELMET
    private static final int[] BASE_DURABILITY = {11, 16, 15, 13};

    ModArmor(String name, int durabilityMultiplier, int[] protectionAmounts, int enchantability,
             SoundEvent equipSound, float toughness, float knockbackResistance, Ingredient repairIngredient) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmounts = protectionAmounts;
        this.enchantability = enchantability;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurability(ArmorItem.Type type) {
        // 使用 getEquipmentSlot() 替换 getSlot()
        return BASE_DURABILITY[type.getEquipmentSlot().getEntitySlotId()] * this.durabilityMultiplier;
    }

    @Override
    public int getProtection(ArmorItem.Type type) {
        // 使用 getEquipmentSlot() 替换 getSlot()
        return this.protectionAmounts[type.getEquipmentSlot().getEntitySlotId()];
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}