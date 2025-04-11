package e.b.b.a.c.b;

import java.nio.charset.Charset;
import java.util.Arrays;

public final class g0 {
    protected static final Charset a = Charset.forName("UTF-8");

    /* renamed from: b  reason: collision with root package name */
    public static final Object f7047b = new Object();

    static {
        Charset.forName("ISO-8859-1");
    }

    public static int a(Object[] objArr) {
        int length = objArr == null ? 0 : objArr.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            Object obj = objArr[i3];
            if (obj != null) {
                i2 = (i2 * 31) + obj.hashCode();
            }
        }
        return i2;
    }

    public static int a(byte[][] bArr) {
        int length = bArr == null ? 0 : bArr.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            byte[] bArr2 = bArr[i3];
            if (bArr2 != null) {
                i2 = (i2 * 31) + Arrays.hashCode(bArr2);
            }
        }
        return i2;
    }

    public static void a(c0 c0Var, c0 c0Var2) {
        e0 e0Var = c0Var.f7030b;
        if (e0Var != null) {
            c0Var2.f7030b = (e0) e0Var.clone();
        }
    }

    public static boolean a(Object[] objArr, Object[] objArr2) {
        int length = objArr == null ? 0 : objArr.length;
        int length2 = objArr2 == null ? 0 : objArr2.length;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= length || objArr[i2] != null) {
                while (i3 < length2 && objArr2[i3] == null) {
                    i3++;
                }
                boolean z = i2 >= length;
                boolean z2 = i3 >= length2;
                if (z && z2) {
                    return true;
                }
                if (z != z2 || !objArr[i2].equals(objArr2[i3])) {
                    return false;
                }
                i2++;
                i3++;
            } else {
                i2++;
            }
        }
    }

    public static boolean a(byte[][] bArr, byte[][] bArr2) {
        int length = bArr == null ? 0 : bArr.length;
        int length2 = bArr2 == null ? 0 : bArr2.length;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= length || bArr[i2] != null) {
                while (i3 < length2 && bArr2[i3] == null) {
                    i3++;
                }
                boolean z = i2 >= length;
                boolean z2 = i3 >= length2;
                if (z && z2) {
                    return true;
                }
                if (z != z2 || !Arrays.equals(bArr[i2], bArr2[i3])) {
                    return false;
                }
                i2++;
                i3++;
            } else {
                i2++;
            }
        }
    }
}
