package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.NetworkInfo;
import android.os.Build;
import com.squareup.picasso.r;
import com.squareup.picasso.t;
import com.squareup.picasso.y;
import j.l;
import j.s;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

/* access modifiers changed from: package-private */
public class c implements Runnable {
    private static final Object u = new Object();
    private static final ThreadLocal<StringBuilder> v = new a();
    private static final AtomicInteger w = new AtomicInteger();
    private static final y x = new b();

    /* renamed from: b  reason: collision with root package name */
    final int f6804b = w.incrementAndGet();

    /* renamed from: c  reason: collision with root package name */
    final t f6805c;

    /* renamed from: d  reason: collision with root package name */
    final i f6806d;

    /* renamed from: e  reason: collision with root package name */
    final d f6807e;

    /* renamed from: f  reason: collision with root package name */
    final a0 f6808f;

    /* renamed from: g  reason: collision with root package name */
    final String f6809g;

    /* renamed from: h  reason: collision with root package name */
    final w f6810h;

    /* renamed from: i  reason: collision with root package name */
    final int f6811i;

    /* renamed from: j  reason: collision with root package name */
    int f6812j;

    /* renamed from: k  reason: collision with root package name */
    final y f6813k;

    /* renamed from: l  reason: collision with root package name */
    a f6814l;

    /* renamed from: m  reason: collision with root package name */
    List<a> f6815m;
    Bitmap n;
    Future<?> o;
    t.e p;
    Exception q;
    int r;
    int s;
    t.f t;

    static class a extends ThreadLocal<StringBuilder> {
        a() {
        }

        /* access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public StringBuilder initialValue() {
            return new StringBuilder("Picasso-");
        }
    }

    static class b extends y {
        b() {
        }

        @Override // com.squareup.picasso.y
        public y.a a(w wVar, int i2) {
            throw new IllegalStateException("Unrecognized type of request: " + wVar);
        }

        @Override // com.squareup.picasso.y
        public boolean a(w wVar) {
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.squareup.picasso.c$c  reason: collision with other inner class name */
    public static class RunnableC0098c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c0 f6816b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ RuntimeException f6817c;

        RunnableC0098c(c0 c0Var, RuntimeException runtimeException) {
            this.f6816b = c0Var;
            this.f6817c = runtimeException;
        }

        public void run() {
            throw new RuntimeException("Transformation " + this.f6816b.a() + " crashed with exception.", this.f6817c);
        }
    }

    /* access modifiers changed from: package-private */
    public static class d implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ StringBuilder f6818b;

        d(StringBuilder sb) {
            this.f6818b = sb;
        }

