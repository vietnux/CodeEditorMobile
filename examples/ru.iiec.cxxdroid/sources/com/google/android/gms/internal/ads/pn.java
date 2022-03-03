package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.mr;

public final class pn extends mr<pn, a> implements us {
    private static volatile dt<pn> zzakh;
    private static final pn zzdmc = new pn();
    private int zzdih;
    private rn zzdmb;

    public static final class a extends mr.a<pn, a> implements us {
        private a() {
            super(pn.zzdmc);
        }

        /* synthetic */ a(qn qnVar) {
            this();
        }

        public final a a(int i2) {
            g();
            ((pn) this.f4975c).b(0);
            return this;
        }

        public final a a(rn rnVar) {
            g();
            ((pn) this.f4975c).a((pn) rnVar);
            return this;
        }
    }

    static {
        mr.a(pn.class, zzdmc);
    }

    private pn() {
    }

    public static pn a(fq fqVar) {
        return (pn) mr.a(zzdmc, fqVar);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(rn rnVar) {
        if (rnVar != null) {
            this.zzdmb = rnVar;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void b(int i2) {
        this.zzdih = i2;
    }

    public static a o() {
        return (a) zzdmc.a(mr.e.f4980e, (Object) null, (Object) null);
    }

    /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.ads.mr$b, com.google.android.gms.internal.ads.dt<com.google.android.gms.internal.ads.pn>] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // com.google.android.gms.internal.ads.mr
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(int r2, java.lang.Object r3, java.lang.Object r4) {
        /*
        // Method dump skipped, instructions count: 102
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.pn.a(int, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public final int i() {
        return this.zzdih;
    }

    public final rn j() {
        rn rnVar = this.zzdmb;
        return rnVar == null ? rn.j() : rnVar;
    }
}
