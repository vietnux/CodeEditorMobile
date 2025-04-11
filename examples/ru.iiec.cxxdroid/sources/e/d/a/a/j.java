package e.d.a.a;

import e.d.a.a.i;
import java.util.List;

public class j {
    private int a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final i f8226b;

    public interface a {
    }

    public j(i.a aVar, a aVar2) {
        this.f8226b = new i(aVar);
    }

    public j(i iVar, a aVar) {
        this.f8226b = iVar;
    }

    public j(j jVar, a aVar) {
        this.f8226b = jVar.f8226b;
    }

    public char a(int i2) {
        if (this.f8226b.j(i2)) {
            return this.f8226b.a(i2);
        }
        return 0;
    }

    public void a() {
        this.f8226b.o();
    }

    public void a(char c2, int i2, long j2) {
        if (this.f8226b.j(i2)) {
            this.f8226b.a(new char[]{c2}, i2, j2, true);
        }
    }

    public void a(int i2, int i3, long j2) {
        if (this.f8226b.j(i2) && i3 > 0) {
            this.f8226b.a(i2, Math.min(i3, this.f8226b.k() - i2), j2, true);
        }
    }

    public void a(int i2, long j2) {
        if (this.f8226b.j(i2)) {
            this.f8226b.a(i2, 1, j2, true);
        }
    }

    public void a(List<h0> list) {
        this.f8226b.a(list);
    }

    public void a(boolean z) {
        this.f8226b.a(z);
    }

    public void a(char[] cArr, int i2, long j2) {
        if (this.f8226b.j(i2) && cArr.length != 0) {
            this.f8226b.a(cArr, i2, j2, true);
        }
    }

    public char[] a(int i2, int i3) {
        return this.f8226b.a(i2, i3);
    }

    public int b(int i2) {
        return this.f8226b.b(i2);
    }

    public void b() {
        this.f8226b.a();
    }

    public int c(int i2) {
        return this.f8226b.q(i2);
    }

    public boolean c() {
        return this.f8226b.b();
    }

    public int d(int i2) {
        return this.f8226b.e(i2);
    }

    public boolean d() {
        return this.f8226b.c();
    }

    public String e(int i2) {
        return this.f8226b.r(i2);
    }

    public void e() {
        this.f8226b.d();
    }

    public int f() {
        return this.f8226b.k();
    }

    public int f(int i2) {
        return this.f8226b.s(i2);
    }

    public int g(int i2) {
        return this.f8226b.t(i2);
    }

    public void g() {
        this.f8226b.e();
    }

    public int h(int i2) {
        if (!this.f8226b.j(i2)) {
            i2 = -1;
        }
        this.a = i2;
        return this.a;
    }

    public String h() {
        return this.f8226b.g();
    }

    public String i() {
        return this.f8226b.h();
    }

    public int j() {
        return this.f8226b.p();
    }

    public List<h0> k() {
        return this.f8226b.j();
    }

    public boolean l() {
        int i2 = this.a;
        return i2 >= 0 && i2 < this.f8226b.k();
    }

    public boolean m() {
        return this.f8226b.l();
    }

    public boolean n() {
        return this.f8226b.q();
    }

    public char o() {
        char a2 = this.f8226b.a(this.a);
        this.a++;
        return a2;
    }

    public int p() {
        return this.f8226b.m();
    }

    public int q() {
        return this.f8226b.n();
    }
}
