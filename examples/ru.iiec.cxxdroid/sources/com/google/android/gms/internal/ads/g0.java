package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.x0;
import com.google.android.gms.common.internal.y;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

@k2
public abstract class g0 implements na<Void>, uh {
    private final n0 a;

    /* renamed from: b  reason: collision with root package name */
    protected final Context f4361b;

    /* renamed from: c  reason: collision with root package name */
    protected final lg f4362c;

    /* renamed from: d  reason: collision with root package name */
    private final r8 f4363d;

    /* renamed from: e  reason: collision with root package name */
    protected n3 f4364e;

    /* renamed from: f  reason: collision with root package name */
    private Runnable f4365f;

    /* renamed from: g  reason: collision with root package name */
    private AtomicBoolean f4366g = new AtomicBoolean(true);

    protected g0(Context context, r8 r8Var, lg lgVar, n0 n0Var) {
        this.f4361b = context;
        this.f4363d = r8Var;
        this.f4364e = this.f4363d.f5394b;
        this.f4362c = lgVar;
        this.a = n0Var;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.gms.internal.ads.na
    public final /* synthetic */ Void a() {
        y.a("Webview render task needs to be called on UI thread.");
        this.f4365f = new h0(this);
        u9.f5718h.postDelayed(this.f4365f, ((Long) a50.g().a(k80.A1)).longValue());
        b();
        return null;
    }

    /* access modifiers changed from: protected */
    public void a(int i2) {
        if (i2 != -2) {
            this.f4364e = new n3(i2, this.f4364e.f5034m);
        }
        this.f4362c.v0();
        n0 n0Var = this.a;
        r8 r8Var = this.f4363d;
        j3 j3Var = r8Var.a;
        j40 j40 = j3Var.f4662d;
        lg lgVar = this.f4362c;
        n3 n3Var = this.f4364e;
        List<String> list = n3Var.f5027f;
        List<String> list2 = n3Var.f5029h;
        List<String> list3 = n3Var.f5033l;
        int i3 = n3Var.n;
        long j2 = n3Var.f5034m;
        String str = j3Var.f4668j;
        boolean z = n3Var.f5031j;
        long j3 = n3Var.f5032k;
        n40 n40 = r8Var.f5396d;
        long j4 = n3Var.f5030i;
        long j5 = r8Var.f5398f;
        long j6 = n3Var.p;
        String str2 = n3Var.q;
        JSONObject jSONObject = r8Var.f5400h;
        o7 o7Var = n3Var.E;
        List<String> list4 = n3Var.F;
        List<String> list5 = n3Var.G;
        boolean z2 = n3Var.H;
        p3 p3Var = n3Var.I;
        List<String> list6 = n3Var.L;
        String str3 = n3Var.P;
        r20 r20 = r8Var.f5401i;
        n3 n3Var2 = r8Var.f5394b;
        n0Var.a(new q8(j40, lgVar, list, i2, list2, list3, i3, j2, str, z, null, null, null, null, null, j3, n40, j4, j5, j6, str2, jSONObject, null, o7Var, list4, list5, z2, p3Var, null, list6, str3, r20, n3Var2.T, r8Var.f5402j, n3Var2.V, n3Var.W, n3Var2.X, n3Var2.Y));
    }

    @Override // com.google.android.gms.internal.ads.uh
    public final void a(boolean z) {
        qc.b("WebView finished loading.");
        int i2 = 0;
        if (this.f4366g.getAndSet(false)) {
            if (z) {
                i2 = -2;
            }
            a(i2);
            u9.f5718h.removeCallbacks(this.f4365f);
        }
    }

    /* access modifiers changed from: protected */
    public abstract void b();

    @Override // com.google.android.gms.internal.ads.na
    public void cancel() {
        if (this.f4366g.getAndSet(false)) {
            this.f4362c.stopLoading();
            x0.h();
            aa.a(this.f4362c);
            a(-1);
            u9.f5718h.removeCallbacks(this.f4365f);
        }
    }
}
