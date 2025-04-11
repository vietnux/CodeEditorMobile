package com.google.android.gms.internal.ads;

final class dr {
    private static final br<?> a = new cr();

    /* renamed from: b  reason: collision with root package name */
    private static final br<?> f4132b = a();

    private static br<?> a() {
        try {
            return (br) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    static br<?> b() {
        return a;
    }

    static br<?> c() {
        br<?> brVar = f4132b;
        if (brVar != null) {
            return brVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}
