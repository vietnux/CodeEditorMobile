package g.r.d;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public final class f {
    private static final Object[] a = new Object[0];

    public static final Object[] a(Collection<?> collection) {
        i.c(collection, "collection");
        int size = collection.size();
        if (size != 0) {
            Iterator<?> it = collection.iterator();
            if (it.hasNext()) {
                Object[] objArr = new Object[size];
                int i2 = 0;
                while (true) {
                    int i3 = i2 + 1;
                    objArr[i2] = it.next();
                    if (i3 >= objArr.length) {
                        if (!it.hasNext()) {
                            return objArr;
                        }
                        int i4 = ((i3 * 3) + 1) >>> 1;
                        if (i4 <= i3) {
                            if (i3 < 2147483645) {
                                i4 = 2147483645;
                            } else {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArr = Arrays.copyOf(objArr, i4);
                        i.b(objArr, "Arrays.copyOf(result, newSize)");
                    } else if (!it.hasNext()) {
                        Object[] copyOf = Arrays.copyOf(objArr, i3);
                        i.b(copyOf, "Arrays.copyOf(result, size)");
                        return copyOf;
                    }
                    i2 = i3;
                }
            }
        }
        return a;
    }

    public static final Object[] a(Collection<?> collection, Object[] objArr) {
        Object[] objArr2;
        i.c(collection, "collection");
        if (objArr != null) {
            int size = collection.size();
            int i2 = 0;
            if (size != 0) {
                Iterator<?> it = collection.iterator();
                if (it.hasNext()) {
                    if (size <= objArr.length) {
                        objArr2 = objArr;
                    } else {
                        Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
                        if (newInstance != null) {
                            objArr2 = (Object[]) newInstance;
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                        }
                    }
                    while (true) {
                        int i3 = i2 + 1;
                        objArr2[i2] = it.next();
                        if (i3 >= objArr2.length) {
                            if (!it.hasNext()) {
                                return objArr2;
                            }
                            int i4 = ((i3 * 3) + 1) >>> 1;
                            if (i4 <= i3) {
                                if (i3 < 2147483645) {
                                    i4 = 2147483645;
                                } else {
                                    throw new OutOfMemoryError();
                                }
                            }
                            objArr2 = Arrays.copyOf(objArr2, i4);
                            i.b(objArr2, "Arrays.copyOf(result, newSize)");
                        } else if (!it.hasNext()) {
                            if (objArr2 == objArr) {
                                objArr[i3] = null;
                                return objArr;
                            }
                            Object[] copyOf = Arrays.copyOf(objArr2, i3);
                            i.b(copyOf, "Arrays.copyOf(result, size)");
                            return copyOf;
                        }
                        i2 = i3;
                    }
                } else if (objArr.length <= 0) {
                    return objArr;
                } else {
                    objArr[0] = null;
                    return objArr;
                }
            } else if (objArr.length <= 0) {
                return objArr;
            } else {
                objArr[0] = null;
                return objArr;
            }
        } else {
            throw new NullPointerException();
        }
    }
}
