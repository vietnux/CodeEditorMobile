package com.google.android.gms.ads.internal;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.gmsg.k;
import com.google.android.gms.ads.internal.gmsg.m;
import com.google.android.gms.ads.internal.overlay.t;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.common.util.i;
import com.google.android.gms.internal.ads.a50;
import com.google.android.gms.internal.ads.a60;
import com.google.android.gms.internal.ads.ai0;
import com.google.android.gms.internal.ads.b9;
import com.google.android.gms.internal.ads.d0;
import com.google.android.gms.internal.ads.d40;
import com.google.android.gms.internal.ads.d50;
import com.google.android.gms.internal.ads.d6;
import com.google.android.gms.internal.ads.d9;
import com.google.android.gms.internal.ads.e90;
import com.google.android.gms.internal.ads.fc;
import com.google.android.gms.internal.ads.g50;
import com.google.android.gms.internal.ads.g60;
import com.google.android.gms.internal.ads.i9;
import com.google.android.gms.internal.ads.j40;
import com.google.android.gms.internal.ads.k2;
import com.google.android.gms.internal.ads.k40;
import com.google.android.gms.internal.ads.k8;
import com.google.android.gms.internal.ads.k80;
import com.google.android.gms.internal.ads.l6;
import com.google.android.gms.internal.ads.l9;
import com.google.android.gms.internal.ads.lg;
import com.google.android.gms.internal.ads.m2;
import com.google.android.gms.internal.ads.n0;
import com.google.android.gms.internal.ads.n3;
import com.google.android.gms.internal.ads.n40;
import com.google.android.gms.internal.ads.o60;
import com.google.android.gms.internal.ads.o7;
import com.google.android.gms.internal.ads.oz;
import com.google.android.gms.internal.ads.q8;
import com.google.android.gms.internal.ads.qc;
import com.google.android.gms.internal.ads.r20;
import com.google.android.gms.internal.ads.r70;
import com.google.android.gms.internal.ads.r8;
import com.google.android.gms.internal.ads.s50;
import com.google.android.gms.internal.ads.s8;
import com.google.android.gms.internal.ads.t20;
import com.google.android.gms.internal.ads.t70;
import com.google.android.gms.internal.ads.u60;
import com.google.android.gms.internal.ads.u9;
import com.google.android.gms.internal.ads.v5;
import com.google.android.gms.internal.ads.v8;
import com.google.android.gms.internal.ads.v80;
import com.google.android.gms.internal.ads.va;
import com.google.android.gms.internal.ads.w50;
import com.google.android.gms.internal.ads.x80;
import com.google.android.gms.internal.ads.zh;
import e.b.b.a.b.b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Timer;
import java.util.concurrent.CountDownLatch;
import org.json.JSONException;
import org.json.JSONObject;

@k2
public abstract class a extends s50 implements k, m, t, n0, m2, b9, d40 {

    /* renamed from: b  reason: collision with root package name */
    protected x80 f3120b;

    /* renamed from: c  reason: collision with root package name */
    protected v80 f3121c;

    /* renamed from: d  reason: collision with root package name */
    private v80 f3122d;

    /* renamed from: e  reason: collision with root package name */
    protected boolean f3123e = false;

    /* renamed from: f  reason: collision with root package name */
    protected final n0 f3124f;

    /* renamed from: g  reason: collision with root package name */
    protected final y0 f3125g;

    /* renamed from: h  reason: collision with root package name */
    protected transient j40 f3126h;

    /* renamed from: i  reason: collision with root package name */
    protected final oz f3127i;

    /* renamed from: j  reason: collision with root package name */
    private final Bundle f3128j = new Bundle();

    /* renamed from: k  reason: collision with root package name */
    private boolean f3129k = false;

    /* renamed from: l  reason: collision with root package name */
    protected e.b.b.a.b.a f3130l;

    /* renamed from: m  reason: collision with root package name */
    protected final u1 f3131m;

