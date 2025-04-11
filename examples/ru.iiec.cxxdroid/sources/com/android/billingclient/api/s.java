package com.android.billingclient.api;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import e.b.b.a.c.f.a;
import e.b.b.a.c.f.c;

/* access modifiers changed from: package-private */
public final class s implements ServiceConnection {
    private final Object a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private boolean f2771b = false;

    /* renamed from: c  reason: collision with root package name */
    private e f2772c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ d f2773d;

    /* synthetic */ s(d dVar, e eVar, o0 o0Var) {
        this.f2773d = dVar;
        this.f2772c = eVar;
    }

    private final void a(g gVar) {
        synchronized (this.a) {
            e eVar = this.f2772c;
            if (eVar != null) {
                eVar.a(gVar);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r3 = r10.f2773d.f2713e.getPackageName();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0017, code lost:
        r5 = 16;
        r6 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001c, code lost:
        if (r5 < 3) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r6 = r10.f2773d.f2714f.a(r5, r3, "subs");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002a, code lost:
        if (r6 != 0) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002d, code lost:
        r5 = r5 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0030, code lost:
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0031, code lost:
        r7 = r10.f2773d;
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0035, code lost:
        if (r5 < 5) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0037, code lost:
        r8 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0039, code lost:
        r8 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003a, code lost:
        r7.f2717i = r8;
        r7 = r10.f2773d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003f, code lost:
        if (r5 < 3) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0041, code lost:
        r8 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0043, code lost:
        r8 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0044, code lost:
        r7.f2716h = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0047, code lost:
        if (r5 >= 3) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0049, code lost:
        e.b.b.a.c.f.a.a("BillingClient", "In-app billing API does not support subscription on this device.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0050, code lost:
        r5 = 16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0052, code lost:
        if (r5 < 3) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0054, code lost:
        r6 = r10.f2773d.f2714f.a(r5, r3, "inapp");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0060, code lost:
        if (r6 != 0) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0062, code lost:
        r10.f2773d.f2718j = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0068, code lost:
        r5 = r5 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x006b, code lost:
        r3 = r10.f2773d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0071, code lost:
        if (r3.f2718j < 16) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0073, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0075, code lost:
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0076, code lost:
        r3.r = r4;
        r3 = r10.f2773d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0081, code lost:
        if (r3.f2718j < 15) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0083, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0085, code lost:
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0086, code lost:
        r3.q = r4;
        r3 = r10.f2773d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0091, code lost:
        if (r3.f2718j < 14) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0093, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0095, code lost:
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0096, code lost:
        r3.p = r4;
        r3 = r10.f2773d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00a1, code lost:
        if (r3.f2718j < 12) goto L_0x00a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00a3, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00a5, code lost:
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00a6, code lost:
        r3.o = r4;
        r3 = r10.f2773d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00b1, code lost:
        if (r3.f2718j < 10) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00b3, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00b5, code lost:
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00b6, code lost:
        r3.n = r4;
        r3 = r10.f2773d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00c1, code lost:
        if (r3.f2718j < 9) goto L_0x00c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00c3, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00c5, code lost:
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00c6, code lost:
        r3.f2721m = r4;
        r3 = r10.f2773d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00d1, code lost:
        if (r3.f2718j < 8) goto L_0x00d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00d3, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00d5, code lost:
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00d6, code lost:
        r3.f2720l = r4;
        r3 = r10.f2773d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00e0, code lost:
        if (r3.f2718j < 6) goto L_0x00e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00e3, code lost:
        r9 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00e4, code lost:
        r3.f2719k = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00ed, code lost:
        if (r10.f2773d.f2718j >= 3) goto L_0x00f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00ef, code lost:
        e.b.b.a.c.f.a.b("BillingClient", "In-app billing API version 3 is not supported on this device.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00f6, code lost:
        if (r6 != 0) goto L_0x00ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00f8, code lost:
        r10.f2773d.a = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x00ff, code lost:
        r10.f2773d.a = 0;
        r10.f2773d.f2714f = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x010a, code lost:
        r6 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x010b, code lost:
        e.b.b.a.c.f.a.b("BillingClient", "Exception while checking if billing is supported; try to reconnect");
        r10.f2773d.a = 0;
        r10.f2773d.f2714f = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x011c, code lost:
        if (r6 != 0) goto L_0x0121;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x011e, code lost:
        r0 = com.android.billingclient.api.v.f2783k;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0121, code lost:
        r0 = com.android.billingclient.api.v.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0123, code lost:
        a(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0126, code lost:
        return null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0121  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object a() {
        /*
        // Method dump skipped, instructions count: 298
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.s.a():java.lang.Object");
    }

    public final /* synthetic */ void b() {
        this.f2773d.a = 0;
        this.f2773d.f2714f = null;
        a(v.f2785m);
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        synchronized (this.a) {
            this.f2772c = null;
            this.f2771b = true;
        }
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        a.a("BillingClient", "Billing service connected.");
        this.f2773d.f2714f = c.a(iBinder);
        if (this.f2773d.a(new r(this), 30000, new q(this), this.f2773d.c()) == null) {
            a(this.f2773d.d());
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        a.b("BillingClient", "Billing service disconnected.");
        this.f2773d.f2714f = null;
        this.f2773d.a = 0;
        synchronized (this.a) {
            e eVar = this.f2772c;
            if (eVar != null) {
                eVar.a();
            }
        }
    }
}
