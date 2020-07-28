package com.mihajlo0743.mapguide.proxy;

import com.mihajlo0743.mapguide.handlers.InputHandler;
import com.mihajlo0743.mapguide.handlers.KeyBinds;
import net.minecraftforge.common.MinecraftForge;

import java.awt.im.InputContext;

public class ClientProxy implements IProxy {
    @Override
    public void init() {
        KeyBinds.register();
        MinecraftForge.EVENT_BUS.register(new InputHandler());
    }
}
