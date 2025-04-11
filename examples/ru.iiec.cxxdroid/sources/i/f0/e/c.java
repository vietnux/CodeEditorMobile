package i.f0.e;

import i.a0;
import i.f0.g.d;
import i.f0.g.e;
import i.r;
import i.y;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public final class c {
    public final y a;

    /* renamed from: b  reason: collision with root package name */
    public final a0 f8814b;

    public static class a {
        final long a;

        /* renamed from: b  reason: collision with root package name */
        final y f8815b;

        /* renamed from: c  reason: collision with root package name */
        final a0 f8816c;

        /* renamed from: d  reason: collision with root package name */
        private Date f8817d;

        /* renamed from: e  reason: collision with root package name */
        private String f8818e;

        /* renamed from: f  reason: collision with root package name */
        private Date f8819f;

        /* renamed from: g  reason: collision with root package name */
        private String f8820g;

        /* renamed from: h  reason: collision with root package name */
        private Date f8821h;

        /* renamed from: i  reason: collision with root package name */
        private long f8822i;

        /* renamed from: j  reason: collision with root package name */
        private long f8823j;

        /* renamed from: k  reason: collision with root package name */
        private String f8824k;

        /* renamed from: l  reason: collision with root package name */
        private int f8825l = -1;

        public a(long j2, y yVar, a0 a0Var) {
            this.a = j2;
            this.f8815b = yVar;
            this.f8816c = a0Var;
            if (a0Var != null) {
                this.f8822i = a0Var.z();
                this.f8823j = a0Var.x();
                r q = a0Var.q();
                int b2 = q.b();
                for (int i2 = 0; i2 < b2; i2++) {
                    String a2 = q.a(i2);
                    String b3 = q.b(i2);
                    if ("Date".equalsIgnoreCase(a2)) {
                        this.f8817d = d.a(b3);
                        this.f8818e = b3;
                    } else if ("Expires".equalsIgnoreCase(a2)) {
                        this.f8821h = d.a(b3);
                    } else if ("Last-Modified".equalsIgnoreCase(a2)) {
                        this.f8819f = d.a(b3);
                        this.f8820g = b3;
                    } else if ("ETag".equalsIgnoreCase(a2)) {
                        this.f8824k = b3;
                    } else if ("Age".equalsIgnoreCase(a2)) {
                        this.f8825l = e.a(b3, -1);
                    }
                }
            }
        }

        private static boolean a(y yVar) {
            return (yVar.a("If-Modified-Since") == null && yVar.a("If-None-Match") == null) ? false : true;
        }

        private long b() {
            Date date = this.f8817d;
            long j2 = 0;
            if (date != null) {
                j2 = Math.max(0L, this.f8823j - date.getTime());
            }
            int i2 = this.f8825l;
            if (i2 != -1) {
                j2 = Math.max(j2, TimeUnit.SECONDS.toMillis((long) i2));
            }
            long j3 = this.f8823j;
            return j2 + (j3 - this.f8822i) + (this.a - j3);
        }

        private long c() {
            i.d m2 = this.f8816c.m();
            if (m2.d() != -1) {
                return TimeUnit.SECONDS.toMillis((long) m2.d());
            }
            if (this.f8821h != null) {
                Date date = this.f8817d;
                long time = this.f8821h.getTime() - (date != null ? date.getTime() : this.f8823j);
                if (time > 0) {
                    return time;
                }
                return 0;
            } else if (this.f8819f == null || this.f8816c.y().g().k() != null) {
                return 0;
            } else {
                Date date2 = this.f8817d;
                long time2 = (date2 != null ? date2.getTime() : this.f8822i) - this.f8819f.getTime();
                if (time2 > 0) {
                    return time2 / 10;
                }
                return 0;
            }
        }

        private c d() {
            if (this.f8816c == null) {
                return new c(this.f8815b, null);
            }
            if (this.f8815b.d() && this.f8816c.p() == null) {
                return new c(this.f8815b, null);
            }
            if (!c.a(this.f8816c, this.f8815b)) {
                return new c(this.f8815b, null);
            }
            i.d b2 = this.f8815b.b();
            if (b2.h() || a(this.f8815b)) {
                return new c(this.f8815b, null);
            }
            i.d m2 = this.f8816c.m();
            if (m2.a()) {
                return new c(null, this.f8816c);
            }
            long b3 = b();
            long c2 = c();
            if (b2.d() != -1) {
                c2 = Math.min(c2, TimeUnit.SECONDS.toMillis((long) b2.d()));
            }
            long j2 = 0;
            long millis = b2.f() != -1 ? TimeUnit.SECONDS.toMillis((long) b2.f()) : 0;
            if (!m2.g() && b2.e() != -1) {
                j2 = TimeUnit.SECONDS.toMillis((long) b2.e());
            }
            if (!m2.h()) {
                long j3 = millis + b3;
                if (j3 < j2 + c2) {
                    a0.a u = this.f8816c.u();
                    if (j3 >= c2) {
                        u.a("Warning", "110 HttpURLConnection \"Response is stale\"");
                    }
                    if (b3 > 86400000 && e()) {
                        u.a("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                    }
                    return new c(null, u.a());
                }
            }
            String str = this.f8824k;
            String str2 = "If-Modified-Since";
            if (str != null) {
                str2 = "If-None-Match";
            } else if (this.f8819f != null) {
                str = this.f8820g;
            } else if (this.f8817d == null) {
                return new c(this.f8815b, null);
            } else {
                str = this.f8818e;
            }
            r.a a2 = this.f8815b.c().a();
            i.f0.a.a.a(a2, str2, str);
            y.a f2 = this.f8815b.f();
            f2.a(a2.a());
            return new c(f2.a(), this.f8816c);
        }

        private boolean e() {
            return this.f8816c.m().d() == -1 && this.f8821h == null;
        }

        public c a() {
            c d2 = d();
            return (d2.a == null || !this.f8815b.b().j()) ? d2 : new c(null, null);
        }
    }

    c(y yVar, a0 a0Var) {
        this.a = yVar;
        this.f8814b = a0Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0056, code lost:
        if (r3.m().b() == false) goto L_0x0059;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(i.a0 r3, i.y r4) {
        /*
        // Method dump skipped, instructions count: 122
        */
        throw new UnsupportedOperationException("Method not decompiled: i.f0.e.c.a(i.a0, i.y):boolean");
    }
}
