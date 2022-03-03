package org.liballeg.android;

import android.view.MotionEvent;
import android.view.View;

/* access modifiers changed from: package-private */
public class AllegroJoystick implements View.OnGenericMotionListener {
    private AllegroActivity activity;
    private float axis0_hat_x = 0.0f;
    private float axis0_hat_y = 0.0f;
    private float axis0_x = 0.0f;
    private float axis0_y = 0.0f;
    private float axis1_x = 0.0f;
    private float axis1_y = 0.0f;
    private AllegroSurface surface;

    public AllegroJoystick(AllegroActivity allegroActivity, AllegroSurface allegroSurface) {
        this.activity = allegroActivity;
        this.surface = allegroSurface;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000d, code lost:
        if (r7 < 0.0f) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void handleHat(int r5, float r6, float r7, int r8, int r9) {
        /*
            r4 = this;
            int r0 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            r0 = 1
            r1 = 0
            int r2 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r2 != 0) goto L_0x001b
            int r6 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r6 >= 0) goto L_0x0015
        L_0x000f:
            org.liballeg.android.AllegroSurface r6 = r4.surface
            r6.nativeOnJoystickButton(r5, r8, r0)
            goto L_0x0036
        L_0x0015:
            org.liballeg.android.AllegroSurface r6 = r4.surface
            r6.nativeOnJoystickButton(r5, r9, r0)
            goto L_0x0036
        L_0x001b:
            r3 = 0
            int r6 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r6 >= 0) goto L_0x002a
            org.liballeg.android.AllegroSurface r6 = r4.surface
            r6.nativeOnJoystickButton(r5, r8, r3)
            int r6 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r6 <= 0) goto L_0x0036
            goto L_0x0015
        L_0x002a:
            if (r2 <= 0) goto L_0x0036
            org.liballeg.android.AllegroSurface r6 = r4.surface
            r6.nativeOnJoystickButton(r5, r9, r3)
            int r6 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r6 >= 0) goto L_0x0036
            goto L_0x000f
        L_0x0036:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.liballeg.android.AllegroJoystick.handleHat(int, float, float, int, int):void");
    }

    public boolean onGenericMotion(View view, MotionEvent motionEvent) {
        int indexOfJoystick;
        if (!this.activity.joystickActive || (indexOfJoystick = this.activity.indexOfJoystick(motionEvent.getDeviceId())) < 0) {
            return false;
        }
        float axisValue = motionEvent.getAxisValue(0, 0);
        float axisValue2 = motionEvent.getAxisValue(1, 0);
        float axisValue3 = motionEvent.getAxisValue(15, 0);
        float axisValue4 = motionEvent.getAxisValue(16, 0);
        float axisValue5 = motionEvent.getAxisValue(11, 0);
        float axisValue6 = motionEvent.getAxisValue(14, 0);
        if (axisValue != this.axis0_x || axisValue2 != this.axis0_y) {
            this.surface.nativeOnJoystickAxis(indexOfJoystick, 0, 0, axisValue);
            this.surface.nativeOnJoystickAxis(indexOfJoystick, 0, 1, axisValue2);
            this.axis0_x = axisValue;
            this.axis0_y = axisValue2;
        } else if (!(axisValue3 == this.axis0_hat_x && axisValue4 == this.axis0_hat_y)) {
            handleHat(indexOfJoystick, this.axis0_hat_x, axisValue3, 6, 7);
            handleHat(indexOfJoystick, this.axis0_hat_y, axisValue4, 8, 9);
            this.axis0_hat_x = axisValue3;
            this.axis0_hat_y = axisValue4;
        }
        if (!(axisValue5 == this.axis1_x && axisValue6 == this.axis1_y)) {
            this.surface.nativeOnJoystickAxis(indexOfJoystick, 1, 0, axisValue5);
            this.surface.nativeOnJoystickAxis(indexOfJoystick, 1, 1, axisValue6);
            this.axis1_x = axisValue5;
            this.axis1_y = axisValue6;
        }
        return true;
    }
}
