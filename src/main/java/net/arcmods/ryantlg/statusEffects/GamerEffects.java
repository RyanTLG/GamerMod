package net.arcmods.ryantlg.statusEffects;

import net.arcmods.ryantlg.gamermod;
import net.arcmods.ryantlg.statusEffects.effectClasses.highStatusEffect;
import net.arcmods.ryantlg.statusEffects.effectClasses.jeremydStatusEffect;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class GamerEffects {

    public static final StatusEffect HIGH = new highStatusEffect();

    public static final StatusEffect JEREMYD = new jeremydStatusEffect();

    public static void register() {
        Registry.register(Registry.STATUS_EFFECT, new Identifier("gamermod", "high"), HIGH);

        Registry.register(Registry.STATUS_EFFECT, new Identifier("gamermod", "jeremyd"), JEREMYD);

        gamermod.LOGGER.info("statusEffects Loaded");
    }
    
}
