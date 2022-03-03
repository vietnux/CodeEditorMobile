package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import com.google.android.gms.common.b;
import com.google.android.gms.common.internal.d;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* access modifiers changed from: package-private */
public final class hj implements d.a, d.b {
    private ij a;

    /* renamed from: b  reason: collision with root package name */
    private final String f4532b;

    /* renamed from: c  reason: collision with root package name */
    private final String f4533c;

    /* renamed from: d  reason: collision with root package name */
    private final LinkedBlockingQueue<xp> f4534d;

    /* renamed from: e  reason: collision with root package name */
    private final HandlerThread f4535e = new HandlerThread("GassClient");

    public hj(Context context, String str, String str2) {
        this.f4532b = str;
        this.f4533c = str2;
        this.f4535e.start();
        this.a = new ij(context, this.f4535e.getLooper(), this, this);
        this.f4534d = new LinkedBlockingQueue<>();
        this.a.j();
    }

    private final void a() {
        ij ijVar = this.a;
        if (ijVar == null) {
            return;
        }
        if (ijVar.a() || this.a.d()) {
            this.a.g();
        }
    }

    private final nj b() {
        try {
            return this.a.B();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }

    private static xp c() {
        xp xpVar = new xp();
        xpVar.v = 32768L;
        return xpVar;
    }

    public final xp a(int i2) {
        xp xpVar;
        try {
            xpVar = this.f4534d.poll(5000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            xpVar = null;
        }
        return xpVar == null ? c() : xpVar;
    }

    @Override // com.google.android.gms.common.internal.d.b
    public final void a(b bVar) {
        try {
            this.f4534d.put(c());
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.google.android.gms.common.internal.d.a
    public final void e(int i2) {
        try {
            this.f4534d.put(c());
        } catch (InterruptedException unused) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0030, code lost:
        a();
        r3.f4535e.quit();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0038, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        r3.f4534d.put(c());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002f, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0025 */
    @Override // com.google.android.gms.common.internal.d.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void j(android.os.Bundle r4) {
        /*
            r3 = this;
            com.google.android.gms.internal.ads.nj r4 = r3.b()
            if (r4 == 0) goto L_0x0039
            com.google.android.gms.internal.ads.jj r0 = new com.google.android.gms.internal.ads.jj     // Catch:{ all -> 0x0025 }
            java.lang.String r1 = r3.f4532b     // Catch:{ all -> 0x0025 }
            java.lang.String r2 = r3.f4533c     // Catch:{ all -> 0x0025 }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x0025 }
            com.google.android.gms.internal.ads.lj r4 = r4.a(r0)     // Catch:{ all -> 0x0025 }
            com.google.android.gms.internal.ads.xp r4 = r4.t()     // Catch:{ all -> 0x0025 }
            java.util.concurrent.LinkedBlockingQueue<com.google.android.gms.internal.ads.xp> r0 = r3.f4534d     // Catch:{ all -> 0x0025 }
            r0.put(r4)     // Catch:{ all -> 0x0025 }
        L_0x001c:
            r3.a()
            android.os.HandlerThread r4 = r3.f4535e
            r4.quit()
            return
        L_0x0025:
            java.util.concurrent.LinkedBlockingQueue<com.google.android.gms.internal.ads.xp> r4 = r3.f4534d     // Catch:{ InterruptedException -> 0x001c, all -> 0x002f }
            com.google.android.gms.internal.ads.xp r0 = c()     // Catch:{ InterruptedException -> 0x001c, all -> 0x002f }
            r4.put(r0)     // Catch:{ InterruptedException -> 0x001c, all -> 0x002f }
            goto L_0x001c
        L_0x002f:
            r4 = move-exception
            r3.a()
            android.os.HandlerThread r0 = r3.f4535e
            r0.quit()
            throw r4
        L_0x0039:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.hj.j(android.os.Bundle):void");
    }
}
