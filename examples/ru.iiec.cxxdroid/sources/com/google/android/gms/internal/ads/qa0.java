package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;

final class qa0 implements y90 {
    private final /* synthetic */ View a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ pa0 f5336b;

    qa0(pa0 pa0, View view) {
        this.f5336b = pa0;
        this.a = view;
    }

    @Override // com.google.android.gms.internal.ads.y90
    public final void a() {
        this.f5336b.onClick(this.a);
    }

    @Override // com.google.android.gms.internal.ads.y90
    public final void a(MotionEvent motionEvent) {
        this.f5336b.onTouch(null, motionEvent);
    }
}
