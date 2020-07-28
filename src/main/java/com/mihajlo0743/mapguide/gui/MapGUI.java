package com.mihajlo0743.mapguide.gui;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.gui.IGuiEventListener;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.TranslationTextComponent;
import com.mihajlo0743.mapguide.MapGuide;

public class MapGUI extends Screen {

    public MapGUI(){
        super(new TranslationTextComponent("gui.mapguide.map"));
    }

    @Override
    protected void init() {

        addButton(new Button(width-width/15, height/20, 20, 20, new TranslationTextComponent("gui.mapguide.close"), b->this.closeScreen()));
        addButton(new PortalButton(width/2 - 300/2 +40,height/2 - 300/2 + 30, b->minecraft.player.sendChatMessage("/warp banehelm")));
        addButton(new PortalButton(width/2 - 300/2 +55,height/2 - 300/2 +145, b->minecraft.player.sendChatMessage("/warp arenaofelders")));
        addButton(new PortalButton(width/2 - 300/2 +210,height/2 - 300/2 +215, b->minecraft.player.sendChatMessage("/warp bogmore")));
        addButton(new PortalButton(width/2 - 300/2 +95,height/2 - 300/2 +205, b->minecraft.player.sendChatMessage("/warp choirbank")));
        addButton(new PortalButton(width/2 - 300/2 +130,height/2 - 300/2 +22, b->minecraft.player.sendChatMessage("/warp dustpool")));
        addButton(new PortalButton(width/2 - 300/2 +205,height/2 - 300/2 +20, b->minecraft.player.sendChatMessage("/warp ferverridge")));
        addButton(new PortalButton(width/2 - 300/2 +145,height/2 - 300/2 +70, b->minecraft.player.sendChatMessage("/warp gritfeld")));
        addButton(new PortalButton(width/2 - 300/2 +145,height/2 - 300/2 +140, b->minecraft.player.sendChatMessage("/warp halcyon")));
        addButton(new PortalButton(width/2 - 300/2 +30,height/2 - 300/2 +210, b->minecraft.player.sendChatMessage("/warp hopesend")));
        addButton(new PortalButton(width/2 - 300/2 +140,height/2 - 300/2 +230, b->minecraft.player.sendChatMessage("/warp hymnwoodruins")));
        addButton(new PortalButton(width/2 - 300/2 +210,height/2 - 300/2 +70, b->minecraft.player.sendChatMessage("/warp lowlandoutpost")));
        addButton(new PortalButton(width/2 - 300/2 +10,height/2 - 300/2 +65, b->minecraft.player.sendChatMessage("/warp northfall")));
        addButton(new PortalButton(width/2 - 300/2 +260,height/2 - 300/2 +170, b->minecraft.player.sendChatMessage("/warp halcyonreach")));
        addButton(new PortalButton(width/2 - 300/2 +220,height/2 - 300/2 +140, b->minecraft.player.sendChatMessage("/warp rubygrove")));
        addButton(new PortalButton(width/2 - 300/2 +180,height/2 - 300/2 +120, b->minecraft.player.sendChatMessage("/warp stonetooth")));
        addButton(new PortalButton(width/2 - 300/2 +70,height/2 - 300/2 +60, b->minecraft.player.sendChatMessage("/warp verdonestate")));
        addButton(new PortalButton(width/2 - 300/2 +35,height/2 - 300/2 +155, b->minecraft.player.sendChatMessage("/warp westmar")));
        addButton(new PortalButton(width/2 - 300/2 +70,height/2 - 300/2 +190, b->minecraft.player.sendChatMessage("/warp zealotskeep")));
        //addButton(new PortalButton(width/2 - 300/2 +32,height/2 - 300/2 +124, b->minecraft.player.sendChatMessage("/warp banehelm")));
        //addButton(new PortalButton(width/2 - 300/2 +32,height/2 - 300/2 +124, b->minecraft.player.sendChatMessage("/warp banehelm")));

        super.init();
    }

    @Override
    public void render(MatrixStack matrixStack, int mouseX, int mouseY, float partialTicks) {
        minecraft.textureManager.bindTexture( new ResourceLocation(MapGuide.MODID+":textures/gui/map.png"));
        minecraft.ingameGUI.blit(matrixStack, width/2 - 300/2, height/2 - 300/2, 0, 0, 300, 300, 300,300);
        super.render(matrixStack, mouseX, mouseY, partialTicks);
    }
}
