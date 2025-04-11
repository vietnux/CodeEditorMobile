package com.crashlytics.android.c;

import android.annotation.SuppressLint;
import android.content.Context;
import f.a.a.a.n.f.c;
import f.a.a.a.n.f.d;

/* access modifiers changed from: package-private */
public class g {
    private final c a;

    g(c cVar) {
        this.a = cVar;
    }

    public static g a(Context context) {
        return new g(new d(context, "settings"));
    }

    @SuppressLint({"CommitPrefEdits"})
    public boolean a() {
        return this.a.get().getBoolean("analytics_launched", false);
    }

    @SuppressLint({"CommitPrefEdits"})
    public void b() {
        c cVar = this.a;
        cVar.a(cVar.a().putBoolean("analytics_launched", true));
    }
}
