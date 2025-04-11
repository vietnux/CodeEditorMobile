package com.squareup.picasso;

public enum q {
    NO_CACHE(1),
    NO_STORE(2),
    OFFLINE(4);
    

    /* renamed from: b  reason: collision with root package name */
    final int f6865b;

    private q(int i2) {
        this.f6865b = i2;
    }

    public static boolean a(int i2) {
        return (i2 & OFFLINE.f6865b) != 0;
    }

    public static boolean b(int i2) {
        return (i2 & NO_CACHE.f6865b) == 0;
    }

    public static boolean c(int i2) {
        return (i2 & NO_STORE.f6865b) == 0;
    }
}
