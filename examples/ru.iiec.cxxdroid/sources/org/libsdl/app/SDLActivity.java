package org.libsdl.app;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.InputDevice;
import android.view.KeyEvent;
import android.view.PointerIcon;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Hashtable;

public class SDLActivity extends Activity implements View.OnSystemUiVisibilityChangeListener {
    protected static final int COMMAND_USER = 32768;
    protected static final int SDL_ORIENTATION_LANDSCAPE = 1;
    protected static final int SDL_ORIENTATION_LANDSCAPE_FLIPPED = 2;
    protected static final int SDL_ORIENTATION_PORTRAIT = 3;
    protected static final int SDL_ORIENTATION_PORTRAIT_FLIPPED = 4;
    protected static final int SDL_ORIENTATION_UNKNOWN = 0;
    private static final int SDL_SYSTEM_CURSOR_ARROW = 0;
    private static final int SDL_SYSTEM_CURSOR_CROSSHAIR = 3;
    private static final int SDL_SYSTEM_CURSOR_HAND = 11;
    private static final int SDL_SYSTEM_CURSOR_IBEAM = 1;
    private static final int SDL_SYSTEM_CURSOR_NO = 10;
    private static final int SDL_SYSTEM_CURSOR_NONE = -1;
    private static final int SDL_SYSTEM_CURSOR_SIZEALL = 9;
    private static final int SDL_SYSTEM_CURSOR_SIZENESW = 6;
    private static final int SDL_SYSTEM_CURSOR_SIZENS = 8;
    private static final int SDL_SYSTEM_CURSOR_SIZENWSE = 5;
    private static final int SDL_SYSTEM_CURSOR_SIZEWE = 7;
    private static final int SDL_SYSTEM_CURSOR_WAIT = 2;
    private static final int SDL_SYSTEM_CURSOR_WAITARROW = 4;
    private static final String TAG = "SDL";
    private static Object expansionFile;
    private static Method expansionFileMethod;
    public static boolean mBrokenLibraries;
    protected static SDLClipboardHandler mClipboardHandler;
    public static NativeState mCurrentNativeState;
    protected static int mCurrentOrientation;
    protected static Hashtable<Integer, PointerIcon> mCursors;
    protected static boolean mFullscreenModeActive;
    protected static HIDDeviceManager mHIDDeviceManager;
    public static boolean mHasFocus;
    public static final boolean mHasMultiWindow = (Build.VERSION.SDK_INT >= 24);
    public static boolean mIsResumedCalled;
    protected static int mLastCursorID;
    protected static ViewGroup mLayout;
    protected static SDLGenericMotionListener_API12 mMotionListener;
    public static NativeState mNextNativeState;
    protected static Thread mSDLThread;
    protected static boolean mScreenKeyboardShown;
    protected static SDLActivity mSingleton;
    protected static SDLSurface mSurface;
    protected static View mTextEdit;

    /* renamed from: b  reason: collision with root package name */
    Handler f9584b = new SDLCommandHandler();
    protected int dialogs = 0;
    protected final int[] messageboxSelection = new int[1];
    private final Runnable rehideSystemUi = new Runnable() {
        /* class org.libsdl.app.SDLActivity.AnonymousClass7 */

        public void run() {
            SDLActivity.this.getWindow().getDecorView().setSystemUiVisibility(5894);
        }
    };

    public enum NativeState {
        INIT,
        RESUMED,
        PAUSED
    }

    protected static class SDLCommandHandler extends Handler {
        protected SDLCommandHandler() {
        }

