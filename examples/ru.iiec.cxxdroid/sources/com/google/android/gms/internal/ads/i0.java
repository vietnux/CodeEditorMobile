package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.SystemClock;

@k2
public abstract class i0 extends g9 {

    /* renamed from: d  reason: collision with root package name */
    protected final n0 f4569d;

    /* renamed from: e  reason: collision with root package name */
    protected final Context f4570e;

    /* renamed from: f  reason: collision with root package name */
    protected final Object f4571f = new Object();

    /* renamed from: g  reason: collision with root package name */
    protected final Object f4572g = new Object();

    /* renamed from: h  reason: collision with root package name */
    protected final r8 f4573h;

    /* renamed from: i  reason: collision with root package name */
    protected n3 f4574i;

    protected i0(Context context, r8 r8Var, n0 n0Var) {
        super(true);
        this.f4570e = context;
        this.f4573h = r8Var;
        this.f4574i = r8Var.f5394b;
        this.f4569d = n0Var;
    }

    /* access modifiers changed from: protected */
    public abstract void a(long j2);

    /* access modifiers changed from: protected */
    public abstract q8 b(int i2);

    @Override // com.google.android.gms.internal.ads.g9
    public void c() {
    }

    @Override // com.google.android.gms.internal.ads.g9
    public final void d() {
        synchronized (this.f4571f) {
            qc.b("AdRendererBackgroundTask started.");
            int i2 = this.f4573h.f5397e;
            try {
                a(SystemClock.elapsedRealtime());
            } catch (l0 e2) {
                int b2 = e2.b();
                if (b2 == 3 || b2 == -1) {
                    qc.c(e2.getMessage());
                } else {
                    qc.d(e2.getMessage());
                }
                this.f4574i = this.f4574i == null ? new n3(b2) : new n3(b2, this.f4574i.f5034m);
                u9.f5718h.post(new j0(this));
                i2 = b2;
            }
            u9.f5718h.post(new k0(this, b(i2)));
        }
    }
}
