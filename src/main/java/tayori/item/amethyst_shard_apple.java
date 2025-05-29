package tayori.item;

import net.minecraft.item.Item;
import net.minecraft.item.FoodComponent;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.effect.StatusEffectInstance;
public class amethyst_shard_apple extends Item {
    public static final FoodComponent AMETHYST_SHARD_APPLE_FOOD = (new FoodComponent.Builder())
            .hunger(6)
            .saturationModifier(1.2f)
            .alwaysEdible()
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 160, 2), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 2400, 1), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 1200, 1), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 1200, 1), 1.0F)
            .build();
    public amethyst_shard_apple(Settings settings) {
        super(settings);
    }
}
