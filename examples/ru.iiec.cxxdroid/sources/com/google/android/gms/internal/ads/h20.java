package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.f0.a;
import com.google.android.gms.common.internal.f0.c;
import java.io.InputStream;

@k2
public final class h20 extends a {
    public static final Parcelable.Creator<h20> CREATOR = new i20();

    /* renamed from: b  reason: collision with root package name */
    private ParcelFileDescriptor f4469b;

    public h20() {
        this(null);
    }

    public h20(ParcelFileDescriptor parcelFileDescriptor) {
        this.f4469b = parcelFileDescriptor;
    }

    private final synchronized ParcelFileDescriptor v() {
        return this.f4469b;
    }

    public final synchronized boolean t() {
        return this.f4469b != null;
    }

    public final synchronized InputStream u() {
        if (this.f4469b == null) {
            return null;
        }
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(this.f4469b);
        this.f4469b = null;
        return autoCloseInputStream;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = c.a(parcel);
        c.a(parcel, 2, (Parcelable) v(), i2, false);
        c.a(parcel, a);
    }
}
