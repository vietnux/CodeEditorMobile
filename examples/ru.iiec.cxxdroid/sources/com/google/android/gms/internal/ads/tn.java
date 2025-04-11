package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.mr;

public final class tn extends mr<tn, a> implements us {
    private static volatile dt<tn> zzakh;
    private static final tn zzdmg = new tn();
    private int zzdih;
    private wn zzdmf;

    public static final class a extends mr.a<tn, a> implements us {
        private a() {
            super(tn.zzdmg);
        }

        /* synthetic */ a(vn vnVar) {
            this();
        }

        public final a a(int i2) {
            g();
            ((tn) this.f4975c).b(0);
            return this;
        }

        public final a a(wn wnVar) {
            g();
            ((tn) this.f4975c).a((tn) wnVar);
            return this;
        }
    }

    static {
        mr.a(tn.class, zzdmg);
    }

    private tn() {
    }

    public static tn a(fq fqVar) {
        return (tn) mr.a(zzdmg, fqVar);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(wn wnVar) {
        if (wnVar != null) {
            this.zzdmf = wnVar;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void b(int i2) {
        this.zzdih = i2;
    }

    public static a k() {
        return (a) zzdmg.a(mr.e.f4980e, (Object) null, (Object) null);
    }

    /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.ads.dt<com.google.android.gms.internal.ads.tn>, com.google.android.gms.internal.ads.mr$b] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // com.google.android.gms.internal.ads.mr
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(int r2, java.lang.Object r3, java.lang.Object r4) {
        /*
        // Method dump skipped, instructions count: 102
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.tn.a(int, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public final int i() {
        return this.zzdih;
    }

    public final wn j() {
        wn wnVar = this.zzdmf;
        return wnVar == null ? wn.k() : wnVar;
    }
}
