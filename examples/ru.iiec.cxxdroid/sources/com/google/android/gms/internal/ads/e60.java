package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import e.b.b.a.b.a;

public abstract class e60 extends gz implements d60 {
    public e60() {
        super("com.google.android.gms.ads.internal.client.IClientApi");
    }

    public static d60 asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IClientApi");
        return queryLocalInterface instanceof d60 ? (d60) queryLocalInterface : new f60(iBinder);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.gz
    public final boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) {
        IInterface iInterface;
        switch (i2) {
            case 1:
                iInterface = createBannerAdManager(a.AbstractBinderC0100a.a(parcel.readStrongBinder()), (n40) hz.a(parcel, n40.CREATOR), parcel.readString(), si0.a(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 2:
                iInterface = createInterstitialAdManager(a.AbstractBinderC0100a.a(parcel.readStrongBinder()), (n40) hz.a(parcel, n40.CREATOR), parcel.readString(), si0.a(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 3:
                iInterface = createAdLoaderBuilder(a.AbstractBinderC0100a.a(parcel.readStrongBinder()), parcel.readString(), si0.a(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 4:
                iInterface = getMobileAdsSettingsManager(a.AbstractBinderC0100a.a(parcel.readStrongBinder()));
                break;
            case 5:
                iInterface = createNativeAdViewDelegate(a.AbstractBinderC0100a.a(parcel.readStrongBinder()), a.AbstractBinderC0100a.a(parcel.readStrongBinder()));
                break;
            case 6:
                iInterface = createRewardedVideoAd(a.AbstractBinderC0100a.a(parcel.readStrongBinder()), si0.a(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 7:
                iInterface = createInAppPurchaseManager(a.AbstractBinderC0100a.a(parcel.readStrongBinder()));
                break;
            case 8:
                iInterface = createAdOverlay(a.AbstractBinderC0100a.a(parcel.readStrongBinder()));
                break;
            case 9:
                iInterface = getMobileAdsSettingsManagerWithClientJarVersion(a.AbstractBinderC0100a.a(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 10:
                iInterface = createSearchAdManager(a.AbstractBinderC0100a.a(parcel.readStrongBinder()), (n40) hz.a(parcel, n40.CREATOR), parcel.readString(), parcel.readInt());
                break;
            case 11:
                iInterface = createNativeAdViewHolderDelegate(a.AbstractBinderC0100a.a(parcel.readStrongBinder()), a.AbstractBinderC0100a.a(parcel.readStrongBinder()), a.AbstractBinderC0100a.a(parcel.readStrongBinder()));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        hz.a(parcel2, iInterface);
        return true;
    }
}
