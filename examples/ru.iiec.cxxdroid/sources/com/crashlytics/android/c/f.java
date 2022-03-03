package com.crashlytics.android.c;

import android.app.Activity;
import android.os.Bundle;
import com.crashlytics.android.c.a0;
import f.a.a.a.a;

/* access modifiers changed from: package-private */
public class f extends a.b {
    private final y a;

    /* renamed from: b  reason: collision with root package name */
    private final j f2844b;

    public f(y yVar, j jVar) {
        this.a = yVar;
        this.f2844b = jVar;
    }

    @Override // f.a.a.a.a.b
    public void a(Activity activity) {
    }

    @Override // f.a.a.a.a.b
    public void a(Activity activity, Bundle bundle) {
    }

    @Override // f.a.a.a.a.b
    public void b(Activity activity) {
        this.a.a(activity, a0.c.PAUSE);
        this.f2844b.a();
    }

    @Override // f.a.a.a.a.b
    public void b(Activity activity, Bundle bundle) {
    }

    @Override // f.a.a.a.a.b
    public void c(Activity activity) {
        this.a.a(activity, a0.c.RESUME);
        this.f2844b.b();
    }

    @Override // f.a.a.a.a.b
    public void d(Activity activity) {
        this.a.a(activity, a0.c.START);
    }

    @Override // f.a.a.a.a.b
    public void e(Activity activity) {
        this.a.a(activity, a0.c.STOP);
    }
}
