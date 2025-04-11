package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import java.util.List;

@k2
public final class k40 {
    private long a;

    /* renamed from: b  reason: collision with root package name */
    private Bundle f4774b;

    /* renamed from: c  reason: collision with root package name */
    private int f4775c;

    /* renamed from: d  reason: collision with root package name */
    private List<String> f4776d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f4777e;

    /* renamed from: f  reason: collision with root package name */
    private int f4778f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f4779g;

    /* renamed from: h  reason: collision with root package name */
    private String f4780h;

    /* renamed from: i  reason: collision with root package name */
    private p70 f4781i;

    /* renamed from: j  reason: collision with root package name */
    private Location f4782j;

    /* renamed from: k  reason: collision with root package name */
    private String f4783k;

    /* renamed from: l  reason: collision with root package name */
    private Bundle f4784l;

    /* renamed from: m  reason: collision with root package name */
    private Bundle f4785m;
    private List<String> n;
    private String o;
    private String p;

    public k40(j40 j40) {
        this.a = j40.f4675c;
        this.f4774b = j40.f4676d;
        this.f4775c = j40.f4677e;
        this.f4776d = j40.f4678f;
        this.f4777e = j40.f4679g;
        this.f4778f = j40.f4680h;
        this.f4779g = j40.f4681i;
        this.f4780h = j40.f4682j;
        this.f4781i = j40.f4683k;
        this.f4782j = j40.f4684l;
        this.f4783k = j40.f4685m;
        this.f4784l = j40.n;
        this.f4785m = j40.o;
        this.n = j40.p;
        this.o = j40.q;
        this.p = j40.r;
    }

    public final j40 a() {
        return new j40(7, this.a, this.f4774b, this.f4775c, this.f4776d, this.f4777e, this.f4778f, this.f4779g, this.f4780h, this.f4781i, this.f4782j, this.f4783k, this.f4784l, this.f4785m, this.n, this.o, this.p, false);
    }

    public final k40 a(Location location) {
        this.f4782j = null;
        return this;
    }
}
