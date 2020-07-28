package com.mihajlo0743.mapguide.gui;

import com.mihajlo0743.mapguide.MapGuide;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextComponent;

import javax.swing.*;

public class PortalButton extends Button {

    public PortalButton(int x, int y, Button.IPressable pressedAction){
        super(x, y, 16, 16, new StringTextComponent(""), pressedAction);
    }
 public void onPress() {
      this.onPress.onPress(this);
   }
    @Override
   public void renderButton(MatrixStack matrixStack, int p_230431_2_, int p_230431_3_, float p_230431_4_) {
      //super.renderButton(p_230431_1_, p_230431_2_, p_230431_3_, p_230431_4_);
        if (this.isHovered()) {
            Minecraft.getInstance().textureManager.bindTexture( new ResourceLocation(MapGuide.MODID+":textures/gui/portal_hower.png"));
        } else Minecraft.getInstance().textureManager.bindTexture( new ResourceLocation(MapGuide.MODID+":textures/gui/portal.png"));
        Minecraft.getInstance().ingameGUI.blit(matrixStack, x, y, 0, 0, 18, 18, 18,18);



   }

}
