package e.b.b.b.m;

import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

public final class c {
    private final View a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f7835b = false;

    /* renamed from: c  reason: collision with root package name */
    private int f7836c = 0;

    public c(b bVar) {
        this.a = (View) bVar;
    }

    private void d() {
        ViewParent parent = this.a.getParent();
        if (parent instanceof CoordinatorLayout) {
            ((CoordinatorLayout) parent).a(this.a);
        }
    }

    public int a() {
        return this.f7836c;
    }

    public void a(int i2) {
        this.f7836c = i2;
    }

    public void a(Bundle bundle) {
        this.f7835b = bundle.getBoolean("expanded", false);
        this.f7836c = bundle.getInt("expandedComponentIdHint", 0);
        if (this.f7835b) {
            d();
        }
    }

    public boolean b() {
        return this.f7835b;
    }

    public Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", this.f7835b);
        bundle.putInt("expandedComponentIdHint", this.f7836c);
        return bundle;
    }
}
