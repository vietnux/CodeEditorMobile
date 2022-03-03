package com.google.android.gms.internal.ads;

import android.view.View;

final class j10 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ View f4658b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ i10 f4659c;

    j10(i10 i10, View view) {
        this.f4659c = i10;
        this.f4658b = view;
    }

    public final void run() {
        this.f4659c.a(this.f4658b);
    }
}
