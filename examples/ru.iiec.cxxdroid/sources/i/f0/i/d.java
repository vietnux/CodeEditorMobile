package i.f0.i;

import j.c;
import j.e;
import j.f;
import j.l;
import j.s;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* access modifiers changed from: package-private */
public final class d {
    static final c[] a = {new c(c.f8953i, ""), new c(c.f8950f, "GET"), new c(c.f8950f, "POST"), new c(c.f8951g, "/"), new c(c.f8951g, "/index.html"), new c(c.f8952h, "http"), new c(c.f8952h, "https"), new c(c.f8949e, "200"), new c(c.f8949e, "204"), new c(c.f8949e, "206"), new c(c.f8949e, "304"), new c(c.f8949e, "400"), new c(c.f8949e, "404"), new c(c.f8949e, "500"), new c("accept-charset", ""), new c("accept-encoding", "gzip, deflate"), new c("accept-language", ""), new c("accept-ranges", ""), new c("accept", ""), new c("access-control-allow-origin", ""), new c("age", ""), new c("allow", ""), new c("authorization", ""), new c("cache-control", ""), new c("content-disposition", ""), new c("content-encoding", ""), new c("content-language", ""), new c("content-length", ""), new c("content-location", ""), new c("content-range", ""), new c("content-type", ""), new c("cookie", ""), new c("date", ""), new c("etag", ""), new c("expect", ""), new c("expires", ""), new c("from", ""), new c("host", ""), new c("if-match", ""), new c("if-modified-since", ""), new c("if-none-match", ""), new c("if-range", ""), new c("if-unmodified-since", ""), new c("last-modified", ""), new c("link", ""), new c("location", ""), new c("max-forwards", ""), new c("proxy-authenticate", ""), new c("proxy-authorization", ""), new c("range", ""), new c("referer", ""), new c("refresh", ""), new c("retry-after", ""), new c("server", ""), new c("set-cookie", ""), new c("strict-transport-security", ""), new c("transfer-encoding", ""), new c("user-agent", ""), new c("vary", ""), new c("via", ""), new c("www-authenticate", "")};

    /* renamed from: b  reason: collision with root package name */
    static final Map<f, Integer> f8956b = a();

    static final class a {
        private final List<c> a;

        /* renamed from: b  reason: collision with root package name */
        private final e f8957b;

        /* renamed from: c  reason: collision with root package name */
        private final int f8958c;

        /* renamed from: d  reason: collision with root package name */
        private int f8959d;

        /* renamed from: e  reason: collision with root package name */
        c[] f8960e;

        /* renamed from: f  reason: collision with root package name */
        int f8961f;

        /* renamed from: g  reason: collision with root package name */
        int f8962g;

        /* renamed from: h  reason: collision with root package name */
        int f8963h;

        a(int i2, int i3, s sVar) {
            this.a = new ArrayList();
            this.f8960e = new c[8];
            this.f8961f = this.f8960e.length - 1;
            this.f8962g = 0;
            this.f8963h = 0;
            this.f8958c = i2;
            this.f8959d = i3;
            this.f8957b = l.a(sVar);
        }

        a(int i2, s sVar) {
            this(i2, i2, sVar);
        }

        private int a(int i2) {
            return this.f8961f + 1 + i2;
        }

        private void a(int i2, c cVar) {
            this.a.add(cVar);
            int i3 = cVar.f8955c;
            if (i2 != -1) {
                i3 -= this.f8960e[a(i2)].f8955c;
            }
            int i4 = this.f8959d;
            if (i3 > i4) {
                e();
                return;
            }
            int b2 = b((this.f8963h + i3) - i4);
            if (i2 == -1) {
                int i5 = this.f8962g + 1;
                c[] cVarArr = this.f8960e;
                if (i5 > cVarArr.length) {
                    c[] cVarArr2 = new c[(cVarArr.length * 2)];
                    System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                    this.f8961f = this.f8960e.length - 1;
                    this.f8960e = cVarArr2;
                }
                int i6 = this.f8961f;
                this.f8961f = i6 - 1;
                this.f8960e[i6] = cVar;
                this.f8962g++;
            } else {
                this.f8960e[i2 + a(i2) + b2] = cVar;
            }
            this.f8963h += i3;
        }

