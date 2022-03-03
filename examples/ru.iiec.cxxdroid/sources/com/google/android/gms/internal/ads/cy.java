package com.google.android.gms.internal.ads;

import java.util.HashMap;

public final class cy extends aw<Integer, Long> {

    /* renamed from: b  reason: collision with root package name */
    public Long f4054b;

    /* renamed from: c  reason: collision with root package name */
    public Long f4055c;

    /* renamed from: d  reason: collision with root package name */
    public Long f4056d;

    public cy(String str) {
        b(str);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.aw
    public final HashMap<Integer, Long> a() {
        HashMap<Integer, Long> hashMap = new HashMap<>();
        hashMap.put(0, this.f4054b);
        hashMap.put(1, this.f4055c);
        hashMap.put(2, this.f4056d);
        return hashMap;
    }

    /* access modifiers changed from: protected */
    public final void b(String str) {
        HashMap a = aw.a(str);
        if (a != null) {
            this.f4054b = (Long) a.get(0);
            this.f4055c = (Long) a.get(1);
            this.f4056d = (Long) a.get(2);
        }
    }
}
