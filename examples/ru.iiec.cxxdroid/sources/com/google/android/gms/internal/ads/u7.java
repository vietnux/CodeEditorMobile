package com.google.android.gms.internal.ads;

final class u7 implements xc<Void> {
    private final /* synthetic */ ld a;

    u7(q7 q7Var, ld ldVar) {
        this.a = ldVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.xc
    public final /* synthetic */ void a(Void r2) {
        q7.n.remove(this.a);
    }

    @Override // com.google.android.gms.internal.ads.xc
    public final void a(Throwable th) {
        q7.n.remove(this.a);
    }
}
