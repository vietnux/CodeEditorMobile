package androidx.fragment.app;

import android.view.ViewGroup;
import androidx.lifecycle.f;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

public abstract class y {
    ArrayList<a> a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    int f1377b;

    /* renamed from: c  reason: collision with root package name */
    int f1378c;

    /* renamed from: d  reason: collision with root package name */
    int f1379d;

    /* renamed from: e  reason: collision with root package name */
    int f1380e;

    /* renamed from: f  reason: collision with root package name */
    int f1381f;

    /* renamed from: g  reason: collision with root package name */
    boolean f1382g;

    /* renamed from: h  reason: collision with root package name */
    String f1383h;

    /* renamed from: i  reason: collision with root package name */
    int f1384i;

    /* renamed from: j  reason: collision with root package name */
    CharSequence f1385j;

    /* renamed from: k  reason: collision with root package name */
    int f1386k;

    /* renamed from: l  reason: collision with root package name */
    CharSequence f1387l;

    /* renamed from: m  reason: collision with root package name */
    ArrayList<String> f1388m;
    ArrayList<String> n;
    boolean o = false;
    ArrayList<Runnable> p;

    /* access modifiers changed from: package-private */
    public static final class a {
        int a;

        /* renamed from: b  reason: collision with root package name */
        Fragment f1389b;

        /* renamed from: c  reason: collision with root package name */
        int f1390c;

        /* renamed from: d  reason: collision with root package name */
        int f1391d;

        /* renamed from: e  reason: collision with root package name */
        int f1392e;

        /* renamed from: f  reason: collision with root package name */
        int f1393f;

        /* renamed from: g  reason: collision with root package name */
        f.c f1394g;

        /* renamed from: h  reason: collision with root package name */
        f.c f1395h;

        a() {
        }

        a(int i2, Fragment fragment) {
            this.a = i2;
            this.f1389b = fragment;
            f.c cVar = f.c.RESUMED;
            this.f1394g = cVar;
            this.f1395h = cVar;
        }

        a(int i2, Fragment fragment, f.c cVar) {
            this.a = i2;
            this.f1389b = fragment;
            this.f1394g = fragment.R;
            this.f1395h = cVar;
        }
    }

    y(j jVar, ClassLoader classLoader) {
    }

    public abstract int a();

    public y a(int i2, int i3, int i4, int i5) {
        this.f1377b = i2;
        this.f1378c = i3;
        this.f1379d = i4;
        this.f1380e = i5;
        return this;
    }

    public y a(int i2, Fragment fragment) {
        b(i2, fragment, null);
        return this;
    }

    public y a(int i2, Fragment fragment, String str) {
        a(i2, fragment, str, 1);
        return this;
    }

    /* access modifiers changed from: package-private */
    public y a(ViewGroup viewGroup, Fragment fragment, String str) {
        fragment.H = viewGroup;
        a(viewGroup.getId(), fragment, str);
        return this;
    }

    public y a(Fragment fragment) {
        a(new a(7, fragment));
        return this;
    }

    public y a(Fragment fragment, f.c cVar) {
        a(new a(10, fragment, cVar));
        return this;
    }

    public y a(Fragment fragment, String str) {
        a(0, fragment, str, 1);
        return this;
    }

    public y a(boolean z) {
        this.o = z;
        return this;
    }

    /* access modifiers changed from: package-private */
    public void a(int i2, Fragment fragment, String str, int i3) {
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str2 = fragment.z;
            if (str2 == null || str.equals(str2)) {
                fragment.z = str;
            } else {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.z + " now " + str);
            }
        }
        if (i2 != 0) {
            if (i2 != -1) {
                int i4 = fragment.x;
                if (i4 == 0 || i4 == i2) {
                    fragment.x = i2;
                    fragment.y = i2;
                } else {
                    throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.x + " now " + i2);
                }
            } else {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
        }
        a(new a(i3, fragment));
    }

    /* access modifiers changed from: package-private */
    public void a(a aVar) {
        this.a.add(aVar);
        aVar.f1390c = this.f1377b;
        aVar.f1391d = this.f1378c;
        aVar.f1392e = this.f1379d;
        aVar.f1393f = this.f1380e;
    }

    public abstract int b();

    public y b(int i2, Fragment fragment, String str) {
        if (i2 != 0) {
            a(i2, fragment, str, 2);
            return this;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }

    public y b(Fragment fragment) {
        a(new a(6, fragment));
        return this;
    }

    public y c(Fragment fragment) {
        a(new a(4, fragment));
        return this;
    }

    public abstract void c();

    public y d(Fragment fragment) {
        a(new a(3, fragment));
        return this;
    }

    public abstract void d();

    public y e() {
        if (!this.f1382g) {
            return this;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    public y e(Fragment fragment) {
        a(new a(5, fragment));
        return this;
    }
}
