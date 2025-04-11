package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import com.google.android.gms.ads.internal.x0;

@k2
public final class ec {
    private final View a;

    /* renamed from: b  reason: collision with root package name */
    private Activity f4202b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f4203c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f4204d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f4205e;

    /* renamed from: f  reason: collision with root package name */
    private ViewTreeObserver.OnGlobalLayoutListener f4206f;

    /* renamed from: g  reason: collision with root package name */
    private ViewTreeObserver.OnScrollChangedListener f4207g;

    public ec(Activity activity, View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        this.f4202b = activity;
        this.a = view;
        this.f4206f = onGlobalLayoutListener;
        this.f4207g = onScrollChangedListener;
    }

    private static ViewTreeObserver b(Activity activity) {
        Window window;
        View decorView;
        if (activity == null || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return null;
        }
        return decorView.getViewTreeObserver();
    }

    private final void e() {
        ViewTreeObserver b2;
        ViewTreeObserver b3;
        if (!this.f4203c) {
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f4206f;
            if (onGlobalLayoutListener != null) {
                Activity activity = this.f4202b;
                if (!(activity == null || (b3 = b(activity)) == null)) {
                    b3.addOnGlobalLayoutListener(onGlobalLayoutListener);
                }
                x0.B();
                ee.a(this.a, this.f4206f);
            }
            ViewTreeObserver.OnScrollChangedListener onScrollChangedListener = this.f4207g;
            if (onScrollChangedListener != null) {
                Activity activity2 = this.f4202b;
                if (!(activity2 == null || (b2 = b(activity2)) == null)) {
                    b2.addOnScrollChangedListener(onScrollChangedListener);
                }
                x0.B();
                ee.a(this.a, this.f4207g);
            }
            this.f4203c = true;
        }
    }

    private final void f() {
        ViewTreeObserver b2;
        ViewTreeObserver b3;
        Activity activity = this.f4202b;
        if (activity != null && this.f4203c) {
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f4206f;
            if (!(onGlobalLayoutListener == null || (b3 = b(activity)) == null)) {
                x0.h().a(b3, onGlobalLayoutListener);
            }
            ViewTreeObserver.OnScrollChangedListener onScrollChangedListener = this.f4207g;
            if (!(onScrollChangedListener == null || (b2 = b(this.f4202b)) == null)) {
                b2.removeOnScrollChangedListener(onScrollChangedListener);
            }
            this.f4203c = false;
        }
    }

    public final void a() {
        this.f4204d = true;
        if (this.f4205e) {
            e();
        }
    }

    public final void a(Activity activity) {
        this.f4202b = activity;
    }

    public final void b() {
        this.f4204d = false;
        f();
    }

    public final void c() {
        this.f4205e = true;
        if (this.f4204d) {
            e();
        }
    }

    public final void d() {
        this.f4205e = false;
        f();
    }
}