        public void run() {
            throw new NullPointerException(this.f6818b.toString());
        }
    }

    /* access modifiers changed from: package-private */
    public static class e implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c0 f6819b;

        e(c0 c0Var) {
            this.f6819b = c0Var;
        }

        public void run() {
            throw new IllegalStateException("Transformation " + this.f6819b.a() + " returned input Bitmap but recycled it.");
        }
    }

    /* access modifiers changed from: package-private */
    public static class f implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c0 f6820b;

        f(c0 c0Var) {
            this.f6820b = c0Var;
        }

        public void run() {
            throw new IllegalStateException("Transformation " + this.f6820b.a() + " mutated input Bitmap but failed to recycle the original.");
        }
    }

    c(t tVar, i iVar, d dVar, a0 a0Var, a aVar, y yVar) {
        this.f6805c = tVar;
        this.f6806d = iVar;
        this.f6807e = dVar;
        this.f6808f = a0Var;
        this.f6814l = aVar;
        this.f6809g = aVar.b();
        this.f6810h = aVar.g();
        this.t = aVar.f();
        this.f6811i = aVar.c();
        this.f6812j = aVar.d();
        this.f6813k = yVar;
        this.s = yVar.a();
    }

    static int a(int i2) {
        switch (i2) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:87:0x0263  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0267  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static android.graphics.Bitmap a(com.squareup.picasso.w r26, android.graphics.Bitmap r27, int r28) {
        /*
        // Method dump skipped, instructions count: 617
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.c.a(com.squareup.picasso.w, android.graphics.Bitmap, int):android.graphics.Bitmap");
    }

    static Bitmap a(s sVar, w wVar) {
        j.e a2 = l.a(sVar);
        boolean a3 = d0.a(a2);
        boolean z = wVar.r && Build.VERSION.SDK_INT < 21;
        BitmapFactory.Options b2 = y.b(wVar);
        boolean a4 = y.a(b2);
        if (a3 || z) {
            byte[] e2 = a2.e();
            if (a4) {
                BitmapFactory.decodeByteArray(e2, 0, e2.length, b2);
                y.a(wVar.f6916h, wVar.f6917i, b2, wVar);
            }
            return BitmapFactory.decodeByteArray(e2, 0, e2.length, b2);
        }
        InputStream k2 = a2.k();
        if (a4) {
            n nVar = new n(k2);
            nVar.a(false);
            long a5 = nVar.a(1024);
            BitmapFactory.decodeStream(nVar, null, b2);
            y.a(wVar.f6916h, wVar.f6917i, b2, wVar);
            nVar.g(a5);
            nVar.a(true);
            k2 = nVar;
        }
        Bitmap decodeStream = BitmapFactory.decodeStream(k2, null, b2);
        if (decodeStream != null) {
            return decodeStream;
        }
        throw new IOException("Failed to decode stream.");
    }

    static Bitmap a(List<c0> list, Bitmap bitmap) {
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            c0 c0Var = list.get(i2);
            try {
                Bitmap a2 = c0Var.a(bitmap);
                if (a2 == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Transformation ");
                    sb.append(c0Var.a());
                    sb.append(" returned null after ");
                    sb.append(i2);
                    sb.append(" previous transformation(s).\n\nTransformation list:\n");
                    for (c0 c0Var2 : list) {
                        sb.append(c0Var2.a());
                        sb.append('\n');
                    }
                    t.p.post(new d(sb));
                    return null;
                } else if (a2 == bitmap && bitmap.isRecycled()) {
                    t.p.post(new e(c0Var));
                    return null;
                } else if (a2 == bitmap || bitmap.isRecycled()) {
                    i2++;
                    bitmap = a2;
                } else {
                    t.p.post(new f(c0Var));
                    return null;
                }
            } catch (RuntimeException e2) {
                t.p.post(new RunnableC0098c(c0Var, e2));
                return null;
            }
        }
        return bitmap;
    }

    static c a(t tVar, i iVar, d dVar, a0 a0Var, a aVar) {
        w g2 = aVar.g();
        List<y> a2 = tVar.a();
        int size = a2.size();
        for (int i2 = 0; i2 < size; i2++) {
            y yVar = a2.get(i2);
            if (yVar.a(g2)) {
                return new c(tVar, iVar, dVar, a0Var, aVar, yVar);
            }
        }
        return new c(tVar, iVar, dVar, a0Var, aVar, x);
    }

    static void a(w wVar) {
        String a2 = wVar.a();
        StringBuilder sb = v.get();
        sb.ensureCapacity(a2.length() + 8);
        sb.replace(8, sb.length(), a2);
        Thread.currentThread().setName(sb.toString());
    }

    private static boolean a(boolean z, int i2, int i3, int i4, int i5) {
        return !z || (i4 != 0 && i2 > i4) || (i5 != 0 && i3 > i5);
    }

    static int b(int i2) {
        return (i2 == 2 || i2 == 7 || i2 == 4 || i2 == 5) ? -1 : 1;
    }

    private t.f o() {
        t.f fVar = t.f.LOW;
        List<a> list = this.f6815m;
        boolean z = true;
        boolean z2 = list != null && !list.isEmpty();
        if (this.f6814l == null && !z2) {
            z = false;
        }
        if (!z) {
            return fVar;
        }
        a aVar = this.f6814l;
        if (aVar != null) {
            fVar = aVar.f();
        }
        if (z2) {
            int size = this.f6815m.size();
            for (int i2 = 0; i2 < size; i2++) {
                t.f f2 = this.f6815m.get(i2).f();
                if (f2.ordinal() > fVar.ordinal()) {
                    fVar = f2;
                }
            }
        }
        return fVar;
    }

    /* access modifiers changed from: package-private */
    public void a(a aVar) {
        String str;
        String str2;
        boolean z = this.f6805c.n;
        w wVar = aVar.f6765b;
        if (this.f6814l == null) {
            this.f6814l = aVar;
            if (z) {
                List<a> list = this.f6815m;
                if (list == null || list.isEmpty()) {
                    str = wVar.d();
                    str2 = "to empty hunter";
                } else {
                    str = wVar.d();
                    str2 = d0.a(this, "to ");
                }
                d0.a("Hunter", "joined", str, str2);
                return;
            }
            return;
        }
        if (this.f6815m == null) {
            this.f6815m = new ArrayList(3);
        }
        this.f6815m.add(aVar);
        if (z) {
            d0.a("Hunter", "joined", wVar.d(), d0.a(this, "to "));
        }
        t.f f2 = aVar.f();
        if (f2.ordinal() > this.t.ordinal()) {
            this.t = f2;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean a() {
        Future<?> future;
        if (this.f6814l != null) {
            return false;
        }
        List<a> list = this.f6815m;
        return (list == null || list.isEmpty()) && (future = this.o) != null && future.cancel(false);
    }

    /* access modifiers changed from: package-private */
    public boolean a(boolean z, NetworkInfo networkInfo) {
        if (!(this.s > 0)) {
            return false;
        }
        this.s--;
        return this.f6813k.a(z, networkInfo);
    }

    /* access modifiers changed from: package-private */
    public a b() {
        return this.f6814l;
    }

    /* access modifiers changed from: package-private */
    public void b(a aVar) {
        boolean z;
        if (this.f6814l == aVar) {
            this.f6814l = null;
            z = true;
        } else {
            List<a> list = this.f6815m;
            z = list != null ? list.remove(aVar) : false;
        }
        if (z && aVar.f() == this.t) {
            this.t = o();
        }
        if (this.f6805c.n) {
            d0.a("Hunter", "removed", aVar.f6765b.d(), d0.a(this, "from "));
        }
    }

    /* access modifiers changed from: package-private */
    public List<a> c() {
        return this.f6815m;
    }

    /* access modifiers changed from: package-private */
    public w d() {
        return this.f6810h;
    }

    /* access modifiers changed from: package-private */
    public Exception e() {
        return this.q;
    }

    /* access modifiers changed from: package-private */
    public String f() {
        return this.f6809g;
    }

    /* access modifiers changed from: package-private */
    public t.e g() {
        return this.p;
    }

    /* access modifiers changed from: package-private */
    public int h() {
        return this.f6811i;
    }

    /* access modifiers changed from: package-private */
    public t i() {
        return this.f6805c;
    }

    /* access modifiers changed from: package-private */
    public t.f j() {
        return this.t;
    }

    /* access modifiers changed from: package-private */
    public Bitmap k() {
        return this.n;
    }

    /* access modifiers changed from: package-private */
    public Bitmap l() {
        Bitmap bitmap;
        if (p.a(this.f6811i)) {
            bitmap = this.f6807e.a(this.f6809g);
            if (bitmap != null) {
                this.f6808f.b();
                this.p = t.e.MEMORY;
                if (this.f6805c.n) {
                    d0.a("Hunter", "decoded", this.f6810h.d(), "from cache");
                }
                return bitmap;
            }
        } else {
            bitmap = null;
        }
        this.f6812j = this.s == 0 ? q.OFFLINE.f6865b : this.f6812j;
        y.a a2 = this.f6813k.a(this.f6810h, this.f6812j);
        if (a2 != null) {
            this.p = a2.c();
            this.r = a2.b();
            bitmap = a2.a();
            if (bitmap == null) {
                s d2 = a2.d();
                try {
                    bitmap = a(d2, this.f6810h);
                } finally {
                    try {
                        d2.close();
                    } catch (IOException unused) {
                    }
                }
            }
        }
        if (bitmap != null) {
            if (this.f6805c.n) {
                d0.a("Hunter", "decoded", this.f6810h.d());
            }
            this.f6808f.a(bitmap);
            if (this.f6810h.f() || this.r != 0) {
                synchronized (u) {
                    if (this.f6810h.e() || this.r != 0) {
                        bitmap = a(this.f6810h, bitmap, this.r);
                        if (this.f6805c.n) {
                            d0.a("Hunter", "transformed", this.f6810h.d());
                        }
                    }
                    if (this.f6810h.b()) {
                        bitmap = a(this.f6810h.f6915g, bitmap);
                        if (this.f6805c.n) {
                            d0.a("Hunter", "transformed", this.f6810h.d(), "from custom transformations");
                        }
                    }
                }
                if (bitmap != null) {
                    this.f6808f.b(bitmap);
                }
            }
        }
        return bitmap;
    }

    /* access modifiers changed from: package-private */
    public boolean m() {
        Future<?> future = this.o;
        return future != null && future.isCancelled();
    }

    /* access modifiers changed from: package-private */
    public boolean n() {
        return this.f6813k.b();
    }

    public void run() {
        i iVar;
        try {
            a(this.f6810h);
            if (this.f6805c.n) {
                d0.a("Hunter", "executing", d0.a(this));
            }
            this.n = l();
            if (this.n == null) {
                this.f6806d.b(this);
            } else {
                this.f6806d.a(this);
            }
        } catch (r.b e2) {
            if (!q.a(e2.f6868c) || e2.f6867b != 504) {
                this.q = e2;
            }
            iVar = this.f6806d;
        } catch (IOException e3) {
            this.q = e3;
            this.f6806d.c(this);
        } catch (OutOfMemoryError e4) {
            StringWriter stringWriter = new StringWriter();
            this.f6808f.a().a(new PrintWriter(stringWriter));
            this.q = new RuntimeException(stringWriter.toString(), e4);
            iVar = this.f6806d;
        } catch (Exception e5) {
            this.q = e5;
            iVar = this.f6806d;
        } catch (Throwable th) {
            Thread.currentThread().setName("Picasso-Idle");
            throw th;
        }
        Thread.currentThread().setName("Picasso-Idle");
        iVar.b(this);
        Thread.currentThread().setName("Picasso-Idle");
    }
}
