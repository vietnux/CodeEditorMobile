package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.f0.a;
import com.google.android.gms.common.internal.f0.c;
import com.google.android.gms.common.n;

@k2
public final class sc extends a {
    public static final Parcelable.Creator<sc> CREATOR = new tc();

    /* renamed from: b  reason: collision with root package name */
    public String f5529b;

    /* renamed from: c  reason: collision with root package name */
    public int f5530c;

    /* renamed from: d  reason: collision with root package name */
    public int f5531d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f5532e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f5533f;

    public sc(int i2, int i3, boolean z) {
        this(i2, i3, z, false, false);
    }

    public sc(int i2, int i3, boolean z, boolean z2) {
        this((int) n.GOOGLE_PLAY_SERVICES_VERSION_CODE, i3, true, false, z2);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private sc(int r9, int r10, boolean r11, boolean r12, boolean r13) {
        /*
            r8 = this;
            if (r11 == 0) goto L_0x0005
            java.lang.String r12 = "0"
            goto L_0x0007
        L_0x0005:
            java.lang.String r12 = "1"
        L_0x0007:
            int r0 = r12.length()
            int r0 = r0 + 36
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = "afma-sdk-a-v"
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = "."
            r1.append(r0)
            r1.append(r10)
            r1.append(r0)
            r1.append(r12)
            java.lang.String r3 = r1.toString()
            r2 = r8
            r4 = r9
            r5 = r10
            r6 = r11
            r7 = r13
            r2.<init>(r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.sc.<init>(int, int, boolean, boolean, boolean):void");
    }

    sc(String str, int i2, int i3, boolean z, boolean z2) {
        this.f5529b = str;
        this.f5530c = i2;
        this.f5531d = i3;
        this.f5532e = z;
        this.f5533f = z2;
    }

    public static sc t() {
        return new sc(12451009, 12451009, true);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = c.a(parcel);
        c.a(parcel, 2, this.f5529b, false);
        c.a(parcel, 3, this.f5530c);
        c.a(parcel, 4, this.f5531d);
        c.a(parcel, 5, this.f5532e);
        c.a(parcel, 6, this.f5533f);
        c.a(parcel, a);
    }
}
