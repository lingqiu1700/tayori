package tayori.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class enchanted_lapis_apple extends Item{
    public static final FoodComponent ENCHANTED_LAPIS_APPLE_FOOD = (new FoodComponent.Builder())
            .hunger(16)
            .saturationModifier(1.0f)
            .alwaysEdible()
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 100, 2), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 2400, 2), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 2400, 2), 1.0F)
            .build();

    public enchanted_lapis_apple(Settings settings) {
        super(settings);
    }
    @Override
    public boolean hasGlint(ItemStack stack) {
        return true; // This will make the item always have a glint
    }
}
