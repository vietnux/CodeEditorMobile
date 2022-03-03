package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.f0.a;
import com.google.android.gms.common.internal.f0.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

@k2
public final class j3 extends a {
    public static final Parcelable.Creator<j3> CREATOR = new l3();
    public final List<String> A;
    public final long B;
    public final String C;
    public final float D;
    public final int E;
    public final int F;
    public final boolean G;
    public final boolean H;
    public final String I;
    public final boolean J;
    public final String K;
    public final boolean L;
    public final int M;
    public final Bundle N;
    public final String O;
    public final u60 P;
    public final boolean Q;
    public final Bundle R;
    public final String S;
    public final String T;
    public final String U;
    public final boolean V;
    public final List<Integer> W;
    public final String X;
    public final List<String> Y;
    public final int Z;
    public final boolean a0;

    /* renamed from: b  reason: collision with root package name */
    public final int f4660b;
    public final boolean b0;

    /* renamed from: c  reason: collision with root package name */
    public final Bundle f4661c;
    public final boolean c0;

    /* renamed from: d  reason: collision with root package name */
    public final j40 f4662d;
    public final ArrayList<String> d0;

    /* renamed from: e  reason: collision with root package name */
    public final n40 f4663e;

    /* renamed from: f  reason: collision with root package name */
    public final String f4664f;

    /* renamed from: g  reason: collision with root package name */
    public final ApplicationInfo f4665g;

    /* renamed from: h  reason: collision with root package name */
    public final PackageInfo f4666h;

    /* renamed from: i  reason: collision with root package name */
    public final String f4667i;

    /* renamed from: j  reason: collision with root package name */
    public final String f4668j;

    /* renamed from: k  reason: collision with root package name */
    public final String f4669k;

    /* renamed from: l  reason: collision with root package name */
    public final sc f4670l;

    /* renamed from: m  reason: collision with root package name */
    public final Bundle f4671m;
    public final int n;
    public final List<String> o;
    public final Bundle p;
    public final boolean q;
    public final int r;
    public final int s;
    public final float t;
    public final String u;
    public final long v;
    public final String w;
    public final List<String> x;
    public final String y;
    public final na0 z;

    j3(int i2, Bundle bundle, j40 j40, n40 n40, String str, ApplicationInfo applicationInfo, PackageInfo packageInfo, String str2, String str3, String str4, sc scVar, Bundle bundle2, int i3, List<String> list, Bundle bundle3, boolean z2, int i4, int i5, float f2, String str5, long j2, String str6, List<String> list2, String str7, na0 na0, List<String> list3, long j3, String str8, float f3, boolean z3, int i6, int i7, boolean z4, boolean z5, String str9, String str10, boolean z6, int i8, Bundle bundle4, String str11, u60 u60, boolean z7, Bundle bundle5, String str12, String str13, String str14, boolean z8, List<Integer> list4, String str15, List<String> list5, int i9, boolean z9, boolean z10, boolean z11, ArrayList<String> arrayList) {
        this.f4660b = i2;
        this.f4661c = bundle;
        this.f4662d = j40;
        this.f4663e = n40;
        this.f4664f = str;
        this.f4665g = applicationInfo;
        this.f4666h = packageInfo;
        this.f4667i = str2;
        this.f4668j = str3;
        this.f4669k = str4;
        this.f4670l = scVar;
        this.f4671m = bundle2;
        this.n = i3;
        this.o = list;
        this.A = list3 == null ? Collections.emptyList() : Collections.unmodifiableList(list3);
        this.p = bundle3;
        this.q = z2;
        this.r = i4;
        this.s = i5;
        this.t = f2;
        this.u = str5;
        this.v = j2;
        this.w = str6;
        this.x = list2 == null ? Collections.emptyList() : Collections.unmodifiableList(list2);
        this.y = str7;
        this.z = na0;
        this.B = j3;
        this.C = str8;
        this.D = f3;
        this.J = z3;
        this.E = i6;
        this.F = i7;
        this.G = z4;
        this.H = z5;
        this.I = str9;
        this.K = str10;
        this.L = z6;
        this.M = i8;
        this.N = bundle4;
        this.O = str11;
        this.P = u60;
        this.Q = z7;
        this.R = bundle5;
        this.S = str12;
        this.T = str13;
        this.U = str14;
        this.V = z8;
        this.W = list4;
        this.X = str15;
        this.Y = list5;
        this.Z = i9;
        this.a0 = z9;
        this.b0 = z10;
        this.c0 = z11;
        this.d0 = arrayList;
    }

