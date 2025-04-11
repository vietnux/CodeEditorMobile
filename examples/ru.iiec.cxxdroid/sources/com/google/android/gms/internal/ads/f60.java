package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import e.b.b.a.b.a;

public final class f60 extends fz implements d60 {
    f60(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // com.google.android.gms.internal.ads.d60
    public final m50 createAdLoaderBuilder(a aVar, String str, ri0 ri0, int i2) {
        m50 m50;
        Parcel M = M();
        hz.a(M, aVar);
        M.writeString(str);
        hz.a(M, ri0);
        M.writeInt(i2);
        Parcel a = a(3, M);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            m50 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            m50 = queryLocalInterface instanceof m50 ? (m50) queryLocalInterface : new o50(readStrongBinder);
        }
        a.recycle();
        return m50;
    }

    @Override // com.google.android.gms.internal.ads.d60
    public final r createAdOverlay(a aVar) {
        Parcel M = M();
        hz.a(M, aVar);
        Parcel a = a(8, M);
        r a2 = s.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    @Override // com.google.android.gms.internal.ads.d60
    public final r50 createBannerAdManager(a aVar, n40 n40, String str, ri0 ri0, int i2) {
        r50 r50;
        Parcel M = M();
        hz.a(M, aVar);
        hz.a(M, n40);
        M.writeString(str);
        hz.a(M, ri0);
        M.writeInt(i2);
        Parcel a = a(1, M);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            r50 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            r50 = queryLocalInterface instanceof r50 ? (r50) queryLocalInterface : new t50(readStrongBinder);
        }
        a.recycle();
        return r50;
    }

    @Override // com.google.android.gms.internal.ads.d60
    public final r50 createInterstitialAdManager(a aVar, n40 n40, String str, ri0 ri0, int i2) {
        r50 r50;
        Parcel M = M();
        hz.a(M, aVar);
        hz.a(M, n40);
        M.writeString(str);
        hz.a(M, ri0);
        M.writeInt(i2);
        Parcel a = a(2, M);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            r50 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            r50 = queryLocalInterface instanceof r50 ? (r50) queryLocalInterface : new t50(readStrongBinder);
        }
        a.recycle();
        return r50;
    }

    @Override // com.google.android.gms.internal.ads.d60
    public final f6 createRewardedVideoAd(a aVar, ri0 ri0, int i2) {
        Parcel M = M();
        hz.a(M, aVar);
        hz.a(M, ri0);
        M.writeInt(i2);
        Parcel a = a(6, M);
        f6 a2 = h6.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    @Override // com.google.android.gms.internal.ads.d60
    public final r50 createSearchAdManager(a aVar, n40 n40, String str, int i2) {
        r50 r50;
        Parcel M = M();
        hz.a(M, aVar);
        hz.a(M, n40);
        M.writeString(str);
        M.writeInt(i2);
        Parcel a = a(10, M);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            r50 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            r50 = queryLocalInterface instanceof r50 ? (r50) queryLocalInterface : new t50(readStrongBinder);
        }
        a.recycle();
        return r50;
    }

    @Override // com.google.android.gms.internal.ads.d60
    public final j60 getMobileAdsSettingsManagerWithClientJarVersion(a aVar, int i2) {
        j60 j60;
        Parcel M = M();
        hz.a(M, aVar);
        M.writeInt(i2);
        Parcel a = a(9, M);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            j60 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            j60 = queryLocalInterface instanceof j60 ? (j60) queryLocalInterface : new l60(readStrongBinder);
        }
        a.recycle();
        return j60;
    }
}
