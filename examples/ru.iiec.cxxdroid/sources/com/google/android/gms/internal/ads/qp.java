package com.google.android.gms.internal.ads;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* access modifiers changed from: package-private */
public final class qp extends WeakReference<Throwable> {
    private final int a;

    public qp(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, null);
        if (th != null) {
            this.a = System.identityHashCode(th);
            return;
        }
        throw new NullPointerException("The referent cannot be null");
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == qp.class) {
            if (this == obj) {
                return true;
            }
            qp qpVar = (qp) obj;
            return this.a == qpVar.a && get() == qpVar.get();
        }
    }

    public final int hashCode() {
        return this.a;
    }
}
