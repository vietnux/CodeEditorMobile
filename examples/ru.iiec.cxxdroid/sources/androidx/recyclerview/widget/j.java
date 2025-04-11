package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import c.h.l.b0;
import c.h.l.c;
import c.h.l.l0.d;
import c.h.l.l0.e;
import java.util.Map;
import java.util.WeakHashMap;

public class j extends c {

    /* renamed from: d  reason: collision with root package name */
    final RecyclerView f1715d;

    /* renamed from: e  reason: collision with root package name */
    private final a f1716e;

    public static class a extends c {

        /* renamed from: d  reason: collision with root package name */
        final j f1717d;

        /* renamed from: e  reason: collision with root package name */
        private Map<View, c> f1718e = new WeakHashMap();

        public a(j jVar) {
            this.f1717d = jVar;
        }

        @Override // c.h.l.c
        public e a(View view) {
            c cVar = this.f1718e.get(view);
            return cVar != null ? cVar.a(view) : super.a(view);
        }

        @Override // c.h.l.c
        public void a(View view, int i2) {
            c cVar = this.f1718e.get(view);
            if (cVar != null) {
                cVar.a(view, i2);
            } else {
                super.a(view, i2);
            }
        }

        @Override // c.h.l.c
        public void a(View view, d dVar) {
            if (!this.f1717d.c() && this.f1717d.f1715d.getLayoutManager() != null) {
                this.f1717d.f1715d.getLayoutManager().a(view, dVar);
                c cVar = this.f1718e.get(view);
                if (cVar != null) {
                    cVar.a(view, dVar);
                    return;
                }
            }
            super.a(view, dVar);
        }

        @Override // c.h.l.c
        public boolean a(View view, int i2, Bundle bundle) {
            if (this.f1717d.c() || this.f1717d.f1715d.getLayoutManager() == null) {
                return super.a(view, i2, bundle);
            }
            c cVar = this.f1718e.get(view);
            if (cVar != null) {
                if (cVar.a(view, i2, bundle)) {
                    return true;
                }
            } else if (super.a(view, i2, bundle)) {
                return true;
            }
            return this.f1717d.f1715d.getLayoutManager().a(view, i2, bundle);
        }

        @Override // c.h.l.c
        public boolean a(View view, AccessibilityEvent accessibilityEvent) {
            c cVar = this.f1718e.get(view);
            return cVar != null ? cVar.a(view, accessibilityEvent) : super.a(view, accessibilityEvent);
        }

        @Override // c.h.l.c
        public boolean a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            c cVar = this.f1718e.get(viewGroup);
            return cVar != null ? cVar.a(viewGroup, view, accessibilityEvent) : super.a(viewGroup, view, accessibilityEvent);
        }

        @Override // c.h.l.c
        public void b(View view, AccessibilityEvent accessibilityEvent) {
            c cVar = this.f1718e.get(view);
            if (cVar != null) {
                cVar.b(view, accessibilityEvent);
            } else {
                super.b(view, accessibilityEvent);
            }
        }

        /* access modifiers changed from: package-private */
        public c c(View view) {
            return this.f1718e.remove(view);
        }

        @Override // c.h.l.c
        public void c(View view, AccessibilityEvent accessibilityEvent) {
            c cVar = this.f1718e.get(view);
            if (cVar != null) {
                cVar.c(view, accessibilityEvent);
            } else {
                super.c(view, accessibilityEvent);
            }
        }

        /* access modifiers changed from: package-private */
        public void d(View view) {
            c c2 = b0.c(view);
            if (c2 != null && c2 != this) {
                this.f1718e.put(view, c2);
            }
        }

        @Override // c.h.l.c
        public void d(View view, AccessibilityEvent accessibilityEvent) {
            c cVar = this.f1718e.get(view);
            if (cVar != null) {
                cVar.d(view, accessibilityEvent);
            } else {
                super.d(view, accessibilityEvent);
            }
        }
    }

    public j(RecyclerView recyclerView) {
        this.f1715d = recyclerView;
        c b2 = b();
        this.f1716e = (b2 == null || !(b2 instanceof a)) ? new a(this) : (a) b2;
    }

    @Override // c.h.l.c
    public void a(View view, d dVar) {
        super.a(view, dVar);
        if (!c() && this.f1715d.getLayoutManager() != null) {
            this.f1715d.getLayoutManager().a(dVar);
        }
    }

    @Override // c.h.l.c
    public boolean a(View view, int i2, Bundle bundle) {
        if (super.a(view, i2, bundle)) {
            return true;
        }
        if (c() || this.f1715d.getLayoutManager() == null) {
            return false;
        }
        return this.f1715d.getLayoutManager().a(i2, bundle);
    }

    public c b() {
        return this.f1716e;
    }

    @Override // c.h.l.c
    public void b(View view, AccessibilityEvent accessibilityEvent) {
        super.b(view, accessibilityEvent);
        if ((view instanceof RecyclerView) && !c()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().a(accessibilityEvent);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean c() {
        return this.f1715d.j();
    }
}
