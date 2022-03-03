package com.google.firebase.iid;

import android.util.Base64;
import com.google.android.gms.common.internal.x;
import java.security.KeyPair;

/* access modifiers changed from: package-private */
public final class j0 {
    private final KeyPair a;

    /* renamed from: b  reason: collision with root package name */
    private final long f6624b;

    j0(KeyPair keyPair, long j2) {
        this.a = keyPair;
        this.f6624b = j2;
    }

    /* access modifiers changed from: private */
    public final String b() {
        return Base64.encodeToString(this.a.getPublic().getEncoded(), 11);
    }

    /* access modifiers changed from: private */
    public final String c() {
        return Base64.encodeToString(this.a.getPrivate().getEncoded(), 11);
    }

    /* access modifiers changed from: package-private */
    public final KeyPair a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return this.f6624b == j0Var.f6624b && this.a.getPublic().equals(j0Var.a.getPublic()) && this.a.getPrivate().equals(j0Var.a.getPrivate());
    }

    public final int hashCode() {
        return x.a(this.a.getPublic(), this.a.getPrivate(), Long.valueOf(this.f6624b));
    }
}
