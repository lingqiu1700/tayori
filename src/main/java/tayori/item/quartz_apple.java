package tayori.item;

import net.minecraft.item.Item;
import net.minecraft.item.FoodComponent;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.effect.StatusEffectInstance;
public class quartz_apple extends Item {
    public static final FoodComponent QUARTZ_APPLE_FOOD = (new FoodComponent.Builder())
            .hunger(10)
            .saturationModifier(1.2f)
            .alwaysEdible()
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 120, 2), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 1200, 1), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 600, 1), 1.0F)
            .build();
    public quartz_apple(Settings settings) {
        super(settings);
    }
}
