package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.x0;
import java.util.List;

@k2
public final class n2 extends g9 implements a3 {

    /* renamed from: d  reason: collision with root package name */
    private final m2 f5013d;

    /* renamed from: e  reason: collision with root package name */
    private final k3 f5014e;

    /* renamed from: f  reason: collision with root package name */
    private final Object f5015f = new Object();

    /* renamed from: g  reason: collision with root package name */
    private final Context f5016g;

    /* renamed from: h  reason: collision with root package name */
    private final r20 f5017h;

    /* renamed from: i  reason: collision with root package name */
    private final v20 f5018i;

    /* renamed from: j  reason: collision with root package name */
    private j3 f5019j;

    /* renamed from: k  reason: collision with root package name */
    private Runnable f5020k;

    /* renamed from: l  reason: collision with root package name */
    na f5021l;

    /* renamed from: m  reason: collision with root package name */
    private n3 f5022m;
    private bi0 n;

    public n2(Context context, k3 k3Var, m2 m2Var, v20 v20) {
        r20 r20;
        s20 s20;
        this.f5013d = m2Var;
        this.f5016g = context;
        this.f5014e = k3Var;
        this.f5018i = v20;
        this.f5017h = new r20(this.f5018i);
        this.f5017h.a(new o2(this));
        s30 s30 = new s30();
        s30.f5495c = Integer.valueOf(this.f5014e.f4765j.f5530c);
        s30.f5496d = Integer.valueOf(this.f5014e.f4765j.f5531d);
        s30.f5497e = Integer.valueOf(this.f5014e.f4765j.f5532e ? 0 : 2);
        this.f5017h.a(new p2(s30));
        if (this.f5014e.f4761f != null) {
            this.f5017h.a(new q2(this));
        }
        n40 n40 = this.f5014e.f4758c;
        if (n40.f5049e && "interstitial_mb".equals(n40.f5046b)) {
            r20 = this.f5017h;
            s20 = r2.a;
        } else if (n40.f5049e && "reward_mb".equals(n40.f5046b)) {
            r20 = this.f5017h;
            s20 = s2.a;
        } else if (n40.f5053i || n40.f5049e) {
            r20 = this.f5017h;
            s20 = u2.a;
        } else {
            r20 = this.f5017h;
            s20 = t2.a;
        }
        r20.a(s20);
        this.f5017h.a(t20.AD_REQUEST);
    }

    private final n40 a(j3 j3Var) {
        bi0 bi0;
        List<Integer> list;
        j3 j3Var2 = this.f5019j;
        if (!(!((j3Var2 == null || (list = j3Var2.W) == null || list.size() <= 1) ? false : true) || (bi0 = this.n) == null || bi0.t)) {
            return null;
        }
        if (this.f5022m.C) {
            n40[] n40Arr = j3Var.f4663e.f5052h;
            for (n40 n40 : n40Arr) {
                if (n40.f5054j) {
                    return new n40(n40, j3Var.f4663e.f5052h);
                }
            }
        }
        String str = this.f5022m.o;
        if (str != null) {
            String[] split = str.split("x");
            if (split.length != 2) {
                String valueOf = String.valueOf(this.f5022m.o);
                throw new x2(valueOf.length() != 0 ? "Invalid ad size format from the ad response: ".concat(valueOf) : new String("Invalid ad size format from the ad response: "), 0);
            }
            try {
                int parseInt = Integer.parseInt(split[0]);
                int parseInt2 = Integer.parseInt(split[1]);
                n40[] n40Arr2 = j3Var.f4663e.f5052h;
                for (n40 n402 : n40Arr2) {
                    float f2 = this.f5016g.getResources().getDisplayMetrics().density;
                    int i2 = n402.f5050f;
                    if (i2 == -1) {
                        i2 = (int) (((float) n402.f5051g) / f2);
                    }
                    int i3 = n402.f5047c;
                    if (i3 == -2) {
                        i3 = (int) (((float) n402.f5048d) / f2);
                    }
                    if (parseInt == i2 && parseInt2 == i3 && !n402.f5054j) {
                        return new n40(n402, j3Var.f4663e.f5052h);
                    }
                }
                String valueOf2 = String.valueOf(this.f5022m.o);
                throw new x2(valueOf2.length() != 0 ? "The ad size from the ad response was not one of the requested sizes: ".concat(valueOf2) : new String("The ad size from the ad response was not one of the requested sizes: "), 0);
            } catch (NumberFormatException unused) {
                String valueOf3 = String.valueOf(this.f5022m.o);
                throw new x2(valueOf3.length() != 0 ? "Invalid ad size number from the ad response: ".concat(valueOf3) : new String("Invalid ad size number from the ad response: "), 0);
            }
        } else {
            throw new x2("The ad response must specify one of the supported ad sizes.", 0);
        }
    }

