package com.google.android.gms.internal.ads;

import android.location.Location;
import com.google.android.gms.ads.l;
import com.google.android.gms.ads.mediation.i;
import com.google.android.gms.ads.n.d;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

@k2
public final class tj0 implements i {
    private final Date a;

    /* renamed from: b  reason: collision with root package name */
    private final int f5627b;

    /* renamed from: c  reason: collision with root package name */
    private final Set<String> f5628c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f5629d;

    /* renamed from: e  reason: collision with root package name */
    private final Location f5630e;

    /* renamed from: f  reason: collision with root package name */
    private final int f5631f;

    /* renamed from: g  reason: collision with root package name */
    private final na0 f5632g;

    /* renamed from: h  reason: collision with root package name */
    private final List<String> f5633h = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    private final boolean f5634i;

    /* renamed from: j  reason: collision with root package name */
    private final Map<String, Boolean> f5635j = new HashMap();

    public tj0(Date date, int i2, Set<String> set, Location location, boolean z, int i3, na0 na0, List<String> list, boolean z2) {
        Map<String, Boolean> map;
        String str;
        boolean z3;
        this.a = date;
        this.f5627b = i2;
        this.f5628c = set;
        this.f5630e = location;
        this.f5629d = z;
        this.f5631f = i3;
        this.f5632g = na0;
        this.f5634i = z2;
        if (list != null) {
            for (String str2 : list) {
                if (str2.startsWith("custom:")) {
                    String[] split = str2.split(":", 3);
                    if (split.length == 3) {
                        if ("true".equals(split[2])) {
                            map = this.f5635j;
                            str = split[1];
                            z3 = true;
                        } else if ("false".equals(split[2])) {
                            map = this.f5635j;
                            str = split[1];
                            z3 = false;
                        }
                        map.put(str, z3);
                    }
                } else {
                    this.f5633h.add(str2);
                }
            }
        }
    }

    @Override // com.google.android.gms.ads.mediation.a
    public final boolean a() {
        return this.f5634i;
    }

    @Override // com.google.android.gms.ads.mediation.i
    public final Map<String, Boolean> b() {
        return this.f5635j;
    }

    @Override // com.google.android.gms.ads.mediation.i
    public final boolean c() {
        List<String> list = this.f5633h;
        if (list != null) {
            return list.contains("2") || this.f5633h.contains("6");
        }
        return false;
    }

    @Override // com.google.android.gms.ads.mediation.a
    public final Date d() {
        return this.a;
    }

    @Override // com.google.android.gms.ads.mediation.a
    public final boolean e() {
        return this.f5629d;
    }

    @Override // com.google.android.gms.ads.mediation.a
    public final Set<String> f() {
        return this.f5628c;
    }

    @Override // com.google.android.gms.ads.mediation.i
    public final boolean g() {
        List<String> list = this.f5633h;
        return list != null && list.contains("3");
    }

    @Override // com.google.android.gms.ads.mediation.i
    public final d h() {
        t70 t70;
        if (this.f5632g == null) {
            return null;
        }
        d.a aVar = new d.a();
        aVar.b(this.f5632g.f5080c);
        aVar.b(this.f5632g.f5081d);
        aVar.a(this.f5632g.f5082e);
        na0 na0 = this.f5632g;
        if (na0.f5079b >= 2) {
            aVar.a(na0.f5083f);
        }
        na0 na02 = this.f5632g;
        if (na02.f5079b >= 3 && (t70 = na02.f5084g) != null) {
            aVar.a(new l(t70));
        }
        return aVar.a();
    }

    @Override // com.google.android.gms.ads.mediation.a
    public final int i() {
        return this.f5631f;
    }

    @Override // com.google.android.gms.ads.mediation.i
    public final boolean j() {
        List<String> list = this.f5633h;
        return list != null && list.contains("6");
    }

    @Override // com.google.android.gms.ads.mediation.a
    public final Location k() {
        return this.f5630e;
    }

    @Override // com.google.android.gms.ads.mediation.i
    public final boolean l() {
        List<String> list = this.f5633h;
        if (list != null) {
            return list.contains("1") || this.f5633h.contains("6");
        }
        return false;
    }

    @Override // com.google.android.gms.ads.mediation.a
    public final int m() {
        return this.f5627b;
    }
}
