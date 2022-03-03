package org.libsdl.app;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.util.Log;
import android.view.Display;
import android.view.InputDevice;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.WindowManager;
import org.libsdl.app.SDLActivity;

/* access modifiers changed from: package-private */
public class SDLSurface extends SurfaceView implements SurfaceHolder.Callback, View.OnKeyListener, View.OnTouchListener, SensorEventListener {
    protected Display mDisplay;
    protected float mHeight = 1.0f;
    public boolean mIsSurfaceReady = false;
    protected SensorManager mSensorManager;
    protected float mWidth = 1.0f;

    public SDLSurface(Context context) {
        super(context);
        getHolder().addCallback(this);
        setFocusable(true);
        setFocusableInTouchMode(true);
        requestFocus();
        setOnKeyListener(this);
        setOnTouchListener(this);
        this.mDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        this.mSensorManager = (SensorManager) context.getSystemService("sensor");
        setOnGenericMotionListener(SDLActivity.getMotionListener());
    }

    public void enableSensor(int i2, boolean z) {
        if (z) {
            SensorManager sensorManager = this.mSensorManager;
            sensorManager.registerListener(this, sensorManager.getDefaultSensor(i2), 1, (Handler) null);
            return;
        }
        SensorManager sensorManager2 = this.mSensorManager;
        sensorManager2.unregisterListener(this, sensorManager2.getDefaultSensor(i2));
    }

    public Surface getNativeSurface() {
        return getHolder().getSurface();
    }

    public void handlePause() {
        enableSensor(1, false);
    }

    public void handleResume() {
        setFocusable(true);
        setFocusableInTouchMode(true);
        requestFocus();
        setOnKeyListener(this);
        setOnTouchListener(this);
        enableSensor(1, true);
    }

    public void onAccuracyChanged(Sensor sensor, int i2) {
    }

