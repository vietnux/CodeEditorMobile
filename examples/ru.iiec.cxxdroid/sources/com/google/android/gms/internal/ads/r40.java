package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;

@k2
public class r40 {
    private d60 a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f5386b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private final h40 f5387c;

    /* renamed from: d  reason: collision with root package name */
    private final g40 f5388d;

    /* renamed from: e  reason: collision with root package name */
    private final f70 f5389e;

    /* renamed from: f  reason: collision with root package name */
    private final p6 f5390f;

    /* renamed from: g  reason: collision with root package name */
    private final q f5391g;

    /* access modifiers changed from: package-private */
    public abstract class a<T> {
        a() {
        }

        /* access modifiers changed from: protected */
        public abstract T a();

        /* access modifiers changed from: protected */
        public abstract T a(d60 d60);

        /* access modifiers changed from: protected */
        public final T b() {
            d60 b2 = r40.this.b();
            if (b2 == null) {
                qc.d("ClientApi class cannot be loaded.");
                return null;
            }
            try {
                return a(b2);
            } catch (RemoteException e2) {
                qc.c("Cannot invoke local loader using ClientApi class", e2);
                return null;
            }
        }

        /* access modifiers changed from: protected */
        public final T c() {
            try {
                return a();
            } catch (RemoteException e2) {
                qc.c("Cannot invoke remote loader", e2);
                return null;
            }
        }
    }

    public r40(h40 h40, g40 g40, f70 f70, wc0 wc0, p6 p6Var, q qVar, xc0 xc0) {
        this.f5387c = h40;
        this.f5388d = g40;
        this.f5389e = f70;
        this.f5390f = p6Var;
        this.f5391g = qVar;
    }

    private static d60 a() {
        try {
            Object newInstance = r40.class.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi").newInstance();
            if (newInstance instanceof IBinder) {
                return e60.asInterface((IBinder) newInstance);
            }
            qc.d("ClientApi class is not an instance of IBinder");
            return null;
        } catch (Exception e2) {
            qc.c("Failed to instantiate ClientApi class.", e2);
            return null;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: com.google.android.gms.internal.ads.i80 */
    /* JADX WARN: Multi-variable type inference failed */
    static <T> T a(Context context, boolean z, a<T> aVar) {
        if (!z) {
            a50.b();
            if (!fc.c(context)) {
                qc.b("Google Play Services is not available");
                z = true;
            }
        }
        a50.b();
        int e2 = fc.e(context);
        a50.b();
        if (e2 > fc.d(context)) {
            z = true;
        }
        k80.a(context);
        if (((Boolean) a50.g().a(k80.d3)).booleanValue()) {
            z = false;
        }
        if (z) {
            T b2 = aVar.b();
            return b2 == null ? aVar.c() : b2;
        }
        T c2 = aVar.c();
        return c2 == null ? aVar.b() : c2;
    }

    /* access modifiers changed from: private */
    public static void a(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("action", "no_ads_fallback");
        bundle.putString("flow", str);
        a50.b().a(context, (String) null, "gmob-apps", bundle, true);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final d60 b() {
        d60 d60;
        synchronized (this.f5386b) {
            if (this.a == null) {
                this.a = a();
            }
            d60 = this.a;
        }
        return d60;
    }

    public final m50 a(Context context, String str, ri0 ri0) {
        return (m50) a(context, false, (a) new v40(this, context, str, ri0));
    }

    public final r a(Activity activity) {
        Intent intent = activity.getIntent();
        boolean z = false;
        if (!intent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar")) {
            qc.a("useClientJar flag not found in activity intent extras.");
        } else {
            z = intent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
        }
        return (r) a(activity, z, new z40(this, activity));
    }
}
