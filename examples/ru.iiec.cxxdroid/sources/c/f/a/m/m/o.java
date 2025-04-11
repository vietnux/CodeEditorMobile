package c.f.a.m.m;

import c.f.a.d;
import c.f.a.m.b;
import c.f.a.m.e;
import c.f.a.m.f;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

public class o {

    /* renamed from: f  reason: collision with root package name */
    static int f2198f;
    ArrayList<e> a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    int f2199b = -1;

    /* renamed from: c  reason: collision with root package name */
    int f2200c = 0;

    /* renamed from: d  reason: collision with root package name */
    ArrayList<a> f2201d = null;

    /* renamed from: e  reason: collision with root package name */
    private int f2202e = -1;

    /* access modifiers changed from: package-private */
    public class a {
        public a(o oVar, e eVar, d dVar, int i2) {
            new WeakReference(eVar);
            dVar.b(eVar.K);
            dVar.b(eVar.L);
            dVar.b(eVar.M);
            dVar.b(eVar.N);
            dVar.b(eVar.O);
        }
    }

    public o(int i2) {
        int i3 = f2198f;
        f2198f = i3 + 1;
        this.f2199b = i3;
        this.f2200c = i2;
    }

    private int a(d dVar, ArrayList<e> arrayList, int i2) {
        int b2;
        c.f.a.m.d dVar2;
        f fVar = (f) arrayList.get(0).v();
        dVar.f();
        fVar.a(dVar, false);
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            arrayList.get(i3).a(dVar, false);
        }
        if (i2 == 0 && fVar.E0 > 0) {
            b.a(fVar, dVar, arrayList, 0);
        }
        if (i2 == 1 && fVar.F0 > 0) {
            b.a(fVar, dVar, arrayList, 1);
        }
        try {
            dVar.e();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        this.f2201d = new ArrayList<>();
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            this.f2201d.add(new a(this, arrayList.get(i4), dVar, i2));
        }
        if (i2 == 0) {
            b2 = dVar.b(fVar.K);
            dVar2 = fVar.M;
        } else {
            b2 = dVar.b(fVar.L);
            dVar2 = fVar.N;
        }
        int b3 = dVar.b(dVar2);
        dVar.f();
        return b3 - b2;
    }

    private String c() {
        int i2 = this.f2200c;
        return i2 == 0 ? "Horizontal" : i2 == 1 ? "Vertical" : i2 == 2 ? "Both" : "Unknown";
    }

    public int a() {
        return this.f2199b;
    }

    public int a(d dVar, int i2) {
        if (this.a.size() == 0) {
            return 0;
        }
        return a(dVar, this.a, i2);
    }

    public void a(int i2) {
        this.f2200c = i2;
    }

    public void a(int i2, o oVar) {
        Iterator<e> it = this.a.iterator();
        while (it.hasNext()) {
            e next = it.next();
            oVar.a(next);
            int a2 = oVar.a();
            if (i2 == 0) {
                next.r0 = a2;
            } else {
                next.s0 = a2;
            }
        }
        this.f2202e = oVar.f2199b;
    }

    public void a(ArrayList<o> arrayList) {
        int size = this.a.size();
        if (this.f2202e != -1 && size > 0) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                o oVar = arrayList.get(i2);
                if (this.f2202e == oVar.f2199b) {
                    a(this.f2200c, oVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public void a(boolean z) {
    }

    public boolean a(e eVar) {
        if (this.a.contains(eVar)) {
            return false;
        }
        this.a.add(eVar);
        return true;
    }

    public int b() {
        return this.f2200c;
    }

    public String toString() {
        String str = c() + " [" + this.f2199b + "] <";
        Iterator<e> it = this.a.iterator();
        while (it.hasNext()) {
            str = str + " " + it.next().h();
        }
        return str + " >";
    }
}
