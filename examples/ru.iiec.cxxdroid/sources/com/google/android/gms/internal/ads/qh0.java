package com.google.android.gms.internal.ads;

import android.content.Context;

@k2
public final class qh0 {

    /* renamed from: b  reason: collision with root package name */
    private static final za<vf0> f5342b = new rh0();

    /* renamed from: c  reason: collision with root package name */
    private static final za<vf0> f5343c = new sh0();
    private final hg0 a;

    public qh0(Context context, sc scVar, String str) {
        this.a = new hg0(context, scVar, str, f5342b, f5343c);
    }

    public final <I, O> ih0<I, O> a(String str, lh0<I> lh0, kh0<O> kh0) {
        return new th0(this.a, str, lh0, kh0);
    }
}
