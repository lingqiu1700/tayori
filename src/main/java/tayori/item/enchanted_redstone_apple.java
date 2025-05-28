package tayori.item;

import net.minecraft.item.Item;
import net.minecraft.item.FoodComponent;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.ItemStack;

public class enchanted_redstone_apple extends Item {
    public static final FoodComponent ENCHANTED_REDSTONE_APPLE = (new FoodComponent.Builder())
            .hunger(6)
            .saturationModifier(1.2f)
            .alwaysEdible()
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 300, 2), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 1800, 1), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 1200, 2), 1.0F)
            .build();
    public enchanted_redstone_apple(Settings settings) {
        super(settings);
    }
    @Override
    public boolean hasGlint(ItemStack stack) {
        return true; // This will make the item always have a glint
    }
}
