package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.gmsg.e0;
import com.google.android.gms.ads.internal.x0;
import java.util.Map;

@k2
public final class m extends n implements e0<lg> {

    /* renamed from: c  reason: collision with root package name */
    private final lg f4910c;

    /* renamed from: d  reason: collision with root package name */
    private final Context f4911d;

    /* renamed from: e  reason: collision with root package name */
    private final WindowManager f4912e;

    /* renamed from: f  reason: collision with root package name */
    private final v70 f4913f;

    /* renamed from: g  reason: collision with root package name */
    private DisplayMetrics f4914g;

    /* renamed from: h  reason: collision with root package name */
    private float f4915h;

    /* renamed from: i  reason: collision with root package name */
    private int f4916i = -1;

    /* renamed from: j  reason: collision with root package name */
    private int f4917j = -1;

    /* renamed from: k  reason: collision with root package name */
    private int f4918k;

    /* renamed from: l  reason: collision with root package name */
    private int f4919l = -1;

    /* renamed from: m  reason: collision with root package name */
    private int f4920m = -1;
    private int n = -1;
    private int o = -1;

    public m(lg lgVar, Context context, v70 v70) {
        super(lgVar);
        this.f4910c = lgVar;
        this.f4911d = context;
        this.f4913f = v70;
        this.f4912e = (WindowManager) context.getSystemService("window");
    }

    public final void a(int i2, int i3) {
        int i4 = 0;
        if (this.f4911d instanceof Activity) {
            i4 = x0.f().b((Activity) this.f4911d)[0];
        }
        if (this.f4910c.g0() == null || !this.f4910c.g0().b()) {
            a50.b();
            this.n = fc.b(this.f4911d, this.f4910c.getWidth());
            a50.b();
            this.o = fc.b(this.f4911d, this.f4910c.getHeight());
        }
        b(i2, i3 - i4, this.n, this.o);
        this.f4910c.M().a(i2, i3);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.util.Map] */
    @Override // com.google.android.gms.ads.internal.gmsg.e0
    public final /* synthetic */ void zza(lg lgVar, Map map) {
        int i2;
        this.f4914g = new DisplayMetrics();
        Display defaultDisplay = this.f4912e.getDefaultDisplay();
        defaultDisplay.getMetrics(this.f4914g);
        this.f4915h = this.f4914g.density;
        this.f4918k = defaultDisplay.getRotation();
        a50.b();
        DisplayMetrics displayMetrics = this.f4914g;
        this.f4916i = fc.b(displayMetrics, displayMetrics.widthPixels);
        a50.b();
        DisplayMetrics displayMetrics2 = this.f4914g;
        this.f4917j = fc.b(displayMetrics2, displayMetrics2.heightPixels);
        Activity b0 = this.f4910c.b0();
        if (b0 == null || b0.getWindow() == null) {
            this.f4919l = this.f4916i;
            i2 = this.f4917j;
        } else {
            x0.f();
            int[] c2 = u9.c(b0);
            a50.b();
            this.f4919l = fc.b(this.f4914g, c2[0]);
            a50.b();
            i2 = fc.b(this.f4914g, c2[1]);
        }
        this.f4920m = i2;
        if (this.f4910c.g0().b()) {
            this.n = this.f4916i;
            this.o = this.f4917j;
        } else {
            this.f4910c.measure(0, 0);
        }
        a(this.f4916i, this.f4917j, this.f4919l, this.f4920m, this.f4915h, this.f4918k);
        l lVar = new l();
        lVar.b(this.f4913f.a());
        lVar.a(this.f4913f.b());
        lVar.c(this.f4913f.d());
        lVar.d(this.f4913f.c());
        lVar.e(true);
        this.f4910c.a("onDeviceFeaturesReceived", new j(lVar).a());
        int[] iArr = new int[2];
        this.f4910c.getLocationOnScreen(iArr);
        a50.b();
        int b2 = fc.b(this.f4911d, iArr[0]);
        a50.b();
        a(b2, fc.b(this.f4911d, iArr[1]));
        if (qc.a(2)) {
            qc.c("Dispatching Ready Event.");
        }
        b(this.f4910c.p0().f5529b);
    }
}
