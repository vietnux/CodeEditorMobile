package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.mr;

/* access modifiers changed from: package-private */
public final class lr implements rs {
    private static final lr a = new lr();

    private lr() {
    }

    public static lr a() {
        return a;
    }

    @Override // com.google.android.gms.internal.ads.rs
    public final boolean a(Class<?> cls) {
        return mr.class.isAssignableFrom(cls);
    }

    @Override // com.google.android.gms.internal.ads.rs
    public final qs b(Class<?> cls) {
        if (!mr.class.isAssignableFrom(cls)) {
            String valueOf = String.valueOf(cls.getName());
            throw new IllegalArgumentException(valueOf.length() != 0 ? "Unsupported message type: ".concat(valueOf) : new String("Unsupported message type: "));
        }
        try {
            return (qs) mr.a(cls.asSubclass(mr.class)).a(mr.e.f4978c, (Object) null, (Object) null);
        } catch (Exception e2) {
            String valueOf2 = String.valueOf(cls.getName());
            throw new RuntimeException(valueOf2.length() != 0 ? "Unable to get message info for ".concat(valueOf2) : new String("Unable to get message info for "), e2);
        }
    }
}
