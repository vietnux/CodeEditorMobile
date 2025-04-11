package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.gms.common.internal.y;

@k2
public final class bf {
    private final Context a;

    /* renamed from: b  reason: collision with root package name */
    private final kf f3883b;

    /* renamed from: c  reason: collision with root package name */
    private final ViewGroup f3884c;

    /* renamed from: d  reason: collision with root package name */
    private we f3885d;

    private bf(Context context, ViewGroup viewGroup, kf kfVar, we weVar) {
        this.a = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f3884c = viewGroup;
        this.f3883b = kfVar;
        this.f3885d = null;
    }

    public bf(Context context, ViewGroup viewGroup, lg lgVar) {
        this(context, viewGroup, lgVar, null);
    }

    public final void a() {
        y.a("onDestroy must be called from the UI thread.");
        we weVar = this.f3885d;
        if (weVar != null) {
            weVar.h();
            this.f3884c.removeView(this.f3885d);
            this.f3885d = null;
        }
    }

    public final void a(int i2, int i3, int i4, int i5) {
        y.a("The underlay may only be modified from the UI thread.");
        we weVar = this.f3885d;
        if (weVar != null) {
            weVar.a(i2, i3, i4, i5);
        }
    }

    public final void a(int i2, int i3, int i4, int i5, int i6, boolean z, jf jfVar) {
        if (this.f3885d == null) {
            q80.a(this.f3883b.Q().a(), this.f3883b.D0(), "vpr2");
            Context context = this.a;
            kf kfVar = this.f3883b;
            this.f3885d = new we(context, kfVar, i6, z, kfVar.Q().a(), jfVar);
            this.f3884c.addView(this.f3885d, 0, new ViewGroup.LayoutParams(-1, -1));
            this.f3885d.a(i2, i3, i4, i5);
            this.f3883b.a(false);
        }
    }

    public final void b() {
        y.a("onPause must be called from the UI thread.");
        we weVar = this.f3885d;
        if (weVar != null) {
            weVar.i();
        }
    }

    public final we c() {
        y.a("getAdVideoUnderlay must be called from the UI thread.");
        return this.f3885d;
    }
}
