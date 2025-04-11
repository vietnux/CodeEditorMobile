package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import e.b.b.a.b.c;

@k2
public final class wc0 extends c<fb0> {
    public wc0() {
        super("com.google.android.gms.ads.NativeAdViewDelegateCreatorImpl");
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* access modifiers changed from: protected */
    @Override // e.b.b.a.b.c
    public final /* synthetic */ fb0 a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
        return queryLocalInterface instanceof fb0 ? (fb0) queryLocalInterface : new gb0(iBinder);
    }
}
