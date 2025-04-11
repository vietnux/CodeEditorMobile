package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.mr;

public final class tl extends mr<tl, a> implements us {
    private static volatile dt<tl> zzakh;
    private static final tl zzdix = new tl();
    private int zzdir;
    private vl zzdiv;

    public static final class a extends mr.a<tl, a> implements us {
        private a() {
            super(tl.zzdix);
        }

        /* synthetic */ a(ul ulVar) {
            this();
        }
    }

    static {
        mr.a(tl.class, zzdix);
    }

    private tl() {
    }

    public static tl a(fq fqVar) {
        return (tl) mr.a(zzdix, fqVar);
    }

    /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.ads.mr$b, com.google.android.gms.internal.ads.dt<com.google.android.gms.internal.ads.tl>] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // com.google.android.gms.internal.ads.mr
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(int r2, java.lang.Object r3, java.lang.Object r4) {
        /*
        // Method dump skipped, instructions count: 102
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.tl.a(int, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public final int i() {
        return this.zzdir;
    }

    public final vl j() {
        vl vlVar = this.zzdiv;
        return vlVar == null ? vl.j() : vlVar;
    }
}
