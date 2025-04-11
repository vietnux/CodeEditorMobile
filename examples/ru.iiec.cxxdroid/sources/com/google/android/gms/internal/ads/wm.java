package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.mr;

public final class wm extends mr<wm, a> implements us {
    private static volatile dt<wm> zzakh;
    private static final wm zzdkn = new wm();
    private int zzdih;
    private fq zzdip = fq.f4347c;
    private an zzdkm;

    public static final class a extends mr.a<wm, a> implements us {
        private a() {
            super(wm.zzdkn);
        }

        /* synthetic */ a(xm xmVar) {
            this();
        }

        public final a a(int i2) {
            g();
            ((wm) this.f4975c).b((wm) 0);
            return this;
        }

        public final a a(an anVar) {
            g();
            ((wm) this.f4975c).a((wm) anVar);
            return this;
        }

        public final a a(fq fqVar) {
            g();
            ((wm) this.f4975c).b((wm) fqVar);
            return this;
        }
    }

    static {
        mr.a(wm.class, zzdkn);
    }

    private wm() {
    }

    public static wm a(fq fqVar) {
        return (wm) mr.a(zzdkn, fqVar);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(an anVar) {
        if (anVar != null) {
            this.zzdkm = anVar;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void b(int i2) {
        this.zzdih = i2;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void b(fq fqVar) {
        if (fqVar != null) {
            this.zzdip = fqVar;
            return;
        }
        throw new NullPointerException();
    }

    public static a o() {
        return (a) zzdkn.a(mr.e.f4980e, (Object) null, (Object) null);
    }

    public static wm p() {
        return zzdkn;
    }

    /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.ads.mr$b, com.google.android.gms.internal.ads.dt<com.google.android.gms.internal.ads.wm>] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // com.google.android.gms.internal.ads.mr
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(int r2, java.lang.Object r3, java.lang.Object r4) {
        /*
        // Method dump skipped, instructions count: 108
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.wm.a(int, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public final int i() {
        return this.zzdih;
    }

    public final fq j() {
        return this.zzdip;
    }

    public final an k() {
        an anVar = this.zzdkm;
        return anVar == null ? an.k() : anVar;
    }
}
