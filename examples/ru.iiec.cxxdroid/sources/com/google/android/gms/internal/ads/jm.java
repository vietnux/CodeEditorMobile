package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.mr;

public final class jm extends mr<jm, a> implements us {
    private static volatile dt<jm> zzakh;
    private static final jm zzdjo = new jm();
    private pm zzdjl;
    private fm zzdjm;
    private int zzdjn;

    public static final class a extends mr.a<jm, a> implements us {
        private a() {
            super(jm.zzdjo);
        }

        /* synthetic */ a(km kmVar) {
            this();
        }
    }

    static {
        mr.a(jm.class, zzdjo);
    }

    private jm() {
    }

    public static jm o() {
        return zzdjo;
    }

    /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.ads.mr$b, com.google.android.gms.internal.ads.dt<com.google.android.gms.internal.ads.jm>] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // com.google.android.gms.internal.ads.mr
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(int r2, java.lang.Object r3, java.lang.Object r4) {
        /*
        // Method dump skipped, instructions count: 108
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.jm.a(int, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public final pm i() {
        pm pmVar = this.zzdjl;
        return pmVar == null ? pm.o() : pmVar;
    }

    public final fm j() {
        fm fmVar = this.zzdjm;
        return fmVar == null ? fm.j() : fmVar;
    }

    public final dm k() {
        dm a2 = dm.a(this.zzdjn);
        return a2 == null ? dm.UNRECOGNIZED : a2;
    }
}
