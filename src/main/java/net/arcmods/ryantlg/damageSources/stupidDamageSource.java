package net.arcmods.ryantlg.damageSources;

import net.minecraft.entity.damage.DamageSource;

public class stupidDamageSource extends DamageSource {

    protected stupidDamageSource() {
        super("dumb");
    }

    public static final DamageSource STUPID = (new stupidDamageSource().setBypassesArmor());
    
}

