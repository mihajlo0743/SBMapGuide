package com.mihajlo0743.mapguide.proxy;

public class ServerProxy implements IProxy {


    @Override
    public void init() {
        throw new IllegalStateException("Client-side mod! Shouldn`t run on server!");
    }
}
