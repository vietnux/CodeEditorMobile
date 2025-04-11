package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.mr;
import java.util.List;

public final class ln extends mr<ln, a> implements us {
    private static volatile dt<ln> zzakh;
    private static final ln zzdlt = new ln();
    private int zzdlq;
    private int zzdlr;
    private rr<b> zzdls = mr.h();

    public static final class a extends mr.a<ln, a> implements us {
        private a() {
            super(ln.zzdlt);
        }

        /* synthetic */ a(mn mnVar) {
            this();
        }
    }

    public static final class b extends mr<b, a> implements us {
        private static volatile dt<b> zzakh;
        private static final b zzdlx = new b();
        private int zzdlj;
        private cn zzdlu;
        private int zzdlv;
        private int zzdlw;

        public static final class a extends mr.a<b, a> implements us {
            private a() {
                super(b.zzdlx);
            }

            /* synthetic */ a(mn mnVar) {
                this();
            }
        }

        static {
            mr.a(b.class, zzdlx);
        }

        private b() {
        }

        /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.ads.mr$b, com.google.android.gms.internal.ads.dt<com.google.android.gms.internal.ads.ln$b>] */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // com.google.android.gms.internal.ads.mr
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object a(int r2, java.lang.Object r3, java.lang.Object r4) {
            /*
            // Method dump skipped, instructions count: 112
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ln.b.a(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }

        public final boolean i() {
            return this.zzdlu != null;
        }

        public final cn j() {
            cn cnVar = this.zzdlu;
            return cnVar == null ? cn.p() : cnVar;
        }

        public final fn k() {
            fn a2 = fn.a(this.zzdlv);
            return a2 == null ? fn.UNRECOGNIZED : a2;
        }

        public final int o() {
            return this.zzdlw;
        }

        public final yn p() {
            yn a2 = yn.a(this.zzdlj);
            return a2 == null ? yn.UNRECOGNIZED : a2;
        }
    }

    static {
        mr.a(ln.class, zzdlt);
    }

    private ln() {
    }

    public static ln a(byte[] bArr) {
        return (ln) mr.b(zzdlt, bArr);
    }

    /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.ads.mr$b, com.google.android.gms.internal.ads.dt<com.google.android.gms.internal.ads.ln>] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // com.google.android.gms.internal.ads.mr
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(int r2, java.lang.Object r3, java.lang.Object r4) {
        /*
        // Method dump skipped, instructions count: 112
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ln.a(int, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public final int i() {
        return this.zzdlr;
    }

    public final List<b> j() {
        return this.zzdls;
    }

    public final int k() {
        return this.zzdls.size();
    }
}
