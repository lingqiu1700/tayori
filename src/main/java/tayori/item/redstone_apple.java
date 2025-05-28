package tayori.item;

import net.minecraft.item.Item;
import net.minecraft.item.FoodComponent;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.effect.StatusEffectInstance;
public class redstone_apple extends Item {
    public static final FoodComponent REDSTONE_APPLE_FOOD = (new FoodComponent.Builder())
            .hunger(4)
            .saturationModifier(1.2f)
            .alwaysEdible()
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 150, 1), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 1200, 0), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 800, 1), 1.0F)
            .build();
    public redstone_apple(Settings settings) {
        super(settings);
    }
}
