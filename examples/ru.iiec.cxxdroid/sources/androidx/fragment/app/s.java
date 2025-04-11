package androidx.fragment.app;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.f;
import androidx.viewpager.widget.a;

@Deprecated
public abstract class s extends a {

    /* renamed from: b  reason: collision with root package name */
    private final n f1353b;

    /* renamed from: c  reason: collision with root package name */
    private final int f1354c;

    /* renamed from: d  reason: collision with root package name */
    private y f1355d;

    /* renamed from: e  reason: collision with root package name */
    private Fragment f1356e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f1357f;

    @Deprecated
    public s(n nVar) {
        this(nVar, 0);
    }

    public s(n nVar, int i2) {
        this.f1355d = null;
        this.f1356e = null;
        this.f1353b = nVar;
        this.f1354c = i2;
    }

    private static String a(int i2, long j2) {
        return "android:switcher:" + i2 + ":" + j2;
    }

    @Override // androidx.viewpager.widget.a
    public Object a(ViewGroup viewGroup, int i2) {
        if (this.f1355d == null) {
            this.f1355d = this.f1353b.b();
        }
        long d2 = d(i2);
        Fragment c2 = this.f1353b.c(a(viewGroup.getId(), d2));
        if (c2 != null) {
            this.f1355d.a(c2);
        } else {
            c2 = c(i2);
            this.f1355d.a(viewGroup.getId(), c2, a(viewGroup.getId(), d2));
        }
        if (c2 != this.f1356e) {
            c2.i(false);
            if (this.f1354c == 1) {
                this.f1355d.a(c2, f.c.STARTED);
            } else {
                c2.k(false);
            }
        }
        return c2;
    }

    @Override // androidx.viewpager.widget.a
    public void a(Parcelable parcelable, ClassLoader classLoader) {
    }

    /* JADX INFO: finally extract failed */
    @Override // androidx.viewpager.widget.a
    public void a(ViewGroup viewGroup) {
        y yVar = this.f1355d;
        if (yVar != null) {
            if (!this.f1357f) {
                try {
                    this.f1357f = true;
                    yVar.d();
                    this.f1357f = false;
                } catch (Throwable th) {
                    this.f1357f = false;
                    throw th;
                }
            }
            this.f1355d = null;
        }
    }

    @Override // androidx.viewpager.widget.a
    public void a(ViewGroup viewGroup, int i2, Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.f1355d == null) {
            this.f1355d = this.f1353b.b();
        }
        this.f1355d.b(fragment);
        if (fragment.equals(this.f1356e)) {
            this.f1356e = null;
        }
    }

    @Override // androidx.viewpager.widget.a
    public boolean a(View view, Object obj) {
        return ((Fragment) obj).L() == view;
    }

    @Override // androidx.viewpager.widget.a
    public Parcelable b() {
        return null;
    }

    @Override // androidx.viewpager.widget.a
    public void b(ViewGroup viewGroup) {
        if (viewGroup.getId() == -1) {
            throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
        }
    }

    @Override // androidx.viewpager.widget.a
    public void b(ViewGroup viewGroup, int i2, Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.f1356e;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.i(false);
                if (this.f1354c == 1) {
                    if (this.f1355d == null) {
                        this.f1355d = this.f1353b.b();
                    }
                    this.f1355d.a(this.f1356e, f.c.STARTED);
                } else {
                    this.f1356e.k(false);
                }
            }
            fragment.i(true);
            if (this.f1354c == 1) {
                if (this.f1355d == null) {
                    this.f1355d = this.f1353b.b();
                }
                this.f1355d.a(fragment, f.c.RESUMED);
            } else {
                fragment.k(true);
            }
            this.f1356e = fragment;
        }
    }

    public abstract Fragment c(int i2);

    public long d(int i2) {
        return (long) i2;
    }
}
