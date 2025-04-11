package com.google.ads.mediation;

import com.google.android.gms.ads.h;
import com.google.android.gms.ads.p.a;
import com.google.android.gms.ads.p.c;

final class g implements c {
    private final /* synthetic */ AbstractAdViewAdapter a;

    g(AbstractAdViewAdapter abstractAdViewAdapter) {
        this.a = abstractAdViewAdapter;
    }

    @Override // com.google.android.gms.ads.p.c
    public final void I() {
        AbstractAdViewAdapter.zza(this.a).f(this.a);
    }

    @Override // com.google.android.gms.ads.p.c
    public final void a(int i2) {
        AbstractAdViewAdapter.zza(this.a).a(this.a, i2);
    }

    @Override // com.google.android.gms.ads.p.c
    public final void a(a aVar) {
        AbstractAdViewAdapter.zza(this.a).a(this.a, aVar);
    }

    @Override // com.google.android.gms.ads.p.c
    public final void o() {
        AbstractAdViewAdapter.zza(this.a).e(this.a);
    }

    @Override // com.google.android.gms.ads.p.c
    public final void p() {
        AbstractAdViewAdapter.zza(this.a).a(this.a);
    }

    @Override // com.google.android.gms.ads.p.c
    public final void q() {
        AbstractAdViewAdapter.zza(this.a).g(this.a);
        AbstractAdViewAdapter.zza(this.a, (h) null);
    }

    @Override // com.google.android.gms.ads.p.c
    public final void r() {
        AbstractAdViewAdapter.zza(this.a).b(this.a);
    }

    @Override // com.google.android.gms.ads.p.c
    public final void s() {
        AbstractAdViewAdapter.zza(this.a).d(this.a);
    }
}
