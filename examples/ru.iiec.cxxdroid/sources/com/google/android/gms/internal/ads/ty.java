package com.google.android.gms.internal.ads;

import java.util.List;

public final class ty extends ez {

    /* renamed from: i  reason: collision with root package name */
    private List<Long> f5676i = null;

    public ty(tx txVar, String str, String str2, xp xpVar, int i2, int i3) {
        super(txVar, str, str2, xpVar, i2, 31);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.ez
    public final void a() {
        this.f4244e.A = -1L;
        this.f4244e.B = -1L;
        if (this.f5676i == null) {
            this.f5676i = (List) this.f4245f.invoke(null, this.f4241b.a());
        }
        List<Long> list = this.f5676i;
        if (list != null && list.size() == 2) {
            synchronized (this.f4244e) {
                this.f4244e.A = Long.valueOf(this.f5676i.get(0).longValue());
                this.f4244e.B = Long.valueOf(this.f5676i.get(1).longValue());
            }
        }
    }
}
