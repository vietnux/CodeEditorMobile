package com.google.android.gms.internal.ads;

import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

final class n1 implements ViewTreeObserver.OnScrollChangedListener {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ WeakReference f5007b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ g1 f5008c;

    n1(g1 g1Var, WeakReference weakReference) {
        this.f5008c = g1Var;
        this.f5007b = weakReference;
    }

    public final void onScrollChanged() {
        g1.a(this.f5008c, this.f5007b, true);
    }
}
