package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.n;
import e.b.b.a.b.b;
import e.b.b.a.b.c;

@k2
public final class h40 extends c<u50> {
    public h40() {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    public final r50 a(Context context, n40 n40, String str, ri0 ri0, int i2) {
        try {
            IBinder a = ((u50) a(context)).a(b.a(context), n40, str, ri0, n.GOOGLE_PLAY_SERVICES_VERSION_CODE, i2);
            if (a == null) {
                return null;
            }
            IInterface queryLocalInterface = a.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            return queryLocalInterface instanceof r50 ? (r50) queryLocalInterface : new t50(a);
        } catch (RemoteException | c.a e2) {
            qc.a("Could not create remote AdManager.", e2);
            return null;
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* access modifiers changed from: protected */
    @Override // e.b.b.a.b.c
    public final /* synthetic */ u50 a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        return queryLocalInterface instanceof u50 ? (u50) queryLocalInterface : new v50(iBinder);
    }
}
