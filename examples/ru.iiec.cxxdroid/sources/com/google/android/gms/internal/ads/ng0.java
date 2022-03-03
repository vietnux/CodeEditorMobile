package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.gmsg.e0;
import java.util.Map;

/* access modifiers changed from: package-private */
public final class ng0 implements e0<eh0> {
    private final /* synthetic */ cx a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ vf0 f5095b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ vb f5096c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ hg0 f5097d;

    ng0(hg0 hg0, cx cxVar, vf0 vf0, vb vbVar) {
        this.f5097d = hg0;
        this.a = cxVar;
        this.f5095b = vf0;
        this.f5096c = vbVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.util.Map] */
    @Override // com.google.android.gms.ads.internal.gmsg.e0
    public final /* synthetic */ void zza(eh0 eh0, Map map) {
        synchronized (this.f5097d.a) {
            qc.c("JS Engine is requesting an update");
            if (this.f5097d.f4526h == 0) {
                qc.c("Starting reload.");
                this.f5097d.f4526h = 2;
                this.f5097d.a(this.a);
            }
            this.f5095b.a("/requestReload", (e0) this.f5096c.a());
        }
    }
}
