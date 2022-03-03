package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
public final class yq {
    private static final Class<?> a = a();

    private static Class<?> a() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static zq b() {
        Class<?> cls = a;
        if (cls != null) {
            try {
                return (zq) cls.getDeclaredMethod("getEmptyRegistry", new Class[0]).invoke(null, new Object[0]);
            } catch (Exception unused) {
            }
        }
        return zq.f6216b;
    }
}
