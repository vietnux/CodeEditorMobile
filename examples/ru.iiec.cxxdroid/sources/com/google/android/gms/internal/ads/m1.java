package com.google.android.gms.internal.ads;

import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

final class m1 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ WeakReference f4933b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ g1 f4934c;

    m1(g1 g1Var, WeakReference weakReference) {
        this.f4934c = g1Var;
        this.f4933b = weakReference;
    }

    public final void onGlobalLayout() {
        g1.a(this.f4934c, this.f4933b, false);
    }
}
