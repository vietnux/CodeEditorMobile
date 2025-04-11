package c.e;

import java.util.LinkedHashMap;
import java.util.Locale;

public class e<K, V> {
    private final LinkedHashMap<K, V> a;

    /* renamed from: b  reason: collision with root package name */
    private int f1964b;

    /* renamed from: c  reason: collision with root package name */
    private int f1965c;

    /* renamed from: d  reason: collision with root package name */
    private int f1966d;

    /* renamed from: e  reason: collision with root package name */
    private int f1967e;

    /* renamed from: f  reason: collision with root package name */
    private int f1968f;

    /* renamed from: g  reason: collision with root package name */
    private int f1969g;

    /* renamed from: h  reason: collision with root package name */
    private int f1970h;

    public e(int i2) {
        if (i2 > 0) {
            this.f1965c = i2;
            this.a = new LinkedHashMap<>(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    private int c(K k2, V v) {
        int b2 = b(k2, v);
        if (b2 >= 0) {
            return b2;
        }
        throw new IllegalStateException("Negative size: " + ((Object) k2) + "=" + ((Object) v));
    }

    /* access modifiers changed from: protected */
    public V a(K k2) {
        return null;
    }

    public final V a(K k2, V v) {
        V put;
        if (k2 == null || v == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.f1966d++;
            this.f1964b += c(k2, v);
            put = this.a.put(k2, v);
            if (put != null) {
                this.f1964b -= c(k2, put);
            }
        }
        if (put != null) {
            a(false, k2, put, v);
        }
        a(this.f1965c);
        return put;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0070, code lost:
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(int r5) {
        /*
        // Method dump skipped, instructions count: 116
        */
        throw new UnsupportedOperationException("Method not decompiled: c.e.e.a(int):void");
    }

    /* access modifiers changed from: protected */
    public void a(boolean z, K k2, V v, V v2) {
    }

    /* access modifiers changed from: protected */
    public int b(K k2, V v) {
        return 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001a, code lost:
        r0 = a(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
        if (r0 != null) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0022, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r4.f1967e++;
        r1 = r4.a.put(r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002f, code lost:
        if (r1 == null) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0031, code lost:
        r4.a.put(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0037, code lost:
        r4.f1964b += c(r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0040, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0041, code lost:
        if (r1 == null) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0043, code lost:
        a(false, r5, r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0047, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0048, code lost:
        a(r4.f1965c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004d, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final V b(K r5) {
        /*
            r4 = this;
            if (r5 == 0) goto L_0x0054
            monitor-enter(r4)
            java.util.LinkedHashMap<K, V> r0 = r4.a     // Catch:{ all -> 0x0051 }
            java.lang.Object r0 = r0.get(r5)     // Catch:{ all -> 0x0051 }
            if (r0 == 0) goto L_0x0013
            int r5 = r4.f1969g     // Catch:{ all -> 0x0051 }
            int r5 = r5 + 1
            r4.f1969g = r5     // Catch:{ all -> 0x0051 }
            monitor-exit(r4)     // Catch:{ all -> 0x0051 }
            return r0
        L_0x0013:
            int r0 = r4.f1970h     // Catch:{ all -> 0x0051 }
            int r0 = r0 + 1
            r4.f1970h = r0     // Catch:{ all -> 0x0051 }
            monitor-exit(r4)     // Catch:{ all -> 0x0051 }
            java.lang.Object r0 = r4.a(r5)
            if (r0 != 0) goto L_0x0022
            r5 = 0
            return r5
        L_0x0022:
            monitor-enter(r4)
            int r1 = r4.f1967e     // Catch:{ all -> 0x004e }
            int r1 = r1 + 1
            r4.f1967e = r1     // Catch:{ all -> 0x004e }
            java.util.LinkedHashMap<K, V> r1 = r4.a     // Catch:{ all -> 0x004e }
            java.lang.Object r1 = r1.put(r5, r0)     // Catch:{ all -> 0x004e }
            if (r1 == 0) goto L_0x0037
            java.util.LinkedHashMap<K, V> r2 = r4.a     // Catch:{ all -> 0x004e }
            r2.put(r5, r1)     // Catch:{ all -> 0x004e }
            goto L_0x0040
        L_0x0037:
            int r2 = r4.f1964b     // Catch:{ all -> 0x004e }
            int r3 = r4.c(r5, r0)     // Catch:{ all -> 0x004e }
            int r2 = r2 + r3
            r4.f1964b = r2     // Catch:{ all -> 0x004e }
        L_0x0040:
            monitor-exit(r4)     // Catch:{ all -> 0x004e }
            if (r1 == 0) goto L_0x0048
            r2 = 0
            r4.a(r2, r5, r0, r1)
            return r1
        L_0x0048:
            int r5 = r4.f1965c
            r4.a(r5)
            return r0
        L_0x004e:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        L_0x0051:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        L_0x0054:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r0 = "key == null"
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: c.e.e.b(java.lang.Object):java.lang.Object");
    }

    public final synchronized String toString() {
        int i2;
        i2 = this.f1969g + this.f1970h;
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.f1965c), Integer.valueOf(this.f1969g), Integer.valueOf(this.f1970h), Integer.valueOf(i2 != 0 ? (this.f1969g * 100) / i2 : 0));
    }
}
