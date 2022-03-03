package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.mr;

public final class nn extends mr<nn, a> implements us {
    private static volatile dt<nn> zzakh;
    private static final nn zzdlz = new nn();
    private int zzdlq;
    private int zzdlr;
    private rr<b> zzdly = mr.h();

    public static final class a extends mr.a<nn, a> implements us {
        private a() {
            super(nn.zzdlz);
        }

        /* synthetic */ a(on onVar) {
            this();
        }

        public final a a(int i2) {
            g();
            ((nn) this.f4975c).b(i2);
            return this;
        }

        public final a a(b bVar) {
            g();
            ((nn) this.f4975c).a((nn) bVar);
            return this;
        }
    }

    public static final class b extends mr<b, a> implements us {
        private static volatile dt<b> zzakh;
        private static final b zzdma = new b();
        private String zzdks = "";
        private int zzdlj;
        private int zzdlv;
        private int zzdlw;

        public static final class a extends mr.a<b, a> implements us {
            private a() {
                super(b.zzdma);
            }

            /* synthetic */ a(on onVar) {
                this();
            }

            public final a a(int i2) {
                g();
                ((b) this.f4975c).b(i2);
                return this;
            }

            public final a a(fn fnVar) {
                g();
                ((b) this.f4975c).a((b) fnVar);
                return this;
            }

            public final a a(yn ynVar) {
                g();
                ((b) this.f4975c).a((b) ynVar);
                return this;
            }

            public final a a(String str) {
                g();
                ((b) this.f4975c).a((b) str);
                return this;
            }
        }

        static {
            mr.a(b.class, zzdma);
        }

        private b() {
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void a(fn fnVar) {
            if (fnVar != null) {
                this.zzdlv = fnVar.b();
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void a(yn ynVar) {
            if (ynVar != null) {
                this.zzdlj = ynVar.b();
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

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void b(int i2) {
            this.zzdlw = i2;
        }

        public static a i() {
            return (a) zzdma.a(mr.e.f4980e, (Object) null, (Object) null);
        }

        /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.ads.mr$b, com.google.android.gms.internal.ads.dt<com.google.android.gms.internal.ads.nn$b>] */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // com.google.android.gms.internal.ads.mr
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object a(int r2, java.lang.Object r3, java.lang.Object r4) {
            /*
            // Method dump skipped, instructions count: 112
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.nn.b.a(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    static {
        mr.a(nn.class, zzdlz);
    }

    private nn() {
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(b bVar) {
        if (bVar != null) {
            if (!this.zzdly.q()) {
                rr<b> rrVar = this.zzdly;
                int size = rrVar.size();
                this.zzdly = rrVar.a(size == 0 ? 10 : size << 1);
            }
            this.zzdly.add(bVar);
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void b(int i2) {
        this.zzdlr = i2;
    }

    public static a i() {
        return (a) zzdlz.a(mr.e.f4980e, (Object) null, (Object) null);
    }

    /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.ads.mr$b, com.google.android.gms.internal.ads.dt<com.google.android.gms.internal.ads.nn>] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // com.google.android.gms.internal.ads.mr
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(int r2, java.lang.Object r3, java.lang.Object r4) {
        /*
        // Method dump skipped, instructions count: 112
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.nn.a(int, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
