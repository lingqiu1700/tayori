package tayori.item;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;

public class shi extends Item {
    public static final FoodComponent SHI_FOOD = (new FoodComponent.Builder())
            .hunger(1)
            .saturationModifier(1.0f)
            .alwaysEdible()
            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA,200,1), 1.0F)
            .build();
    public shi(Settings settings) {
        super(settings);
    }
}
