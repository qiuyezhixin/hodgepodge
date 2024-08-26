package name.hodgepodge.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class ModFoodComponents {
    public static final FoodComponent ECHO_APPLE = new FoodComponent.Builder().nutrition(8).saturationModifier(1.2f)
            .statusEffect(new StatusEffectInstance(StatusEffects.DARKNESS, 600, 1),0.2f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 600, 2),1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 600, 3),1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 500, 2),1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 600, 3),1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 5000, 4),1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 400, 4),1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 5000, 4),1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 3000, 4),1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 600, 2),0.3f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 500, 3),1f).build();
    public static final FoodComponent ECHO_CARROT = new FoodComponent.Builder().nutrition(40).saturationModifier(4f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 400, 255),1f).build();
    public static final FoodComponent CHILI = new FoodComponent.Builder().nutrition(2).saturationModifier(1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.POISON, 100, 1), 0.1f).build();
    public static final FoodComponent PITAYA = new FoodComponent.Builder().nutrition(3).saturationModifier(1.1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.WEAKNESS, 150, 1), 0.1f).build();
}