        private int b(int i2) {
            int i3 = 0;
            if (i2 > 0) {
                int length = this.f8960e.length;
                while (true) {
                    length--;
                    if (length < this.f8961f || i2 <= 0) {
                        c[] cVarArr = this.f8960e;
                        int i4 = this.f8961f;
                        System.arraycopy(cVarArr, i4 + 1, cVarArr, i4 + 1 + i3, this.f8962g);
                        this.f8961f += i3;
                    } else {
                        c[] cVarArr2 = this.f8960e;
                        i2 -= cVarArr2[length].f8955c;
                        this.f8963h -= cVarArr2[length].f8955c;
                        this.f8962g--;
                        i3++;
                    }
                }
                c[] cVarArr3 = this.f8960e;
                int i42 = this.f8961f;
                System.arraycopy(cVarArr3, i42 + 1, cVarArr3, i42 + 1 + i3, this.f8962g);
                this.f8961f += i3;
            }
            return i3;
        }

        private f c(int i2) {
            c cVar;
            if (d(i2)) {
                cVar = d.a[i2];
            } else {
                int a2 = a(i2 - d.a.length);
                if (a2 >= 0) {
                    c[] cVarArr = this.f8960e;
                    if (a2 < cVarArr.length) {
                        cVar = cVarArr[a2];
                    }
                }
                throw new IOException("Header index too large " + (i2 + 1));
            }
            return cVar.a;
        }

        private void d() {
            int i2 = this.f8959d;
            int i3 = this.f8963h;
            if (i2 >= i3) {
                return;
            }
            if (i2 == 0) {
                e();
            } else {
                b(i3 - i2);
            }
        }

        private boolean d(int i2) {
            return i2 >= 0 && i2 <= d.a.length - 1;
        }

        private void e() {
            Arrays.fill(this.f8960e, (Object) null);
            this.f8961f = this.f8960e.length - 1;
            this.f8962g = 0;
            this.f8963h = 0;
        }

        private void e(int i2) {
            if (d(i2)) {
                this.a.add(d.a[i2]);
                return;
            }
            int a2 = a(i2 - d.a.length);
            if (a2 >= 0) {
                c[] cVarArr = this.f8960e;
                if (a2 < cVarArr.length) {
                    this.a.add(cVarArr[a2]);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i2 + 1));
        }

        private int f() {
            return this.f8957b.readByte() & 255;
        }

        private void f(int i2) {
            a(-1, new c(c(i2), b()));
        }

        private void g() {
            f b2 = b();
            d.a(b2);
            a(-1, new c(b2, b()));
        }

        private void g(int i2) {
            this.a.add(new c(c(i2), b()));
        }

        private void h() {
            f b2 = b();
            d.a(b2);
            this.a.add(new c(b2, b()));
        }

        /* access modifiers changed from: package-private */
        public int a(int i2, int i3) {
            int i4 = i2 & i3;
            if (i4 < i3) {
                return i4;
            }
            int i5 = 0;
            while (true) {
                int f2 = f();
                if ((f2 & 128) == 0) {
                    return i3 + (f2 << i5);
                }
                i3 += (f2 & 127) << i5;
                i5 += 7;
            }
        }

        public List<c> a() {
            ArrayList arrayList = new ArrayList(this.a);
            this.a.clear();
            return arrayList;
        }

        /* access modifiers changed from: package-private */
        public f b() {
            int f2 = f();
            boolean z = (f2 & 128) == 128;
            int a2 = a(f2, 127);
            return z ? f.a(k.b().a(this.f8957b.d((long) a2))) : this.f8957b.c((long) a2);
        }

