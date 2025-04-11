package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.mr;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class zq {

    /* renamed from: b  reason: collision with root package name */
    static final zq f6216b = new zq(true);
    private final Map<ar, mr.d<?, ?>> a;

    static {
        a();
    }

    zq() {
        this.a = new HashMap();
    }

    private zq(boolean z) {
        this.a = Collections.emptyMap();
    }

    private static Class<?> a() {
        try {
            return Class.forName("com.google.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static zq b() {
        return yq.b();
    }

    public final <ContainingType extends ss> mr.d<ContainingType, ?> a(ContainingType containingtype, int i2) {
        return (mr.d<ContainingType, ?>) this.a.get(new ar(containingtype, i2));
    }
}
