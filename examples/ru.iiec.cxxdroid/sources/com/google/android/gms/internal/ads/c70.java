package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.p.b;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.internal.ads.r40;

@k2
public final class c70 {

    /* renamed from: c  reason: collision with root package name */
    private static c70 f3998c;

    /* renamed from: d  reason: collision with root package name */
    private static final Object f3999d = new Object();
    private j60 a;

    /* renamed from: b  reason: collision with root package name */
    private b f4000b;

    private c70() {
    }

    public static c70 a() {
        c70 c70;
        synchronized (f3999d) {
            if (f3998c == null) {
                f3998c = new c70();
            }
            c70 = f3998c;
        }
        return c70;
    }

    public final b a(Context context) {
        synchronized (f3999d) {
            if (this.f4000b != null) {
                return this.f4000b;
            }
            this.f4000b = new t6(context, (f6) r40.a(context, false, (r40.a) new x40(a50.c(), context, new qi0())));
            return this.f4000b;
        }
    }

    public final void a(float f2) {
        boolean z = true;
        y.a(0.0f <= f2 && f2 <= 1.0f, "The app volume must be a value between 0 and 1 inclusive.");
        if (this.a == null) {
            z = false;
        }
        y.b(z, "MobileAds.initialize() must be called prior to setting the app volume.");
        try {
            this.a.a(f2);
        } catch (RemoteException e2) {
            qc.b("Unable to set app volume.", e2);
        }
    }

    public final void a(Context context, String str, e70 e70) {
        synchronized (f3999d) {
            if (this.a == null) {
                if (context != null) {
                    try {
                        this.a = (j60) r40.a(context, false, (r40.a) new w40(a50.c(), context));
                        this.a.F();
                        if (str != null) {
                            this.a.b(str, e.b.b.a.b.b.a(new d70(this, context)));
                        }
                    } catch (RemoteException e2) {
                        qc.c("MobileAdsSettingManager initialization failed", e2);
                    }
                    return;
                }
                throw new IllegalArgumentException("Context cannot be null.");
            }
        }
    }
}
