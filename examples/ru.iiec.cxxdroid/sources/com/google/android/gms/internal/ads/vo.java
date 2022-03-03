package com.google.android.gms.internal.ads;

public final class vo {
    public static int a(int i2) {
        if (i2 >= 0 && i2 <= 2) {
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

    public static int b(int i2) {
        if (i2 >= 0 && i2 <= 2) {
            return i2;
        }
        StringBuilder sb = new StringBuilder(41);
        sb.append(i2);
        sb.append(" is not a valid enum ProtoName");
        throw new IllegalArgumentException(sb.toString());
    }

    public static int c(int i2) {
        if (i2 >= 0 && i2 <= 3) {
            return i2;
        }
        StringBuilder sb = new StringBuilder(48);
        sb.append(i2);
        sb.append(" is not a valid enum EncryptionMethod");
        throw new IllegalArgumentException(sb.toString());
    }
}
