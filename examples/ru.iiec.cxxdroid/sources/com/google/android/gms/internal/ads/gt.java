package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.mr;

/* access modifiers changed from: package-private */
public final class gt implements qs {
    private final ss a;

    /* renamed from: b  reason: collision with root package name */
    private final ht f4441b;

    gt(ss ssVar, String str, Object[] objArr) {
        this.a = ssVar;
        this.f4441b = new ht(ssVar.getClass(), str, objArr);
    }

    @Override // com.google.android.gms.internal.ads.qs
    public final int a() {
        return (this.f4441b.f4552d & 1) == 1 ? mr.e.f4984i : mr.e.f4985j;
    }

    @Override // com.google.android.gms.internal.ads.qs
    public final boolean b() {
        return (this.f4441b.f4552d & 2) == 2;
    }

    @Override // com.google.android.gms.internal.ads.qs
    public final ss c() {
        return this.a;
    }

    public final int d() {
        return this.f4441b.f4553e;
    }

    /* access modifiers changed from: package-private */
    public final ht e() {
        return this.f4441b;
    }

    public final int f() {
        return this.f4441b.f4556h;
    }

    public final int g() {
        return this.f4441b.f4557i;
    }

    public final int h() {
        return this.f4441b.f4558j;
    }

    public final int i() {
        return this.f4441b.f4561m;
    }

    /* access modifiers changed from: package-private */
    public final int[] j() {
        return this.f4441b.n;
    }

    public final int k() {
        return this.f4441b.f4560l;
    }

    public final int l() {
        return this.f4441b.f4559k;
    }
}
