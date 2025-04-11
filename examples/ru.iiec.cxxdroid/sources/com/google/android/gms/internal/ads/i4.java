package com.google.android.gms.internal.ads;

final class i4 implements be<eh0> {
    private final /* synthetic */ h4 a;

    i4(h4 h4Var) {
        this.a = h4Var;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.be
    public final /* synthetic */ void a(eh0 eh0) {
        try {
            eh0.b("AFMA_getAdapterLessMediationAd", this.a.f4486b);
        } catch (Exception e2) {
            qc.b("Error requesting an ad url", e2);
            f4.o.b(this.a.f4487c);
        }
    }
}
