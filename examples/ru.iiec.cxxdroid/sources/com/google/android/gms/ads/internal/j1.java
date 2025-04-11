package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.b8;
import com.google.android.gms.internal.ads.lg;
import com.google.android.gms.internal.ads.m0;
import com.google.android.gms.internal.ads.n3;
import com.google.android.gms.internal.ads.qc;
import com.google.android.gms.internal.ads.r8;
import com.google.android.gms.internal.ads.u9;
import com.google.android.gms.internal.ads.wg;
import com.google.android.gms.internal.ads.x80;
import com.google.android.gms.internal.ads.y80;

/* access modifiers changed from: package-private */
public final class j1 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ r8 f3215b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ b8 f3216c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ x80 f3217d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ g1 f3218e;

    j1(g1 g1Var, r8 r8Var, b8 b8Var, x80 x80) {
        this.f3218e = g1Var;
        this.f3215b = r8Var;
        this.f3216c = b8Var;
        this.f3217d = x80;
    }

    public final void run() {
        n3 n3Var = this.f3215b.f5394b;
        if (n3Var.u && this.f3218e.f3125g.C != null) {
            String str = null;
            if (n3Var.f5025d != null) {
                x0.f();
                str = u9.c(this.f3215b.f5394b.f5025d);
            }
            y80 y80 = new y80(this.f3218e, str, this.f3215b.f5394b.f5026e);
            g1 g1Var = this.f3218e;
            y0 y0Var = g1Var.f3125g;
            y0Var.J = 1;
            try {
                g1Var.f3123e = false;
                y0Var.C.a(y80);
                return;
            } catch (RemoteException e2) {
                qc.d("#007 Could not call remote method.", e2);
                this.f3218e.f3123e = true;
            }
        }
        v1 v1Var = new v1(this.f3218e.f3125g.f3368d, this.f3216c, this.f3215b.f5394b.I);
        try {
            lg a = this.f3218e.a(this.f3215b, v1Var, this.f3216c);
            a.setOnTouchListener(new l1(this, v1Var));
            a.setOnClickListener(new m1(this, v1Var));
            y0 y0Var2 = this.f3218e.f3125g;
            y0Var2.J = 0;
            x0.e();
            g1 g1Var2 = this.f3218e;
            y0 y0Var3 = g1Var2.f3125g;
            y0Var2.f3373i = m0.a(y0Var3.f3368d, g1Var2, this.f3215b, y0Var3.f3369e, a, g1Var2.n, g1Var2, this.f3217d);
        } catch (wg e3) {
            qc.b("Could not obtain webview.", e3);
            u9.f5718h.post(new k1(this));
        }
    }
}
