package com.crashlytics.android.e;

import com.crashlytics.android.e.o0;

class h implements t {
    private final v a;

    /* renamed from: b  reason: collision with root package name */
    private final f0 f2919b;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a = new int[o0.a.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                com.crashlytics.android.e.o0$a[] r0 = com.crashlytics.android.e.o0.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.crashlytics.android.e.h.a.a = r0
                int[] r0 = com.crashlytics.android.e.h.a.a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.crashlytics.android.e.o0$a r1 = com.crashlytics.android.e.o0.a.JAVA     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = com.crashlytics.android.e.h.a.a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.crashlytics.android.e.o0$a r1 = com.crashlytics.android.e.o0.a.NATIVE     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.crashlytics.android.e.h.a.<clinit>():void");
        }
    }

    public h(v vVar, f0 f0Var) {
        this.a = vVar;
        this.f2919b = f0Var;
    }

    @Override // com.crashlytics.android.e.t
    public boolean a(s sVar) {
        int i2 = a.a[sVar.f3033b.a().ordinal()];
        if (i2 == 1) {
            this.a.a(sVar);
            return true;
        } else if (i2 != 2) {
            return false;
        } else {
            this.f2919b.a(sVar);
            return true;
        }
    }
}
