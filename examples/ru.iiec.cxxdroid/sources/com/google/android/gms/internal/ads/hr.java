package com.google.android.gms.internal.ads;

public enum hr {
    DOUBLE(0, jr.SCALAR, ur.DOUBLE),
    FLOAT(1, jr.SCALAR, ur.FLOAT),
    INT64(2, jr.SCALAR, ur.LONG),
    UINT64(3, jr.SCALAR, ur.LONG),
    INT32(4, jr.SCALAR, ur.INT),
    FIXED64(5, jr.SCALAR, ur.LONG),
    FIXED32(6, jr.SCALAR, ur.INT),
    BOOL(7, jr.SCALAR, ur.BOOLEAN),
    STRING(8, jr.SCALAR, ur.STRING),
    MESSAGE(9, jr.SCALAR, ur.MESSAGE),
    BYTES(10, jr.SCALAR, ur.BYTE_STRING),
    UINT32(11, jr.SCALAR, ur.INT),
    ENUM(12, jr.SCALAR, ur.ENUM),
    SFIXED32(13, jr.SCALAR, ur.INT),
    SFIXED64(14, jr.SCALAR, ur.LONG),
    SINT32(15, jr.SCALAR, ur.INT),
    SINT64(16, jr.SCALAR, ur.LONG),
    GROUP(17, jr.SCALAR, ur.MESSAGE),
    DOUBLE_LIST(18, jr.VECTOR, ur.DOUBLE),
    FLOAT_LIST(19, jr.VECTOR, ur.FLOAT),
    INT64_LIST(20, jr.VECTOR, ur.LONG),
    UINT64_LIST(21, jr.VECTOR, ur.LONG),
    INT32_LIST(22, jr.VECTOR, ur.INT),
    FIXED64_LIST(23, jr.VECTOR, ur.LONG),
    FIXED32_LIST(24, jr.VECTOR, ur.INT),
    BOOL_LIST(25, jr.VECTOR, ur.BOOLEAN),
    STRING_LIST(26, jr.VECTOR, ur.STRING),
    MESSAGE_LIST(27, jr.VECTOR, ur.MESSAGE),
    BYTES_LIST(28, jr.VECTOR, ur.BYTE_STRING),
    UINT32_LIST(29, jr.VECTOR, ur.INT),
    ENUM_LIST(30, jr.VECTOR, ur.ENUM),
    SFIXED32_LIST(31, jr.VECTOR, ur.INT),
    SFIXED64_LIST(32, jr.VECTOR, ur.LONG),
    SINT32_LIST(33, jr.VECTOR, ur.INT),
    SINT64_LIST(34, jr.VECTOR, ur.LONG),
    DOUBLE_LIST_PACKED(35, jr.PACKED_VECTOR, ur.DOUBLE),
    FLOAT_LIST_PACKED(36, jr.PACKED_VECTOR, ur.FLOAT),
    INT64_LIST_PACKED(37, jr.PACKED_VECTOR, ur.LONG),
    UINT64_LIST_PACKED(38, jr.PACKED_VECTOR, ur.LONG),
    INT32_LIST_PACKED(39, jr.PACKED_VECTOR, ur.INT),
    FIXED64_LIST_PACKED(40, jr.PACKED_VECTOR, ur.LONG),
    FIXED32_LIST_PACKED(41, jr.PACKED_VECTOR, ur.INT),
    BOOL_LIST_PACKED(42, jr.PACKED_VECTOR, ur.BOOLEAN),
    UINT32_LIST_PACKED(43, jr.PACKED_VECTOR, ur.INT),
    ENUM_LIST_PACKED(44, jr.PACKED_VECTOR, ur.ENUM),
    SFIXED32_LIST_PACKED(45, jr.PACKED_VECTOR, ur.INT),
    SFIXED64_LIST_PACKED(46, jr.PACKED_VECTOR, ur.LONG),
    SINT32_LIST_PACKED(47, jr.PACKED_VECTOR, ur.INT),
    SINT64_LIST_PACKED(48, jr.PACKED_VECTOR, ur.LONG),
    GROUP_LIST(49, jr.VECTOR, ur.MESSAGE),
    MAP(50, jr.MAP, ur.VOID);
    
    private static final hr[] b0;

    /* renamed from: b  reason: collision with root package name */
    private final int f4547b;

    static {
        hr[] values = values();
        b0 = new hr[values.length];
        for (hr hrVar : values) {
            b0[hrVar.f4547b] = hrVar;
        }
    }

    private hr(int i2, jr jrVar, ur urVar) {
        int i3;
        this.f4547b = i2;
        int i4 = ir.a[jrVar.ordinal()];
        if (i4 == 1 || i4 == 2) {
            urVar.h();
        }
        if (jrVar == jr.SCALAR && (i3 = ir.f4643b[urVar.ordinal()]) != 1 && i3 != 2) {
        }
    }

    public final int h() {
        return this.f4547b;
    }
}
