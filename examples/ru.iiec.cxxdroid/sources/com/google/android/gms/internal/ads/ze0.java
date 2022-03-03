package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.m;
import com.google.android.gms.ads.internal.x0;

/* access modifiers changed from: package-private */
public final class ze0 {
    m a;

    /* renamed from: b  reason: collision with root package name */
    j40 f6199b;

    /* renamed from: c  reason: collision with root package name */
    sd0 f6200c;

    /* renamed from: d  reason: collision with root package name */
    long f6201d;

    /* renamed from: e  reason: collision with root package name */
    boolean f6202e;

    /* renamed from: f  reason: collision with root package name */
    boolean f6203f;

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ ye0 f6204g;

    ze0(ye0 ye0, rd0 rd0) {
        this.f6204g = ye0;
        this.a = rd0.b(ye0.a(ye0));
        this.f6200c = new sd0();
        sd0 sd0 = this.f6200c;
        m mVar = this.a;
        mVar.b(new td0(sd0));
        mVar.a(new ce0(sd0));
        mVar.a(new ee0(sd0));
        mVar.a(new ge0(sd0));
        mVar.a(new ie0(sd0));
    }

    ze0(ye0 ye0, rd0 rd0, j40 j40) {
        this(ye0, rd0);
        this.f6199b = j40;
    }

    /* access modifiers changed from: package-private */
    public final boolean a() {
        if (this.f6202e) {
            return false;
        }
        j40 j40 = this.f6199b;
        if (j40 == null) {
            j40 = ye0.b(this.f6204g);
        }
        this.f6203f = this.a.b(we0.b(j40));
        this.f6202e = true;
        this.f6201d = x0.m().a();
        return true;
    }
}
