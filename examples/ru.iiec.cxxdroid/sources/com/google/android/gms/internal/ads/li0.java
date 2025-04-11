package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.x0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@k2
public final class li0 implements zh0 {
    private final j3 a;

    /* renamed from: b  reason: collision with root package name */
    private final ri0 f4888b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f4889c;

    /* renamed from: d  reason: collision with root package name */
    private final bi0 f4890d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f4891e;

    /* renamed from: f  reason: collision with root package name */
    private final long f4892f;

    /* renamed from: g  reason: collision with root package name */
    private final long f4893g;

    /* renamed from: h  reason: collision with root package name */
    private final int f4894h;

    /* renamed from: i  reason: collision with root package name */
    private final Object f4895i = new Object();

    /* renamed from: j  reason: collision with root package name */
    private boolean f4896j = false;

    /* renamed from: k  reason: collision with root package name */
    private final Map<ld<ii0>, fi0> f4897k = new HashMap();

    /* renamed from: l  reason: collision with root package name */
    private final boolean f4898l;

    /* renamed from: m  reason: collision with root package name */
    private final String f4899m;
    private List<ii0> n = new ArrayList();
    private final boolean o;

    public li0(Context context, j3 j3Var, ri0 ri0, bi0 bi0, boolean z, boolean z2, String str, long j2, long j3, int i2, boolean z3) {
        this.f4889c = context;
        this.a = j3Var;
        this.f4888b = ri0;
        this.f4890d = bi0;
        this.f4891e = z;
        this.f4898l = z2;
        this.f4899m = str;
        this.f4892f = j2;
        this.f4893g = j3;
        this.f4894h = 2;
        this.o = z3;
    }

