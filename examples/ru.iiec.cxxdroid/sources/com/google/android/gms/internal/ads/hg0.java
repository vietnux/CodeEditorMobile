package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.x0;
import java.util.concurrent.Executor;

@k2
public final class hg0 {
    private final Object a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f4520b;

    /* renamed from: c  reason: collision with root package name */
    private final String f4521c;

    /* renamed from: d  reason: collision with root package name */
    private final sc f4522d;

    /* renamed from: e  reason: collision with root package name */
    private za<vf0> f4523e;

    /* renamed from: f  reason: collision with root package name */
    private za<vf0> f4524f;

    /* renamed from: g  reason: collision with root package name */
    private yg0 f4525g;

    /* renamed from: h  reason: collision with root package name */
    private int f4526h;

    public hg0(Context context, sc scVar, String str) {
        this.a = new Object();
        this.f4526h = 1;
        this.f4521c = str;
        this.f4520b = context.getApplicationContext();
        this.f4522d = scVar;
        this.f4523e = new tg0();
        this.f4524f = new tg0();
    }

    public hg0(Context context, sc scVar, String str, za<vf0> zaVar, za<vf0> zaVar2) {
        this(context, scVar, str);
        this.f4523e = zaVar;
        this.f4524f = zaVar2;
    }

    /* access modifiers changed from: protected */
    public final yg0 a(cx cxVar) {
        yg0 yg0 = new yg0(this.f4524f);
        rd.a.execute(new ig0(this, cxVar, yg0));
        yg0.a(new qg0(this, yg0), new rg0(this, yg0));
        return yg0;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(cx cxVar, yg0 yg0) {
        try {
            Context context = this.f4520b;
            sc scVar = this.f4522d;
            vf0 gf0 = ((Boolean) a50.g().a(k80.y0)).booleanValue() ? new gf0(context, scVar) : new xf0(context, scVar, cxVar, null);
            gf0.a(new jg0(this, yg0, gf0));
            gf0.b("/jsLoaded", new mg0(this, yg0, gf0));
            vb vbVar = new vb();
            ng0 ng0 = new ng0(this, cxVar, gf0, vbVar);
            vbVar.a(ng0);
            gf0.b("/requestReload", ng0);
            if (this.f4521c.endsWith(".js")) {
                gf0.e(this.f4521c);
            } else if (this.f4521c.startsWith("<html>")) {
                gf0.c(this.f4521c);
            } else {
                gf0.d(this.f4521c);
            }
            u9.f5718h.postDelayed(new og0(this, yg0, gf0), (long) sg0.a);
        } catch (Throwable th) {
            qc.b("Error creating webview.", th);
            x0.j().a(th, "SdkJavascriptFactory.loadJavascriptEngine");
            yg0.b();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(yg0 yg0, vf0 vf0) {
        synchronized (this.a) {
            if (yg0.a() != -1) {
                if (yg0.a() != 1) {
                    yg0.b();
                    Executor executor = rd.a;
                    vf0.getClass();
                    executor.execute(lg0.a(vf0));
                    l9.e("Could not receive loaded message in a timely manner. Rejecting.");
                }
            }
        }
    }

    public final ug0 b(cx cxVar) {
        synchronized (this.a) {
            if (this.f4525g != null) {
                if (this.f4525g.a() != -1) {
                    if (this.f4526h == 0) {
                        return this.f4525g.c();
                    } else if (this.f4526h == 1) {
                        this.f4526h = 2;
                        a((cx) null);
                        return this.f4525g.c();
                    } else if (this.f4526h == 2) {
                        return this.f4525g.c();
                    } else {
                        return this.f4525g.c();
                    }
                }
            }
            this.f4526h = 2;
            this.f4525g = a((cx) null);
            return this.f4525g.c();
        }
    }
}
