package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.f0.a;
import com.google.android.gms.common.internal.f0.c;
import java.util.Collections;
import java.util.List;

@k2
public final class n3 extends a {
    public static final Parcelable.Creator<n3> CREATOR = new o3();
    public String A;
    public final String B;
    public final boolean C;
    public final boolean D;
    public final o7 E;
    public final List<String> F;
    public final List<String> G;
    public final boolean H;
    public final p3 I;
    public final boolean J;
    public String K;
    public final List<String> L;
    public final boolean M;
    public final String N;
    public final y7 O;
    public final String P;
    public final boolean Q;
    public final boolean R;
    private Bundle S;
    public final boolean T;
    public final int U;
    public final boolean V;
    public final List<String> W;
    public final boolean X;
    public final String Y;

    /* renamed from: b  reason: collision with root package name */
    private j3 f5023b;

    /* renamed from: c  reason: collision with root package name */
    private final int f5024c;

    /* renamed from: d  reason: collision with root package name */
    public final String f5025d;

    /* renamed from: e  reason: collision with root package name */
    public String f5026e;

    /* renamed from: f  reason: collision with root package name */
    public final List<String> f5027f;

    /* renamed from: g  reason: collision with root package name */
    public final int f5028g;

    /* renamed from: h  reason: collision with root package name */
    public final List<String> f5029h;

    /* renamed from: i  reason: collision with root package name */
    public final long f5030i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f5031j;

    /* renamed from: k  reason: collision with root package name */
    public final long f5032k;

    /* renamed from: l  reason: collision with root package name */
    public final List<String> f5033l;

    /* renamed from: m  reason: collision with root package name */
    public final long f5034m;
    public final int n;
    public final String o;
    public final long p;
    public final String q;
    public final boolean r;
    public final String s;
    public final String t;
    public final boolean u;
    public final boolean v;
    public final boolean w;
    public final boolean x;
    public final boolean y;
    private z3 z;

    public n3(int i2) {
        this(19, null, null, null, i2, null, -1, false, -1, null, -1, -1, null, -1, null, false, null, null, false, false, false, true, false, null, null, null, false, false, null, null, null, false, null, false, null, null, false, null, null, null, true, false, null, false, 0, false, null, false, null);
    }

    public n3(int i2, long j2) {
        this(19, null, null, null, i2, null, -1, false, -1, null, j2, -1, null, -1, null, false, null, null, false, false, false, true, false, null, null, null, false, false, null, null, null, false, null, false, null, null, false, null, null, null, true, false, null, false, 0, false, null, false, null);
    }

    n3(int i2, String str, String str2, List<String> list, int i3, List<String> list2, long j2, boolean z2, long j3, List<String> list3, long j4, int i4, String str3, long j5, String str4, boolean z3, String str5, String str6, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, z3 z3Var, String str7, String str8, boolean z9, boolean z10, o7 o7Var, List<String> list4, List<String> list5, boolean z11, p3 p3Var, boolean z12, String str9, List<String> list6, boolean z13, String str10, y7 y7Var, String str11, boolean z14, boolean z15, Bundle bundle, boolean z16, int i5, boolean z17, List<String> list7, boolean z18, String str12) {
        z3 z3Var2;
        o4 o4Var;
        this.f5024c = i2;
        this.f5025d = str;
        this.f5026e = str2;
        List<String> list8 = null;
        this.f5027f = list != null ? Collections.unmodifiableList(list) : null;
        this.f5028g = i3;
        this.f5029h = list2 != null ? Collections.unmodifiableList(list2) : null;
        this.f5030i = j2;
        this.f5031j = z2;
        this.f5032k = j3;
        this.f5033l = list3 != null ? Collections.unmodifiableList(list3) : null;
        this.f5034m = j4;
        this.n = i4;
        this.o = str3;
        this.p = j5;
        this.q = str4;
        this.r = z3;
        this.s = str5;
        this.t = str6;
        this.u = z4;
        this.v = z5;
        this.w = z6;
        this.x = z7;
        this.Q = z14;
        this.y = z8;
        this.z = z3Var;
        this.A = str7;
        this.B = str8;
        if (this.f5026e == null && (z3Var2 = this.z) != null && (o4Var = (o4) z3Var2.a(o4.CREATOR)) != null && !TextUtils.isEmpty(o4Var.f5125b)) {
            this.f5026e = o4Var.f5125b;
        }
        this.C = z9;
        this.D = z10;
        this.E = o7Var;
        this.F = list4;
        this.G = list5;
        this.H = z11;
        this.I = p3Var;
        this.J = z12;
        this.K = str9;
        this.L = list6;
        this.M = z13;
        this.N = str10;
        this.O = y7Var;
        this.P = str11;
        this.R = z15;
        this.S = bundle;
        this.T = z16;
        this.U = i5;
        this.V = z17;
        this.W = list7 != null ? Collections.unmodifiableList(list7) : list8;
        this.X = z18;
        this.Y = str12;
    }

