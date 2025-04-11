package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

final class os implements ns {
    os() {
    }

    @Override // com.google.android.gms.internal.ads.ns
    public final int a(int i2, Object obj, Object obj2) {
        ms msVar = (ms) obj;
        if (msVar.isEmpty()) {
            return 0;
        }
        Iterator it = msVar.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.internal.ads.ns
    public final Object a(Object obj) {
        return ms.e().d();
    }

    @Override // com.google.android.gms.internal.ads.ns
    public final Object a(Object obj, Object obj2) {
        ms msVar = (ms) obj;
        ms msVar2 = (ms) obj2;
        if (!msVar2.isEmpty()) {
            if (!msVar.b()) {
                msVar = msVar.d();
            }
            msVar.a(msVar2);
        }
        return msVar;
    }

    @Override // com.google.android.gms.internal.ads.ns
    public final Object b(Object obj) {
        ((ms) obj).c();
        return obj;
    }

    @Override // com.google.android.gms.internal.ads.ns
    public final boolean c(Object obj) {
        return !((ms) obj).b();
    }

    @Override // com.google.android.gms.internal.ads.ns
    public final Map<?, ?> d(Object obj) {
        return (ms) obj;
    }

    @Override // com.google.android.gms.internal.ads.ns
    public final ls<?, ?> e(Object obj) {
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.internal.ads.ns
    public final Map<?, ?> f(Object obj) {
        return (ms) obj;
    }
}
