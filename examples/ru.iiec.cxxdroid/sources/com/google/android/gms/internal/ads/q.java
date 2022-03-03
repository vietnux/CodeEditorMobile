package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import e.b.b.a.b.b;
import e.b.b.a.b.c;

@k2
public final class q extends c<u> {
    public q() {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    public final r a(Activity activity) {
        try {
            IBinder x = ((u) a((Context) activity)).x(b.a(activity));
            if (x == null) {
                return null;
            }
            IInterface queryLocalInterface = x.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            return queryLocalInterface instanceof r ? (r) queryLocalInterface : new t(x);
        } catch (RemoteException e2) {
            qc.c("Could not create remote AdOverlay.", e2);
            return null;
        } catch (c.a e3) {
            qc.c("Could not create remote AdOverlay.", e3);
            return null;
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* access modifiers changed from: protected */
    @Override // e.b.b.a.b.c
    public final /* synthetic */ u a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
        return queryLocalInterface instanceof u ? (u) queryLocalInterface : new v(iBinder);
    }
}
