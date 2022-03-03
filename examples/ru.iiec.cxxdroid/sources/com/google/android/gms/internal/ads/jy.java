package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;

public final class jy extends ez {

    /* renamed from: j  reason: collision with root package name */
    private static volatile cw f4739j;

    /* renamed from: k  reason: collision with root package name */
    private static final Object f4740k = new Object();

    /* renamed from: i  reason: collision with root package name */
    private tm f4741i = null;

    public jy(tx txVar, String str, String str2, xp xpVar, int i2, int i3, tm tmVar) {
        super(txVar, str, str2, xpVar, i2, 27);
        this.f4741i = tmVar;
    }

    private final String c() {
        try {
            if (this.f4241b.l() != null) {
                this.f4241b.l().get();
            }
            xp k2 = this.f4241b.k();
            if (k2 == null || k2.y == null) {
                return null;
            }
            return k2.y;
        } catch (InterruptedException | ExecutionException unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x007b  */
    @Override // com.google.android.gms.internal.ads.ez
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
        // Method dump skipped, instructions count: 279
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.jy.a():void");
    }
}
