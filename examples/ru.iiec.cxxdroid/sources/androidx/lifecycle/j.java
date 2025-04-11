package androidx.lifecycle;

import android.annotation.SuppressLint;
import androidx.lifecycle.f;
import c.b.a.b.b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public class j extends f {
    private c.b.a.b.a<h, a> a;

    /* renamed from: b  reason: collision with root package name */
    private f.c f1467b;

    /* renamed from: c  reason: collision with root package name */
    private final WeakReference<i> f1468c;

    /* renamed from: d  reason: collision with root package name */
    private int f1469d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f1470e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f1471f;

    /* renamed from: g  reason: collision with root package name */
    private ArrayList<f.c> f1472g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f1473h;

    /* access modifiers changed from: package-private */
    public static class a {
        f.c a;

        /* renamed from: b  reason: collision with root package name */
        g f1474b;

        a(h hVar, f.c cVar) {
            this.f1474b = l.a(hVar);
            this.a = cVar;
        }

        /* access modifiers changed from: package-private */
        public void a(i iVar, f.b bVar) {
            f.c h2 = bVar.h();
            this.a = j.a(this.a, h2);
            this.f1474b.a(iVar, bVar);
            this.a = h2;
        }
    }

    public j(i iVar) {
        this(iVar, true);
    }

    private j(i iVar, boolean z) {
        this.a = new c.b.a.b.a<>();
        this.f1469d = 0;
        this.f1470e = false;
        this.f1471f = false;
        this.f1472g = new ArrayList<>();
        this.f1468c = new WeakReference<>(iVar);
        this.f1467b = f.c.INITIALIZED;
        this.f1473h = z;
    }

    static f.c a(f.c cVar, f.c cVar2) {
        return (cVar2 == null || cVar2.compareTo(cVar) >= 0) ? cVar : cVar2;
    }

    private void a(i iVar) {
        Iterator<Map.Entry<h, a>> a2 = this.a.a();
        while (a2.hasNext() && !this.f1471f) {
            Map.Entry<h, a> next = a2.next();
            a value = next.getValue();
            while (value.a.compareTo((Enum) this.f1467b) > 0 && !this.f1471f && this.a.contains(next.getKey())) {
                f.b a3 = f.b.a(value.a);
                if (a3 != null) {
                    d(a3.h());
                    value.a(iVar, a3);
                    c();
                } else {
                    throw new IllegalStateException("no event down from " + value.a);
                }
            }
        }
    }

    @SuppressLint({"RestrictedApi"})
    private void a(String str) {
        if (this.f1473h && !c.b.a.a.a.b().a()) {
            throw new IllegalStateException("Method " + str + " must be called on the main thread");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v3, resolved type: c.b.a.b.a<androidx.lifecycle.h, androidx.lifecycle.j$a> */
    /* JADX WARN: Multi-variable type inference failed */
    private void b(i iVar) {
        b<K, V>.d c2 = this.a.c();
        while (c2.hasNext() && !this.f1471f) {
            Map.Entry entry = (Map.Entry) c2.next();
            a aVar = (a) entry.getValue();
            while (aVar.a.compareTo((Enum) this.f1467b) < 0 && !this.f1471f && this.a.contains(entry.getKey())) {
                d(aVar.a);
                f.b b2 = f.b.b(aVar.a);
                if (b2 != null) {
                    aVar.a(iVar, b2);
                    c();
                } else {
                    throw new IllegalStateException("no event up from " + aVar.a);
                }
            }
        }
    }

    private boolean b() {
        if (this.a.size() == 0) {
            return true;
        }
        f.c cVar = this.a.b().getValue().a;
        f.c cVar2 = this.a.d().getValue().a;
        return cVar == cVar2 && this.f1467b == cVar2;
    }

    private f.c c(h hVar) {
        Map.Entry<h, a> b2 = this.a.b(hVar);
        f.c cVar = null;
        f.c cVar2 = b2 != null ? b2.getValue().a : null;
        if (!this.f1472g.isEmpty()) {
            ArrayList<f.c> arrayList = this.f1472g;
            cVar = arrayList.get(arrayList.size() - 1);
        }
        return a(a(this.f1467b, cVar2), cVar);
    }

    private void c() {
        ArrayList<f.c> arrayList = this.f1472g;
        arrayList.remove(arrayList.size() - 1);
    }

    private void c(f.c cVar) {
        if (this.f1467b != cVar) {
            this.f1467b = cVar;
            if (this.f1470e || this.f1469d != 0) {
                this.f1471f = true;
                return;
            }
            this.f1470e = true;
            d();
            this.f1470e = false;
        }
    }

    private void d() {
        i iVar = this.f1468c.get();
        if (iVar != null) {
            while (true) {
                boolean b2 = b();
                this.f1471f = false;
                if (!b2) {
                    if (this.f1467b.compareTo((Enum) this.a.b().getValue().a) < 0) {
                        a(iVar);
                    }
                    Map.Entry<h, a> d2 = this.a.d();
                    if (!this.f1471f && d2 != null && this.f1467b.compareTo((Enum) d2.getValue().a) > 0) {
                        b(iVar);
                    }
                } else {
                    return;
                }
            }
        } else {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
        }
    }

    private void d(f.c cVar) {
        this.f1472g.add(cVar);
    }

    @Override // androidx.lifecycle.f
    public f.c a() {
        return this.f1467b;
    }

    public void a(f.b bVar) {
        a("handleLifecycleEvent");
        c(bVar.h());
    }

    @Deprecated
    public void a(f.c cVar) {
        a("markState");
        b(cVar);
    }

    @Override // androidx.lifecycle.f
    public void a(h hVar) {
        i iVar;
        a("addObserver");
        f.c cVar = this.f1467b;
        f.c cVar2 = f.c.DESTROYED;
        if (cVar != cVar2) {
            cVar2 = f.c.INITIALIZED;
        }
        a aVar = new a(hVar, cVar2);
        if (this.a.b(hVar, aVar) == null && (iVar = this.f1468c.get()) != null) {
            boolean z = this.f1469d != 0 || this.f1470e;
            f.c c2 = c(hVar);
            this.f1469d++;
            while (aVar.a.compareTo((Enum) c2) < 0 && this.a.contains(hVar)) {
                d(aVar.a);
                f.b b2 = f.b.b(aVar.a);
                if (b2 != null) {
                    aVar.a(iVar, b2);
                    c();
                    c2 = c(hVar);
                } else {
                    throw new IllegalStateException("no event up from " + aVar.a);
                }
            }
            if (!z) {
                d();
            }
            this.f1469d--;
        }
    }

    public void b(f.c cVar) {
        a("setCurrentState");
        c(cVar);
    }

    @Override // androidx.lifecycle.f
    public void b(h hVar) {
        a("removeObserver");
        this.a.remove(hVar);
    }
}
