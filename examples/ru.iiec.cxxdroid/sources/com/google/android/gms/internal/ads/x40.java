package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.n;
import com.google.android.gms.internal.ads.r40;
import e.b.b.a.b.b;

/* access modifiers changed from: package-private */
public final class x40 extends r40.a<f6> {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Context f5989b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ ri0 f5990c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ r40 f5991d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    x40(r40 r40, Context context, ri0 ri0) {
        super();
        this.f5991d = r40;
        this.f5989b = context;
        this.f5990c = ri0;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.gms.internal.ads.r40.a
    public final /* synthetic */ f6 a() {
        f6 a = this.f5991d.f5390f.a(this.f5989b, this.f5990c);
        if (a != null) {
            return a;
        }
        r40 r40 = this.f5991d;
        r40.a(this.f5989b, "rewarded_video");
        return new n70();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.gms.internal.ads.r40.a
    public final /* synthetic */ f6 a(d60 d60) {
        return d60.createRewardedVideoAd(b.a(this.f5989b), this.f5990c, n.GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }
}
