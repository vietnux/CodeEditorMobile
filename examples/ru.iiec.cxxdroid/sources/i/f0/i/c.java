package i.f0.i;

import j.f;

public final class c {

    /* renamed from: d  reason: collision with root package name */
    public static final f f8948d = f.d(":");

    /* renamed from: e  reason: collision with root package name */
    public static final f f8949e = f.d(":status");

    /* renamed from: f  reason: collision with root package name */
    public static final f f8950f = f.d(":method");

    /* renamed from: g  reason: collision with root package name */
    public static final f f8951g = f.d(":path");

    /* renamed from: h  reason: collision with root package name */
    public static final f f8952h = f.d(":scheme");

    /* renamed from: i  reason: collision with root package name */
    public static final f f8953i = f.d(":authority");
    public final f a;

    /* renamed from: b  reason: collision with root package name */
    public final f f8954b;

    /* renamed from: c  reason: collision with root package name */
    final int f8955c;

    public c(f fVar, f fVar2) {
        this.a = fVar;
        this.f8954b = fVar2;
        this.f8955c = fVar.m() + 32 + fVar2.m();
    }

    public c(f fVar, String str) {
        this(fVar, f.d(str));
    }

    public c(String str, String str2) {
        this(f.d(str), f.d(str2));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.a.equals(cVar.a) && this.f8954b.equals(cVar.f8954b);
    }

    public int hashCode() {
        return ((527 + this.a.hashCode()) * 31) + this.f8954b.hashCode();
    }

    public String toString() {
        return i.f0.c.a("%s: %s", this.a.p(), this.f8954b.p());
    }
}
