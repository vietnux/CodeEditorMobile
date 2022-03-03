package com.google.android.gms.internal.ads;

import java.util.HashMap;

public final class cw extends aw<Integer, Object> {

    /* renamed from: b  reason: collision with root package name */
    public String f4046b;

    /* renamed from: c  reason: collision with root package name */
    public long f4047c;

    /* renamed from: d  reason: collision with root package name */
    public String f4048d;

    /* renamed from: e  reason: collision with root package name */
    public String f4049e;

    /* renamed from: f  reason: collision with root package name */
    public String f4050f;

    public cw() {
        this.f4046b = "E";
        this.f4047c = -1;
        this.f4048d = "E";
        this.f4049e = "E";
        this.f4050f = "E";
    }

    public cw(String str) {
        this();
        b(str);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.aw
    public final HashMap<Integer, Object> a() {
        HashMap<Integer, Object> hashMap = new HashMap<>();
        hashMap.put(0, this.f4046b);
        hashMap.put(4, this.f4050f);
        hashMap.put(3, this.f4049e);
        hashMap.put(2, this.f4048d);
        hashMap.put(1, Long.valueOf(this.f4047c));
        return hashMap;
    }

    /* access modifiers changed from: protected */
    public final void b(String str) {
        HashMap a = aw.a(str);
        if (a != null) {
            String str2 = "E";
            this.f4046b = a.get(0) == null ? str2 : (String) a.get(0);
            this.f4047c = a.get(1) == null ? -1 : ((Long) a.get(1)).longValue();
            this.f4048d = a.get(2) == null ? str2 : (String) a.get(2);
            this.f4049e = a.get(3) == null ? str2 : (String) a.get(3);
            if (a.get(4) != null) {
                str2 = (String) a.get(4);
            }
            this.f4050f = str2;
        }
    }
}
