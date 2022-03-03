package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

public abstract class ez implements Callable {

    /* renamed from: b  reason: collision with root package name */
    protected final tx f4241b;

    /* renamed from: c  reason: collision with root package name */
    private final String f4242c;

    /* renamed from: d  reason: collision with root package name */
    private final String f4243d;

    /* renamed from: e  reason: collision with root package name */
    protected final xp f4244e;

    /* renamed from: f  reason: collision with root package name */
    protected Method f4245f;

    /* renamed from: g  reason: collision with root package name */
    private final int f4246g;

    /* renamed from: h  reason: collision with root package name */
    private final int f4247h;

    public ez(tx txVar, String str, String str2, xp xpVar, int i2, int i3) {
        getClass().getSimpleName();
        this.f4241b = txVar;
        this.f4242c = str;
        this.f4243d = str2;
        this.f4244e = xpVar;
        this.f4246g = i2;
        this.f4247h = i3;
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    /* renamed from: b */
    public Void call() {
        try {
            long nanoTime = System.nanoTime();
            this.f4245f = this.f4241b.a(this.f4242c, this.f4243d);
            if (this.f4245f == null) {
                return null;
            }
            a();
            ww h2 = this.f4241b.h();
            if (!(h2 == null || this.f4246g == Integer.MIN_VALUE)) {
                h2.a(this.f4247h, this.f4246g, (System.nanoTime() - nanoTime) / 1000);
            }
            return null;
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }
}
