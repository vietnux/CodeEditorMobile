package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* access modifiers changed from: package-private */
@k2
public final class nd {
    private final Object a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final List<Runnable> f5085b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private boolean f5086c = false;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0021, code lost:
        if (r2 >= r1) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0023, code lost:
        r3 = r0.get(r2);
        r2 = r2 + 1;
        ((java.lang.Runnable) r3).run();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001c, code lost:
        r1 = r0.size();
        r2 = 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.Object r1 = r4.a
            monitor-enter(r1)
            boolean r2 = r4.f5086c     // Catch:{ all -> 0x0030 }
            if (r2 == 0) goto L_0x000e
            monitor-exit(r1)     // Catch:{ all -> 0x0030 }
            return
        L_0x000e:
            java.util.List<java.lang.Runnable> r2 = r4.f5085b     // Catch:{ all -> 0x0030 }
            r0.addAll(r2)     // Catch:{ all -> 0x0030 }
            java.util.List<java.lang.Runnable> r2 = r4.f5085b     // Catch:{ all -> 0x0030 }
            r2.clear()     // Catch:{ all -> 0x0030 }
            r2 = 1
            r4.f5086c = r2     // Catch:{ all -> 0x0030 }
            monitor-exit(r1)     // Catch:{ all -> 0x0030 }
            int r1 = r0.size()
            r2 = 0
        L_0x0021:
            if (r2 >= r1) goto L_0x002f
            java.lang.Object r3 = r0.get(r2)
            int r2 = r2 + 1
            java.lang.Runnable r3 = (java.lang.Runnable) r3
            r3.run()
            goto L_0x0021
        L_0x002f:
            return
        L_0x0030:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.nd.a():void");
    }

    public final void a(Runnable runnable, Executor executor) {
        synchronized (this.a) {
            if (this.f5086c) {
                executor.execute(runnable);
            } else {
                this.f5085b.add(new od(executor, runnable));
            }
        }
    }
}
