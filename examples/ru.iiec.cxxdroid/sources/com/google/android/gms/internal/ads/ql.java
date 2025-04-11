package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.mr;

public final class ql extends mr<ql, a> implements us {
    private static volatile dt<ql> zzakh;
    private static final ql zzdiw = new ql();
    private int zzdih;
    private fq zzdip = fq.f4347c;
    private vl zzdiv;

    public static final class a extends mr.a<ql, a> implements us {
        private a() {
            super(ql.zzdiw);
        }

        /* synthetic */ a(rl rlVar) {
            this();
        }

        public final a a(int i2) {
            g();
            ((ql) this.f4975c).b((ql) 0);
            return this;
        }

        public final a a(fq fqVar) {
            g();
            ((ql) this.f4975c).a((ql) fqVar);
            return this;
        }

        public final a a(vl vlVar) {
            g();
            ((ql) this.f4975c).a((ql) vlVar);
            return this;
        }
    }

    static {
        mr.a(ql.class, zzdiw);
    }

    private ql() {
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
    private final void a(vl vlVar) {
        if (vlVar != null) {
            this.zzdiv = vlVar;
            return;
        }
        throw new NullPointerException();
    }

    public static ql b(fq fqVar) {
        return (ql) mr.a(zzdiw, fqVar);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void b(int i2) {
        this.zzdih = i2;
    }

    public static a o() {
        return (a) zzdiw.a(mr.e.f4980e, (Object) null, (Object) null);
    }

    /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.ads.dt<com.google.android.gms.internal.ads.ql>, com.google.android.gms.internal.ads.mr$b] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // com.google.android.gms.internal.ads.mr
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(int r2, java.lang.Object r3, java.lang.Object r4) {
        /*
        // Method dump skipped, instructions count: 108
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ql.a(int, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public final int i() {
        return this.zzdih;
    }

    public final fq j() {
        return this.zzdip;
    }

    public final vl k() {
        vl vlVar = this.zzdiv;
        return vlVar == null ? vl.j() : vlVar;
    }
}
