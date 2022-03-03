package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.mr;

public final class xl extends mr<xl, a> implements us {
    private static volatile dt<xl> zzakh;
    private static final xl zzdiz = new xl();
    private int zzdih;
    private fq zzdip = fq.f4347c;

    public static final class a extends mr.a<xl, a> implements us {
        private a() {
            super(xl.zzdiz);
        }

        /* synthetic */ a(yl ylVar) {
            this();
        }

        public final a a(int i2) {
            g();
            ((xl) this.f4975c).b((xl) 0);
            return this;
        }

        public final a a(fq fqVar) {
            g();
            ((xl) this.f4975c).a((xl) fqVar);
            return this;
        }
    }

    static {
        mr.a(xl.class, zzdiz);
    }

    private xl() {
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

    public static xl b(fq fqVar) {
        return (xl) mr.a(zzdiz, fqVar);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void b(int i2) {
        this.zzdih = i2;
    }

    public static a k() {
        return (a) zzdiz.a(mr.e.f4980e, (Object) null, (Object) null);
    }

    /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.ads.mr$b, com.google.android.gms.internal.ads.dt<com.google.android.gms.internal.ads.xl>] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // com.google.android.gms.internal.ads.mr
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(int r2, java.lang.Object r3, java.lang.Object r4) {
        /*
        // Method dump skipped, instructions count: 102
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.xl.a(int, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public final int i() {
        return this.zzdih;
    }

    public final fq j() {
        return this.zzdip;
    }
}
