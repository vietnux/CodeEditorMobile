package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

final class ws<T> implements kt<T> {
    private static final Unsafe s = ju.d();
    private final int[] a;

    /* renamed from: b  reason: collision with root package name */
    private final Object[] f5943b;

    /* renamed from: c  reason: collision with root package name */
    private final int f5944c;

    /* renamed from: d  reason: collision with root package name */
    private final int f5945d;

    /* renamed from: e  reason: collision with root package name */
    private final int f5946e;

    /* renamed from: f  reason: collision with root package name */
    private final ss f5947f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f5948g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f5949h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f5950i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f5951j;

    /* renamed from: k  reason: collision with root package name */
    private final int[] f5952k;

    /* renamed from: l  reason: collision with root package name */
    private final int[] f5953l;

    /* renamed from: m  reason: collision with root package name */
    private final int[] f5954m;
    private final at n;
    private final ds o;
    private final du<?, ?> p;
    private final br<?> q;
    private final ns r;

    private ws(int[] iArr, Object[] objArr, int i2, int i3, int i4, ss ssVar, boolean z, boolean z2, int[] iArr2, int[] iArr3, int[] iArr4, at atVar, ds dsVar, du<?, ?> duVar, br<?> brVar, ns nsVar) {
        this.a = iArr;
        this.f5943b = objArr;
        this.f5944c = i2;
        this.f5945d = i3;
        this.f5946e = i4;
        this.f5949h = ssVar instanceof mr;
        this.f5950i = z;
        this.f5948g = brVar != null && brVar.a(ssVar);
        this.f5951j = false;
        this.f5952k = iArr2;
        this.f5953l = iArr3;
        this.f5954m = iArr4;
        this.n = atVar;
        this.o = dsVar;
        this.p = duVar;
        this.q = brVar;
        this.f5947f = ssVar;
        this.r = nsVar;
    }

    private static int a(int i2, byte[] bArr, int i3, int i4, Object obj, cq cqVar) {
        return bq.a(i2, bArr, i3, i4, e(obj), cqVar);
    }

    private static <UT, UB> int a(du<UT, UB> duVar, T t) {
        return duVar.f(duVar.a((Object) t));
    }

