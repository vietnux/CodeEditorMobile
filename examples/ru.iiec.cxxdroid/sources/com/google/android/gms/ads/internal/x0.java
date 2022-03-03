package com.google.android.gms.ads.internal;

import android.os.Build;
import com.google.android.gms.ads.internal.overlay.a;
import com.google.android.gms.ads.internal.overlay.l;
import com.google.android.gms.ads.internal.overlay.u;
import com.google.android.gms.ads.internal.overlay.v;
import com.google.android.gms.common.util.e;
import com.google.android.gms.common.util.h;
import com.google.android.gms.internal.ads.aa;
import com.google.android.gms.internal.ads.b20;
import com.google.android.gms.internal.ads.bc;
import com.google.android.gms.internal.ads.c20;
import com.google.android.gms.internal.ads.e10;
import com.google.android.gms.internal.ads.e9;
import com.google.android.gms.internal.ads.ee;
import com.google.android.gms.internal.ads.fa;
import com.google.android.gms.internal.ads.g8;
import com.google.android.gms.internal.ads.ga;
import com.google.android.gms.internal.ads.ha;
import com.google.android.gms.internal.ads.i5;
import com.google.android.gms.internal.ads.ia;
import com.google.android.gms.internal.ads.ja;
import com.google.android.gms.internal.ads.jh0;
import com.google.android.gms.internal.ads.k2;
import com.google.android.gms.internal.ads.ki0;
import com.google.android.gms.internal.ads.l2;
import com.google.android.gms.internal.ads.la;
import com.google.android.gms.internal.ads.m0;
import com.google.android.gms.internal.ads.ma;
import com.google.android.gms.internal.ads.p;
import com.google.android.gms.internal.ads.p80;
import com.google.android.gms.internal.ads.q20;
import com.google.android.gms.internal.ads.rb;
import com.google.android.gms.internal.ads.rf0;
import com.google.android.gms.internal.ads.sb;
import com.google.android.gms.internal.ads.sg;
import com.google.android.gms.internal.ads.u9;
import com.google.android.gms.internal.ads.v8;
import com.google.android.gms.internal.ads.va;
import com.google.android.gms.internal.ads.vf;
import com.google.android.gms.internal.ads.we0;
import com.google.android.gms.internal.ads.xd;

@k2
public final class x0 {
    private static final Object F = new Object();
    private static x0 G;
    private final ee A;
    private final rf0 B;
    private final ma C;
    private final bc D;
    private final e9 E;
    private final a a = new a();

    /* renamed from: b  reason: collision with root package name */
    private final l2 f3351b = new l2();

    /* renamed from: c  reason: collision with root package name */
    private final l f3352c = new l();

    /* renamed from: d  reason: collision with root package name */
    private final m0 f3353d = new m0();

    /* renamed from: e  reason: collision with root package name */
    private final u9 f3354e = new u9();

    /* renamed from: f  reason: collision with root package name */
    private final sg f3355f = new sg();

    /* renamed from: g  reason: collision with root package name */
    private final aa f3356g;

    /* renamed from: h  reason: collision with root package name */
    private final e10 f3357h;

    /* renamed from: i  reason: collision with root package name */
    private final v8 f3358i;

    /* renamed from: j  reason: collision with root package name */
    private final c20 f3359j;

    /* renamed from: k  reason: collision with root package name */
    private final e f3360k;

    /* renamed from: l  reason: collision with root package name */
    private final e f3361l;

    /* renamed from: m  reason: collision with root package name */
    private final p80 f3362m;
    private final va n;
    private final i5 o;
    private final xd p;
    private final we0 q;
    private final jh0 r;
    private final rb s;
    private final u t;
    private final v u;
    private final ki0 v;
    private final sb w;
    private final p x;
    private final g8 y;
    private final vf z;

    static {
        x0 x0Var = new x0();
        synchronized (F) {
            G = x0Var;
        }
    }

    protected x0() {
        int i2 = Build.VERSION.SDK_INT;
        this.f3356g = i2 >= 21 ? new la() : i2 >= 19 ? new ja() : i2 >= 18 ? new ha() : i2 >= 17 ? new ga() : i2 >= 16 ? new ia() : new fa();
        this.f3357h = new e10();
        this.f3358i = new v8();
        this.E = new e9();
        new b20();
        this.f3359j = new c20();
        this.f3360k = h.d();
        this.f3361l = new e();
        this.f3362m = new p80();
        this.n = new va();
        this.o = new i5();
        this.B = new rf0();
        this.p = new xd();
        this.q = new we0();
        this.r = new jh0();
        this.s = new rb();
        this.t = new u();
        this.u = new v();
        this.v = new ki0();
        this.w = new sb();
        new d0();
        this.x = new p();
        new q20();
        this.y = new g8();
        this.z = new vf();
        this.A = new ee();
        this.C = new ma();
        this.D = new bc();
    }

    public static vf A() {
        return a().z;
    }

    public static ee B() {
        return a().A;
    }

    public static g8 C() {
        return a().y;
    }

    public static rf0 D() {
        return a().B;
    }

    public static ma E() {
        return a().C;
    }

    public static bc F() {
        return a().D;
    }

    private static x0 a() {
        x0 x0Var;
        synchronized (F) {
            x0Var = G;
        }
        return x0Var;
    }

    public static l2 b() {
        return a().f3351b;
    }

    public static a c() {
        return a().a;
    }

    public static l d() {
        return a().f3352c;
    }

    public static m0 e() {
        return a().f3353d;
    }

    public static u9 f() {
        return a().f3354e;
    }

    public static sg g() {
        return a().f3355f;
    }

    public static aa h() {
        return a().f3356g;
    }

    public static e10 i() {
        return a().f3357h;
    }

    public static v8 j() {
        return a().f3358i;
    }

    public static e9 k() {
        return a().E;
    }

    public static c20 l() {
        return a().f3359j;
    }

    public static e m() {
        return a().f3360k;
    }

    public static e n() {
        return a().f3361l;
    }

    public static p80 o() {
        return a().f3362m;
    }

    public static va p() {
        return a().n;
    }

    public static i5 q() {
        return a().o;
    }

    public static xd r() {
        return a().p;
    }

    public static we0 s() {
        return a().q;
    }

    public static jh0 t() {
        return a().r;
    }

    public static rb u() {
        return a().s;
    }

    public static p v() {
        return a().x;
    }

    public static u w() {
        return a().t;
    }

    public static v x() {
        return a().u;
    }

    public static ki0 y() {
        return a().v;
    }

    public static sb z() {
        return a().w;
    }
}
