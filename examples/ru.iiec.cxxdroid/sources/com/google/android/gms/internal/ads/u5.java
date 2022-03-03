package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.gmsg.k;
import com.google.android.gms.ads.internal.x0;
import com.google.android.gms.ads.internal.y0;
import com.google.android.gms.common.internal.y;
import e.b.b.a.b.b;
import java.util.HashMap;
import java.util.Map;

@k2
public final class u5 {

    /* renamed from: g  reason: collision with root package name */
    private static final qi0 f5695g = new qi0();
    private final ri0 a;

    /* renamed from: b  reason: collision with root package name */
    private final y0 f5696b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, j7> f5697c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private final b7 f5698d;

    /* renamed from: e  reason: collision with root package name */
    private final k f5699e;

    /* renamed from: f  reason: collision with root package name */
    private final n0 f5700f;

    public u5(y0 y0Var, ri0 ri0, b7 b7Var, k kVar, n0 n0Var) {
        this.f5696b = y0Var;
        this.a = ri0;
        this.f5698d = b7Var;
        this.f5699e = kVar;
        this.f5700f = n0Var;
    }

    public static boolean a(q8 q8Var, q8 q8Var2) {
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.j7 a(java.lang.String r5) {
        /*
            r4 = this;
            java.util.Map<java.lang.String, com.google.android.gms.internal.ads.j7> r0 = r4.f5697c
            java.lang.Object r0 = r0.get(r5)
            com.google.android.gms.internal.ads.j7 r0 = (com.google.android.gms.internal.ads.j7) r0
            if (r0 != 0) goto L_0x0045
            com.google.android.gms.internal.ads.ri0 r1 = r4.a     // Catch:{ Exception -> 0x002b }
            java.lang.String r2 = "com.google.ads.mediation.admob.AdMobAdapter"
            boolean r2 = r2.equals(r5)     // Catch:{ Exception -> 0x002b }
            if (r2 == 0) goto L_0x0016
            com.google.android.gms.internal.ads.qi0 r1 = com.google.android.gms.internal.ads.u5.f5695g     // Catch:{ Exception -> 0x002b }
        L_0x0016:
            com.google.android.gms.internal.ads.j7 r2 = new com.google.android.gms.internal.ads.j7     // Catch:{ Exception -> 0x002b }
            com.google.android.gms.internal.ads.ui0 r1 = r1.h(r5)     // Catch:{ Exception -> 0x002b }
            com.google.android.gms.internal.ads.b7 r3 = r4.f5698d     // Catch:{ Exception -> 0x002b }
            r2.<init>(r1, r3)     // Catch:{ Exception -> 0x002b }
            java.util.Map<java.lang.String, com.google.android.gms.internal.ads.j7> r0 = r4.f5697c     // Catch:{ Exception -> 0x0028 }
            r0.put(r5, r2)     // Catch:{ Exception -> 0x0028 }
            r0 = r2
            goto L_0x0045
        L_0x0028:
            r1 = move-exception
            r0 = r2
            goto L_0x002c
        L_0x002b:
            r1 = move-exception
        L_0x002c:
            java.lang.String r2 = "Fail to instantiate adapter "
            java.lang.String r5 = java.lang.String.valueOf(r5)
            int r3 = r5.length()
            if (r3 == 0) goto L_0x003d
            java.lang.String r5 = r2.concat(r5)
            goto L_0x0042
        L_0x003d:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r2)
        L_0x0042:
            com.google.android.gms.internal.ads.qc.c(r5, r1)
        L_0x0045:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.u5.a(java.lang.String):com.google.android.gms.internal.ads.j7");
    }

    public final o7 a(o7 o7Var) {
        bi0 bi0;
        q8 q8Var = this.f5696b.f3375k;
        if (!(q8Var == null || (bi0 = q8Var.r) == null || TextUtils.isEmpty(bi0.f3922k))) {
            bi0 bi02 = this.f5696b.f3375k.r;
            o7Var = new o7(bi02.f3922k, bi02.f3923l);
        }
        q8 q8Var2 = this.f5696b.f3375k;
        if (!(q8Var2 == null || q8Var2.o == null)) {
            x0.y();
            y0 y0Var = this.f5696b;
            ki0.a(y0Var.f3368d, y0Var.f3370f.f5529b, y0Var.f3375k.o.f3818m, y0Var.F, o7Var);
        }
        return o7Var;
    }

    public final void a() {
        y.a("destroy must be called on the main UI thread.");
        for (String str : this.f5697c.keySet()) {
            try {
                j7 j7Var = this.f5697c.get(str);
                if (!(j7Var == null || j7Var.a() == null)) {
                    j7Var.a().destroy();
                }
            } catch (RemoteException e2) {
                qc.d("#007 Could not call remote method.", e2);
            }
        }
    }

    public final void a(Context context) {
        for (j7 j7Var : this.f5697c.values()) {
            try {
                j7Var.a().l(b.a(context));
            } catch (RemoteException e2) {
                qc.b("Unable to call Adapter.onContextChanged.", e2);
            }
        }
    }

    public final void a(boolean z) {
        j7 a2 = a(this.f5696b.f3375k.q);
        if (a2 != null && a2.a() != null) {
            try {
                a2.a().a(z);
                a2.a().showVideo();
            } catch (RemoteException e2) {
                qc.d("#007 Could not call remote method.", e2);
            }
        }
    }

    public final void b() {
        y.a("pause must be called on the main UI thread.");
        for (String str : this.f5697c.keySet()) {
            try {
                j7 j7Var = this.f5697c.get(str);
                if (!(j7Var == null || j7Var.a() == null)) {
                    j7Var.a().y();
                }
            } catch (RemoteException e2) {
                qc.d("#007 Could not call remote method.", e2);
            }
        }
    }

    public final void c() {
        y.a("resume must be called on the main UI thread.");
        for (String str : this.f5697c.keySet()) {
            try {
                j7 j7Var = this.f5697c.get(str);
                if (!(j7Var == null || j7Var.a() == null)) {
                    j7Var.a().E();
                }
            } catch (RemoteException e2) {
                qc.d("#007 Could not call remote method.", e2);
            }
        }
    }

    public final k d() {
        return this.f5699e;
    }

    public final n0 e() {
        return this.f5700f;
    }

    public final void f() {
        y0 y0Var = this.f5696b;
        y0Var.J = 0;
        x0.e();
        y0 y0Var2 = this.f5696b;
        e7 e7Var = new e7(y0Var2.f3368d, y0Var2.f3376l, this);
        String valueOf = String.valueOf(e7.class.getName());
        qc.b(valueOf.length() != 0 ? "AdRenderer: ".concat(valueOf) : new String("AdRenderer: "));
        e7Var.a();
        y0Var.f3373i = e7Var;
    }

    public final void g() {
        q8 q8Var = this.f5696b.f3375k;
        if (q8Var != null && q8Var.o != null) {
            x0.y();
            y0 y0Var = this.f5696b;
            Context context = y0Var.f3368d;
            String str = y0Var.f3370f.f5529b;
            q8 q8Var2 = y0Var.f3375k;
            ki0.a(context, str, q8Var2, y0Var.f3367c, false, q8Var2.o.f3817l);
        }
    }

    public final void h() {
        q8 q8Var = this.f5696b.f3375k;
        if (q8Var != null && q8Var.o != null) {
            x0.y();
            y0 y0Var = this.f5696b;
            Context context = y0Var.f3368d;
            String str = y0Var.f3370f.f5529b;
            q8 q8Var2 = y0Var.f3375k;
            ki0.a(context, str, q8Var2, y0Var.f3367c, false, q8Var2.o.n);
        }
    }
}
