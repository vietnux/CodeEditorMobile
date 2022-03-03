package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import c.h.d.a;
import c.h.k.h;

public abstract class k<E> extends g {

    /* renamed from: b  reason: collision with root package name */
    private final Activity f1303b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f1304c;

    /* renamed from: d  reason: collision with root package name */
    private final Handler f1305d;

    /* renamed from: e  reason: collision with root package name */
    final n f1306e;

    k(Activity activity, Context context, Handler handler, int i2) {
        this.f1306e = new o();
        this.f1303b = activity;
        h.a(context, "context == null");
        this.f1304c = context;
        h.a(handler, "handler == null");
        this.f1305d = handler;
    }

    k(e eVar) {
        this(eVar, eVar, new Handler(), 0);
    }

    @Override // androidx.fragment.app.g
    public View a(int i2) {
        return null;
    }

    public void a(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i2, Bundle bundle) {
        if (i2 == -1) {
            a.a(this.f1304c, intent, bundle);
            return;
        }
        throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
    }

    public boolean a(Fragment fragment) {
        return true;
    }

    @Override // androidx.fragment.app.g
    public boolean b() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public Activity d() {
        return this.f1303b;
    }

    /* access modifiers changed from: package-private */
    public Context g() {
        return this.f1304c;
    }

    /* access modifiers changed from: package-private */
    public Handler h() {
        return this.f1305d;
    }

    public abstract E i();

    public LayoutInflater j() {
        return LayoutInflater.from(this.f1304c);
    }

    public void k() {
    }
}
