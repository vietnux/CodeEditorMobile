package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.mr;

public final class jn extends mr<jn, a> implements us {
    private static volatile dt<jn> zzakh;
    private static final jn zzdlp = new jn();
    private String zzdks = "";
    private String zzdll = "";
    private int zzdlm;
    private boolean zzdln;
    private String zzdlo = "";

    public static final class a extends mr.a<jn, a> implements us {
        private a() {
            super(jn.zzdlp);
        }

        /* synthetic */ a(kn knVar) {
            this();
        }

        public final a a(int i2) {
            g();
            ((jn) this.f4975c).b((jn) 0);
            return this;
        }

        public final a a(String str) {
            g();
            ((jn) this.f4975c).b((jn) str);
            return this;
        }

        public final a a(boolean z) {
            g();
            ((jn) this.f4975c).a((jn) true);
            return this;
        }

        public final a b(String str) {
            g();
            ((jn) this.f4975c).a((jn) str);
            return this;
        }

        public final a c(String str) {
            g();
            ((jn) this.f4975c).c(str);
            return this;
        }
    }

    static {
        mr.a(jn.class, zzdlp);
    }

    private jn() {
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

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(boolean z) {
        this.zzdln = z;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void b(int i2) {
        this.zzdlm = i2;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void b(String str) {
        if (str != null) {
            this.zzdll = str;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void c(String str) {
        if (str != null) {
            this.zzdlo = str;
            return;
        }
        throw new NullPointerException();
    }

    public static a q() {
        return (a) zzdlp.a(mr.e.f4980e, (Object) null, (Object) null);
    }

    /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.ads.mr$b, com.google.android.gms.internal.ads.dt<com.google.android.gms.internal.ads.jn>] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // com.google.android.gms.internal.ads.mr
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(int r2, java.lang.Object r3, java.lang.Object r4) {
        /*
        // Method dump skipped, instructions count: 118
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.jn.a(int, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public final String i() {
        return this.zzdks;
    }

    public final String j() {
        return this.zzdll;
    }

    public final int k() {
        return this.zzdlm;
    }

    public final boolean o() {
        return this.zzdln;
    }

    public final String p() {
        return this.zzdlo;
    }
}
