package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.mr;

public final class vl extends mr<vl, a> implements us {
    private static volatile dt<vl> zzakh;
    private static final vl zzdiy = new vl();
    private int zzdit;

    public static final class a extends mr.a<vl, a> implements us {
        private a() {
            super(vl.zzdiy);
        }

        /* synthetic */ a(wl wlVar) {
            this();
        }
    }

    static {
        mr.a(vl.class, zzdiy);
    }

    private vl() {
    }

    public static vl j() {
        return zzdiy;
    }

    /* JADX WARN: Type inference failed for: r1v13, types: [com.google.android.gms.internal.ads.mr$b, com.google.android.gms.internal.ads.dt<com.google.android.gms.internal.ads.vl>] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // com.google.android.gms.internal.ads.mr
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(int r1, java.lang.Object r2, java.lang.Object r3) {
        /*
            r0 = this;
            int[] r2 = com.google.android.gms.internal.ads.wl.a
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
            com.google.android.gms.internal.ads.dt<com.google.android.gms.internal.ads.vl> r1 = com.google.android.gms.internal.ads.vl.zzakh
            if (r1 != 0) goto L_0x002f
            java.lang.Class<com.google.android.gms.internal.ads.vl> r2 = com.google.android.gms.internal.ads.vl.class
            monitor-enter(r2)
            com.google.android.gms.internal.ads.dt<com.google.android.gms.internal.ads.vl> r1 = com.google.android.gms.internal.ads.vl.zzakh     // Catch:{ all -> 0x002c }
            if (r1 != 0) goto L_0x002a
            com.google.android.gms.internal.ads.mr$b r1 = new com.google.android.gms.internal.ads.mr$b     // Catch:{ all -> 0x002c }
            com.google.android.gms.internal.ads.vl r3 = com.google.android.gms.internal.ads.vl.zzdiy     // Catch:{ all -> 0x002c }
            r1.<init>(r3)     // Catch:{ all -> 0x002c }
            com.google.android.gms.internal.ads.vl.zzakh = r1     // Catch:{ all -> 0x002c }
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
            com.google.android.gms.internal.ads.vl r1 = com.google.android.gms.internal.ads.vl.zzdiy
            return r1
        L_0x0033:
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r2 = 0
            java.lang.String r3 = "zzdit"
            r1[r2] = r3
            com.google.android.gms.internal.ads.vl r2 = com.google.android.gms.internal.ads.vl.zzdiy
            java.lang.String r3 = "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0002\u0000\u0000\u0000\u0001\u000b"
            java.lang.Object r1 = com.google.android.gms.internal.ads.mr.a(r2, r3, r1)
            return r1
        L_0x0043:
            com.google.android.gms.internal.ads.vl$a r1 = new com.google.android.gms.internal.ads.vl$a
            r1.<init>(r2)
            return r1
        L_0x0049:
            com.google.android.gms.internal.ads.vl r1 = new com.google.android.gms.internal.ads.vl
            r1.<init>()
            return r1
            switch-data {1->0x0049, 2->0x0043, 3->0x0033, 4->0x0030, 5->0x0016, 6->0x0011, 7->0x0010, }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.vl.a(int, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public final int i() {
        return this.zzdit;
    }
}
