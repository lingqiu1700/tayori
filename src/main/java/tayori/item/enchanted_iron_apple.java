package tayori.item;

import net.minecraft.item.Item;
import net.minecraft.item.FoodComponent;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.ItemStack;

public class enchanted_iron_apple extends Item {
    public static final FoodComponent ENCHANTED_IRON_APPLE_FOOD = (new FoodComponent.Builder())
            .hunger(10)
            .saturationModifier(1.2f)
            .alwaysEdible()
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 120, 2), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 640, 2), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 800, 2), 1.0F)
            .build();
    public enchanted_iron_apple(Settings settings) {
        super(settings);
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return true; // This will make the item always have a glint
    }
}
