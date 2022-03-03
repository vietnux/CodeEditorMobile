package org.libsdl.app;

import android.view.MotionEvent;
import android.view.View;

/* access modifiers changed from: package-private */
public class SDLGenericMotionListener_API12 implements View.OnGenericMotionListener {
    SDLGenericMotionListener_API12() {
    }

    public float getEventX(MotionEvent motionEvent) {
        return motionEvent.getX(0);
    }

    public float getEventY(MotionEvent motionEvent) {
        return motionEvent.getY(0);
    }

    public boolean inRelativeMode() {
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0014, code lost:
        if (r5 != 16777232) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onGenericMotion(android.view.View r5, android.view.MotionEvent r6) {
        /*
            r4 = this;
            int r5 = r6.getSource()
            r0 = 513(0x201, float:7.19E-43)
            if (r5 == r0) goto L_0x003d
            r0 = 1025(0x401, float:1.436E-42)
            if (r5 == r0) goto L_0x003d
            r0 = 8194(0x2002, float:1.1482E-41)
            r1 = 0
            if (r5 == r0) goto L_0x0017
            r0 = 16777232(0x1000010, float:2.3509932E-38)
            if (r5 == r0) goto L_0x003d
            goto L_0x0023
        L_0x0017:
            int r5 = r6.getActionMasked()
            r0 = 7
            r2 = 1
            if (r5 == r0) goto L_0x0034
            r0 = 8
            if (r5 == r0) goto L_0x0024
        L_0x0023:
            return r1
        L_0x0024:
            r0 = 10
            float r0 = r6.getAxisValue(r0, r1)
            r3 = 9
            float r6 = r6.getAxisValue(r3, r1)
        L_0x0030:
            org.libsdl.app.SDLActivity.onNativeMouse(r1, r5, r0, r6, r1)
            return r2
        L_0x0034:
            float r0 = r6.getX(r1)
            float r6 = r6.getY(r1)
            goto L_0x0030
        L_0x003d:
            boolean r5 = org.libsdl.app.SDLControllerManager.handleJoystickMotionEvent(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: org.libsdl.app.SDLGenericMotionListener_API12.onGenericMotion(android.view.View, android.view.MotionEvent):boolean");
    }

    public void reclaimRelativeMouseModeIfNeeded() {
    }

    public boolean setRelativeMouseEnabled(boolean z) {
        return false;
    }

    public boolean supportsRelativeMouse() {
        return false;
    }
}
