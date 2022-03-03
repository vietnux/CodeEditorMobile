package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.mr;

public final class rn extends mr<rn, a> implements us {
    private static volatile dt<rn> zzakh;
    private static final rn zzdme = new rn();
    private String zzdmd = "";

    public static final class a extends mr.a<rn, a> implements us {
        private a() {
            super(rn.zzdme);
        }

        /* synthetic */ a(sn snVar) {
            this();
        }
    }

    static {
        mr.a(rn.class, zzdme);
    }

    private rn() {
    }

    public static rn a(fq fqVar) {
        return (rn) mr.a(zzdme, fqVar);
    }

    public static rn j() {
        return zzdme;
    }

    /* JADX WARN: Type inference failed for: r1v13, types: [com.google.android.gms.internal.ads.dt<com.google.android.gms.internal.ads.rn>, com.google.android.gms.internal.ads.mr$b] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // com.google.android.gms.internal.ads.mr
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(int r1, java.lang.Object r2, java.lang.Object r3) {
        /*
            r0 = this;
            int[] r2 = com.google.android.gms.internal.ads.sn.a
            r3 = 1
            int r1 = r1 - r3
            r1 = r2[r1]
            r2 = 0
            switch(r1) {
                case 1: goto L_0x0049;
                case 2: goto L_0x0043;
                case 3: goto L_0x0033;
                case 4: goto L_0x0030;
                case 5: goto L_0x0016;
                case 6: goto L_0x0011;
                case 7: goto L_0x0010;
                default: goto L_0x000a;
            }
        L_0x000a:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
        L_0x0010:
            return r2
        L_0x0011:
            java.lang.Byte r1 = java.lang.Byte.valueOf(r3)
            return r1
        L_0x0016:
            com.google.android.gms.internal.ads.dt<com.google.android.gms.internal.ads.rn> r1 = com.google.android.gms.internal.ads.rn.zzakh
            if (r1 != 0) goto L_0x002f
            java.lang.Class<com.google.android.gms.internal.ads.rn> r2 = com.google.android.gms.internal.ads.rn.class
            monitor-enter(r2)
            com.google.android.gms.internal.ads.dt<com.google.android.gms.internal.ads.rn> r1 = com.google.android.gms.internal.ads.rn.zzakh     // Catch:{ all -> 0x002c }
            if (r1 != 0) goto L_0x002a
            com.google.android.gms.internal.ads.mr$b r1 = new com.google.android.gms.internal.ads.mr$b     // Catch:{ all -> 0x002c }
            com.google.android.gms.internal.ads.rn r3 = com.google.android.gms.internal.ads.rn.zzdme     // Catch:{ all -> 0x002c }
            r1.<init>(r3)     // Catch:{ all -> 0x002c }
            com.google.android.gms.internal.ads.rn.zzakh = r1     // Catch:{ all -> 0x002c }
        L_0x002a:
            monitor-exit(r2)     // Catch:{ all -> 0x002c }
            goto L_0x002f
        L_0x002c:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x002c }
            throw r1
        L_0x002f:
            return r1
        L_0x0030:
            com.google.android.gms.internal.ads.rn r1 = com.google.android.gms.internal.ads.rn.zzdme
            return r1
        L_0x0033:
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r2 = 0
            java.lang.String r3 = "zzdmd"
            r1[r2] = r3
            com.google.android.gms.internal.ads.rn r2 = com.google.android.gms.internal.ads.rn.zzdme
            java.lang.String r3 = "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0002\u0000\u0000\u0000\u0001Ȉ"
            java.lang.Object r1 = com.google.android.gms.internal.ads.mr.a(r2, r3, r1)
            return r1
        L_0x0043:
            com.google.android.gms.internal.ads.rn$a r1 = new com.google.android.gms.internal.ads.rn$a
            r1.<init>(r2)
            return r1
        L_0x0049:
            com.google.android.gms.internal.ads.rn r1 = new com.google.android.gms.internal.ads.rn
            r1.<init>()
            return r1
            switch-data {1->0x0049, 2->0x0043, 3->0x0033, 4->0x0030, 5->0x0016, 6->0x0011, 7->0x0010, }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.rn.a(int, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public final String i() {
        return this.zzdmd;
    }
}
