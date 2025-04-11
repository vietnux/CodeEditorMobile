package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.n;
import c.a.d;
import c.h.l.b0;
import c.h.l.g;

public class m implements i {
    private final Context a;

    /* renamed from: b  reason: collision with root package name */
    private final g f388b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f389c;

    /* renamed from: d  reason: collision with root package name */
    private final int f390d;

    /* renamed from: e  reason: collision with root package name */
    private final int f391e;

    /* renamed from: f  reason: collision with root package name */
    private View f392f;

    /* renamed from: g  reason: collision with root package name */
    private int f393g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f394h;

    /* renamed from: i  reason: collision with root package name */
    private n.a f395i;

    /* renamed from: j  reason: collision with root package name */
    private l f396j;

    /* renamed from: k  reason: collision with root package name */
    private PopupWindow.OnDismissListener f397k;

    /* renamed from: l  reason: collision with root package name */
    private final PopupWindow.OnDismissListener f398l;

    class a implements PopupWindow.OnDismissListener {
        a() {
        }

        public void onDismiss() {
            m.this.d();
        }
    }

    public m(Context context, g gVar, View view, boolean z, int i2) {
        this(context, gVar, view, z, i2, 0);
    }

    public m(Context context, g gVar, View view, boolean z, int i2, int i3) {
        this.f393g = 8388611;
        this.f398l = new a();
        this.a = context;
        this.f388b = gVar;
        this.f392f = view;
        this.f389c = z;
        this.f390d = i2;
        this.f391e = i3;
    }

    private void a(int i2, int i3, boolean z, boolean z2) {
        l b2 = b();
        b2.c(z2);
        if (z) {
            if ((g.a(this.f393g, b0.r(this.f392f)) & 7) == 5) {
                i2 -= this.f392f.getWidth();
            }
            b2.b(i2);
            b2.c(i3);
            int i4 = (int) ((this.a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            b2.a(new Rect(i2 - i4, i3 - i4, i2 + i4, i3 + i4));
        }
        b2.e();
    }

    private l g() {
        Display defaultDisplay = ((WindowManager) this.a.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        if (Build.VERSION.SDK_INT >= 17) {
            defaultDisplay.getRealSize(point);
        } else {
            defaultDisplay.getSize(point);
        }
        l dVar = Math.min(point.x, point.y) >= this.a.getResources().getDimensionPixelSize(d.abc_cascading_menus_min_smallest_width) ? new d(this.a, this.f392f, this.f390d, this.f391e, this.f389c) : new r(this.a, this.f388b, this.f392f, this.f390d, this.f391e, this.f389c);
        dVar.a(this.f388b);
        dVar.a(this.f398l);
        dVar.a(this.f392f);
        dVar.a(this.f395i);
        dVar.b(this.f394h);
        dVar.a(this.f393g);
        return dVar;
    }

    public void a() {
        if (c()) {
            this.f396j.dismiss();
        }
    }

    public void a(int i2) {
        this.f393g = i2;
    }

    public void a(View view) {
        this.f392f = view;
    }

    public void a(PopupWindow.OnDismissListener onDismissListener) {
        this.f397k = onDismissListener;
    }

    public void a(n.a aVar) {
        this.f395i = aVar;
        l lVar = this.f396j;
        if (lVar != null) {
            lVar.a(aVar);
        }
    }

    public void a(boolean z) {
        this.f394h = z;
        l lVar = this.f396j;
        if (lVar != null) {
            lVar.b(z);
        }
    }

    public boolean a(int i2, int i3) {
        if (c()) {
            return true;
        }
        if (this.f392f == null) {
            return false;
        }
        a(i2, i3, true, true);
        return true;
    }

    public l b() {
        if (this.f396j == null) {
            this.f396j = g();
        }
        return this.f396j;
    }

    public boolean c() {
        l lVar = this.f396j;
        return lVar != null && lVar.f();
    }

    /* access modifiers changed from: protected */
    public void d() {
        this.f396j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f397k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public void e() {
        if (!f()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public boolean f() {
        if (c()) {
            return true;
        }
        if (this.f392f == null) {
            return false;
        }
        a(0, 0, false, false);
        return true;
    }
}
