package com.google.android.gms.internal.ads;

public final class z20 {
    public static int a(int i2) {
        if (i2 >= 0 && i2 <= 1) {
            return i2;
        }
        if (i2 >= 1000 && i2 <= 1000) {
            return i2;
        }
        StringBuilder sb = new StringBuilder(43);
        sb.append(i2);
        sb.append(" is not a valid enum EnumBoolean");
        throw new IllegalArgumentException(sb.toString());
    }
}
