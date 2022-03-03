package com.google.android.gms.common.api.internal;

public final class i<L> {
    private final L a;

    /* renamed from: b  reason: collision with root package name */
    private final String f3550b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.a == iVar.a && this.f3550b.equals(iVar.f3550b);
    }

    public final int hashCode() {
        return (System.identityHashCode(this.a) * 31) + this.f3550b.hashCode();
    }
}
