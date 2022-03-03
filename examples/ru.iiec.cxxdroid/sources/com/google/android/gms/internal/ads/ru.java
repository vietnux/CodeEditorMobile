package com.google.android.gms.internal.ads;

public enum ru {
    DOUBLE(wu.DOUBLE, 1),
    FLOAT(wu.FLOAT, 5),
    INT64(wu.LONG, 0),
    UINT64(wu.LONG, 0),
    INT32(wu.INT, 0),
    FIXED64(wu.LONG, 1),
    FIXED32(wu.INT, 5),
    BOOL(wu.BOOLEAN, 0),
    STRING(wu.STRING, 2) {
    },
    GROUP(wu.MESSAGE, 3) {
    },
    MESSAGE(wu.MESSAGE, 2) {
    },
    BYTES(wu.BYTE_STRING, 2) {
    },
    UINT32(wu.INT, 0),
    ENUM(wu.ENUM, 0),
    SFIXED32(wu.INT, 5),
    SFIXED64(wu.LONG, 1),
    SINT32(wu.INT, 0),
    SINT64(wu.LONG, 0);
    

    /* renamed from: b  reason: collision with root package name */
    private final wu f5470b;

    /* renamed from: c  reason: collision with root package name */
    private final int f5471c;

    private ru(wu wuVar, int i2) {
        this.f5470b = wuVar;
        this.f5471c = i2;
    }

    /* synthetic */ ru(wu wuVar, int i2, qu quVar) {
        this(wuVar, i2);
    }

    public final wu h() {
        return this.f5470b;
    }
}
