package com.crashlytics.android.e;

import android.annotation.SuppressLint;
import f.a.a.a.n.f.c;
import f.a.a.a.n.f.d;

/* access modifiers changed from: package-private */
@SuppressLint({"CommitPrefEdits"})
public class j0 {
    private final c a;

    /* renamed from: b  reason: collision with root package name */
    private final l f2928b;

    public j0(c cVar, l lVar) {
        this.a = cVar;
        this.f2928b = lVar;
    }

    public static j0 a(c cVar, l lVar) {
        return new j0(cVar, lVar);
    }

    /* access modifiers changed from: package-private */
    public void a(boolean z) {
        c cVar = this.a;
        cVar.a(cVar.a().putBoolean("always_send_reports_opt_in", z));
    }

    /* access modifiers changed from: package-private */
    public boolean a() {
        if (!this.a.get().contains("preferences_migration_complete")) {
            d dVar = new d(this.f2928b);
            if (!this.a.get().contains("always_send_reports_opt_in") && dVar.get().contains("always_send_reports_opt_in")) {
                boolean z = dVar.get().getBoolean("always_send_reports_opt_in", false);
                c cVar = this.a;
                cVar.a(cVar.a().putBoolean("always_send_reports_opt_in", z));
            }
            c cVar2 = this.a;
            cVar2.a(cVar2.a().putBoolean("preferences_migration_complete", true));
        }
        return this.a.get().getBoolean("always_send_reports_opt_in", false);
    }
}
