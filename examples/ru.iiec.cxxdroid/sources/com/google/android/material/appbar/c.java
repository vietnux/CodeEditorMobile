package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* access modifiers changed from: package-private */
public class c<V extends View> extends CoordinatorLayout.c<V> {
    private d a;

    /* renamed from: b  reason: collision with root package name */
    private int f6295b = 0;

    /* renamed from: c  reason: collision with root package name */
    private int f6296c = 0;

    public c() {
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean a(int i2) {
        d dVar = this.a;
        if (dVar != null) {
            return dVar.b(i2);
        }
        this.f6295b = i2;
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean a(CoordinatorLayout coordinatorLayout, V v, int i2) {
        b(coordinatorLayout, v, i2);
        if (this.a == null) {
            this.a = new d(v);
        }
        this.a.c();
        int i3 = this.f6295b;
        if (i3 != 0) {
            this.a.b(i3);
            this.f6295b = 0;
        }
        int i4 = this.f6296c;
        if (i4 == 0) {
            return true;
        }
        this.a.a(i4);
        this.f6296c = 0;
        return true;
    }

    public int b() {
        d dVar = this.a;
        if (dVar != null) {
            return dVar.b();
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public void b(CoordinatorLayout coordinatorLayout, V v, int i2) {
        coordinatorLayout.c(v, i2);
    }
}
