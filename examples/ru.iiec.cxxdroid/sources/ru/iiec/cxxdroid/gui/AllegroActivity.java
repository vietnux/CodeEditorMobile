package ru.iiec.cxxdroid.gui;

import android.os.Bundle;

public class AllegroActivity extends org.liballeg.android.AllegroActivity {
    public AllegroActivity() {
        super(null);
    }

    @Override // org.liballeg.android.AllegroActivity
    public void onCreate(Bundle bundle) {
        if (Util.a(getIntent())) {
            try {
                supersuperOnCreate(bundle);
            } catch (Throwable unused) {
            }
            finish();
        }
        for (String str : getIntent().getStringExtra("cxxdroid_gui_preload").split(":")) {
            System.load(str);
        }
        Util.a(getIntent().getStringExtra("cxxdroid_gui_curdir"), getIntent().getStringExtra("cxxdroid_gui_stderrout"), getIntent().getStringArrayExtra("cxxdroid_gui_env"));
        Util.a(getIntent().getStringArrayExtra("cxxdroid_gui_argv"));
        this.userLibName = getIntent().getStringExtra("cxxdroid_gui_executable");
        System.load(this.userLibName);
        super.onCreate(bundle);
    }

    @Override // org.liballeg.android.AllegroActivity
    public void onDestroy() {
        super.onDestroy();
        System.exit(0);
    }
}
