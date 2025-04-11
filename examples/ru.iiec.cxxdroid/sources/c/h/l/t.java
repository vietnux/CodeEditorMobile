package c.h.l;

import android.view.View;
import android.view.ViewGroup;

public class t {
    private int a;

    /* renamed from: b  reason: collision with root package name */
    private int f2458b;

    public t(ViewGroup viewGroup) {
    }

    public int a() {
        return this.a | this.f2458b;
    }

    public void a(View view, int i2) {
        if (i2 == 1) {
            this.f2458b = 0;
        } else {
            this.a = 0;
        }
    }

    public void a(View view, View view2, int i2) {
        a(view, view2, i2, 0);
    }

    public void a(View view, View view2, int i2, int i3) {
        if (i3 == 1) {
            this.f2458b = i2;
        } else {
            this.a = i2;
        }
    }
}
