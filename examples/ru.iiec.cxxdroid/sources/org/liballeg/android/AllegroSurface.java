package org.liballeg.android;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

/* access modifiers changed from: package-private */
public class AllegroSurface extends SurfaceView implements SurfaceHolder.Callback {
    private AllegroActivity activity;
    private AllegroEGL egl = new AllegroEGL();
    private AllegroJoystick joystick_listener;
    private KeyListener key_listener;
    private TouchListener touch_listener;

    public AllegroSurface(Context context, Display display, AllegroActivity allegroActivity) {
        super(context);
        Log.d("AllegroSurface", "PixelFormat=" + display.getPixelFormat());
        getHolder().setFormat(display.getPixelFormat());
        getHolder().addCallback(this);
        this.activity = allegroActivity;
        this.key_listener = new KeyListener(context, allegroActivity);
        this.touch_listener = new TouchListener();
    }

    private void grabFocus() {
        Log.d("AllegroSurface", "Grabbing focus");
        setFocusable(true);
        setFocusableInTouchMode(true);
        requestFocus();
        setOnKeyListener(this.key_listener);
        setOnTouchListener(this.touch_listener);
        if (Build.VERSION.SDK_INT >= 12) {
            this.joystick_listener = new AllegroJoystick(this.activity, this);
            setOnGenericMotionListener(this.joystick_listener);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean egl_Init() {
        return this.egl.egl_Init();
    }

    /* access modifiers changed from: package-private */
    public void egl_SwapBuffers() {
        this.egl.egl_SwapBuffers();
    }

    /* access modifiers changed from: package-private */
    public int egl_chooseConfig(boolean z) {
        return this.egl.egl_chooseConfig(z);
    }

    /* access modifiers changed from: package-private */
    public void egl_clearCurrent() {
        this.egl.egl_clearCurrent();
    }

    /* access modifiers changed from: package-private */
    public int egl_createContext(int i2, boolean z) {
        return this.egl.egl_createContext(i2, z);
    }

    /* access modifiers changed from: package-private */
    public boolean egl_createSurface() {
        return this.egl.egl_createSurface(this);
    }

    /* access modifiers changed from: package-private */
    public void egl_getConfigAttribs(int i2, int[] iArr) {
        this.egl.egl_getConfigAttribs(i2, iArr);
    }

    /* access modifiers changed from: package-private */
    public void egl_initRequiredAttribs() {
        this.egl.egl_initRequiredAttribs();
    }

    /* access modifiers changed from: package-private */
    public void egl_makeCurrent() {
        this.egl.egl_makeCurrent();
    }

    /* access modifiers changed from: package-private */
    public void egl_setRequiredAttrib(int i2, int i3) {
        this.egl.egl_setRequiredAttrib(i2, i3);
    }

    public native void nativeOnChange(int i2, int i3, int i4);

    public native void nativeOnCreate();

    public native boolean nativeOnDestroy();

    public native void nativeOnJoystickAxis(int i2, int i3, int i4, float f2);

    public native void nativeOnJoystickButton(int i2, int i3, boolean z);

    public void onDraw(Canvas canvas) {
    }

    /* access modifiers changed from: package-private */
    public void setCaptureVolumeKeys(boolean z) {
        this.key_listener.setCaptureVolumeKeys(z);
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i2, int i3, int i4) {
        Log.d("AllegroSurface", "surfaceChanged (width=" + i3 + " height=" + i4 + ")");
        nativeOnChange(-559038737, i3, i4);
        Log.d("AllegroSurface", "surfaceChanged end");
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        Log.d("AllegroSurface", "surfaceCreated");
        nativeOnCreate();
        grabFocus();
        Log.d("AllegroSurface", "surfaceCreated end");
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        String str;
        Log.d("AllegroSurface", "surfaceDestroyed");
        if (!nativeOnDestroy()) {
            str = "No surface created, returning early";
        } else {
            this.egl.egl_Terminate();
            str = "surfaceDestroyed end";
        }
        Log.d("AllegroSurface", str);
    }
}