    a(y0 y0Var, n0 n0Var, u1 u1Var) {
        this.f3125g = y0Var;
        this.f3124f = new n0(this);
        this.f3131m = u1Var;
        x0.f().a(this.f3125g.f3368d);
        x0.f().b(this.f3125g.f3368d);
        i9.a(this.f3125g.f3368d);
        x0.D().a(this.f3125g.f3368d);
        v8 j2 = x0.j();
        y0 y0Var2 = this.f3125g;
        j2.a(y0Var2.f3368d, y0Var2.f3370f);
        x0.l().a(this.f3125g.f3368d);
        this.f3127i = x0.j().i();
        x0.i().a(this.f3125g.f3368d);
        x0.F().a(this.f3125g.f3368d);
        if (((Boolean) a50.g().a(k80.m2)).booleanValue()) {
            Timer timer = new Timer();
            timer.schedule(new b0(this, new CountDownLatch(((Integer) a50.g().a(k80.o2)).intValue()), timer), 0, ((Long) a50.g().a(k80.n2)).longValue());
        }
    }

    protected static boolean d(j40 j40) {
        Bundle bundle = j40.n.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        return bundle == null || !bundle.containsKey("gw");
    }

    private static long o(String str) {
        int indexOf = str.indexOf("ufe");
        int indexOf2 = str.indexOf(44, indexOf);
        if (indexOf2 == -1) {
            indexOf2 = str.length();
        }
        try {
            return Long.parseLong(str.substring(indexOf + 4, indexOf2));
        } catch (IndexOutOfBoundsException | NumberFormatException e2) {
            qc.b("", e2);
            return -1;
        }
    }

    @Override // com.google.android.gms.internal.ads.r50
    public final n40 B0() {
        y.a("#008 Must be called on the main UI thread.: getAdSize");
        n40 n40 = this.f3125g.f3374j;
        if (n40 == null) {
            return null;
        }
        return new r70(n40);
    }

    @Override // com.google.android.gms.internal.ads.r50
    public void E() {
        y.a("#008 Must be called on the main UI thread.: resume");
    }

