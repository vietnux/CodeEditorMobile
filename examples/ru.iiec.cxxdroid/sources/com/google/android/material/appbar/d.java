package com.google.android.material.appbar;

import android.view.View;
import c.h.l.b0;

/* access modifiers changed from: package-private */
public class d {
    private final View a;

    /* renamed from: b  reason: collision with root package name */
    private int f6297b;

    /* renamed from: c  reason: collision with root package name */
    private int f6298c;

    /* renamed from: d  reason: collision with root package name */
    private int f6299d;

    /* renamed from: e  reason: collision with root package name */
    private int f6300e;

    public d(View view) {
        this.a = view;
    }

    private void d() {
        View view = this.a;
        b0.e(view, this.f6299d - (view.getTop() - this.f6297b));
        View view2 = this.a;
        b0.d(view2, this.f6300e - (view2.getLeft() - this.f6298c));
    }

    public int a() {
        return this.f6297b;
    }

    public boolean a(int i2) {
        if (this.f6300e == i2) {
            return false;
        }
        this.f6300e = i2;
        d();
        return true;
    }

    public int b() {
        return this.f6299d;
    }

    public boolean b(int i2) {
        if (this.f6299d == i2) {
            return false;
        }
        this.f6299d = i2;
        d();
        return true;
    }

    public void c() {
        this.f6297b = this.a.getTop();
        this.f6298c = this.a.getLeft();
        d();
    }
}
