package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public final class bg0 {
    private final AtomicInteger a;

    /* renamed from: b  reason: collision with root package name */
    private final Set<bc0<?>> f3891b;

    /* renamed from: c  reason: collision with root package name */
    private final PriorityBlockingQueue<bc0<?>> f3892c;

    /* renamed from: d  reason: collision with root package name */
    private final PriorityBlockingQueue<bc0<?>> f3893d;

    /* renamed from: e  reason: collision with root package name */
    private final wp f3894e;

    /* renamed from: f  reason: collision with root package name */
    private final a70 f3895f;

    /* renamed from: g  reason: collision with root package name */
    private final b f3896g;

    /* renamed from: h  reason: collision with root package name */
    private final z70[] f3897h;

    /* renamed from: i  reason: collision with root package name */
    private ux f3898i;

    /* renamed from: j  reason: collision with root package name */
    private final List<ch0> f3899j;

    public bg0(wp wpVar, a70 a70) {
        this(wpVar, a70, 4);
    }

    private bg0(wp wpVar, a70 a70, int i2) {
        this(wpVar, a70, 4, new y20(new Handler(Looper.getMainLooper())));
    }

    private bg0(wp wpVar, a70 a70, int i2, b bVar) {
        this.a = new AtomicInteger();
        this.f3891b = new HashSet();
        this.f3892c = new PriorityBlockingQueue<>();
        this.f3893d = new PriorityBlockingQueue<>();
        this.f3899j = new ArrayList();
        this.f3894e = wpVar;
        this.f3895f = a70;
        this.f3897h = new z70[4];
        this.f3896g = bVar;
    }

    public final <T> bc0<T> a(bc0<T> bc0) {
        bc0.a(this);
        synchronized (this.f3891b) {
            this.f3891b.add(bc0);
        }
        bc0.a(this.a.incrementAndGet());
        bc0.a("add-to-queue");
        (!bc0.n() ? this.f3893d : this.f3892c).add(bc0);
        return bc0;
    }

    public final void a() {
        ux uxVar = this.f3898i;
        if (uxVar != null) {
            uxVar.a();
        }
        z70[] z70Arr = this.f3897h;
        for (z70 z70 : z70Arr) {
            if (z70 != null) {
                z70.a();
            }
        }
        this.f3898i = new ux(this.f3892c, this.f3893d, this.f3894e, this.f3896g);
        this.f3898i.start();
        for (int i2 = 0; i2 < this.f3897h.length; i2++) {
            z70 z702 = new z70(this.f3893d, this.f3895f, this.f3894e, this.f3896g);
            this.f3897h[i2] = z702;
            z702.start();
        }
    }

    /* access modifiers changed from: package-private */
    public final <T> void b(bc0<T> bc0) {
        synchronized (this.f3891b) {
            this.f3891b.remove(bc0);
        }
        synchronized (this.f3899j) {
            for (ch0 ch0 : this.f3899j) {
                ch0.a(bc0);
            }
        }
    }
}
