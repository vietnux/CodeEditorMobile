package com.google.firebase.components;

public final class t {
    public static <T> T a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    public static void a(boolean z, String str) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }
}
