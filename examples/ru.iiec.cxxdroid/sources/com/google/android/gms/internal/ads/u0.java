package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.e0;
import java.util.concurrent.Future;

@k2
public final class u0 extends g9 {

    /* renamed from: d  reason: collision with root package name */
    private final n0 f5677d;

    /* renamed from: e  reason: collision with root package name */
    private final n3 f5678e;

    /* renamed from: f  reason: collision with root package name */
    private final r8 f5679f;

    /* renamed from: g  reason: collision with root package name */
    private final w0 f5680g;

    /* renamed from: h  reason: collision with root package name */
    private final Object f5681h;

    /* renamed from: i  reason: collision with root package name */
    private Future<q8> f5682i;

    public u0(Context context, e0 e0Var, r8 r8Var, cx cxVar, n0 n0Var, x80 x80) {
        this(r8Var, n0Var, new w0(context, e0Var, new eb(context), cxVar, r8Var, x80));
    }

    private u0(r8 r8Var, n0 n0Var, w0 w0Var) {
        this.f5681h = new Object();
        this.f5679f = r8Var;
        this.f5678e = r8Var.f5394b;
        this.f5677d = n0Var;
        this.f5680g = w0Var;
    }

    @Override // com.google.android.gms.internal.ads.g9
    public final void c() {
        synchronized (this.f5681h) {
            if (this.f5682i != null) {
                this.f5682i.cancel(true);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0024, code lost:
        r8 = 0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:? A[ExcHandler: InterruptedException | CancellationException | ExecutionException (unused java.lang.Throwable), SYNTHETIC, Splitter:B:7:0x0010] */
    @Override // com.google.android.gms.internal.ads.g9
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d() {
        /*
        // Method dump skipped, instructions count: 185
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.u0.d():void");
    }
}
