package com.google.android.gms.internal.ads;

public enum yn implements pr {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    UNRECOGNIZED(-1);
    

    /* renamed from: b  reason: collision with root package name */
    private final int f6142b;

    static {
        new zn();
    }

    private yn(int i2) {
        this.f6142b = i2;
    }

    public static yn a(int i2) {
        if (i2 == 0) {
            return UNKNOWN_PREFIX;
        }
        if (i2 == 1) {
            return TINK;
        }
        if (i2 == 2) {
            return LEGACY;
        }
        if (i2 == 3) {
            return RAW;
        }
        if (i2 != 4) {
            return null;
        }
        return CRUNCHY;
    }

    @Override // com.google.android.gms.internal.ads.pr
    public final int b() {
        if (this != UNRECOGNIZED) {
            return this.f6142b;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
