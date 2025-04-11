package com.google.android.gms.internal.ads;

final class ct {
    private static final at a = c();

    /* renamed from: b  reason: collision with root package name */
    private static final at f4044b = new bt();

    static at a() {
        return a;
    }

    static at b() {
        return f4044b;
    }

    private static at c() {
        try {
            return (at) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
