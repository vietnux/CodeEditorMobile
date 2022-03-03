package g;

import g.r.c.a;
import g.r.d.g;
import java.io.Serializable;

/* access modifiers changed from: package-private */
public final class i<T> implements d<T>, Serializable {

    /* renamed from: b  reason: collision with root package name */
    private a<? extends T> f8604b;

    /* renamed from: c  reason: collision with root package name */
    private volatile Object f8605c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f8606d;

    public i(a<? extends T> aVar, Object obj) {
        g.r.d.i.c(aVar, "initializer");
        this.f8604b = aVar;
        this.f8605c = l.a;
        this.f8606d = obj == null ? this : obj;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(a aVar, Object obj, int i2, g gVar) {
        this(aVar, (i2 & 2) != 0 ? null : obj);
    }

    public boolean b() {
        return this.f8605c != l.a;
    }

    @Override // g.d
    public T getValue() {
        T t;
        T t2 = (T) this.f8605c;
        if (t2 != l.a) {
            return t2;
        }
        synchronized (this.f8606d) {
            t = (T) this.f8605c;
            if (t == l.a) {
                a<? extends T> aVar = this.f8604b;
                g.r.d.i.a(aVar);
                t = (T) aVar.c();
                this.f8605c = t;
                this.f8604b = null;
            }
        }
        return t;
    }

    public String toString() {
        return b() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
