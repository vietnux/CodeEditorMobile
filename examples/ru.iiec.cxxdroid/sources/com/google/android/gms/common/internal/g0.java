package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.Intent;

/* access modifiers changed from: package-private */
public final class g0 extends i {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Intent f3661b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ Activity f3662c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ int f3663d;

    g0(Intent intent, Activity activity, int i2) {
        this.f3661b = intent;
        this.f3662c = activity;
        this.f3663d = i2;
    }

    @Override // com.google.android.gms.common.internal.i
    public final void a() {
        Intent intent = this.f3661b;
        if (intent != null) {
            this.f3662c.startActivityForResult(intent, this.f3663d);
        }
    }
}
