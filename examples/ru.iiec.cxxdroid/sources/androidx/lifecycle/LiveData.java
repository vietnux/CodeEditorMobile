package androidx.lifecycle;

import androidx.lifecycle.f;
import java.util.Map;

public abstract class LiveData<T> {

    /* renamed from: j  reason: collision with root package name */
    static final Object f1438j = new Object();
    final Object a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private c.b.a.b.b<o<? super T>, LiveData<T>.c> f1439b = new c.b.a.b.b<>();

    /* renamed from: c  reason: collision with root package name */
    int f1440c = 0;

    /* renamed from: d  reason: collision with root package name */
    private boolean f1441d;

    /* renamed from: e  reason: collision with root package name */
    private volatile Object f1442e;

    /* renamed from: f  reason: collision with root package name */
    volatile Object f1443f = f1438j;

    /* renamed from: g  reason: collision with root package name */
    private int f1444g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f1445h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f1446i;

    class LifecycleBoundObserver extends LiveData<T>.c implements g {

        /* renamed from: e  reason: collision with root package name */
        final i f1447e;

        LifecycleBoundObserver(i iVar, o<? super T> oVar) {
            super(oVar);
            this.f1447e = iVar;
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.lifecycle.LiveData.c
        public void a() {
            this.f1447e.a().b(this);
        }

        @Override // androidx.lifecycle.g
        public void a(i iVar, f.b bVar) {
            f.c a = this.f1447e.a().a();
            if (a == f.c.DESTROYED) {
                LiveData.this.b(this.a);
                return;
            }
            f.c cVar = null;
            while (cVar != a) {
                a(b());
                cVar = a;
                a = this.f1447e.a().a();
            }
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.lifecycle.LiveData.c
        public boolean a(i iVar) {
            return this.f1447e == iVar;
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.lifecycle.LiveData.c
        public boolean b() {
            return this.f1447e.a().a().a(f.c.STARTED);
        }
    }

    class a implements Runnable {
        a() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: androidx.lifecycle.LiveData */
        /* JADX WARN: Multi-variable type inference failed */
        public void run() {
            Object obj;
            synchronized (LiveData.this.a) {
                obj = LiveData.this.f1443f;
                LiveData.this.f1443f = LiveData.f1438j;
            }
            LiveData.this.a(obj);
        }
    }

    private class b extends LiveData<T>.c {
        b(LiveData liveData, o<? super T> oVar) {
            super(oVar);
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.lifecycle.LiveData.c
        public boolean b() {
            return true;
        }
    }

    /* access modifiers changed from: private */
    public abstract class c {
        final o<? super T> a;

        /* renamed from: b  reason: collision with root package name */
        boolean f1450b;

        /* renamed from: c  reason: collision with root package name */
        int f1451c = -1;

        c(o<? super T> oVar) {
            this.a = oVar;
        }

        /* access modifiers changed from: package-private */
        public void a() {
        }

        /* access modifiers changed from: package-private */
        public void a(boolean z) {
            if (z != this.f1450b) {
                this.f1450b = z;
                LiveData.this.a(this.f1450b ? 1 : -1);
                if (this.f1450b) {
                    LiveData.this.a((LiveData<T>.c) this);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public boolean a(i iVar) {
            return false;
        }

        /* access modifiers changed from: package-private */
        public abstract boolean b();
    }

    public LiveData() {
        new a();
        this.f1442e = f1438j;
        this.f1444g = -1;
    }

    static void a(String str) {
        if (!c.b.a.a.a.b().a()) {
            throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
        }
    }

    private void b(LiveData<T>.c cVar) {
        if (cVar.f1450b) {
            if (!cVar.b()) {
                cVar.a(false);
                return;
            }
            int i2 = cVar.f1451c;
            int i3 = this.f1444g;
            if (i2 < i3) {
                cVar.f1451c = i3;
                cVar.a.a((Object) this.f1442e);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void a() {
    }

    /* access modifiers changed from: package-private */
    public void a(int i2) {
        int i3 = this.f1440c;
        this.f1440c = i2 + i3;
        if (!this.f1441d) {
            this.f1441d = true;
            while (i3 != this.f1440c) {
                try {
                    boolean z = i3 == 0 && this.f1440c > 0;
                    boolean z2 = i3 > 0 && this.f1440c == 0;
                    int i4 = this.f1440c;
                    if (z) {
                        a();
                    } else if (z2) {
                        b();
                    }
                    i3 = i4;
                } finally {
                    this.f1441d = false;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(LiveData<T>.c cVar) {
        if (this.f1445h) {
            this.f1446i = true;
            return;
        }
        this.f1445h = true;
        do {
            this.f1446i = false;
            if (cVar == null) {
                c.b.a.b.b<K, V>.d c2 = this.f1439b.c();
                while (c2.hasNext()) {
                    b((c) ((Map.Entry) c2.next()).getValue());
                    if (this.f1446i) {
                        break;
                    }
                }
            } else {
                b(cVar);
                cVar = null;
            }
        } while (this.f1446i);
        this.f1445h = false;
    }

    public void a(i iVar, o<? super T> oVar) {
        a("observe");
        if (iVar.a().a() != f.c.DESTROYED) {
            LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(iVar, oVar);
            LiveData<T>.c b2 = this.f1439b.b(oVar, lifecycleBoundObserver);
            if (b2 != null && !b2.a(iVar)) {
                throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
            } else if (b2 == null) {
                iVar.a().a(lifecycleBoundObserver);
            }
        }
    }

    public void a(o<? super T> oVar) {
        a("observeForever");
        b bVar = new b(this, oVar);
        LiveData<T>.c b2 = this.f1439b.b(oVar, bVar);
        if (b2 instanceof LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        } else if (b2 == null) {
            bVar.a(true);
        }
    }

    /* access modifiers changed from: protected */
    public void a(T t) {
        a("setValue");
        this.f1444g++;
        this.f1442e = t;
        a((LiveData<T>.c) null);
    }

    /* access modifiers changed from: protected */
    public void b() {
    }

    public void b(o<? super T> oVar) {
        a("removeObserver");
        LiveData<T>.c remove = this.f1439b.remove(oVar);
        if (remove != null) {
            remove.a();
            remove.a(false);
        }
    }
}