        public void handleMessage(Message message) {
            SurfaceHolder holder;
            Window window;
            Context context = SDL.getContext();
            if (context == null) {
                Log.e(SDLActivity.TAG, "error handling message, getContext() returned null");
                return;
            }
            int i2 = message.arg1;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        int i3 = 4;
                        if (i2 == 4) {
                            int intValue = ((Integer) message.obj).intValue();
                            SDLSurface sDLSurface = SDLActivity.mSurface;
                            if (sDLSurface != null && (holder = sDLSurface.getHolder()) != null) {
                                if (intValue == 1) {
                                    i3 = 1;
                                } else if (intValue == 2) {
                                    i3 = 2;
                                }
                                holder.setFormat(i3);
                                return;
                            }
                            return;
                        } else if (i2 != 5) {
                            if ((context instanceof SDLActivity) && !((SDLActivity) context).onUnhandledMessage(i2, message.obj)) {
                                Log.e(SDLActivity.TAG, "error handling message, command is " + message.arg1);
                                return;
                            }
                            return;
                        } else if ((context instanceof Activity) && (window = ((Activity) context).getWindow()) != null) {
                            Object obj = message.obj;
                            if (!(obj instanceof Integer) || ((Integer) obj).intValue() == 0) {
                                window.clearFlags(128);
                                return;
                            } else {
                                window.addFlags(128);
                                return;
                            }
                        } else {
                            return;
                        }
                    } else {
                        View view = SDLActivity.mTextEdit;
                        if (view != null) {
                            view.setLayoutParams(new RelativeLayout.LayoutParams(0, 0));
                            ((InputMethodManager) context.getSystemService("input_method")).hideSoftInputFromWindow(SDLActivity.mTextEdit.getWindowToken(), 0);
                            SDLActivity.mScreenKeyboardShown = false;
                            return;
                        }
                        return;
                    }
                } else if (Build.VERSION.SDK_INT >= 19) {
                    if (context instanceof Activity) {
                        Window window2 = ((Activity) context).getWindow();
                        if (window2 != null) {
                            Object obj2 = message.obj;
                            if (!(obj2 instanceof Integer) || ((Integer) obj2).intValue() == 0) {
                                window2.getDecorView().setSystemUiVisibility(256);
                                window2.addFlags(2048);
                                window2.clearFlags(1024);
                                SDLActivity.mFullscreenModeActive = false;
                                return;
                            }
                            window2.getDecorView().setSystemUiVisibility(5894);
                            window2.addFlags(1024);
                            window2.clearFlags(2048);
                            SDLActivity.mFullscreenModeActive = true;
                            return;
                        }
                        return;
                    }
                } else {
                    return;
                }
            } else if (context instanceof Activity) {
                ((Activity) context).setTitle((String) message.obj);
                return;
            }
            Log.e(SDLActivity.TAG, "error handling message, getContext() returned no Activity");
        }
    }

    static class ShowTextInputTask implements Runnable {

        /* renamed from: h  reason: collision with root package name */
        public int f9594h;
        public int w;
        public int x;
        public int y;

        public ShowTextInputTask(int i2, int i3, int i4, int i5) {
            this.x = i2;
            this.y = i3;
            this.w = i4;
            this.f9594h = i5;
            if (this.w <= 0) {
                this.w = 1;
            }
            if (this.f9594h + 15 <= 0) {
                this.f9594h = -14;
            }
        }

        public void run() {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(this.w, this.f9594h + 15);
            layoutParams.leftMargin = this.x;
            layoutParams.topMargin = this.y;
            View view = SDLActivity.mTextEdit;
            if (view == null) {
                SDLActivity.mTextEdit = new DummyEdit(SDL.getContext());
                SDLActivity.mLayout.addView(SDLActivity.mTextEdit, layoutParams);
            } else {
                view.setLayoutParams(layoutParams);
            }
            SDLActivity.mTextEdit.setVisibility(0);
            SDLActivity.mTextEdit.requestFocus();
            ((InputMethodManager) SDL.getContext().getSystemService("input_method")).showSoftInput(SDLActivity.mTextEdit, 0);
            SDLActivity.mScreenKeyboardShown = true;
        }
    }

    public static String clipboardGetText() {
        return mClipboardHandler.clipboardGetText();
    }

    public static boolean clipboardHasText() {
        return mClipboardHandler.clipboardHasText();
    }

    public static void clipboardSetText(String str) {
        mClipboardHandler.clipboardSetText(str);
    }

    public static int createCustomCursor(int[] iArr, int i2, int i3, int i4, int i5) {
        Bitmap createBitmap = Bitmap.createBitmap(iArr, i2, i3, Bitmap.Config.ARGB_8888);
        mLastCursorID++;
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                mCursors.put(Integer.valueOf(mLastCursorID), PointerIcon.create(createBitmap, (float) i4, (float) i5));
                return mLastCursorID;
            } catch (Exception unused) {
            }
        }
        return 0;
    }

    public static View getContentView() {
        return mLayout;
    }

    public static Context getContext() {
        return SDL.getContext();
    }

    public static int getCurrentOrientation() {
        int rotation = ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay().getRotation();
        if (rotation == 0) {
            return 3;
        }
        if (rotation == 1) {
            return 1;
        }
        if (rotation != 2) {
            return rotation != 3 ? 0 : 2;
        }
        return 4;
    }

    public static DisplayMetrics getDisplayDPI() {
        return getContext().getResources().getDisplayMetrics();
    }

    public static boolean getManifestEnvironmentVariables() {
        try {
            Bundle bundle = getContext().getPackageManager().getApplicationInfo(getContext().getPackageName(), 128).metaData;
            if (bundle == null) {
                return false;
            }
            for (String str : bundle.keySet()) {
                if (str.startsWith("SDL_ENV.")) {
                    nativeSetenv(str.substring(8), bundle.get(str).toString());
                }
            }
            return true;
        } catch (Exception e2) {
            Log.v(TAG, "exception " + e2.toString());
            return false;
        }
    }

    protected static SDLGenericMotionListener_API12 getMotionListener() {
        if (mMotionListener == null) {
            int i2 = Build.VERSION.SDK_INT;
            mMotionListener = i2 >= 26 ? new SDLGenericMotionListener_API26() : i2 >= 24 ? new SDLGenericMotionListener_API24() : new SDLGenericMotionListener_API12();
        }
        return mMotionListener;
    }

    public static Surface getNativeSurface() {
        SDLSurface sDLSurface = mSurface;
        if (sDLSurface == null) {
            return null;
        }
        return sDLSurface.getNativeSurface();
    }

    public static void handleNativeState() {
        NativeState nativeState = mNextNativeState;
        if (nativeState != mCurrentNativeState) {
            if (nativeState != NativeState.INIT) {
                if (mNextNativeState == NativeState.PAUSED) {
                    if (mSDLThread != null) {
                        nativePause();
                    }
                    SDLSurface sDLSurface = mSurface;
                    if (sDLSurface != null) {
                        sDLSurface.handlePause();
                    }
                } else if (mNextNativeState == NativeState.RESUMED && mSurface.mIsSurfaceReady && mHasFocus && mIsResumedCalled) {
                    if (mSDLThread == null) {
                        mSDLThread = new Thread(new SDLMain(), "SDLThread");
                        mSurface.enableSensor(1, true);
                        mSDLThread.start();
                    } else {
                        nativeResume();
                    }
                    mSurface.handleResume();
                    mCurrentNativeState = mNextNativeState;
                    return;
                } else {
                    return;
                }
            }
            mCurrentNativeState = mNextNativeState;
        }
    }

    public static void initTouch() {
        int[] deviceIds;
        for (int i2 : InputDevice.getDeviceIds()) {
            InputDevice device = InputDevice.getDevice(i2);
            if (!(device == null || (device.getSources() & 4098) == 0)) {
                nativeAddTouch(device.getId(), device.getName());
            }
        }
    }

    public static void initialize() {
        mSingleton = null;
        mSurface = null;
        mTextEdit = null;
        mLayout = null;
        mClipboardHandler = null;
        mCursors = new Hashtable<>();
        mLastCursorID = 0;
        mSDLThread = null;
        mBrokenLibraries = false;
        mIsResumedCalled = false;
        mHasFocus = true;
        NativeState nativeState = NativeState.INIT;
        mNextNativeState = nativeState;
        mCurrentNativeState = nativeState;
    }

    public static boolean isAndroidTV() {
        if (((UiModeManager) getContext().getSystemService("uimode")).getCurrentModeType() == 4) {
            return true;
        }
        if (!Build.MANUFACTURER.equals("MINIX") || !Build.MODEL.equals("NEO-U1")) {
            return Build.MANUFACTURER.equals("Amlogic") && Build.MODEL.equals("X96-W");
        }
        return true;
    }

    public static boolean isChromebook() {
        return getContext().getPackageManager().hasSystemFeature("org.chromium.arc.device_management");
    }

    public static boolean isDeXMode() {
        if (Build.VERSION.SDK_INT < 24) {
            return false;
        }
        try {
            Configuration configuration = getContext().getResources().getConfiguration();
            Class<?> cls = configuration.getClass();
            return cls.getField("SEM_DESKTOP_MODE_ENABLED").getInt(cls) == cls.getField("semDesktopModeEnabled").getInt(configuration);
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean isScreenKeyboardShown() {
        if (mTextEdit != null && mScreenKeyboardShown) {
            return ((InputMethodManager) SDL.getContext().getSystemService("input_method")).isAcceptingText();
        }
        return false;
    }

    public static boolean isTablet() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((Activity) getContext()).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        double d2 = ((double) displayMetrics.widthPixels) / ((double) displayMetrics.xdpi);
        double d3 = ((double) displayMetrics.heightPixels) / ((double) displayMetrics.ydpi);
        return Math.sqrt((d2 * d2) + (d3 * d3)) >= 7.0d;
    }

    public static boolean isTextInputEvent(KeyEvent keyEvent) {
        if (keyEvent.isCtrlPressed()) {
            return false;
        }
        return keyEvent.isPrintingKey() || keyEvent.getKeyCode() == 62;
    }

    public static void manualBackButton() {
        mSingleton.pressBackButton();
    }

    public static void minimizeWindow() {
        if (mSingleton != null) {
            Intent intent = new Intent("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.HOME");
            intent.setFlags(268435456);
            mSingleton.startActivity(intent);
        }
    }

    public static native void nativeAddTouch(int i2, String str);

    public static native void nativeFocusChanged(boolean z);

    public static native String nativeGetHint(String str);

    public static native void nativeLowMemory();

    public static native void nativePause();

    public static native void nativeQuit();

    public static native void nativeResume();

    public static native int nativeRunMain(String str, String str2, Object obj);

    public static native void nativeSendQuit();

    public static native void nativeSetScreenResolution(int i2, int i3, int i4, int i5, int i6, float f2);

    public static native void nativeSetenv(String str, String str2);

    public static native int nativeSetupJNI();

    public static native void onNativeAccel(float f2, float f3, float f4);

    public static native void onNativeClipboardChanged();

    public static native void onNativeDropFile(String str);

    public static native void onNativeKeyDown(int i2);

    public static native void onNativeKeyUp(int i2);

    public static native void onNativeKeyboardFocusLost();

    public static native void onNativeMouse(int i2, int i3, float f2, float f3, boolean z);

    public static native void onNativeOrientationChanged(int i2);

    public static native void onNativeResize();

    public static native boolean onNativeSoftReturnKey();

    public static native void onNativeSurfaceChanged();

    public static native void onNativeSurfaceCreated();

    public static native void onNativeSurfaceDestroyed();

    public static native void onNativeTouch(int i2, int i3, int i4, float f2, float f3, float f4);

    public static InputStream openAPKExpansionInputStream(String str) {
        String nativeGetHint;
        if (expansionFile == null) {
            String nativeGetHint2 = nativeGetHint("SDL_ANDROID_APK_EXPANSION_MAIN_FILE_VERSION");
            if (nativeGetHint2 == null || (nativeGetHint = nativeGetHint("SDL_ANDROID_APK_EXPANSION_PATCH_FILE_VERSION")) == null) {
                return null;
            }
            try {
                try {
                    expansionFile = Class.forName("com.android.vending.expansion.zipfile.APKExpansionSupport").getMethod("getAPKExpansionZipFile", Context.class, Integer.TYPE, Integer.TYPE).invoke(null, SDL.getContext(), Integer.valueOf(nativeGetHint2), Integer.valueOf(nativeGetHint));
                    expansionFileMethod = expansionFile.getClass().getMethod("getInputStream", String.class);
                } catch (Exception e2) {
                    e2.printStackTrace();
                    expansionFile = null;
                    expansionFileMethod = null;
                    throw new IOException("Could not access APK expansion support library", e2);
                }
            } catch (NumberFormatException e3) {
                e3.printStackTrace();
                throw new IOException("No valid file versions set for APK expansion files", e3);
            }
        }
        try {
            InputStream inputStream = (InputStream) expansionFileMethod.invoke(expansionFile, str);
            if (inputStream != null) {
                return inputStream;
            }
            throw new IOException("Could not find path in APK expansion file");
        } catch (Exception e4) {
            e4.printStackTrace();
            throw new IOException("Could not open stream from APK expansion file", e4);
        }
    }

    public static boolean sendMessage(int i2, int i3) {
        SDLActivity sDLActivity = mSingleton;
        if (sDLActivity == null) {
            return false;
        }
        return sDLActivity.a(i2, Integer.valueOf(i3));
    }

    public static boolean setActivityTitle(String str) {
        return mSingleton.a(1, str);
    }

    public static boolean setCustomCursor(int i2) {
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                mSurface.setPointerIcon(mCursors.get(Integer.valueOf(i2)));
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public static void setOrientation(int i2, int i3, boolean z, String str) {
        SDLActivity sDLActivity = mSingleton;
        if (sDLActivity != null) {
            sDLActivity.setOrientationBis(i2, i3, z, str);
        }
    }

    public static boolean setRelativeMouseEnabled(boolean z) {
        if (!z || supportsRelativeMouse()) {
            return getMotionListener().setRelativeMouseEnabled(z);
        }
        return false;
    }

    public static void setSurfaceViewFormat(int i2) {
        mSingleton.a(4, Integer.valueOf(i2));
    }

    public static boolean setSystemCursor(int i2) {
        int i3 = 1004;
        switch (i2) {
            case 0:
                i3 = 1000;
                break;
            case 1:
                i3 = 1008;
                break;
            case 2:
            case 4:
                break;
            case 3:
                i3 = 1007;
                break;
            case 5:
                i3 = 1017;
                break;
            case 6:
                i3 = 1016;
                break;
            case 7:
                i3 = 1014;
                break;
            case 8:
                i3 = 1015;
                break;
            case 9:
                i3 = 1020;
                break;
            case 10:
                i3 = 1012;
                break;
            case 11:
                i3 = 1002;
                break;
            default:
                i3 = 0;
                break;
        }
        if (Build.VERSION.SDK_INT < 24) {
            return true;
        }
        try {
            mSurface.setPointerIcon(PointerIcon.getSystemIcon(SDL.getContext(), i3));
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static void setWindowStyle(boolean z) {
        mSingleton.a(2, Integer.valueOf(z ? 1 : 0));
    }

    public static boolean shouldMinimizeOnFocusLoss() {
        return false;
    }

    public static boolean showTextInput(int i2, int i3, int i4, int i5) {
        return mSingleton.f9584b.post(new ShowTextInputTask(i2, i3, i4, i5));
    }

    public static boolean supportsRelativeMouse() {
        if (isChromebook()) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 27 || !isDeXMode()) {
            return getMotionListener().supportsRelativeMouse();
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean a(int i2, Object obj) {
        Message obtainMessage = this.f9584b.obtainMessage();
        obtainMessage.arg1 = i2;
        obtainMessage.obj = obj;
        boolean sendMessage = this.f9584b.sendMessage(obtainMessage);
        if (Build.VERSION.SDK_INT >= 19 && i2 == 2) {
            boolean z = false;
            if (obj instanceof Integer) {
                Display defaultDisplay = ((WindowManager) getSystemService("window")).getDefaultDisplay();
                DisplayMetrics displayMetrics = new DisplayMetrics();
                defaultDisplay.getRealMetrics(displayMetrics);
                if (displayMetrics.widthPixels == mSurface.getWidth() && displayMetrics.heightPixels == mSurface.getHeight()) {
                    z = true;
                }
                if (((Integer) obj).intValue() == 1) {
                    z = !z;
                }
            }
            if (z) {
                synchronized (getContext()) {
                    try {
                        getContext().wait(500);
                    } catch (InterruptedException e2) {
                        e2.printStackTrace();
                    }
                }
            }
        }
        return sendMessage;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode;
        if (mBrokenLibraries || (keyCode = keyEvent.getKeyCode()) == 25 || keyCode == 24 || keyCode == 27 || keyCode == 168 || keyCode == 169) {
            return false;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    /* access modifiers changed from: protected */
    public String[] getArguments() {
        return new String[0];
    }

    /* access modifiers changed from: protected */
    public String[] getLibraries() {
        return new String[]{"hidapi", "SDL2", "main"};
    }

    /* access modifiers changed from: protected */
    public String getMainFunction() {
        return "SDL_main";
    }

    /* access modifiers changed from: protected */
    public String getMainSharedObject() {
        String str;
        String[] libraries = mSingleton.getLibraries();
        if (libraries.length > 0) {
            str = "lib" + libraries[libraries.length + SDL_SYSTEM_CURSOR_NONE] + ".so";
        } else {
            str = "libmain.so";
        }
        return getContext().getApplicationInfo().nativeLibraryDir + "/" + str;
    }

    public void loadLibraries() {
        for (String str : getLibraries()) {
            SDL.loadLibrary(str);
        }
    }

    public int messageboxShowMessageBox(int i2, String str, String str2, int[] iArr, int[] iArr2, String[] strArr, int[] iArr3) {
        this.messageboxSelection[0] = SDL_SYSTEM_CURSOR_NONE;
        if (iArr.length != iArr2.length && iArr2.length != strArr.length) {
            return SDL_SYSTEM_CURSOR_NONE;
        }
        final Bundle bundle = new Bundle();
        bundle.putInt("flags", i2);
        bundle.putString("title", str);
        bundle.putString("message", str2);
        bundle.putIntArray("buttonFlags", iArr);
        bundle.putIntArray("buttonIds", iArr2);
        bundle.putStringArray("buttonTexts", strArr);
        bundle.putIntArray("colors", iArr3);
        runOnUiThread(new Runnable() {
            /* class org.libsdl.app.SDLActivity.AnonymousClass3 */

            public void run() {
                SDLActivity sDLActivity = SDLActivity.this;
                int i2 = sDLActivity.dialogs;
                sDLActivity.dialogs = i2 + 1;
                sDLActivity.showDialog(i2, bundle);
            }
        });
        synchronized (this.messageboxSelection) {
            try {
                this.messageboxSelection.wait();
            } catch (InterruptedException e2) {
                e2.printStackTrace();
                return SDL_SYSTEM_CURSOR_NONE;
            }
        }
        return this.messageboxSelection[0];
    }

    public void onBackPressed() {
        String nativeGetHint = nativeGetHint("SDL_ANDROID_TRAP_BACK_BUTTON");
        if (nativeGetHint == null || !nativeGetHint.equals("1")) {
            super.onBackPressed();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        String str;
        String path;
        Log.v(TAG, "Device: " + Build.DEVICE);
        Log.v(TAG, "Model: " + Build.MODEL);
        Log.v(TAG, "onCreate()");
        super.onCreate(bundle);
        try {
            Thread.currentThread().setName("SDLActivity");
        } catch (Exception e2) {
            Log.v(TAG, "modify thread properties failed " + e2.toString());
        }
        try {
            loadLibraries();
            str = "";
        } catch (UnsatisfiedLinkError e3) {
            System.err.println(e3.getMessage());
            mBrokenLibraries = true;
            str = e3.getMessage();
        } catch (Exception e4) {
            System.err.println(e4.getMessage());
            mBrokenLibraries = true;
            str = e4.getMessage();
        }
        if (mBrokenLibraries) {
            mSingleton = this;
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("An error occurred while trying to start the application. Please try again and/or reinstall." + System.getProperty("line.separator") + System.getProperty("line.separator") + "Error: " + str);
            builder.setTitle("SDL Error");
            builder.setPositiveButton("Exit", new DialogInterface.OnClickListener(this) {
                /* class org.libsdl.app.SDLActivity.AnonymousClass1 */

                public void onClick(DialogInterface dialogInterface, int i2) {
                    SDLActivity.mSingleton.finish();
                }
            });
            builder.setCancelable(false);
            builder.create().show();
            return;
        }
        SDL.setupJNI();
        SDL.initialize();
        mSingleton = this;
        SDL.setContext(this);
        mClipboardHandler = new SDLClipboardHandler_API11();
        mSurface = new SDLSurface(getApplication());
        mLayout = new RelativeLayout(this);
        mLayout.addView(mSurface);
        mCurrentOrientation = getCurrentOrientation();
        onNativeOrientationChanged(mCurrentOrientation);
        setContentView(mLayout);
        setWindowStyle(false);
        getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(this);
        Intent intent = getIntent();
        if (intent != null && intent.getData() != null && (path = intent.getData().getPath()) != null) {
            Log.v(TAG, "Got filename: " + path);
            onNativeDropFile(path);
        }
    }

    /* access modifiers changed from: protected */
    public Dialog onCreateDialog(int i2, Bundle bundle) {
        int i3;
        int i4;
        int i5;
        int[] intArray = bundle.getIntArray("colors");
        if (intArray != null) {
            i5 = intArray[0];
            i4 = intArray[1];
            int i6 = intArray[2];
            i3 = intArray[3];
            int i7 = intArray[4];
        } else {
            i5 = 0;
            i4 = 0;
            i3 = 0;
        }
        final Dialog dialog = new Dialog(this);
        dialog.setTitle(bundle.getString("title"));
        dialog.setCancelable(false);
        dialog.setOnDismissListener(new DialogInterface.OnDismissListener() {
            /* class org.libsdl.app.SDLActivity.AnonymousClass4 */

            public void onDismiss(DialogInterface dialogInterface) {
                synchronized (SDLActivity.this.messageboxSelection) {
                    SDLActivity.this.messageboxSelection.notify();
                }
            }
        });
        TextView textView = new TextView(this);
        textView.setGravity(17);
        textView.setText(bundle.getString("message"));
        if (i4 != 0) {
            textView.setTextColor(i4);
        }
        int[] intArray2 = bundle.getIntArray("buttonFlags");
        int[] intArray3 = bundle.getIntArray("buttonIds");
        String[] stringArray = bundle.getStringArray("buttonTexts");
        final SparseArray sparseArray = new SparseArray();
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        for (int i8 = 0; i8 < stringArray.length; i8++) {
            Button button = new Button(this);
            final int i9 = intArray3[i8];
            button.setOnClickListener(new View.OnClickListener() {
                /* class org.libsdl.app.SDLActivity.AnonymousClass5 */

                public void onClick(View view) {
                    SDLActivity.this.messageboxSelection[0] = i9;
                    dialog.dismiss();
                }
            });
            if (intArray2[i8] != 0) {
                if ((intArray2[i8] & 1) != 0) {
                    sparseArray.put(66, button);
                }
                if ((intArray2[i8] & 2) != 0) {
                    sparseArray.put(111, button);
                }
            }
            button.setText(stringArray[i8]);
            if (i4 != 0) {
                button.setTextColor(i4);
            }
            if (i3 != 0) {
                Drawable background = button.getBackground();
                if (background == null) {
                    button.setBackgroundColor(i3);
                } else {
                    background.setColorFilter(i3, PorterDuff.Mode.MULTIPLY);
                }
            }
            linearLayout.addView(button);
        }
        LinearLayout linearLayout2 = new LinearLayout(this);
        linearLayout2.setOrientation(1);
        linearLayout2.addView(textView);
        linearLayout2.addView(linearLayout);
        if (i5 != 0) {
            linearLayout2.setBackgroundColor(i5);
        }
        dialog.setContentView(linearLayout2);
        dialog.setOnKeyListener(new DialogInterface.OnKeyListener(this) {
            /* class org.libsdl.app.SDLActivity.AnonymousClass6 */

            public boolean onKey(DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
                Button button = (Button) sparseArray.get(i2);
                if (button == null) {
                    return false;
                }
                if (keyEvent.getAction() == 1) {
                    button.performClick();
                }
                return true;
            }
        });
        return dialog;
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        Log.v(TAG, "onDestroy()");
        HIDDeviceManager hIDDeviceManager = mHIDDeviceManager;
        if (hIDDeviceManager != null) {
            HIDDeviceManager.release(hIDDeviceManager);
            mHIDDeviceManager = null;
        }
        if (mBrokenLibraries) {
            super.onDestroy();
            return;
        }
        if (mSDLThread != null) {
            nativeSendQuit();
            try {
                mSDLThread.join();
            } catch (Exception e2) {
                Log.v(TAG, "Problem stopping SDLThread: " + e2);
            }
        }
        nativeQuit();
        super.onDestroy();
    }

    public void onLowMemory() {
        Log.v(TAG, "onLowMemory()");
        super.onLowMemory();
        if (!mBrokenLibraries) {
            nativeLowMemory();
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        Log.v(TAG, "onPause()");
        super.onPause();
        if (!mHasMultiWindow) {
            pauseNativeThread();
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        Log.v(TAG, "onResume()");
        super.onResume();
        if (!mHasMultiWindow) {
            resumeNativeThread();
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        Log.v(TAG, "onStart()");
        super.onStart();
        if (mHasMultiWindow) {
            resumeNativeThread();
        }
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        Log.v(TAG, "onStop()");
        super.onStop();
        if (mHasMultiWindow) {
            pauseNativeThread();
        }
    }

    public void onSystemUiVisibilityChange(int i2) {
        Handler handler;
        if (!mFullscreenModeActive) {
            return;
        }
        if (((i2 & 4) == 0 || (i2 & 2) == 0) && (handler = getWindow().getDecorView().getHandler()) != null) {
            handler.removeCallbacks(this.rehideSystemUi);
            handler.postDelayed(this.rehideSystemUi, 2000);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onUnhandledMessage(int i2, Object obj) {
        return false;
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        Log.v(TAG, "onWindowFocusChanged(): " + z);
        if (!mBrokenLibraries) {
            mHasFocus = z;
            if (z) {
                mNextNativeState = NativeState.RESUMED;
                getMotionListener().reclaimRelativeMouseModeIfNeeded();
                handleNativeState();
                nativeFocusChanged(true);
                return;
            }
            nativeFocusChanged(false);
            if (!mHasMultiWindow) {
                mNextNativeState = NativeState.PAUSED;
                handleNativeState();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void pauseNativeThread() {
        mNextNativeState = NativeState.PAUSED;
        mIsResumedCalled = false;
        if (!mBrokenLibraries) {
            HIDDeviceManager hIDDeviceManager = mHIDDeviceManager;
            if (hIDDeviceManager != null) {
                hIDDeviceManager.setFrozen(true);
            }
            handleNativeState();
        }
    }

    public void pressBackButton() {
        runOnUiThread(new Runnable() {
            /* class org.libsdl.app.SDLActivity.AnonymousClass2 */

            public void run() {
                SDLActivity.this.superOnBackPressed();
            }
        });
    }

    /* access modifiers changed from: protected */
    public void resumeNativeThread() {
        mNextNativeState = NativeState.RESUMED;
        mIsResumedCalled = true;
        if (!mBrokenLibraries) {
            HIDDeviceManager hIDDeviceManager = mHIDDeviceManager;
            if (hIDDeviceManager != null) {
                hIDDeviceManager.setFrozen(false);
            }
            handleNativeState();
        }
    }

    public void setOrientationBis(int i2, int i3, boolean z, String str) {
        int i4 = (!str.contains("LandscapeRight") || !str.contains("LandscapeLeft")) ? str.contains("LandscapeRight") ? 0 : str.contains("LandscapeLeft") ? 8 : (!str.contains("Portrait") || !str.contains("PortraitUpsideDown")) ? str.contains("Portrait") ? 1 : str.contains("PortraitUpsideDown") ? 9 : SDL_SYSTEM_CURSOR_NONE : 7 : 6;
        if (i4 == SDL_SYSTEM_CURSOR_NONE && !z) {
            i4 = i2 > i3 ? 6 : 7;
        }
        Log.v(TAG, "setOrientation() orientation=" + i4 + " width=" + i2 + " height=" + i3 + " resizable=" + z + " hint=" + str);
        if (i4 != SDL_SYSTEM_CURSOR_NONE) {
            mSingleton.setRequestedOrientation(i4);
        }
    }

    public void superOnBackPressed() {
        super.onBackPressed();
    }

    /* access modifiers changed from: protected */
    public void supersuperOnCreate(Bundle bundle) {
        super.onCreate(bundle);
    }
}
