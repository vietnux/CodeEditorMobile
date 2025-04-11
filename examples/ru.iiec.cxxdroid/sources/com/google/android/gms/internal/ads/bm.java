package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.mr;

public final class bm extends mr<bm, a> implements us {
    private static volatile dt<bm> zzakh;
    private static final bm zzdjb = new bm();
    private int zzdih;
    private fq zzdip = fq.f4347c;

    public static final class a extends mr.a<bm, a> implements us {
        private a() {
            super(bm.zzdjb);
        }

        /* synthetic */ a(cm cmVar) {
            this();
        }

        public final a a(int i2) {
            g();
            ((bm) this.f4975c).b((bm) 0);
            return this;
        }

        public final a a(fq fqVar) {
            g();
            ((bm) this.f4975c).a((bm) fqVar);
            return this;
        }
    }

    static {
        mr.a(bm.class, zzdjb);
    }

    private bm() {
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

    public static bm b(fq fqVar) {
        return (bm) mr.a(zzdjb, fqVar);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void b(int i2) {
        this.zzdih = i2;
    }

    public static a k() {
        return (a) zzdjb.a(mr.e.f4980e, (Object) null, (Object) null);
    }

    /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.ads.dt<com.google.android.gms.internal.ads.bm>, com.google.android.gms.internal.ads.mr$b] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // com.google.android.gms.internal.ads.mr
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(int r2, java.lang.Object r3, java.lang.Object r4) {
        /*
        // Method dump skipped, instructions count: 102
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bm.a(int, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public final int i() {
        return this.zzdih;
    }

    public final fq j() {
        return this.zzdip;
    }
}
