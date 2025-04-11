package com.google.android.gms.internal.ads;

public final class w10 {
    final long a;

    /* renamed from: b  reason: collision with root package name */
    final String f5868b;

    /* renamed from: c  reason: collision with root package name */
    final int f5869c;

    w10(long j2, String str, int i2) {
        this.a = j2;
        this.f5868b = str;
        this.f5869c = i2;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof w10)) {
            w10 w10 = (w10) obj;
            return w10.a == this.a && w10.f5869c == this.f5869c;
        }
    }

    public final int hashCode() {
        return (int) this.a;
    }
}
