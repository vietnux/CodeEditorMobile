package org.libsdl.app;

import android.os.Vibrator;
import android.view.InputDevice;
import java.util.ArrayList;

/* access modifiers changed from: package-private */
public class SDLHapticHandler {
    private ArrayList<SDLHaptic> mHaptics = new ArrayList<>();

    /* access modifiers changed from: package-private */
    public class SDLHaptic {
        public int device_id;
        public String name;
        public Vibrator vib;

        SDLHaptic(SDLHapticHandler sDLHapticHandler) {
        }
    }

    /* access modifiers changed from: protected */
    public SDLHaptic getHaptic(int i2) {
        for (int i3 = 0; i3 < this.mHaptics.size(); i3++) {
            if (this.mHaptics.get(i3).device_id == i2) {
                return this.mHaptics.get(i3);
            }
        }
        return null;
    }

    public void pollHapticDevices() {
        boolean z;
        int[] deviceIds = InputDevice.getDeviceIds();
        int length = deviceIds.length;
        while (true) {
            length--;
            if (length <= -1) {
                break;
            } else if (getHaptic(deviceIds[length]) == null) {
                InputDevice device = InputDevice.getDevice(deviceIds[length]);
                Vibrator vibrator = device.getVibrator();
                if (vibrator.hasVibrator()) {
                    SDLHaptic sDLHaptic = new SDLHaptic(this);
                    sDLHaptic.device_id = deviceIds[length];
                    sDLHaptic.name = device.getName();
                    sDLHaptic.vib = vibrator;
                    this.mHaptics.add(sDLHaptic);
                    SDLControllerManager.nativeAddHaptic(sDLHaptic.device_id, sDLHaptic.name);
                }
            }
        }
        Vibrator vibrator2 = (Vibrator) SDL.getContext().getSystemService("vibrator");
        if (vibrator2 != null) {
            z = vibrator2.hasVibrator();
            if (z && getHaptic(999999) == null) {
                SDLHaptic sDLHaptic2 = new SDLHaptic(this);
                sDLHaptic2.device_id = 999999;
                sDLHaptic2.name = "VIBRATOR_SERVICE";
                sDLHaptic2.vib = vibrator2;
                this.mHaptics.add(sDLHaptic2);
                SDLControllerManager.nativeAddHaptic(sDLHaptic2.device_id, sDLHaptic2.name);
            }
        } else {
            z = false;
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < this.mHaptics.size(); i2++) {
            int i3 = this.mHaptics.get(i2).device_id;
            int i4 = 0;
            while (i4 < deviceIds.length && i3 != deviceIds[i4]) {
                i4++;
            }
            if ((i3 != 999999 || !z) && i4 == deviceIds.length) {
                arrayList.add(Integer.valueOf(i3));
            }
        }
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            int intValue = ((Integer) arrayList.get(i5)).intValue();
            SDLControllerManager.nativeRemoveHaptic(intValue);
            int i6 = 0;
            while (true) {
                if (i6 >= this.mHaptics.size()) {
                    break;
                } else if (this.mHaptics.get(i6).device_id == intValue) {
                    this.mHaptics.remove(i6);
                    break;
                } else {
                    i6++;
                }
            }
        }
    }

    public void run(int i2, float f2, int i3) {
        SDLHaptic haptic = getHaptic(i2);
        if (haptic != null) {
            haptic.vib.vibrate((long) i3);
        }
    }

    public void stop(int i2) {
        SDLHaptic haptic = getHaptic(i2);
        if (haptic != null) {
            haptic.vib.cancel();
        }
    }
}
