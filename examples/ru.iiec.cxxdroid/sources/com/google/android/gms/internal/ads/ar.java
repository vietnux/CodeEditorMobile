package com.google.android.gms.internal.ads;

final class ar {
    private final Object a;

    /* renamed from: b  reason: collision with root package name */
    private final int f3823b;

    ar(Object obj, int i2) {
        this.a = obj;
        this.f3823b = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ar)) {
            return false;
        }
        ar arVar = (ar) obj;
        return this.a == arVar.a && this.f3823b == arVar.f3823b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.a) * 65535) + this.f3823b;
    }
}
