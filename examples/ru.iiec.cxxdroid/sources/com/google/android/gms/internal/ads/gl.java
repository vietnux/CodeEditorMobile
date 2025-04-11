package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.mr;

public final class gl extends mr<gl, a> implements us {
    private static volatile dt<gl> zzakh;
    private static final gl zzdik = new gl();
    private int zzdih;
    private kl zzdii;
    private wm zzdij;

    public static final class a extends mr.a<gl, a> implements us {
        private a() {
            super(gl.zzdik);
        }

        /* synthetic */ a(hl hlVar) {
            this();
        }

        public final a a(int i2) {
            g();
            ((gl) this.f4975c).b(i2);
            return this;
        }

        public final a a(kl klVar) {
            g();
            ((gl) this.f4975c).a((gl) klVar);
            return this;
        }

        public final a a(wm wmVar) {
            g();
            ((gl) this.f4975c).a((gl) wmVar);
            return this;
        }
    }

    static {
        mr.a(gl.class, zzdik);
    }

    private gl() {
    }

    public static gl a(fq fqVar) {
        return (gl) mr.a(zzdik, fqVar);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(kl klVar) {
        if (klVar != null) {
            this.zzdii = klVar;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(wm wmVar) {
        if (wmVar != null) {
            this.zzdij = wmVar;
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
        return (a) zzdik.a(mr.e.f4980e, (Object) null, (Object) null);
    }

    /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.ads.mr$b, com.google.android.gms.internal.ads.dt<com.google.android.gms.internal.ads.gl>] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // com.google.android.gms.internal.ads.mr
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(int r2, java.lang.Object r3, java.lang.Object r4) {
        /*
        // Method dump skipped, instructions count: 108
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.gl.a(int, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public final int i() {
        return this.zzdih;
    }

    public final kl j() {
        kl klVar = this.zzdii;
        return klVar == null ? kl.p() : klVar;
    }

    public final wm k() {
        wm wmVar = this.zzdij;
        return wmVar == null ? wm.p() : wmVar;
    }
}
