package com.google.android.gms.internal.ads;

import android.app.Activity;
import com.google.android.gms.internal.ads.r40;
import e.b.b.a.b.b;

/* access modifiers changed from: package-private */
public final class z40 extends r40.a<r> {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Activity f6180b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ r40 f6181c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    z40(r40 r40, Activity activity) {
        super();
        this.f6181c = r40;
        this.f6180b = activity;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.gms.internal.ads.r40.a
    public final /* synthetic */ r a() {
        r a = this.f6181c.f5391g.a(this.f6180b);
        if (a != null) {
            return a;
        }
        r40 r40 = this.f6181c;
        r40.a(this.f6180b, "ad_overlay");
        return null;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.gms.internal.ads.r40.a
    public final /* synthetic */ r a(d60 d60) {
        return d60.createAdOverlay(b.a(this.f6180b));
    }
}
