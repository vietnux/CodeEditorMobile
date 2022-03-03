package com.google.android.material.card;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import c.d.f.a;
import com.google.android.material.internal.l;
import e.b.b.b.b;
import e.b.b.b.i;
import e.b.b.b.j;

public class MaterialCardView extends a {

    /* renamed from: k  reason: collision with root package name */
    private final a f6360k;

    public MaterialCardView(Context context) {
        this(context, null);
    }

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.materialCardViewStyle);
    }

    public MaterialCardView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        TypedArray c2 = l.c(context, attributeSet, j.MaterialCardView, i2, i.Widget_MaterialComponents_CardView, new int[0]);
        this.f6360k = new a(this);
        this.f6360k.a(c2);
        c2.recycle();
    }

    public int getStrokeColor() {
        return this.f6360k.a();
    }

    public int getStrokeWidth() {
        return this.f6360k.b();
    }

    @Override // c.d.f.a
    public void setRadius(float f2) {
        super.setRadius(f2);
        this.f6360k.c();
    }

    public void setStrokeColor(int i2) {
        this.f6360k.a(i2);
    }

    public void setStrokeWidth(int i2) {
        this.f6360k.b(i2);
    }
}
