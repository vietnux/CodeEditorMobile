package i.f0.i;

import i.f0.i.h;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class g implements Closeable {
    private static final ExecutorService v = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), i.f0.c.a("OkHttp Http2Connection", true));

    /* renamed from: b  reason: collision with root package name */
    final boolean f8990b;

    /* renamed from: c  reason: collision with root package name */
    final h f8991c;

    /* renamed from: d  reason: collision with root package name */
    final Map<Integer, i> f8992d = new LinkedHashMap();

    /* renamed from: e  reason: collision with root package name */
    final String f8993e;

    /* renamed from: f  reason: collision with root package name */
    int f8994f;

    /* renamed from: g  reason: collision with root package name */
    int f8995g;

    /* renamed from: h  reason: collision with root package name */
    boolean f8996h;

    /* renamed from: i  reason: collision with root package name */
    private final ScheduledExecutorService f8997i;

    /* renamed from: j  reason: collision with root package name */
    private final ExecutorService f8998j;

    /* renamed from: k  reason: collision with root package name */
    final l f8999k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f9000l;

    /* renamed from: m  reason: collision with root package name */
    long f9001m = 0;
    long n;
    m o = new m();
    final m p = new m();
    boolean q = false;
    final Socket r;
    final j s;
    final j t;
    final Set<Integer> u = new LinkedHashSet();

    /* access modifiers changed from: package-private */
    public class a extends i.f0.b {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f9002c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ b f9003d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(String str, Object[] objArr, int i2, b bVar) {
            super(str, objArr);
            this.f9002c = i2;
            this.f9003d = bVar;
        }

        @Override // i.f0.b
        public void b() {
            try {
                g.this.b(this.f9002c, this.f9003d);
            } catch (IOException unused) {
                g.this.p();
            }
        }
    }

    class b extends i.f0.b {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f9005c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f9006d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(String str, Object[] objArr, int i2, long j2) {
            super(str, objArr);
            this.f9005c = i2;
            this.f9006d = j2;
        }

        @Override // i.f0.b
        public void b() {
            try {
                g.this.s.a(this.f9005c, this.f9006d);
            } catch (IOException unused) {
                g.this.p();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class c extends i.f0.b {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f9008c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ List f9009d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(String str, Object[] objArr, int i2, List list) {
            super(str, objArr);
            this.f9008c = i2;
            this.f9009d = list;
        }

        @Override // i.f0.b
        public void b() {
            if (g.this.f8999k.a(this.f9008c, this.f9009d)) {
                try {
                    g.this.s.a(this.f9008c, b.CANCEL);
                    synchronized (g.this) {
                        g.this.u.remove(Integer.valueOf(this.f9008c));
                    }
                } catch (IOException unused) {
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class d extends i.f0.b {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f9011c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ List f9012d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f9013e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(String str, Object[] objArr, int i2, List list, boolean z) {
            super(str, objArr);
            this.f9011c = i2;
            this.f9012d = list;
            this.f9013e = z;
        }

        @Override // i.f0.b
        public void b() {
            boolean a = g.this.f8999k.a(this.f9011c, this.f9012d, this.f9013e);
            if (a) {
                try {
                    g.this.s.a(this.f9011c, b.CANCEL);
                } catch (IOException unused) {
                    return;
                }
            }
            if (a || this.f9013e) {
                synchronized (g.this) {
                    g.this.u.remove(Integer.valueOf(this.f9011c));
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class e extends i.f0.b {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f9015c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ j.c f9016d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f9017e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f9018f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(String str, Object[] objArr, int i2, j.c cVar, int i3, boolean z) {
            super(str, objArr);
            this.f9015c = i2;
            this.f9016d = cVar;
            this.f9017e = i3;
            this.f9018f = z;
        }

        @Override // i.f0.b
        public void b() {
            try {
                boolean a = g.this.f8999k.a(this.f9015c, this.f9016d, this.f9017e, this.f9018f);
                if (a) {
                    g.this.s.a(this.f9015c, b.CANCEL);
                }
                if (a || this.f9018f) {
                    synchronized (g.this) {
                        g.this.u.remove(Integer.valueOf(this.f9015c));
                    }
                }
            } catch (IOException unused) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class f extends i.f0.b {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f9020c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ b f9021d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(String str, Object[] objArr, int i2, b bVar) {
            super(str, objArr);
            this.f9020c = i2;
            this.f9021d = bVar;
        }

        @Override // i.f0.b
        public void b() {
            g.this.f8999k.a(this.f9020c, this.f9021d);
            synchronized (g.this) {
                g.this.u.remove(Integer.valueOf(this.f9020c));
            }
        }
    }

    /* renamed from: i.f0.i.g$g  reason: collision with other inner class name */
    public static class C0137g {
        Socket a;

        /* renamed from: b  reason: collision with root package name */
        String f9023b;

        /* renamed from: c  reason: collision with root package name */
        j.e f9024c;

        /* renamed from: d  reason: collision with root package name */
        j.d f9025d;

        /* renamed from: e  reason: collision with root package name */
        h f9026e = h.a;

        /* renamed from: f  reason: collision with root package name */
        l f9027f = l.a;

        /* renamed from: g  reason: collision with root package name */
        boolean f9028g;

        /* renamed from: h  reason: collision with root package name */
        int f9029h;

        public C0137g(boolean z) {
            this.f9028g = z;
        }

        public C0137g a(int i2) {
            this.f9029h = i2;
            return this;
        }

        public C0137g a(h hVar) {
            this.f9026e = hVar;
            return this;
        }

        public C0137g a(Socket socket, String str, j.e eVar, j.d dVar) {
            this.a = socket;
            this.f9023b = str;
            this.f9024c = eVar;
            this.f9025d = dVar;
            return this;
        }

        public g a() {
            return new g(this);
        }
    }

    public static abstract class h {
        public static final h a = new a();

        class a extends h {
            a() {
            }

            @Override // i.f0.i.g.h
            public void a(i iVar) {
                iVar.a(b.REFUSED_STREAM);
            }
        }

        public void a(g gVar) {
        }

        public abstract void a(i iVar);
    }

    final class i extends i.f0.b {

        /* renamed from: c  reason: collision with root package name */
        final boolean f9030c;

        /* renamed from: d  reason: collision with root package name */
        final int f9031d;

        /* renamed from: e  reason: collision with root package name */
        final int f9032e;

        i(boolean z, int i2, int i3) {
            super("OkHttp %s ping %08x%08x", g.this.f8993e, Integer.valueOf(i2), Integer.valueOf(i3));
            this.f9030c = z;
            this.f9031d = i2;
            this.f9032e = i3;
        }

        @Override // i.f0.b
        public void b() {
            g.this.a(this.f9030c, this.f9031d, this.f9032e);
        }
    }

    /* access modifiers changed from: package-private */
    public class j extends i.f0.b implements h.b {

        /* renamed from: c  reason: collision with root package name */
        final h f9034c;

        class a extends i.f0.b {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ i f9036c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(String str, Object[] objArr, i iVar) {
                super(str, objArr);
                this.f9036c = iVar;
            }

            @Override // i.f0.b
            public void b() {
                try {
                    g.this.f8991c.a(this.f9036c);
                } catch (IOException e2) {
                    i.f0.k.f d2 = i.f0.k.f.d();
                    d2.a(4, "Http2Connection.Listener failure for " + g.this.f8993e, e2);
                    try {
                        this.f9036c.a(b.PROTOCOL_ERROR);
                    } catch (IOException unused) {
                    }
                }
            }
        }

        class b extends i.f0.b {
            b(String str, Object... objArr) {
                super(str, objArr);
            }

            @Override // i.f0.b
            public void b() {
                g gVar = g.this;
                gVar.f8991c.a(gVar);
            }
        }

        /* access modifiers changed from: package-private */
        public class c extends i.f0.b {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ m f9039c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            c(String str, Object[] objArr, m mVar) {
                super(str, objArr);
                this.f9039c = mVar;
            }

            @Override // i.f0.b
            public void b() {
                try {
                    g.this.s.a(this.f9039c);
                } catch (IOException unused) {
                    g.this.p();
                }
            }
        }

        j(h hVar) {
            super("OkHttp %s", g.this.f8993e);
            this.f9034c = hVar;
        }

        private void a(m mVar) {
            try {
                g.this.f8997i.execute(new c("OkHttp %s ACK Settings", new Object[]{g.this.f8993e}, mVar));
            } catch (RejectedExecutionException unused) {
            }
        }

        @Override // i.f0.i.h.b
        public void a() {
        }

        @Override // i.f0.i.h.b
        public void a(int i2, int i3, int i4, boolean z) {
        }

        @Override // i.f0.i.h.b
        public void a(int i2, int i3, List<c> list) {
            g.this.a(i3, list);
        }

        @Override // i.f0.i.h.b
        public void a(int i2, long j2) {
            g gVar = g.this;
            if (i2 == 0) {
                synchronized (gVar) {
                    g.this.n += j2;
                    g.this.notifyAll();
                }
                return;
            }
            i a2 = gVar.a(i2);
            if (a2 != null) {
                synchronized (a2) {
                    a2.a(j2);
                }
            }
        }

        @Override // i.f0.i.h.b
        public void a(int i2, b bVar) {
            if (g.this.b(i2)) {
                g.this.a(i2, bVar);
                return;
            }
            i c2 = g.this.c(i2);
            if (c2 != null) {
                c2.c(bVar);
            }
        }

        @Override // i.f0.i.h.b
        public void a(int i2, b bVar, j.f fVar) {
            i[] iVarArr;
            fVar.m();
            synchronized (g.this) {
                iVarArr = (i[]) g.this.f8992d.values().toArray(new i[g.this.f8992d.size()]);
                g.this.f8996h = true;
            }
            for (i iVar : iVarArr) {
                if (iVar.c() > i2 && iVar.f()) {
                    iVar.c(b.REFUSED_STREAM);
                    g.this.c(iVar.c());
                }
            }
        }

        @Override // i.f0.i.h.b
        public void a(boolean z, int i2, int i3) {
            if (z) {
                synchronized (g.this) {
                    g.this.f9000l = false;
                    g.this.notifyAll();
                }
                return;
            }
            try {
                g.this.f8997i.execute(new i(true, i2, i3));
            } catch (RejectedExecutionException unused) {
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0071, code lost:
            r0.a(r13);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0074, code lost:
            if (r10 == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0076, code lost:
            r0.i();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
            return;
         */
        @Override // i.f0.i.h.b
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void a(boolean r10, int r11, int r12, java.util.List<i.f0.i.c> r13) {
            /*
            // Method dump skipped, instructions count: 125
            */
            throw new UnsupportedOperationException("Method not decompiled: i.f0.i.g.j.a(boolean, int, int, java.util.List):void");
        }

        @Override // i.f0.i.h.b
        public void a(boolean z, int i2, j.e eVar, int i3) {
            if (g.this.b(i2)) {
                g.this.a(i2, eVar, i3, z);
                return;
            }
            i a2 = g.this.a(i2);
            if (a2 == null) {
                g.this.c(i2, b.PROTOCOL_ERROR);
                eVar.skip((long) i3);
                return;
            }
            a2.a(eVar, i3);
            if (z) {
                a2.i();
            }
        }

        @Override // i.f0.i.h.b
        public void a(boolean z, m mVar) {
            i[] iVarArr;
            long j2;
            int i2;
            synchronized (g.this) {
                int c2 = g.this.p.c();
                if (z) {
                    g.this.p.a();
                }
                g.this.p.a(mVar);
                a(mVar);
                int c3 = g.this.p.c();
                iVarArr = null;
                if (c3 == -1 || c3 == c2) {
                    j2 = 0;
                } else {
                    j2 = (long) (c3 - c2);
                    if (!g.this.q) {
                        g.this.g(j2);
                        g.this.q = true;
                    }
                    if (!g.this.f8992d.isEmpty()) {
                        iVarArr = (i[]) g.this.f8992d.values().toArray(new i[g.this.f8992d.size()]);
                    }
                }
                g.v.execute(new b("OkHttp %s settings", g.this.f8993e));
            }
            if (!(iVarArr == null || j2 == 0)) {
                for (i iVar : iVarArr) {
                    synchronized (iVar) {
                        iVar.a(j2);
                    }
                }
            }
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
            r1 = i.f0.i.b.PROTOCOL_ERROR;
            r0 = i.f0.i.b.PROTOCOL_ERROR;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0020, code lost:
            r2 = r4.f9035d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x002b, code lost:
            r2 = th;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x001c */
        @Override // i.f0.b
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void b() {
            /*
                r4 = this;
                i.f0.i.b r0 = i.f0.i.b.INTERNAL_ERROR
                i.f0.i.h r1 = r4.f9034c     // Catch:{ IOException -> 0x001b, all -> 0x0018 }
                r1.a(r4)     // Catch:{ IOException -> 0x001b, all -> 0x0018 }
            L_0x0007:
                i.f0.i.h r1 = r4.f9034c     // Catch:{ IOException -> 0x001b, all -> 0x0018 }
                r2 = 0
                boolean r1 = r1.a(r2, r4)     // Catch:{ IOException -> 0x001b, all -> 0x0018 }
                if (r1 == 0) goto L_0x0011
                goto L_0x0007
            L_0x0011:
                i.f0.i.b r1 = i.f0.i.b.NO_ERROR     // Catch:{ IOException -> 0x001b, all -> 0x0018 }
                i.f0.i.b r0 = i.f0.i.b.CANCEL     // Catch:{ IOException -> 0x001c }
                i.f0.i.g r2 = i.f0.i.g.this     // Catch:{ IOException -> 0x0025 }
                goto L_0x0022
            L_0x0018:
                r2 = move-exception
                r1 = r0
                goto L_0x002c
            L_0x001b:
                r1 = r0
            L_0x001c:
                i.f0.i.b r1 = i.f0.i.b.PROTOCOL_ERROR     // Catch:{ all -> 0x002b }
                i.f0.i.b r0 = i.f0.i.b.PROTOCOL_ERROR     // Catch:{ all -> 0x002b }
                i.f0.i.g r2 = i.f0.i.g.this
            L_0x0022:
                r2.a(r1, r0)
            L_0x0025:
                i.f0.i.h r0 = r4.f9034c
                i.f0.c.a(r0)
                return
            L_0x002b:
                r2 = move-exception
            L_0x002c:
                i.f0.i.g r3 = i.f0.i.g.this     // Catch:{ IOException -> 0x0031 }
                r3.a(r1, r0)     // Catch:{ IOException -> 0x0031 }
            L_0x0031:
                i.f0.i.h r0 = r4.f9034c
                i.f0.c.a(r0)
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: i.f0.i.g.j.b():void");
        }
    }

    g(C0137g gVar) {
        this.f8999k = gVar.f9027f;
        boolean z = gVar.f9028g;
        this.f8990b = z;
        this.f8991c = gVar.f9026e;
        this.f8995g = z ? 1 : 2;
        if (gVar.f9028g) {
            this.f8995g += 2;
        }
        if (gVar.f9028g) {
            this.o.a(7, 16777216);
        }
        this.f8993e = gVar.f9023b;
        this.f8997i = new ScheduledThreadPoolExecutor(1, i.f0.c.a(i.f0.c.a("OkHttp %s Writer", this.f8993e), false));
        if (gVar.f9029h != 0) {
            ScheduledExecutorService scheduledExecutorService = this.f8997i;
            i iVar = new i(false, 0, 0);
            int i2 = gVar.f9029h;
            scheduledExecutorService.scheduleAtFixedRate(iVar, (long) i2, (long) i2, TimeUnit.MILLISECONDS);
        }
        this.f8998j = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), i.f0.c.a(i.f0.c.a("OkHttp %s Push Observer", this.f8993e), true));
        this.p.a(7, 65535);
        this.p.a(5, 16384);
        this.n = (long) this.p.c();
        this.r = gVar.a;
        this.s = new j(gVar.f9025d, this.f8990b);
        this.t = new j(new h(gVar.f9024c, this.f8990b));
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0043  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private i.f0.i.i b(int r11, java.util.List<i.f0.i.c> r12, boolean r13) {
        /*
        // Method dump skipped, instructions count: 123
        */
        throw new UnsupportedOperationException("Method not decompiled: i.f0.i.g.b(int, java.util.List, boolean):i.f0.i.i");
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void p() {
        try {
            a(b.PROTOCOL_ERROR, b.PROTOCOL_ERROR);
        } catch (IOException unused) {
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized i a(int i2) {
        return this.f8992d.get(Integer.valueOf(i2));
    }

    public i a(List<c> list, boolean z) {
        return b(0, list, z);
    }

    /* access modifiers changed from: package-private */
    public void a(int i2, long j2) {
        try {
            this.f8997i.execute(new b("OkHttp Window Update %s stream %d", new Object[]{this.f8993e, Integer.valueOf(i2)}, i2, j2));
        } catch (RejectedExecutionException unused) {
        }
    }

    /* access modifiers changed from: package-private */
    public void a(int i2, b bVar) {
        this.f8998j.execute(new f("OkHttp %s Push Reset[%s]", new Object[]{this.f8993e, Integer.valueOf(i2)}, i2, bVar));
    }

    /* access modifiers changed from: package-private */
    public void a(int i2, j.e eVar, int i3, boolean z) {
        j.c cVar = new j.c();
        long j2 = (long) i3;
        eVar.f(j2);
        eVar.b(cVar, j2);
        if (cVar.t() == j2) {
            this.f8998j.execute(new e("OkHttp %s Push Data[%s]", new Object[]{this.f8993e, Integer.valueOf(i2)}, i2, cVar, i3, z));
            return;
        }
        throw new IOException(cVar.t() + " != " + i3);
    }

    /* access modifiers changed from: package-private */
    public void a(int i2, List<c> list) {
        synchronized (this) {
            if (this.u.contains(Integer.valueOf(i2))) {
                c(i2, b.PROTOCOL_ERROR);
                return;
            }
            this.u.add(Integer.valueOf(i2));
            try {
                this.f8998j.execute(new c("OkHttp %s Push Request[%s]", new Object[]{this.f8993e, Integer.valueOf(i2)}, i2, list));
            } catch (RejectedExecutionException unused) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(int i2, List<c> list, boolean z) {
        try {
            this.f8998j.execute(new d("OkHttp %s Push Headers[%s]", new Object[]{this.f8993e, Integer.valueOf(i2)}, i2, list, z));
        } catch (RejectedExecutionException unused) {
        }
    }

    public void a(int i2, boolean z, j.c cVar, long j2) {
        int min;
        long j3;
        if (j2 == 0) {
            this.s.a(z, i2, cVar, 0);
            return;
        }
        while (j2 > 0) {
            synchronized (this) {
                while (this.n <= 0) {
                    try {
                        if (this.f8992d.containsKey(Integer.valueOf(i2))) {
                            wait();
                        } else {
                            throw new IOException("stream closed");
                        }
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                }
                min = Math.min((int) Math.min(j2, this.n), this.s.m());
                j3 = (long) min;
                this.n -= j3;
            }
            j2 -= j3;
            this.s.a(z && j2 == 0, i2, cVar, min);
        }
    }

    public void a(b bVar) {
        synchronized (this.s) {
            synchronized (this) {
                if (!this.f8996h) {
                    this.f8996h = true;
                    this.s.a(this.f8994f, bVar, i.f0.c.a);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(b bVar, b bVar2) {
        IOException e2;
        i[] iVarArr = null;
        try {
            a(bVar);
            e2 = null;
        } catch (IOException e3) {
            e2 = e3;
        }
        synchronized (this) {
            if (!this.f8992d.isEmpty()) {
                iVarArr = (i[]) this.f8992d.values().toArray(new i[this.f8992d.size()]);
                this.f8992d.clear();
            }
        }
        if (iVarArr != null) {
            for (i iVar : iVarArr) {
                try {
                    iVar.a(bVar2);
                } catch (IOException e4) {
                    if (e2 != null) {
                        e2 = e4;
                    }
                }
            }
        }
        try {
            this.s.close();
        } catch (IOException e5) {
            if (e2 == null) {
                e2 = e5;
            }
        }
        try {
            this.r.close();
        } catch (IOException e6) {
            e2 = e6;
        }
        this.f8997i.shutdown();
        this.f8998j.shutdown();
        if (e2 != null) {
            throw e2;
        }
    }

    /* access modifiers changed from: package-private */
    public void a(boolean z) {
        if (z) {
            this.s.l();
            this.s.b(this.o);
            int c2 = this.o.c();
            if (c2 != 65535) {
                this.s.a(0, (long) (c2 - 65535));
            }
        }
        new Thread(this.t).start();
    }

    /* access modifiers changed from: package-private */
    public void a(boolean z, int i2, int i3) {
        boolean z2;
        if (!z) {
            synchronized (this) {
                z2 = this.f9000l;
                this.f9000l = true;
            }
            if (z2) {
                p();
                return;
            }
        }
        try {
            this.s.a(z, i2, i3);
        } catch (IOException unused) {
            p();
        }
    }

    /* access modifiers changed from: package-private */
    public void b(int i2, b bVar) {
        this.s.a(i2, bVar);
    }

    /* access modifiers changed from: package-private */
    public boolean b(int i2) {
        return i2 != 0 && (i2 & 1) == 0;
    }

    /* access modifiers changed from: package-private */
    public synchronized i c(int i2) {
        i remove;
        remove = this.f8992d.remove(Integer.valueOf(i2));
        notifyAll();
        return remove;
    }

    /* access modifiers changed from: package-private */
    public void c(int i2, b bVar) {
        try {
            this.f8997i.execute(new a("OkHttp %s stream %d", new Object[]{this.f8993e, Integer.valueOf(i2)}, i2, bVar));
        } catch (RejectedExecutionException unused) {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        a(b.NO_ERROR, b.CANCEL);
    }

    public void flush() {
        this.s.flush();
    }

    /* access modifiers changed from: package-private */
    public void g(long j2) {
        this.n += j2;
        if (j2 > 0) {
            notifyAll();
        }
    }

    public synchronized boolean l() {
        return this.f8996h;
    }

    public synchronized int m() {
        return this.p.b(Integer.MAX_VALUE);
    }

    public void n() {
        a(true);
    }
}
