package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;

public final class gy extends ez {

    /* renamed from: i  reason: collision with root package name */
    private final Activity f4458i;

    /* renamed from: j  reason: collision with root package name */
    private final View f4459j;

    public gy(tx txVar, String str, String str2, xp xpVar, int i2, int i3, View view, Activity activity) {
        super(txVar, str, str2, xpVar, i2, 62);
        this.f4459j = view;
        this.f4458i = activity;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.ez
    public final void a() {
        if (this.f4459j != null) {
            boolean booleanValue = ((Boolean) a50.g().a(k80.E1)).booleanValue();
            Object[] objArr = (Object[]) this.f4245f.invoke(null, this.f4459j, this.f4458i, Boolean.valueOf(booleanValue));
            synchronized (this.f4244e) {
                this.f4244e.f0 = Long.valueOf(((Long) objArr[0]).longValue());
                this.f4244e.g0 = Long.valueOf(((Long) objArr[1]).longValue());
                if (booleanValue) {
                    this.f4244e.h0 = (String) objArr[2];
                }
            }
        }
    }
}
