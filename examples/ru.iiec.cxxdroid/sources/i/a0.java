package i;

import i.r;
import java.io.Closeable;

public final class a0 implements Closeable {

    /* renamed from: b  reason: collision with root package name */
    final y f8721b;

    /* renamed from: c  reason: collision with root package name */
    final w f8722c;

    /* renamed from: d  reason: collision with root package name */
    final int f8723d;

    /* renamed from: e  reason: collision with root package name */
    final String f8724e;

    /* renamed from: f  reason: collision with root package name */
    final q f8725f;

    /* renamed from: g  reason: collision with root package name */
    final r f8726g;

    /* renamed from: h  reason: collision with root package name */
    final b0 f8727h;

    /* renamed from: i  reason: collision with root package name */
    final a0 f8728i;

    /* renamed from: j  reason: collision with root package name */
    final a0 f8729j;

    /* renamed from: k  reason: collision with root package name */
    final a0 f8730k;

    /* renamed from: l  reason: collision with root package name */
    final long f8731l;

    /* renamed from: m  reason: collision with root package name */
    final long f8732m;
    private volatile d n;

    public static class a {
        y a;

        /* renamed from: b  reason: collision with root package name */
        w f8733b;

        /* renamed from: c  reason: collision with root package name */
        int f8734c;

        /* renamed from: d  reason: collision with root package name */
        String f8735d;

        /* renamed from: e  reason: collision with root package name */
        q f8736e;

        /* renamed from: f  reason: collision with root package name */
        r.a f8737f;

        /* renamed from: g  reason: collision with root package name */
        b0 f8738g;

        /* renamed from: h  reason: collision with root package name */
        a0 f8739h;

        /* renamed from: i  reason: collision with root package name */
        a0 f8740i;

        /* renamed from: j  reason: collision with root package name */
        a0 f8741j;

        /* renamed from: k  reason: collision with root package name */
        long f8742k;

        /* renamed from: l  reason: collision with root package name */
        long f8743l;

        public a() {
            this.f8734c = -1;
            this.f8737f = new r.a();
        }

        a(a0 a0Var) {
            this.f8734c = -1;
            this.a = a0Var.f8721b;
            this.f8733b = a0Var.f8722c;
            this.f8734c = a0Var.f8723d;
            this.f8735d = a0Var.f8724e;
            this.f8736e = a0Var.f8725f;
            this.f8737f = a0Var.f8726g.a();
            this.f8738g = a0Var.f8727h;
            this.f8739h = a0Var.f8728i;
            this.f8740i = a0Var.f8729j;
            this.f8741j = a0Var.f8730k;
            this.f8742k = a0Var.f8731l;
            this.f8743l = a0Var.f8732m;
        }

        private void a(String str, a0 a0Var) {
            if (a0Var.f8727h != null) {
                throw new IllegalArgumentException(str + ".body != null");
            } else if (a0Var.f8728i != null) {
                throw new IllegalArgumentException(str + ".networkResponse != null");
            } else if (a0Var.f8729j != null) {
                throw new IllegalArgumentException(str + ".cacheResponse != null");
            } else if (a0Var.f8730k != null) {
                throw new IllegalArgumentException(str + ".priorResponse != null");
            }
        }

        private void d(a0 a0Var) {
            if (a0Var.f8727h != null) {
                throw new IllegalArgumentException("priorResponse.body != null");
            }
        }

        public a a(int i2) {
            this.f8734c = i2;
            return this;
        }

        public a a(long j2) {
            this.f8743l = j2;
            return this;
        }

        public a a(a0 a0Var) {
            if (a0Var != null) {
                a("cacheResponse", a0Var);
            }
            this.f8740i = a0Var;
            return this;
        }

        public a a(b0 b0Var) {
            this.f8738g = b0Var;
            return this;
        }

        public a a(q qVar) {
            this.f8736e = qVar;
            return this;
        }

        public a a(r rVar) {
            this.f8737f = rVar.a();
            return this;
        }

        public a a(w wVar) {
            this.f8733b = wVar;
            return this;
        }

        public a a(y yVar) {
            this.a = yVar;
            return this;
        }

        public a a(String str) {
            this.f8735d = str;
            return this;
        }

        public a a(String str, String str2) {
            this.f8737f.a(str, str2);
            return this;
        }

        public a0 a() {
            if (this.a == null) {
                throw new IllegalStateException("request == null");
            } else if (this.f8733b == null) {
                throw new IllegalStateException("protocol == null");
            } else if (this.f8734c < 0) {
                throw new IllegalStateException("code < 0: " + this.f8734c);
            } else if (this.f8735d != null) {
                return new a0(this);
            } else {
                throw new IllegalStateException("message == null");
            }
        }

        public a b(long j2) {
            this.f8742k = j2;
            return this;
        }

        public a b(a0 a0Var) {
            if (a0Var != null) {
                a("networkResponse", a0Var);
            }
            this.f8739h = a0Var;
            return this;
        }

        public a c(a0 a0Var) {
            if (a0Var != null) {
                d(a0Var);
            }
            this.f8741j = a0Var;
            return this;
        }
    }

    a0(a aVar) {
        this.f8721b = aVar.a;
        this.f8722c = aVar.f8733b;
        this.f8723d = aVar.f8734c;
        this.f8724e = aVar.f8735d;
        this.f8725f = aVar.f8736e;
        this.f8726g = aVar.f8737f.a();
        this.f8727h = aVar.f8738g;
        this.f8728i = aVar.f8739h;
        this.f8729j = aVar.f8740i;
        this.f8730k = aVar.f8741j;
        this.f8731l = aVar.f8742k;
        this.f8732m = aVar.f8743l;
    }

    public String a(String str, String str2) {
        String a2 = this.f8726g.a(str);
        return a2 != null ? a2 : str2;
    }

    public String b(String str) {
        return a(str, null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        b0 b0Var = this.f8727h;
        if (b0Var != null) {
            b0Var.close();
            return;
        }
        throw new IllegalStateException("response is not eligible for a body and must not be closed");
    }

    public b0 l() {
        return this.f8727h;
    }

    public d m() {
        d dVar = this.n;
        if (dVar != null) {
            return dVar;
        }
        d a2 = d.a(this.f8726g);
        this.n = a2;
        return a2;
    }

    public a0 n() {
        return this.f8729j;
    }

    public int o() {
        return this.f8723d;
    }

    public q p() {
        return this.f8725f;
    }

    public r q() {
        return this.f8726g;
    }

    public boolean r() {
        int i2 = this.f8723d;
        return i2 >= 200 && i2 < 300;
    }

    public String s() {
        return this.f8724e;
    }

    public a0 t() {
        return this.f8728i;
    }

    public String toString() {
        return "Response{protocol=" + this.f8722c + ", code=" + this.f8723d + ", message=" + this.f8724e + ", url=" + this.f8721b.g() + '}';
    }

    public a u() {
        return new a(this);
    }

    public a0 v() {
        return this.f8730k;
    }

    public w w() {
        return this.f8722c;
    }

    public long x() {
        return this.f8732m;
    }

    public y y() {
        return this.f8721b;
    }

    public long z() {
        return this.f8731l;
    }
}
