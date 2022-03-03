package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.x0;

/* access modifiers changed from: package-private */
public final class gb implements vc<Throwable, T> {
    private final /* synthetic */ kb a;

    gb(eb ebVar, kb kbVar) {
        this.a = kbVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.vc
    public final /* synthetic */ ld b(Throwable th) {
        Throwable th2 = th;
        qc.b("Error occurred while dispatching http response in getter.", th2);
        x0.j().a(th2, "HttpGetter.deliverResponse.1");
        return ad.a(this.a.a());
    }
}
