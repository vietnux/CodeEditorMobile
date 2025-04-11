package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.n;
import com.google.android.gms.internal.ads.r40;
import e.b.b.a.b.b;

/* access modifiers changed from: package-private */
public final class v40 extends r40.a<m50> {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Context f5806b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f5807c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ ri0 f5808d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ r40 f5809e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    v40(r40 r40, Context context, String str, ri0 ri0) {
        super();
        this.f5809e = r40;
        this.f5806b = context;
        this.f5807c = str;
        this.f5808d = ri0;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.gms.internal.ads.r40.a
    public final /* synthetic */ m50 a() {
        m50 a = this.f5809e.f5388d.a(this.f5806b, this.f5807c, this.f5808d);
        if (a != null) {
            return a;
        }
        r40 r40 = this.f5809e;
        r40.a(this.f5806b, "native_ad");
        return new g70();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.gms.internal.ads.r40.a
    public final /* synthetic */ m50 a(d60 d60) {
        return d60.createAdLoaderBuilder(b.a(this.f5806b), this.f5807c, this.f5808d, n.GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }
}
