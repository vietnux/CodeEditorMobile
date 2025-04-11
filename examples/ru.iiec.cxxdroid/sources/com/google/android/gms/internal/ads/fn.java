package com.google.android.gms.internal.ads;

public enum fn implements pr {
    UNKNOWN_STATUS(0),
    ENABLED(1),
    DISABLED(2),
    DESTROYED(3),
    UNRECOGNIZED(-1);
    

    /* renamed from: b  reason: collision with root package name */
    private final int f4343b;

    static {
        new gn();
    }

    private fn(int i2) {
        this.f4343b = i2;
    }

    public static fn a(int i2) {
        if (i2 == 0) {
            return UNKNOWN_STATUS;
        }
        if (i2 == 1) {
            return ENABLED;
        }
        if (i2 == 2) {
            return DISABLED;
        }
        if (i2 != 3) {
            return null;
        }
        return DESTROYED;
    }

    @Override // com.google.android.gms.internal.ads.pr
    public final int b() {
        if (this != UNRECOGNIZED) {
            return this.f4343b;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
