package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.ads.internal.x0;
import com.google.android.gms.common.b;
import com.google.android.gms.common.internal.d;

@k2
public final class h3 extends c3 implements d.a, d.b {

    /* renamed from: d  reason: collision with root package name */
    private Context f4470d;

    /* renamed from: e  reason: collision with root package name */
    private sc f4471e;

    /* renamed from: f  reason: collision with root package name */
    private yd<j3> f4472f;

    /* renamed from: g  reason: collision with root package name */
    private final a3 f4473g;

    /* renamed from: h  reason: collision with root package name */
    private final Object f4474h = new Object();

    /* renamed from: i  reason: collision with root package name */
    private i3 f4475i;

    public h3(Context context, sc scVar, yd<j3> ydVar, a3 a3Var) {
        super(ydVar, a3Var);
        this.f4470d = context;
        this.f4471e = scVar;
        this.f4472f = ydVar;
        this.f4473g = a3Var;
        this.f4475i = new i3(context, ((Boolean) a50.g().a(k80.G)).booleanValue() ? x0.u().b() : context.getMainLooper(), this, this);
        this.f4475i.j();
    }

    @Override // com.google.android.gms.common.internal.d.b
    public final void a(b bVar) {
        qc.b("Cannot connect to remote service, fallback to local instance.");
        new g3(this.f4470d, this.f4472f, this.f4473g).a();
        Bundle bundle = new Bundle();
        bundle.putString("action", "gms_connection_failed_fallback_to_local");
        x0.f().b(this.f4470d, this.f4471e.f5529b, "gmob-apps", bundle, true);
    }

    @Override // com.google.android.gms.internal.ads.c3
    public final void b() {
        synchronized (this.f4474h) {
            if (this.f4475i.a() || this.f4475i.d()) {
                this.f4475i.g();
            }
            Binder.flushPendingCommands();
        }
    }

    @Override // com.google.android.gms.internal.ads.c3
    public final r3 c() {
        r3 B;
        synchronized (this.f4474h) {
            try {
                B = this.f4475i.B();
            } catch (DeadObjectException | IllegalStateException unused) {
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
        return B;
    }

    @Override // com.google.android.gms.common.internal.d.a
    public final void e(int i2) {
        qc.b("Disconnected from remote ad request service.");
    }

    @Override // com.google.android.gms.common.internal.d.a
    public final void j(Bundle bundle) {
        a();
    }
}
