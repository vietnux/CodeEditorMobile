package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.f0.a;
import com.google.android.gms.common.internal.f0.c;

public final class lj extends a {
    public static final Parcelable.Creator<lj> CREATOR = new mj();

    /* renamed from: b  reason: collision with root package name */
    private final int f4900b;

    /* renamed from: c  reason: collision with root package name */
    private xp f4901c = null;

    /* renamed from: d  reason: collision with root package name */
    private byte[] f4902d;

    lj(int i2, byte[] bArr) {
        this.f4900b = i2;
        this.f4902d = bArr;
        u();
    }

    private final void u() {
        if (this.f4901c == null && this.f4902d != null) {
            return;
        }
        if (this.f4901c != null && this.f4902d == null) {
            return;
        }
        if (this.f4901c != null && this.f4902d != null) {
            throw new IllegalStateException("Invalid internal representation - full");
        } else if (this.f4901c == null && this.f4902d == null) {
            throw new IllegalStateException("Invalid internal representation - empty");
        } else {
            throw new IllegalStateException("Impossible");
        }
    }

    public final xp t() {
        if (!(this.f4901c != null)) {
            try {
                byte[] bArr = this.f4902d;
                xp xpVar = new xp();
                iv.a(xpVar, bArr);
                this.f4901c = xpVar;
                this.f4902d = null;
            } catch (hv e2) {
                throw new IllegalStateException(e2);
            }
        }
        u();
        return this.f4901c;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = c.a(parcel);
        c.a(parcel, 1, this.f4900b);
        byte[] bArr = this.f4902d;
        if (bArr == null) {
            bArr = iv.a(this.f4901c);
        }
        c.a(parcel, 2, bArr, false);
        c.a(parcel, a);
    }
}
