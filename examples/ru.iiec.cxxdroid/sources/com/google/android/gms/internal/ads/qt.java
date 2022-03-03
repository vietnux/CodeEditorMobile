package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* access modifiers changed from: package-private */
public final class qt extends wt {

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ nt f5360c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private qt(nt ntVar) {
        super(ntVar, null);
        this.f5360c = ntVar;
    }

    /* synthetic */ qt(nt ntVar, ot otVar) {
        this(ntVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, com.google.android.gms.internal.ads.wt, java.lang.Iterable
    public final Iterator<Map.Entry<K, V>> iterator() {
        return new pt(this.f5360c, null);
    }
}
