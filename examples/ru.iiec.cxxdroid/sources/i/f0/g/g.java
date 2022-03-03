package i.f0.g;

import i.a0;
import i.e;
import i.f0.f.c;
import i.i;
import i.p;
import i.t;
import i.y;
import java.util.List;

public final class g implements t.a {
    private final List<t> a;

    /* renamed from: b  reason: collision with root package name */
    private final i.f0.f.g f8896b;

    /* renamed from: c  reason: collision with root package name */
    private final c f8897c;

    /* renamed from: d  reason: collision with root package name */
    private final c f8898d;

    /* renamed from: e  reason: collision with root package name */
    private final int f8899e;

    /* renamed from: f  reason: collision with root package name */
    private final y f8900f;

    /* renamed from: g  reason: collision with root package name */
    private final e f8901g;

    /* renamed from: h  reason: collision with root package name */
    private final p f8902h;

    /* renamed from: i  reason: collision with root package name */
    private final int f8903i;

    /* renamed from: j  reason: collision with root package name */
    private final int f8904j;

    /* renamed from: k  reason: collision with root package name */
    private final int f8905k;

    /* renamed from: l  reason: collision with root package name */
    private int f8906l;

    public g(List<t> list, i.f0.f.g gVar, c cVar, c cVar2, int i2, y yVar, e eVar, p pVar, int i3, int i4, int i5) {
        this.a = list;
        this.f8898d = cVar2;
        this.f8896b = gVar;
        this.f8897c = cVar;
        this.f8899e = i2;
        this.f8900f = yVar;
        this.f8901g = eVar;
        this.f8902h = pVar;
        this.f8903i = i3;
        this.f8904j = i4;
        this.f8905k = i5;
    }

    @Override // i.t.a
    public int a() {
        return this.f8903i;
    }

    @Override // i.t.a
    public a0 a(y yVar) {
        return a(yVar, this.f8896b, this.f8897c, this.f8898d);
    }

    public a0 a(y yVar, i.f0.f.g gVar, c cVar, c cVar2) {
        if (this.f8899e < this.a.size()) {
            this.f8906l++;
            if (this.f8897c != null && !this.f8898d.a(yVar.g())) {
                throw new IllegalStateException("network interceptor " + this.a.get(this.f8899e - 1) + " must retain the same host and port");
            } else if (this.f8897c == null || this.f8906l <= 1) {
                g gVar2 = new g(this.a, gVar, cVar, cVar2, this.f8899e + 1, yVar, this.f8901g, this.f8902h, this.f8903i, this.f8904j, this.f8905k);
                t tVar = this.a.get(this.f8899e);
                a0 a2 = tVar.a(gVar2);
                if (cVar != null && this.f8899e + 1 < this.a.size() && gVar2.f8906l != 1) {
                    throw new IllegalStateException("network interceptor " + tVar + " must call proceed() exactly once");
                } else if (a2 == null) {
                    throw new NullPointerException("interceptor " + tVar + " returned null");
                } else if (a2.l() != null) {
                    return a2;
                } else {
                    throw new IllegalStateException("interceptor " + tVar + " returned a response with no body");
                }
            } else {
                throw new IllegalStateException("network interceptor " + this.a.get(this.f8899e - 1) + " must call proceed() exactly once");
            }
        } else {
            throw new AssertionError();
        }
    }

    @Override // i.t.a
    public int b() {
        return this.f8904j;
    }

    @Override // i.t.a
    public int c() {
        return this.f8905k;
    }

    @Override // i.t.a
    public y d() {
        return this.f8900f;
    }

    public e e() {
        return this.f8901g;
    }

    public i f() {
        return this.f8898d;
    }

    public p g() {
        return this.f8902h;
    }

    public c h() {
        return this.f8897c;
    }

    public i.f0.f.g i() {
        return this.f8896b;
    }
}
