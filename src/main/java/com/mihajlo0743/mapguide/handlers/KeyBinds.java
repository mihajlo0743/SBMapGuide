package com.mihajlo0743.mapguide.handlers;

import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.fml.client.registry.ClientRegistry;

public class KeyBinds {
     public static KeyBinding[] ModKeyBindings;

    public static void register() {
        ModKeyBindings = new KeyBinding[1];

        //Assign all key binds to this array
        ModKeyBindings[0] = new KeyBinding("key.mapguide.map", 77, "key.mapguide.category");


        //Actually register all keys
        for (int i = 0; i < ModKeyBindings.length; ++i) {
            ClientRegistry.registerKeyBinding(ModKeyBindings[i]);
        }
    }
}
