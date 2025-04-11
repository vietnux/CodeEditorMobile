package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import c.h.l.b0;
import e.b.b.b.m.b;
import java.util.List;

public abstract class ExpandableBehavior extends CoordinatorLayout.c<View> {
    private int a = 0;

    class a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f6551b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f6552c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ b f6553d;

        a(View view, int i2, b bVar) {
            this.f6551b = view;
            this.f6552c = i2;
            this.f6553d = bVar;
        }

        public boolean onPreDraw() {
            this.f6551b.getViewTreeObserver().removeOnPreDrawListener(this);
            if (ExpandableBehavior.this.a == this.f6552c) {
                ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
                b bVar = this.f6553d;
                expandableBehavior.a((View) bVar, this.f6551b, bVar.a(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private boolean a(boolean z) {
        if (!z) {
            return this.a == 1;
        }
        int i2 = this.a;
        return i2 == 0 || i2 == 2;
    }

    /* access modifiers changed from: protected */
    public abstract boolean a(View view, View view2, boolean z, boolean z2);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean a(CoordinatorLayout coordinatorLayout, View view, int i2) {
        b e2;
        if (b0.I(view) || (e2 = e(coordinatorLayout, view)) == null || !a(e2.a())) {
            return false;
        }
        this.a = e2.a() ? 1 : 2;
        view.getViewTreeObserver().addOnPreDrawListener(new a(view, this.a, e2));
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean b(CoordinatorLayout coordinatorLayout, View view, View view2) {
        b bVar = (b) view2;
        if (!a(bVar.a())) {
            return false;
        }
        this.a = bVar.a() ? 1 : 2;
        return a((View) bVar, view, bVar.a(), true);
    }

    /* access modifiers changed from: protected */
    public b e(CoordinatorLayout coordinatorLayout, View view) {
        List<View> b2 = coordinatorLayout.b(view);
        int size = b2.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view2 = b2.get(i2);
            if (a(coordinatorLayout, view, view2)) {
                return (b) view2;
            }
        }
        return null;
    }
}
