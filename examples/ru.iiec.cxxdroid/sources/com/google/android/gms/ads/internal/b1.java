package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.internal.overlay.n;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.common.t.c;
import com.google.android.gms.internal.ads.a50;
import com.google.android.gms.internal.ads.aa;
import com.google.android.gms.internal.ads.ad;
import com.google.android.gms.internal.ads.ai0;
import com.google.android.gms.internal.ads.bf0;
import com.google.android.gms.internal.ads.bi0;
import com.google.android.gms.internal.ads.ci0;
import com.google.android.gms.internal.ads.ec0;
import com.google.android.gms.internal.ads.ei0;
import com.google.android.gms.internal.ads.f4;
import com.google.android.gms.internal.ads.g60;
import com.google.android.gms.internal.ads.g9;
import com.google.android.gms.internal.ads.i10;
import com.google.android.gms.internal.ads.j40;
import com.google.android.gms.internal.ads.k2;
import com.google.android.gms.internal.ads.k3;
import com.google.android.gms.internal.ads.k80;
import com.google.android.gms.internal.ads.ki0;
import com.google.android.gms.internal.ads.ld;
import com.google.android.gms.internal.ads.lg;
import com.google.android.gms.internal.ads.n2;
import com.google.android.gms.internal.ads.n40;
import com.google.android.gms.internal.ads.na0;
import com.google.android.gms.internal.ads.q8;
import com.google.android.gms.internal.ads.qc;
import com.google.android.gms.internal.ads.rd;
import com.google.android.gms.internal.ads.ri0;
import com.google.android.gms.internal.ads.s8;
import com.google.android.gms.internal.ads.s9;
import com.google.android.gms.internal.ads.sc;
import com.google.android.gms.internal.ads.t20;
import com.google.android.gms.internal.ads.tb0;
import com.google.android.gms.internal.ads.u60;
import com.google.android.gms.internal.ads.u8;
import com.google.android.gms.internal.ads.u9;
import com.google.android.gms.internal.ads.ui0;
import com.google.android.gms.internal.ads.v20;
import com.google.android.gms.internal.ads.x80;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@k2
public abstract class b1 extends a implements n, q0, ci0 {
    protected final ri0 n;
    private transient boolean o;

    public b1(Context context, n40 n40, String str, ri0 ri0, sc scVar, u1 u1Var) {
        this(new y0(context, n40, str, scVar), ri0, null, u1Var);
    }

    private b1(y0 y0Var, ri0 ri0, n0 n0Var, u1 u1Var) {
        super(y0Var, null, u1Var);
        this.n = ri0;
        this.o = false;
    }

