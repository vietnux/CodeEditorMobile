package com.google.android.gms.ads.internal;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.internal.ads.a50;
import com.google.android.gms.internal.ads.ai0;
import com.google.android.gms.internal.ads.bi0;
import com.google.android.gms.internal.ads.j7;
import com.google.android.gms.internal.ads.k2;
import com.google.android.gms.internal.ads.k60;
import com.google.android.gms.internal.ads.k80;
import com.google.android.gms.internal.ads.oa;
import com.google.android.gms.internal.ads.qc;
import com.google.android.gms.internal.ads.sc;
import com.google.android.gms.internal.ads.ui0;
import com.google.android.gms.internal.ads.x5;
import e.b.b.a.b.a;
import e.b.b.a.b.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@k2
public final class z extends k60 {

    /* renamed from: e  reason: collision with root package name */
    private static final Object f3378e = new Object();

    /* renamed from: f  reason: collision with root package name */
    private static z f3379f;

    /* renamed from: b  reason: collision with root package name */
    private final Context f3380b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f3381c = false;

    /* renamed from: d  reason: collision with root package name */
    private sc f3382d;

    private z(Context context, sc scVar) {
        this.f3380b = context;
        this.f3382d = scVar;
    }

    public static z a(Context context, sc scVar) {
        z zVar;
        synchronized (f3378e) {
            if (f3379f == null) {
                f3379f = new z(context.getApplicationContext(), scVar);
            }
            zVar = f3379f;
        }
        return zVar;
    }

    @Override // com.google.android.gms.internal.ads.j60
    public final void F() {
        synchronized (f3378e) {
            if (this.f3381c) {
                qc.d("Mobile ads is initialized already.");
                return;
            }
            this.f3381c = true;
            k80.a(this.f3380b);
            x0.j().a(this.f3380b, this.f3382d);
            x0.l().a(this.f3380b);
        }
    }

    @Override // com.google.android.gms.internal.ads.j60
    public final void a(float f2) {
        x0.E().a(f2);
    }

    @Override // com.google.android.gms.internal.ads.j60
    public final void a(a aVar, String str) {
        if (aVar == null) {
            qc.a("Wrapped context is null. Failed to open debug menu.");
            return;
        }
        Context context = (Context) b.y(aVar);
        if (context == null) {
            qc.a("Context is null. Failed to open debug menu.");
            return;
        }
        oa oaVar = new oa(context);
        oaVar.a(str);
        oaVar.b(this.f3382d.f5529b);
        oaVar.a();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(Runnable runnable) {
        Context context = this.f3380b;
        y.a("Adapters must be initialized on the main thread.");
        Map<String, bi0> e2 = x0.j().m().h().e();
        if (!(e2 == null || e2.isEmpty())) {
            if (runnable != null) {
                try {
                    runnable.run();
                } catch (Throwable th) {
                    qc.c("Could not initialize rewarded ads.", th);
                    return;
                }
            }
            x5 p2 = x5.p2();
            if (p2 != null) {
                Collection<bi0> values = e2.values();
                HashMap hashMap = new HashMap();
                a a = b.a(context);
                for (bi0 bi0 : values) {
                    for (ai0 ai0 : bi0.a) {
                        String str = ai0.f3816k;
                        for (String str2 : ai0.f3808c) {
                            if (!hashMap.containsKey(str2)) {
                                hashMap.put(str2, new ArrayList());
                            }
                            if (str != null) {
                                ((Collection) hashMap.get(str2)).add(str);
                            }
                        }
                    }
                }
                for (Map.Entry entry : hashMap.entrySet()) {
                    String str3 = (String) entry.getKey();
                    try {
                        j7 o = p2.o(str3);
                        if (o != null) {
                            ui0 a2 = o.a();
                            if (!a2.isInitialized()) {
                                if (a2.J0()) {
                                    a2.a(a, o.b(), (List) entry.getValue());
                                    String valueOf = String.valueOf(str3);
                                    qc.b(valueOf.length() != 0 ? "Initialized rewarded video mediation adapter ".concat(valueOf) : new String("Initialized rewarded video mediation adapter "));
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 56);
                        sb.append("Failed to initialize rewarded video mediation adapter \"");
                        sb.append(str3);
                        sb.append("\"");
                        qc.c(sb.toString(), th2);
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.j60
    public final void b(String str, a aVar) {
        if (!TextUtils.isEmpty(str)) {
            k80.a(this.f3380b);
            boolean booleanValue = ((Boolean) a50.g().a(k80.r2)).booleanValue() | ((Boolean) a50.g().a(k80.B0)).booleanValue();
            a0 a0Var = null;
            if (((Boolean) a50.g().a(k80.B0)).booleanValue()) {
                booleanValue = true;
                a0Var = new a0(this, (Runnable) b.y(aVar));
            }
            if (booleanValue) {
                x0.n().a(this.f3380b, this.f3382d, str, a0Var);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.j60
    public final void d(String str) {
        k80.a(this.f3380b);
        if (!TextUtils.isEmpty(str)) {
            if (((Boolean) a50.g().a(k80.r2)).booleanValue()) {
                x0.n().a(this.f3380b, this.f3382d, str, null);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.j60
    public final float h1() {
        return x0.E().a();
    }

    @Override // com.google.android.gms.internal.ads.j60
    public final void j(boolean z) {
        x0.E().a(z);
    }

    @Override // com.google.android.gms.internal.ads.j60
    public final boolean s1() {
        return x0.E().b();
    }
}
