package e.d.a.a;

import e.d.a.a.j;
import java.util.ArrayList;
import java.util.List;

public class g0 implements j.a {

    /* renamed from: b  reason: collision with root package name */
    private m f8213b = y.e();

    /* renamed from: c  reason: collision with root package name */
    private j f8214c;

    /* renamed from: d  reason: collision with root package name */
    private b f8215d = null;

    /* renamed from: e  reason: collision with root package name */
    a f8216e = null;

    public interface a {
        void a(List<h0> list);
    }

    /* access modifiers changed from: private */
    public class b extends Thread {

        /* renamed from: b  reason: collision with root package name */
        private boolean f8217b = false;

        /* renamed from: c  reason: collision with root package name */
        private final g0 f8218c;

        /* renamed from: d  reason: collision with root package name */
        private final l f8219d;

        /* renamed from: e  reason: collision with root package name */
        private ArrayList<h0> f8220e;

        public b(g0 g0Var) {
            this.f8218c = g0Var;
            this.f8219d = new l();
        }

        public void a() {
            this.f8219d.c();
        }

        public void b() {
            this.f8217b = true;
            this.f8219d.c();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:161:0x0282, code lost:
            if (new java.lang.String(r8, 0, r5).equals("script") == false) goto L_0x0286;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:166:0x0297, code lost:
            if (new java.lang.String(r8, r10, r5).equals("style") != false) goto L_0x0299;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:167:0x0299, code lost:
            r5 = r15 - r5;
            r6 = r5 - 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:168:0x02a3, code lost:
            if (r1.a(r6) != '/') goto L_0x02b1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:170:0x02ad, code lost:
            if (r1.a(r5 - 2) != '<') goto L_0x02b1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:171:0x02af, code lost:
            r5 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:172:0x02b1, code lost:
            r5 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:173:0x02b2, code lost:
            if (r5 == false) goto L_0x02df;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:174:0x02b4, code lost:
            r11 = e.d.a.a.f0.e();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:175:0x02c8, code lost:
            if (r3.get(r3.size() - 1).a() != r6) goto L_0x02d2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:176:0x02ca, code lost:
            r3.remove(r3.size() - 1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:177:0x02d2, code lost:
            r3.add(new e.d.a.a.h0(r6, 1));
            r17 = "/something";
            r6 = 3;
            r14 = 3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:178:0x02df, code lost:
            r6 = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:179:0x02e0, code lost:
            r19 = r6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:229:0x03e0, code lost:
            if (r14 == -1) goto L_0x0407;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a8, code lost:
            if (r11.c(r12) == false) goto L_0x010b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:0x00c5, code lost:
            if (r11.c(r12) != false) goto L_0x00f6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:58:0x00d8, code lost:
            if (r11.c(r12) == false) goto L_0x010b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:67:0x00f4, code lost:
            if (r11.c(r12) != false) goto L_0x00f6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:70:0x00ff, code lost:
            if (r11.a(r13, r12, r7) != false) goto L_0x010b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:72:0x0106, code lost:
            if (r11.b(r12, r7) != false) goto L_0x010b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:73:0x0109, code lost:
            if (r7 == '\n') goto L_0x010b;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void c() {
            /*
            // Method dump skipped, instructions count: 1075
            */
            throw new UnsupportedOperationException("Method not decompiled: e.d.a.a.g0.b.c():void");
        }

        public void run() {
            do {
                this.f8217b = false;
                this.f8219d.a();
                c();
            } while (this.f8217b);
            if (!this.f8219d.b()) {
                this.f8218c.a(this.f8220e);
            }
        }
    }

    public g0(a aVar) {
        this.f8216e = aVar;
    }

    public static int a(char c2, int[] iArr) {
        int i2 = iArr[0];
        if (c(c2)) {
            iArr[0] = iArr[0] + 1;
        } else if (b(c2)) {
            iArr[0] = iArr[0] - 1;
        }
        if (!a(iArr[0])) {
            if (iArr[0] < 100) {
                iArr[0] = 103;
            }
            if (iArr[0] > 103) {
                iArr[0] = 100;
            }
        }
        return c(c2) ? iArr[0] : i2;
    }

    static boolean a(char c2) {
        return c(c2) || b(c2);
    }

    public static boolean a(int i2) {
        return i2 >= 100 && i2 <= 103;
    }

    static boolean b(char c2) {
        return c2 == ')';
    }

    static boolean c(char c2) {
        return c2 == '(';
    }

    public void a() {
        b bVar = this.f8215d;
        if (bVar != null) {
            bVar.a();
            this.f8215d = null;
        }
    }

    public synchronized void a(j jVar) {
        this.f8214c = jVar;
    }

    public synchronized void a(m mVar) {
        this.f8213b = mVar;
    }

    /* access modifiers changed from: package-private */
    public void a(List<h0> list) {
        a aVar = this.f8216e;
        if (aVar != null) {
            aVar.a(list);
        }
        this.f8215d = null;
    }

    public synchronized j b() {
        return this.f8214c;
    }

    public void b(j jVar) {
        if (c().d()) {
            a(new j(jVar, this));
            b bVar = this.f8215d;
            if (bVar == null) {
                this.f8215d = new b(this);
                this.f8215d.start();
                return;
            }
            bVar.b();
        }
    }

    public synchronized m c() {
        return this.f8213b;
    }
}
