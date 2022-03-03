package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import c.h.l.b0;
import c.h.l.k0;
import c.h.l.u;
import e.b.b.b.i;

public class j extends FrameLayout {

    /* renamed from: b  reason: collision with root package name */
    Drawable f6450b;

    /* renamed from: c  reason: collision with root package name */
    Rect f6451c;

    /* renamed from: d  reason: collision with root package name */
    private Rect f6452d;

    class a implements u {
        a() {
        }

        @Override // c.h.l.u
        public k0 a(View view, k0 k0Var) {
            j jVar = j.this;
            if (jVar.f6451c == null) {
                jVar.f6451c = new Rect();
            }
            j.this.f6451c.set(k0Var.h(), k0Var.j(), k0Var.i(), k0Var.g());
            j.this.a(k0Var);
            j.this.setWillNotDraw(!k0Var.k() || j.this.f6450b == null);
            b0.M(j.this);
            return k0Var.c();
        }
    }

    public j(Context context) {
        this(context, null);
    }

    public j(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public j(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f6452d = new Rect();
        TypedArray c2 = l.c(context, attributeSet, e.b.b.b.j.ScrimInsetsFrameLayout, i2, i.Widget_Design_ScrimInsetsFrameLayout, new int[0]);
        this.f6450b = c2.getDrawable(e.b.b.b.j.ScrimInsetsFrameLayout_insetForeground);
        c2.recycle();
        setWillNotDraw(true);
        b0.a(this, new a());
    }

    /* access modifiers changed from: protected */
    public void a(k0 k0Var) {
        throw null;
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f6451c != null && this.f6450b != null) {
            int save = canvas.save();
            canvas.translate((float) getScrollX(), (float) getScrollY());
            this.f6452d.set(0, 0, width, this.f6451c.top);
            this.f6450b.setBounds(this.f6452d);
            this.f6450b.draw(canvas);
            this.f6452d.set(0, height - this.f6451c.bottom, width, height);
            this.f6450b.setBounds(this.f6452d);
            this.f6450b.draw(canvas);
            Rect rect = this.f6452d;
            Rect rect2 = this.f6451c;
            rect.set(0, rect2.top, rect2.left, height - rect2.bottom);
            this.f6450b.setBounds(this.f6452d);
            this.f6450b.draw(canvas);
            Rect rect3 = this.f6452d;
            Rect rect4 = this.f6451c;
            rect3.set(width - rect4.right, rect4.top, width, height - rect4.bottom);
            this.f6450b.setBounds(this.f6452d);
            this.f6450b.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.f6450b;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.f6450b;
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }
}
