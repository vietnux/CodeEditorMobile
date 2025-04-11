package com.crashlytics.android.e;

/* access modifiers changed from: package-private */
public class u0 {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final String f3034b;

    /* renamed from: c  reason: collision with root package name */
    public final StackTraceElement[] f3035c;

    /* renamed from: d  reason: collision with root package name */
    public final u0 f3036d;

    public u0(Throwable th, t0 t0Var) {
        this.a = th.getLocalizedMessage();
        this.f3034b = th.getClass().getName();
        this.f3035c = t0Var.a(th.getStackTrace());
        Throwable cause = th.getCause();
        this.f3036d = cause != null ? new u0(cause, t0Var) : null;
    }
}
