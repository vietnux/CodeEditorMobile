package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.Executor;

public final class y20 implements b {
    private final Executor a;

    public y20(Handler handler) {
        this.a = new z30(this, handler);
    }

    @Override // com.google.android.gms.internal.ads.b
    public final void a(bc0<?> bc0, d3 d3Var) {
        bc0.a("post-error");
        this.a.execute(new y40(this, bc0, di0.a(d3Var), null));
    }

    @Override // com.google.android.gms.internal.ads.b
    public final void a(bc0<?> bc0, di0<?> di0) {
        a(bc0, di0, null);
    }

    @Override // com.google.android.gms.internal.ads.b
    public final void a(bc0<?> bc0, di0<?> di0, Runnable runnable) {
        bc0.q();
        bc0.a("post-response");
        this.a.execute(new y40(this, bc0, di0, runnable));
    }
}
