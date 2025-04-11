package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.i;
import com.google.android.gms.common.internal.f0.a;
import com.google.android.gms.common.internal.f0.c;
import com.google.android.gms.common.internal.s;
import e.b.b.a.b.b;

public class j extends a {
    public static final Parcelable.Creator<j> CREATOR = new k();

    /* renamed from: b  reason: collision with root package name */
    private final String f3706b;

    /* renamed from: c  reason: collision with root package name */
    private final i.a f3707c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f3708d;

    j(String str, IBinder iBinder, boolean z) {
        this.f3706b = str;
        this.f3707c = a(iBinder);
        this.f3708d = z;
    }

    j(String str, i.a aVar, boolean z) {
        this.f3706b = str;
        this.f3707c = aVar;
        this.f3708d = z;
    }

    private static i.a a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        try {
            e.b.b.a.b.a l1 = s.a.a(iBinder).l1();
            byte[] bArr = l1 == null ? null : (byte[]) b.y(l1);
            if (bArr != null) {
                return new u(bArr);
            }
            Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
            return null;
        } catch (RemoteException e2) {
            Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e2);
            return null;
        }
    }

    public boolean t() {
        return this.f3708d;
    }

    public IBinder u() {
        i.a aVar = this.f3707c;
        if (aVar == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            return null;
        }
        aVar.asBinder();
        return aVar;
    }

    public String v() {
        return this.f3706b;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a = c.a(parcel);
        c.a(parcel, 1, v(), false);
        c.a(parcel, 2, u(), false);
        c.a(parcel, 3, t());
        c.a(parcel, a);
    }
}