    private final k3 a(j40 j40, Bundle bundle, u8 u8Var, int i2) {
        PackageInfo packageInfo;
        Bundle bundle2;
        String str;
        JSONArray optJSONArray;
        ApplicationInfo applicationInfo = this.f3125g.f3368d.getApplicationInfo();
        int i3 = 0;
        try {
            packageInfo = c.b(this.f3125g.f3368d).b(applicationInfo.packageName, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            packageInfo = null;
        }
        DisplayMetrics displayMetrics = this.f3125g.f3368d.getResources().getDisplayMetrics();
        z0 z0Var = this.f3125g.f3371g;
        if (z0Var == null || z0Var.getParent() == null) {
            bundle2 = null;
        } else {
            int[] iArr = new int[2];
            this.f3125g.f3371g.getLocationOnScreen(iArr);
            int i4 = iArr[0];
            int i5 = 1;
            int i6 = iArr[1];
            int width = this.f3125g.f3371g.getWidth();
            int height = this.f3125g.f3371g.getHeight();
            if (!this.f3125g.f3371g.isShown() || i4 + width <= 0 || i6 + height <= 0 || i4 > displayMetrics.widthPixels || i6 > displayMetrics.heightPixels) {
                i5 = 0;
            }
            Bundle bundle3 = new Bundle(5);
            bundle3.putInt("x", i4);
            bundle3.putInt("y", i6);
            bundle3.putInt("width", width);
            bundle3.putInt("height", height);
            bundle3.putInt("visible", i5);
            bundle2 = bundle3;
        }
        String a = x0.j().c().a();
        y0 y0Var = this.f3125g;
        y0Var.f3377m = new s8(a, y0Var.f3367c);
        this.f3125g.f3377m.a(j40);
        x0.f();
        y0 y0Var2 = this.f3125g;
        String a2 = u9.a(y0Var2.f3368d, y0Var2.f3371g, y0Var2.f3374j);
        long j2 = 0;
        g60 g60 = this.f3125g.r;
        if (g60 != null) {
            try {
                j2 = g60.getValue();
            } catch (RemoteException unused2) {
                qc.d("Cannot get correlation id, default to 0.");
            }
        }
        String uuid = UUID.randomUUID().toString();
        Bundle a3 = x0.k().a(this.f3125g.f3368d, this, a);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i7 = 0; i7 < this.f3125g.w.size(); i7++) {
            String b2 = this.f3125g.w.b(i7);
            arrayList.add(b2);
            if (this.f3125g.v.containsKey(b2) && this.f3125g.v.get(b2) != null) {
                arrayList2.add(b2);
            }
        }
        ld a4 = s9.a(new e1(this));
        ld a5 = s9.a(new f1(this));
        String c2 = u8Var != null ? u8Var.c() : null;
        List<String> list = this.f3125g.G;
        if (list != null && list.size() > 0) {
            if (packageInfo != null) {
                i3 = packageInfo.versionCode;
            }
            if (i3 > x0.j().m().g()) {
                x0.j().m().m();
                x0.j().m().a(i3);
            } else {
                JSONObject l2 = x0.j().m().l();
                if (!(l2 == null || (optJSONArray = l2.optJSONArray(this.f3125g.f3367c)) == null)) {
                    str = optJSONArray.toString();
                    y0 y0Var3 = this.f3125g;
                    n40 n40 = y0Var3.f3374j;
                    String str2 = y0Var3.f3367c;
                    String d2 = a50.d();
                    y0 y0Var4 = this.f3125g;
                    sc scVar = y0Var4.f3370f;
                    List<String> list2 = y0Var4.G;
                    boolean a6 = x0.j().m().a();
                    int i8 = displayMetrics.widthPixels;
                    int i9 = displayMetrics.heightPixels;
                    float f2 = displayMetrics.density;
                    List<String> a7 = k80.a();
                    y0 y0Var5 = this.f3125g;
                    String str3 = y0Var5.f3366b;
                    na0 na0 = y0Var5.x;
                    String f3 = y0Var5.f();
                    float a8 = x0.E().a();
                    boolean b3 = x0.E().b();
                    x0.f();
                    int j3 = u9.j(this.f3125g.f3368d);
                    x0.f();
                    int f4 = u9.f(this.f3125g.f3371g);
                    boolean z = this.f3125g.f3368d instanceof Activity;
                    boolean f5 = x0.j().m().f();
                    boolean f6 = x0.j().f();
                    int a9 = x0.A().a();
                    x0.f();
                    Bundle e2 = u9.e();
                    String a10 = x0.p().a();
                    u60 u60 = this.f3125g.z;
                    boolean b4 = x0.p().b();
                    Bundle i10 = bf0.j().i();
                    boolean e3 = x0.j().m().e(this.f3125g.f3367c);
                    y0 y0Var6 = this.f3125g;
                    List<Integer> list3 = y0Var6.B;
                    boolean a11 = c.b(y0Var6.f3368d).a();
                    boolean g2 = x0.j().g();
                    x0.h();
                    return new k3(bundle2, j40, n40, str2, applicationInfo, packageInfo, a, d2, scVar, a3, list2, arrayList, bundle, a6, i8, i9, f2, a2, j2, uuid, a7, str3, na0, f3, a8, b3, j3, f4, z, f5, a4, c2, f6, a9, e2, a10, u60, b4, i10, e3, a5, list3, str, arrayList2, i2, a11, g2, aa.f(), (ArrayList) ad.a(x0.j().n(), (Object) null, 1000, TimeUnit.MILLISECONDS));
                }
            }
        }
        str = null;
        y0 y0Var32 = this.f3125g;
        n40 n402 = y0Var32.f3374j;
        String str22 = y0Var32.f3367c;
        String d22 = a50.d();
        y0 y0Var42 = this.f3125g;
        sc scVar2 = y0Var42.f3370f;
        List<String> list22 = y0Var42.G;
        boolean a62 = x0.j().m().a();
        int i82 = displayMetrics.widthPixels;
        int i92 = displayMetrics.heightPixels;
        float f22 = displayMetrics.density;
        List<String> a72 = k80.a();
        y0 y0Var52 = this.f3125g;
        String str32 = y0Var52.f3366b;
        na0 na02 = y0Var52.x;
        String f32 = y0Var52.f();
        float a82 = x0.E().a();
        boolean b32 = x0.E().b();
        x0.f();
        int j32 = u9.j(this.f3125g.f3368d);
        x0.f();
        int f42 = u9.f(this.f3125g.f3371g);
        boolean z2 = this.f3125g.f3368d instanceof Activity;
        boolean f52 = x0.j().m().f();
        boolean f62 = x0.j().f();
        int a92 = x0.A().a();
        x0.f();
        Bundle e22 = u9.e();
        String a102 = x0.p().a();
        u60 u602 = this.f3125g.z;
        boolean b42 = x0.p().b();
        Bundle i102 = bf0.j().i();
        boolean e32 = x0.j().m().e(this.f3125g.f3367c);
        y0 y0Var62 = this.f3125g;
        List<Integer> list32 = y0Var62.B;
        boolean a112 = c.b(y0Var62.f3368d).a();
        boolean g22 = x0.j().g();
        x0.h();
        return new k3(bundle2, j40, n402, str22, applicationInfo, packageInfo, a, d22, scVar2, a3, list22, arrayList, bundle, a62, i82, i92, f22, a2, j2, uuid, a72, str32, na02, f32, a82, b32, j32, f42, z2, f52, a4, c2, f62, a92, e22, a102, u602, b42, i102, e32, a5, list32, str, arrayList2, i2, a112, g22, aa.f(), (ArrayList) ad.a(x0.j().n(), (Object) null, 1000, TimeUnit.MILLISECONDS));
    }

