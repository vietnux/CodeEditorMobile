package e.d.a.a;

import java.util.List;
import java.util.Vector;

public class m0 {
    public char[] a = new char[51];

    /* renamed from: b  reason: collision with root package name */
    public int f8235b;

    /* renamed from: c  reason: collision with root package name */
    protected int f8236c;

    /* renamed from: d  reason: collision with root package name */
    protected int f8237d;

    /* renamed from: e  reason: collision with root package name */
    private int f8238e;

    /* renamed from: f  reason: collision with root package name */
    private n0 f8239f;

    /* renamed from: g  reason: collision with root package name */
    private p0 f8240g;

    /* renamed from: h  reason: collision with root package name */
    protected String f8241h;

    /* renamed from: i  reason: collision with root package name */
    protected String f8242i;

    /* renamed from: j  reason: collision with root package name */
    protected List<h0> f8243j;

    public m0() {
        this.a[50] = 65535;
        this.f8238e = 1;
        this.f8235b = 0;
        this.f8236c = 50;
        this.f8237d = 1;
        this.f8239f = new n0();
        this.f8240g = new p0(this);
        this.f8241h = "UTF-8";
        this.f8242i = "Unix";
    }

    private int a(int i2, int i3, int i4) {
        int k2 = k(i4);
        o0.a(j(i4), "findCharOffsetBackward: Invalid startingOffset given");
        while (i3 < i2) {
            char[] cArr = this.a;
            if (k2 >= cArr.length) {
                break;
            }
            if (cArr[k2] == '\n') {
                i3++;
            }
            k2++;
            if (k2 == this.f8235b) {
                k2 = this.f8236c;
            }
        }
        if (i3 != i2) {
            return -1;
        }
        return l(k2);
    }

    private int b(int i2, int i3) {
        int i4 = 0;
        for (int i5 = i2; i5 < i2 + i3; i5++) {
            if (this.a[i5] == '\n') {
                i4++;
            }
        }
        return i4;
    }

    private int b(int i2, int i3, int i4) {
        if (i2 == 0) {
            return 0;
        }
        o0.a(j(i4), "findCharOffsetBackward: Invalid startOffset given");
        int k2 = k(i4);
        while (i3 > i2 - 1 && k2 >= 0) {
            if (k2 == this.f8236c) {
                k2 = this.f8235b;
            }
            k2--;
            if (this.a[k2] == '\n') {
                i3--;
            }
        }
        if (k2 >= 0) {
            return l(k2) + 1;
        }
        o0.a(false, "findCharOffsetBackward: Invalid cache entry or line arguments");
        return -1;
    }

    public static int p(int i2) {
        long j2 = (long) (i2 + 50 + 1);
        if (j2 < 2147483647L) {
            return (int) j2;
        }
        return -1;
    }

    public synchronized char a(int i2) {
        int k2 = k(i2);
        if (k2 >= this.a.length) {
            return 0;
        }
        return this.a[k2];
    }

    public void a() {
        this.f8240g.a();
    }

    public synchronized void a(int i2, int i3, long j2, boolean z) {
        if (z) {
            this.f8240g.a(i2, i3, j2);
        }
        int i4 = i2 + i3;
        if (i4 != this.f8235b) {
            if (i(i4)) {
                m(i4);
            } else {
                n(i4 + f());
            }
        }
        for (int i5 = 0; i5 < i3; i5++) {
            this.f8235b--;
            if (this.a[this.f8235b] == '\n') {
                this.f8237d--;
            }
        }
        this.f8239f.c(i2);
    }

    public void a(List<h0> list) {
        this.f8243j = list;
    }

    public synchronized void a(char[] cArr, int i2, long j2, boolean z) {
        if (z) {
            this.f8240g.b(i2, cArr.length, j2);
        }
        int k2 = k(i2);
        if (k2 != this.f8236c) {
            if (i(k2)) {
                m(k2);
            } else {
                n(k2);
            }
        }
        if (cArr.length >= f()) {
            g(cArr.length - f());
        }
        for (int i3 = 0; i3 < cArr.length; i3++) {
            if (cArr[i3] == '\n') {
                this.f8237d++;
            }
            this.a[this.f8235b] = cArr[i3];
            this.f8235b++;
        }
        this.f8239f.c(i2);
    }

    public synchronized void a(char[] cArr, String str, String str2, int i2, int i3) {
        this.f8241h = str;
        this.f8242i = str2;
        this.a = cArr;
        h(i2);
        this.f8237d = i3;
        this.f8238e = 1;
    }

    public synchronized char[] a(int i2, int i3) {
        if (j(i2)) {
            if (i3 > 0) {
                if (i2 + i3 > k()) {
                    i3 = k() - i2;
                }
                int k2 = k(i2);
                char[] cArr = new char[i3];
                for (int i4 = 0; i4 < i3; i4++) {
                    cArr[i4] = this.a[k2];
                    k2++;
                    if (k2 == this.f8235b) {
                        k2 = this.f8236c;
                    }
                }
                return cArr;
            }
        }
        return new char[0];
    }

