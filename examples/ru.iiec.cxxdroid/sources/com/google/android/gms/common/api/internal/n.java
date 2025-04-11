package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.j;
import e.b.b.a.e.h;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public final class n {
    private final Map<BasePendingResult<?>, Boolean> a = Collections.synchronizedMap(new WeakHashMap());

    /* renamed from: b  reason: collision with root package name */
    private final Map<h<?>, Boolean> f3556b = Collections.synchronizedMap(new WeakHashMap());

    private final void a(boolean z, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (this.a) {
            hashMap = new HashMap(this.a);
        }
        synchronized (this.f3556b) {
            hashMap2 = new HashMap(this.f3556b);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).b(status);
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((h) entry2.getKey()).b((Exception) new b(status));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(BasePendingResult<? extends j> basePendingResult, boolean z) {
        this.a.put(basePendingResult, Boolean.valueOf(z));
        basePendingResult.a((g.a) new o(this, basePendingResult));
    }

    /* access modifiers changed from: package-private */
    public final <TResult> void a(h<TResult> hVar, boolean z) {
        this.f3556b.put(hVar, Boolean.valueOf(z));
        hVar.a().a(new p(this, hVar));
    }

    /* access modifiers changed from: package-private */
    public final boolean a() {
        return !this.a.isEmpty() || !this.f3556b.isEmpty();
    }

    public final void b() {
        a(false, e.n);
    }

    public final void c() {
        a(true, n0.a);
    }
}
