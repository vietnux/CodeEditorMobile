package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.n;
import com.google.android.gms.internal.ads.r40;
import e.b.b.a.b.b;

/* access modifiers changed from: package-private */
public final class u40 extends r40.a<r50> {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Context f5690b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ n40 f5691c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ String f5692d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ ri0 f5693e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ r40 f5694f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    u40(r40 r40, Context context, n40 n40, String str, ri0 ri0) {
        super();
        this.f5694f = r40;
        this.f5690b = context;
        this.f5691c = n40;
        this.f5692d = str;
        this.f5693e = ri0;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.gms.internal.ads.r40.a
    public final /* synthetic */ r50 a() {
        r50 a = this.f5694f.f5387c.a(this.f5690b, this.f5691c, this.f5692d, this.f5693e, 2);
        if (a != null) {
            return a;
        }
        r40 r40 = this.f5694f;
        r40.a(this.f5690b, "interstitial");
        return new k70();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.gms.internal.ads.r40.a
    public final /* synthetic */ r50 a(d60 d60) {
        return d60.createInterstitialAdManager(b.a(this.f5690b), this.f5691c, this.f5692d, this.f5693e, n.GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }
}
