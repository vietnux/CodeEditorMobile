package com.google.android.gms.common.internal;

import android.content.Intent;
import androidx.fragment.app.Fragment;

/* access modifiers changed from: package-private */
public final class h0 extends i {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Intent f3664b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ Fragment f3665c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ int f3666d;

    h0(Intent intent, Fragment fragment, int i2) {
        this.f3664b = intent;
        this.f3665c = fragment;
        this.f3666d = i2;
    }

    @Override // com.google.android.gms.common.internal.i
    public final void a() {
        Intent intent = this.f3664b;
        if (intent != null) {
            this.f3665c.a(intent, this.f3666d);
        }
    }
}
