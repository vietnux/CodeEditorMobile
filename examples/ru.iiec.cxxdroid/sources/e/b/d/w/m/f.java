package e.b.d.w.m;

import e.b.d.g;
import e.b.d.j;
import e.b.d.l;
import e.b.d.m;
import e.b.d.o;
import e.b.d.y.c;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public final class f extends c {
    private static final Writer p = new a();
    private static final o q = new o("closed");

    /* renamed from: m  reason: collision with root package name */
    private final List<j> f7971m = new ArrayList();
    private String n;
    private j o = l.a;

    static class a extends Writer {
        a() {
        }

        @Override // java.io.Closeable, java.io.Writer, java.lang.AutoCloseable
        public void close() {
            throw new AssertionError();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
            throw new AssertionError();
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i2, int i3) {
            throw new AssertionError();
        }
    }

    public f() {
        super(p);
    }

    private void a(j jVar) {
        if (this.n != null) {
            if (!jVar.e() || p()) {
                ((m) u()).a(this.n, jVar);
            }
            this.n = null;
        } else if (this.f7971m.isEmpty()) {
            this.o = jVar;
        } else {
            j u = u();
            if (u instanceof g) {
                ((g) u).a(jVar);
                return;
            }
            throw new IllegalStateException();
        }
    }

    private j u() {
        List<j> list = this.f7971m;
        return list.get(list.size() - 1);
    }

    @Override // e.b.d.y.c
    public c a(Boolean bool) {
        if (bool == null) {
            s();
            return this;
        }
        a(new o(bool));
        return this;
    }

    @Override // e.b.d.y.c
    public c a(Number number) {
        if (number == null) {
            s();
            return this;
        }
        if (!r()) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        a(new o(number));
        return this;
    }

    @Override // e.b.d.y.c
    public c b(String str) {
        if (this.f7971m.isEmpty() || this.n != null) {
            throw new IllegalStateException();
        } else if (u() instanceof m) {
            this.n = str;
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    @Override // e.b.d.y.c, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f7971m.isEmpty()) {
            this.f7971m.add(q);
            return;
        }
        throw new IOException("Incomplete document");
    }

    @Override // e.b.d.y.c
    public c d(String str) {
        if (str == null) {
            s();
            return this;
        }
        a(new o(str));
        return this;
    }

    @Override // e.b.d.y.c
    public c d(boolean z) {
        a(new o(Boolean.valueOf(z)));
        return this;
    }

    @Override // e.b.d.y.c, java.io.Flushable
    public void flush() {
    }

    @Override // e.b.d.y.c
    public c g(long j2) {
        a(new o(Long.valueOf(j2)));
        return this;
    }

    @Override // e.b.d.y.c
    public c l() {
        g gVar = new g();
        a(gVar);
        this.f7971m.add(gVar);
        return this;
    }

    @Override // e.b.d.y.c
    public c m() {
        m mVar = new m();
        a(mVar);
        this.f7971m.add(mVar);
        return this;
    }

    @Override // e.b.d.y.c
    public c n() {
        if (this.f7971m.isEmpty() || this.n != null) {
            throw new IllegalStateException();
        } else if (u() instanceof g) {
            List<j> list = this.f7971m;
            list.remove(list.size() - 1);
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    @Override // e.b.d.y.c
    public c o() {
        if (this.f7971m.isEmpty() || this.n != null) {
            throw new IllegalStateException();
        } else if (u() instanceof m) {
            List<j> list = this.f7971m;
            list.remove(list.size() - 1);
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    @Override // e.b.d.y.c
    public c s() {
        a(l.a);
        return this;
    }

    public j t() {
        if (this.f7971m.isEmpty()) {
            return this.o;
        }
        throw new IllegalStateException("Expected one JSON element but was " + this.f7971m);
    }
}
