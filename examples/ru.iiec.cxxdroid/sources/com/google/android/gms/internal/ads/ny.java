package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.io.IOException;

public final class ny extends ez {
    public ny(tx txVar, String str, String str2, xp xpVar, int i2, int i3) {
        super(txVar, str, str2, xpVar, i2, 24);
    }

    private final void c() {
        AdvertisingIdClient m2 = this.f4241b.m();
        if (m2 != null) {
            try {
                AdvertisingIdClient.Info info = m2.getInfo();
                String a = by.a(info.getId());
                if (a != null) {
                    synchronized (this.f4244e) {
                        this.f4244e.n0 = a;
                        this.f4244e.p0 = Boolean.valueOf(info.isLimitAdTrackingEnabled());
                        this.f4244e.o0 = 5;
                    }
                }
            } catch (IOException unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.ez
    public final void a() {
        if (this.f4241b.g()) {
            c();
            return;
        }
        synchronized (this.f4244e) {
            this.f4244e.n0 = (String) this.f4245f.invoke(null, this.f4241b.a());
        }
    }

    @Override // com.google.android.gms.internal.ads.ez
    /* renamed from: b */
    public final Void call() {
        if (this.f4241b.b()) {
            return super.call();
        }
        if (!this.f4241b.g()) {
            return null;
        }
        c();
        return null;
    }
}
