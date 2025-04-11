package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.x0;

@k2
public final class tb extends g9 {

    /* renamed from: d  reason: collision with root package name */
    private final rc f5608d;

    /* renamed from: e  reason: collision with root package name */
    private final String f5609e;

    public tb(Context context, String str, String str2) {
        this(str2, x0.f().a(context, str));
    }

    private tb(String str, String str2) {
        this.f5608d = new rc(str2);
        this.f5609e = str;
    }

    @Override // com.google.android.gms.internal.ads.g9
    public final void c() {
    }

    @Override // com.google.android.gms.internal.ads.g9
    public final void d() {
        this.f5608d.a(this.f5609e);
    }
}
