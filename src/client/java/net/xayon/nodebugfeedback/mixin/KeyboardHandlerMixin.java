package net.xayon.nodebugfeedback.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import net.minecraft.client.KeyboardHandler;

// Just uses a simple mixin file. Don't know why you're here.

@Mixin(KeyboardHandler.class)
public class KeyboardHandlerMixin {

	@Inject(method = "debugFeedbackTranslated", at = @At("HEAD"), cancellable = true)
	private void nodebugfeedback$cancelDebugFeedback(String pattern, CallbackInfo ci) {
		ci.cancel();
	}
}
