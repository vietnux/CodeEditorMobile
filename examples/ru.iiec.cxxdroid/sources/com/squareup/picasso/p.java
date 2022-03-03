package com.squareup.picasso;

public enum p {
    NO_CACHE(1),
    NO_STORE(2);
    

    /* renamed from: b  reason: collision with root package name */
    final int f6860b;

    private p(int i2) {
        this.f6860b = i2;
    }

    static boolean a(int i2) {
        return (i2 & NO_CACHE.f6860b) == 0;
    }

    static boolean b(int i2) {
        return (i2 & NO_STORE.f6860b) == 0;
    }
}