    public synchronized int b(int i2) {
        if (!j(i2)) {
            return -1;
        }
        h0 a2 = this.f8239f.a(i2);
        int a3 = a2.a();
        int k2 = k(a2.b());
        int k3 = k(i2);
        int i3 = a3;
        int i4 = -1;
        int i5 = -1;
        if (k3 > k2) {
            while (k2 < k3 && k2 < this.a.length) {
                if (this.a[k2] == '\n') {
                    i4 = i3 + 1;
                    i5 = l(k2) + 1;
                    i3 = i4;
                }
                k2++;
                if (k2 == this.f8235b) {
                    k2 = this.f8236c;
                }
            }
        } else if (k3 < k2) {
            while (k2 > k3 && k2 > 0) {
                if (k2 == this.f8236c) {
                    k2 = this.f8235b;
                }
                k2--;
                if (this.a[k2] == '\n') {
                    i5 = l(k2) + 1;
                    i3--;
                    i4 = i3;
                }
            }
        }
        if (k2 != k3) {
            return -1;
        }
        if (i4 != -1) {
            this.f8239f.a(i4, i5);
        }
        return i3;
    }

    public boolean b() {
        return this.f8240g.b();
    }

    public boolean c() {
        return this.f8240g.c();
    }

    /* access modifiers changed from: package-private */
    public char[] c(int i2) {
        char[] cArr = new char[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            cArr[i3] = this.a[this.f8235b + i3];
        }
        return cArr;
    }

    public synchronized String d(int i2) {
        int e2 = e(i2);
        if (e2 < 0) {
            return new String();
        }
        return new String(a(e2, f(i2)));
    }

    public void d() {
        this.f8243j = new Vector();
        this.f8243j.add(new h0(0, 0));
    }

    public synchronized int e(int i2) {
        if (i2 < 0) {
            return -1;
        }
        h0 b2 = this.f8239f.b(i2);
        int a2 = b2.a();
        int b3 = b2.b();
        if (i2 > a2) {
            b3 = a(i2, a2, b3);
        } else if (i2 < a2) {
            b3 = b(i2, a2, b3);
        }
        if (b3 >= 0) {
            this.f8239f.a(i2, b3);
        }
        return b3;
    }

    public void e() {
        this.f8240g.d();
    }

    /* access modifiers changed from: protected */
    public final int f() {
        return this.f8236c - this.f8235b;
    }

    public synchronized int f(int i2) {
        int i3;
        i3 = 0;
        int e2 = e(i2);
        if (e2 != -1) {
            int k2 = k(e2);
            while (this.a[k2] != '\n' && this.a[k2] != 65535) {
                i3++;
                k2++;
                if (k2 == this.f8235b) {
                    k2 = this.f8236c;
                }
            }
            i3++;
        }
        return i3;
    }

    public String g() {
        return this.f8242i;
    }

    /* access modifiers changed from: protected */
    public void g(int i2) {
        int i3 = i2 + (this.f8238e * 50);
        char[] cArr = new char[(this.a.length + i3)];
        for (int i4 = 0; i4 < this.f8235b; i4++) {
            cArr[i4] = this.a[i4];
        }
        int i5 = this.f8236c;
        while (true) {
            char[] cArr2 = this.a;
            if (i5 < cArr2.length) {
                cArr[i5 + i3] = cArr2[i5];
                i5++;
            } else {
                this.f8236c += i3;
                this.a = cArr;
                this.f8238e <<= 1;
                return;
            }
        }
    }

    public String h() {
        return this.f8241h;
    }

    /* access modifiers changed from: protected */
    public void h(int i2) {
        char[] cArr = this.a;
        int length = cArr.length - 1;
        int i3 = length - 1;
        cArr[length] = 65535;
        for (int i4 = i2 - 1; i4 >= 0; i4--) {
            char[] cArr2 = this.a;
            cArr2[i3] = cArr2[i4];
            i3--;
        }
        this.f8235b = 0;
        this.f8236c = i3 + 1;
    }

    public synchronized int i() {
        return this.f8237d;
    }

    /* access modifiers changed from: protected */
    public final boolean i(int i2) {
        return i2 < this.f8235b;
    }

    public List<h0> j() {
        return this.f8243j;
    }

    public final synchronized boolean j(int i2) {
        boolean z;
        if (i2 >= 0) {
            if (i2 < k()) {
                z = true;
            }
        }
        z = false;
        return z;
    }

    public final synchronized int k() {
        return this.a.length - f();
    }

    /* access modifiers changed from: protected */
    public final int k(int i2) {
        return i(i2) ? i2 : i2 + f();
    }

    /* access modifiers changed from: protected */
    public final int l(int i2) {
        return i(i2) ? i2 : i2 - f();
    }

    public boolean l() {
        return this.f8240g.e();
    }

    public int m() {
        return this.f8240g.f();
    }

    /* access modifiers changed from: protected */
    public final void m(int i2) {
        while (true) {
            int i3 = this.f8235b;
            if (i3 > i2) {
                this.f8236c--;
                this.f8235b = i3 - 1;
                char[] cArr = this.a;
                cArr[this.f8236c] = cArr[this.f8235b];
            } else {
                return;
            }
        }
    }

    public int n() {
        return this.f8240g.g();
    }

    /* access modifiers changed from: protected */
    public final void n(int i2) {
        while (true) {
            int i3 = this.f8236c;
            if (i3 < i2) {
                char[] cArr = this.a;
                int i4 = this.f8235b;
                cArr[i4] = cArr[i3];
                this.f8235b = i4 + 1;
                this.f8236c = i3 + 1;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized void o(int i2) {
        if (i2 >= 0) {
            this.f8237d += b(this.f8235b, i2);
        } else {
            this.f8237d -= b(this.f8235b + i2, -i2);
        }
        this.f8235b += i2;
        this.f8239f.c(l(this.f8235b - 1) + 1);
    }
}
