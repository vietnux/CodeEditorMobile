package com.google.android.gms.ads.internal;

import android.webkit.CookieManager;
import com.google.android.gms.internal.ads.a50;
import com.google.android.gms.internal.ads.k80;
import java.util.concurrent.Callable;

final class e1 implements Callable<String> {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ b1 f3144b;

    e1(b1 b1Var) {
        this.f3144b = b1Var;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.concurrent.Callable
    public final /* synthetic */ String call() {
        CookieManager c2;
        return (!((Boolean) a50.g().a(k80.B2)).booleanValue() || (c2 = x0.h().c(this.f3144b.f3125g.f3368d)) == null) ? "" : c2.getCookie("googleads.g.doubleclick.net");
    }
}
