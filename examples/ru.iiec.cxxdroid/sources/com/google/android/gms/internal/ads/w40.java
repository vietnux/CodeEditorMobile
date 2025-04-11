package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.n;
import com.google.android.gms.internal.ads.r40;
import e.b.b.a.b.b;

/* access modifiers changed from: package-private */
public final class w40 extends r40.a<j60> {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Context f5876b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ r40 f5877c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    w40(r40 r40, Context context) {
        super();
        this.f5877c = r40;
        this.f5876b = context;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.gms.internal.ads.r40.a
    public final /* synthetic */ j60 a() {
        j60 b2 = this.f5877c.f5389e.b(this.f5876b);
        if (b2 != null) {
            return b2;
        }
        r40 r40 = this.f5877c;
        r40.a(this.f5876b, "mobile_ads_settings");
        return new m70();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.gms.internal.ads.r40.a
    public final /* synthetic */ j60 a(d60 d60) {
        return d60.getMobileAdsSettingsManagerWithClientJarVersion(b.a(this.f5876b), n.GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }
}