    public n3(j3 j3Var, String str, String str2, List<String> list, List<String> list2, long j2, boolean z2, long j3, List<String> list3, long j4, int i2, String str3, long j5, String str4, String str5, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, String str6, boolean z8, boolean z9, o7 o7Var, List<String> list4, List<String> list5, boolean z10, p3 p3Var, boolean z11, String str7, List<String> list6, boolean z12, String str8, y7 y7Var, String str9, boolean z13, boolean z14, boolean z15, int i3, boolean z16, List<String> list7, boolean z17, String str10) {
        this(19, str, str2, list, -2, list2, j2, z2, -1, list3, j4, i2, str3, j5, str4, false, null, str5, z3, z4, z5, z6, false, null, null, str6, z8, z9, o7Var, list4, list5, z10, p3Var, z11, str7, list6, z12, str8, y7Var, str9, z13, z14, null, z15, i3, z16, list7, z17, str10);
        this.f5023b = j3Var;
    }

    public n3(j3 j3Var, String str, String str2, List<String> list, List<String> list2, long j2, boolean z2, long j3, List<String> list3, long j4, int i2, String str3, long j5, String str4, boolean z3, String str5, String str6, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, String str7, boolean z9, boolean z10, o7 o7Var, List<String> list4, List<String> list5, boolean z11, p3 p3Var, boolean z12, String str8, List<String> list6, boolean z13, String str9, y7 y7Var, String str10, boolean z14, boolean z15, boolean z16, int i3, boolean z17, List<String> list7, boolean z18, String str11) {
        this(19, str, str2, list, -2, list2, j2, z2, j3, list3, j4, i2, str3, j5, str4, z3, str5, str6, z4, z5, z6, z7, z8, null, null, str7, z9, z10, o7Var, list4, list5, z11, p3Var, z12, str8, list6, z13, str9, y7Var, str10, z14, z15, null, z16, 0, z17, list7, z18, str11);
        this.f5023b = j3Var;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        j3 j3Var = this.f5023b;
        if (j3Var != null && j3Var.f4660b >= 9 && !TextUtils.isEmpty(this.f5026e)) {
            this.z = new z3(new o4(this.f5026e));
            this.f5026e = null;
        }
        int a = c.a(parcel);
        c.a(parcel, 1, this.f5024c);
        c.a(parcel, 2, this.f5025d, false);
        c.a(parcel, 3, this.f5026e, false);
        c.b(parcel, 4, this.f5027f, false);
        c.a(parcel, 5, this.f5028g);
        c.b(parcel, 6, this.f5029h, false);
        c.a(parcel, 7, this.f5030i);
        c.a(parcel, 8, this.f5031j);
        c.a(parcel, 9, this.f5032k);
        c.b(parcel, 10, this.f5033l, false);
        c.a(parcel, 11, this.f5034m);
        c.a(parcel, 12, this.n);
        c.a(parcel, 13, this.o, false);
        c.a(parcel, 14, this.p);
        c.a(parcel, 15, this.q, false);
        c.a(parcel, 18, this.r);
        c.a(parcel, 19, this.s, false);
        c.a(parcel, 21, this.t, false);
        c.a(parcel, 22, this.u);
        c.a(parcel, 23, this.v);
        c.a(parcel, 24, this.w);
        c.a(parcel, 25, this.x);
        c.a(parcel, 26, this.y);
        c.a(parcel, 28, (Parcelable) this.z, i2, false);
        c.a(parcel, 29, this.A, false);
        c.a(parcel, 30, this.B, false);
        c.a(parcel, 31, this.C);
        c.a(parcel, 32, this.D);
        c.a(parcel, 33, (Parcelable) this.E, i2, false);
        c.b(parcel, 34, this.F, false);
        c.b(parcel, 35, this.G, false);
        c.a(parcel, 36, this.H);
        c.a(parcel, 37, (Parcelable) this.I, i2, false);
        c.a(parcel, 38, this.J);
        c.a(parcel, 39, this.K, false);
        c.b(parcel, 40, this.L, false);
        c.a(parcel, 42, this.M);
        c.a(parcel, 43, this.N, false);
        c.a(parcel, 44, (Parcelable) this.O, i2, false);
        c.a(parcel, 45, this.P, false);
        c.a(parcel, 46, this.Q);
        c.a(parcel, 47, this.R);
        c.a(parcel, 48, this.S, false);
        c.a(parcel, 49, this.T);
        c.a(parcel, 50, this.U);
        c.a(parcel, 51, this.V);
        c.b(parcel, 52, this.W, false);
        c.a(parcel, 53, this.X);
        c.a(parcel, 54, this.Y, false);
        c.a(parcel, a);
    }
}
