package com.google.android.gms.internal.ads;

final class ps {
    private static final ns a = c();

    /* renamed from: b  reason: collision with root package name */
    private static final ns f5260b = new os();

    static ns a() {
        return a;
    }

    static ns b() {
        return f5260b;
    }

    private static ns c() {
        try {
            return (ns) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
