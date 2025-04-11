package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.x0;
import java.util.Random;

/* access modifiers changed from: package-private */
public final class ue0 extends h50 {

    /* renamed from: b  reason: collision with root package name */
    private final g50 f5730b;

    ue0(g50 g50) {
        this.f5730b = g50;
    }

    @Override // com.google.android.gms.internal.ads.g50
    public final void A0() {
        this.f5730b.A0();
    }

    @Override // com.google.android.gms.internal.ads.g50
    public final void X() {
        if (ef0.a()) {
            int intValue = ((Integer) a50.g().a(k80.Z0)).intValue();
            int intValue2 = ((Integer) a50.g().a(k80.a1)).intValue();
            if (intValue <= 0 || intValue2 < 0) {
                x0.s().a();
            } else {
                u9.f5718h.postDelayed(ve0.f5840b, (long) (intValue + new Random().nextInt(intValue2 + 1)));
            }
        }
        this.f5730b.X();
    }

    @Override // com.google.android.gms.internal.ads.g50
    public final void c(int i2) {
        this.f5730b.c(i2);
    }

    @Override // com.google.android.gms.internal.ads.g50
    public final void d() {
        this.f5730b.d();
    }

    @Override // com.google.android.gms.internal.ads.g50
    public final void f0() {
        this.f5730b.f0();
    }

    @Override // com.google.android.gms.internal.ads.g50
    public final void j0() {
        this.f5730b.j0();
    }

    @Override // com.google.android.gms.internal.ads.g50
    public final void n0() {
        this.f5730b.n0();
    }
}
