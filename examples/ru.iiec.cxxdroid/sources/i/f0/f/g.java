package i.f0.f;

import i.c0;
import i.e;
import i.f0.f.f;
import i.f0.g.c;
import i.f0.i.b;
import i.f0.i.n;
import i.j;
import i.p;
import i.t;
import i.v;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.List;

public final class g {
    public final i.a a;

    /* renamed from: b  reason: collision with root package name */
    private f.a f8881b;

    /* renamed from: c  reason: collision with root package name */
    private c0 f8882c;

    /* renamed from: d  reason: collision with root package name */
    private final j f8883d;

    /* renamed from: e  reason: collision with root package name */
    public final e f8884e;

    /* renamed from: f  reason: collision with root package name */
    public final p f8885f;

    /* renamed from: g  reason: collision with root package name */
    private final Object f8886g;

    /* renamed from: h  reason: collision with root package name */
    private final f f8887h;

    /* renamed from: i  reason: collision with root package name */
    private int f8888i;

    /* renamed from: j  reason: collision with root package name */
    private c f8889j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f8890k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f8891l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f8892m;
    private c n;

    public static final class a extends WeakReference<g> {
        public final Object a;

        a(g gVar, Object obj) {
            super(gVar);
            this.a = obj;
        }
    }

    public g(j jVar, i.a aVar, e eVar, p pVar, Object obj) {
        this.f8883d = jVar;
        this.a = aVar;
        this.f8884e = eVar;
        this.f8885f = pVar;
        this.f8887h = new f(aVar, h(), eVar, pVar);
        this.f8886g = obj;
    }

