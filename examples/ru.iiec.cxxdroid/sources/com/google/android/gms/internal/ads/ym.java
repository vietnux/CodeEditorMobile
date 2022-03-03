package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.mr;

public final class ym extends mr<ym, a> implements us {
    private static volatile dt<ym> zzakh;
    private static final ym zzdko = new ym();
    private int zzdir;
    private an zzdkm;

    public static final class a extends mr.a<ym, a> implements us {
        private a() {
            super(ym.zzdko);
        }

        /* synthetic */ a(zm zmVar) {
            this();
        }
    }

    static {
        mr.a(ym.class, zzdko);
    }

    private ym() {
    }

    public static ym a(fq fqVar) {
        return (ym) mr.a(zzdko, fqVar);
    }

    public static ym k() {
        return zzdko;
    }

    /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.ads.mr$b, com.google.android.gms.internal.ads.dt<com.google.android.gms.internal.ads.ym>] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // com.google.android.gms.internal.ads.mr
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(int r2, java.lang.Object r3, java.lang.Object r4) {
        /*
        // Method dump skipped, instructions count: 102
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ym.a(int, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public final int i() {
        return this.zzdir;
    }

    public final an j() {
        an anVar = this.zzdkm;
        return anVar == null ? an.k() : anVar;
    }
}
