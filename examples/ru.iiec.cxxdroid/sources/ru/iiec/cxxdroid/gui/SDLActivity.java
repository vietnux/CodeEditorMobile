package ru.iiec.cxxdroid.gui;

import android.os.Bundle;

public class SDLActivity extends org.libsdl.app.SDLActivity {
    /* access modifiers changed from: protected */
    @Override // org.libsdl.app.SDLActivity
    public String[] getArguments() {
        return getIntent().getStringArrayExtra("cxxdroid_gui_argv");
    }

    /* access modifiers changed from: protected */
    @Override // org.libsdl.app.SDLActivity
    public String[] getLibraries() {
        return null;
    }

    /* access modifiers changed from: protected */
    @Override // org.libsdl.app.SDLActivity
    public String getMainSharedObject() {
        return getIntent().getStringExtra("cxxdroid_gui_executable");
    }

    @Override // org.libsdl.app.SDLActivity
    public void loadLibraries() {
        for (String str : getIntent().getStringExtra("cxxdroid_gui_preload").split(":")) {
            System.load(str);
        }
        Util.a(getIntent().getStringExtra("cxxdroid_gui_curdir"), getIntent().getStringExtra("cxxdroid_gui_stderrout"), getIntent().getStringArrayExtra("cxxdroid_gui_env"));
        if (!getIntent().getBooleanExtra("cxxdroid_gui_backclose", true)) {
            Util.a("SDL_ANDROID_TRAP_BACK_BUTTON", "1");
        }
        System.load(getIntent().getStringExtra("cxxdroid_gui_executable"));
    }

    /* access modifiers changed from: protected */
    @Override // org.libsdl.app.SDLActivity
    public void onCreate(Bundle bundle) {
        if (Util.a(getIntent())) {
            try {
                supersuperOnCreate(bundle);
            } catch (Throwable unused) {
            }
            finish();
        }
        super.onCreate(bundle);
    }

    @Override // org.libsdl.app.SDLActivity
    public void onDestroy() {
        super.onDestroy();
        System.exit(0);
    }

    @Override // org.libsdl.app.SDLActivity
    public void setOrientationBis(int i2, int i3, boolean z, String str) {
    }
}
