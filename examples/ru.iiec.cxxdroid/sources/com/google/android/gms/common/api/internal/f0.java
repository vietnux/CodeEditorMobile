package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.b0;
import com.google.android.gms.common.internal.e;
import com.google.android.gms.common.internal.y;
import e.b.b.a.d.b;
import e.b.b.a.d.d.c;
import e.b.b.a.d.d.i;
import java.util.Set;

public final class f0 extends c implements f.a, f.b {

    /* renamed from: i  reason: collision with root package name */
    private static a.AbstractC0074a<? extends b, e.b.b.a.d.c> f3541i = e.b.b.a.d.a.f7763c;

    /* renamed from: b  reason: collision with root package name */
    private final Context f3542b;

    /* renamed from: c  reason: collision with root package name */
    private final Handler f3543c;

    /* renamed from: d  reason: collision with root package name */
    private final a.AbstractC0074a<? extends b, e.b.b.a.d.c> f3544d;

    /* renamed from: e  reason: collision with root package name */
    private Set<Scope> f3545e;

    /* renamed from: f  reason: collision with root package name */
    private e f3546f;

    /* renamed from: g  reason: collision with root package name */
    private b f3547g;

    /* renamed from: h  reason: collision with root package name */
    private j0 f3548h;

    public f0(Context context, Handler handler, e eVar) {
        this(context, handler, eVar, f3541i);
    }

    public f0(Context context, Handler handler, e eVar, a.AbstractC0074a<? extends b, e.b.b.a.d.c> aVar) {
        this.f3542b = context;
        this.f3543c = handler;
        y.a(eVar, "ClientSettings must not be null");
        this.f3546f = eVar;
        this.f3545e = eVar.g();
        this.f3544d = aVar;
    }

    /* access modifiers changed from: private */
    public final void b(i iVar) {
        com.google.android.gms.common.b t = iVar.t();
        if (t.x()) {
            b0 u = iVar.u();
            t = u.u();
            if (!t.x()) {
                String valueOf = String.valueOf(t);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48);
                sb.append("Sign-in succeeded with resolve account failure: ");
                sb.append(valueOf);
                Log.wtf("SignInCoordinator", sb.toString(), new Exception());
            } else {
                this.f3548h.a(u.t(), this.f3545e);
                this.f3547g.g();
            }
        }
        this.f3548h.b(t);
        this.f3547g.g();
    }

    public final void M() {
        b bVar = this.f3547g;
        if (bVar != null) {
            bVar.g();
        }
    }

    public final void a(j0 j0Var) {
        b bVar = this.f3547g;
        if (bVar != null) {
            bVar.g();
        }
        this.f3546f.a(Integer.valueOf(System.identityHashCode(this)));
        a.AbstractC0074a<? extends b, e.b.b.a.d.c> aVar = this.f3544d;
        Context context = this.f3542b;
        Looper looper = this.f3543c.getLooper();
        e eVar = this.f3546f;
        this.f3547g = (b) aVar.a(context, looper, eVar, eVar.h(), this, this);
        this.f3548h = j0Var;
        Set<Scope> set = this.f3545e;
        if (set == null || set.isEmpty()) {
            this.f3543c.post(new g0(this));
        } else {
            this.f3547g.h();
        }
    }

    @Override // com.google.android.gms.common.api.f.b
    public final void a(com.google.android.gms.common.b bVar) {
        this.f3548h.b(bVar);
    }

    @Override // e.b.b.a.d.d.d
    public final void a(i iVar) {
        this.f3543c.post(new i0(this, iVar));
    }

    @Override // com.google.android.gms.common.api.f.a
    public final void e(int i2) {
        this.f3547g.g();
    }

    @Override // com.google.android.gms.common.api.f.a
    public final void j(Bundle bundle) {
        this.f3547g.a(this);
    }
}
