package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.cv;

public abstract class cv<M extends cv<M>> extends iv {

    /* renamed from: b  reason: collision with root package name */
    protected ev f4045b;

    @Override // com.google.android.gms.internal.ads.iv
    public void a(av avVar) {
        if (this.f4045b != null) {
            for (int i2 = 0; i2 < this.f4045b.a(); i2++) {
                this.f4045b.b(i2).a(avVar);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final boolean a(yu yuVar, int i2) {
        int a = yuVar.a();
        if (!yuVar.b(i2)) {
            return false;
        }
        int i3 = i2 >>> 3;
        kv kvVar = new kv(i2, yuVar.a(a, yuVar.a() - a));
        fv fvVar = null;
        ev evVar = this.f4045b;
        if (evVar == null) {
            this.f4045b = new ev();
        } else {
            fvVar = evVar.a(i3);
        }
        if (fvVar == null) {
            fvVar = new fv();
            this.f4045b.a(i3, fvVar);
        }
        fvVar.a(kvVar);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.iv
    public final /* synthetic */ iv b() {
        return (cv) clone();
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.iv
    public int c() {
        if (this.f4045b == null) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f4045b.a(); i3++) {
            i2 += this.f4045b.b(i3).a();
        }
        return i2;
    }

    @Override // com.google.android.gms.internal.ads.iv
    public /* synthetic */ Object clone() {
        cv cvVar = (cv) super.clone();
        gv.a(this, cvVar);
        return cvVar;
    }
}
