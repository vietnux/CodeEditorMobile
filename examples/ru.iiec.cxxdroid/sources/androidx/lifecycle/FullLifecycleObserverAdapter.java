package androidx.lifecycle;

import androidx.lifecycle.f;

/* access modifiers changed from: package-private */
public class FullLifecycleObserverAdapter implements g {
    private final b a;

    /* renamed from: b  reason: collision with root package name */
    private final g f1437b;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a = new int[f.b.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                androidx.lifecycle.f$b[] r0 = androidx.lifecycle.f.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.lifecycle.FullLifecycleObserverAdapter.a.a = r0
                int[] r0 = androidx.lifecycle.FullLifecycleObserverAdapter.a.a     // Catch:{ NoSuchFieldError -> 0x0014 }
                androidx.lifecycle.f$b r1 = androidx.lifecycle.f.b.ON_CREATE     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = androidx.lifecycle.FullLifecycleObserverAdapter.a.a     // Catch:{ NoSuchFieldError -> 0x001f }
                androidx.lifecycle.f$b r1 = androidx.lifecycle.f.b.ON_START     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = androidx.lifecycle.FullLifecycleObserverAdapter.a.a     // Catch:{ NoSuchFieldError -> 0x002a }
                androidx.lifecycle.f$b r1 = androidx.lifecycle.f.b.ON_RESUME     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = androidx.lifecycle.FullLifecycleObserverAdapter.a.a     // Catch:{ NoSuchFieldError -> 0x0035 }
                androidx.lifecycle.f$b r1 = androidx.lifecycle.f.b.ON_PAUSE     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = androidx.lifecycle.FullLifecycleObserverAdapter.a.a     // Catch:{ NoSuchFieldError -> 0x0040 }
                androidx.lifecycle.f$b r1 = androidx.lifecycle.f.b.ON_STOP     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r0 = androidx.lifecycle.FullLifecycleObserverAdapter.a.a     // Catch:{ NoSuchFieldError -> 0x004b }
                androidx.lifecycle.f$b r1 = androidx.lifecycle.f.b.ON_DESTROY     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                int[] r0 = androidx.lifecycle.FullLifecycleObserverAdapter.a.a     // Catch:{ NoSuchFieldError -> 0x0056 }
                androidx.lifecycle.f$b r1 = androidx.lifecycle.f.b.ON_ANY     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.FullLifecycleObserverAdapter.a.<clinit>():void");
        }
    }

    FullLifecycleObserverAdapter(b bVar, g gVar) {
        this.a = bVar;
        this.f1437b = gVar;
    }

    @Override // androidx.lifecycle.g
    public void a(i iVar, f.b bVar) {
        switch (a.a[bVar.ordinal()]) {
            case 1:
                this.a.c(iVar);
                break;
            case 2:
                this.a.e(iVar);
                break;
            case 3:
                this.a.a(iVar);
                break;
            case 4:
                this.a.d(iVar);
                break;
            case 5:
                this.a.f(iVar);
                break;
            case 6:
                this.a.b(iVar);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        g gVar = this.f1437b;
        if (gVar != null) {
            gVar.a(iVar, bVar);
        }
    }
}
