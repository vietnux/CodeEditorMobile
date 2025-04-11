package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.x0;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final class j5 implements Callable<g5> {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Context f4686b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ i5 f4687c;

    j5(i5 i5Var, Context context) {
        this.f4687c = i5Var;
        this.f4686b = context;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.concurrent.Callable
    public final /* synthetic */ g5 call() {
        g5 g5Var;
        k5 k5Var = (k5) this.f4687c.a.get(this.f4686b);
        if (k5Var != null) {
            if (!(k5Var.a + ((Long) a50.g().a(k80.p1)).longValue() < x0.m().a())) {
                if (((Boolean) a50.g().a(k80.o1)).booleanValue()) {
                    g5Var = new h5(this.f4686b, k5Var.f4786b).a();
                    this.f4687c.a.put(this.f4686b, new k5(this.f4687c, g5Var));
                    return g5Var;
                }
            }
        }
        g5Var = new h5(this.f4686b).a();
        this.f4687c.a.put(this.f4686b, new k5(this.f4687c, g5Var));
        return g5Var;
    }
}