    private j3(Bundle bundle, j40 j40, n40 n40, String str, ApplicationInfo applicationInfo, PackageInfo packageInfo, String str2, String str3, String str4, sc scVar, Bundle bundle2, int i2, List<String> list, List<String> list2, Bundle bundle3, boolean z2, int i3, int i4, float f2, String str5, long j2, String str6, List<String> list3, String str7, na0 na0, long j3, String str8, float f3, boolean z3, int i5, int i6, boolean z4, boolean z5, String str9, String str10, boolean z6, int i7, Bundle bundle4, String str11, u60 u60, boolean z7, Bundle bundle5, String str12, String str13, String str14, boolean z8, List<Integer> list4, String str15, List<String> list5, int i8, boolean z9, boolean z10, boolean z11, ArrayList<String> arrayList) {
        this(24, bundle, j40, n40, str, applicationInfo, packageInfo, str2, str3, str4, scVar, bundle2, i2, list, bundle3, z2, i3, i4, f2, str5, j2, str6, list3, str7, na0, list2, j3, str8, f3, z3, i5, i6, z4, z5, str9, str10, z6, i7, bundle4, str11, u60, z7, bundle5, str12, str13, str14, z8, list4, str15, list5, i8, z9, z10, z11, arrayList);
    }

    public j3(k3 k3Var, long j2, String str, String str2, String str3) {
        this(k3Var.a, k3Var.f4757b, k3Var.f4758c, k3Var.f4759d, k3Var.f4760e, k3Var.f4761f, (String) ad.a(k3Var.Q, ""), k3Var.f4762g, k3Var.f4763h, k3Var.f4765j, k3Var.f4764i, k3Var.f4766k, k3Var.f4767l, k3Var.f4768m, k3Var.o, k3Var.p, k3Var.q, k3Var.r, k3Var.s, k3Var.t, k3Var.u, k3Var.v, k3Var.w, k3Var.x, k3Var.y, j2, k3Var.z, k3Var.A, k3Var.B, k3Var.C, k3Var.D, k3Var.E, k3Var.F, (String) ad.a(k3Var.G, "", 1, TimeUnit.SECONDS), k3Var.H, k3Var.I, k3Var.J, k3Var.K, k3Var.L, k3Var.M, k3Var.N, k3Var.O, str, str2, str3, k3Var.P, k3Var.R, k3Var.S, k3Var.n, k3Var.T, k3Var.U, k3Var.V, k3Var.W, k3Var.X);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = c.a(parcel);
        c.a(parcel, 1, this.f4660b);
        c.a(parcel, 2, this.f4661c, false);
        c.a(parcel, 3, (Parcelable) this.f4662d, i2, false);
        c.a(parcel, 4, (Parcelable) this.f4663e, i2, false);
        c.a(parcel, 5, this.f4664f, false);
        c.a(parcel, 6, (Parcelable) this.f4665g, i2, false);
        c.a(parcel, 7, (Parcelable) this.f4666h, i2, false);
        c.a(parcel, 8, this.f4667i, false);
        c.a(parcel, 9, this.f4668j, false);
        c.a(parcel, 10, this.f4669k, false);
        c.a(parcel, 11, (Parcelable) this.f4670l, i2, false);
        c.a(parcel, 12, this.f4671m, false);
        c.a(parcel, 13, this.n);
        c.b(parcel, 14, this.o, false);
        c.a(parcel, 15, this.p, false);
        c.a(parcel, 16, this.q);
        c.a(parcel, 18, this.r);
        c.a(parcel, 19, this.s);
        c.a(parcel, 20, this.t);
        c.a(parcel, 21, this.u, false);
        c.a(parcel, 25, this.v);
        c.a(parcel, 26, this.w, false);
        c.b(parcel, 27, this.x, false);
        c.a(parcel, 28, this.y, false);
        c.a(parcel, 29, (Parcelable) this.z, i2, false);
        c.b(parcel, 30, this.A, false);
        c.a(parcel, 31, this.B);
        c.a(parcel, 33, this.C, false);
        c.a(parcel, 34, this.D);
        c.a(parcel, 35, this.E);
        c.a(parcel, 36, this.F);
        c.a(parcel, 37, this.G);
        c.a(parcel, 38, this.H);
        c.a(parcel, 39, this.I, false);
        c.a(parcel, 40, this.J);
        c.a(parcel, 41, this.K, false);
        c.a(parcel, 42, this.L);
        c.a(parcel, 43, this.M);
        c.a(parcel, 44, this.N, false);
        c.a(parcel, 45, this.O, false);
        c.a(parcel, 46, (Parcelable) this.P, i2, false);
        c.a(parcel, 47, this.Q);
        c.a(parcel, 48, this.R, false);
        c.a(parcel, 49, this.S, false);
        c.a(parcel, 50, this.T, false);
        c.a(parcel, 51, this.U, false);
        c.a(parcel, 52, this.V);
        c.a(parcel, 53, this.W, false);
        c.a(parcel, 54, this.X, false);
        c.b(parcel, 55, this.Y, false);
        c.a(parcel, 56, this.Z);
        c.a(parcel, 57, this.a0);
        c.a(parcel, 58, this.b0);
        c.a(parcel, 59, this.c0);
        c.b(parcel, 60, this.d0, false);
        c.a(parcel, a);
    }
}
