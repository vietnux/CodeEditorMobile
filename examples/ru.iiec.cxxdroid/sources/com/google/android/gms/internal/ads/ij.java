package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.d;

public final class ij extends d<nj> {
    public ij(Context context, Looper looper, d.a aVar, d.b bVar) {
        super(context, looper, 116, aVar, bVar, null);
    }

    public final nj B() {
        return (nj) super.v();
    }

    /* Return type fixed from 'android.os.IInterface' to match base method */
    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.d
    public final /* synthetic */ nj a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.gass.internal.IGassService");
        return queryLocalInterface instanceof nj ? (nj) queryLocalInterface : new oj(iBinder);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.d
    public final String x() {
        return "com.google.android.gms.gass.internal.IGassService";
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.d
    public final String y() {
        return "com.google.android.gms.gass.START";
    }
}
