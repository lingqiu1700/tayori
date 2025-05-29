package tayori.item;

import net.minecraft.item.Item;
import net.minecraft.item.FoodComponent;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.effect.StatusEffectInstance;
public class iron_apple extends Item {
    public static final FoodComponent IRON_APPLE_FOOD = (new FoodComponent.Builder())
            .hunger(8)
            .saturationModifier(1.2f)
            .alwaysEdible()
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 80, 0), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 480, 0), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 480, 1), 1.0F)
            .build();
    public iron_apple(Settings settings) {
        super(settings);
    }
}
