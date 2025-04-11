package e.b.b.a.c.d;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* access modifiers changed from: package-private */
public final class j extends WeakReference<Throwable> {
    private final int a;

    public j(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        if (th != null) {
            this.a = System.identityHashCode(th);
            return;
        }
        throw new NullPointerException("The referent cannot be null");
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == j.class) {
            if (this == obj) {
                return true;
            }
            j jVar = (j) obj;
            return this.a == jVar.a && get() == jVar.get();
        }
    }

    public final int hashCode() {
        return this.a;
    }
}
