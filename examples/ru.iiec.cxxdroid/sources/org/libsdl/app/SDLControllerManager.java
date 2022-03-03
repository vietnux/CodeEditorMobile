package org.libsdl.app;

import android.os.Build;
import android.view.InputDevice;
import android.view.MotionEvent;

public class SDLControllerManager {
    private static final String TAG = "SDLControllerManager";
    protected static SDLHapticHandler mHapticHandler;
    protected static SDLJoystickHandler mJoystickHandler;

    public static boolean handleJoystickMotionEvent(MotionEvent motionEvent) {
        return mJoystickHandler.handleMotionEvent(motionEvent);
    }

    public static void hapticRun(int i2, float f2, int i3) {
        mHapticHandler.run(i2, f2, i3);
    }

    public static void hapticStop(int i2) {
        mHapticHandler.stop(i2);
    }

    public static void initialize() {
        if (mJoystickHandler == null) {
            mJoystickHandler = Build.VERSION.SDK_INT >= 19 ? new SDLJoystickHandler_API19() : new SDLJoystickHandler_API16();
        }
        if (mHapticHandler == null) {
            mHapticHandler = Build.VERSION.SDK_INT >= 26 ? new SDLHapticHandler_API26() : new SDLHapticHandler();
        }
    }

    public static boolean isDeviceSDLJoystick(int i2) {
        InputDevice device = InputDevice.getDevice(i2);
        if (device == null || i2 < 0) {
            return false;
        }
        int sources = device.getSources();
        return (sources & 16) != 0 || (sources & 513) == 513 || (sources & 1025) == 1025;
    }

    public static native int nativeAddHaptic(int i2, String str);

    public static native int nativeAddJoystick(int i2, String str, String str2, int i3, int i4, boolean z, int i5, int i6, int i7, int i8);

    public static native int nativeRemoveHaptic(int i2);

    public static native int nativeRemoveJoystick(int i2);

    public static native int nativeSetupJNI();

    public static native void onNativeHat(int i2, int i3, int i4, int i5);

    public static native void onNativeJoy(int i2, int i3, float f2);

    public static native int onNativePadDown(int i2, int i3);

    public static native int onNativePadUp(int i2, int i3);

    public static void pollHapticDevices() {
        mHapticHandler.pollHapticDevices();
    }

    public static void pollInputDevices() {
        mJoystickHandler.pollInputDevices();
    }
}
