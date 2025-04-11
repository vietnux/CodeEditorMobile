package com.google.android.gms.internal.ads;

import java.util.Map;

/* access modifiers changed from: package-private */
public final /* synthetic */ class ch implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final bh f4024b;

    /* renamed from: c  reason: collision with root package name */
    private final Map f4025c;

    ch(bh bhVar, Map map) {
        this.f4024b = bhVar;
        this.f4025c = map;
    }

    public final void run() {
        this.f4024b.a(this.f4025c);
    }
}
