package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.n;
import e.b.b.a.b.b;
import e.b.b.a.b.c;

@k2
public final class p6 extends c<j6> {
    public p6() {
        super("com.google.android.gms.ads.reward.RewardedVideoAdCreatorImpl");
    }

    public final f6 a(Context context, ri0 ri0) {
        try {
            IBinder a = ((j6) a(context)).a(b.a(context), ri0, n.GOOGLE_PLAY_SERVICES_VERSION_CODE);
            if (a == null) {
                return null;
            }
            IInterface queryLocalInterface = a.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
            return queryLocalInterface instanceof f6 ? (f6) queryLocalInterface : new i6(a);
        } catch (RemoteException | c.a e2) {
            qc.c("Could not get remote RewardedVideoAd.", e2);
            return null;
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* access modifiers changed from: protected */
    @Override // e.b.b.a.b.c
    public final /* synthetic */ j6 a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdCreator");
        return queryLocalInterface instanceof j6 ? (j6) queryLocalInterface : new k6(iBinder);
    }
}
