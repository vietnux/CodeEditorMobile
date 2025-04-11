package com.google.android.gms.internal.ads;

public enum um implements pr {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA224(2),
    SHA256(3),
    SHA512(4),
    UNRECOGNIZED(-1);
    

    /* renamed from: b  reason: collision with root package name */
    private final int f5763b;

    static {
        new vm();
    }

    private um(int i2) {
        this.f5763b = i2;
    }

    public static um a(int i2) {
        if (i2 == 0) {
            return UNKNOWN_HASH;
        }
        if (i2 == 1) {
            return SHA1;
        }
        if (i2 == 2) {
            return SHA224;
        }
        if (i2 == 3) {
            return SHA256;
        }
        if (i2 != 4) {
            return null;
        }
        return SHA512;
    }

    @Override // com.google.android.gms.internal.ads.pr
    public final int b() {
        if (this != UNRECOGNIZED) {
            return this.f5763b;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
