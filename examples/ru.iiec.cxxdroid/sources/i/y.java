package i;

import i.f0.g.f;
import i.r;
import java.util.List;

public final class y {
    final s a;

    /* renamed from: b  reason: collision with root package name */
    final String f9222b;

    /* renamed from: c  reason: collision with root package name */
    final r f9223c;

    /* renamed from: d  reason: collision with root package name */
    final z f9224d;

    /* renamed from: e  reason: collision with root package name */
    final Object f9225e;

    /* renamed from: f  reason: collision with root package name */
    private volatile d f9226f;

    public static class a {
        s a;

        /* renamed from: b  reason: collision with root package name */
        String f9227b;

        /* renamed from: c  reason: collision with root package name */
        r.a f9228c;

        /* renamed from: d  reason: collision with root package name */
        z f9229d;

        /* renamed from: e  reason: collision with root package name */
        Object f9230e;

        public a() {
            this.f9227b = "GET";
            this.f9228c = new r.a();
        }

        a(y yVar) {
            this.a = yVar.a;
            this.f9227b = yVar.f9222b;
            this.f9229d = yVar.f9224d;
            this.f9230e = yVar.f9225e;
            this.f9228c = yVar.f9223c.a();
        }

        public a a(d dVar) {
            String dVar2 = dVar.toString();
            if (dVar2.isEmpty()) {
                a("Cache-Control");
                return this;
            }
            a("Cache-Control", dVar2);
            return this;
        }

        public a a(r rVar) {
            this.f9228c = rVar.a();
            return this;
        }

        public a a(s sVar) {
            if (sVar != null) {
                this.a = sVar;
                return this;
            }
            throw new NullPointerException("url == null");
        }

        public a a(String str) {
            this.f9228c.c(str);
            return this;
        }

        public a a(String str, z zVar) {
            if (str == null) {
                throw new NullPointerException("method == null");
            } else if (str.length() == 0) {
                throw new IllegalArgumentException("method.length() == 0");
            } else if (zVar != null && !f.b(str)) {
                throw new IllegalArgumentException("method " + str + " must not have a request body.");
            } else if (zVar != null || !f.e(str)) {
                this.f9227b = str;
                this.f9229d = zVar;
                return this;
            } else {
                throw new IllegalArgumentException("method " + str + " must have a request body.");
            }
        }

        public a a(String str, String str2) {
            this.f9228c.c(str, str2);
            return this;
        }

        public y a() {
            if (this.a != null) {
                return new y(this);
            }
            throw new IllegalStateException("url == null");
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x0045  */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x0049  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public i.y.a b(java.lang.String r7) {
            /*
            // Method dump skipped, instructions count: 104
            */
            throw new UnsupportedOperationException("Method not decompiled: i.y.a.b(java.lang.String):i.y$a");
        }
    }

    y(a aVar) {
        this.a = aVar.a;
        this.f9222b = aVar.f9227b;
        this.f9223c = aVar.f9228c.a();
        this.f9224d = aVar.f9229d;
        Object obj = aVar.f9230e;
        this.f9225e = obj == null ? this : obj;
    }

    public z a() {
        return this.f9224d;
    }

    public String a(String str) {
        return this.f9223c.a(str);
    }

    public d b() {
        d dVar = this.f9226f;
        if (dVar != null) {
            return dVar;
        }
        d a2 = d.a(this.f9223c);
        this.f9226f = a2;
        return a2;
    }

    public List<String> b(String str) {
        return this.f9223c.b(str);
    }

    public r c() {
        return this.f9223c;
    }

    public boolean d() {
        return this.a.h();
    }

    public String e() {
        return this.f9222b;
    }

    public a f() {
        return new a(this);
    }

    public s g() {
        return this.a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Request{method=");
        sb.append(this.f9222b);
        sb.append(", url=");
        sb.append(this.a);
        sb.append(", tag=");
        Object obj = this.f9225e;
        if (obj == this) {
            obj = null;
        }
        sb.append(obj);
        sb.append('}');
        return sb.toString();
    }
}
