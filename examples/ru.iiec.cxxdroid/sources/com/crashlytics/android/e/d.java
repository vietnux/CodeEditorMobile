package com.crashlytics.android.e;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

final class d {
    private final byte[] a;

    /* renamed from: b  reason: collision with root package name */
    private volatile int f2907b = 0;

    static {
        new d(new byte[0]);
    }

    private d(byte[] bArr) {
        this.a = bArr;
    }

    public static d a(String str) {
        try {
            return new d(str.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException("UTF-8 not supported.", e2);
        }
    }

    public static d a(byte[] bArr, int i2, int i3) {
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, i2, bArr2, 0, i3);
        return new d(bArr2);
    }

    public InputStream a() {
        return new ByteArrayInputStream(this.a);
    }

    public void a(byte[] bArr, int i2, int i3, int i4) {
        System.arraycopy(this.a, i2, bArr, i3, i4);
    }

    public int b() {
        return this.a.length;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        byte[] bArr = this.a;
        int length = bArr.length;
        byte[] bArr2 = ((d) obj).a;
        if (length != bArr2.length) {
            return false;
        }
        for (int i2 = 0; i2 < length; i2++) {
            if (bArr[i2] != bArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i2 = this.f2907b;
        if (i2 == 0) {
            byte[] bArr = this.a;
            int length = bArr.length;
            int i3 = length;
            for (byte b2 : bArr) {
                i3 = (i3 * 31) + b2;
            }
            i2 = i3 == 0 ? 1 : i3;
            this.f2907b = i2;
        }
        return i2;
    }
}
