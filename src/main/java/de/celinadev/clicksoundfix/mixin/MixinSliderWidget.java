package de.celinadev.clicksoundfix.mixin;

import de.celinadev.clicksoundfix.util.Util;
import net.minecraft.client.gui.widget.SliderWidget;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(SliderWidget.class)
public class MixinSliderWidget {

    @Inject(method = "onRelease", at = @At("HEAD"), cancellable = true)
    private void cancelUISound(double mouseX, double mouseY, CallbackInfo ci) {
        if (Util.SCREEN_OPEN_SINCE_TICKS < 5)
            ci.cancel();
    }
}
