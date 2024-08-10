package net.leloomi.vanillarice.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;


public class ModFoodComponents
{
    public static final FoodComponent RICE_BOWL = new FoodComponent.Builder().
            nutrition(3)
            .saturationModifier(0.6F)
            .usingConvertsTo(Registries.ITEM.get(Identifier.of("bowl")))
            .build();

    public static final FoodComponent MAKI_SUSHI = new FoodComponent.Builder()
            .nutrition(5)
            .saturationModifier(0.6F)
            .build();

    public static final FoodComponent FRIED_RICE = new FoodComponent.Builder()
            .nutrition(5)
            .saturationModifier(0.6F)
            .usingConvertsTo(Registries.ITEM.get(Identifier.of("bowl")))
            .build();

    public static final FoodComponent MOCHI = new FoodComponent.Builder()
            .nutrition(2).saturationModifier(0.3F)
            .statusEffect(
                    new StatusEffectInstance(StatusEffects.REGENERATION, 60),
                    1f)
            .alwaysEdible()
            .build();
}
