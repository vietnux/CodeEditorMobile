package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.n;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* access modifiers changed from: package-private */
public class m {
    private final CopyOnWriteArrayList<a> a = new CopyOnWriteArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    private final n f1310b;

    /* access modifiers changed from: private */
    public static final class a {
        final n.m a;

        /* renamed from: b  reason: collision with root package name */
        final boolean f1311b;
    }

    m(n nVar) {
        this.f1310b = nVar;
    }

    /* access modifiers changed from: package-private */
    public void a(Fragment fragment, Bundle bundle, boolean z) {
        Fragment y = this.f1310b.y();
        if (y != null) {
            y.y().x().a(fragment, bundle, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.f1311b) {
                next.a.a(this.f1310b, fragment, bundle);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(Fragment fragment, View view, Bundle bundle, boolean z) {
        Fragment y = this.f1310b.y();
        if (y != null) {
            y.y().x().a(fragment, view, bundle, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.f1311b) {
                next.a.a(this.f1310b, fragment, view, bundle);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(Fragment fragment, boolean z) {
        Context g2 = this.f1310b.v().g();
        Fragment y = this.f1310b.y();
        if (y != null) {
            y.y().x().a(fragment, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.f1311b) {
                next.a.a(this.f1310b, fragment, g2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void b(Fragment fragment, Bundle bundle, boolean z) {
        Fragment y = this.f1310b.y();
        if (y != null) {
            y.y().x().b(fragment, bundle, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.f1311b) {
                next.a.b(this.f1310b, fragment, bundle);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void b(Fragment fragment, boolean z) {
        Fragment y = this.f1310b.y();
        if (y != null) {
            y.y().x().b(fragment, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.f1311b) {
                next.a.a(this.f1310b, fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void c(Fragment fragment, Bundle bundle, boolean z) {
        Fragment y = this.f1310b.y();
        if (y != null) {
            y.y().x().c(fragment, bundle, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.f1311b) {
                next.a.c(this.f1310b, fragment, bundle);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void c(Fragment fragment, boolean z) {
        Fragment y = this.f1310b.y();
        if (y != null) {
            y.y().x().c(fragment, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.f1311b) {
                next.a.b(this.f1310b, fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void d(Fragment fragment, Bundle bundle, boolean z) {
        Fragment y = this.f1310b.y();
        if (y != null) {
            y.y().x().d(fragment, bundle, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.f1311b) {
                next.a.d(this.f1310b, fragment, bundle);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void d(Fragment fragment, boolean z) {
        Fragment y = this.f1310b.y();
        if (y != null) {
            y.y().x().d(fragment, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.f1311b) {
                next.a.c(this.f1310b, fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void e(Fragment fragment, boolean z) {
        Context g2 = this.f1310b.v().g();
        Fragment y = this.f1310b.y();
        if (y != null) {
            y.y().x().e(fragment, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.f1311b) {
                next.a.b(this.f1310b, fragment, g2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void f(Fragment fragment, boolean z) {
        Fragment y = this.f1310b.y();
        if (y != null) {
            y.y().x().f(fragment, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.f1311b) {
                next.a.d(this.f1310b, fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void g(Fragment fragment, boolean z) {
        Fragment y = this.f1310b.y();
        if (y != null) {
            y.y().x().g(fragment, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.f1311b) {
                next.a.e(this.f1310b, fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void h(Fragment fragment, boolean z) {
        Fragment y = this.f1310b.y();
        if (y != null) {
            y.y().x().h(fragment, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.f1311b) {
                next.a.f(this.f1310b, fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void i(Fragment fragment, boolean z) {
        Fragment y = this.f1310b.y();
        if (y != null) {
            y.y().x().i(fragment, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.f1311b) {
                next.a.g(this.f1310b, fragment);
            }
        }
    }
}
