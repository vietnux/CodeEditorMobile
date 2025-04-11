package com.google.android.gms.internal.ads;

import java.util.HashMap;

public final class gx extends aw<Integer, Long> {

    /* renamed from: b  reason: collision with root package name */
    public long f4456b;

    /* renamed from: c  reason: collision with root package name */
    public long f4457c;

    public gx() {
        this.f4456b = -1;
        this.f4457c = -1;
    }

    public gx(String str) {
        this();
        b(str);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.aw
    public final HashMap<Integer, Long> a() {
        HashMap<Integer, Long> hashMap = new HashMap<>();
        hashMap.put(0, Long.valueOf(this.f4456b));
        hashMap.put(1, Long.valueOf(this.f4457c));
        return hashMap;
    }

    /* access modifiers changed from: protected */
    public final void b(String str) {
        HashMap a = aw.a(str);
        if (a != null) {
            this.f4456b = ((Long) a.get(0)).longValue();
            this.f4457c = ((Long) a.get(1)).longValue();
        }
    }
}
