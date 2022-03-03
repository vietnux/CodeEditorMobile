package com.google.android.gms.common.util;

import c.e.a;
import c.e.b;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class f {
    @Deprecated
    public static <T> List<T> a() {
        return Collections.emptyList();
    }

    @Deprecated
    public static <T> List<T> a(T t) {
        return Collections.singletonList(t);
    }

    @Deprecated
    public static <T> List<T> a(T... tArr) {
        int length = tArr.length;
        return length != 0 ? length != 1 ? Collections.unmodifiableList(Arrays.asList(tArr)) : a(tArr[0]) : a();
    }

    private static <K, V> Map<K, V> a(int i2, boolean z, K[] kArr, V[] vArr) {
        Map<K, V> b2 = b(i2, z);
        a((Map) b2, (Object[]) kArr, (Object[]) vArr);
        return b2;
    }

    public static <K, V> Map<K, V> a(K k2, V v) {
        return Collections.singletonMap(k2, v);
    }

    public static <K, V> Map<K, V> a(K k2, V v, K k3, V v2, K k4, V v3) {
        Map b2 = b(3, false);
        b2.put(k2, v);
        b2.put(k3, v2);
        b2.put(k4, v3);
        return Collections.unmodifiableMap(b2);
    }

    public static <K, V> Map<K, V> a(K[] kArr, V[] vArr) {
        b((Object[]) kArr, (Object[]) vArr);
        int length = kArr.length;
        return length != 0 ? length != 1 ? Collections.unmodifiableMap(a(kArr.length, false, (Object[]) kArr, (Object[]) vArr)) : a(kArr[0], vArr[0]) : b();
    }

    private static <T> Set<T> a(int i2, boolean z) {
        return i2 <= (z ? 128 : 256) ? new b(i2) : new HashSet(i2, z ? 0.75f : 1.0f);
    }

    private static <T> Set<T> a(int i2, boolean z, T[] tArr) {
        Set<T> a = a(i2, z);
        Collections.addAll(a, tArr);
        return a;
    }

    @Deprecated
    public static <T> Set<T> a(T t, T t2, T t3) {
        Set a = a(3, false);
        a.add(t);
        a.add(t2);
        a.add(t3);
        return Collections.unmodifiableSet(a);
    }

    @Deprecated
    public static <T> Set<T> a(T t, T t2, T t3, T t4) {
        Set a = a(4, false);
        a.add(t);
        a.add(t2);
        a.add(t3);
        a.add(t4);
        return Collections.unmodifiableSet(a);
    }

    private static <K, V> void a(Map<K, V> map, K[] kArr, V[] vArr) {
        for (int i2 = 0; i2 < kArr.length; i2++) {
            map.put(kArr[i2], vArr[i2]);
        }
    }

    public static <K, V> Map<K, V> b() {
        return Collections.emptyMap();
    }

    private static <K, V> Map<K, V> b(int i2, boolean z) {
        return i2 <= (z ? 128 : 256) ? new a(i2) : new HashMap(i2, z ? 0.75f : 1.0f);
    }

    @Deprecated
    public static <T> Set<T> b(T t) {
        return Collections.singleton(t);
    }

    @Deprecated
    public static <T> Set<T> b(T t, T t2) {
        Set a = a(2, false);
        a.add(t);
        a.add(t2);
        return Collections.unmodifiableSet(a);
    }

    @Deprecated
    public static <T> Set<T> b(T... tArr) {
        int length = tArr.length;
        return length != 0 ? length != 1 ? length != 2 ? length != 3 ? length != 4 ? Collections.unmodifiableSet(a(tArr.length, false, (Object[]) tArr)) : a(tArr[0], tArr[1], tArr[2], tArr[3]) : a(tArr[0], tArr[1], tArr[2]) : b(tArr[0], tArr[1]) : b(tArr[0]) : c();
    }

    private static <K, V> void b(K[] kArr, V[] vArr) {
        if (kArr.length != vArr.length) {
            int length = kArr.length;
            int length2 = vArr.length;
            StringBuilder sb = new StringBuilder(66);
            sb.append("Key and values array lengths not equal: ");
            sb.append(length);
            sb.append(" != ");
            sb.append(length2);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    @Deprecated
    public static <T> Set<T> c() {
        return Collections.emptySet();
    }
}
