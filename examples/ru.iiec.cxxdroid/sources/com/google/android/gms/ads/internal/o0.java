package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.j40;
import com.google.android.gms.internal.ads.qc;
import java.lang.ref.WeakReference;

/* access modifiers changed from: package-private */
public final class o0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ WeakReference f3253b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ n0 f3254c;

    o0(n0 n0Var, WeakReference weakReference) {
        this.f3254c = n0Var;
        this.f3253b = weakReference;
    }

    public final void run() {
        this.f3254c.f3249d = false;
        a aVar = (a) this.f3253b.get();
        if (aVar != null) {
            j40 j40 = this.f3254c.f3248c;
            if (aVar.c(j40)) {
                aVar.b(j40);
                return;
            }
            qc.c("Ad is not visible. Not refreshing ad.");
            aVar.f3124f.b(j40);
        }
    }
}