    private final void a(ld<ii0> ldVar) {
        u9.f5718h.post(new ni0(this, ldVar));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0018, code lost:
        if (r4.hasNext() == false) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001a, code lost:
        r0 = r4.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r1 = (com.google.android.gms.internal.ads.ii0) r0.get();
        r3.n.add(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002b, code lost:
        if (r1 == null) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002f, code lost:
        if (r1.a != 0) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0031, code lost:
        a(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0034, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0035, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0038, code lost:
        com.google.android.gms.internal.ads.qc.c("Exception while processing an adapter; continuing with other adapters", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003e, code lost:
        a((com.google.android.gms.internal.ads.ld<com.google.android.gms.internal.ads.ii0>) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0048, code lost:
        return new com.google.android.gms.internal.ads.ii0(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0010, code lost:
        r4 = r4.iterator();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.gms.internal.ads.ii0 b(java.util.List<com.google.android.gms.internal.ads.ld<com.google.android.gms.internal.ads.ii0>> r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f4895i
            monitor-enter(r0)
            boolean r1 = r3.f4896j     // Catch:{ all -> 0x0049 }
            if (r1 == 0) goto L_0x000f
            com.google.android.gms.internal.ads.ii0 r4 = new com.google.android.gms.internal.ads.ii0     // Catch:{ all -> 0x0049 }
            r1 = -1
            r4.<init>(r1)     // Catch:{ all -> 0x0049 }
            monitor-exit(r0)     // Catch:{ all -> 0x0049 }
            return r4
        L_0x000f:
            monitor-exit(r0)     // Catch:{ all -> 0x0049 }
            java.util.Iterator r4 = r4.iterator()
        L_0x0014:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x003e
            java.lang.Object r0 = r4.next()
            com.google.android.gms.internal.ads.ld r0 = (com.google.android.gms.internal.ads.ld) r0
            java.lang.Object r1 = r0.get()     // Catch:{ InterruptedException -> 0x0037, ExecutionException -> 0x0035 }
            com.google.android.gms.internal.ads.ii0 r1 = (com.google.android.gms.internal.ads.ii0) r1     // Catch:{ InterruptedException -> 0x0037, ExecutionException -> 0x0035 }
            java.util.List<com.google.android.gms.internal.ads.ii0> r2 = r3.n     // Catch:{ InterruptedException -> 0x0037, ExecutionException -> 0x0035 }
            r2.add(r1)     // Catch:{ InterruptedException -> 0x0037, ExecutionException -> 0x0035 }
            if (r1 == 0) goto L_0x0014
            int r2 = r1.a     // Catch:{ InterruptedException -> 0x0037, ExecutionException -> 0x0035 }
            if (r2 != 0) goto L_0x0014
            r3.a(r0)     // Catch:{ InterruptedException -> 0x0037, ExecutionException -> 0x0035 }
            return r1
        L_0x0035:
            r0 = move-exception
            goto L_0x0038
        L_0x0037:
            r0 = move-exception
        L_0x0038:
            java.lang.String r1 = "Exception while processing an adapter; continuing with other adapters"
            com.google.android.gms.internal.ads.qc.c(r1, r0)
            goto L_0x0014
        L_0x003e:
            r4 = 0
            r3.a(r4)
            com.google.android.gms.internal.ads.ii0 r4 = new com.google.android.gms.internal.ads.ii0
            r0 = 1
            r4.<init>(r0)
            return r4
        L_0x0049:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.li0.b(java.util.List):com.google.android.gms.internal.ads.ii0");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
        if (r0 == -1) goto L_0x001b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001b, code lost:
        r0 = 10000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001d, code lost:
        r14 = r14.iterator();
        r3 = null;
        r1 = r0;
        r0 = null;
        r4 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0029, code lost:
        if (r14.hasNext() == false) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002b, code lost:
        r5 = r14.next();
        r6 = com.google.android.gms.ads.internal.x0.m().a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003d, code lost:
        if (r1 != 0) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0043, code lost:
        if (r5.isDone() == false) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0045, code lost:
        r10 = r5.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0049, code lost:
        r10 = (com.google.android.gms.internal.ads.ii0) r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004c, code lost:
        r10 = r5.get(r1, java.util.concurrent.TimeUnit.MILLISECONDS);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0053, code lost:
        r13.n.add(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0058, code lost:
        if (r10 == null) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005c, code lost:
        if (r10.a != 0) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005e, code lost:
        r11 = r10.f4639f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0060, code lost:
        if (r11 == null) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0066, code lost:
        if (r11.i1() <= r4) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x006c, code lost:
        r4 = r11.i1();
        r3 = r5;
        r0 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0070, code lost:
        r14 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0072, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        com.google.android.gms.internal.ads.qc.c("Exception while processing an adapter; continuing with other adapters", r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x008d, code lost:
        java.lang.Math.max(r1 - (com.google.android.gms.ads.internal.x0.m().a() - r6), 0L);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x009a, code lost:
        throw r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x009b, code lost:
        a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x009e, code lost:
        if (r0 != null) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00a6, code lost:
        return new com.google.android.gms.internal.ads.ii0(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00a7, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0010, code lost:
        r0 = r13.f4890d.n;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.gms.internal.ads.ii0 c(java.util.List<com.google.android.gms.internal.ads.ld<com.google.android.gms.internal.ads.ii0>> r14) {
        /*
        // Method dump skipped, instructions count: 171
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.li0.c(java.util.List):com.google.android.gms.internal.ads.ii0");
    }

    @Override // com.google.android.gms.internal.ads.zh0
    public final ii0 a(List<ai0> list) {
        qc.b("Starting mediation.");
        ArrayList arrayList = new ArrayList();
        n40 n40 = this.a.f4663e;
        int[] iArr = new int[2];
        if (n40.f5052h != null) {
            x0.y();
            if (ki0.a(this.f4899m, iArr)) {
                int i2 = 0;
                int i3 = iArr[0];
                int i4 = iArr[1];
                n40[] n40Arr = n40.f5052h;
                int length = n40Arr.length;
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    n40 n402 = n40Arr[i2];
                    if (i3 == n402.f5050f && i4 == n402.f5047c) {
                        n40 = n402;
                        break;
                    }
                    i2++;
                }
            }
        }
        Iterator<ai0> it = list.iterator();
        while (it.hasNext()) {
            ai0 next = it.next();
            String valueOf = String.valueOf(next.f3807b);
            qc.c(valueOf.length() != 0 ? "Trying mediation network: ".concat(valueOf) : new String("Trying mediation network: "));
            for (Iterator<String> it2 = next.f3808c.iterator(); it2.hasNext(); it2 = it2) {
                Context context = this.f4889c;
                ri0 ri0 = this.f4888b;
                bi0 bi0 = this.f4890d;
                j3 j3Var = this.a;
                fi0 fi0 = new fi0(context, it2.next(), ri0, bi0, next, j3Var.f4662d, n40, j3Var.f4670l, this.f4891e, this.f4898l, j3Var.z, j3Var.o, j3Var.A, j3Var.Y, this.o);
                ld<ii0> a2 = s9.a(new mi0(this, fi0));
                this.f4897k.put(a2, fi0);
                arrayList.add(a2);
                it = it;
                arrayList = arrayList;
            }
        }
        return this.f4894h != 2 ? b(arrayList) : c(arrayList);
    }

    @Override // com.google.android.gms.internal.ads.zh0
    public final List<ii0> a() {
        return this.n;
    }

    @Override // com.google.android.gms.internal.ads.zh0
    public final void cancel() {
        synchronized (this.f4895i) {
            this.f4896j = true;
            for (fi0 fi0 : this.f4897k.values()) {
                fi0.a();
            }
        }
    }
}
