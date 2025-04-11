package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.mr;

public final class an extends mr<an, a> implements us {
    private static volatile dt<an> zzakh;
    private static final an zzdkr = new an();
    private int zzdkp;
    private int zzdkq;

    public static final class a extends mr.a<an, a> implements us {
        private a() {
            super(an.zzdkr);
        }

        /* synthetic */ a(bn bnVar) {
            this();
        }
    }

    static {
        mr.a(an.class, zzdkr);
    }

    private an() {
    }

    public static an k() {
        return zzdkr;
    }

    /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.ads.dt<com.google.android.gms.internal.ads.an>, com.google.android.gms.internal.ads.mr$b] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // com.google.android.gms.internal.ads.mr
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(int r2, java.lang.Object r3, java.lang.Object r4) {
        /*
        // Method dump skipped, instructions count: 102
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.an.a(int, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public final um i() {
        um a2 = um.a(this.zzdkp);
        return a2 == null ? um.UNRECOGNIZED : a2;
    }

    public final int j() {
        return this.zzdkq;
    }
}
