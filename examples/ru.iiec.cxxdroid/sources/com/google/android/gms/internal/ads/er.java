package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.gr;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class er<FieldDescriptorType extends gr<FieldDescriptorType>> {

    /* renamed from: d  reason: collision with root package name */
    private static final er f4224d = new er(true);
    private final nt<FieldDescriptorType, Object> a = nt.b(16);

    /* renamed from: b  reason: collision with root package name */
    private boolean f4225b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f4226c = false;

    private er() {
    }

    private er(boolean z) {
        f();
    }

    static int a(ru ruVar, int i2, Object obj) {
        int e2 = sq.e(i2);
        if (ruVar == ru.GROUP) {
            or.a((ss) obj);
            e2 <<= 1;
        }
        return e2 + b(ruVar, obj);
    }

    private final Object a(FieldDescriptorType fielddescriptortype) {
        Object obj = this.a.get(fielddescriptortype);
        if (!(obj instanceof vr)) {
            return obj;
        }
        vr.c();
        throw null;
    }

    private static Object a(Object obj) {
        if (obj instanceof zs) {
            return ((zs) obj).l();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    private final void a(FieldDescriptorType fielddescriptortype, Object obj) {
        if (!fielddescriptortype.d()) {
            a(fielddescriptortype.f(), obj);
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj2 = arrayList.get(i2);
                i2++;
                a(fielddescriptortype.f(), obj2);
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof vr) {
            this.f4226c = true;
        }
        this.a.put(fielddescriptortype, obj);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002e, code lost:
        if ((r3 instanceof byte[]) == false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if ((r3 instanceof com.google.android.gms.internal.ads.vr) == false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0024, code lost:
        if ((r3 instanceof com.google.android.gms.internal.ads.pr) == false) goto L_0x0043;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(com.google.android.gms.internal.ads.ru r2, java.lang.Object r3) {
        /*
            com.google.android.gms.internal.ads.or.a(r3)
            int[] r0 = com.google.android.gms.internal.ads.fr.a
            com.google.android.gms.internal.ads.wu r2 = r2.h()
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            r1 = 0
            switch(r2) {
                case 1: goto L_0x0040;
                case 2: goto L_0x003d;
                case 3: goto L_0x003a;
                case 4: goto L_0x0037;
                case 5: goto L_0x0034;
                case 6: goto L_0x0031;
                case 7: goto L_0x0028;
                case 8: goto L_0x001e;
                case 9: goto L_0x0015;
                default: goto L_0x0014;
            }
        L_0x0014:
            goto L_0x0043
        L_0x0015:
            boolean r2 = r3 instanceof com.google.android.gms.internal.ads.ss
            if (r2 != 0) goto L_0x0026
            boolean r2 = r3 instanceof com.google.android.gms.internal.ads.vr
            if (r2 == 0) goto L_0x0043
            goto L_0x0026
        L_0x001e:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L_0x0026
            boolean r2 = r3 instanceof com.google.android.gms.internal.ads.pr
            if (r2 == 0) goto L_0x0043
        L_0x0026:
            r1 = 1
            goto L_0x0043
        L_0x0028:
            boolean r2 = r3 instanceof com.google.android.gms.internal.ads.fq
            if (r2 != 0) goto L_0x0026
            boolean r2 = r3 instanceof byte[]
            if (r2 == 0) goto L_0x0043
            goto L_0x0026
        L_0x0031:
            boolean r0 = r3 instanceof java.lang.String
            goto L_0x0042
        L_0x0034:
            boolean r0 = r3 instanceof java.lang.Boolean
            goto L_0x0042
        L_0x0037:
            boolean r0 = r3 instanceof java.lang.Double
            goto L_0x0042
        L_0x003a:
            boolean r0 = r3 instanceof java.lang.Float
            goto L_0x0042
        L_0x003d:
            boolean r0 = r3 instanceof java.lang.Long
            goto L_0x0042
        L_0x0040:
            boolean r0 = r3 instanceof java.lang.Integer
        L_0x0042:
            r1 = r0
        L_0x0043:
            if (r1 == 0) goto L_0x0046
            return
        L_0x0046:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Wrong object type used with protocol message reflection."
            r2.<init>(r3)
            throw r2
            switch-data {1->0x0040, 2->0x003d, 3->0x003a, 4->0x0037, 5->0x0034, 6->0x0031, 7->0x0028, 8->0x001e, 9->0x0015, }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.er.a(com.google.android.gms.internal.ads.ru, java.lang.Object):void");
    }

    private static boolean a(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        if (key.g() == wu.MESSAGE) {
            boolean d2 = key.d();
            Object value = entry.getValue();
            if (d2) {
                for (ss ssVar : (List) value) {
                    if (!ssVar.isInitialized()) {
                        return false;
                    }
                }
            } else if (value instanceof ss) {
                if (!((ss) value).isInitialized()) {
                    return false;
                }
            } else if (value instanceof vr) {
                return true;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        }
        return true;
    }

    private static int b(gr<?> grVar, Object obj) {
        ru f2 = grVar.f();
        int b2 = grVar.b();
        if (!grVar.d()) {
            return a(f2, b2, obj);
        }
        int i2 = 0;
        List<Object> list = (List) obj;
        if (grVar.e()) {
            for (Object obj2 : list) {
                i2 += b(f2, obj2);
            }
            return sq.e(b2) + i2 + sq.m(i2);
        }
        for (Object obj3 : list) {
            i2 += a(f2, b2, obj3);
        }
        return i2;
    }

    private static int b(ru ruVar, Object obj) {
        switch (fr.f4350b[ruVar.ordinal()]) {
            case 1:
                return sq.b(((Double) obj).doubleValue());
            case 2:
                return sq.b(((Float) obj).floatValue());
            case 3:
                return sq.d(((Long) obj).longValue());
            case 4:
                return sq.e(((Long) obj).longValue());
            case 5:
                return sq.f(((Integer) obj).intValue());
            case 6:
                return sq.g(((Long) obj).longValue());
            case 7:
                return sq.i(((Integer) obj).intValue());
            case 8:
                return sq.b(((Boolean) obj).booleanValue());
            case 9:
                return sq.b((ss) obj);
            case 10:
                return obj instanceof vr ? sq.a((vr) obj) : sq.a((ss) obj);
            case 11:
                return obj instanceof fq ? sq.a((fq) obj) : sq.a((String) obj);
            case 12:
                return obj instanceof fq ? sq.a((fq) obj) : sq.b((byte[]) obj);
            case 13:
                return sq.g(((Integer) obj).intValue());
            case 14:
                return sq.j(((Integer) obj).intValue());
            case 15:
                return sq.h(((Long) obj).longValue());
            case 16:
                return sq.h(((Integer) obj).intValue());
            case 17:
                return sq.f(((Long) obj).longValue());
            case 18:
                return obj instanceof pr ? sq.k(((pr) obj).b()) : sq.k(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    private final void b(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof vr) {
            vr.c();
            throw null;
        } else if (key.d()) {
            Object a2 = a((gr) key);
            if (a2 == null) {
                a2 = new ArrayList();
            }
            for (Object obj : (List) value) {
                ((List) a2).add(a(obj));
            }
            this.a.put(key, a2);
        } else if (key.g() == wu.MESSAGE) {
            Object a3 = a((gr) key);
            if (a3 == null) {
                this.a.put(key, a(value));
            } else {
                this.a.put(key, a3 instanceof zs ? key.a((zs) a3, (zs) value) : key.a(((ss) a3).c(), (ss) value).n());
            }
        } else {
            this.a.put(key, a(value));
        }
    }

    private static int c(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        Object value = entry.getValue();
        if (key.g() != wu.MESSAGE || key.d() || key.e()) {
            return b((gr<?>) key, value);
        }
        boolean z = value instanceof vr;
        int b2 = entry.getKey().b();
        return z ? sq.b(b2, (vr) value) : sq.b(b2, (ss) value);
    }

    public static <T extends gr<T>> er<T> i() {
        return f4224d;
    }

    /* access modifiers changed from: package-private */
    public final Iterator<Map.Entry<FieldDescriptorType, Object>> a() {
        return this.f4226c ? new zr(this.a.e().iterator()) : this.a.e().iterator();
    }

    public final void a(er<FieldDescriptorType> erVar) {
        for (int i2 = 0; i2 < erVar.a.c(); i2++) {
            b(erVar.a.a(i2));
        }
        for (Map.Entry<FieldDescriptorType, Object> entry : erVar.a.d()) {
            b(entry);
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean b() {
        return this.a.isEmpty();
    }

    public final boolean c() {
        return this.f4225b;
    }

    public final /* synthetic */ Object clone() {
        er erVar = new er();
        for (int i2 = 0; i2 < this.a.c(); i2++) {
            Map.Entry<FieldDescriptorType, Object> a2 = this.a.a(i2);
            erVar.a(a2.getKey(), a2.getValue());
        }
        for (Map.Entry<FieldDescriptorType, Object> entry : this.a.d()) {
            erVar.a(entry.getKey(), entry.getValue());
        }
        erVar.f4226c = this.f4226c;
        return erVar;
    }

    public final boolean d() {
        for (int i2 = 0; i2 < this.a.c(); i2++) {
            if (!a((Map.Entry) this.a.a(i2))) {
                return false;
            }
        }
        for (Map.Entry<FieldDescriptorType, Object> entry : this.a.d()) {
            if (!a((Map.Entry) entry)) {
                return false;
            }
        }
        return true;
    }

    public final Iterator<Map.Entry<FieldDescriptorType, Object>> e() {
        return this.f4226c ? new zr(this.a.entrySet().iterator()) : this.a.entrySet().iterator();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof er)) {
            return false;
        }
        return this.a.equals(((er) obj).a);
    }

    public final void f() {
        if (!this.f4225b) {
            this.a.b();
            this.f4225b = true;
        }
    }

    public final int g() {
        int i2 = 0;
        for (int i3 = 0; i3 < this.a.c(); i3++) {
            Map.Entry<FieldDescriptorType, Object> a2 = this.a.a(i3);
            i2 += b((gr<?>) a2.getKey(), a2.getValue());
        }
        for (Map.Entry<FieldDescriptorType, Object> entry : this.a.d()) {
            i2 += b((gr<?>) entry.getKey(), entry.getValue());
        }
        return i2;
    }

    public final int h() {
        int i2 = 0;
        for (int i3 = 0; i3 < this.a.c(); i3++) {
            i2 += c(this.a.a(i3));
        }
        for (Map.Entry<FieldDescriptorType, Object> entry : this.a.d()) {
            i2 += c(entry);
        }
        return i2;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
