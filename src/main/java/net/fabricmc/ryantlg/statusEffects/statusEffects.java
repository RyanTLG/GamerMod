package net.fabricmc.ryantlg.statusEffects;

import net.fabricmc.ryantlg.gamermod;
import net.fabricmc.ryantlg.statusEffects.effectClasses.highStatusEffect;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class statusEffects {

    public static final StatusEffect HIGH = new highStatusEffect();

    public static void register() {
        Registry.register(Registry.STATUS_EFFECT, new Identifier("gamermod", "high"), HIGH);

        gamermod.LOGGER.info("statusEffects Loaded");
    }
    
}
