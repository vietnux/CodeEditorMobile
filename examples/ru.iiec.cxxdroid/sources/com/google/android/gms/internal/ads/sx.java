package com.google.android.gms.internal.ads;

import java.util.HashMap;

public final class sx extends aw<Integer, Long> {

    /* renamed from: b  reason: collision with root package name */
    public Long f5558b;

    /* renamed from: c  reason: collision with root package name */
    public Long f5559c;

    public sx(String str) {
        b(str);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.aw
    public final HashMap<Integer, Long> a() {
        HashMap<Integer, Long> hashMap = new HashMap<>();
        hashMap.put(0, this.f5558b);
        hashMap.put(1, this.f5559c);
        return hashMap;
    }

    /* access modifiers changed from: protected */
    public final void b(String str) {
        HashMap a = aw.a(str);
        if (a != null) {
            this.f5558b = (Long) a.get(0);
            this.f5559c = (Long) a.get(1);
        }
    }
}