    private c a(int i2, int i3, int i4, int i5, boolean z) {
        Socket g2;
        Socket socket;
        c cVar;
        c cVar2;
        c0 c0Var;
        c cVar3;
        boolean z2;
        boolean z3;
        f.a aVar;
        synchronized (this.f8883d) {
            if (this.f8891l) {
                throw new IllegalStateException("released");
            } else if (this.n != null) {
                throw new IllegalStateException("codec != null");
            } else if (!this.f8892m) {
                c cVar4 = this.f8889j;
                g2 = g();
                socket = null;
                if (this.f8889j != null) {
                    cVar2 = this.f8889j;
                    cVar = null;
                } else {
                    cVar = cVar4;
                    cVar2 = null;
                }
                if (!this.f8890k) {
                    cVar = null;
                }
                if (cVar2 == null) {
                    i.f0.a.a.a(this.f8883d, this.a, this, null);
                    if (this.f8889j != null) {
                        cVar3 = this.f8889j;
                        c0Var = null;
                        z2 = true;
                    } else {
                        c0Var = this.f8882c;
                        cVar3 = cVar2;
                    }
                } else {
                    cVar3 = cVar2;
                    c0Var = null;
                }
                z2 = false;
            } else {
                throw new IOException("Canceled");
            }
        }
        i.f0.c.a(g2);
        if (cVar != null) {
            this.f8885f.b(this.f8884e, cVar);
        }
        if (z2) {
            this.f8885f.a(this.f8884e, cVar3);
        }
        if (cVar3 != null) {
            return cVar3;
        }
        if (c0Var != null || ((aVar = this.f8881b) != null && aVar.b())) {
            z3 = false;
        } else {
            this.f8881b = this.f8887h.b();
            z3 = true;
        }
        synchronized (this.f8883d) {
            if (!this.f8892m) {
                if (z3) {
                    List<c0> a2 = this.f8881b.a();
                    int size = a2.size();
                    int i6 = 0;
                    while (true) {
                        if (i6 >= size) {
                            break;
                        }
                        c0 c0Var2 = a2.get(i6);
                        i.f0.a.a.a(this.f8883d, this.a, this, c0Var2);
                        if (this.f8889j != null) {
                            cVar3 = this.f8889j;
                            this.f8882c = c0Var2;
                            z2 = true;
                            break;
                        }
                        i6++;
                    }
                }
                if (!z2) {
                    if (c0Var == null) {
                        c0Var = this.f8881b.c();
                    }
                    this.f8882c = c0Var;
                    this.f8888i = 0;
                    cVar3 = new c(this.f8883d, c0Var);
                    a(cVar3, false);
                }
            } else {
                throw new IOException("Canceled");
            }
        }
        if (!z2) {
            cVar3.a(i2, i3, i4, i5, z, this.f8884e, this.f8885f);
            h().a(cVar3.c());
            synchronized (this.f8883d) {
                this.f8890k = true;
                i.f0.a.a.b(this.f8883d, cVar3);
                if (cVar3.b()) {
                    socket = i.f0.a.a.a(this.f8883d, this.a, this);
                    cVar3 = this.f8889j;
                }
            }
            i.f0.c.a(socket);
        }
        this.f8885f.a(this.f8884e, cVar3);
        return cVar3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0018, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        if (r0.a(r9) != false) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private i.f0.f.c a(int r4, int r5, int r6, int r7, boolean r8, boolean r9) {
        /*
            r3 = this;
        L_0x0000:
            i.f0.f.c r0 = r3.a(r4, r5, r6, r7, r8)
            i.j r1 = r3.f8883d
            monitor-enter(r1)
            int r2 = r0.f8869l     // Catch:{ all -> 0x0019 }
            if (r2 != 0) goto L_0x000d
            monitor-exit(r1)     // Catch:{ all -> 0x0019 }
            return r0
        L_0x000d:
            monitor-exit(r1)     // Catch:{ all -> 0x0019 }
            boolean r1 = r0.a(r9)
            if (r1 != 0) goto L_0x0018
            r3.d()
            goto L_0x0000
        L_0x0018:
            return r0
        L_0x0019:
            r4 = move-exception
            monitor-exit(r1)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: i.f0.f.g.a(int, int, int, int, boolean, boolean):i.f0.f.c");
    }

    private Socket a(boolean z, boolean z2, boolean z3) {
        Socket socket;
        if (z3) {
            this.n = null;
        }
        if (z2) {
            this.f8891l = true;
        }
        c cVar = this.f8889j;
        if (cVar != null) {
            if (z) {
                cVar.f8868k = true;
            }
            if (this.n == null && (this.f8891l || this.f8889j.f8868k)) {
                b(this.f8889j);
                if (this.f8889j.n.isEmpty()) {
                    this.f8889j.o = System.nanoTime();
                    if (i.f0.a.a.a(this.f8883d, this.f8889j)) {
                        socket = this.f8889j.d();
                        this.f8889j = null;
                        return socket;
                    }
                }
                socket = null;
                this.f8889j = null;
                return socket;
            }
        }
        return null;
    }

    private void b(c cVar) {
        int size = cVar.n.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (cVar.n.get(i2).get() == this) {
                cVar.n.remove(i2);
                return;
            }
        }
        throw new IllegalStateException();
    }

    private Socket g() {
        c cVar = this.f8889j;
        if (cVar == null || !cVar.f8868k) {
            return null;
        }
        return a(false, false, true);
    }

    private d h() {
        return i.f0.a.a.a(this.f8883d);
    }

    public c a() {
        c cVar;
        synchronized (this.f8883d) {
            cVar = this.n;
        }
        return cVar;
    }

    public c a(v vVar, t.a aVar, boolean z) {
        try {
            c a2 = a(aVar.a(), aVar.b(), aVar.c(), vVar.u(), vVar.A(), z).a(vVar, aVar, this);
            synchronized (this.f8883d) {
                this.n = a2;
            }
            return a2;
        } catch (IOException e2) {
            throw new e(e2);
        }
    }

    public Socket a(c cVar) {
        if (this.n == null && this.f8889j.n.size() == 1) {
            Socket a2 = a(true, false, false);
            this.f8889j = cVar;
            cVar.n.add(this.f8889j.n.get(0));
            return a2;
        }
        throw new IllegalStateException();
    }

    public void a(c cVar, boolean z) {
        if (this.f8889j == null) {
            this.f8889j = cVar;
            this.f8890k = z;
            cVar.n.add(new a(this, this.f8886g));
            return;
        }
        throw new IllegalStateException();
    }

    public void a(IOException iOException) {
        boolean z;
        c cVar;
        Socket a2;
        synchronized (this.f8883d) {
            if (iOException instanceof n) {
                n nVar = (n) iOException;
                if (nVar.f9086b == b.REFUSED_STREAM) {
                    this.f8888i++;
                }
                if (nVar.f9086b == b.REFUSED_STREAM) {
                    if (this.f8888i > 1) {
                    }
                    z = false;
                    cVar = this.f8889j;
                    a2 = a(z, false, true);
                    if (this.f8889j != null || !this.f8890k) {
                        cVar = null;
                    }
                }
            } else {
                if (this.f8889j != null && (!this.f8889j.b() || (iOException instanceof i.f0.i.a))) {
                    if (this.f8889j.f8869l == 0) {
                        if (!(this.f8882c == null || iOException == null)) {
                            this.f8887h.a(this.f8882c, iOException);
                        }
                    }
                    z = true;
                    cVar = this.f8889j;
                    a2 = a(z, false, true);
                    cVar = null;
                }
                z = false;
                cVar = this.f8889j;
                a2 = a(z, false, true);
                cVar = null;
            }
            this.f8882c = null;
            z = true;
            cVar = this.f8889j;
            a2 = a(z, false, true);
            cVar = null;
        }
        i.f0.c.a(a2);
        if (cVar != null) {
            this.f8885f.b(this.f8884e, cVar);
        }
    }

    public void a(boolean z, c cVar, long j2, IOException iOException) {
        c cVar2;
        Socket a2;
        boolean z2;
        this.f8885f.b(this.f8884e, j2);
        synchronized (this.f8883d) {
            if (cVar != null) {
                if (cVar == this.n) {
                    if (!z) {
                        this.f8889j.f8869l++;
                    }
                    cVar2 = this.f8889j;
                    a2 = a(z, false, true);
                    if (this.f8889j != null) {
                        cVar2 = null;
                    }
                    z2 = this.f8891l;
                }
            }
            throw new IllegalStateException("expected " + this.n + " but was " + cVar);
        }
        i.f0.c.a(a2);
        if (cVar2 != null) {
            this.f8885f.b(this.f8884e, cVar2);
        }
        if (iOException != null) {
            this.f8885f.a(this.f8884e, iOException);
        } else if (z2) {
            this.f8885f.a(this.f8884e);
        }
    }

    public synchronized c b() {
        return this.f8889j;
    }

    public boolean c() {
        f.a aVar;
        return this.f8882c != null || ((aVar = this.f8881b) != null && aVar.b()) || this.f8887h.a();
    }

    public void d() {
        c cVar;
        Socket a2;
        synchronized (this.f8883d) {
            cVar = this.f8889j;
            a2 = a(true, false, false);
            if (this.f8889j != null) {
                cVar = null;
            }
        }
        i.f0.c.a(a2);
        if (cVar != null) {
            this.f8885f.b(this.f8884e, cVar);
        }
    }

    public void e() {
        c cVar;
        Socket a2;
        synchronized (this.f8883d) {
            cVar = this.f8889j;
            a2 = a(false, true, false);
            if (this.f8889j != null) {
                cVar = null;
            }
        }
        i.f0.c.a(a2);
        if (cVar != null) {
            this.f8885f.b(this.f8884e, cVar);
        }
    }

    public c0 f() {
        return this.f8882c;
    }

    public String toString() {
        c b2 = b();
        return b2 != null ? b2.toString() : this.a.toString();
    }
}
