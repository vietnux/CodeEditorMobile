package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.mr;

public final class kl extends mr<kl, a> implements us {
    private static volatile dt<kl> zzakh;
    private static final kl zzdiq = new kl();
    private int zzdih;
    private ol zzdio;
    private fq zzdip = fq.f4347c;

    public static final class a extends mr.a<kl, a> implements us {
        private a() {
            super(kl.zzdiq);
        }

        /* synthetic */ a(ll llVar) {
            this();
        }

        public final a a(int i2) {
            g();
            ((kl) this.f4975c).b((kl) 0);
            return this;
        }

        public final a a(fq fqVar) {
            g();
            ((kl) this.f4975c).a((kl) fqVar);
            return this;
        }

        public final a a(ol olVar) {
            g();
            ((kl) this.f4975c).a((kl) olVar);
            return this;
        }
    }

    static {
        mr.a(kl.class, zzdiq);
    }

    private kl() {
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
    private final void a(ol olVar) {
        if (olVar != null) {
            this.zzdio = olVar;
            return;
        }
        throw new NullPointerException();
    }

    public static kl b(fq fqVar) {
        return (kl) mr.a(zzdiq, fqVar);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void b(int i2) {
        this.zzdih = i2;
    }

    public static a o() {
        return (a) zzdiq.a(mr.e.f4980e, (Object) null, (Object) null);
    }

    public static kl p() {
        return zzdiq;
    }

    /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.ads.mr$b, com.google.android.gms.internal.ads.dt<com.google.android.gms.internal.ads.kl>] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // com.google.android.gms.internal.ads.mr
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(int r2, java.lang.Object r3, java.lang.Object r4) {
        /*
        // Method dump skipped, instructions count: 108
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.kl.a(int, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public final int i() {
        return this.zzdih;
    }

    public final ol j() {
        ol olVar = this.zzdio;
        return olVar == null ? ol.j() : olVar;
    }

    public final fq k() {
        return this.zzdip;
    }
}
