package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.mr;

public final class wn extends mr<wn, a> implements us {
    private static volatile dt<wn> zzakh;
    private static final wn zzdmj = new wn();
    private String zzdmh = "";
    private hn zzdmi;

    public static final class a extends mr.a<wn, a> implements us {
        private a() {
            super(wn.zzdmj);
        }

        /* synthetic */ a(xn xnVar) {
            this();
        }
    }

    static {
        mr.a(wn.class, zzdmj);
    }

    private wn() {
    }

    public static wn a(fq fqVar) {
        return (wn) mr.a(zzdmj, fqVar);
    }

    public static wn k() {
        return zzdmj;
    }

    /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.ads.mr$b, com.google.android.gms.internal.ads.dt<com.google.android.gms.internal.ads.wn>] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // com.google.android.gms.internal.ads.mr
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(int r2, java.lang.Object r3, java.lang.Object r4) {
        /*
        // Method dump skipped, instructions count: 102
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.wn.a(int, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public final String i() {
        return this.zzdmh;
    }

    public final hn j() {
        hn hnVar = this.zzdmi;
        return hnVar == null ? hn.k() : hnVar;
    }
}
