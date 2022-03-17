package net.arcmods.ryantlg;

import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class sounds {
    
    public static final Identifier SNIFF = new Identifier("gamermod:sniff");
    public static SoundEvent SNIFF_SOUND_EVENT = new SoundEvent(SNIFF);
    public static final Identifier MATT = new Identifier("gamermod:matt");
    public static SoundEvent MATT_SOUND_EVENT = new SoundEvent(MATT);
    public static final Identifier ELON = new Identifier("gamermod:elon");
    public static SoundEvent ELON_SOUND_EVENT = new SoundEvent(ELON);

    public static void register() {
        gamermod.LOGGER.info("Sounds Loaded");

        Registry.register(Registry.SOUND_EVENT, sounds.SNIFF, SNIFF_SOUND_EVENT); 
        Registry.register(Registry.SOUND_EVENT, sounds.MATT, MATT_SOUND_EVENT); 
        Registry.register(Registry.SOUND_EVENT, sounds.ELON, ELON_SOUND_EVENT); 
    }

}
