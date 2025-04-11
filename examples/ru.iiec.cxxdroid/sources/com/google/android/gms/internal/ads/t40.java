package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.n;
import com.google.android.gms.internal.ads.r40;
import e.b.b.a.b.b;

/* access modifiers changed from: package-private */
public final class t40 extends r40.a<r50> {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Context f5586b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ n40 f5587c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ String f5588d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ r40 f5589e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    t40(r40 r40, Context context, n40 n40, String str) {
        super();
        this.f5589e = r40;
        this.f5586b = context;
        this.f5587c = n40;
        this.f5588d = str;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.gms.internal.ads.r40.a
    public final /* synthetic */ r50 a() {
        r50 a = this.f5589e.f5387c.a(this.f5586b, this.f5587c, this.f5588d, null, 3);
        if (a != null) {
            return a;
        }
        r40 r40 = this.f5589e;
        r40.a(this.f5586b, "search");
        return new k70();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.gms.internal.ads.r40.a
    public final /* synthetic */ r50 a(d60 d60) {
        return d60.createSearchAdManager(b.a(this.f5586b), this.f5587c, this.f5588d, n.GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }
}
