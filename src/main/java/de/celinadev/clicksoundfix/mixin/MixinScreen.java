package de.celinadev.clicksoundfix.mixin;

import de.celinadev.clicksoundfix.util.Util;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.Screen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Screen.class)
public class MixinScreen {

    @Inject(method = "init(Lnet/minecraft/client/MinecraftClient;II)V", at = @At("HEAD"))
    public void startTimer(MinecraftClient client, int width, int height, CallbackInfo ci) {
        Util.resetTimer();
    }
}
