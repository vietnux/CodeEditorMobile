package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;

/* access modifiers changed from: package-private */
public final class ta0 implements y90 {
    private final /* synthetic */ View a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ ra0 f5607b;

    ta0(ra0 ra0, View view) {
        this.f5607b = ra0;
        this.a = view;
    }

    @Override // com.google.android.gms.internal.ads.y90
    public final void a() {
        if (this.f5607b.a(ra0.f5419l)) {
            this.f5607b.onClick(this.a);
        }
    }

    @Override // com.google.android.gms.internal.ads.y90
    public final void a(MotionEvent motionEvent) {
        this.f5607b.onTouch(null, motionEvent);
    }
}
