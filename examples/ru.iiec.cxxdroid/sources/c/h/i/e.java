package c.h.i;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import c.e.g;
import c.h.i.f;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* access modifiers changed from: package-private */
public class e {
    static final c.e.e<String, Typeface> a = new c.e.e<>(16);

    /* renamed from: b  reason: collision with root package name */
    private static final ExecutorService f2330b = g.a("fonts-androidx", 10, 10000);

    /* renamed from: c  reason: collision with root package name */
    static final Object f2331c = new Object();

    /* renamed from: d  reason: collision with root package name */
    static final g<String, ArrayList<c.h.k.a<C0045e>>> f2332d = new g<>();

    /* access modifiers changed from: package-private */
    public class a implements Callable<C0045e> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f2333b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f2334c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ d f2335d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f2336e;

        a(String str, Context context, d dVar, int i2) {
            this.f2333b = str;
            this.f2334c = context;
            this.f2335d = dVar;
            this.f2336e = i2;
        }

        @Override // java.util.concurrent.Callable
        public C0045e call() {
            return e.a(this.f2333b, this.f2334c, this.f2335d, this.f2336e);
        }
    }

    /* access modifiers changed from: package-private */
    public class b implements c.h.k.a<C0045e> {
        final /* synthetic */ a a;

        b(a aVar) {
            this.a = aVar;
        }

        public void a(C0045e eVar) {
            this.a.a(eVar);
        }
    }

    /* access modifiers changed from: package-private */
    public class c implements Callable<C0045e> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f2337b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f2338c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ d f2339d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f2340e;

        c(String str, Context context, d dVar, int i2) {
            this.f2337b = str;
            this.f2338c = context;
            this.f2339d = dVar;
            this.f2340e = i2;
        }

        @Override // java.util.concurrent.Callable
        public C0045e call() {
            return e.a(this.f2337b, this.f2338c, this.f2339d, this.f2340e);
        }
    }

    /* access modifiers changed from: package-private */
    public class d implements c.h.k.a<C0045e> {
        final /* synthetic */ String a;

        d(String str) {
            this.a = str;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
            if (r0 >= r1.size()) goto L_0x002c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
            r1.get(r0).a(r5);
            r0 = r0 + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0019, code lost:
            r0 = 0;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void a(c.h.i.e.C0045e r5) {
            /*
                r4 = this;
                java.lang.Object r0 = c.h.i.e.f2331c
                monitor-enter(r0)
                c.e.g<java.lang.String, java.util.ArrayList<c.h.k.a<c.h.i.e$e>>> r1 = c.h.i.e.f2332d     // Catch:{ all -> 0x002d }
                java.lang.String r2 = r4.a     // Catch:{ all -> 0x002d }
                java.lang.Object r1 = r1.get(r2)     // Catch:{ all -> 0x002d }
                java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch:{ all -> 0x002d }
                if (r1 != 0) goto L_0x0011
                monitor-exit(r0)     // Catch:{ all -> 0x002d }
                return
            L_0x0011:
                c.e.g<java.lang.String, java.util.ArrayList<c.h.k.a<c.h.i.e$e>>> r2 = c.h.i.e.f2332d     // Catch:{ all -> 0x002d }
                java.lang.String r3 = r4.a     // Catch:{ all -> 0x002d }
                r2.remove(r3)     // Catch:{ all -> 0x002d }
                monitor-exit(r0)     // Catch:{ all -> 0x002d }
                r0 = 0
            L_0x001a:
                int r2 = r1.size()
                if (r0 >= r2) goto L_0x002c
                java.lang.Object r2 = r1.get(r0)
                c.h.k.a r2 = (c.h.k.a) r2
                r2.a(r5)
                int r0 = r0 + 1
                goto L_0x001a
            L_0x002c:
                return
            L_0x002d:
                r5 = move-exception
                monitor-exit(r0)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: c.h.i.e.d.a(c.h.i.e$e):void");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c.h.i.e$e  reason: collision with other inner class name */
    public static final class C0045e {
        final Typeface a;

        /* renamed from: b  reason: collision with root package name */
        final int f2341b;

        C0045e(int i2) {
            this.a = null;
            this.f2341b = i2;
        }

        @SuppressLint({"WrongConstant"})
        C0045e(Typeface typeface) {
            this.a = typeface;
            this.f2341b = 0;
        }

        /* access modifiers changed from: package-private */
        @SuppressLint({"WrongConstant"})
        public boolean a() {
            return this.f2341b == 0;
        }
    }

    @SuppressLint({"WrongConstant"})
    private static int a(f.a aVar) {
        int i2 = 1;
        if (aVar.b() != 0) {
            return aVar.b() != 1 ? -3 : -2;
        }
        f.b[] a2 = aVar.a();
        if (!(a2 == null || a2.length == 0)) {
            i2 = 0;
            for (f.b bVar : a2) {
                int a3 = bVar.a();
                if (a3 != 0) {
                    if (a3 < 0) {
                        return -3;
                    } else {
                        return a3;
                    }
                }
            }
        }
        return i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003d, code lost:
        r8 = new c.h.i.e.c(r0, r4, r5, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0042, code lost:
        if (r7 != null) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0044, code lost:
        r7 = c.h.i.e.f2330b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0046, code lost:
        c.h.i.g.a(r7, r8, new c.h.i.e.d(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004e, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static android.graphics.Typeface a(android.content.Context r4, c.h.i.d r5, int r6, java.util.concurrent.Executor r7, c.h.i.a r8) {
        /*
            java.lang.String r0 = a(r5, r6)
            c.e.e<java.lang.String, android.graphics.Typeface> r1 = c.h.i.e.a
            java.lang.Object r1 = r1.b(r0)
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            if (r1 == 0) goto L_0x0017
            c.h.i.e$e r4 = new c.h.i.e$e
            r4.<init>(r1)
            r8.a(r4)
            return r1
        L_0x0017:
            c.h.i.e$b r1 = new c.h.i.e$b
            r1.<init>(r8)
            java.lang.Object r8 = c.h.i.e.f2331c
            monitor-enter(r8)
            c.e.g<java.lang.String, java.util.ArrayList<c.h.k.a<c.h.i.e$e>>> r2 = c.h.i.e.f2332d     // Catch:{ all -> 0x004f }
            java.lang.Object r2 = r2.get(r0)     // Catch:{ all -> 0x004f }
            java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch:{ all -> 0x004f }
            r3 = 0
            if (r2 == 0) goto L_0x002f
            r2.add(r1)     // Catch:{ all -> 0x004f }
            monitor-exit(r8)     // Catch:{ all -> 0x004f }
            return r3
        L_0x002f:
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x004f }
            r2.<init>()     // Catch:{ all -> 0x004f }
            r2.add(r1)     // Catch:{ all -> 0x004f }
            c.e.g<java.lang.String, java.util.ArrayList<c.h.k.a<c.h.i.e$e>>> r1 = c.h.i.e.f2332d     // Catch:{ all -> 0x004f }
            r1.put(r0, r2)     // Catch:{ all -> 0x004f }
            monitor-exit(r8)     // Catch:{ all -> 0x004f }
            c.h.i.e$c r8 = new c.h.i.e$c
            r8.<init>(r0, r4, r5, r6)
            if (r7 != 0) goto L_0x0046
            java.util.concurrent.ExecutorService r7 = c.h.i.e.f2330b
        L_0x0046:
            c.h.i.e$d r4 = new c.h.i.e$d
            r4.<init>(r0)
            c.h.i.g.a(r7, r8, r4)
            return r3
        L_0x004f:
            r4 = move-exception
            monitor-exit(r8)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: c.h.i.e.a(android.content.Context, c.h.i.d, int, java.util.concurrent.Executor, c.h.i.a):android.graphics.Typeface");
    }

    static Typeface a(Context context, d dVar, a aVar, int i2, int i3) {
        String a2 = a(dVar, i2);
        Typeface b2 = a.b(a2);
        if (b2 != null) {
            aVar.a(new C0045e(b2));
            return b2;
        } else if (i3 == -1) {
            C0045e a3 = a(a2, context, dVar, i2);
            aVar.a(a3);
            return a3.a;
        } else {
            try {
                C0045e eVar = (C0045e) g.a(f2330b, new a(a2, context, dVar, i2), i3);
                aVar.a(eVar);
                return eVar.a;
            } catch (InterruptedException unused) {
                aVar.a(new C0045e(-3));
                return null;
            }
        }
    }

    static C0045e a(String str, Context context, d dVar, int i2) {
        Typeface b2 = a.b(str);
        if (b2 != null) {
            return new C0045e(b2);
        }
        try {
            f.a a2 = c.a(context, dVar, (CancellationSignal) null);
            int a3 = a(a2);
            if (a3 != 0) {
                return new C0045e(a3);
            }
            Typeface a4 = c.h.e.d.a(context, null, a2.a(), i2);
            if (a4 == null) {
                return new C0045e(-3);
            }
            a.a(str, a4);
            return new C0045e(a4);
        } catch (PackageManager.NameNotFoundException unused) {
            return new C0045e(-1);
        }
    }

    private static String a(d dVar, int i2) {
        return dVar.c() + "-" + i2;
    }
}
