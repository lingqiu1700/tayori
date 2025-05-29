package tayori.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class enchanted_amethyst_shard_apple extends Item{
    public static final FoodComponent ENCHANTED_AMETHYST_SHARD_APPLE_FOOD = (new FoodComponent.Builder())
            .hunger(8)
            .saturationModifier(1.0f)
            .alwaysEdible()
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 200, 2), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 4800, 2), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 9600, 2), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 4800, 2), 1.0F)
            .build();

    public enchanted_amethyst_shard_apple(Settings settings) {
        super(settings);
    }
    @Override
    public boolean hasGlint(ItemStack stack) {
        return true; // This will make the item always have a glint
    }
}
