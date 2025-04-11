package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.e0;
import com.google.android.gms.ads.internal.gmsg.o;
import com.google.android.gms.ads.internal.x0;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

@k2
public final class g1 {
    private final Object a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final Context f4367b;

    /* renamed from: c  reason: collision with root package name */
    private final cx f4368c;

    /* renamed from: d  reason: collision with root package name */
    private final r8 f4369d;

    /* renamed from: e  reason: collision with root package name */
    private final x80 f4370e;

    /* renamed from: f  reason: collision with root package name */
    private final e0 f4371f;

    /* renamed from: g  reason: collision with root package name */
    private ViewTreeObserver.OnGlobalLayoutListener f4372g;

    /* renamed from: h  reason: collision with root package name */
    private ViewTreeObserver.OnScrollChangedListener f4373h;

    /* renamed from: i  reason: collision with root package name */
    private final DisplayMetrics f4374i;

    /* renamed from: j  reason: collision with root package name */
    private ub f4375j;

    /* renamed from: k  reason: collision with root package name */
    private int f4376k = -1;

    /* renamed from: l  reason: collision with root package name */
    private int f4377l = -1;

    public g1(Context context, cx cxVar, r8 r8Var, x80 x80, e0 e0Var) {
        this.f4367b = context;
        this.f4368c = cxVar;
        this.f4369d = r8Var;
        this.f4370e = x80;
        this.f4371f = e0Var;
        this.f4375j = new ub(200);
        x0.f();
        this.f4374i = u9.a((WindowManager) context.getSystemService("window"));
    }

    /* access modifiers changed from: private */
    public final void a(WeakReference<lg> weakReference, boolean z) {
        lg lgVar;
        if (weakReference != null && (lgVar = weakReference.get()) != null && lgVar.getView() != null) {
            if (!z || this.f4375j.a()) {
                int[] iArr = new int[2];
                lgVar.getView().getLocationOnScreen(iArr);
                a50.b();
                boolean z2 = false;
                int b2 = fc.b(this.f4374i, iArr[0]);
                a50.b();
                int b3 = fc.b(this.f4374i, iArr[1]);
                synchronized (this.a) {
                    if (!(this.f4376k == b2 && this.f4377l == b3)) {
                        this.f4376k = b2;
                        this.f4377l = b3;
                        th M = lgVar.M();
                        int i2 = this.f4376k;
                        int i3 = this.f4377l;
                        if (!z) {
                            z2 = true;
                        }
                        M.a(i2, i3, z2);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(wd wdVar, lg lgVar, boolean z) {
        this.f4371f.v2();
        wdVar.b(lgVar);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(JSONObject jSONObject, wd wdVar) {
        try {
            x0.g();
            lg a2 = sg.a(this.f4367b, zh.e(), "native-video", false, false, this.f4368c, this.f4369d.a.f4670l, this.f4370e, null, this.f4371f.x0(), this.f4369d.f5401i);
            a2.a(zh.f());
            this.f4371f.a(a2);
            WeakReference weakReference = new WeakReference(a2);
            th M = a2.M();
            if (this.f4372g == null) {
                this.f4372g = new m1(this, weakReference);
            }
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f4372g;
            if (this.f4373h == null) {
                this.f4373h = new n1(this, weakReference);
            }
            M.a(onGlobalLayoutListener, this.f4373h);
            a2.b("/video", o.f3184l);
            a2.b("/videoMeta", o.f3185m);
            a2.b("/precache", new ag());
            a2.b("/delayPageLoaded", o.p);
            a2.b("/instrument", o.n);
            a2.b("/log", o.f3179g);
            a2.b("/videoClicked", o.f3180h);
            a2.b("/trackActiveViewUnit", new k1(this));
            a2.b("/untrackActiveViewUnit", new l1(this));
            a2.M().a(new i1(a2, jSONObject));
            a2.M().a(new j1(this, wdVar, a2));
            a2.loadUrl((String) a50.g().a(k80.X1));
        } catch (Exception e2) {
            qc.c("Exception occurred while getting video view", e2);
            wdVar.b(null);
        }
    }
}
