package tayori.item;

import net.minecraft.item.Item;
import net.minecraft.item.FoodComponent;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.effect.StatusEffectInstance;
public class diamond_apple extends Item {
    public static final FoodComponent DIAMOND_APPLE_FOOD = (new FoodComponent.Builder())
            .hunger(10)
            .saturationModifier(1.2f)
            .alwaysEdible()
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 200, 2), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 2400, 1), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 1200, 1), 1.0F)
            .build();
    public diamond_apple(Settings settings) {
        super(settings);
    }
}
