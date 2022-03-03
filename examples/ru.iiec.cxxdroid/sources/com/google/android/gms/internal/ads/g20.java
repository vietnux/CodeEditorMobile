package com.google.android.gms.internal.ads;

import com.google.android.gms.common.b;
import com.google.android.gms.common.internal.d;

/* access modifiers changed from: package-private */
public final class g20 implements d.b {
    private final /* synthetic */ c20 a;

    g20(c20 c20) {
        this.a = c20;
    }

    @Override // com.google.android.gms.common.internal.d.b
    public final void a(b bVar) {
        synchronized (this.a.f3961b) {
            this.a.f3964e = null;
            if (this.a.f3962c != null) {
                this.a.f3962c = null;
            }
            this.a.f3961b.notifyAll();
        }
    }
}