    public boolean onCapturedPointerEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 2 || actionMasked == 7) {
            SDLActivity.onNativeMouse(0, actionMasked, motionEvent.getX(0), motionEvent.getY(0), true);
            return true;
        } else if (actionMasked == 8) {
            SDLActivity.onNativeMouse(0, actionMasked, motionEvent.getAxisValue(10, 0), motionEvent.getAxisValue(9, 0), false);
            return true;
        } else if (actionMasked != 11 && actionMasked != 12) {
            return false;
        } else {
            if (actionMasked == 11) {
                actionMasked = 0;
            } else if (actionMasked == 12) {
                actionMasked = 1;
            }
            SDLActivity.onNativeMouse(motionEvent.getButtonState(), actionMasked, motionEvent.getX(0), motionEvent.getY(0), true);
            return true;
        }
    }

    public boolean onKey(View view, int i2, KeyEvent keyEvent) {
        int action;
        String nativeGetHint = SDLActivity.nativeGetHint("SDL_ANDROID_TRAP_BACK_BUTTON");
        if ((nativeGetHint == null || !nativeGetHint.equals("1")) && i2 == 4) {
            return false;
        }
        int deviceId = keyEvent.getDeviceId();
        int source = keyEvent.getSource();
        if (SDLControllerManager.isDeviceSDLJoystick(deviceId)) {
            if (keyEvent.getAction() == 0) {
                if (SDLControllerManager.onNativePadDown(deviceId, i2) == 0) {
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && SDLControllerManager.onNativePadUp(deviceId, i2) == 0) {
                return true;
            }
        }
        if (source == 0) {
            source = InputDevice.getDevice(deviceId).getSources();
        }
        if ((source & 257) != 0) {
            if (keyEvent.getAction() == 0) {
                if (SDLActivity.isTextInputEvent(keyEvent)) {
                    SDLInputConnection.nativeCommitText(String.valueOf((char) keyEvent.getUnicodeChar()), 1);
                }
                SDLActivity.onNativeKeyDown(i2);
                return true;
            } else if (keyEvent.getAction() == 1) {
                SDLActivity.onNativeKeyUp(i2);
                return true;
            }
        }
        return (source & 8194) != 0 && (i2 == 4 || i2 == 125) && ((action = keyEvent.getAction()) == 0 || action == 1);
    }

    public void onSensorChanged(SensorEvent sensorEvent) {
        float f2;
        float f3;
        int i2 = 1;
        if (sensorEvent.sensor.getType() == 1) {
            int rotation = this.mDisplay.getRotation();
            if (rotation == 1) {
                float[] fArr = sensorEvent.values;
                f3 = fArr[0];
                f2 = -fArr[1];
            } else if (rotation == 2) {
                float[] fArr2 = sensorEvent.values;
                f2 = -fArr2[0];
                f3 = -fArr2[1];
                i2 = 4;
            } else if (rotation != 3) {
                float[] fArr3 = sensorEvent.values;
                f2 = fArr3[0];
                f3 = fArr3[1];
                i2 = 3;
            } else {
                float[] fArr4 = sensorEvent.values;
                float f4 = fArr4[1];
                f3 = -fArr4[0];
                f2 = f4;
                i2 = 2;
            }
            if (i2 != SDLActivity.mCurrentOrientation) {
                SDLActivity.mCurrentOrientation = i2;
                SDLActivity.onNativeOrientationChanged(i2);
            }
            SDLActivity.onNativeAccel((-f2) / 9.80665f, f3 / 9.80665f, sensorEvent.values[2] / 9.80665f);
        }
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        int i2;
        int deviceId = motionEvent.getDeviceId();
        int pointerCount = motionEvent.getPointerCount();
        int actionMasked = motionEvent.getActionMasked();
        int i3 = 0;
        if (motionEvent.getSource() == 8194 || motionEvent.getSource() == 12290) {
            try {
                i2 = ((Integer) motionEvent.getClass().getMethod("getButtonState", new Class[0]).invoke(motionEvent, new Object[0])).intValue();
            } catch (Exception unused) {
                i2 = 1;
            }
            SDLGenericMotionListener_API12 motionListener = SDLActivity.getMotionListener();
            SDLActivity.onNativeMouse(i2, actionMasked, motionListener.getEventX(motionEvent), motionListener.getEventY(motionEvent), motionListener.inRelativeMode());
        } else {
            if (!(actionMasked == 0 || actionMasked == 1)) {
                if (actionMasked == 2) {
                    for (int i4 = 0; i4 < pointerCount; i4++) {
                        int pointerId = motionEvent.getPointerId(i4);
                        float x = motionEvent.getX(i4) / this.mWidth;
                        float y = motionEvent.getY(i4) / this.mHeight;
                        float pressure = motionEvent.getPressure(i4);
                        SDLActivity.onNativeTouch(deviceId, pointerId, actionMasked, x, y, pressure > 1.0f ? 1.0f : pressure);
                    }
                } else if (actionMasked == 3) {
                    for (int i5 = 0; i5 < pointerCount; i5++) {
                        int pointerId2 = motionEvent.getPointerId(i5);
                        float x2 = motionEvent.getX(i5) / this.mWidth;
                        float y2 = motionEvent.getY(i5) / this.mHeight;
                        float pressure2 = motionEvent.getPressure(i5);
                        SDLActivity.onNativeTouch(deviceId, pointerId2, 1, x2, y2, pressure2 > 1.0f ? 1.0f : pressure2);
                    }
                } else if (actionMasked == 5 || actionMasked == 6) {
                    i3 = -1;
                }
            }
            if (i3 == -1) {
                i3 = motionEvent.getActionIndex();
            }
            int pointerId3 = motionEvent.getPointerId(i3);
            float x3 = motionEvent.getX(i3) / this.mWidth;
            float y3 = motionEvent.getY(i3) / this.mHeight;
            float pressure3 = motionEvent.getPressure(i3);
            SDLActivity.onNativeTouch(deviceId, pointerId3, actionMasked, x3, y3, pressure3 > 1.0f ? 1.0f : pressure3);
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x008e A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void surfaceChanged(android.view.SurfaceHolder r8, int r9, int r10, int r11) {
        /*
        // Method dump skipped, instructions count: 356
        */
        throw new UnsupportedOperationException("Method not decompiled: org.libsdl.app.SDLSurface.surfaceChanged(android.view.SurfaceHolder, int, int, int):void");
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        Log.v("SDL", "surfaceCreated()");
        SDLActivity.onNativeSurfaceCreated();
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        Log.v("SDL", "surfaceDestroyed()");
        SDLActivity.mNextNativeState = SDLActivity.NativeState.PAUSED;
        SDLActivity.handleNativeState();
        this.mIsSurfaceReady = false;
        SDLActivity.onNativeSurfaceDestroyed();
    }
}
