package net.arcmods.ryantlg.statusEffects;

import net.arcmods.ryantlg.gamermod;
import net.arcmods.ryantlg.statusEffects.effectClasses.highStatusEffect;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class GamerEffects {

    public static final StatusEffect HIGH = new highStatusEffect();

    public static void register() {
        Registry.register(Registry.STATUS_EFFECT, new Identifier("gamermod", "high"), HIGH);

        gamermod.LOGGER.info("statusEffects Loaded");
    }
    
}
