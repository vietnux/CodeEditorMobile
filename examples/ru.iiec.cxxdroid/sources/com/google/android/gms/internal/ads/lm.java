package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.mr;

public final class lm extends mr<lm, a> implements us {
    private static volatile dt<lm> zzakh;
    private static final lm zzdjq = new lm();
    private int zzdih;
    private fq zzdip = fq.f4347c;
    private nm zzdjp;

    public static final class a extends mr.a<lm, a> implements us {
        private a() {
            super(lm.zzdjq);
        }

        /* synthetic */ a(mm mmVar) {
            this();
        }

        public final a a(int i2) {
            g();
            ((lm) this.f4975c).b((lm) 0);
            return this;
        }

        public final a a(fq fqVar) {
            g();
            ((lm) this.f4975c).a((lm) fqVar);
            return this;
        }

        public final a a(nm nmVar) {
            g();
            ((lm) this.f4975c).a((lm) nmVar);
            return this;
        }
    }

    static {
        mr.a(lm.class, zzdjq);
    }

    private lm() {
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(fq fqVar) {
        if (fqVar != null) {
            this.zzdip = fqVar;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(nm nmVar) {
        if (nmVar != null) {
            this.zzdjp = nmVar;
            return;
        }
        throw new NullPointerException();
    }

    public static lm b(fq fqVar) {
        return (lm) mr.a(zzdjq, fqVar);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void b(int i2) {
        this.zzdih = i2;
    }

    public static a o() {
        return (a) zzdjq.a(mr.e.f4980e, (Object) null, (Object) null);
    }

    /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.ads.mr$b, com.google.android.gms.internal.ads.dt<com.google.android.gms.internal.ads.lm>] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // com.google.android.gms.internal.ads.mr
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(int r2, java.lang.Object r3, java.lang.Object r4) {
        /*
        // Method dump skipped, instructions count: 108
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.lm.a(int, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public final int i() {
        return this.zzdih;
    }

    public final fq j() {
        return this.zzdip;
    }

    public final nm k() {
        nm nmVar = this.zzdjp;
        return nmVar == null ? nm.q() : nmVar;
    }
}
