package e.b.d;

import e.b.d.w.m.f;
import e.b.d.y.b;
import e.b.d.y.c;
import java.io.IOException;

public abstract class t<T> {

    /* access modifiers changed from: package-private */
    public class a extends t<T> {
        a() {
        }

        @Override // e.b.d.t
        public T a(e.b.d.y.a aVar) {
            if (aVar.B() != b.NULL) {
                return (T) t.this.a(aVar);
            }
            aVar.z();
            return null;
        }

        @Override // e.b.d.t
        public void a(c cVar, T t) {
            if (t == null) {
                cVar.s();
            } else {
                t.this.a(cVar, t);
            }
        }
    }

    public final j a(T t) {
        try {
            f fVar = new f();
            a(fVar, t);
            return fVar.t();
        } catch (IOException e2) {
            throw new k(e2);
        }
    }

    public final t<T> a() {
        return new a();
    }

    public abstract T a(e.b.d.y.a aVar);

    public abstract void a(c cVar, T t);
}