    /* access modifiers changed from: private */
    public final void a(int i2, String str) {
        if (i2 == 3 || i2 == -1) {
            qc.c(str);
        } else {
            qc.d(str);
        }
        n3 n3Var = this.f5022m;
        if (n3Var == null) {
            this.f5022m = new n3(i2);
        } else {
            this.f5022m = new n3(i2, n3Var.f5034m);
        }
        j3 j3Var = this.f5019j;
        if (j3Var == null) {
            j3Var = new j3(this.f5014e, -1, null, null, null);
        }
        n3 n3Var2 = this.f5022m;
        this.f5013d.a(new r8(j3Var, n3Var2, this.n, null, i2, -1, n3Var2.p, null, this.f5017h, null));
    }

    /* access modifiers changed from: package-private */
    public final na a(sc scVar, yd<j3> ydVar) {
        Context context = this.f5016g;
        if (new z2(context).a(scVar)) {
            qc.b("Fetching ad response from local ad request service.");
            g3 g3Var = new g3(context, ydVar, this);
            g3Var.a();
            return g3Var;
        }
        qc.b("Fetching ad response from remote ad request service.");
        a50.b();
        if (fc.c(context)) {
            return new h3(context, scVar, ydVar, this);
        }
        qc.d("Failed to connect to remote ad request service.");
        return null;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(h30 h30) {
        h30.f4482i.f4261c = this.f5014e.f4761f.packageName;
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x0190  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01cd  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01d7  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01e5  */
    @Override // com.google.android.gms.internal.ads.a3
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.google.android.gms.internal.ads.n3 r15) {
        /*
        // Method dump skipped, instructions count: 532
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.n2.a(com.google.android.gms.internal.ads.n3):void");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b(h30 h30) {
        h30.f4477d = this.f5014e.v;
    }

    @Override // com.google.android.gms.internal.ads.g9
    public final void c() {
        synchronized (this.f5015f) {
            if (this.f5021l != null) {
                this.f5021l.cancel();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.g9
    public final void d() {
        Bundle bundle;
        String string;
        qc.b("AdLoaderBackgroundTask started.");
        this.f5020k = new v2(this);
        u9.f5718h.postDelayed(this.f5020k, ((Long) a50.g().a(k80.z1)).longValue());
        long b2 = x0.m().b();
        if (!((Boolean) a50.g().a(k80.x1)).booleanValue() || (bundle = this.f5014e.f4757b.f4676d) == null || (string = bundle.getString("_ad")) == null) {
            ce ceVar = new ce();
            s9.a(new w2(this, ceVar));
            String k2 = x0.C().k(this.f5016g);
            String a = x0.C().a(this.f5016g);
            String b3 = x0.C().b(this.f5016g);
            x0.C().f(this.f5016g, b3);
            this.f5019j = new j3(this.f5014e, b2, k2, a, b3);
            ceVar.a(this.f5019j);
            return;
        }
        this.f5019j = new j3(this.f5014e, b2, null, null, null);
        a(x4.a(this.f5016g, this.f5019j, string));
    }
}
