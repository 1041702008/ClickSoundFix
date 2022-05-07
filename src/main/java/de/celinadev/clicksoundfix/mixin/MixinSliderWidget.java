package de.celinadev.clicksoundfix.mixin;

import net.minecraft.client.gui.widget.ClickableWidget;
import net.minecraft.client.gui.widget.SliderWidget;
import net.minecraft.text.Text;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(SliderWidget.class)
public abstract class MixinSliderWidget extends ClickableWidget {

    private boolean active = false;

    protected MixinSliderWidget(int x, int y, int width, int height, Text message) {
        super(x, y, width, height, message);
    }

    @Inject(method = "onRelease", at = @At("HEAD"), cancellable = true)
    private void setInactive(double mouseX, double mouseY, CallbackInfo ci) {
        boolean b = this.active;
        this.active = false;
        if (!b) {
            ci.cancel();
        }
    }

    @Inject(method = "onClick", at = @At("HEAD"))
    public void setActive(double mouseX, double mouseY, CallbackInfo ci) {
        this.active = true;
    }
}
