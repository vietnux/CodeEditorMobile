package e.b.b.a.c.e;

import java.nio.charset.Charset;
import java.util.Arrays;

public final class h {
    protected static final Charset a = Charset.forName("UTF-8");

    /* renamed from: b  reason: collision with root package name */
    public static final Object f7289b = new Object();

    static {
        Charset.forName("ISO-8859-1");
    }

    public static int a(long[] jArr) {
        if (jArr == null || jArr.length == 0) {
            return 0;
        }
        return Arrays.hashCode(jArr);
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

    public static void a(d dVar, d dVar2) {
        f fVar = dVar.f7211b;
        if (fVar != null) {
            dVar2.f7211b = (f) fVar.clone();
        }
    }

    public static boolean a(long[] jArr, long[] jArr2) {
        return (jArr == null || jArr.length == 0) ? jArr2 == null || jArr2.length == 0 : Arrays.equals(jArr, jArr2);
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
}
