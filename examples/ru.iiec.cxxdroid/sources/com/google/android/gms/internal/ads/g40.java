package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.n;
import e.b.b.a.b.b;
import e.b.b.a.b.c;

@k2
public final class g40 extends c<p50> {
    public g40() {
        super("com.google.android.gms.ads.AdLoaderBuilderCreatorImpl");
    }

    public final m50 a(Context context, String str, ri0 ri0) {
        try {
            IBinder a = ((p50) a(context)).a(b.a(context), str, ri0, n.GOOGLE_PLAY_SERVICES_VERSION_CODE);
            if (a == null) {
                return null;
            }
            IInterface queryLocalInterface = a.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            return queryLocalInterface instanceof m50 ? (m50) queryLocalInterface : new o50(a);
        } catch (RemoteException | c.a e2) {
            qc.c("Could not create remote builder for AdLoader.", e2);
            return null;
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* access modifiers changed from: protected */
    @Override // e.b.b.a.b.c
    public final /* synthetic */ p50 a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
        return queryLocalInterface instanceof p50 ? (p50) queryLocalInterface : new q50(iBinder);
    }
}
