package com.google.android.gms.internal.ads;

public enum dm implements pr {
    UNKNOWN_FORMAT(0),
    UNCOMPRESSED(1),
    COMPRESSED(2),
    UNRECOGNIZED(-1);
    

    /* renamed from: b  reason: collision with root package name */
    private final int f4126b;

    static {
        new em();
    }

    private dm(int i2) {
        this.f4126b = i2;
    }

    public static dm a(int i2) {
        if (i2 == 0) {
            return UNKNOWN_FORMAT;
        }
        if (i2 == 1) {
            return UNCOMPRESSED;
        }
        if (i2 != 2) {
            return null;
        }
        return COMPRESSED;
    }

    @Override // com.google.android.gms.internal.ads.pr
    public final int b() {
        if (this != UNRECOGNIZED) {
            return this.f4126b;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
