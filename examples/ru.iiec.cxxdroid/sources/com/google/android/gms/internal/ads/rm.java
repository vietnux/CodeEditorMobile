package com.google.android.gms.internal.ads;

public enum rm implements pr {
    UNKNOWN_CURVE(0),
    NIST_P224(1),
    NIST_P256(2),
    NIST_P384(3),
    NIST_P521(4),
    UNRECOGNIZED(-1);
    

    /* renamed from: b  reason: collision with root package name */
    private final int f5452b;

    static {
        new sm();
    }

    private rm(int i2) {
        this.f5452b = i2;
    }

    public static rm a(int i2) {
        if (i2 == 0) {
            return UNKNOWN_CURVE;
        }
        if (i2 == 1) {
            return NIST_P224;
        }
        if (i2 == 2) {
            return NIST_P256;
        }
        if (i2 == 3) {
            return NIST_P384;
        }
        if (i2 != 4) {
            return null;
        }
        return NIST_P521;
    }

    @Override // com.google.android.gms.internal.ads.pr
    public final int b() {
        if (this != UNRECOGNIZED) {
            return this.f5452b;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
