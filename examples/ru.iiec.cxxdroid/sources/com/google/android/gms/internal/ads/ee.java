package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewTreeObserver;

@k2
public final class ee {
    public static void a(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        new fe(view, onGlobalLayoutListener).a();
    }

    public static void a(View view, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        new ge(view, onScrollChangedListener).a();
    }
}
