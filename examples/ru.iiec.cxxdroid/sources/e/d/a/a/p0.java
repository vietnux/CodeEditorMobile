package e.d.a.a;

import java.util.LinkedList;

public class p0 {
    private m0 a;

    /* renamed from: b  reason: collision with root package name */
    private LinkedList<b> f8252b = new LinkedList<>();

    /* renamed from: c  reason: collision with root package name */
    private boolean f8253c = false;

    /* renamed from: d  reason: collision with root package name */
    private int f8254d = 0;

    /* renamed from: e  reason: collision with root package name */
    private int f8255e = 0;

    /* renamed from: f  reason: collision with root package name */
    long f8256f = -1;

    /* access modifiers changed from: private */
    public abstract class b {
        public int a;

        /* renamed from: b  reason: collision with root package name */
        public int f8257b;

        /* renamed from: c  reason: collision with root package name */
        public String f8258c;

        /* renamed from: d  reason: collision with root package name */
        public int f8259d;

        private b(p0 p0Var) {
        }

        public abstract int a();

        public abstract boolean a(int i2, int i3, long j2);

        public abstract int b();

        public abstract void c();

        public abstract void d();

        public abstract void e();
    }

    /* access modifiers changed from: private */
    public class c extends b {
        public c(int i2, int i3, int i4) {
            super();
            this.a = i2;
            this.f8257b = i3;
            this.f8259d = i4;
        }

        @Override // e.d.a.a.p0.b
        public int a() {
            return this.a;
        }

        @Override // e.d.a.a.p0.b
        public boolean a(int i2, int i3, long j2) {
            p0 p0Var = p0.this;
            long j3 = p0Var.f8256f;
            if (j3 >= 0 && j2 - j3 < 2500000000L) {
                int i4 = this.a;
                int i5 = this.f8257b;
                if (i2 == ((i4 - i5) - i3) + 1) {
                    this.a = i2;
                    this.f8257b = i5 + i3;
                    p0Var.h();
                    return true;
                }
            }
            return false;
        }

        @Override // e.d.a.a.p0.b
        public int b() {
            return this.a + this.f8257b;
        }

        @Override // e.d.a.a.p0.b
        public void c() {
            this.f8258c = new String(p0.this.a.c(this.f8257b));
        }

        @Override // e.d.a.a.p0.b
        public void d() {
            p0.this.a.a(this.a, this.f8257b, 0L, false);
        }

        @Override // e.d.a.a.p0.b
        public void e() {
            if (this.f8258c == null) {
                c();
                p0.this.a.o(this.f8257b);
                return;
            }
            p0.this.a.a(this.f8258c.toCharArray(), this.a, 0L, false);
        }
    }

    /* access modifiers changed from: private */
    public class d extends b {
        public d(int i2, int i3, int i4) {
            super();
            this.a = i2;
            this.f8257b = i3;
            this.f8259d = i4;
        }

        @Override // e.d.a.a.p0.b
        public int a() {
            return this.a + this.f8257b;
        }

        @Override // e.d.a.a.p0.b
        public boolean a(int i2, int i3, long j2) {
            p0 p0Var = p0.this;
            long j3 = p0Var.f8256f;
            if (j3 >= 0 && j2 - j3 < 2500000000L) {
                int i4 = this.a;
                int i5 = this.f8257b;
                if (i2 == i4 + i5) {
                    this.f8257b = i5 + i3;
                    p0Var.h();
                    return true;
                }
            }
            return false;
        }

        @Override // e.d.a.a.p0.b
        public int b() {
            return this.a;
        }

        @Override // e.d.a.a.p0.b
        public void c() {
            this.f8258c = new String(p0.this.a.a(this.a, this.f8257b));
        }

        @Override // e.d.a.a.p0.b
        public void d() {
            p0.this.a.a(this.f8258c.toCharArray(), this.a, 0L, false);
        }

        @Override // e.d.a.a.p0.b
        public void e() {
            if (this.f8258c == null) {
                c();
                p0.this.a.o(-this.f8257b);
                return;
            }
            p0.this.a.a(this.a, this.f8257b, 0L, false);
        }
    }

    public p0(m0 m0Var) {
        this.a = m0Var;
    }

