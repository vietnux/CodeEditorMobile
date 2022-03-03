package org.libsdl.app;

import android.content.Context;

public class SDL {
    protected static Context mContext;

    public static Context getContext() {
        return mContext;
    }

    public static void initialize() {
        setContext(null);
        SDLActivity.initialize();
        SDLAudioManager.initialize();
        SDLControllerManager.initialize();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:1|2|3|4|11) */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x006e, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x006f, code lost:
        throw r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0070, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0071, code lost:
        throw r11;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x006a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void loadLibrary(java.lang.String r11) {
        /*
        // Method dump skipped, instructions count: 122
        */
        throw new UnsupportedOperationException("Method not decompiled: org.libsdl.app.SDL.loadLibrary(java.lang.String):void");
    }

    public static void setContext(Context context) {
        mContext = context;
    }

    public static void setupJNI() {
        SDLActivity.nativeSetupJNI();
        SDLAudioManager.nativeSetupJNI();
        SDLControllerManager.nativeSetupJNI();
    }
}
