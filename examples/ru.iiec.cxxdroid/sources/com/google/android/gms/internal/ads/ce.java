package com.google.android.gms.internal.ads;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

@k2
public class ce<T> implements yd<T> {
    private final Object a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private int f4009b = 0;

    /* renamed from: c  reason: collision with root package name */
    private final BlockingQueue<de> f4010c = new LinkedBlockingQueue();

    /* renamed from: d  reason: collision with root package name */
    private T f4011d;

    public final int a() {
        return this.f4009b;
    }

    @Override // com.google.android.gms.internal.ads.yd
    public final void a(be<T> beVar, zd zdVar) {
        synchronized (this.a) {
            if (this.f4009b == 1) {
                beVar.a(this.f4011d);
            } else if (this.f4009b == -1) {
                zdVar.run();
            } else if (this.f4009b == 0) {
                this.f4010c.add(new de(this, beVar, zdVar));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.yd
    public final void a(T t) {
        synchronized (this.a) {
            if (this.f4009b == 0) {
                this.f4011d = t;
                this.f4009b = 1;
                for (de deVar : this.f4010c) {
                    deVar.a.a(t);
                }
                this.f4010c.clear();
            } else {
                throw new UnsupportedOperationException();
            }
        }
    }

    public final void b() {
        synchronized (this.a) {
            if (this.f4009b == 0) {
                this.f4009b = -1;
                for (de deVar : this.f4010c) {
                    deVar.f4099b.run();
                }
                this.f4010c.clear();
            } else {
                throw new UnsupportedOperationException();
            }
        }
    }
}
