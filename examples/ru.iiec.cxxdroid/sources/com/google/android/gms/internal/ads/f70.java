package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.n;
import e.b.b.a.b.b;
import e.b.b.a.b.c;

@k2
public final class f70 extends c<m60> {
    public f70() {
        super("com.google.android.gms.ads.MobileAdsSettingManagerCreatorImpl");
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* access modifiers changed from: protected */
    @Override // e.b.b.a.b.c
    public final /* synthetic */ m60 a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
        return queryLocalInterface instanceof m60 ? (m60) queryLocalInterface : new n60(iBinder);
    }

    public final j60 b(Context context) {
        try {
            IBinder c2 = ((m60) a(context)).c(b.a(context), n.GOOGLE_PLAY_SERVICES_VERSION_CODE);
            if (c2 == null) {
                return null;
            }
            IInterface queryLocalInterface = c2.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            return queryLocalInterface instanceof j60 ? (j60) queryLocalInterface : new l60(c2);
        } catch (RemoteException e2) {
            qc.c("Could not get remote MobileAdsSettingManager.", e2);
            return null;
        } catch (c.a e3) {
            qc.c("Could not get remote MobileAdsSettingManager.", e3);
            return null;
        }
    }
}
