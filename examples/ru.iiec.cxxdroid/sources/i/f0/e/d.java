package i.f0.e;

import i.f0.k.f;
import j.l;
import j.r;
import j.s;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

public final class d implements Closeable, Flushable {
    static final Pattern v = Pattern.compile("[a-z0-9_-]{1,120}");

    /* renamed from: b  reason: collision with root package name */
    final i.f0.j.a f8826b;

    /* renamed from: c  reason: collision with root package name */
    final File f8827c;

    /* renamed from: d  reason: collision with root package name */
    private final File f8828d;

    /* renamed from: e  reason: collision with root package name */
    private final File f8829e;

    /* renamed from: f  reason: collision with root package name */
    private final File f8830f;

    /* renamed from: g  reason: collision with root package name */
    private final int f8831g;

    /* renamed from: h  reason: collision with root package name */
    private long f8832h;

    /* renamed from: i  reason: collision with root package name */
    final int f8833i;

    /* renamed from: j  reason: collision with root package name */
    private long f8834j = 0;

    /* renamed from: k  reason: collision with root package name */
    j.d f8835k;

    /* renamed from: l  reason: collision with root package name */
    final LinkedHashMap<String, C0135d> f8836l = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: m  reason: collision with root package name */
    int f8837m;
    boolean n;
    boolean o;
    boolean p;
    boolean q;
    boolean r;
    private long s = 0;
    private final Executor t;
    private final Runnable u = new a();

    class a implements Runnable {
        a() {
        }

