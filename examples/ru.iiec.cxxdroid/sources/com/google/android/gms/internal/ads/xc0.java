package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import e.b.b.a.b.c;

@k2
public final class xc0 extends c<jb0> {
    public xc0() {
        super("com.google.android.gms.ads.NativeAdViewHolderDelegateCreatorImpl");
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* access modifiers changed from: protected */
    @Override // e.b.b.a.b.c
    public final /* synthetic */ jb0 a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegateCreator");
        return queryLocalInterface instanceof jb0 ? (jb0) queryLocalInterface : new kb0(iBinder);
    }
}
