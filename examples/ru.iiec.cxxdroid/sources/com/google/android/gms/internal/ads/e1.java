package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

/* access modifiers changed from: package-private */
public final class e1 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ AtomicInteger f4152b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ int f4153c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ wd f4154d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ List f4155e;

    e1(AtomicInteger atomicInteger, int i2, wd wdVar, List list) {
        this.f4152b = atomicInteger;
        this.f4153c = i2;
        this.f4154d = wdVar;
        this.f4155e = list;
    }

    public final void run() {
        if (this.f4152b.incrementAndGet() >= this.f4153c) {
            try {
                this.f4154d.b(w0.a(this.f4155e));
            } catch (InterruptedException | ExecutionException e2) {
                qc.c("Unable to convert list of futures to a future of list", e2);
            }
        }
    }
}