        public void run() {
            synchronized (d.this) {
                if (!(!d.this.o) && !d.this.p) {
                    try {
                        d.this.q();
                    } catch (IOException unused) {
                        d.this.q = true;
                    }
                    try {
                        if (d.this.o()) {
                            d.this.p();
                            d.this.f8837m = 0;
                        }
                    } catch (IOException unused2) {
                        d.this.r = true;
                        d.this.f8835k = l.a(l.a());
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class b extends e {
        b(r rVar) {
            super(rVar);
        }

        /* access modifiers changed from: protected */
        @Override // i.f0.e.e
        public void a(IOException iOException) {
            d.this.n = true;
        }
    }

    public final class c {
        final C0135d a;

        /* renamed from: b  reason: collision with root package name */
        final boolean[] f8840b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f8841c;

        /* access modifiers changed from: package-private */
        public class a extends e {
            a(r rVar) {
                super(rVar);
            }

            /* access modifiers changed from: protected */
            @Override // i.f0.e.e
            public void a(IOException iOException) {
                synchronized (d.this) {
                    c.this.c();
                }
            }
        }

        c(C0135d dVar) {
            this.a = dVar;
            this.f8840b = dVar.f8847e ? null : new boolean[d.this.f8833i];
        }

        public r a(int i2) {
            synchronized (d.this) {
                if (this.f8841c) {
                    throw new IllegalStateException();
                } else if (this.a.f8848f != this) {
                    return l.a();
                } else {
                    if (!this.a.f8847e) {
                        this.f8840b[i2] = true;
                    }
                    try {
                        return new a(d.this.f8826b.c(this.a.f8846d[i2]));
                    } catch (FileNotFoundException unused) {
                        return l.a();
                    }
                }
            }
        }

        public void a() {
            synchronized (d.this) {
                if (!this.f8841c) {
                    if (this.a.f8848f == this) {
                        d.this.a(this, false);
                    }
                    this.f8841c = true;
                } else {
                    throw new IllegalStateException();
                }
            }
        }

        public void b() {
            synchronized (d.this) {
                if (!this.f8841c) {
                    if (this.a.f8848f == this) {
                        d.this.a(this, true);
                    }
                    this.f8841c = true;
                } else {
                    throw new IllegalStateException();
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void c() {
            if (this.a.f8848f == this) {
                int i2 = 0;
                while (true) {
                    d dVar = d.this;
                    if (i2 < dVar.f8833i) {
                        try {
                            dVar.f8826b.a(this.a.f8846d[i2]);
                        } catch (IOException unused) {
                        }
                        i2++;
                    } else {
                        this.a.f8848f = null;
                        return;
                    }
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i.f0.e.d$d  reason: collision with other inner class name */
    public final class C0135d {
        final String a;

        /* renamed from: b  reason: collision with root package name */
        final long[] f8844b;

        /* renamed from: c  reason: collision with root package name */
        final File[] f8845c;

        /* renamed from: d  reason: collision with root package name */
        final File[] f8846d;

        /* renamed from: e  reason: collision with root package name */
        boolean f8847e;

        /* renamed from: f  reason: collision with root package name */
        c f8848f;

        /* renamed from: g  reason: collision with root package name */
        long f8849g;

        C0135d(String str) {
            this.a = str;
            int i2 = d.this.f8833i;
            this.f8844b = new long[i2];
            this.f8845c = new File[i2];
            this.f8846d = new File[i2];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i3 = 0; i3 < d.this.f8833i; i3++) {
                sb.append(i3);
                this.f8845c[i3] = new File(d.this.f8827c, sb.toString());
                sb.append(".tmp");
                this.f8846d[i3] = new File(d.this.f8827c, sb.toString());
                sb.setLength(length);
            }
        }

        private IOException b(String[] strArr) {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        /* access modifiers changed from: package-private */
        public e a() {
            if (Thread.holdsLock(d.this)) {
                s[] sVarArr = new s[d.this.f8833i];
                long[] jArr = (long[]) this.f8844b.clone();
                int i2 = 0;
                for (int i3 = 0; i3 < d.this.f8833i; i3++) {
                    try {
                        sVarArr[i3] = d.this.f8826b.b(this.f8845c[i3]);
                    } catch (FileNotFoundException unused) {
                        while (i2 < d.this.f8833i && sVarArr[i2] != null) {
                            i.f0.c.a(sVarArr[i2]);
                            i2++;
                        }
                        try {
                            d.this.a(this);
                            return null;
                        } catch (IOException unused2) {
                            return null;
                        }
                    }
                }
                return new e(this.a, this.f8849g, sVarArr, jArr);
            }
            throw new AssertionError();
        }

        /* access modifiers changed from: package-private */
        public void a(j.d dVar) {
            for (long j2 : this.f8844b) {
                dVar.writeByte(32).b(j2);
            }
        }

        /* access modifiers changed from: package-private */
        public void a(String[] strArr) {
            if (strArr.length == d.this.f8833i) {
                for (int i2 = 0; i2 < strArr.length; i2++) {
                    try {
                        this.f8844b[i2] = Long.parseLong(strArr[i2]);
                    } catch (NumberFormatException unused) {
                        b(strArr);
                        throw null;
                    }
                }
                return;
            }
            b(strArr);
            throw null;
        }
    }

    public final class e implements Closeable {

        /* renamed from: b  reason: collision with root package name */
        private final String f8851b;

        /* renamed from: c  reason: collision with root package name */
        private final long f8852c;

        /* renamed from: d  reason: collision with root package name */
        private final s[] f8853d;

        e(String str, long j2, s[] sVarArr, long[] jArr) {
            this.f8851b = str;
            this.f8852c = j2;
            this.f8853d = sVarArr;
        }

        public s a(int i2) {
            return this.f8853d[i2];
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            for (s sVar : this.f8853d) {
                i.f0.c.a(sVar);
            }
        }

        public c l() {
            return d.this.a(this.f8851b, this.f8852c);
        }
    }

    d(i.f0.j.a aVar, File file, int i2, int i3, long j2, Executor executor) {
        this.f8826b = aVar;
        this.f8827c = file;
        this.f8831g = i2;
        this.f8828d = new File(file, "journal");
        this.f8829e = new File(file, "journal.tmp");
        this.f8830f = new File(file, "journal.bkp");
        this.f8833i = i3;
        this.f8832h = j2;
        this.t = executor;
    }

    public static d a(i.f0.j.a aVar, File file, int i2, int i3, long j2) {
        if (j2 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        } else if (i3 > 0) {
            return new d(aVar, file, i2, i3, j2, new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), i.f0.c.a("OkHttp DiskLruCache", true)));
        } else {
            throw new IllegalArgumentException("valueCount <= 0");
        }
    }

    private void e(String str) {
        String str2;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i2 = indexOf + 1;
            int indexOf2 = str.indexOf(32, i2);
            if (indexOf2 == -1) {
                str2 = str.substring(i2);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    this.f8836l.remove(str2);
                    return;
                }
            } else {
                str2 = str.substring(i2, indexOf2);
            }
            C0135d dVar = this.f8836l.get(str2);
            if (dVar == null) {
                dVar = new C0135d(str2);
                this.f8836l.put(str2, dVar);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                dVar.f8847e = true;
                dVar.f8848f = null;
                dVar.a(split);
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                dVar.f8848f = new c(dVar);
            } else if (indexOf2 != -1 || indexOf != 4 || !str.startsWith("READ")) {
                throw new IOException("unexpected journal line: " + str);
            }
        } else {
            throw new IOException("unexpected journal line: " + str);
        }
    }

    private void f(String str) {
        if (!v.matcher(str).matches()) {
            throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
        }
    }

    private synchronized void r() {
        if (n()) {
            throw new IllegalStateException("cache is closed");
        }
    }

    private j.d s() {
        return l.a(new b(this.f8826b.e(this.f8828d)));
    }

    private void t() {
        this.f8826b.a(this.f8829e);
        Iterator<C0135d> it = this.f8836l.values().iterator();
        while (it.hasNext()) {
            C0135d next = it.next();
            int i2 = 0;
            if (next.f8848f == null) {
                while (i2 < this.f8833i) {
                    this.f8834j += next.f8844b[i2];
                    i2++;
                }
            } else {
                next.f8848f = null;
                while (i2 < this.f8833i) {
                    this.f8826b.a(next.f8845c[i2]);
                    this.f8826b.a(next.f8846d[i2]);
                    i2++;
                }
                it.remove();
            }
        }
    }

    private void u() {
        j.e a2 = l.a(this.f8826b.b(this.f8828d));
        try {
            String d2 = a2.d();
            String d3 = a2.d();
            String d4 = a2.d();
            String d5 = a2.d();
            String d6 = a2.d();
            if (!"libcore.io.DiskLruCache".equals(d2) || !"1".equals(d3) || !Integer.toString(this.f8831g).equals(d4) || !Integer.toString(this.f8833i).equals(d5) || !"".equals(d6)) {
                throw new IOException("unexpected journal header: [" + d2 + ", " + d3 + ", " + d5 + ", " + d6 + "]");
            }
            int i2 = 0;
            while (true) {
                try {
                    e(a2.d());
                    i2++;
                } catch (EOFException unused) {
                    this.f8837m = i2 - this.f8836l.size();
                    if (!a2.g()) {
                        p();
                    } else {
                        this.f8835k = s();
                    }
                    return;
                }
            }
        } finally {
            i.f0.c.a(a2);
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized c a(String str, long j2) {
        m();
        r();
        f(str);
        C0135d dVar = this.f8836l.get(str);
        if (j2 != -1 && (dVar == null || dVar.f8849g != j2)) {
            return null;
        }
        if (dVar != null && dVar.f8848f != null) {
            return null;
        }
        if (this.q || this.r) {
            this.t.execute(this.u);
            return null;
        }
        this.f8835k.a("DIRTY").writeByte(32).a(str).writeByte(10);
        this.f8835k.flush();
        if (this.n) {
            return null;
        }
        if (dVar == null) {
            dVar = new C0135d(str);
            this.f8836l.put(str, dVar);
        }
        c cVar = new c(dVar);
        dVar.f8848f = cVar;
        return cVar;
    }

    /* access modifiers changed from: package-private */
    public synchronized void a(c cVar, boolean z) {
        C0135d dVar = cVar.a;
        if (dVar.f8848f == cVar) {
            if (z && !dVar.f8847e) {
                for (int i2 = 0; i2 < this.f8833i; i2++) {
                    if (!cVar.f8840b[i2]) {
                        cVar.a();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i2);
                    } else if (!this.f8826b.f(dVar.f8846d[i2])) {
                        cVar.a();
                        return;
                    }
                }
            }
            for (int i3 = 0; i3 < this.f8833i; i3++) {
                File file = dVar.f8846d[i3];
                if (!z) {
                    this.f8826b.a(file);
                } else if (this.f8826b.f(file)) {
                    File file2 = dVar.f8845c[i3];
                    this.f8826b.a(file, file2);
                    long j2 = dVar.f8844b[i3];
                    long g2 = this.f8826b.g(file2);
                    dVar.f8844b[i3] = g2;
                    this.f8834j = (this.f8834j - j2) + g2;
                }
            }
            this.f8837m++;
            dVar.f8848f = null;
            if (dVar.f8847e || z) {
                dVar.f8847e = true;
                this.f8835k.a("CLEAN").writeByte(32);
                this.f8835k.a(dVar.a);
                dVar.a(this.f8835k);
                this.f8835k.writeByte(10);
                if (z) {
                    long j3 = this.s;
                    this.s = 1 + j3;
                    dVar.f8849g = j3;
                }
            } else {
                this.f8836l.remove(dVar.a);
                this.f8835k.a("REMOVE").writeByte(32);
                this.f8835k.a(dVar.a);
                this.f8835k.writeByte(10);
            }
            this.f8835k.flush();
            if (this.f8834j > this.f8832h || o()) {
                this.t.execute(this.u);
            }
            return;
        }
        throw new IllegalStateException();
    }

    /* access modifiers changed from: package-private */
    public boolean a(C0135d dVar) {
        c cVar = dVar.f8848f;
        if (cVar != null) {
            cVar.c();
        }
        for (int i2 = 0; i2 < this.f8833i; i2++) {
            this.f8826b.a(dVar.f8845c[i2]);
            long j2 = this.f8834j;
            long[] jArr = dVar.f8844b;
            this.f8834j = j2 - jArr[i2];
            jArr[i2] = 0;
        }
        this.f8837m++;
        this.f8835k.a("REMOVE").writeByte(32).a(dVar.a).writeByte(10);
        this.f8836l.remove(dVar.a);
        if (o()) {
            this.t.execute(this.u);
        }
        return true;
    }

    public c b(String str) {
        return a(str, -1);
    }

    public synchronized e c(String str) {
        m();
        r();
        f(str);
        C0135d dVar = this.f8836l.get(str);
        if (dVar != null) {
            if (dVar.f8847e) {
                e a2 = dVar.a();
                if (a2 == null) {
                    return null;
                }
                this.f8837m++;
                this.f8835k.a("READ").writeByte(32).a(str).writeByte(10);
                if (o()) {
                    this.t.execute(this.u);
                }
                return a2;
            }
        }
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        if (this.o) {
            if (!this.p) {
                C0135d[] dVarArr = (C0135d[]) this.f8836l.values().toArray(new C0135d[this.f8836l.size()]);
                for (C0135d dVar : dVarArr) {
                    if (dVar.f8848f != null) {
                        dVar.f8848f.a();
                    }
                }
                q();
                this.f8835k.close();
                this.f8835k = null;
                this.p = true;
                return;
            }
        }
        this.p = true;
    }

    public synchronized boolean d(String str) {
        m();
        r();
        f(str);
        C0135d dVar = this.f8836l.get(str);
        if (dVar == null) {
            return false;
        }
        boolean a2 = a(dVar);
        if (a2 && this.f8834j <= this.f8832h) {
            this.q = false;
        }
        return a2;
    }

    @Override // java.io.Flushable
    public synchronized void flush() {
        if (this.o) {
            r();
            q();
            this.f8835k.flush();
        }
    }

    public void l() {
        close();
        this.f8826b.d(this.f8827c);
    }

    public synchronized void m() {
        if (!this.o) {
            if (this.f8826b.f(this.f8830f)) {
                if (this.f8826b.f(this.f8828d)) {
                    this.f8826b.a(this.f8830f);
                } else {
                    this.f8826b.a(this.f8830f, this.f8828d);
                }
            }
            if (this.f8826b.f(this.f8828d)) {
                try {
                    u();
                    t();
                    this.o = true;
                    return;
                } catch (IOException e2) {
                    f d2 = f.d();
                    d2.a(5, "DiskLruCache " + this.f8827c + " is corrupt: " + e2.getMessage() + ", removing", e2);
                    l();
                    this.p = false;
                } catch (Throwable th) {
                    this.p = false;
                    throw th;
                }
            }
            p();
            this.o = true;
        }
    }

    public synchronized boolean n() {
        return this.p;
    }

    /* access modifiers changed from: package-private */
    public boolean o() {
        int i2 = this.f8837m;
        return i2 >= 2000 && i2 >= this.f8836l.size();
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    public synchronized void p() {
        if (this.f8835k != null) {
            this.f8835k.close();
        }
        j.d a2 = l.a(this.f8826b.c(this.f8829e));
        try {
            a2.a("libcore.io.DiskLruCache").writeByte(10);
            a2.a("1").writeByte(10);
            a2.b((long) this.f8831g).writeByte(10);
            a2.b((long) this.f8833i).writeByte(10);
            a2.writeByte(10);
            for (C0135d dVar : this.f8836l.values()) {
                if (dVar.f8848f != null) {
                    a2.a("DIRTY").writeByte(32);
                    a2.a(dVar.a);
                } else {
                    a2.a("CLEAN").writeByte(32);
                    a2.a(dVar.a);
                    dVar.a(a2);
                }
                a2.writeByte(10);
            }
            a2.close();
            if (this.f8826b.f(this.f8828d)) {
                this.f8826b.a(this.f8828d, this.f8830f);
            }
            this.f8826b.a(this.f8829e, this.f8828d);
            this.f8826b.a(this.f8830f);
            this.f8835k = s();
            this.n = false;
            this.r = false;
        } catch (Throwable th) {
            a2.close();
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    public void q() {
        while (this.f8834j > this.f8832h) {
            a(this.f8836l.values().iterator().next());
        }
        this.q = false;
    }
}