        /* access modifiers changed from: package-private */
        public void c() {
            while (!this.f8957b.g()) {
                int readByte = this.f8957b.readByte() & 255;
                if (readByte == 128) {
                    throw new IOException("index == 0");
                } else if ((readByte & 128) == 128) {
                    e(a(readByte, 127) - 1);
                } else if (readByte == 64) {
                    g();
                } else if ((readByte & 64) == 64) {
                    f(a(readByte, 63) - 1);
                } else if ((readByte & 32) == 32) {
                    this.f8959d = a(readByte, 31);
                    int i2 = this.f8959d;
                    if (i2 < 0 || i2 > this.f8958c) {
                        throw new IOException("Invalid dynamic table size update " + this.f8959d);
                    }
                    d();
                } else if (readByte == 16 || readByte == 0) {
                    h();
                } else {
                    g(a(readByte, 15) - 1);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b {
        private final c a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f8964b;

        /* renamed from: c  reason: collision with root package name */
        private int f8965c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f8966d;

        /* renamed from: e  reason: collision with root package name */
        int f8967e;

        /* renamed from: f  reason: collision with root package name */
        c[] f8968f;

        /* renamed from: g  reason: collision with root package name */
        int f8969g;

        /* renamed from: h  reason: collision with root package name */
        int f8970h;

        /* renamed from: i  reason: collision with root package name */
        int f8971i;

        b(int i2, boolean z, c cVar) {
            this.f8965c = Integer.MAX_VALUE;
            this.f8968f = new c[8];
            this.f8969g = this.f8968f.length - 1;
            this.f8970h = 0;
            this.f8971i = 0;
            this.f8967e = i2;
            this.f8964b = z;
            this.a = cVar;
        }

        b(c cVar) {
            this(4096, true, cVar);
        }

        private void a() {
            int i2 = this.f8967e;
            int i3 = this.f8971i;
            if (i2 >= i3) {
                return;
            }
            if (i2 == 0) {
                b();
            } else {
                b(i3 - i2);
            }
        }

        private void a(c cVar) {
            int i2 = cVar.f8955c;
            int i3 = this.f8967e;
            if (i2 > i3) {
                b();
                return;
            }
            b((this.f8971i + i2) - i3);
            int i4 = this.f8970h + 1;
            c[] cVarArr = this.f8968f;
            if (i4 > cVarArr.length) {
                c[] cVarArr2 = new c[(cVarArr.length * 2)];
                System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                this.f8969g = this.f8968f.length - 1;
                this.f8968f = cVarArr2;
            }
            int i5 = this.f8969g;
            this.f8969g = i5 - 1;
            this.f8968f[i5] = cVar;
            this.f8970h++;
            this.f8971i += i2;
        }

        private int b(int i2) {
            int i3 = 0;
            if (i2 > 0) {
                int length = this.f8968f.length;
                while (true) {
                    length--;
                    if (length < this.f8969g || i2 <= 0) {
                        c[] cVarArr = this.f8968f;
                        int i4 = this.f8969g;
                        System.arraycopy(cVarArr, i4 + 1, cVarArr, i4 + 1 + i3, this.f8970h);
                        c[] cVarArr2 = this.f8968f;
                        int i5 = this.f8969g;
                        Arrays.fill(cVarArr2, i5 + 1, i5 + 1 + i3, (Object) null);
                        this.f8969g += i3;
                    } else {
                        c[] cVarArr3 = this.f8968f;
                        i2 -= cVarArr3[length].f8955c;
                        this.f8971i -= cVarArr3[length].f8955c;
                        this.f8970h--;
                        i3++;
                    }
                }
                c[] cVarArr4 = this.f8968f;
                int i42 = this.f8969g;
                System.arraycopy(cVarArr4, i42 + 1, cVarArr4, i42 + 1 + i3, this.f8970h);
                c[] cVarArr22 = this.f8968f;
                int i52 = this.f8969g;
                Arrays.fill(cVarArr22, i52 + 1, i52 + 1 + i3, (Object) null);
                this.f8969g += i3;
            }
            return i3;
        }

        private void b() {
            Arrays.fill(this.f8968f, (Object) null);
            this.f8969g = this.f8968f.length - 1;
            this.f8970h = 0;
            this.f8971i = 0;
        }

        /* access modifiers changed from: package-private */
        public void a(int i2) {
            int min = Math.min(i2, 16384);
            int i3 = this.f8967e;
            if (i3 != min) {
                if (min < i3) {
                    this.f8965c = Math.min(this.f8965c, min);
                }
                this.f8966d = true;
                this.f8967e = min;
                a();
            }
        }

        /* access modifiers changed from: package-private */
        public void a(int i2, int i3, int i4) {
            int i5;
            c cVar;
            if (i2 < i3) {
                cVar = this.a;
                i5 = i2 | i4;
            } else {
                this.a.writeByte(i4 | i3);
                i5 = i2 - i3;
                while (i5 >= 128) {
                    this.a.writeByte(128 | (i5 & 127));
                    i5 >>>= 7;
                }
                cVar = this.a;
            }
            cVar.writeByte(i5);
        }

        /* access modifiers changed from: package-private */
        public void a(f fVar) {
            int i2;
            int i3;
            if (!this.f8964b || k.b().a(fVar) >= fVar.m()) {
                i3 = fVar.m();
                i2 = 0;
            } else {
                c cVar = new c();
                k.b().a(fVar, cVar);
                fVar = cVar.r();
                i3 = fVar.m();
                i2 = 128;
            }
            a(i3, 127, i2);
            this.a.a(fVar);
        }

        /* access modifiers changed from: package-private */
        public void a(List<c> list) {
            int i2;
            int i3;
            if (this.f8966d) {
                int i4 = this.f8965c;
                if (i4 < this.f8967e) {
                    a(i4, 31, 32);
                }
                this.f8966d = false;
                this.f8965c = Integer.MAX_VALUE;
                a(this.f8967e, 31, 32);
            }
            int size = list.size();
            for (int i5 = 0; i5 < size; i5++) {
                c cVar = list.get(i5);
                f n = cVar.a.n();
                f fVar = cVar.f8954b;
                Integer num = d.f8956b.get(n);
                if (num != null) {
                    i3 = num.intValue() + 1;
                    if (i3 > 1 && i3 < 8) {
                        if (i.f0.c.a(d.a[i3 - 1].f8954b, fVar)) {
                            i2 = i3;
                        } else if (i.f0.c.a(d.a[i3].f8954b, fVar)) {
                            i2 = i3;
                            i3++;
                        }
                    }
                    i2 = i3;
                    i3 = -1;
                } else {
                    i3 = -1;
                    i2 = -1;
                }
                if (i3 == -1) {
                    int i6 = this.f8969g + 1;
                    int length = this.f8968f.length;
                    while (true) {
                        if (i6 >= length) {
                            break;
                        }
                        if (i.f0.c.a(this.f8968f[i6].a, n)) {
                            if (i.f0.c.a(this.f8968f[i6].f8954b, fVar)) {
                                i3 = d.a.length + (i6 - this.f8969g);
                                break;
                            } else if (i2 == -1) {
                                i2 = (i6 - this.f8969g) + d.a.length;
                            }
                        }
                        i6++;
                    }
                }
                if (i3 != -1) {
                    a(i3, 127, 128);
                } else {
                    if (i2 == -1) {
                        this.a.writeByte(64);
                        a(n);
                    } else if (!n.b(c.f8948d) || c.f8953i.equals(n)) {
                        a(i2, 63, 64);
                    } else {
                        a(i2, 15, 0);
                        a(fVar);
                    }
                    a(fVar);
                    a(cVar);
                }
            }
        }
    }

    static f a(f fVar) {
        int m2 = fVar.m();
        for (int i2 = 0; i2 < m2; i2++) {
            byte a2 = fVar.a(i2);
            if (a2 >= 65 && a2 <= 90) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + fVar.p());
            }
        }
        return fVar;
    }

    private static Map<f, Integer> a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(a.length);
        int i2 = 0;
        while (true) {
            c[] cVarArr = a;
            if (i2 >= cVarArr.length) {
                return Collections.unmodifiableMap(linkedHashMap);
            }
            if (!linkedHashMap.containsKey(cVarArr[i2].a)) {
                linkedHashMap.put(a[i2].a, Integer.valueOf(i2));
            }
            i2++;
        }
    }
}
