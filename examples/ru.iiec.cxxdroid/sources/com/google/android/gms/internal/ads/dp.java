package com.google.android.gms.internal.ads;

public final class dp {
    private final byte[] a;

    private dp(byte[] bArr, int i2, int i3) {
        this.a = new byte[i3];
        System.arraycopy(bArr, 0, this.a, 0, i3);
    }

    public static dp a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return new dp(bArr, 0, bArr.length);
    }

    public final byte[] a() {
        byte[] bArr = this.a;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }
}