    private static int a(kt<?> ktVar, int i2, byte[] bArr, int i3, int i4, rr<?> rrVar, cq cqVar) {
        int a2 = a((kt) ktVar, bArr, i3, i4, cqVar);
        while (true) {
            rrVar.add(cqVar.f4043c);
            if (a2 >= i4) {
                break;
            }
            int a3 = bq.a(bArr, a2, cqVar);
            if (i2 != cqVar.a) {
                break;
            }
            a2 = a((kt) ktVar, bArr, a3, i4, cqVar);
        }
        return a2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v1, resolved type: com.google.android.gms.internal.ads.ws */
    /* JADX WARN: Multi-variable type inference failed */
    private static int a(kt ktVar, byte[] bArr, int i2, int i3, int i4, cq cqVar) {
        ws wsVar = (ws) ktVar;
        Object a2 = wsVar.a();
        int a3 = wsVar.a(a2, bArr, i2, i3, i4, cqVar);
        wsVar.c(a2);
        cqVar.f4043c = a2;
        return a3;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: com.google.android.gms.internal.ads.kt */
    /* JADX WARN: Multi-variable type inference failed */
    private static int a(kt ktVar, byte[] bArr, int i2, int i3, cq cqVar) {
        int i4 = i2 + 1;
        byte b2 = bArr[i2];
        byte b3 = b2;
        if (b2 < 0) {
            i4 = bq.a(b2, bArr, i4, cqVar);
            b3 = cqVar.a;
        }
        if (b3 < 0 || b3 > i3 - i4) {
            throw sr.b();
        }
        Object a2 = ktVar.a();
        int i5 = (b3 == 1 ? 1 : 0) + i4;
        ktVar.a(a2, bArr, i4, i5, cqVar);
        ktVar.c(a2);
        cqVar.f4043c = a2;
        return i5;
    }

    private final int a(T t, byte[] bArr, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j2, int i9, cq cqVar) {
        int i10;
        Object obj;
        Object obj2;
        Object obj3;
        long j3;
        int i11;
        int i12;
        Unsafe unsafe = s;
        long j4 = (long) (this.a[i9 + 2] & 1048575);
        switch (i8) {
            case 51:
                if (i6 == 1) {
                    obj = Double.valueOf(bq.c(bArr, i2));
                    unsafe.putObject(t, j2, obj);
                    i10 = i2 + 8;
                    unsafe.putInt(t, j4, i5);
                    return i10;
                }
                return i2;
            case 52:
                if (i6 == 5) {
                    obj2 = Float.valueOf(bq.d(bArr, i2));
                    unsafe.putObject(t, j2, obj2);
                    i10 = i2 + 4;
                    unsafe.putInt(t, j4, i5);
                    return i10;
                }
                return i2;
            case 53:
            case 54:
                if (i6 == 0) {
                    i10 = bq.b(bArr, i2, cqVar);
                    j3 = cqVar.f4042b;
                    obj3 = Long.valueOf(j3);
                    unsafe.putObject(t, j2, obj3);
                    unsafe.putInt(t, j4, i5);
                    return i10;
                }
                return i2;
            case 55:
            case 62:
                if (i6 == 0) {
                    i10 = bq.a(bArr, i2, cqVar);
                    i11 = cqVar.a;
                    obj3 = Integer.valueOf(i11);
                    unsafe.putObject(t, j2, obj3);
                    unsafe.putInt(t, j4, i5);
                    return i10;
                }
                return i2;
            case 56:
            case 65:
                if (i6 == 1) {
                    obj = Long.valueOf(bq.b(bArr, i2));
                    unsafe.putObject(t, j2, obj);
                    i10 = i2 + 8;
                    unsafe.putInt(t, j4, i5);
                    return i10;
                }
                return i2;
            case 57:
            case 64:
                if (i6 == 5) {
                    obj2 = Integer.valueOf(bq.a(bArr, i2));
                    unsafe.putObject(t, j2, obj2);
                    i10 = i2 + 4;
                    unsafe.putInt(t, j4, i5);
                    return i10;
                }
                return i2;
            case 58:
                if (i6 == 0) {
                    i10 = bq.b(bArr, i2, cqVar);
                    obj3 = Boolean.valueOf(cqVar.f4042b != 0);
                    unsafe.putObject(t, j2, obj3);
                    unsafe.putInt(t, j4, i5);
                    return i10;
                }
                return i2;
            case 59:
                if (i6 == 2) {
                    i10 = bq.a(bArr, i2, cqVar);
                    i12 = cqVar.a;
                    if (i12 == 0) {
                        obj3 = "";
                        unsafe.putObject(t, j2, obj3);
                        unsafe.putInt(t, j4, i5);
                        return i10;
                    } else if ((i7 & 536870912) == 0 || lu.a(bArr, i10, i10 + i12)) {
                        unsafe.putObject(t, j2, new String(bArr, i10, i12, or.a));
                        i10 += i12;
                        unsafe.putInt(t, j4, i5);
                        return i10;
                    } else {
                        throw sr.i();
                    }
                }
                return i2;
            case 60:
                if (i6 == 2) {
                    i10 = a(a(i9), bArr, i2, i3, cqVar);
                    Object object = unsafe.getInt(t, j4) == i5 ? unsafe.getObject(t, j2) : null;
                    obj3 = cqVar.f4043c;
                    if (object != null) {
                        obj3 = or.a(object, obj3);
                    }
                    unsafe.putObject(t, j2, obj3);
                    unsafe.putInt(t, j4, i5);
                    return i10;
                }
                return i2;
            case 61:
                if (i6 == 2) {
                    i10 = bq.a(bArr, i2, cqVar);
                    i12 = cqVar.a;
                    if (i12 == 0) {
                        obj3 = fq.f4347c;
                        unsafe.putObject(t, j2, obj3);
                        unsafe.putInt(t, j4, i5);
                        return i10;
                    }
                    unsafe.putObject(t, j2, fq.a(bArr, i10, i12));
                    i10 += i12;
                    unsafe.putInt(t, j4, i5);
                    return i10;
                }
                return i2;
            case 63:
                if (i6 == 0) {
                    int a2 = bq.a(bArr, i2, cqVar);
                    int i13 = cqVar.a;
                    qr<?> c2 = c(i9);
                    if (c2 == null || c2.a(i13) != null) {
                        unsafe.putObject(t, j2, Integer.valueOf(i13));
                        i10 = a2;
                        unsafe.putInt(t, j4, i5);
                        return i10;
                    }
                    e(t).a(i4, Long.valueOf((long) i13));
                    return a2;
                }
                return i2;
            case 66:
                if (i6 == 0) {
                    i10 = bq.a(bArr, i2, cqVar);
                    i11 = oq.e(cqVar.a);
                    obj3 = Integer.valueOf(i11);
                    unsafe.putObject(t, j2, obj3);
                    unsafe.putInt(t, j4, i5);
                    return i10;
                }
                return i2;
            case 67:
                if (i6 == 0) {
                    i10 = bq.b(bArr, i2, cqVar);
                    j3 = oq.a(cqVar.f4042b);
                    obj3 = Long.valueOf(j3);
                    unsafe.putObject(t, j2, obj3);
                    unsafe.putInt(t, j4, i5);
                    return i10;
                }
                return i2;
            case 68:
                if (i6 == 3) {
                    i10 = a(a(i9), bArr, i2, i3, (i4 & -8) | 4, cqVar);
                    Object object2 = unsafe.getInt(t, j4) == i5 ? unsafe.getObject(t, j2) : null;
                    obj3 = cqVar.f4043c;
                    if (object2 != null) {
                        obj3 = or.a(object2, obj3);
                    }
                    unsafe.putObject(t, j2, obj3);
                    unsafe.putInt(t, j4, i5);
                    return i10;
                }
                return i2;
            default:
                return i2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0232, code lost:
        if (r30.f4042b != 0) goto L_0x0234;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0234, code lost:
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0236, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0237, code lost:
        r11.a(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x023a, code lost:
        if (r4 >= r20) goto L_0x039b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x023c, code lost:
        r6 = com.google.android.gms.internal.ads.bq.a(r18, r4, r30);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0242, code lost:
        if (r21 != r30.a) goto L_0x039b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0244, code lost:
        r4 = com.google.android.gms.internal.ads.bq.b(r18, r6, r30);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x024c, code lost:
        if (r30.f4042b == 0) goto L_0x0236;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:?, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:?, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x013a, code lost:
        if (r4 == 0) goto L_0x013c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x013c, code lost:
        r11.add(com.google.android.gms.internal.ads.fq.f4347c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0142, code lost:
        r11.add(com.google.android.gms.internal.ads.fq.a(r18, r1, r4));
        r1 = r1 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x014a, code lost:
        if (r1 >= r20) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x014c, code lost:
        r4 = com.google.android.gms.internal.ads.bq.a(r18, r1, r30);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0152, code lost:
        if (r21 != r30.a) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0154, code lost:
        r1 = com.google.android.gms.internal.ads.bq.a(r18, r4, r30);
        r4 = r30.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x015a, code lost:
        if (r4 != 0) goto L_0x0142;
     */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01d3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int a(T r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, long r25, int r27, long r28, com.google.android.gms.internal.ads.cq r30) {
        /*
        // Method dump skipped, instructions count: 994
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ws.a(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.ads.cq):int");
    }

    private final <K, V> int a(T t, byte[] bArr, int i2, int i3, int i4, int i5, long j2, cq cqVar) {
        Unsafe unsafe = s;
        Object b2 = b(i4);
        Object object = unsafe.getObject(t, j2);
        if (this.r.c(object)) {
            Object a2 = this.r.a(b2);
            this.r.a(a2, object);
            unsafe.putObject(t, j2, a2);
        }
        this.r.e(b2);
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0301, code lost:
        if (r0 == r4) goto L_0x0360;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x035e, code lost:
        if (r0 == r15) goto L_0x0360;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0360, code lost:
        r6 = r31;
        r2 = r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0374 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int a(T r27, byte[] r28, int r29, int r30, int r31, com.google.android.gms.internal.ads.cq r32) {
        /*
        // Method dump skipped, instructions count: 1040
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ws.a(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.ads.cq):int");
    }

    private final kt a(int i2) {
        int i3 = (i2 / 4) << 1;
        kt ktVar = (kt) this.f5943b[i3];
        if (ktVar != null) {
            return ktVar;
        }
        kt<T> a2 = et.a().a((Class) ((Class) this.f5943b[i3 + 1]));
        this.f5943b[i3] = a2;
        return a2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x016b A[EDGE_INSN: B:74:0x016b->B:70:0x016b ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static <T> com.google.android.gms.internal.ads.ws<T> a(java.lang.Class<T> r23, com.google.android.gms.internal.ads.qs r24, com.google.android.gms.internal.ads.at r25, com.google.android.gms.internal.ads.ds r26, com.google.android.gms.internal.ads.du<?, ?> r27, com.google.android.gms.internal.ads.br<?> r28, com.google.android.gms.internal.ads.ns r29) {
        /*
        // Method dump skipped, instructions count: 399
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ws.a(java.lang.Class, com.google.android.gms.internal.ads.qs, com.google.android.gms.internal.ads.at, com.google.android.gms.internal.ads.ds, com.google.android.gms.internal.ads.du, com.google.android.gms.internal.ads.br, com.google.android.gms.internal.ads.ns):com.google.android.gms.internal.ads.ws");
    }

    private final <K, V, UT, UB> UB a(int i2, int i3, Map<K, V> map, qr<?> qrVar, UB ub, du<UT, UB> duVar) {
        this.r.e(b(i2));
        throw null;
    }

    private final <UT, UB> UB a(Object obj, int i2, UB ub, du<UT, UB> duVar) {
        qr<?> c2;
        int i3 = this.a[i2];
        Object f2 = ju.f(obj, (long) (d(i2) & 1048575));
        if (f2 == null || (c2 = c(i2)) == null) {
            return ub;
        }
        a(i2, i3, (Map<K, V>) this.r.f(f2), c2, ub, duVar);
        throw null;
    }

    private static <E> List<E> a(Object obj, long j2) {
        return (List) ju.f(obj, j2);
    }

    private static void a(int i2, Object obj, xu xuVar) {
        if (obj instanceof String) {
            xuVar.a(i2, (String) obj);
        } else {
            xuVar.a(i2, (fq) obj);
        }
    }

    private static <UT, UB> void a(du<UT, UB> duVar, T t, xu xuVar) {
        duVar.a(duVar.a((Object) t), xuVar);
    }

    private final <K, V> void a(xu xuVar, int i2, Object obj, int i3) {
        if (obj != null) {
            this.r.e(b(i3));
            throw null;
        }
    }

    private final void a(Object obj, int i2, jt jtVar) {
        long j2;
        Object p2;
        if (f(i2)) {
            j2 = (long) (i2 & 1048575);
            p2 = jtVar.m();
        } else {
            int i3 = i2 & 1048575;
            if (this.f5949h) {
                j2 = (long) i3;
                p2 = jtVar.i();
            } else {
                j2 = (long) i3;
                p2 = jtVar.p();
            }
        }
        ju.a(obj, j2, p2);
    }

    private final void a(T t, T t2, int i2) {
        long d2 = (long) (d(i2) & 1048575);
        if (a((Object) t2, i2)) {
            Object f2 = ju.f(t, d2);
            Object f3 = ju.f(t2, d2);
            if (f2 != null && f3 != null) {
                ju.a(t, d2, or.a(f2, f3));
                b((Object) t, i2);
            } else if (f3 != null) {
                ju.a(t, d2, f3);
                b((Object) t, i2);
            }
        }
    }

    private final boolean a(T t, int i2) {
        if (this.f5950i) {
            int d2 = d(i2);
            long j2 = (long) (d2 & 1048575);
            switch ((d2 & 267386880) >>> 20) {
                case 0:
                    return ju.e(t, j2) != 0.0d;
                case 1:
                    return ju.d(t, j2) != 0.0f;
                case 2:
                    return ju.b(t, j2) != 0;
                case 3:
                    return ju.b(t, j2) != 0;
                case 4:
                    return ju.a(t, j2) != 0;
                case 5:
                    return ju.b(t, j2) != 0;
                case 6:
                    return ju.a(t, j2) != 0;
                case 7:
                    return ju.c(t, j2);
                case 8:
                    Object f2 = ju.f(t, j2);
                    if (f2 instanceof String) {
                        return !((String) f2).isEmpty();
                    }
                    if (f2 instanceof fq) {
                        return !fq.f4347c.equals(f2);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    return ju.f(t, j2) != null;
                case 10:
                    return !fq.f4347c.equals(ju.f(t, j2));
                case 11:
                    return ju.a(t, j2) != 0;
                case 12:
                    return ju.a(t, j2) != 0;
                case 13:
                    return ju.a(t, j2) != 0;
                case 14:
                    return ju.b(t, j2) != 0;
                case 15:
                    return ju.a(t, j2) != 0;
                case 16:
                    return ju.b(t, j2) != 0;
                case 17:
                    return ju.f(t, j2) != null;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            int e2 = e(i2);
            return (ju.a(t, (long) (e2 & 1048575)) & (1 << (e2 >>> 20))) != 0;
        }
    }

    private final boolean a(T t, int i2, int i3) {
        return ju.a(t, (long) (e(i3) & 1048575)) == i2;
    }

    private final boolean a(T t, int i2, int i3, int i4) {
        return this.f5950i ? a((Object) t, i2) : (i3 & i4) != 0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.google.android.gms.internal.ads.kt */
    /* JADX WARN: Multi-variable type inference failed */
    private static boolean a(Object obj, int i2, kt ktVar) {
        return ktVar.b(ju.f(obj, (long) (i2 & 1048575)));
    }

    private static <T> double b(T t, long j2) {
        return ((Double) ju.f(t, j2)).doubleValue();
    }

    private final Object b(int i2) {
        return this.f5943b[(i2 / 4) << 1];
    }

    private final void b(T t, int i2) {
        if (!this.f5950i) {
            int e2 = e(i2);
            long j2 = (long) (e2 & 1048575);
            ju.a((Object) t, j2, ju.a(t, j2) | (1 << (e2 >>> 20)));
        }
    }

    private final void b(T t, int i2, int i3) {
        ju.a((Object) t, (long) (e(i3) & 1048575), i2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:177:0x0419  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x041f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void b(T r18, com.google.android.gms.internal.ads.xu r19) {
        /*
        // Method dump skipped, instructions count: 1204
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ws.b(java.lang.Object, com.google.android.gms.internal.ads.xu):void");
    }

    private final void b(T t, T t2, int i2) {
        int d2 = d(i2);
        int i3 = this.a[i2];
        long j2 = (long) (d2 & 1048575);
        if (a(t2, i3, i2)) {
            Object f2 = ju.f(t, j2);
            Object f3 = ju.f(t2, j2);
            if (f2 != null && f3 != null) {
                ju.a(t, j2, or.a(f2, f3));
                b(t, i3, i2);
            } else if (f3 != null) {
                ju.a(t, j2, f3);
                b(t, i3, i2);
            }
        }
    }

    private static <T> float c(T t, long j2) {
        return ((Float) ju.f(t, j2)).floatValue();
    }

    private final qr<?> c(int i2) {
        return (qr) this.f5943b[((i2 / 4) << 1) + 1];
    }

    private final boolean c(T t, T t2, int i2) {
        return a(t, i2) == a(t2, i2);
    }

    private final int d(int i2) {
        return this.a[i2 + 1];
    }

    private static <T> int d(T t, long j2) {
        return ((Integer) ju.f(t, j2)).intValue();
    }

    private final int e(int i2) {
        return this.a[i2 + 2];
    }

    private static <T> long e(T t, long j2) {
        return ((Long) ju.f(t, j2)).longValue();
    }

    private static eu e(Object obj) {
        mr mrVar = (mr) obj;
        eu euVar = mrVar.zzdtt;
        if (euVar != eu.d()) {
            return euVar;
        }
        eu e2 = eu.e();
        mrVar.zzdtt = e2;
        return e2;
    }

    private static boolean f(int i2) {
        return (i2 & 536870912) != 0;
    }

    private static <T> boolean f(T t, long j2) {
        return ((Boolean) ju.f(t, j2)).booleanValue();
    }

    private final int g(int i2) {
        int i3 = this.f5944c;
        if (i2 >= i3) {
            int i4 = this.f5946e;
            if (i2 < i4) {
                int i5 = (i2 - i3) << 2;
                if (this.a[i5] == i2) {
                    return i5;
                }
                return -1;
            } else if (i2 <= this.f5945d) {
                int i6 = i4 - i3;
                int length = (this.a.length / 4) - 1;
                while (i6 <= length) {
                    int i7 = (length + i6) >>> 1;
                    int i8 = i7 << 2;
                    int i9 = this.a[i8];
                    if (i2 == i9) {
                        return i8;
                    }
                    if (i2 < i9) {
                        length = i7 - 1;
                    } else {
                        i6 = i7 + 1;
                    }
                }
            }
        }
        return -1;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01d8, code lost:
        if (r19.f5951j != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01e9, code lost:
        if (r19.f5951j != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x01fa, code lost:
        if (r19.f5951j != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x020b, code lost:
        if (r19.f5951j != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x020d, code lost:
        r2.putInt(r20, (long) r14, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0211, code lost:
        r3 = (com.google.android.gms.internal.ads.sq.e(r3) + com.google.android.gms.internal.ads.sq.g(r5)) + r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0331, code lost:
        if ((r5 instanceof com.google.android.gms.internal.ads.fq) != false) goto L_0x030a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0334, code lost:
        r3 = com.google.android.gms.internal.ads.sq.b(r3, (java.lang.String) r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x0417, code lost:
        if (a(r20, r15, r3) != false) goto L_0x06b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x0437, code lost:
        if (a(r20, r15, r3) != false) goto L_0x06e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x043f, code lost:
        if (a(r20, r15, r3) != false) goto L_0x06f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x045f, code lost:
        if (a(r20, r15, r3) != false) goto L_0x0716;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x0467, code lost:
        if (a(r20, r15, r3) != false) goto L_0x0725;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x0477, code lost:
        if ((r4 instanceof com.google.android.gms.internal.ads.fq) != false) goto L_0x071a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x047f, code lost:
        if (a(r20, r15, r3) != false) goto L_0x074c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x0517, code lost:
        if (r19.f5951j != false) goto L_0x05fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x0529, code lost:
        if (r19.f5951j != false) goto L_0x05fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x053b, code lost:
        if (r19.f5951j != false) goto L_0x05fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x054d, code lost:
        if (r19.f5951j != false) goto L_0x05fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x055f, code lost:
        if (r19.f5951j != false) goto L_0x05fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x0571, code lost:
        if (r19.f5951j != false) goto L_0x05fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x0583, code lost:
        if (r19.f5951j != false) goto L_0x05fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x0595, code lost:
        if (r19.f5951j != false) goto L_0x05fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x05a6, code lost:
        if (r19.f5951j != false) goto L_0x05fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x05b7, code lost:
        if (r19.f5951j != false) goto L_0x05fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:0x05c8, code lost:
        if (r19.f5951j != false) goto L_0x05fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x05d9, code lost:
        if (r19.f5951j != false) goto L_0x05fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x05ea, code lost:
        if (r19.f5951j != false) goto L_0x05fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x05fb, code lost:
        if (r19.f5951j != false) goto L_0x05fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x05fd, code lost:
        r2.putInt(r20, (long) r11, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x0601, code lost:
        r9 = (com.google.android.gms.internal.ads.sq.e(r15) + com.google.android.gms.internal.ads.sq.g(r4)) + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:0x06b7, code lost:
        if ((r12 & r18) != 0) goto L_0x06b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:0x06b9, code lost:
        r4 = com.google.android.gms.internal.ads.sq.c(r15, (com.google.android.gms.internal.ads.ss) r2.getObject(r20, r9), a(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:356:0x06e4, code lost:
        if ((r12 & r18) != 0) goto L_0x06e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:0x06e6, code lost:
        r4 = com.google.android.gms.internal.ads.sq.h(r15, 0L);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:0x06ef, code lost:
        if ((r12 & r18) != 0) goto L_0x06f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:0x06f1, code lost:
        r9 = com.google.android.gms.internal.ads.sq.j(r15, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:371:0x0714, code lost:
        if ((r12 & r18) != 0) goto L_0x0716;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x0716, code lost:
        r4 = r2.getObject(r20, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:0x071a, code lost:
        r4 = com.google.android.gms.internal.ads.sq.c(r15, (com.google.android.gms.internal.ads.fq) r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:0x0723, code lost:
        if ((r12 & r18) != 0) goto L_0x0725;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:376:0x0725, code lost:
        r4 = com.google.android.gms.internal.ads.mt.a(r15, r2.getObject(r20, r9), a(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ab, code lost:
        if ((r5 instanceof com.google.android.gms.internal.ads.fq) != false) goto L_0x030a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:380:0x073d, code lost:
        if ((r4 instanceof com.google.android.gms.internal.ads.fq) != false) goto L_0x071a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:381:0x0740, code lost:
        r4 = com.google.android.gms.internal.ads.sq.b(r15, (java.lang.String) r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:383:0x074a, code lost:
        if ((r12 & r18) != 0) goto L_0x074c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:384:0x074c, code lost:
        r4 = com.google.android.gms.internal.ads.sq.b(r15, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0127, code lost:
        if (r19.f5951j != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0139, code lost:
        if (r19.f5951j != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x014b, code lost:
        if (r19.f5951j != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x015d, code lost:
        if (r19.f5951j != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x016f, code lost:
        if (r19.f5951j != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0181, code lost:
        if (r19.f5951j != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0193, code lost:
        if (r19.f5951j != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01a5, code lost:
        if (r19.f5951j != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01b6, code lost:
        if (r19.f5951j != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01c7, code lost:
        if (r19.f5951j != false) goto L_0x020d;
     */
    @Override // com.google.android.gms.internal.ads.kt
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(T r20) {
        /*
        // Method dump skipped, instructions count: 2294
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ws.a(java.lang.Object):int");
    }

    @Override // com.google.android.gms.internal.ads.kt
    public final T a() {
        return (T) this.n.a(this.f5947f);
    }

    /*  JADX ERROR: StackOverflowError in pass: MarkFinallyVisitor
        java.lang.StackOverflowError
        	at jadx.core.dex.nodes.InsnNode.isSame(InsnNode.java:303)
        	at jadx.core.dex.visitors.MarkFinallyVisitor.sameInsns(MarkFinallyVisitor.java:451)
        	at jadx.core.dex.visitors.MarkFinallyVisitor.compareBlocks(MarkFinallyVisitor.java:436)
        	at jadx.core.dex.visitors.MarkFinallyVisitor.checkBlocksTree(MarkFinallyVisitor.java:408)
        	at jadx.core.dex.visitors.MarkFinallyVisitor.checkBlocksTree(MarkFinallyVisitor.java:411)
        */
    @Override // com.google.android.gms.internal.ads.kt
    public final void a(T r12, com.google.android.gms.internal.ads.jt r13, com.google.android.gms.internal.ads.zq r14) {
        /*
        // Method dump skipped, instructions count: 1456
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ws.a(java.lang.Object, com.google.android.gms.internal.ads.jt, com.google.android.gms.internal.ads.zq):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0462 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x0463  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x048f  */
    /* JADX WARNING: Removed duplicated region for block: B:341:0x08b9  */
    /* JADX WARNING: Removed duplicated region for block: B:343:0x08bf  */
    @Override // com.google.android.gms.internal.ads.kt
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(T r13, com.google.android.gms.internal.ads.xu r14) {
        /*
        // Method dump skipped, instructions count: 2534
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ws.a(java.lang.Object, com.google.android.gms.internal.ads.xu):void");
    }

    @Override // com.google.android.gms.internal.ads.kt
    public final void a(T t, T t2) {
        if (t2 != null) {
            for (int i2 = 0; i2 < this.a.length; i2 += 4) {
                int d2 = d(i2);
                long j2 = (long) (1048575 & d2);
                int i3 = this.a[i2];
                switch ((d2 & 267386880) >>> 20) {
                    case 0:
                        if (a((Object) t2, i2)) {
                            ju.a(t, j2, ju.e(t2, j2));
                            b((Object) t, i2);
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (a((Object) t2, i2)) {
                            ju.a((Object) t, j2, ju.d(t2, j2));
                            b((Object) t, i2);
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (!a((Object) t2, i2)) {
                            break;
                        }
                        ju.a((Object) t, j2, ju.b(t2, j2));
                        b((Object) t, i2);
                        break;
                    case 3:
                        if (!a((Object) t2, i2)) {
                            break;
                        }
                        ju.a((Object) t, j2, ju.b(t2, j2));
                        b((Object) t, i2);
                        break;
                    case 4:
                        if (!a((Object) t2, i2)) {
                            break;
                        }
                        ju.a((Object) t, j2, ju.a(t2, j2));
                        b((Object) t, i2);
                        break;
                    case 5:
                        if (!a((Object) t2, i2)) {
                            break;
                        }
                        ju.a((Object) t, j2, ju.b(t2, j2));
                        b((Object) t, i2);
                        break;
                    case 6:
                        if (!a((Object) t2, i2)) {
                            break;
                        }
                        ju.a((Object) t, j2, ju.a(t2, j2));
                        b((Object) t, i2);
                        break;
                    case 7:
                        if (a((Object) t2, i2)) {
                            ju.a(t, j2, ju.c(t2, j2));
                            b((Object) t, i2);
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (!a((Object) t2, i2)) {
                            break;
                        }
                        ju.a(t, j2, ju.f(t2, j2));
                        b((Object) t, i2);
                        break;
                    case 9:
                    case 17:
                        a(t, t2, i2);
                        break;
                    case 10:
                        if (!a((Object) t2, i2)) {
                            break;
                        }
                        ju.a(t, j2, ju.f(t2, j2));
                        b((Object) t, i2);
                        break;
                    case 11:
                        if (!a((Object) t2, i2)) {
                            break;
                        }
                        ju.a((Object) t, j2, ju.a(t2, j2));
                        b((Object) t, i2);
                        break;
                    case 12:
                        if (!a((Object) t2, i2)) {
                            break;
                        }
                        ju.a((Object) t, j2, ju.a(t2, j2));
                        b((Object) t, i2);
                        break;
                    case 13:
                        if (!a((Object) t2, i2)) {
                            break;
                        }
                        ju.a((Object) t, j2, ju.a(t2, j2));
                        b((Object) t, i2);
                        break;
                    case 14:
                        if (!a((Object) t2, i2)) {
                            break;
                        }
                        ju.a((Object) t, j2, ju.b(t2, j2));
                        b((Object) t, i2);
                        break;
                    case 15:
                        if (!a((Object) t2, i2)) {
                            break;
                        }
                        ju.a((Object) t, j2, ju.a(t2, j2));
                        b((Object) t, i2);
                        break;
                    case 16:
                        if (!a((Object) t2, i2)) {
                            break;
                        }
                        ju.a((Object) t, j2, ju.b(t2, j2));
                        b((Object) t, i2);
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        this.o.a(t, t2, j2);
                        break;
                    case 50:
                        mt.a(this.r, t, t2, j2);
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                        if (!a(t2, i3, i2)) {
                            break;
                        }
                        ju.a(t, j2, ju.f(t2, j2));
                        b(t, i3, i2);
                        break;
                    case 60:
                    case 68:
                        b(t, t2, i2);
                        break;
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                        if (!a(t2, i3, i2)) {
                            break;
                        }
                        ju.a(t, j2, ju.f(t2, j2));
                        b(t, i3, i2);
                        break;
                }
            }
            if (!this.f5950i) {
                mt.a(this.p, t, t2);
                if (this.f5948g) {
                    mt.a(this.q, t, t2);
                    return;
                }
                return;
            }
            return;
        }
        throw new NullPointerException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v25, types: [int] */
    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0069, code lost:
        if (r7 == 0) goto L_0x00d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ce, code lost:
        if (r7 == 0) goto L_0x00d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00d0, code lost:
        r0 = com.google.android.gms.internal.ads.bq.a(r12, r10, r11);
        r1 = r11.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0164, code lost:
        if (r0 == r10) goto L_0x01a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01a0, code lost:
        if (r0 == r15) goto L_0x01a2;
     */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // com.google.android.gms.internal.ads.kt
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(T r23, byte[] r24, int r25, int r26, com.google.android.gms.internal.ads.cq r27) {
        /*
        // Method dump skipped, instructions count: 518
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ws.a(java.lang.Object, byte[], int, int, com.google.android.gms.internal.ads.cq):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v9, resolved type: com.google.android.gms.internal.ads.kt */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00d4 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00e6 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.kt
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(T r17) {
        /*
        // Method dump skipped, instructions count: 256
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ws.b(java.lang.Object):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005c, code lost:
        if (com.google.android.gms.internal.ads.mt.a(com.google.android.gms.internal.ads.ju.f(r10, r6), com.google.android.gms.internal.ads.ju.f(r11, r6)) != false) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0070, code lost:
        if (com.google.android.gms.internal.ads.ju.b(r10, r6) == com.google.android.gms.internal.ads.ju.b(r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0082, code lost:
        if (com.google.android.gms.internal.ads.ju.a(r10, r6) == com.google.android.gms.internal.ads.ju.a(r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0096, code lost:
        if (com.google.android.gms.internal.ads.ju.b(r10, r6) == com.google.android.gms.internal.ads.ju.b(r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a8, code lost:
        if (com.google.android.gms.internal.ads.ju.a(r10, r6) == com.google.android.gms.internal.ads.ju.a(r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ba, code lost:
        if (com.google.android.gms.internal.ads.ju.a(r10, r6) == com.google.android.gms.internal.ads.ju.a(r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00cc, code lost:
        if (com.google.android.gms.internal.ads.ju.a(r10, r6) == com.google.android.gms.internal.ads.ju.a(r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e2, code lost:
        if (com.google.android.gms.internal.ads.mt.a(com.google.android.gms.internal.ads.ju.f(r10, r6), com.google.android.gms.internal.ads.ju.f(r11, r6)) != false) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00f8, code lost:
        if (com.google.android.gms.internal.ads.mt.a(com.google.android.gms.internal.ads.ju.f(r10, r6), com.google.android.gms.internal.ads.ju.f(r11, r6)) != false) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x010e, code lost:
        if (com.google.android.gms.internal.ads.mt.a(com.google.android.gms.internal.ads.ju.f(r10, r6), com.google.android.gms.internal.ads.ju.f(r11, r6)) != false) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0120, code lost:
        if (com.google.android.gms.internal.ads.ju.c(r10, r6) == com.google.android.gms.internal.ads.ju.c(r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0132, code lost:
        if (com.google.android.gms.internal.ads.ju.a(r10, r6) == com.google.android.gms.internal.ads.ju.a(r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0145, code lost:
        if (com.google.android.gms.internal.ads.ju.b(r10, r6) == com.google.android.gms.internal.ads.ju.b(r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0156, code lost:
        if (com.google.android.gms.internal.ads.ju.a(r10, r6) == com.google.android.gms.internal.ads.ju.a(r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0169, code lost:
        if (com.google.android.gms.internal.ads.ju.b(r10, r6) == com.google.android.gms.internal.ads.ju.b(r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x017c, code lost:
        if (com.google.android.gms.internal.ads.ju.b(r10, r6) == com.google.android.gms.internal.ads.ju.b(r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x018d, code lost:
        if (com.google.android.gms.internal.ads.ju.a(r10, r6) == com.google.android.gms.internal.ads.ju.a(r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01a0, code lost:
        if (com.google.android.gms.internal.ads.ju.b(r10, r6) == com.google.android.gms.internal.ads.ju.b(r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0038, code lost:
        if (com.google.android.gms.internal.ads.mt.a(com.google.android.gms.internal.ads.ju.f(r10, r6), com.google.android.gms.internal.ads.ju.f(r11, r6)) != false) goto L_0x01a3;
     */
    @Override // com.google.android.gms.internal.ads.kt
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(T r10, T r11) {
        /*
        // Method dump skipped, instructions count: 610
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ws.b(java.lang.Object, java.lang.Object):boolean");
    }

    @Override // com.google.android.gms.internal.ads.kt
    public final void c(T t) {
        int[] iArr = this.f5953l;
        if (iArr != null) {
            for (int i2 : iArr) {
                long d2 = (long) (d(i2) & 1048575);
                Object f2 = ju.f(t, d2);
                if (f2 != null) {
                    this.r.b(f2);
                    ju.a(t, d2, f2);
                }
            }
        }
        int[] iArr2 = this.f5954m;
        if (iArr2 != null) {
            for (int i3 : iArr2) {
                this.o.b(t, (long) i3);
            }
        }
        this.p.d(t);
        if (this.f5948g) {
            this.q.c(t);
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ce, code lost:
        if (r3 != null) goto L_0x00e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00e0, code lost:
        if (r3 != null) goto L_0x00e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00e2, code lost:
        r7 = r3.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00e6, code lost:
        r2 = (r2 * 53) + r7;
     */
    @Override // com.google.android.gms.internal.ads.kt
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int d(T r9) {
        /*
        // Method dump skipped, instructions count: 476
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ws.d(java.lang.Object):int");
    }
}
