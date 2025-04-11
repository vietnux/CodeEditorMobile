package org.liballeg.android;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.Display;
import android.view.InputDevice;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import java.util.Vector;

public class AllegroActivity extends Activity {
    public static final int JS_A = 0;
    public static final int JS_B = 1;
    public static final int JS_DPAD_D = 9;
    public static final int JS_DPAD_L = 6;
    public static final int JS_DPAD_R = 7;
    public static final int JS_DPAD_U = 8;
    public static final int JS_L1 = 4;
    public static final int JS_MENU = 10;
    public static final int JS_R1 = 5;
    public static final int JS_X = 2;
    public static final int JS_Y = 3;
    private String clip_text;
    private Clipboard clipboard;
    private Configuration currentConfig;
    private DisplayManager.DisplayListener displayListener;
    private boolean exitedMain = false;
    private boolean got_clip = false;
    private Handler handler;
    public boolean joystickActive = false;
    private boolean joystickReconfigureNotified = false;
    private Vector<Integer> joysticks;
    private ScreenLock screenLock;
    private Sensors sensors;
    private boolean set_clip = false;
    private boolean set_clip_result;
    private AllegroSurface surface;
    protected String userLibName = "libapp.so";

    public AllegroActivity(String str) {
        this.userLibName = str;
        this.joysticks = new Vector<>();
        reconfigureJoysticks();
        new Thread() {
            /* class org.liballeg.android.AllegroActivity.AnonymousClass4 */

            public void run() {
                while (true) {
                    try {
                        Thread.sleep(100);
                    } catch (Exception unused) {
                    }
                    if (!AllegroActivity.this.joystickReconfigureNotified) {
                        int[] deviceIds = InputDevice.getDeviceIds();
                        boolean z = false;
                        int i2 = 0;
                        int i3 = 0;
                        while (true) {
                            if (i2 >= deviceIds.length) {
                                break;
                            }
                            if (AllegroActivity.this.isJoystick(deviceIds[i2])) {
                                if (!AllegroActivity.this.joysticks.contains(Integer.valueOf(deviceIds[i2]))) {
                                    z = true;
                                    break;
                                }
                                i3++;
                            }
                            i2++;
                        }
                        if (!z && i3 != AllegroActivity.this.joysticks.size()) {
                            z = true;
                        }
                        if (z) {
                            Log.d("AllegroActivity", "Sending joystick reconfigure event");
                            AllegroActivity.this.joystickReconfigureNotified = true;
                            AllegroActivity.this.nativeSendJoystickConfigurationEvent();
                        }
                    }
                }
            }
        }.start();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private boolean isJoystick(int i2) {
        return (InputDevice.getDevice(i2).getSources() & 16777232) == 16777232;
    }

    /* access modifiers changed from: package-private */
    public void createSurface() {
        try {
            Log.d("AllegroActivity", "createSurface");
            this.surface = new AllegroSurface(getApplicationContext(), getWindowManager().getDefaultDisplay(), this);
            SurfaceHolder holder = this.surface.getHolder();
            holder.addCallback(this.surface);
            holder.setType(2);
            getWindow().setContentView(this.surface);
            Log.d("AllegroActivity", "createSurface end");
        } catch (Exception e2) {
            Log.d("AllegroActivity", "createSurface exception: " + e2.getMessage());
        }
    }

    /* access modifiers changed from: package-private */
    public void destroySurface() {
        Log.d("AllegroActivity", "destroySurface");
        ((ViewGroup) this.surface.getParent()).removeView(this.surface);
        this.surface = null;
    }

    /* access modifiers changed from: package-private */
    public int getAllegroOrientation() {
        return Const.toAllegroOrientation(Reflect.methodExists(getWindowManager().getDefaultDisplay(), "getRotation") ? getWindowManager().getDefaultDisplay().getRotation() : getWindowManager().getDefaultDisplay().getOrientation());
    }

    /* access modifiers changed from: package-private */
    public String getApkPath() {
        return getApplicationInfo().sourceDir;
    }

    public String getClipboardText() {
        this.got_clip = false;
        try {
            runOnUiThread(new Runnable() {
                /* class org.liballeg.android.AllegroActivity.AnonymousClass6 */

                public void run() {
                    AllegroActivity allegroActivity = AllegroActivity.this;
                    allegroActivity.clip_text = allegroActivity.clipboard.getText();
                    AllegroActivity.this.got_clip = true;
                }
            });
        } catch (Exception unused) {
            Log.d("AllegroActivity", "getClipboardText failed");
            this.clip_text = "";
            this.got_clip = true;
        }
        do {
        } while (!this.got_clip);
        return this.clip_text;
    }

    /* access modifiers changed from: package-private */
    public Rect getDisplaySize() {
        Display defaultDisplay = getWindowManager().getDefaultDisplay();
        Rect rect = new Rect();
        if (Build.VERSION.SDK_INT >= 13) {
            defaultDisplay.getRectSize(rect);
        } else {
            rect.left = 0;
            rect.top = 0;
            rect.right = defaultDisplay.getWidth();
            rect.bottom = defaultDisplay.getHeight();
        }
        return rect;
    }

    /* access modifiers changed from: package-private */
    public boolean getMainReturned() {
        return this.exitedMain;
    }

    /* access modifiers changed from: package-private */
    public String getManufacturer() {
        return Build.MANUFACTURER;
    }

    /* access modifiers changed from: package-private */
    public String getModel() {
        return Build.MODEL;
    }

    public int getNumJoysticks() {
        return this.joysticks.size();
    }

    /* access modifiers changed from: package-private */
    public String getOsVersion() {
        return Build.VERSION.RELEASE;
    }

    /* access modifiers changed from: package-private */
    public String getPubDataDir() {
        return getFilesDir().getAbsolutePath();
    }

    /* access modifiers changed from: package-private */
    public String getResourcesDir() {
        return getFilesDir().getAbsolutePath();
    }

    /* access modifiers changed from: package-private */
    public String getUserLibName() {
        return this.userLibName;
    }

    public boolean hasClipboardText() {
        return this.clipboard.hasText();
    }

    public int indexOfJoystick(int i2) {
        return this.joysticks.indexOf(Integer.valueOf(i2), 0);
    }

    /* access modifiers changed from: package-private */
    public boolean inhibitScreenLock(boolean z) {
        if (this.screenLock == null) {
            this.screenLock = new ScreenLock(this);
        }
        return this.screenLock.inhibitScreenLock(z);
    }

    /* access modifiers changed from: package-private */
    public native boolean nativeOnCreate();

    /* access modifiers changed from: package-private */
    public native void nativeOnDestroy();

    /* access modifiers changed from: package-private */
    public native void nativeOnOrientationChange(int i2, boolean z);

    /* access modifiers changed from: package-private */
    public native void nativeOnPause();

    /* access modifiers changed from: package-private */
    public native void nativeOnResume();

    /* access modifiers changed from: package-private */
    public native void nativeSendJoystickConfigurationEvent();

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Log.d("AllegroActivity", "onConfigurationChanged");
        int diff = this.currentConfig.diff(configuration);
        Log.d("AllegroActivity", "changes: " + Integer.toBinaryString(diff));
        if ((1073741824 & diff) != 0) {
            Log.d("AllegroActivity", "font scale changed");
        }
        if ((diff & 1) != 0) {
            Log.d("AllegroActivity", "mcc changed");
        }
        if ((diff & 2) != 0) {
            Log.d("AllegroActivity", " changed");
        }
        if ((diff & 4) != 0) {
            Log.d("AllegroActivity", "locale changed");
        }
        if ((diff & 8) != 0) {
            Log.d("AllegroActivity", "touchscreen changed");
        }
        if ((diff & 16) != 0) {
            Log.d("AllegroActivity", "keyboard changed");
        }
        if ((diff & 64) != 0) {
            Log.d("AllegroActivity", "navigation changed");
        }
        if ((diff & 128) != 0) {
            Log.d("AllegroActivity", "orientation changed");
            updateOrientation();
        }
        if ((diff & 256) != 0) {
            Log.d("AllegroActivity", "screen layout changed");
        }
        if ((diff & 512) != 0) {
            Log.d("AllegroActivity", "ui mode changed");
        }
        if (this.currentConfig.screenLayout != configuration.screenLayout) {
            Log.d("AllegroActivity", "screenLayout changed!");
        }
        Log.d("AllegroActivity", "old orientation: " + this.currentConfig.orientation + ", new orientation: " + configuration.orientation);
        this.currentConfig = new Configuration(configuration);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x00ff  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r7) {
        /*
        // Method dump skipped, instructions count: 270
        */
        throw new UnsupportedOperationException("Method not decompiled: org.liballeg.android.AllegroActivity.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        super.onDestroy();
        Log.d("AllegroActivity", "onDestroy");
        nativeOnDestroy();
        Log.d("AllegroActivity", "onDestroy end");
    }

    public void onPause() {
        super.onPause();
        Log.d("AllegroActivity", "onPause");
        this.sensors.unlisten();
        nativeOnPause();
        Log.d("AllegroActivity", "onPause end");
    }

    public void onRestart() {
        super.onRestart();
        Log.d("AllegroActivity", "onRestart.");
    }

    public void onResume() {
        Log.d("AllegroActivity", "onResume");
        super.onResume();
        this.sensors.listen();
        nativeOnResume();
        reconfigureJoysticks();
        Log.d("AllegroActivity", "onResume end");
    }

    public void onSaveInstanceState(Bundle bundle) {
        Log.d("AllegroActivity", "onSaveInstanceState");
    }

    public void onStart() {
        super.onStart();
        Log.d("AllegroActivity", "onStart");
        this.displayListener = new DisplayManager.DisplayListener() {
            /* class org.liballeg.android.AllegroActivity.AnonymousClass5 */

            public void onDisplayAdded(int i2) {
            }

            public void onDisplayChanged(int i2) {
                this.updateOrientation();
            }

            public void onDisplayRemoved(int i2) {
            }
        };
        Context applicationContext = getApplicationContext();
        getApplicationContext();
        ((DisplayManager) applicationContext.getSystemService("display")).registerDisplayListener(this.displayListener, this.handler);
        nativeOnOrientationChange(getAllegroOrientation(), true);
        Log.d("AllegroActivity", "onStart end");
    }

    public void onStop() {
        super.onStop();
        Log.d("AllegroActivity", "onStop.");
        Context applicationContext = getApplicationContext();
        getApplicationContext();
        ((DisplayManager) applicationContext.getSystemService("display")).unregisterDisplayListener(this.displayListener);
    }

    /* access modifiers changed from: package-private */
    public void postCreateSurface() {
        try {
            Log.d("AllegroActivity", "postCreateSurface");
            this.handler.post(new Runnable() {
                /* class org.liballeg.android.AllegroActivity.AnonymousClass1 */

                public void run() {
                    AllegroActivity.this.createSurface();
                }
            });
        } catch (Exception e2) {
            Log.d("AllegroActivity", "postCreateSurface exception: " + e2.getMessage());
        }
    }

    /* access modifiers changed from: package-private */
    public void postDestroySurface() {
        try {
            Log.d("AllegroActivity", "postDestroySurface");
            this.handler.post(new Runnable() {
                /* class org.liballeg.android.AllegroActivity.AnonymousClass2 */

                public void run() {
                    AllegroActivity.this.destroySurface();
                }
            });
        } catch (Exception e2) {
            Log.d("AllegroActivity", "postDestroySurface exception: " + e2.getMessage());
        }
    }

    /* access modifiers changed from: package-private */
    public void postFinish() {
        this.exitedMain = true;
        try {
            Log.d("AllegroActivity", "posting finish!");
            this.handler.post(new Runnable() {
                /* class org.liballeg.android.AllegroActivity.AnonymousClass3 */

                public void run() {
                    try {
                        AllegroActivity.this.finish();
                        System.exit(0);
                    } catch (Exception e2) {
                        Log.d("AllegroActivity", "inner exception: " + e2.getMessage());
                    }
                }
            });
        } catch (Exception e2) {
            Log.d("AllegroActivity", "exception: " + e2.getMessage());
        }
    }

    /* access modifiers changed from: package-private */
    public void postRunnable(Runnable runnable) {
        try {
            Log.d("AllegroActivity", "postRunnable");
            this.handler.post(runnable);
        } catch (Exception e2) {
            Log.d("AllegroActivity", "postRunnable exception: " + e2.getMessage());
        }
    }

    public void reconfigureJoysticks() {
        this.joysticks.clear();
        int[] deviceIds = InputDevice.getDeviceIds();
        Log.d("AllegroActivity", "Number of input devices: " + deviceIds.length);
        for (int i2 = 0; i2 < deviceIds.length; i2++) {
            if (isJoystick(deviceIds[i2])) {
                this.joysticks.add(Integer.valueOf(deviceIds[i2]));
                StringBuilder sb = new StringBuilder();
                sb.append("Found joystick. Index=");
                sb.append(this.joysticks.size() - 1);
                sb.append(" id=");
                sb.append(deviceIds[i2]);
                Log.d("AllegroActivity", sb.toString());
            }
        }
        this.joystickReconfigureNotified = false;
    }

    public void setAllegroFrameless(final boolean z) {
        if (Build.VERSION.SDK_INT >= 19) {
            runOnUiThread(new Runnable() {
                /* class org.liballeg.android.AllegroActivity.AnonymousClass8 */

                public void run() {
                    View decorView = AllegroActivity.this.getWindow().getDecorView();
                    int systemUiVisibility = decorView.getSystemUiVisibility();
                    decorView.setSystemUiVisibility(z ? systemUiVisibility | 4098 : systemUiVisibility & -4099);
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    public void setAllegroOrientation(int i2) {
        setRequestedOrientation(Const.toAndroidOrientation(i2));
    }

    public boolean setClipboardText(final String str) {
        this.set_clip = false;
        try {
            runOnUiThread(new Runnable() {
                /* class org.liballeg.android.AllegroActivity.AnonymousClass7 */

                public void run() {
                    AllegroActivity allegroActivity = AllegroActivity.this;
                    allegroActivity.set_clip_result = allegroActivity.clipboard.setText(str);
                    AllegroActivity.this.set_clip = true;
                }
            });
        } catch (Exception unused) {
            Log.d("AllegroActivity", "setClipboardText failed");
            this.set_clip_result = false;
            this.set_clip = true;
        }
        do {
        } while (!this.set_clip);
        return this.set_clip_result;
    }

    public void setJoystickActive() {
        this.joystickActive = true;
    }

    public void setJoystickInactive() {
        this.joystickActive = false;
    }

    /* access modifiers changed from: protected */
    public void supersuperOnCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public void updateOrientation() {
        nativeOnOrientationChange(getAllegroOrientation(), false);
    }
}
