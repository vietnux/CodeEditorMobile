package com.google.android.gms.internal.ads;

import java.util.List;

final class gs extends ds {
    private gs() {
        super();
    }

    private static <E> rr<E> c(Object obj, long j2) {
        return (rr) ju.f(obj, j2);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.ds
    public final <L> List<L> a(Object obj, long j2) {
        rr c2 = c(obj, j2);
        if (c2.q()) {
            return c2;
        }
        int size = c2.size();
        rr a = c2.a(size == 0 ? 10 : size << 1);
        ju.a(obj, j2, a);
        return a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.ds
    public final <E> void a(Object obj, Object obj2, long j2) {
        rr<E> c2 = c(obj, j2);
        rr<E> c3 = c(obj2, j2);
        int size = c2.size();
        int size2 = c3.size();
        rr<E> rrVar = c2;
        rrVar = c2;
        if (size > 0 && size2 > 0) {
            boolean q = c2.q();
            rr<E> rrVar2 = c2;
            if (!q) {
                rrVar2 = c2.a(size2 + size);
            }
            rrVar2.addAll(c3);
            rrVar = rrVar2;
        }
        if (size > 0) {
            c3 = rrVar;
        }
        ju.a(obj, j2, c3);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.ds
    public final void b(Object obj, long j2) {
        c(obj, j2).p();
    }
}
