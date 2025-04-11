package c.f.a.m.m;

import c.f.a.m.e;
import c.f.a.m.f;
import java.util.ArrayList;
import java.util.Iterator;

public class c extends p {

    /* renamed from: k  reason: collision with root package name */
    ArrayList<p> f2160k = new ArrayList<>();

    /* renamed from: l  reason: collision with root package name */
    private int f2161l;

    public c(e eVar, int i2) {
        super(eVar);
        this.f2207f = i2;
        g();
    }

    private void g() {
        e eVar = this.f2203b;
        do {
            eVar = eVar.e(this.f2207f);
        } while (eVar != null);
        this.f2203b = eVar;
        this.f2160k.add(eVar.f(this.f2207f));
        e d2 = eVar.d(this.f2207f);
        while (d2 != null) {
            this.f2160k.add(d2.f(this.f2207f));
            d2 = d2.d(this.f2207f);
        }
        Iterator<p> it = this.f2160k.iterator();
        while (it.hasNext()) {
            p next = it.next();
            int i2 = this.f2207f;
            if (i2 == 0) {
                next.f2203b.f2128b = this;
            } else if (i2 == 1) {
                next.f2203b.f2129c = this;
            }
        }
        if ((this.f2207f == 0 && ((f) this.f2203b.v()).f0()) && this.f2160k.size() > 1) {
            ArrayList<p> arrayList = this.f2160k;
            this.f2203b = arrayList.get(arrayList.size() - 1).f2203b;
        }
        this.f2161l = this.f2207f == 0 ? this.f2203b.m() : this.f2203b.y();
    }

    private e h() {
        for (int i2 = 0; i2 < this.f2160k.size(); i2++) {
            p pVar = this.f2160k.get(i2);
            if (pVar.f2203b.B() != 8) {
                return pVar.f2203b;
            }
        }
        return null;
    }

    private e i() {
        for (int size = this.f2160k.size() - 1; size >= 0; size--) {
            p pVar = this.f2160k.get(size);
            if (pVar.f2203b.B() != 8) {
                return pVar.f2203b;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006d, code lost:
        if (r1 != null) goto L_0x00a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a3, code lost:
        if (r1 != null) goto L_0x00a5;
     */
    @Override // c.f.a.m.m.p
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a() {
        /*
        // Method dump skipped, instructions count: 180
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.m.m.c.a():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00cd, code lost:
        if (r3.f2206e.f2177j != false) goto L_0x00cf;
     */
    @Override // c.f.a.m.m.p, c.f.a.m.m.d
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(c.f.a.m.m.d r23) {
        /*
        // Method dump skipped, instructions count: 979
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.m.m.c.a(c.f.a.m.m.d):void");
    }

    @Override // c.f.a.m.m.p
    public void b() {
        for (int i2 = 0; i2 < this.f2160k.size(); i2++) {
            this.f2160k.get(i2).b();
        }
    }

    /* access modifiers changed from: package-private */
    @Override // c.f.a.m.m.p
    public void c() {
        this.f2204c = null;
        Iterator<p> it = this.f2160k.iterator();
        while (it.hasNext()) {
            it.next().c();
        }
    }

    @Override // c.f.a.m.m.p
    public long d() {
        int size = this.f2160k.size();
        long j2 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            p pVar = this.f2160k.get(i2);
            j2 = j2 + ((long) pVar.f2209h.f2173f) + pVar.d() + ((long) pVar.f2210i.f2173f);
        }
        return j2;
    }

    /* access modifiers changed from: package-private */
    @Override // c.f.a.m.m.p
    public boolean f() {
        int size = this.f2160k.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (!this.f2160k.get(i2).f()) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.f2207f == 0 ? "horizontal : " : "vertical : ");
        Iterator<p> it = this.f2160k.iterator();
        while (it.hasNext()) {
            sb.append("<");
            sb.append(it.next());
            sb.append("> ");
        }
        return sb.toString();
    }
}