    private void a(b bVar) {
        h();
        this.f8255e++;
        this.f8252b.add(bVar);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void h() {
        while (this.f8252b.size() > this.f8255e) {
            this.f8252b.removeLast();
        }
    }

    public void a() {
        this.f8253c = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(int r4, int r5, long r6) {
        /*
            r3 = this;
            boolean r0 = r3.c()
            r1 = 1
            if (r0 == 0) goto L_0x0021
            java.util.LinkedList<e.d.a.a.p0$b> r0 = r3.f8252b
            int r2 = r3.f8255e
            int r2 = r2 - r1
            java.lang.Object r0 = r0.get(r2)
            e.d.a.a.p0$b r0 = (e.d.a.a.p0.b) r0
            boolean r2 = r0 instanceof e.d.a.a.p0.c
            if (r2 == 0) goto L_0x001e
            boolean r2 = r0.a(r4, r5, r6)
            if (r2 == 0) goto L_0x001e
            r0 = 1
            goto L_0x0022
        L_0x001e:
            r0.c()
        L_0x0021:
            r0 = 0
        L_0x0022:
            if (r0 != 0) goto L_0x0037
            e.d.a.a.p0$c r0 = new e.d.a.a.p0$c
            int r2 = r3.f8254d
            r0.<init>(r4, r5, r2)
            r3.a(r0)
            boolean r4 = r3.f8253c
            if (r4 != 0) goto L_0x0037
            int r4 = r3.f8254d
            int r4 = r4 + r1
            r3.f8254d = r4
        L_0x0037:
            r3.f8256f = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e.d.a.a.p0.a(int, int, long):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(int r4, int r5, long r6) {
        /*
            r3 = this;
            boolean r0 = r3.c()
            r1 = 1
            if (r0 == 0) goto L_0x0021
            java.util.LinkedList<e.d.a.a.p0$b> r0 = r3.f8252b
            int r2 = r3.f8255e
            int r2 = r2 - r1
            java.lang.Object r0 = r0.get(r2)
            e.d.a.a.p0$b r0 = (e.d.a.a.p0.b) r0
            boolean r2 = r0 instanceof e.d.a.a.p0.d
            if (r2 == 0) goto L_0x001e
            boolean r2 = r0.a(r4, r5, r6)
            if (r2 == 0) goto L_0x001e
            r0 = 1
            goto L_0x0022
        L_0x001e:
            r0.c()
        L_0x0021:
            r0 = 0
        L_0x0022:
            if (r0 != 0) goto L_0x0037
            e.d.a.a.p0$d r0 = new e.d.a.a.p0$d
            int r2 = r3.f8254d
            r0.<init>(r4, r5, r2)
            r3.a(r0)
            boolean r4 = r3.f8253c
            if (r4 != 0) goto L_0x0037
            int r4 = r3.f8254d
            int r4 = r4 + r1
            r3.f8254d = r4
        L_0x0037:
            r3.f8256f = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e.d.a.a.p0.b(int, int, long):void");
    }

    public final boolean b() {
        return this.f8255e < this.f8252b.size();
    }

    public final boolean c() {
        return this.f8255e > 0;
    }

    public void d() {
        this.f8253c = false;
        this.f8254d++;
    }

    public boolean e() {
        return this.f8253c;
    }

    public int f() {
        if (!b()) {
            return -1;
        }
        b bVar = this.f8252b.get(this.f8255e);
        int i2 = bVar.f8259d;
        while (true) {
            b bVar2 = this.f8252b.get(this.f8255e);
            if (bVar2.f8259d != i2) {
                break;
            }
            bVar2.d();
            this.f8255e++;
            if (!b()) {
                bVar = bVar2;
                break;
            }
            bVar = bVar2;
        }
        return bVar.a();
    }

    public int g() {
        if (!c()) {
            return -1;
        }
        b bVar = this.f8252b.get(this.f8255e - 1);
        int i2 = bVar.f8259d;
        while (true) {
            b bVar2 = this.f8252b.get(this.f8255e - 1);
            if (bVar2.f8259d != i2) {
                break;
            }
            bVar2.e();
            this.f8255e--;
            if (!c()) {
                bVar = bVar2;
                break;
            }
            bVar = bVar2;
        }
        return bVar.b();
    }
}
