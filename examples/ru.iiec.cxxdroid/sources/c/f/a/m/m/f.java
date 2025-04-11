package c.f.a.m.m;

import java.util.ArrayList;
import java.util.List;

public class f implements d {
    public d a = null;

    /* renamed from: b  reason: collision with root package name */
    public boolean f2169b = false;

    /* renamed from: c  reason: collision with root package name */
    public boolean f2170c = false;

    /* renamed from: d  reason: collision with root package name */
    p f2171d;

    /* renamed from: e  reason: collision with root package name */
    a f2172e = a.UNKNOWN;

    /* renamed from: f  reason: collision with root package name */
    int f2173f;

    /* renamed from: g  reason: collision with root package name */
    public int f2174g;

    /* renamed from: h  reason: collision with root package name */
    int f2175h = 1;

    /* renamed from: i  reason: collision with root package name */
    g f2176i = null;

    /* renamed from: j  reason: collision with root package name */
    public boolean f2177j = false;

    /* renamed from: k  reason: collision with root package name */
    List<d> f2178k = new ArrayList();

    /* renamed from: l  reason: collision with root package name */
    List<f> f2179l = new ArrayList();

    enum a {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public f(p pVar) {
        this.f2171d = pVar;
    }

    public void a() {
        this.f2179l.clear();
        this.f2178k.clear();
        this.f2177j = false;
        this.f2174g = 0;
        this.f2170c = false;
        this.f2169b = false;
    }

    public void a(int i2) {
        if (!this.f2177j) {
            this.f2177j = true;
            this.f2174g = i2;
            for (d dVar : this.f2178k) {
                dVar.a(dVar);
            }
        }
    }

    @Override // c.f.a.m.m.d
    public void a(d dVar) {
        for (f fVar : this.f2179l) {
            if (!fVar.f2177j) {
                return;
            }
        }
        this.f2170c = true;
        d dVar2 = this.a;
        if (dVar2 != null) {
            dVar2.a(this);
        }
        if (this.f2169b) {
            this.f2171d.a(this);
            return;
        }
        f fVar2 = null;
        int i2 = 0;
        for (f fVar3 : this.f2179l) {
            if (!(fVar3 instanceof g)) {
                i2++;
                fVar2 = fVar3;
            }
        }
        if (fVar2 != null && i2 == 1 && fVar2.f2177j) {
            g gVar = this.f2176i;
            if (gVar != null) {
                if (gVar.f2177j) {
                    this.f2173f = this.f2175h * gVar.f2174g;
                } else {
                    return;
                }
            }
            a(fVar2.f2174g + this.f2173f);
        }
        d dVar3 = this.a;
        if (dVar3 != null) {
            dVar3.a(this);
        }
    }

    public void b(d dVar) {
        this.f2178k.add(dVar);
        if (this.f2177j) {
            dVar.a(dVar);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f2171d.f2203b.h());
        sb.append(":");
        sb.append(this.f2172e);
        sb.append("(");
        sb.append(this.f2177j ? Integer.valueOf(this.f2174g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f2179l.size());
        sb.append(":d=");
        sb.append(this.f2178k.size());
        sb.append(">");
        return sb.toString();
    }
}
