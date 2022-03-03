package com.google.android.gms.internal.ads;

public enum ur {
    VOID(Void.class, Void.class, null),
    INT(Integer.TYPE, Integer.class, 0),
    LONG(Long.TYPE, Long.class, 0L),
    FLOAT(Float.TYPE, Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.TYPE, Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.TYPE, Boolean.class, false),
    STRING(String.class, String.class, ""),
    BYTE_STRING(fq.class, fq.class, fq.f4347c),
    ENUM(Integer.TYPE, Integer.class, null),
    MESSAGE(Object.class, Object.class, null);
    

    /* renamed from: b  reason: collision with root package name */
    private final Class<?> f5776b;

    private ur(Class cls, Class cls2, Object obj) {
        this.f5776b = cls2;
    }

    public final Class<?> h() {
        return this.f5776b;
    }
}
