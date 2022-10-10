package net.arcmods.ryantlg.statusEffects;

import net.arcmods.ryantlg.gameritems;
import net.arcmods.ryantlg.statusEffects.effectClasses.highStatusEffect;
import net.arcmods.ryantlg.statusEffects.effectClasses.stupidStatusEffect;
//import net.arcmods.ryantlg.statusEffects.effectClasses.jeremydStatusEffect;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class GamerEffects {

    public static final StatusEffect HIGH = new highStatusEffect();
    public static final StatusEffect STUPID = new stupidStatusEffect();

    //public static final StatusEffect JEREMYD = new jeremydStatusEffect();

    public static void register() {
        Registry.register(Registry.STATUS_EFFECT, new Identifier("gameritems", "high"), HIGH);
        Registry.register(Registry.STATUS_EFFECT, new Identifier("gameritems", "stupid"), STUPID);

        //Registry.register(Registry.STATUS_EFFECT, new Identifier("gameritems", "jeremyd"), JEREMYD);

        gameritems.LOGGER.info("statusEffects Loaded");
    }
    
}
