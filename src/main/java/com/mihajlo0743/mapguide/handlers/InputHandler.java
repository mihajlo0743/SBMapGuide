package com.mihajlo0743.mapguide.handlers;

import com.mihajlo0743.mapguide.gui.MapGUI;
import net.minecraft.client.Minecraft;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class InputHandler {
    @SubscribeEvent
    public void onKey(InputEvent.KeyInputEvent event){
        if (KeyBinds.ModKeyBindings[0].isPressed()){
            Minecraft.getInstance().displayGuiScreen(new MapGUI());
        }
    }
}
