package c.h.l;

import android.view.View;
import android.view.ViewParent;

public class p {
    private ViewParent a;

    /* renamed from: b  reason: collision with root package name */
    private ViewParent f2454b;

    /* renamed from: c  reason: collision with root package name */
    private final View f2455c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f2456d;

    /* renamed from: e  reason: collision with root package name */
    private int[] f2457e;

    public p(View view) {
        this.f2455c = view;
    }

    private void a(int i2, ViewParent viewParent) {
        if (i2 == 0) {
            this.a = viewParent;
        } else if (i2 == 1) {
            this.f2454b = viewParent;
        }
    }

    private boolean b(int i2, int i3, int i4, int i5, int[] iArr, int i6, int[] iArr2) {
        ViewParent d2;
        int i7;
        int i8;
        int[] iArr3;
        if (!b() || (d2 = d(i6)) == null) {
            return false;
        }
        if (i2 == 0 && i3 == 0 && i4 == 0 && i5 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        if (iArr != null) {
            this.f2455c.getLocationInWindow(iArr);
            i8 = iArr[0];
            i7 = iArr[1];
        } else {
            i8 = 0;
            i7 = 0;
        }
        if (iArr2 == null) {
            int[] d3 = d();
            d3[0] = 0;
            d3[1] = 0;
            iArr3 = d3;
        } else {
            iArr3 = iArr2;
        }
        f0.a(d2, this.f2455c, i2, i3, i4, i5, i6, iArr3);
        if (iArr != null) {
            this.f2455c.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i8;
            iArr[1] = iArr[1] - i7;
        }
        return true;
    }

    private ViewParent d(int i2) {
        if (i2 == 0) {
            return this.a;
        }
        if (i2 != 1) {
            return null;
        }
        return this.f2454b;
    }

    private int[] d() {
        if (this.f2457e == null) {
            this.f2457e = new int[2];
        }
        return this.f2457e;
    }

    public void a(int i2, int i3, int i4, int i5, int[] iArr, int i6, int[] iArr2) {
        b(i2, i3, i4, i5, iArr, i6, iArr2);
    }

    public void a(boolean z) {
        if (this.f2456d) {
            b0.P(this.f2455c);
        }
        this.f2456d = z;
    }

    public boolean a() {
        return a(0);
    }

    public boolean a(float f2, float f3) {
        ViewParent d2;
        if (!b() || (d2 = d(0)) == null) {
            return false;
        }
        return f0.a(d2, this.f2455c, f2, f3);
    }

    public boolean a(float f2, float f3, boolean z) {
        ViewParent d2;
        if (!b() || (d2 = d(0)) == null) {
            return false;
        }
        return f0.a(d2, this.f2455c, f2, f3, z);
    }

    public boolean a(int i2) {
        return d(i2) != null;
    }

    public boolean a(int i2, int i3) {
        if (a(i3)) {
            return true;
        }
        if (!b()) {
            return false;
        }
        View view = this.f2455c;
        for (ViewParent parent = this.f2455c.getParent(); parent != null; parent = parent.getParent()) {
            if (f0.b(parent, view, this.f2455c, i2, i3)) {
                a(i3, parent);
                f0.a(parent, view, this.f2455c, i2, i3);
                return true;
            }
            if (parent instanceof View) {
                view = (View) parent;
            }
        }
        return false;
    }

    public boolean a(int i2, int i3, int i4, int i5, int[] iArr) {
        return b(i2, i3, i4, i5, iArr, 0, null);
    }

    public boolean a(int i2, int i3, int[] iArr, int[] iArr2) {
        return a(i2, i3, iArr, iArr2, 0);
    }

    public boolean a(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        ViewParent d2;
        int i5;
        int i6;
        if (!b() || (d2 = d(i4)) == null) {
            return false;
        }
        if (i2 == 0 && i3 == 0) {
            if (iArr2 != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
            }
            return false;
        }
        if (iArr2 != null) {
            this.f2455c.getLocationInWindow(iArr2);
            i6 = iArr2[0];
            i5 = iArr2[1];
        } else {
            i6 = 0;
            i5 = 0;
        }
        if (iArr == null) {
            iArr = d();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        f0.a(d2, this.f2455c, i2, i3, iArr, i4);
        if (iArr2 != null) {
            this.f2455c.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i6;
            iArr2[1] = iArr2[1] - i5;
        }
        return (iArr[0] == 0 && iArr[1] == 0) ? false : true;
    }

    public boolean b() {
        return this.f2456d;
    }

    public boolean b(int i2) {
        return a(i2, 0);
    }

    public void c() {
        c(0);
    }

    public void c(int i2) {
        ViewParent d2 = d(i2);
        if (d2 != null) {
            f0.a(d2, this.f2455c, i2);
            a(i2, (ViewParent) null);
        }
    }
}
