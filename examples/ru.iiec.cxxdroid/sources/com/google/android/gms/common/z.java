package com.google.android.gms.common;

import android.util.Log;
import com.google.android.gms.common.i;

/* access modifiers changed from: package-private */
public class z {

    /* renamed from: d  reason: collision with root package name */
    private static final z f3730d = new z(true, null, null);
    final boolean a;

    /* renamed from: b  reason: collision with root package name */
    private final String f3731b;

    /* renamed from: c  reason: collision with root package name */
    private final Throwable f3732c;

    z(boolean z, String str, Throwable th) {
        this.a = z;
        this.f3731b = str;
        this.f3732c = th;
    }

    static z a(String str) {
        return new z(false, str, null);
    }

    static z a(String str, i.a aVar, boolean z, boolean z2) {
        return new b0(str, aVar, z, z2);
    }

    static z a(String str, Throwable th) {
        return new z(false, str, th);
    }

    static z c() {
        return f3730d;
    }

    /* access modifiers changed from: package-private */
    public String a() {
        return this.f3731b;
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        if (this.a) {
            return;
        }
        if (this.f3732c != null) {
            Log.d("GoogleCertificatesRslt", a(), this.f3732c);
        } else {
            Log.d("GoogleCertificatesRslt", a());
        }
    }
}
