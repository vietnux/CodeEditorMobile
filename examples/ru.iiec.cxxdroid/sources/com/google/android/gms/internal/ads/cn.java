package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.mr;

public final class cn extends mr<cn, a> implements us {
    private static volatile dt<cn> zzakh;
    private static final cn zzdkv = new cn();
    private String zzdks = "";
    private fq zzdkt = fq.f4347c;
    private int zzdku;

    public static final class a extends mr.a<cn, a> implements us {
        private a() {
            super(cn.zzdkv);
        }

        /* synthetic */ a(dn dnVar) {
            this();
        }

        public final a a(b bVar) {
            g();
            ((cn) this.f4975c).a((cn) bVar);
            return this;
        }

        public final a a(fq fqVar) {
            g();
            ((cn) this.f4975c).a((cn) fqVar);
            return this;
        }

        public final a a(String str) {
            g();
            ((cn) this.f4975c).a((cn) str);
            return this;
        }
    }

    public enum b implements pr {
        UNKNOWN_KEYMATERIAL(0),
        SYMMETRIC(1),
        ASYMMETRIC_PRIVATE(2),
        ASYMMETRIC_PUBLIC(3),
        REMOTE(4),
        UNRECOGNIZED(-1);
        

        /* renamed from: b  reason: collision with root package name */
        private final int f4039b;

        static {
            new en();
        }

        private b(int i2) {
            this.f4039b = i2;
        }

        public static b a(int i2) {
            if (i2 == 0) {
                return UNKNOWN_KEYMATERIAL;
            }
            if (i2 == 1) {
                return SYMMETRIC;
            }
            if (i2 == 2) {
                return ASYMMETRIC_PRIVATE;
            }
            if (i2 == 3) {
                return ASYMMETRIC_PUBLIC;
            }
            if (i2 != 4) {
                return null;
            }
            return REMOTE;
        }

        @Override // com.google.android.gms.internal.ads.pr
        public final int b() {
            if (this != UNRECOGNIZED) {
                return this.f4039b;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    static {
        mr.a(cn.class, zzdkv);
    }

    private cn() {
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(b bVar) {
        if (bVar != null) {
            this.zzdku = bVar.b();
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(fq fqVar) {
        if (fqVar != null) {
            this.zzdkt = fqVar;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(String str) {
        if (str != null) {
            this.zzdks = str;
            return;
        }
        throw new NullPointerException();
    }

    public static a o() {
        return (a) zzdkv.a(mr.e.f4980e, (Object) null, (Object) null);
    }

    public static cn p() {
        return zzdkv;
    }

    /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.ads.dt<com.google.android.gms.internal.ads.cn>, com.google.android.gms.internal.ads.mr$b] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // com.google.android.gms.internal.ads.mr
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(int r2, java.lang.Object r3, java.lang.Object r4) {
        /*
        // Method dump skipped, instructions count: 108
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.cn.a(int, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public final String i() {
        return this.zzdks;
    }

    public final fq j() {
        return this.zzdkt;
    }

    public final b k() {
        b a2 = b.a(this.zzdku);
        return a2 == null ? b.UNRECOGNIZED : a2;
    }
}
