package com.google.android.material.card;

import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import e.b.b.b.j;

class a {
    private final MaterialCardView a;

    /* renamed from: b  reason: collision with root package name */
    private int f6361b;

    /* renamed from: c  reason: collision with root package name */
    private int f6362c;

    public a(MaterialCardView materialCardView) {
        this.a = materialCardView;
    }

    private void d() {
        this.a.a(this.a.getContentPaddingLeft() + this.f6362c, this.a.getContentPaddingTop() + this.f6362c, this.a.getContentPaddingRight() + this.f6362c, this.a.getContentPaddingBottom() + this.f6362c);
    }

    private Drawable e() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(this.a.getRadius());
        int i2 = this.f6361b;
        if (i2 != -1) {
            gradientDrawable.setStroke(this.f6362c, i2);
        }
        return gradientDrawable;
    }

    /* access modifiers changed from: package-private */
    public int a() {
        return this.f6361b;
    }

    /* access modifiers changed from: package-private */
    public void a(int i2) {
        this.f6361b = i2;
        c();
    }

    public void a(TypedArray typedArray) {
        this.f6361b = typedArray.getColor(j.MaterialCardView_strokeColor, -1);
        this.f6362c = typedArray.getDimensionPixelSize(j.MaterialCardView_strokeWidth, 0);
        c();
        d();
    }

    /* access modifiers changed from: package-private */
    public int b() {
        return this.f6362c;
    }

    /* access modifiers changed from: package-private */
    public void b(int i2) {
        this.f6362c = i2;
        c();
        d();
    }

    /* access modifiers changed from: package-private */
    public void c() {
        this.a.setForeground(e());
    }
}
