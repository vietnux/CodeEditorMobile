package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public final class or {
    static final Charset a = Charset.forName("UTF-8");

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f5189b;

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f5189b = bArr;
        ByteBuffer.wrap(bArr);
        byte[] bArr2 = f5189b;
        oq.a(bArr2, 0, bArr2.length, false);
    }

    static int a(int i2, byte[] bArr, int i3, int i4) {
        int i5 = i2;
        for (int i6 = i3; i6 < i3 + i4; i6++) {
            i5 = (i5 * 31) + bArr[i6];
        }
        return i5;
    }

    public static int a(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }

    public static int a(boolean z) {
        return z ? 1231 : 1237;
    }

    public static int a(byte[] bArr) {
        int length = bArr.length;
        int a2 = a(length, bArr, 0, length);
        if (a2 == 0) {
            return 1;
        }
        return a2;
    }

    static <T> T a(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException();
    }

    static Object a(Object obj, Object obj2) {
        ts c2 = ((ss) obj).c();
        c2.a((ss) obj2);
        return c2.m();
    }

    static <T> T a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    static boolean a(ss ssVar) {
        return false;
    }

    public static boolean b(byte[] bArr) {
        return lu.a(bArr);
    }

    public static String c(byte[] bArr) {
        return new String(bArr, a);
    }
}
