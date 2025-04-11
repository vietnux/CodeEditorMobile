package com.google.android.gms.internal.ads;

public final class di0<T> {
    public final T a;

    /* renamed from: b  reason: collision with root package name */
    public final tw f4116b;

    /* renamed from: c  reason: collision with root package name */
    public final d3 f4117c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f4118d;

    private di0(d3 d3Var) {
        this.f4118d = false;
        this.a = null;
        this.f4116b = null;
        this.f4117c = d3Var;
    }

    private di0(T t, tw twVar) {
        this.f4118d = false;
        this.a = t;
        this.f4116b = twVar;
        this.f4117c = null;
    }

    public static <T> di0<T> a(d3 d3Var) {
        return new di0<>(d3Var);
    }

    public static <T> di0<T> a(T t, tw twVar) {
        return new di0<>(t, twVar);
    }
}
