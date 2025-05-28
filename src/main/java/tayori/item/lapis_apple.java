package tayori.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;

public class lapis_apple extends Item{
    public static final FoodComponent LAPIS_APPLE_FOOD = (new FoodComponent.Builder())
            .hunger(6)
            .saturationModifier(0.8f)
            .alwaysEdible()
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 100, 1), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 1200, 2), 1.0F)
            .build();


    public lapis_apple(Settings settings) {
        super(settings.food(LAPIS_APPLE_FOOD));
    }
}
