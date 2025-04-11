package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import c.h.h.b;
import c.h.l.b0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* access modifiers changed from: package-private */
public abstract class e0 {
    private final ViewGroup a;

    /* renamed from: b  reason: collision with root package name */
    final ArrayList<e> f1260b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    final ArrayList<e> f1261c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    boolean f1262d = false;

    /* renamed from: e  reason: collision with root package name */
    boolean f1263e = false;

    /* access modifiers changed from: package-private */
    public class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f1264b;

        a(d dVar) {
            this.f1264b = dVar;
        }

        public void run() {
            if (e0.this.f1260b.contains(this.f1264b)) {
                this.f1264b.c().a(this.f1264b.d().I);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f1266b;

        b(d dVar) {
            this.f1266b = dVar;
        }

        public void run() {
            e0.this.f1260b.remove(this.f1266b);
            e0.this.f1261c.remove(this.f1266b);
        }
    }

    /* access modifiers changed from: package-private */
    public static /* synthetic */ class c {
        static final /* synthetic */ int[] a = new int[e.c.values().length];

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f1268b = new int[e.b.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|16|17|18|(3:19|20|22)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x003d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0047 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0051 */
        static {
            /*
                androidx.fragment.app.e0$e$b[] r0 = androidx.fragment.app.e0.e.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.fragment.app.e0.c.f1268b = r0
                r0 = 1
                int[] r1 = androidx.fragment.app.e0.c.f1268b     // Catch:{ NoSuchFieldError -> 0x0014 }
                androidx.fragment.app.e0$e$b r2 = androidx.fragment.app.e0.e.b.ADDING     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                r1 = 2
                int[] r2 = androidx.fragment.app.e0.c.f1268b     // Catch:{ NoSuchFieldError -> 0x001f }
                androidx.fragment.app.e0$e$b r3 = androidx.fragment.app.e0.e.b.REMOVING     // Catch:{ NoSuchFieldError -> 0x001f }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                r2 = 3
                int[] r3 = androidx.fragment.app.e0.c.f1268b     // Catch:{ NoSuchFieldError -> 0x002a }
                androidx.fragment.app.e0$e$b r4 = androidx.fragment.app.e0.e.b.NONE     // Catch:{ NoSuchFieldError -> 0x002a }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                androidx.fragment.app.e0$e$c[] r3 = androidx.fragment.app.e0.e.c.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                androidx.fragment.app.e0.c.a = r3
                int[] r3 = androidx.fragment.app.e0.c.a     // Catch:{ NoSuchFieldError -> 0x003d }
                androidx.fragment.app.e0$e$c r4 = androidx.fragment.app.e0.e.c.REMOVED     // Catch:{ NoSuchFieldError -> 0x003d }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r3[r4] = r0     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                int[] r0 = androidx.fragment.app.e0.c.a     // Catch:{ NoSuchFieldError -> 0x0047 }
                androidx.fragment.app.e0$e$c r3 = androidx.fragment.app.e0.e.c.VISIBLE     // Catch:{ NoSuchFieldError -> 0x0047 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0047 }
                r0[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0047 }
            L_0x0047:
                int[] r0 = androidx.fragment.app.e0.c.a     // Catch:{ NoSuchFieldError -> 0x0051 }
                androidx.fragment.app.e0$e$c r1 = androidx.fragment.app.e0.e.c.GONE     // Catch:{ NoSuchFieldError -> 0x0051 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0051 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0051 }
            L_0x0051:
                int[] r0 = androidx.fragment.app.e0.c.a     // Catch:{ NoSuchFieldError -> 0x005c }
                androidx.fragment.app.e0$e$c r1 = androidx.fragment.app.e0.e.c.INVISIBLE     // Catch:{ NoSuchFieldError -> 0x005c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005c }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x005c }
            L_0x005c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.e0.c.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    public static class d extends e {

        /* renamed from: h  reason: collision with root package name */
        private final w f1269h;

        d(e.c cVar, e.b bVar, w wVar, c.h.h.b bVar2) {
            super(cVar, bVar, wVar.k(), bVar2);
            this.f1269h = wVar;
        }

        @Override // androidx.fragment.app.e0.e
        public void b() {
            super.b();
            this.f1269h.l();
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.fragment.app.e0.e
        public void h() {
            if (e() == e.b.ADDING) {
                Fragment k2 = this.f1269h.k();
                View findFocus = k2.I.findFocus();
                if (findFocus != null) {
                    k2.b(findFocus);
                    if (n.d(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + k2);
                    }
                }
                View t0 = d().t0();
                if (t0.getParent() == null) {
                    this.f1269h.b();
                    t0.setAlpha(0.0f);
                }
                if (t0.getAlpha() == 0.0f && t0.getVisibility() == 0) {
                    t0.setVisibility(4);
                }
                t0.setAlpha(k2.C());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static class e {
        private c a;

        /* renamed from: b  reason: collision with root package name */
        private b f1270b;

        /* renamed from: c  reason: collision with root package name */
        private final Fragment f1271c;

        /* renamed from: d  reason: collision with root package name */
        private final List<Runnable> f1272d = new ArrayList();

        /* renamed from: e  reason: collision with root package name */
        private final HashSet<c.h.h.b> f1273e = new HashSet<>();

        /* renamed from: f  reason: collision with root package name */
        private boolean f1274f = false;

        /* renamed from: g  reason: collision with root package name */
        private boolean f1275g = false;

        class a implements b.a {
            a() {
            }

            @Override // c.h.h.b.a
            public void a() {
                e.this.a();
            }
        }

        /* access modifiers changed from: package-private */
        public enum b {
            NONE,
            ADDING,
            REMOVING
        }

        /* access modifiers changed from: package-private */
        public enum c {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;

            static c a(int i2) {
                if (i2 == 0) {
                    return VISIBLE;
                }
                if (i2 == 4) {
                    return INVISIBLE;
                }
                if (i2 == 8) {
                    return GONE;
                }
                throw new IllegalArgumentException("Unknown visibility " + i2);
            }

            static c b(View view) {
                return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? INVISIBLE : a(view.getVisibility());
            }

            /* access modifiers changed from: package-private */
            public void a(View view) {
                int i2;
                int i3 = c.a[ordinal()];
                if (i3 != 1) {
                    if (i3 == 2) {
                        if (n.d(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                        }
                        i2 = 0;
                    } else if (i3 == 3) {
                        if (n.d(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                        }
                        i2 = 8;
                    } else if (i3 == 4) {
                        if (n.d(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                        }
                        view.setVisibility(4);
                        return;
                    } else {
                        return;
                    }
                    view.setVisibility(i2);
                    return;
                }
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    if (n.d(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                    }
                    viewGroup.removeView(view);
                }
            }
        }

        e(c cVar, b bVar, Fragment fragment, c.h.h.b bVar2) {
            this.a = cVar;
            this.f1270b = bVar;
            this.f1271c = fragment;
            bVar2.a(new a());
        }

        /* access modifiers changed from: package-private */
        public final void a() {
            if (!f()) {
                this.f1274f = true;
                if (this.f1273e.isEmpty()) {
                    b();
                    return;
                }
                Iterator it = new ArrayList(this.f1273e).iterator();
                while (it.hasNext()) {
                    ((c.h.h.b) it.next()).a();
                }
            }
        }

        /* access modifiers changed from: package-private */
        public final void a(c cVar, b bVar) {
            b bVar2;
            int i2 = c.f1268b[bVar.ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    if (n.d(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f1271c + " mFinalState = " + this.a + " -> REMOVED. mLifecycleImpact  = " + this.f1270b + " to REMOVING.");
                    }
                    this.a = c.REMOVED;
                    bVar2 = b.REMOVING;
                } else if (i2 == 3 && this.a != c.REMOVED) {
                    if (n.d(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f1271c + " mFinalState = " + this.a + " -> " + cVar + ". ");
                    }
                    this.a = cVar;
                    return;
                } else {
                    return;
                }
            } else if (this.a == c.REMOVED) {
                if (n.d(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f1271c + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.f1270b + " to ADDING.");
                }
                this.a = c.VISIBLE;
                bVar2 = b.ADDING;
            } else {
                return;
            }
            this.f1270b = bVar2;
        }

        public final void a(c.h.h.b bVar) {
            if (this.f1273e.remove(bVar) && this.f1273e.isEmpty()) {
                b();
            }
        }

        /* access modifiers changed from: package-private */
        public final void a(Runnable runnable) {
            this.f1272d.add(runnable);
        }

        public void b() {
            if (!this.f1275g) {
                if (n.d(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
                }
                this.f1275g = true;
                for (Runnable runnable : this.f1272d) {
                    runnable.run();
                }
            }
        }

        public final void b(c.h.h.b bVar) {
            h();
            this.f1273e.add(bVar);
        }

        public c c() {
            return this.a;
        }

        public final Fragment d() {
            return this.f1271c;
        }

        /* access modifiers changed from: package-private */
        public b e() {
            return this.f1270b;
        }

        /* access modifiers changed from: package-private */
        public final boolean f() {
            return this.f1274f;
        }

        /* access modifiers changed from: package-private */
        public final boolean g() {
            return this.f1275g;
        }

        /* access modifiers changed from: package-private */
        public void h() {
        }

        public String toString() {
            return "Operation " + "{" + Integer.toHexString(System.identityHashCode(this)) + "} " + "{" + "mFinalState = " + this.a + "} " + "{" + "mLifecycleImpact = " + this.f1270b + "} " + "{" + "mFragment = " + this.f1271c + "}";
        }
    }

    e0(ViewGroup viewGroup) {
        this.a = viewGroup;
    }

    private e a(Fragment fragment) {
        Iterator<e> it = this.f1260b.iterator();
        while (it.hasNext()) {
            e next = it.next();
            if (next.d().equals(fragment) && !next.f()) {
                return next;
            }
        }
        return null;
    }

    static e0 a(ViewGroup viewGroup, f0 f0Var) {
        Object tag = viewGroup.getTag(c.m.b.special_effects_controller_view_tag);
        if (tag instanceof e0) {
            return (e0) tag;
        }
        e0 a2 = f0Var.a(viewGroup);
        viewGroup.setTag(c.m.b.special_effects_controller_view_tag, a2);
        return a2;
    }

    static e0 a(ViewGroup viewGroup, n nVar) {
        return a(viewGroup, nVar.A());
    }

    private void a(e.c cVar, e.b bVar, w wVar) {
        synchronized (this.f1260b) {
            c.h.h.b bVar2 = new c.h.h.b();
            e a2 = a(wVar.k());
            if (a2 != null) {
                a2.a(cVar, bVar);
                return;
            }
            d dVar = new d(cVar, bVar, wVar, bVar2);
            this.f1260b.add(dVar);
            dVar.a(new a(dVar));
            dVar.a(new b(dVar));
        }
    }

    private e b(Fragment fragment) {
        Iterator<e> it = this.f1261c.iterator();
        while (it.hasNext()) {
            e next = it.next();
            if (next.d().equals(fragment) && !next.f()) {
                return next;
            }
        }
        return null;
    }

    private void f() {
        Iterator<e> it = this.f1260b.iterator();
        while (it.hasNext()) {
            e next = it.next();
            if (next.e() == e.b.ADDING) {
                next.a(e.c.a(next.d().t0().getVisibility()), e.b.NONE);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a() {
        if (!this.f1263e) {
            if (!b0.H(this.a)) {
                b();
                this.f1262d = false;
                return;
            }
            synchronized (this.f1260b) {
                if (!this.f1260b.isEmpty()) {
                    ArrayList arrayList = new ArrayList(this.f1261c);
                    this.f1261c.clear();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        e eVar = (e) it.next();
                        if (n.d(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + eVar);
                        }
                        eVar.a();
                        if (!eVar.g()) {
                            this.f1261c.add(eVar);
                        }
                    }
                    f();
                    ArrayList arrayList2 = new ArrayList(this.f1260b);
                    this.f1260b.clear();
                    this.f1261c.addAll(arrayList2);
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        ((e) it2.next()).h();
                    }
                    a(arrayList2, this.f1262d);
                    this.f1262d = false;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(e.c cVar, w wVar) {
        if (n.d(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + wVar.k());
        }
        a(cVar, e.b.ADDING, wVar);
    }

    /* access modifiers changed from: package-private */
    public void a(w wVar) {
        if (n.d(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + wVar.k());
        }
        a(e.c.GONE, e.b.NONE, wVar);
    }

    /* access modifiers changed from: package-private */
    public abstract void a(List<e> list, boolean z);

    /* access modifiers changed from: package-private */
    public void a(boolean z) {
        this.f1262d = z;
    }

    /* access modifiers changed from: package-private */
    public void b() {
        String str;
        String str2;
        boolean H = b0.H(this.a);
        synchronized (this.f1260b) {
            f();
            Iterator<e> it = this.f1260b.iterator();
            while (it.hasNext()) {
                it.next().h();
            }
            Iterator it2 = new ArrayList(this.f1261c).iterator();
            while (it2.hasNext()) {
                e eVar = (e) it2.next();
                if (n.d(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("SpecialEffectsController: ");
                    if (H) {
                        str2 = "";
                    } else {
                        str2 = "Container " + this.a + " is not attached to window. ";
                    }
                    sb.append(str2);
                    sb.append("Cancelling running operation ");
                    sb.append(eVar);
                    Log.v("FragmentManager", sb.toString());
                }
                eVar.a();
            }
            Iterator it3 = new ArrayList(this.f1260b).iterator();
            while (it3.hasNext()) {
                e eVar2 = (e) it3.next();
                if (n.d(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("SpecialEffectsController: ");
                    if (H) {
                        str = "";
                    } else {
                        str = "Container " + this.a + " is not attached to window. ";
                    }
                    sb2.append(str);
                    sb2.append("Cancelling pending operation ");
                    sb2.append(eVar2);
                    Log.v("FragmentManager", sb2.toString());
                }
                eVar2.a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void b(w wVar) {
        if (n.d(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + wVar.k());
        }
        a(e.c.REMOVED, e.b.REMOVING, wVar);
    }

    /* access modifiers changed from: package-private */
    public void c() {
        if (this.f1263e) {
            this.f1263e = false;
            a();
        }
    }

    /* access modifiers changed from: package-private */
    public void c(w wVar) {
        if (n.d(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + wVar.k());
        }
        a(e.c.VISIBLE, e.b.NONE, wVar);
    }

    public ViewGroup d() {
        return this.a;
    }

    /* access modifiers changed from: package-private */
    public e.b d(w wVar) {
        e a2 = a(wVar.k());
        e.b e2 = a2 != null ? a2.e() : null;
        e b2 = b(wVar.k());
        return (b2 == null || !(e2 == null || e2 == e.b.NONE)) ? e2 : b2.e();
    }

    /* access modifiers changed from: package-private */
    public void e() {
        synchronized (this.f1260b) {
            f();
            this.f1263e = false;
            int size = this.f1260b.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                e eVar = this.f1260b.get(size);
                e.c b2 = e.c.b(eVar.d().I);
                if (eVar.c() == e.c.VISIBLE && b2 != e.c.VISIBLE) {
                    this.f1263e = eVar.d().T();
                    break;
                }
                size--;
            }
        }
    }
}
