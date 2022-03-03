package com.google.android.gms.internal.ads;

import android.util.DisplayMetrics;
import android.view.View;

public final class bz extends ez {

    /* renamed from: i  reason: collision with root package name */
    private final View f3932i;

    public bz(tx txVar, String str, String str2, xp xpVar, int i2, int i3, View view) {
        super(txVar, str, str2, xpVar, i2, 57);
        this.f3932i = view;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.ez
    public final void a() {
        if (this.f3932i != null) {
            DisplayMetrics displayMetrics = this.f4241b.a().getResources().getDisplayMetrics();
            cy cyVar = new cy((String) this.f4245f.invoke(null, this.f3932i, displayMetrics));
            yr yrVar = new yr();
            yrVar.f6145e = cyVar.f4054b;
            yrVar.f6146f = cyVar.f4055c;
            yrVar.f6147g = cyVar.f4056d;
            this.f4244e.a0 = yrVar;
        }
    }
}
