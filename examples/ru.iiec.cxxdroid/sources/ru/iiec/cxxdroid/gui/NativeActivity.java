package ru.iiec.cxxdroid.gui;

import android.os.Bundle;

public class NativeActivity extends android.app.NativeActivity {
    private native void setLibraryName(String str);

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        if (Util.a(getIntent())) {
            try {
                System.loadLibrary("naproxy");
                setLibraryName(getIntent().getStringExtra("cxxdroid_gui_executable") + ".nonexistent.thats.fine/");
                super.onCreate(bundle);
                overridePendingTransition(0, 0);
            } catch (Throwable unused) {
            }
            finish();
            return;
        }
        for (String str : getIntent().getStringExtra("cxxdroid_gui_preload").split(":")) {
            System.load(str);
        }
        Util.a(getIntent().getStringExtra("cxxdroid_gui_curdir"), getIntent().getStringExtra("cxxdroid_gui_stderrout"), getIntent().getStringArrayExtra("cxxdroid_gui_env"));
        if (!getIntent().getBooleanExtra("cxxdroid_gui_backclose", true)) {
            Util.a("CXXDROID_TRAP_BACK_BUTTON", "true");
        }
        Util.a(getIntent().getStringArrayExtra("cxxdroid_gui_argv"));
        System.loadLibrary("naproxy");
        setLibraryName(getIntent().getStringExtra("cxxdroid_gui_executable"));
        try {
            super.onCreate(bundle);
        } catch (Throwable unused2) {
            finish();
        }
    }

    public void onDestroy() {
        super.onDestroy();
        System.exit(0);
    }
}
