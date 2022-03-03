package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* access modifiers changed from: package-private */
public final class mt {
    private static final Class<?> a = d();

    /* renamed from: b  reason: collision with root package name */
    private static final du<?, ?> f4990b = a(false);

    /* renamed from: c  reason: collision with root package name */
    private static final du<?, ?> f4991c = a(true);

    /* renamed from: d  reason: collision with root package name */
    private static final du<?, ?> f4992d = new fu();

    static int a(int i2, Object obj, kt ktVar) {
        return obj instanceof as ? sq.a(i2, (as) obj) : sq.b(i2, (ss) obj, ktVar);
    }

    static int a(int i2, List<?> list) {
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        int e2 = sq.e(i2) * size;
        if (list instanceof cs) {
            cs csVar = (cs) list;
            while (i3 < size) {
                Object b2 = csVar.b(i3);
                e2 += b2 instanceof fq ? sq.a((fq) b2) : sq.a((String) b2);
                i3++;
            }
        } else {
            while (i3 < size) {
                Object obj = list.get(i3);
                e2 += obj instanceof fq ? sq.a((fq) obj) : sq.a((String) obj);
                i3++;
            }
        }
        return e2;
    }

    static int a(int i2, List<?> list, kt ktVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e2 = sq.e(i2) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            e2 += obj instanceof as ? sq.a((as) obj) : sq.a((ss) obj, ktVar);
        }
        return e2;
    }

    static int a(int i2, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return a(list) + (list.size() * sq.e(i2));
    }

    static int a(List<Long> list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof hs) {
            hs hsVar = (hs) list;
            i2 = 0;
            while (i3 < size) {
                i2 += sq.d(hsVar.c(i3));
                i3++;
            }
        } else {
            i2 = 0;
            while (i3 < size) {
                i2 += sq.d(list.get(i3).longValue());
                i3++;
            }
        }
        return i2;
    }

    public static du<?, ?> a() {
        return f4990b;
    }

    private static du<?, ?> a(boolean z) {
        try {
            Class<?> e2 = e();
            if (e2 == null) {
                return null;
            }
            return (du) e2.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused) {
            return null;
        }
    }

    static <UT, UB> UB a(int i2, int i3, UB ub, du<UT, UB> duVar) {
        if (ub == null) {
            ub = duVar.a();
        }
        duVar.a(ub, i2, (long) i3);
        return ub;
    }

    static <UT, UB> UB a(int i2, List<Integer> list, qr<?> qrVar, UB ub, du<UT, UB> duVar) {
        UB ub2;
        if (qrVar == null) {
            return ub;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator<Integer> it = list.iterator();
            loop1:
            while (true) {
                ub2 = ub;
                while (it.hasNext()) {
                    int intValue = it.next().intValue();
                    if (qrVar.a(intValue) == null) {
                        ub = (UB) a(i2, intValue, ub2, duVar);
                        it.remove();
                    }
                }
                break loop1;
            }
        } else {
            int size = list.size();
            ub2 = ub;
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                int intValue2 = list.get(i4).intValue();
                if (qrVar.a(intValue2) != null) {
                    if (i4 != i3) {
                        list.set(i3, Integer.valueOf(intValue2));
                    }
                    i3++;
                } else {
                    ub2 = (UB) a(i2, intValue2, ub2, duVar);
                }
            }
            if (i3 != size) {
                list.subList(i3, size).clear();
            }
        }
        return ub2;
    }

    public static void a(int i2, List<String> list, xu xuVar) {
        if (list != null && !list.isEmpty()) {
            xuVar.b(i2, list);
        }
    }

    public static void a(int i2, List<?> list, xu xuVar, kt ktVar) {
        if (list != null && !list.isEmpty()) {
            xuVar.a(i2, list, ktVar);
        }
    }

    public static void a(int i2, List<Double> list, xu xuVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            xuVar.i(i2, list, z);
        }
    }

    static <T, FT extends gr<FT>> void a(br<FT> brVar, T t, T t2) {
        er<FT> a2 = brVar.a((Object) t2);
        if (!a2.b()) {
            brVar.b(t).a(a2);
        }
    }

    static <T, UT, UB> void a(du<UT, UB> duVar, T t, T t2) {
        duVar.a(t, duVar.c(duVar.a((Object) t), duVar.a((Object) t2)));
    }

    static <T> void a(ns nsVar, T t, T t2, long j2) {
        ju.a(t, j2, nsVar.a(ju.f(t, j2), ju.f(t2, j2)));
    }

    public static void a(Class<?> cls) {
        Class<?> cls2;
        if (!mr.class.isAssignableFrom(cls) && (cls2 = a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static boolean a(int i2, int i3, int i4) {
        if (i3 < 40) {
            return true;
        }
        long j2 = (long) i4;
        return ((((long) i3) - ((long) i2)) + 1) + 9 <= ((2 * j2) + 3) + ((j2 + 3) * 3);
    }

    static boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static int b(int i2, List<fq> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e2 = size * sq.e(i2);
        for (int i3 = 0; i3 < list.size(); i3++) {
            e2 += sq.a(list.get(i3));
        }
        return e2;
    }

    static int b(int i2, List<ss> list, kt ktVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            i3 += sq.c(i2, list.get(i4), ktVar);
        }
        return i3;
    }

    static int b(int i2, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return b(list) + (size * sq.e(i2));
    }

    static int b(List<Long> list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof hs) {
            hs hsVar = (hs) list;
            i2 = 0;
            while (i3 < size) {
                i2 += sq.e(hsVar.c(i3));
                i3++;
            }
        } else {
            i2 = 0;
            while (i3 < size) {
                i2 += sq.e(list.get(i3).longValue());
                i3++;
            }
        }
        return i2;
    }

    public static du<?, ?> b() {
        return f4991c;
    }

    public static void b(int i2, List<fq> list, xu xuVar) {
        if (list != null && !list.isEmpty()) {
            xuVar.a(i2, list);
        }
    }

    public static void b(int i2, List<?> list, xu xuVar, kt ktVar) {
        if (list != null && !list.isEmpty()) {
            xuVar.b(i2, list, ktVar);
        }
    }

    public static void b(int i2, List<Float> list, xu xuVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            xuVar.l(i2, list, z);
        }
    }

    static int c(int i2, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return c(list) + (size * sq.e(i2));
    }

    static int c(List<Long> list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof hs) {
            hs hsVar = (hs) list;
            i2 = 0;
            while (i3 < size) {
                i2 += sq.f(hsVar.c(i3));
                i3++;
            }
        } else {
            i2 = 0;
            while (i3 < size) {
                i2 += sq.f(list.get(i3).longValue());
                i3++;
            }
        }
        return i2;
    }

    public static du<?, ?> c() {
        return f4992d;
    }

    public static void c(int i2, List<Long> list, xu xuVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            xuVar.h(i2, list, z);
        }
    }

    static int d(int i2, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return d(list) + (size * sq.e(i2));
    }

    static int d(List<Integer> list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof nr) {
            nr nrVar = (nr) list;
            i2 = 0;
            while (i3 < size) {
                i2 += sq.k(nrVar.c(i3));
                i3++;
            }
        } else {
            i2 = 0;
            while (i3 < size) {
                i2 += sq.k(list.get(i3).intValue());
                i3++;
            }
        }
        return i2;
    }

    private static Class<?> d() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void d(int i2, List<Long> list, xu xuVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            xuVar.e(i2, list, z);
        }
    }

    static int e(int i2, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return e(list) + (size * sq.e(i2));
    }

    static int e(List<Integer> list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof nr) {
            nr nrVar = (nr) list;
            i2 = 0;
            while (i3 < size) {
                i2 += sq.f(nrVar.c(i3));
                i3++;
            }
        } else {
            i2 = 0;
            while (i3 < size) {
                i2 += sq.f(list.get(i3).intValue());
                i3++;
            }
        }
        return i2;
    }

    private static Class<?> e() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void e(int i2, List<Long> list, xu xuVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            xuVar.c(i2, list, z);
        }
    }

    static int f(int i2, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return f(list) + (size * sq.e(i2));
    }

    static int f(List<Integer> list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof nr) {
            nr nrVar = (nr) list;
            i2 = 0;
            while (i3 < size) {
                i2 += sq.g(nrVar.c(i3));
                i3++;
            }
        } else {
            i2 = 0;
            while (i3 < size) {
                i2 += sq.g(list.get(i3).intValue());
                i3++;
            }
        }
        return i2;
    }

    public static void f(int i2, List<Long> list, xu xuVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            xuVar.a(i2, list, z);
        }
    }

    static int g(int i2, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return g(list) + (size * sq.e(i2));
    }

    static int g(List<Integer> list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof nr) {
            nr nrVar = (nr) list;
            i2 = 0;
            while (i3 < size) {
                i2 += sq.h(nrVar.c(i3));
                i3++;
            }
        } else {
            i2 = 0;
            while (i3 < size) {
                i2 += sq.h(list.get(i3).intValue());
                i3++;
            }
        }
        return i2;
    }

    public static void g(int i2, List<Long> list, xu xuVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            xuVar.j(i2, list, z);
        }
    }

    static int h(int i2, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * sq.i(i2, 0);
    }

    static int h(List<?> list) {
        return list.size() << 2;
    }

    public static void h(int i2, List<Integer> list, xu xuVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            xuVar.d(i2, list, z);
        }
    }

    static int i(int i2, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * sq.g(i2, 0L);
    }

    static int i(List<?> list) {
        return list.size() << 3;
    }

    public static void i(int i2, List<Integer> list, xu xuVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            xuVar.m(i2, list, z);
        }
    }

    static int j(int i2, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * sq.b(i2, true);
    }

    static int j(List<?> list) {
        return list.size();
    }

    public static void j(int i2, List<Integer> list, xu xuVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            xuVar.g(i2, list, z);
        }
    }

    public static void k(int i2, List<Integer> list, xu xuVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            xuVar.k(i2, list, z);
        }
    }

    public static void l(int i2, List<Integer> list, xu xuVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            xuVar.n(i2, list, z);
        }
    }

    public static void m(int i2, List<Integer> list, xu xuVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            xuVar.f(i2, list, z);
        }
    }

    public static void n(int i2, List<Boolean> list, xu xuVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            xuVar.b(i2, list, z);
        }
    }
}
