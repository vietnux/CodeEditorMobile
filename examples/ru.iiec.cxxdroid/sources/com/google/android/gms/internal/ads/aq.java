package com.google.android.gms.internal.ads;

final class aq {
    private static final Class<?> a = a("libcore.io.Memory");

    /* renamed from: b  reason: collision with root package name */
    private static final boolean f3822b = (a("org.robolectric.Robolectric") != null);

    private static <T> Class<T> a(String str) {
        try {
            return (Class<T>) Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean a() {
        return a != null && !f3822b;
    }

    static Class<?> b() {
        return a;
    }
}
