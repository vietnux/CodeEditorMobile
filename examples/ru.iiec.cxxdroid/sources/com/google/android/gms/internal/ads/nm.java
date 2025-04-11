package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.mr;

public final class nm extends mr<nm, a> implements us {
    private static volatile dt<nm> zzakh;
    private static final nm zzdjt = new nm();
    private int zzdih;
    private jm zzdjj;
    private fq zzdjr;
    private fq zzdjs;

    public static final class a extends mr.a<nm, a> implements us {
        private a() {
            super(nm.zzdjt);
        }

        /* synthetic */ a(om omVar) {
            this();
        }

        public final a a(int i2) {
            g();
            ((nm) this.f4975c).b((nm) 0);
            return this;
        }

        public final a a(fq fqVar) {
            g();
            ((nm) this.f4975c).c(fqVar);
            return this;
        }

        public final a a(jm jmVar) {
            g();
            ((nm) this.f4975c).a((nm) jmVar);
            return this;
        }

        public final a b(fq fqVar) {
            g();
            ((nm) this.f4975c).a((nm) fqVar);
            return this;
        }
    }

    static {
        mr.a(nm.class, zzdjt);
    }

    private nm() {
        fq fqVar = fq.f4347c;
        this.zzdjr = fqVar;
        this.zzdjs = fqVar;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(fq fqVar) {
        if (fqVar != null) {
            this.zzdjs = fqVar;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(jm jmVar) {
        if (jmVar != null) {
            this.zzdjj = jmVar;
            return;
        }
        throw new NullPointerException();
    }

    public static nm b(fq fqVar) {
        return (nm) mr.a(zzdjt, fqVar);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void b(int i2) {
        this.zzdih = i2;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void c(fq fqVar) {
        if (fqVar != null) {
            this.zzdjr = fqVar;
            return;
        }
        throw new NullPointerException();
    }

    public static a p() {
        return (a) zzdjt.a(mr.e.f4980e, (Object) null, (Object) null);
    }

    public static nm q() {
        return zzdjt;
    }

    /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.ads.dt<com.google.android.gms.internal.ads.nm>, com.google.android.gms.internal.ads.mr$b] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // com.google.android.gms.internal.ads.mr
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(int r2, java.lang.Object r3, java.lang.Object r4) {
        /*
        // Method dump skipped, instructions count: 112
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.nm.a(int, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public final int i() {
        return this.zzdih;
    }

    public final jm j() {
        jm jmVar = this.zzdjj;
        return jmVar == null ? jm.o() : jmVar;
    }

    public final fq k() {
        return this.zzdjr;
    }

    public final fq o() {
        return this.zzdjs;
    }
}
