package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
import org.json.JSONObject;

@k2
public final class q8 {
    public final String A;
    public final String B;
    public final da0 C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public final List<String> J;
    public final r20 K;
    public final boolean L;
    public final boolean M;
    public final boolean N;
    public final boolean O;
    public final j40 a;

    /* renamed from: b  reason: collision with root package name */
    public final lg f5319b;

    /* renamed from: c  reason: collision with root package name */
    public final List<String> f5320c;

    /* renamed from: d  reason: collision with root package name */
    public final int f5321d;

    /* renamed from: e  reason: collision with root package name */
    public final List<String> f5322e;

    /* renamed from: f  reason: collision with root package name */
    public final List<String> f5323f;

    /* renamed from: g  reason: collision with root package name */
    public final List<String> f5324g;

    /* renamed from: h  reason: collision with root package name */
    public final int f5325h;

    /* renamed from: i  reason: collision with root package name */
    public final long f5326i;

    /* renamed from: j  reason: collision with root package name */
    public final String f5327j;

    /* renamed from: k  reason: collision with root package name */
    public final JSONObject f5328k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f5329l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f5330m;
    public final boolean n;
    public final ai0 o;
    public final ui0 p;
    public final String q;
    public final bi0 r;
    public final ei0 s;
    public final String t;
    public final n40 u;
    public final o7 v;
    public final List<String> w;
    public final List<String> x;
    public final long y;
    public final long z;

    public q8(j40 j40, lg lgVar, List<String> list, int i2, List<String> list2, List<String> list3, int i3, long j2, String str, boolean z2, ai0 ai0, ui0 ui0, String str2, bi0 bi0, ei0 ei0, long j3, n40 n40, long j4, long j5, long j6, String str3, JSONObject jSONObject, da0 da0, o7 o7Var, List<String> list4, List<String> list5, boolean z3, p3 p3Var, String str4, List<String> list6, String str5, r20 r20, boolean z4, boolean z5, boolean z6, List<String> list7, boolean z7, String str6) {
        this.D = false;
        this.E = false;
        this.F = false;
        this.G = false;
        this.H = false;
        this.I = false;
        this.a = j40;
        this.f5319b = lgVar;
        this.f5320c = a(list);
        this.f5321d = i2;
        this.f5322e = a(list2);
        this.f5324g = a(list3);
        this.f5325h = i3;
        this.f5326i = j2;
        this.f5327j = str;
        this.n = z2;
        this.o = ai0;
        this.p = ui0;
        this.q = str2;
        this.r = bi0;
        this.s = ei0;
        this.u = n40;
        this.y = j5;
        this.z = j6;
        this.A = str3;
        this.f5328k = jSONObject;
        this.C = da0;
        this.v = o7Var;
        this.w = a(list4);
        this.x = a(list5);
        this.f5329l = z3;
        this.t = str4;
        this.J = a(list6);
        this.B = str5;
        this.K = r20;
        this.L = z4;
        this.M = z5;
        this.N = z6;
        this.f5323f = a(list7);
        this.O = z7;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public q8(com.google.android.gms.internal.ads.r8 r46, com.google.android.gms.internal.ads.lg r47, com.google.android.gms.internal.ads.ai0 r48, com.google.android.gms.internal.ads.ui0 r49, java.lang.String r50, com.google.android.gms.internal.ads.ei0 r51, com.google.android.gms.internal.ads.da0 r52, java.lang.String r53) {
        /*
        // Method dump skipped, instructions count: 126
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.q8.<init>(com.google.android.gms.internal.ads.r8, com.google.android.gms.internal.ads.lg, com.google.android.gms.internal.ads.ai0, com.google.android.gms.internal.ads.ui0, java.lang.String, com.google.android.gms.internal.ads.ei0, com.google.android.gms.internal.ads.da0, java.lang.String):void");
    }

    private static <T> List<T> a(List<T> list) {
        if (list == null) {
            return null;
        }
        return Collections.unmodifiableList(list);
    }

    public final boolean a() {
        lg lgVar = this.f5319b;
        if (lgVar == null || lgVar.M() == null) {
            return false;
        }
        return this.f5319b.M().j();
    }
}
