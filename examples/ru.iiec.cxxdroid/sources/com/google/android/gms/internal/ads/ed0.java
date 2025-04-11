package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.d;

@k2
public final class ed0 extends d<jd0> {
    ed0(Context context, Looper looper, d.a aVar, d.b bVar) {
        super(context, looper, 166, aVar, bVar, null);
    }

    public final jd0 B() {
        return (jd0) super.v();
    }

    /* Return type fixed from 'android.os.IInterface' to match base method */
    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.d
    public final /* synthetic */ jd0 a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
        return queryLocalInterface instanceof jd0 ? (jd0) queryLocalInterface : new kd0(iBinder);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.d
    public final String x() {
        return "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService";
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.d
    public final String y() {
        return "com.google.android.gms.ads.service.HTTP";
    }
}
