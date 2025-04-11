package com.google.android.gms.internal.ads;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* access modifiers changed from: package-private */
public final class pp {
    private final ConcurrentHashMap<qp, List<Throwable>> a = new ConcurrentHashMap<>(16, 0.75f, 10);

    /* renamed from: b  reason: collision with root package name */
    private final ReferenceQueue<Throwable> f5259b = new ReferenceQueue<>();

    pp() {
    }

    public final List<Throwable> a(Throwable th, boolean z) {
        while (true) {
            Reference<? extends Throwable> poll = this.f5259b.poll();
            if (poll != null) {
                this.a.remove(poll);
            } else {
                return this.a.get(new qp(th, null));
            }
        }
    }
}
