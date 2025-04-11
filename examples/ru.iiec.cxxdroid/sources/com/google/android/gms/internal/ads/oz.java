package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

@k2
public final class oz implements xz {
    private final Object a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final WeakHashMap<q8, pz> f5195b = new WeakHashMap<>();

    /* renamed from: c  reason: collision with root package name */
    private final ArrayList<pz> f5196c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    private final Context f5197d;

    /* renamed from: e  reason: collision with root package name */
    private final sc f5198e;

    /* renamed from: f  reason: collision with root package name */
    private final hg0 f5199f;

    public oz(Context context, sc scVar) {
        this.f5197d = context.getApplicationContext();
        this.f5198e = scVar;
        this.f5199f = new hg0(context.getApplicationContext(), scVar, (String) a50.g().a(k80.a));
    }

    private final boolean e(q8 q8Var) {
        boolean z;
        synchronized (this.a) {
            pz pzVar = this.f5195b.get(q8Var);
            z = pzVar != null && pzVar.f();
        }
        return z;
    }

    public final void a(n40 n40, q8 q8Var) {
        a(n40, q8Var, q8Var.f5319b.getView());
    }

    public final void a(n40 n40, q8 q8Var, View view) {
        a(n40, q8Var, new vz(view, q8Var), (lg) null);
    }

    public final void a(n40 n40, q8 q8Var, View view, lg lgVar) {
        a(n40, q8Var, new vz(view, q8Var), lgVar);
    }

    public final void a(n40 n40, q8 q8Var, b10 b10, lg lgVar) {
        pz pzVar;
        synchronized (this.a) {
            if (e(q8Var)) {
                pzVar = this.f5195b.get(q8Var);
            } else {
                pz pzVar2 = new pz(this.f5197d, n40, q8Var, this.f5198e, b10);
                pzVar2.a(this);
                this.f5195b.put(q8Var, pzVar2);
                this.f5196c.add(pzVar2);
                pzVar = pzVar2;
            }
            pzVar.a(lgVar != null ? new yz(pzVar, lgVar) : new c00(pzVar, this.f5199f, this.f5197d));
        }
    }

    @Override // com.google.android.gms.internal.ads.xz
    public final void a(pz pzVar) {
        synchronized (this.a) {
            if (!pzVar.f()) {
                this.f5196c.remove(pzVar);
                Iterator<Map.Entry<q8, pz>> it = this.f5195b.entrySet().iterator();
                while (it.hasNext()) {
                    if (it.next().getValue() == pzVar) {
                        it.remove();
                    }
                }
            }
        }
    }

    public final void a(q8 q8Var) {
        synchronized (this.a) {
            pz pzVar = this.f5195b.get(q8Var);
            if (pzVar != null) {
                pzVar.e();
            }
        }
    }

    public final void b(q8 q8Var) {
        synchronized (this.a) {
            pz pzVar = this.f5195b.get(q8Var);
            if (pzVar != null) {
                pzVar.c();
            }
        }
    }

    public final void c(q8 q8Var) {
        synchronized (this.a) {
            pz pzVar = this.f5195b.get(q8Var);
            if (pzVar != null) {
                pzVar.a();
            }
        }
    }

    public final void d(q8 q8Var) {
        synchronized (this.a) {
            pz pzVar = this.f5195b.get(q8Var);
            if (pzVar != null) {
                pzVar.b();
            }
        }
    }
}
