package org.libsdl.app;

import android.os.VibrationEffect;
import android.util.Log;
import org.libsdl.app.SDLHapticHandler;

/* access modifiers changed from: package-private */
public class SDLHapticHandler_API26 extends SDLHapticHandler {
    SDLHapticHandler_API26() {
    }

    @Override // org.libsdl.app.SDLHapticHandler
    public void run(int i2, float f2, int i3) {
        SDLHapticHandler.SDLHaptic haptic = getHaptic(i2);
        if (haptic != null) {
            Log.d("SDL", "Rtest: Vibe with intensity " + f2 + " for " + i3);
            if (f2 == 0.0f) {
                stop(i2);
                return;
            }
            int round = Math.round(f2 * 255.0f);
            if (round > 255) {
                round = 255;
            }
            if (round < 1) {
                stop(i2);
                return;
            }
            try {
                haptic.vib.vibrate(VibrationEffect.createOneShot((long) i3, round));
            } catch (Exception unused) {
                haptic.vib.vibrate((long) i3);
            }
        }
    }
}
