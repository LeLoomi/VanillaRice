package net.leloomi.vanillarice.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents
{
    public static final FoodComponent RICE_BOWL = (new FoodComponent.Builder()).hunger(3).saturationModifier(0.6F)
            .build();
    public static final FoodComponent MAKI_SUSHI = (new FoodComponent.Builder()).hunger(5).saturationModifier(0.6F)
            .build();
    public static final FoodComponent FRIED_RICE = (new FoodComponent.Builder()).hunger(5).saturationModifier(0.6F)
            .build();
    public static final FoodComponent MOCHI = (new FoodComponent.Builder()).hunger(2).saturationModifier(0.3F)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 60), 1f)
            .build();
}
