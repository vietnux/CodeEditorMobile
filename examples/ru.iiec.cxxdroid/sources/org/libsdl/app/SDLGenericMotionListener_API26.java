package org.libsdl.app;

import android.os.Build;
import android.view.MotionEvent;
import android.view.View;

/* access modifiers changed from: package-private */
public class SDLGenericMotionListener_API26 extends SDLGenericMotionListener_API24 {
    private boolean mRelativeModeEnabled;

    SDLGenericMotionListener_API26() {
    }

    @Override // org.libsdl.app.SDLGenericMotionListener_API12, org.libsdl.app.SDLGenericMotionListener_API24
    public float getEventX(MotionEvent motionEvent) {
        return motionEvent.getX(0);
    }

    @Override // org.libsdl.app.SDLGenericMotionListener_API12, org.libsdl.app.SDLGenericMotionListener_API24
    public float getEventY(MotionEvent motionEvent) {
        return motionEvent.getY(0);
    }

    @Override // org.libsdl.app.SDLGenericMotionListener_API12, org.libsdl.app.SDLGenericMotionListener_API24
    public boolean inRelativeMode() {
        return this.mRelativeModeEnabled;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0025, code lost:
        if (r8 != 16777232) goto L_0x0051;
     */
    @Override // org.libsdl.app.SDLGenericMotionListener_API12, org.libsdl.app.SDLGenericMotionListener_API24
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onGenericMotion(android.view.View r8, android.view.MotionEvent r9) {
        /*
        // Method dump skipped, instructions count: 111
        */
        throw new UnsupportedOperationException("Method not decompiled: org.libsdl.app.SDLGenericMotionListener_API26.onGenericMotion(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // org.libsdl.app.SDLGenericMotionListener_API12
    public void reclaimRelativeMouseModeIfNeeded() {
        if (this.mRelativeModeEnabled && !SDLActivity.isDeXMode()) {
            SDLActivity.getContentView().requestPointerCapture();
        }
    }

    @Override // org.libsdl.app.SDLGenericMotionListener_API12, org.libsdl.app.SDLGenericMotionListener_API24
    public boolean setRelativeMouseEnabled(boolean z) {
        if (SDLActivity.isDeXMode() && Build.VERSION.SDK_INT < 27) {
            return false;
        }
        View contentView = SDLActivity.getContentView();
        if (z) {
            contentView.requestPointerCapture();
        } else {
            contentView.releasePointerCapture();
        }
        this.mRelativeModeEnabled = z;
        return true;
    }

    @Override // org.libsdl.app.SDLGenericMotionListener_API12, org.libsdl.app.SDLGenericMotionListener_API24
    public boolean supportsRelativeMouse() {
        return !SDLActivity.isDeXMode() || Build.VERSION.SDK_INT >= 27;
    }
}