    static String c(q8 q8Var) {
        ai0 ai0;
        if (q8Var == null) {
            return null;
        }
        String str = q8Var.q;
        if (("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) && (ai0 = q8Var.o) != null) {
            try {
                return new JSONObject(ai0.f3816k).getString("class_name");
            } catch (NullPointerException | JSONException unused) {
            }
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.q0
    public final void A1() {
        Executor executor = rd.a;
        n0 n0Var = this.f3124f;
        n0Var.getClass();
        executor.execute(d1.a(n0Var));
    }

    @Override // com.google.android.gms.ads.internal.q0
    public final void B1() {
        Executor executor = rd.a;
        n0 n0Var = this.f3124f;
        n0Var.getClass();
        executor.execute(c1.a(n0Var));
    }

    @Override // com.google.android.gms.ads.internal.overlay.n
    public void C1() {
        this.o = false;
        f2();
        this.f3125g.f3377m.d();
    }

    @Override // com.google.android.gms.ads.internal.overlay.n
    public void D1() {
        this.o = true;
        h2();
    }

    @Override // com.google.android.gms.internal.ads.r50, com.google.android.gms.ads.internal.a
    public void E() {
        lg lgVar;
        ui0 ui0;
        y.a("resume must be called on the main UI thread.");
        q8 q8Var = this.f3125g.f3375k;
        if (q8Var == null || (lgVar = q8Var.f5319b) == null) {
            lgVar = null;
        }
        if (lgVar != null && this.f3125g.d()) {
            x0.h();
            aa.b(this.f3125g.f3375k.f5319b);
        }
        q8 q8Var2 = this.f3125g.f3375k;
        if (!(q8Var2 == null || (ui0 = q8Var2.p) == null)) {
            try {
                ui0.E();
            } catch (RemoteException unused) {
                qc.d("Could not resume mediation adapter.");
            }
        }
        if (lgVar == null || !lgVar.i0()) {
            this.f3124f.c();
        }
        this.f3127i.d(this.f3125g.f3375k);
    }

    @Override // com.google.android.gms.internal.ads.ci0
    public void M1() {
        d();
    }

    @Override // com.google.android.gms.internal.ads.ci0
    public final void O1() {
        q8 q8Var = this.f3125g.f3375k;
        if (q8Var != null) {
            String str = q8Var.q;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 74);
            sb.append("Mediation adapter ");
            sb.append(str);
            sb.append(" refreshed, but mediation adapters should never refresh.");
            qc.d(sb.toString());
        }
        a(this.f3125g.f3375k, true);
        b(this.f3125g.f3375k, true);
        i2();
    }

    @Override // com.google.android.gms.internal.ads.ci0
    public final void U1() {
        C1();
    }

    @Override // com.google.android.gms.internal.ads.ci0
    public void V1() {
        c();
    }

    @Override // com.google.android.gms.internal.ads.ci0
    public final void X1() {
        g2();
    }

    @Override // com.google.android.gms.ads.internal.a, com.google.android.gms.internal.ads.n0
    public final void a(q8 q8Var) {
        bi0 bi0;
        List<String> list;
        super.a(q8Var);
        if (q8Var.o != null) {
            qc.b("Disable the debug gesture detector on the mediation ad frame.");
            z0 z0Var = this.f3125g.f3371g;
            if (z0Var != null) {
                z0Var.d();
            }
            qc.b("Pinging network fill URLs.");
            x0.y();
            y0 y0Var = this.f3125g;
            ki0.a(y0Var.f3368d, y0Var.f3370f.f5529b, q8Var, y0Var.f3367c, false, q8Var.o.f3815j);
            bi0 bi02 = q8Var.r;
            if (!(bi02 == null || (list = bi02.f3918g) == null || list.size() <= 0)) {
                qc.b("Pinging urls remotely");
                x0.f().a(this.f3125g.f3368d, q8Var.r.f3918g);
            }
        } else {
            qc.b("Enable the debug gesture detector on the admob ad frame.");
            z0 z0Var2 = this.f3125g.f3371g;
            if (z0Var2 != null) {
                z0Var2.c();
            }
        }
        if (q8Var.f5321d == 3 && (bi0 = q8Var.r) != null && bi0.f3917f != null) {
            qc.b("Pinging no fill URLs.");
            x0.y();
            y0 y0Var2 = this.f3125g;
            ki0.a(y0Var2.f3368d, y0Var2.f3370f.f5529b, q8Var, y0Var2.f3367c, false, q8Var.r.f3917f);
        }
    }

    /* access modifiers changed from: protected */
    public void a(q8 q8Var, boolean z) {
        if (q8Var == null) {
            qc.d("Ad state was null when trying to ping impression URLs.");
            return;
        }
        if (q8Var == null) {
            qc.d("Ad state was null when trying to ping impression URLs.");
        } else {
            qc.b("Pinging Impression URLs.");
            s8 s8Var = this.f3125g.f3377m;
            if (s8Var != null) {
                s8Var.b();
            }
            q8Var.K.a(t20.AD_IMPRESSION);
            if (q8Var.f5322e != null && !q8Var.D) {
                x0.f();
                y0 y0Var = this.f3125g;
                u9.a(y0Var.f3368d, y0Var.f3370f.f5529b, c(q8Var.f5322e));
                q8Var.D = true;
            }
        }
        if (!q8Var.F || z) {
            bi0 bi0 = q8Var.r;
            if (!(bi0 == null || bi0.f3915d == null)) {
                x0.y();
                y0 y0Var2 = this.f3125g;
                ki0.a(y0Var2.f3368d, y0Var2.f3370f.f5529b, q8Var, y0Var2.f3367c, z, c(q8Var.r.f3915d));
            }
            ai0 ai0 = q8Var.o;
            if (!(ai0 == null || ai0.f3812g == null)) {
                x0.y();
                y0 y0Var3 = this.f3125g;
                ki0.a(y0Var3.f3368d, y0Var3.f3370f.f5529b, q8Var, y0Var3.f3367c, z, q8Var.o.f3812g);
            }
            q8Var.F = true;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        if (r0 > 0) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(com.google.android.gms.internal.ads.j40 r5, com.google.android.gms.internal.ads.q8 r6, boolean r7) {
        /*
            r4 = this;
            if (r7 != 0) goto L_0x0031
            com.google.android.gms.ads.internal.y0 r7 = r4.f3125g
            boolean r7 = r7.d()
            if (r7 == 0) goto L_0x0031
            long r0 = r6.f5326i
            r2 = 0
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 <= 0) goto L_0x0018
        L_0x0012:
            com.google.android.gms.ads.internal.n0 r6 = r4.f3124f
            r6.a(r5, r0)
            goto L_0x0031
        L_0x0018:
            com.google.android.gms.internal.ads.bi0 r7 = r6.r
            if (r7 == 0) goto L_0x0023
            long r0 = r7.f3921j
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 <= 0) goto L_0x0023
            goto L_0x0012
        L_0x0023:
            boolean r7 = r6.n
            if (r7 != 0) goto L_0x0031
            int r6 = r6.f5321d
            r7 = 2
            if (r6 != r7) goto L_0x0031
            com.google.android.gms.ads.internal.n0 r6 = r4.f3124f
            r6.b(r5)
        L_0x0031:
            com.google.android.gms.ads.internal.n0 r5 = r4.f3124f
            boolean r5 = r5.e()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.b1.a(com.google.android.gms.internal.ads.j40, com.google.android.gms.internal.ads.q8, boolean):boolean");
    }

    @Override // com.google.android.gms.ads.internal.a
    public boolean a(j40 j40, x80 x80) {
        return a(j40, x80, 1);
    }

    public final boolean a(j40 j40, x80 x80, int i2) {
        u8 u8Var;
        if (!n2()) {
            return false;
        }
        x0.f();
        i10 a = x0.j().a(this.f3125g.f3368d);
        String str = null;
        Bundle a2 = a == null ? null : u9.a(a);
        this.f3124f.a();
        this.f3125g.J = 0;
        if (((Boolean) a50.g().a(k80.r2)).booleanValue()) {
            u8Var = x0.j().m().h();
            e n2 = x0.n();
            y0 y0Var = this.f3125g;
            Context context = y0Var.f3368d;
            sc scVar = y0Var.f3370f;
            String str2 = y0Var.f3367c;
            if (u8Var != null) {
                str = u8Var.d();
            }
            n2.a(context, scVar, false, u8Var, str, str2, null);
        } else {
            u8Var = null;
        }
        return a(a(j40, a2, u8Var, i2), x80);
    }

    public final boolean a(k3 k3Var, x80 x80) {
        this.f3120b = x80;
        x80.a("seq_num", k3Var.f4762g);
        x80.a("request_id", k3Var.v);
        x80.a("session_id", k3Var.f4763h);
        PackageInfo packageInfo = k3Var.f4761f;
        if (packageInfo != null) {
            x80.a("app_version", String.valueOf(packageInfo.versionCode));
        }
        y0 y0Var = this.f3125g;
        x0.b();
        Context context = this.f3125g.f3368d;
        v20 v20 = this.f3131m.f3342d;
        g9 f4Var = k3Var.f4757b.f4676d.getBundle("sdk_less_server_data") != null ? new f4(context, k3Var, this, v20) : new n2(context, k3Var, this, v20);
        f4Var.e();
        y0Var.f3372h = f4Var;
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.ads.internal.a
    public boolean a(q8 q8Var, q8 q8Var2) {
        int i2;
        ei0 ei0;
        if (!(q8Var == null || (ei0 = q8Var.s) == null)) {
            ei0.a((ci0) null);
        }
        ei0 ei02 = q8Var2.s;
        if (ei02 != null) {
            ei02.a((ci0) this);
        }
        bi0 bi0 = q8Var2.r;
        int i3 = 0;
        if (bi0 != null) {
            i3 = bi0.r;
            i2 = bi0.s;
        } else {
            i2 = 0;
        }
        this.f3125g.H.a(i3, i2);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.ci0
    public void a2() {
        qc.d("Mediated ad does not support onVideoEnd callback");
    }

    /* access modifiers changed from: protected */
    public final void b(q8 q8Var, boolean z) {
        if (q8Var != null) {
            if (!(q8Var == null || q8Var.f5323f == null || q8Var.E)) {
                x0.f();
                y0 y0Var = this.f3125g;
                u9.a(y0Var.f3368d, y0Var.f3370f.f5529b, b(q8Var.f5323f));
                q8Var.E = true;
            }
            if (!q8Var.G || z) {
                bi0 bi0 = q8Var.r;
                if (!(bi0 == null || bi0.f3916e == null)) {
                    x0.y();
                    y0 y0Var2 = this.f3125g;
                    ki0.a(y0Var2.f3368d, y0Var2.f3370f.f5529b, q8Var, y0Var2.f3367c, z, b(q8Var.r.f3916e));
                }
                ai0 ai0 = q8Var.o;
                if (!(ai0 == null || ai0.f3813h == null)) {
                    x0.y();
                    y0 y0Var3 = this.f3125g;
                    ki0.a(y0Var3.f3368d, y0Var3.f3370f.f5529b, q8Var, y0Var3.f3367c, z, q8Var.o.f3813h);
                }
                q8Var.G = true;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ci0
    public final void b(tb0 tb0, String str) {
        String str2;
        ec0 ec0 = null;
        if (tb0 != null) {
            try {
                str2 = tb0.n();
            } catch (RemoteException e2) {
                qc.c("Unable to call onCustomClick.", e2);
                return;
            }
        } else {
            str2 = null;
        }
        if (!(this.f3125g.v == null || str2 == null)) {
            ec0 = this.f3125g.v.get(str2);
        }
        if (ec0 == null) {
            qc.d("Mediation adapter invoked onCustomClick but no listeners were set.");
        } else {
            ec0.a(tb0, str);
        }
    }

    @Override // com.google.android.gms.internal.ads.ci0
    public final void b(String str, String str2) {
        a(str, str2);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.ads.internal.a
    public final boolean b(q8 q8Var) {
        j40 j40 = this.f3126h;
        boolean z = false;
        if (j40 != null) {
            this.f3126h = null;
        } else {
            j40 = q8Var.a;
            Bundle bundle = j40.f4676d;
            if (bundle != null) {
                z = bundle.getBoolean("_noRefresh", false);
            }
        }
        return a(j40, q8Var, z);
    }

    public final void c() {
        a(this.f3125g.f3375k, false);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.ads.internal.a
    public final boolean c(j40 j40) {
        return super.c(j40) && !this.o;
    }

    @Override // com.google.android.gms.internal.ads.d40, com.google.android.gms.ads.internal.a
    public void d() {
        q8 q8Var = this.f3125g.f3375k;
        if (q8Var == null) {
            qc.d("Ad state was null when trying to ping click URLs.");
            return;
        }
        bi0 bi0 = q8Var.r;
        if (!(bi0 == null || bi0.f3914c == null)) {
            x0.y();
            y0 y0Var = this.f3125g;
            Context context = y0Var.f3368d;
            String str = y0Var.f3370f.f5529b;
            q8 q8Var2 = y0Var.f3375k;
            ki0.a(context, str, q8Var2, y0Var.f3367c, false, c(q8Var2.r.f3914c));
        }
        ai0 ai0 = this.f3125g.f3375k.o;
        if (!(ai0 == null || ai0.f3811f == null)) {
            x0.y();
            y0 y0Var2 = this.f3125g;
            Context context2 = y0Var2.f3368d;
            String str2 = y0Var2.f3370f.f5529b;
            q8 q8Var3 = y0Var2.f3375k;
            ki0.a(context2, str2, q8Var3, y0Var2.f3367c, false, q8Var3.o.f3811f);
        }
        super.d();
    }

    @Override // com.google.android.gms.internal.ads.ci0
    public final void d2() {
        D1();
    }

    @Override // com.google.android.gms.internal.ads.r50
    public final String k() {
        q8 q8Var = this.f3125g.f3375k;
        if (q8Var == null) {
            return null;
        }
        return q8Var.q;
    }

    @Override // com.google.android.gms.internal.ads.r50
    public final String m0() {
        q8 q8Var = this.f3125g.f3375k;
        if (q8Var == null) {
            return null;
        }
        return c(q8Var);
    }

    /* access modifiers changed from: protected */
    public boolean n2() {
        x0.f();
        if (u9.b(this.f3125g.f3368d, "android.permission.INTERNET")) {
            x0.f();
            return u9.c(this.f3125g.f3368d);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.n
    public final void onPause() {
        this.f3127i.c(this.f3125g.f3375k);
    }

    @Override // com.google.android.gms.ads.internal.overlay.n
    public final void onResume() {
        this.f3127i.d(this.f3125g.f3375k);
    }

    @Override // com.google.android.gms.internal.ads.r50
    public void showInterstitial() {
        qc.d("showInterstitial is not supported for current ad type");
    }

    @Override // com.google.android.gms.internal.ads.r50, com.google.android.gms.ads.internal.a
    public void y() {
        ui0 ui0;
        y.a("pause must be called on the main UI thread.");
        y0 y0Var = this.f3125g;
        q8 q8Var = y0Var.f3375k;
        if (!(q8Var == null || q8Var.f5319b == null || !y0Var.d())) {
            x0.h();
            aa.a(this.f3125g.f3375k.f5319b);
        }
        q8 q8Var2 = this.f3125g.f3375k;
        if (!(q8Var2 == null || (ui0 = q8Var2.p) == null)) {
            try {
                ui0.y();
            } catch (RemoteException unused) {
                qc.d("Could not pause mediation adapter.");
            }
        }
        this.f3127i.c(this.f3125g.f3375k);
        this.f3124f.b();
    }
}
