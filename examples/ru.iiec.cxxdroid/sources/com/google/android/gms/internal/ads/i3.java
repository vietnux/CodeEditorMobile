package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.d;

@k2
public final class i3 extends d<r3> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i3(Context context, Looper looper, d.a aVar, d.b bVar) {
        super(context.getApplicationContext() != null ? context.getApplicationContext() : context, looper, 8, aVar, bVar, null);
    }

    public final r3 B() {
        return (r3) super.v();
    }

    /* Return type fixed from 'android.os.IInterface' to match base method */
    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.d
    public final /* synthetic */ r3 a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
        return queryLocalInterface instanceof r3 ? (r3) queryLocalInterface : new t3(iBinder);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.d
    public final String x() {
        return "com.google.android.gms.ads.internal.request.IAdRequestService";
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.d
    public final String y() {
        return "com.google.android.gms.ads.service.START";
    }
}
