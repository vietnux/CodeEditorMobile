package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.n;
import com.google.android.gms.internal.ads.r40;
import e.b.b.a.b.b;

/* access modifiers changed from: package-private */
public final class s40 extends r40.a<r50> {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Context f5503b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ n40 f5504c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ String f5505d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ ri0 f5506e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ r40 f5507f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    s40(r40 r40, Context context, n40 n40, String str, ri0 ri0) {
        super();
        this.f5507f = r40;
        this.f5503b = context;
        this.f5504c = n40;
        this.f5505d = str;
        this.f5506e = ri0;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.gms.internal.ads.r40.a
    public final /* synthetic */ r50 a() {
        r50 a = this.f5507f.f5387c.a(this.f5503b, this.f5504c, this.f5505d, this.f5506e, 1);
        if (a != null) {
            return a;
        }
        r40 r40 = this.f5507f;
        r40.a(this.f5503b, "banner");
        return new k70();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.gms.internal.ads.r40.a
    public final /* synthetic */ r50 a(d60 d60) {
        return d60.createBannerAdManager(b.a(this.f5503b), this.f5504c, this.f5505d, this.f5506e, n.GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }
}
