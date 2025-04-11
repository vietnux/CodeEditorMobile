package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.d;
import com.google.android.gms.ads.s;
import com.google.android.gms.common.internal.f0.a;
import com.google.android.gms.common.internal.f0.c;

@k2
public class n40 extends a {
    public static final Parcelable.Creator<n40> CREATOR = new o40();

    /* renamed from: b  reason: collision with root package name */
    public final String f5046b;

    /* renamed from: c  reason: collision with root package name */
    public final int f5047c;

    /* renamed from: d  reason: collision with root package name */
    public final int f5048d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f5049e;

    /* renamed from: f  reason: collision with root package name */
    public final int f5050f;

    /* renamed from: g  reason: collision with root package name */
    public final int f5051g;

    /* renamed from: h  reason: collision with root package name */
    public final n40[] f5052h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f5053i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f5054j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f5055k;

    public n40() {
        this("interstitial_mb", 0, 0, true, 0, 0, null, false, false, false);
    }

    public n40(Context context, d dVar) {
        this(context, new d[]{dVar});
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x007c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public n40(android.content.Context r13, com.google.android.gms.ads.d[] r14) {
        /*
        // Method dump skipped, instructions count: 238
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.n40.<init>(android.content.Context, com.google.android.gms.ads.d[]):void");
    }

    public n40(n40 n40, n40[] n40Arr) {
        this(n40.f5046b, n40.f5047c, n40.f5048d, n40.f5049e, n40.f5050f, n40.f5051g, n40Arr, n40.f5053i, n40.f5054j, n40.f5055k);
    }

    n40(String str, int i2, int i3, boolean z, int i4, int i5, n40[] n40Arr, boolean z2, boolean z3, boolean z4) {
        this.f5046b = str;
        this.f5047c = i2;
        this.f5048d = i3;
        this.f5049e = z;
        this.f5050f = i4;
        this.f5051g = i5;
        this.f5052h = n40Arr;
        this.f5053i = z2;
        this.f5054j = z3;
        this.f5055k = z4;
    }

    public static int a(DisplayMetrics displayMetrics) {
        return displayMetrics.widthPixels;
    }

    public static n40 a(Context context) {
        return new n40("320x50_mb", 0, 0, false, 0, 0, null, true, false, false);
    }

    public static int b(DisplayMetrics displayMetrics) {
        return (int) (((float) c(displayMetrics)) * displayMetrics.density);
    }

    private static int c(DisplayMetrics displayMetrics) {
        int i2 = (int) (((float) displayMetrics.heightPixels) / displayMetrics.density);
        if (i2 <= 400) {
            return 32;
        }
        return i2 <= 720 ? 50 : 90;
    }

    public static n40 u() {
        return new n40("reward_mb", 0, 0, true, 0, 0, null, false, false, false);
    }

    public final d t() {
        return s.a(this.f5050f, this.f5047c, this.f5046b);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a = c.a(parcel);
        c.a(parcel, 2, this.f5046b, false);
        c.a(parcel, 3, this.f5047c);
        c.a(parcel, 4, this.f5048d);
        c.a(parcel, 5, this.f5049e);
        c.a(parcel, 6, this.f5050f);
        c.a(parcel, 7, this.f5051g);
        c.a(parcel, 8, (Parcelable[]) this.f5052h, i2, false);
        c.a(parcel, 9, this.f5053i);
        c.a(parcel, 10, this.f5054j);
        c.a(parcel, 11, this.f5055k);
        c.a(parcel, a);
    }
}
