package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.mr;
import java.util.List;

public final class ao extends mr<ao, a> implements us {
    private static volatile dt<ao> zzakh;
    private static final ao zzdmt = new ao();
    private int zzdlq;
    private String zzdmr = "";
    private rr<jn> zzdms = mr.h();

    public static final class a extends mr.a<ao, a> implements us {
        private a() {
            super(ao.zzdmt);
        }

        /* synthetic */ a(bo boVar) {
            this();
        }

        public final a a(jn jnVar) {
            g();
            ((ao) this.f4975c).a((ao) jnVar);
            return this;
        }

        public final a a(String str) {
            g();
            ((ao) this.f4975c).a((ao) str);
            return this;
        }
    }

    static {
        mr.a(ao.class, zzdmt);
    }

    private ao() {
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(jn jnVar) {
        if (jnVar != null) {
            if (!this.zzdms.q()) {
                rr<jn> rrVar = this.zzdms;
                int size = rrVar.size();
                this.zzdms = rrVar.a(size == 0 ? 10 : size << 1);
            }
            this.zzdms.add(jnVar);
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(String str) {
        if (str != null) {
            this.zzdmr = str;
            return;
        }
        throw new NullPointerException();
    }

    public static a j() {
        return (a) zzdmt.a(mr.e.f4980e, (Object) null, (Object) null);
    }

    /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.ads.mr$b, com.google.android.gms.internal.ads.dt<com.google.android.gms.internal.ads.ao>] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // com.google.android.gms.internal.ads.mr
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(int r2, java.lang.Object r3, java.lang.Object r4) {
        /*
        // Method dump skipped, instructions count: 112
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ao.a(int, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public final List<jn> i() {
        return this.zzdms;
    }
}
