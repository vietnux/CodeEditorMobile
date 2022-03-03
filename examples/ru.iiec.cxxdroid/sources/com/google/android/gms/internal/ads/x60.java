package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.mediation.b;
import com.google.android.gms.ads.mediation.j;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;

public final class x60 {
    private final HashSet<String> a = new HashSet<>();

    /* renamed from: b */
    private final Bundle f5994b = new Bundle();

    /* renamed from: c */
    private final HashMap<Class<? extends j>, j> f5995c = new HashMap<>();

    /* renamed from: d */
    private final HashSet<String> f5996d = new HashSet<>();

    /* renamed from: e */
    private final Bundle f5997e = new Bundle();

    /* renamed from: f */
    private final HashSet<String> f5998f = new HashSet<>();

    /* renamed from: g */
    private Date f5999g;

    /* renamed from: h */
    private String f6000h;

    /* renamed from: i */
    private int f6001i = -1;

    /* renamed from: j */
    private Location f6002j;

    /* renamed from: k */
    private boolean f6003k = false;

    /* renamed from: l */
    private String f6004l;

    /* renamed from: m */
    private String f6005m;
    private int n = -1;
    private boolean o;

    public final void a(int i2) {
        this.f6001i = i2;
    }

    public final void a(Location location) {
        this.f6002j = location;
    }

    public final void a(Class<? extends b> cls, Bundle bundle) {
        this.f5994b.putBundle(cls.getName(), bundle);
    }

    public final void a(String str) {
        this.a.add(str);
    }

    public final void a(Date date) {
        this.f5999g = date;
    }

    public final void a(boolean z) {
        this.n = z ? 1 : 0;
    }

    public final void b(String str) {
        this.f5996d.add(str);
    }

    public final void b(boolean z) {
        this.o = z;
    }

    public final void c(String str) {
        this.f5996d.remove(str);
    }
}
