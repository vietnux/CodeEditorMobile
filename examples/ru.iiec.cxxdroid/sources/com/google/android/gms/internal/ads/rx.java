package com.google.android.gms.internal.ads;

import java.util.HashMap;

public final class rx extends aw<Integer, Object> {

    /* renamed from: b  reason: collision with root package name */
    public Long f5478b;

    /* renamed from: c  reason: collision with root package name */
    public Boolean f5479c;

    /* renamed from: d  reason: collision with root package name */
    public Boolean f5480d;

    public rx(String str) {
        b(str);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.aw
    public final HashMap<Integer, Object> a() {
        HashMap<Integer, Object> hashMap = new HashMap<>();
        hashMap.put(0, this.f5478b);
        hashMap.put(1, this.f5479c);
        hashMap.put(2, this.f5480d);
        return hashMap;
    }

    /* access modifiers changed from: protected */
    public final void b(String str) {
        HashMap a = aw.a(str);
        if (a != null) {
            this.f5478b = (Long) a.get(0);
            this.f5479c = (Boolean) a.get(1);
            this.f5480d = (Boolean) a.get(2);
        }
    }
}