    public final void L1() {
        qc.c("Ad clicked.");
        g50 g50 = this.f3125g.o;
        if (g50 != null) {
            try {
                g50.d();
            } catch (RemoteException e2) {
                qc.d("#007 Could not call remote method.", e2);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.r50
    public final boolean N() {
        return this.f3123e;
    }

    @Override // com.google.android.gms.internal.ads.r50
    public final a60 P0() {
        return this.f3125g.p;
    }

    @Override // com.google.android.gms.ads.internal.overlay.t
    public final void R1() {
        g2();
    }

    @Override // com.google.android.gms.internal.ads.r50
    public final e.b.b.a.b.a T0() {
        y.a("#008 Must be called on the main UI thread.: getAdFrame");
        return b.a(this.f3125g.f3371g);
    }

    public final void Z1() {
        qc.c("Ad impression.");
        g50 g50 = this.f3125g.o;
        if (g50 != null) {
            try {
                g50.A0();
            } catch (RemoteException e2) {
                qc.d("#007 Could not call remote method.", e2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void a(int i2, boolean z) {
        StringBuilder sb = new StringBuilder(30);
        sb.append("Failed to load ad: ");
        sb.append(i2);
        qc.d(sb.toString());
        this.f3123e = z;
        g50 g50 = this.f3125g.o;
        if (g50 != null) {
            try {
                g50.c(i2);
            } catch (RemoteException e2) {
                qc.d("#007 Could not call remote method.", e2);
            }
        }
        l6 l6Var = this.f3125g.D;
        if (l6Var != null) {
            try {
                l6Var.a(i2);
            } catch (RemoteException e3) {
                qc.d("#007 Could not call remote method.", e3);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.r50
    public final void a(a60 a60) {
        y.a("#008 Must be called on the main UI thread.: setAppEventListener");
        this.f3125g.p = a60;
    }

    @Override // com.google.android.gms.internal.ads.r50
    public final void a(d0 d0Var, String str) {
        qc.d("#006 Unexpected call to a deprecated method.");
    }

    @Override // com.google.android.gms.internal.ads.r50
    public final void a(d50 d50) {
        y.a("#008 Must be called on the main UI thread.: setAdClickListener");
        this.f3125g.n = d50;
    }

    public final void a(d6 d6Var) {
        y.a("#008 Must be called on the main UI thread.: setRewardedAdSkuListener");
        this.f3125g.E = d6Var;
    }

    @Override // com.google.android.gms.internal.ads.r50
    public void a(e90 e90) {
        throw new IllegalStateException("#005 Unexpected call to an abstract (unimplemented) method.");
    }

    @Override // com.google.android.gms.internal.ads.r50
    public final void a(l6 l6Var) {
        y.a("#008 Must be called on the main UI thread.: setRewardedVideoAdListener");
        this.f3125g.D = l6Var;
    }

    @Override // com.google.android.gms.internal.ads.r50
    public final void a(n40 n40) {
        lg lgVar;
        y.a("#008 Must be called on the main UI thread.: setAdSize");
        y0 y0Var = this.f3125g;
        y0Var.f3374j = n40;
        q8 q8Var = y0Var.f3375k;
        if (!(q8Var == null || (lgVar = q8Var.f5319b) == null || y0Var.J != 0)) {
            lgVar.a(zh.a(n40));
        }
        z0 z0Var = this.f3125g.f3371g;
        if (z0Var != null) {
            if (z0Var.getChildCount() > 1) {
                z0 z0Var2 = this.f3125g.f3371g;
                z0Var2.removeView(z0Var2.getNextView());
            }
            this.f3125g.f3371g.setMinimumWidth(n40.f5051g);
            this.f3125g.f3371g.setMinimumHeight(n40.f5048d);
            this.f3125g.f3371g.requestLayout();
        }
    }

    @Override // com.google.android.gms.internal.ads.n0
    public void a(q8 q8Var) {
        t20 t20;
        r20 r20;
        this.f3120b.a(this.f3122d, "awr");
        y0 y0Var = this.f3125g;
        y0Var.f3373i = null;
        int i2 = q8Var.f5321d;
        if (!(i2 == -2 || i2 == 3 || y0Var.a() == null)) {
            x0.k().a(this.f3125g.a());
        }
        if (q8Var.f5321d == -1) {
            this.f3123e = false;
            return;
        }
        if (b(q8Var)) {
            qc.b("Ad refresh scheduled.");
        }
        int i3 = q8Var.f5321d;
        if (i3 != -2) {
            if (i3 == 3) {
                r20 = q8Var.K;
                t20 = t20.AD_FAILED_TO_LOAD_NO_FILL;
            } else {
                r20 = q8Var.K;
                t20 = t20.AD_FAILED_TO_LOAD;
            }
            r20.a(t20);
            h(q8Var.f5321d);
            return;
        }
        y0 y0Var2 = this.f3125g;
        if (y0Var2.H == null) {
            y0Var2.H = new d9(y0Var2.f3367c);
        }
        z0 z0Var = this.f3125g.f3371g;
        if (z0Var != null) {
            z0Var.a().d(q8Var.B);
        }
        this.f3127i.a(this.f3125g.f3375k);
        if (a(this.f3125g.f3375k, q8Var)) {
            y0 y0Var3 = this.f3125g;
            y0Var3.f3375k = q8Var;
            s8 s8Var = y0Var3.f3377m;
            if (s8Var != null) {
                q8 q8Var2 = y0Var3.f3375k;
                if (q8Var2 != null) {
                    s8Var.a(q8Var2.y);
                    y0Var3.f3377m.b(y0Var3.f3375k.z);
                    y0Var3.f3377m.b(y0Var3.f3375k.n);
                }
                y0Var3.f3377m.a(y0Var3.f3374j.f5049e);
            }
            String str = "1";
            this.f3120b.a("is_mraid", this.f3125g.f3375k.a() ? str : "0");
            this.f3120b.a("is_mediation", this.f3125g.f3375k.n ? str : "0");
            lg lgVar = this.f3125g.f3375k.f5319b;
            if (!(lgVar == null || lgVar.M() == null)) {
                x80 x80 = this.f3120b;
                if (!this.f3125g.f3375k.f5319b.M().c()) {
                    str = "0";
                }
                x80.a("is_delay_pl", str);
            }
            this.f3120b.a(this.f3121c, "ttc");
            if (x0.j().d() != null) {
                x0.j().d().a(this.f3120b);
            }
            c2();
            if (this.f3125g.d()) {
                i2();
            }
        }
        if (q8Var.J != null) {
            x0.f().a(this.f3125g.f3368d, q8Var.J);
        }
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final void a(r8 r8Var) {
        n3 n3Var = r8Var.f5394b;
        if (n3Var.p != -1 && !TextUtils.isEmpty(n3Var.A)) {
            long o = o(r8Var.f5394b.A);
            if (o != -1) {
                this.f3120b.a(this.f3120b.a(r8Var.f5394b.p + o), "stc");
            }
        }
        this.f3120b.a(r8Var.f5394b.A);
        this.f3120b.a(this.f3121c, "arf");
        this.f3122d = this.f3120b.a();
        this.f3120b.a("gqi", r8Var.f5394b.B);
        y0 y0Var = this.f3125g;
        y0Var.f3372h = null;
        y0Var.f3376l = r8Var;
        r8Var.f5401i.a(new a1(this, r8Var));
        r8Var.f5401i.a(t20.AD_LOADED);
        a(r8Var, this.f3120b);
    }

    /* access modifiers changed from: protected */
    public abstract void a(r8 r8Var, x80 x80);

    @Override // com.google.android.gms.internal.ads.r50
    public final void a(t70 t70) {
        y.a("#008 Must be called on the main UI thread.: setVideoOptions");
        this.f3125g.y = t70;
    }

    @Override // com.google.android.gms.internal.ads.r50
    public final void a(u60 u60) {
        y.a("#008 Must be called on the main UI thread.: setIconAdOptions");
        this.f3125g.z = u60;
    }

    public final void a(v80 v80) {
        this.f3120b = new x80(((Boolean) a50.g().a(k80.N)).booleanValue(), "load_ad", this.f3125g.f3374j.f5046b);
        this.f3122d = new v80(-1, null, null);
        if (v80 == null) {
            this.f3121c = new v80(-1, null, null);
        } else {
            this.f3121c = new v80(v80.a(), v80.b(), v80.c());
        }
    }

    @Override // com.google.android.gms.internal.ads.r50
    public final void a(w50 w50) {
        this.f3125g.q = w50;
    }

    @Override // com.google.android.gms.internal.ads.r50
    public void a(com.google.android.gms.internal.ads.y yVar) {
        qc.d("#006 Unexpected call to a deprecated method.");
    }

    @Override // com.google.android.gms.ads.internal.gmsg.m
    public final void a(String str, String str2) {
        a60 a60 = this.f3125g.p;
        if (a60 != null) {
            try {
                a60.a(str, str2);
            } catch (RemoteException e2) {
                qc.d("#007 Could not call remote method.", e2);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.b9
    public final void a(HashSet<s8> hashSet) {
        this.f3125g.a(hashSet);
    }

    @Override // com.google.android.gms.internal.ads.r50
    public void a(boolean z) {
        throw new IllegalStateException("#005 Unexpected call to an abstract (unimplemented) method.");
    }

    /* access modifiers changed from: protected */
    public abstract boolean a(j40 j40, x80 x80);

    /* access modifiers changed from: protected */
    public abstract boolean a(q8 q8Var, q8 q8Var2);

    /* access modifiers changed from: protected */
    public final List<String> b(List<String> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (String str : list) {
            arrayList.add(k8.b(str, this.f3125g.f3368d));
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.r50
    public final void b(g50 g50) {
        y.a("#008 Must be called on the main UI thread.: setAdListener");
        this.f3125g.o = g50;
    }

    @Override // com.google.android.gms.internal.ads.r50
    public final void b(g60 g60) {
        y.a("#008 Must be called on the main UI thread.: setCorrelationIdProvider");
        this.f3125g.r = g60;
    }

    @Override // com.google.android.gms.internal.ads.r50
    public final void b(String str) {
        y.a("#008 Must be called on the main UI thread.: setUserId");
        this.f3125g.F = str;
    }

    @Override // com.google.android.gms.internal.ads.r50
    public boolean b(j40 j40) {
        String str;
        y.a("#008 Must be called on the main UI thread.: loadAd");
        x0.l().a();
        this.f3128j.clear();
        this.f3129k = false;
        if (((Boolean) a50.g().a(k80.L0)).booleanValue()) {
            j40 = j40.t();
            if (((Boolean) a50.g().a(k80.M0)).booleanValue()) {
                j40.f4676d.putBoolean(AdMobAdapter.NEW_BUNDLE, true);
            }
        }
        if (i.b(this.f3125g.f3368d) && j40.f4684l != null) {
            k40 k40 = new k40(j40);
            k40.a(null);
            j40 = k40.a();
        }
        y0 y0Var = this.f3125g;
        if (y0Var.f3372h == null && y0Var.f3373i == null) {
            qc.c("Starting ad request.");
            a((v80) null);
            this.f3121c = this.f3120b.a();
            if (j40.f4679g) {
                str = "This request is sent from a test device.";
            } else {
                a50.b();
                String a = fc.a(this.f3125g.f3368d);
                StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 71);
                sb.append("Use AdRequest.Builder.addTestDevice(\"");
                sb.append(a);
                sb.append("\") to get test ads on this device.");
                str = sb.toString();
            }
            qc.c(str);
            this.f3124f.a(j40);
            this.f3123e = a(j40, this.f3120b);
            return this.f3123e;
        }
        qc.d(this.f3126h != null ? "Aborting last ad request since another ad request is already in progress. The current request object will still be cached for future refreshes." : "Loading already in progress, saving this object for future refreshes.");
        this.f3126h = j40;
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean b(q8 q8Var) {
        return false;
    }

    /* access modifiers changed from: protected */
    public final List<String> c(List<String> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (String str : list) {
            arrayList.add(k8.a(str, this.f3125g.f3368d));
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    public final void c(View view) {
        z0 z0Var = this.f3125g.f3371g;
        if (z0Var != null) {
            z0Var.addView(view, x0.h().d());
        }
    }

    /* access modifiers changed from: protected */
    public final void c(o7 o7Var) {
        if (this.f3125g.D != null) {
            String str = "";
            int i2 = 1;
            if (o7Var != null) {
                try {
                    str = o7Var.f5126b;
                    i2 = o7Var.f5127c;
                } catch (RemoteException e2) {
                    qc.d("#007 Could not call remote method.", e2);
                    return;
                }
            }
            v5 v5Var = new v5(str, i2);
            this.f3125g.D.a(v5Var);
            if (this.f3125g.E != null) {
                this.f3125g.E.a(v5Var, this.f3125g.f3376l.a.w);
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean c(j40 j40) {
        z0 z0Var = this.f3125g.f3371g;
        if (z0Var == null) {
            return false;
        }
        ViewParent parent = z0Var.getParent();
        if (!(parent instanceof View)) {
            return false;
        }
        View view = (View) parent;
        return x0.f().a(view, view.getContext());
    }

    public final void c2() {
        q8 q8Var = this.f3125g.f3375k;
        if (q8Var != null && !TextUtils.isEmpty(q8Var.B) && !q8Var.I && x0.p().b()) {
            qc.b("Sending troubleshooting signals to the server.");
            va p = x0.p();
            y0 y0Var = this.f3125g;
            p.b(y0Var.f3368d, y0Var.f3370f.f5529b, q8Var.B, y0Var.f3367c);
            q8Var.I = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.d40
    public void d() {
        if (this.f3125g.f3375k == null) {
            qc.d("Ad state was null when trying to ping click URLs.");
            return;
        }
        qc.b("Pinging click URLs.");
        s8 s8Var = this.f3125g.f3377m;
        if (s8Var != null) {
            s8Var.c();
        }
        if (this.f3125g.f3375k.f5320c != null) {
            x0.f();
            y0 y0Var = this.f3125g;
            u9.a(y0Var.f3368d, y0Var.f3370f.f5529b, c(y0Var.f3375k.f5320c));
        }
        d50 d50 = this.f3125g.n;
        if (d50 != null) {
            try {
                d50.d();
            } catch (RemoteException e2) {
                qc.d("#007 Could not call remote method.", e2);
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.gmsg.k
    public final void d(String str, Bundle bundle) {
        w50 w50;
        this.f3128j.putAll(bundle);
        if (this.f3129k && (w50 = this.f3125g.q) != null) {
            try {
                w50.z1();
            } catch (RemoteException e2) {
                qc.d("#007 Could not call remote method.", e2);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.r50
    public void destroy() {
        y.a("#008 Must be called on the main UI thread.: destroy");
        this.f3124f.a();
        this.f3127i.b(this.f3125g.f3375k);
        y0 y0Var = this.f3125g;
        z0 z0Var = y0Var.f3371g;
        if (z0Var != null) {
            z0Var.b();
        }
        y0Var.o = null;
        y0Var.q = null;
        y0Var.p = null;
        y0Var.C = null;
        y0Var.r = null;
        y0Var.a(false);
        z0 z0Var2 = y0Var.f3371g;
        if (z0Var2 != null) {
            z0Var2.removeAllViews();
        }
        y0Var.b();
        y0Var.c();
        y0Var.f3375k = null;
    }

    @Override // com.google.android.gms.internal.ads.r50
    public final g50 f1() {
        return this.f3125g.o;
    }

    /* access modifiers changed from: protected */
    public void f2() {
        l9.e("Ad closing.");
        g50 g50 = this.f3125g.o;
        if (g50 != null) {
            try {
                g50.X();
            } catch (RemoteException e2) {
                qc.d("#007 Could not call remote method.", e2);
            }
        }
        l6 l6Var = this.f3125g.D;
        if (l6Var != null) {
            try {
                l6Var.q();
            } catch (RemoteException e3) {
                qc.d("#007 Could not call remote method.", e3);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void g2() {
        l9.e("Ad leaving application.");
        g50 g50 = this.f3125g.o;
        if (g50 != null) {
            try {
                g50.j0();
            } catch (RemoteException e2) {
                qc.d("#007 Could not call remote method.", e2);
            }
        }
        l6 l6Var = this.f3125g.D;
        if (l6Var != null) {
            try {
                l6Var.r();
            } catch (RemoteException e3) {
                qc.d("#007 Could not call remote method.", e3);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.r50
    public o60 getVideoController() {
        return null;
    }

    /* access modifiers changed from: protected */
    public void h(int i2) {
        a(i2, false);
    }

    /* access modifiers changed from: protected */
    public final void h2() {
        l9.e("Ad opening.");
        g50 g50 = this.f3125g.o;
        if (g50 != null) {
            try {
                g50.f0();
            } catch (RemoteException e2) {
                qc.d("#007 Could not call remote method.", e2);
            }
        }
        l6 l6Var = this.f3125g.D;
        if (l6Var != null) {
            try {
                l6Var.s();
            } catch (RemoteException e3) {
                qc.d("#007 Could not call remote method.", e3);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.r50
    public void i(boolean z) {
        qc.d("Attempt to call setManualImpressionsEnabled for an unsupported ad type.");
    }

    /* access modifiers changed from: protected */
    public void i2() {
        l(false);
    }

    /* access modifiers changed from: protected */
    public final void j2() {
        l6 l6Var = this.f3125g.D;
        if (l6Var != null) {
            try {
                l6Var.o();
            } catch (RemoteException e2) {
                qc.d("#007 Could not call remote method.", e2);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.r50
    public String k0() {
        return this.f3125g.f3367c;
    }

    @Override // com.google.android.gms.internal.ads.r50
    public final void k1() {
        List<String> list;
        y.a("#008 Must be called on the main UI thread.: recordManualImpression");
        if (this.f3125g.f3375k == null) {
            qc.d("Ad state was null when trying to ping manual tracking URLs.");
            return;
        }
        qc.b("Pinging manual tracking URLs.");
        if (!this.f3125g.f3375k.H) {
            ArrayList arrayList = new ArrayList();
            List<String> list2 = this.f3125g.f3375k.f5324g;
            if (list2 != null) {
                arrayList.addAll(list2);
            }
            ai0 ai0 = this.f3125g.f3375k.o;
            if (!(ai0 == null || (list = ai0.f3814i) == null)) {
                arrayList.addAll(list);
            }
            if (!arrayList.isEmpty()) {
                x0.f();
                y0 y0Var = this.f3125g;
                u9.a(y0Var.f3368d, y0Var.f3370f.f5529b, arrayList);
                this.f3125g.f3375k.H = true;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void k2() {
        l6 l6Var = this.f3125g.D;
        if (l6Var != null) {
            try {
                l6Var.p();
            } catch (RemoteException e2) {
                qc.d("#007 Could not call remote method.", e2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void l(boolean z) {
        l9.e("Ad finished loading.");
        this.f3123e = z;
        this.f3129k = true;
        g50 g50 = this.f3125g.o;
        if (g50 != null) {
            try {
                g50.n0();
            } catch (RemoteException e2) {
                qc.d("#007 Could not call remote method.", e2);
            }
        }
        l6 l6Var = this.f3125g.D;
        if (l6Var != null) {
            try {
                l6Var.I();
            } catch (RemoteException e3) {
                qc.d("#007 Could not call remote method.", e3);
            }
        }
        w50 w50 = this.f3125g.q;
        if (w50 != null) {
            try {
                w50.z1();
            } catch (RemoteException e4) {
                qc.d("#007 Could not call remote method.", e4);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void l2() {
        if (this.f3130l != null) {
            x0.v().b(this.f3130l);
            this.f3130l = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.r50
    public final boolean m1() {
        y.a("#008 Must be called on the main UI thread.: isLoaded");
        y0 y0Var = this.f3125g;
        return y0Var.f3372h == null && y0Var.f3373i == null && y0Var.f3375k != null;
    }

    /* access modifiers changed from: protected */
    public final String m2() {
        n3 n3Var;
        r8 r8Var = this.f3125g.f3376l;
        if (r8Var == null || (n3Var = r8Var.f5394b) == null) {
            return "javascript";
        }
        String str = n3Var.Y;
        if (TextUtils.isEmpty(str)) {
            return "javascript";
        }
        try {
            if (new JSONObject(str).optInt("media_type", -1) == 0) {
                return null;
            }
            return "javascript";
        } catch (JSONException e2) {
            qc.c("", e2);
            return "javascript";
        }
    }

    @Override // com.google.android.gms.internal.ads.r50
    public final Bundle q0() {
        return this.f3129k ? this.f3128j : new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.r50
    public final void stopLoading() {
        y.a("#008 Must be called on the main UI thread.: stopLoading");
        this.f3123e = false;
        this.f3125g.a(true);
    }

    public final u1 x0() {
        return this.f3131m;
    }

    @Override // com.google.android.gms.internal.ads.r50
    public void y() {
        y.a("#008 Must be called on the main UI thread.: pause");
    }
}
