package c.f.a.m;

import c.f.a.c;
import c.f.a.i;
import c.f.a.m.m.o;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class d {
    private HashSet<d> a = null;

    /* renamed from: b  reason: collision with root package name */
    private int f2110b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f2111c;

    /* renamed from: d  reason: collision with root package name */
    public final e f2112d;

    /* renamed from: e  reason: collision with root package name */
    public final b f2113e;

    /* renamed from: f  reason: collision with root package name */
    public d f2114f;

    /* renamed from: g  reason: collision with root package name */
    public int f2115g = 0;

    /* renamed from: h  reason: collision with root package name */
    int f2116h = Integer.MIN_VALUE;

    /* renamed from: i  reason: collision with root package name */
    i f2117i;

    /* access modifiers changed from: package-private */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a = new int[b.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|20) */
        /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0056 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0062 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
            // Method dump skipped, instructions count: 111
            */
            throw new UnsupportedOperationException("Method not decompiled: c.f.a.m.d.a.<clinit>():void");
        }
    }

    public enum b {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public d(e eVar, b bVar) {
        this.f2112d = eVar;
        this.f2113e = bVar;
    }

    public HashSet<d> a() {
        return this.a;
    }

    public void a(int i2) {
        this.f2110b = i2;
        this.f2111c = true;
    }

    public void a(int i2, ArrayList<o> arrayList, o oVar) {
        HashSet<d> hashSet = this.a;
        if (hashSet != null) {
            Iterator<d> it = hashSet.iterator();
            while (it.hasNext()) {
                c.f.a.m.m.i.a(it.next().f2112d, i2, arrayList, oVar);
            }
        }
    }

    public void a(c cVar) {
        i iVar = this.f2117i;
        if (iVar == null) {
            this.f2117i = new i(i.a.UNRESTRICTED, null);
        } else {
            iVar.a();
        }
    }

    public boolean a(d dVar) {
        if (dVar == null) {
            return false;
        }
        b h2 = dVar.h();
        b bVar = this.f2113e;
        if (h2 == bVar) {
            return bVar != b.BASELINE || (dVar.e().F() && e().F());
        }
        switch (a.a[bVar.ordinal()]) {
            case 1:
                return (h2 == b.BASELINE || h2 == b.CENTER_X || h2 == b.CENTER_Y) ? false : true;
            case 2:
            case 3:
                boolean z = h2 == b.LEFT || h2 == b.RIGHT;
                return dVar.e() instanceof g ? z || h2 == b.CENTER_X : z;
            case 4:
            case 5:
                boolean z2 = h2 == b.TOP || h2 == b.BOTTOM;
                return dVar.e() instanceof g ? z2 || h2 == b.CENTER_Y : z2;
            case 6:
                return (h2 == b.LEFT || h2 == b.RIGHT) ? false : true;
            case 7:
            case 8:
            case 9:
                return false;
            default:
                throw new AssertionError(this.f2113e.name());
        }
    }

    public boolean a(d dVar, int i2, int i3, boolean z) {
        if (dVar == null) {
            m();
            return true;
        } else if (!z && !a(dVar)) {
            return false;
        } else {
            this.f2114f = dVar;
            d dVar2 = this.f2114f;
            if (dVar2.a == null) {
                dVar2.a = new HashSet<>();
            }
            HashSet<d> hashSet = this.f2114f.a;
            if (hashSet != null) {
                hashSet.add(this);
            }
            this.f2115g = i2;
            this.f2116h = i3;
            return true;
        }
    }

    public int b() {
        if (!this.f2111c) {
            return 0;
        }
        return this.f2110b;
    }

    public int c() {
        d dVar;
        if (this.f2112d.B() == 8) {
            return 0;
        }
        return (this.f2116h == Integer.MIN_VALUE || (dVar = this.f2114f) == null || dVar.f2112d.B() != 8) ? this.f2115g : this.f2116h;
    }

    public final d d() {
        switch (a.a[this.f2113e.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
            case 2:
                return this.f2112d.M;
            case 3:
                return this.f2112d.K;
            case 4:
                return this.f2112d.N;
            case 5:
                return this.f2112d.L;
            default:
                throw new AssertionError(this.f2113e.name());
        }
    }

    public e e() {
        return this.f2112d;
    }

    public i f() {
        return this.f2117i;
    }

    public d g() {
        return this.f2114f;
    }

    public b h() {
        return this.f2113e;
    }

    public boolean i() {
        HashSet<d> hashSet = this.a;
        if (hashSet == null) {
            return false;
        }
        Iterator<d> it = hashSet.iterator();
        while (it.hasNext()) {
            if (it.next().d().l()) {
                return true;
            }
        }
        return false;
    }

    public boolean j() {
        HashSet<d> hashSet = this.a;
        return hashSet != null && hashSet.size() > 0;
    }

    public boolean k() {
        return this.f2111c;
    }

    public boolean l() {
        return this.f2114f != null;
    }

    public void m() {
        HashSet<d> hashSet;
        d dVar = this.f2114f;
        if (!(dVar == null || (hashSet = dVar.a) == null)) {
            hashSet.remove(this);
            if (this.f2114f.a.size() == 0) {
                this.f2114f.a = null;
            }
        }
        this.a = null;
        this.f2114f = null;
        this.f2115g = 0;
        this.f2116h = Integer.MIN_VALUE;
        this.f2111c = false;
        this.f2110b = 0;
    }

    public void n() {
        this.f2111c = false;
        this.f2110b = 0;
    }

    public String toString() {
        return this.f2112d.h() + ":" + this.f2113e.toString();
    }
}
