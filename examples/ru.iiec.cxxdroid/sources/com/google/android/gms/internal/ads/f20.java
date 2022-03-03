package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.d;

/* access modifiers changed from: package-private */
public final class f20 implements d.a {
    private final /* synthetic */ c20 a;

    f20(c20 c20) {
        this.a = c20;
    }

    @Override // com.google.android.gms.common.internal.d.a
    public final void e(int i2) {
        synchronized (this.a.f3961b) {
            this.a.f3964e = null;
            this.a.f3961b.notifyAll();
        }
    }

    @Override // com.google.android.gms.common.internal.d.a
    public final void j(Bundle bundle) {
        synchronized (this.a.f3961b) {
            try {
                if (this.a.f3962c != null) {
                    this.a.f3964e = this.a.f3962c.B();
                }
            } catch (DeadObjectException e2) {
                qc.b("Unable to obtain a cache service instance.", e2);
                this.a.c();
            }
            this.a.f3961b.notifyAll();
        }
    }
}
