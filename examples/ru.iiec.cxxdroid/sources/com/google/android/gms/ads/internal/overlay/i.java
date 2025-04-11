package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.internal.ads.k2;
import com.google.android.gms.internal.ads.lg;

@k2
public final class i {
    public final int a;

    /* renamed from: b  reason: collision with root package name */
    public final ViewGroup.LayoutParams f3290b;

    /* renamed from: c  reason: collision with root package name */
    public final ViewGroup f3291c;

    /* renamed from: d  reason: collision with root package name */
    public final Context f3292d;

    public i(lg lgVar) {
        this.f3290b = lgVar.getLayoutParams();
        ViewParent parent = lgVar.getParent();
        this.f3292d = lgVar.a0();
        if (parent == null || !(parent instanceof ViewGroup)) {
            throw new g("Could not get the parent of the WebView for an overlay.");
        }
        this.f3291c = (ViewGroup) parent;
        this.a = this.f3291c.indexOfChild(lgVar.getView());
        this.f3291c.removeView(lgVar.getView());
        lgVar.d(true);
    }
}
