package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.gmsg.e0;
import com.google.android.gms.internal.ads.dj0;
import com.google.android.gms.internal.ads.hj0;
import com.google.android.gms.internal.ads.lg;
import com.google.android.gms.internal.ads.qc;
import e.b.b.a.b.b;
import java.util.Map;

/* access modifiers changed from: package-private */
public final class y implements e0<lg> {
    private final /* synthetic */ dj0 a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ d f3364b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ hj0 f3365c;

    y(dj0 dj0, d dVar, hj0 hj0) {
        this.a = dj0;
        this.f3364b = dVar;
        this.f3365c = hj0;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.util.Map] */
    @Override // com.google.android.gms.ads.internal.gmsg.e0
    public final /* synthetic */ void zza(lg lgVar, Map map) {
        lg lgVar2 = lgVar;
        View view = lgVar2.getView();
        if (view != null) {
            try {
                if (this.a != null) {
                    if (!this.a.H()) {
                        this.a.a(b.a(view));
                        this.f3364b.a.d();
                        return;
                    }
                    t.a(lgVar2);
                } else if (this.f3365c == null) {
                } else {
                    if (!this.f3365c.H()) {
                        this.f3365c.a(b.a(view));
                        this.f3364b.a.d();
                        return;
                    }
                    t.a(lgVar2);
                }
            } catch (RemoteException e2) {
                qc.c("Unable to call handleClick on mapper", e2);
            }
        }
    }
}
