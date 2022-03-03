package com.google.android.gms.common.util;

import com.google.android.gms.common.internal.x;
import java.lang.reflect.Array;
import java.util.Arrays;

public final class b {
    public static <T> boolean a(T[] tArr, T t) {
        return b(tArr, t) >= 0;
    }

    public static <T> T[] a(T[] tArr, int i2) {
        if (tArr == null) {
            return null;
        }
        return i2 != tArr.length ? (T[]) Arrays.copyOf(tArr, i2) : tArr;
    }

    public static <T> T[] a(T[] tArr, T... tArr2) {
        int i2;
        if (tArr == null) {
            return null;
        }
        if (tArr2 == null || tArr2.length == 0) {
            return (T[]) Arrays.copyOf(tArr, tArr.length);
        }
        Object[] objArr = (Object[]) Array.newInstance(tArr2.getClass().getComponentType(), tArr.length);
        if (tArr2.length == 1) {
            i2 = 0;
            for (T t : tArr) {
                if (!x.a(tArr2[0], t)) {
                    objArr[i2] = t;
                    i2++;
                }
            }
        } else {
            i2 = 0;
            for (T t2 : tArr) {
                if (!a(tArr2, t2)) {
                    objArr[i2] = t2;
                    i2++;
                }
            }
        }
        return (T[]) a(objArr, i2);
    }

    public static <T> T[] a(T[]... tArr) {
        if (tArr.length == 0) {
            return (T[]) ((Object[]) Array.newInstance(tArr.getClass(), 0));
        }
        int i2 = 0;
        for (T[] tArr2 : tArr) {
            i2 += tArr2.length;
        }
        T[] tArr3 = (T[]) Arrays.copyOf(tArr[0], i2);
        int length = tArr[0].length;
        for (int i3 = 1; i3 < tArr.length; i3++) {
            T[] tArr4 = tArr[i3];
            System.arraycopy(tArr4, 0, tArr3, length, tArr4.length);
            length += tArr4.length;
        }
        return tArr3;
    }

    public static <T> int b(T[] tArr, T t) {
        int length = tArr != null ? tArr.length : 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (x.a(tArr[i2], t)) {
                return i2;
            }
        }
        return -1;
    }
}
