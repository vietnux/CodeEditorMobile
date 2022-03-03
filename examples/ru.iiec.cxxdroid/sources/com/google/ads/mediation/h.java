package com.google.ads.mediation;

import com.google.android.gms.ads.p.d;

final class h extends d {
    private final /* synthetic */ AbstractAdViewAdapter a;

    h(AbstractAdViewAdapter abstractAdViewAdapter) {
        this.a = abstractAdViewAdapter;
    }

    @Override // com.google.android.gms.ads.p.d
    public final void a() {
        if (AbstractAdViewAdapter.zzb(this.a) != null && AbstractAdViewAdapter.zza(this.a) != null) {
            AbstractAdViewAdapter.zza(this.a).a(AbstractAdViewAdapter.zzb(this.a).c());
        }
    }
}
