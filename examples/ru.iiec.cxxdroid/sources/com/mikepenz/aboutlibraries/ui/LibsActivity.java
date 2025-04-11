package com.mikepenz.aboutlibraries.ui;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.Window;
import androidx.appcompat.app.a;
import androidx.appcompat.app.e;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.y;
import e.c.a.c;
import e.c.a.j;
import e.c.a.k;
import e.c.a.m;
import g.r.d.i;
import java.io.Serializable;

public class LibsActivity extends e {
    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.e, androidx.core.app.f
    public void onCreate(Bundle bundle) {
        boolean z;
        int i2;
        c.a aVar = c.a.DARK;
        Intent intent = getIntent();
        i.a((Object) intent, "intent");
        Bundle extras = intent.getExtras();
        boolean z2 = false;
        if (extras != null) {
            int i3 = extras.getInt("ABOUT_LIBRARIES_THEME", -1);
            if (i3 != -1) {
                setTheme(i3);
                z = true;
            } else {
                z = false;
            }
            String string = extras.getString("ABOUT_LIBRARIES_STYLE");
            if (string != null) {
                aVar = c.a.valueOf(string);
            }
        } else {
            z = false;
        }
        if (!z) {
            if (aVar == c.a.DARK) {
                i2 = m.AboutLibrariesTheme;
            } else if (aVar == c.a.LIGHT) {
                i2 = m.AboutLibrariesTheme_Light;
            } else if (aVar == c.a.LIGHT_DARK_TOOLBAR) {
                i2 = m.AboutLibrariesTheme_Light_DarkToolbar;
            }
            setTheme(i2);
        }
        super.onCreate(bundle);
        setContentView(k.activity_opensource);
        String str = "";
        if (extras != null) {
            str = extras.getString("ABOUT_LIBRARIES_TITLE", str);
            i.a((Object) str, "bundle.getString(Libs.BUNDLE_TITLE, \"\")");
        }
        a aVar2 = new a();
        aVar2.m(extras);
        Toolbar toolbar = (Toolbar) findViewById(j.toolbar);
        if (aVar == c.a.LIGHT_DARK_TOOLBAR) {
            toolbar.setTitleTextColor(-1);
            toolbar.setSubtitleTextColor(-1);
        }
        a(toolbar);
        a p = p();
        if (p != null) {
            if (extras != null && extras.containsKey("ABOUT_COLOR")) {
                Serializable serializable = extras.getSerializable("ABOUT_COLOR");
                if (serializable != null) {
                    e.c.a.p.a aVar3 = (e.c.a.p.a) serializable;
                    p.a(new ColorDrawable(aVar3.b()));
                    if (Build.VERSION.SDK_INT >= 21) {
                        Window window = getWindow();
                        i.a((Object) window, "window");
                        window.setStatusBarColor(aVar3.c());
                    }
                } else {
                    throw new g.k("null cannot be cast to non-null type com.mikepenz.aboutlibraries.util.Colors");
                }
            }
            p.d(true);
            if (str.length() > 0) {
                z2 = true;
            }
            p.e(z2);
            p.b(str);
        }
        y b2 = k().b();
        b2.a(j.frame_container, aVar2);
        b2.a();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        i.d(menuItem, "item");
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        finish();
        return true;
    }
}
