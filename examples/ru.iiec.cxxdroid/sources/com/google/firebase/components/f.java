package com.google.firebase.components;

public final class f {
    private final Class<?> a;

    /* renamed from: b  reason: collision with root package name */
    private final int f6579b;

    /* renamed from: c  reason: collision with root package name */
    private final int f6580c;

    private f(Class<?> cls, int i2, int i3) {
        t.a(cls, "Null dependency interface.");
        this.a = cls;
        this.f6579b = i2;
        this.f6580c = i3;
    }

    public static f a(Class<?> cls) {
        return new f(cls, 1, 0);
    }

    public final Class<?> a() {
        return this.a;
    }

    public final boolean b() {
        return this.f6579b == 1;
    }

    public final boolean c() {
        return this.f6580c == 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            f fVar = (f) obj;
            return this.a == fVar.a && this.f6579b == fVar.f6579b && this.f6580c == fVar.f6580c;
        }
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.f6579b) * 1000003) ^ this.f6580c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Dependency{interface=");
        sb.append(this.a);
        sb.append(", required=");
        boolean z = false;
        sb.append(this.f6579b == 1);
        sb.append(", direct=");
        if (this.f6580c == 0) {
            z = true;
        }
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
