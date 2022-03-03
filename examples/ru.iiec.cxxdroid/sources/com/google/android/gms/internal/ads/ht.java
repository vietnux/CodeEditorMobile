package com.google.android.gms.internal.ads;

import java.lang.reflect.Field;
import java.util.Arrays;

/* access modifiers changed from: package-private */
public final class ht {
    private int A;
    private int B;
    private Field C;
    private Object D;
    private Object E;
    private Object F;
    private final it a;

    /* renamed from: b  reason: collision with root package name */
    private final Object[] f4550b;

    /* renamed from: c  reason: collision with root package name */
    private Class<?> f4551c;

    /* renamed from: d  reason: collision with root package name */
    private final int f4552d;

    /* renamed from: e  reason: collision with root package name */
    private final int f4553e;

    /* renamed from: f  reason: collision with root package name */
    private final int f4554f;

    /* renamed from: g  reason: collision with root package name */
    private final int f4555g;

    /* renamed from: h  reason: collision with root package name */
    private final int f4556h;

    /* renamed from: i  reason: collision with root package name */
    private final int f4557i;

    /* renamed from: j  reason: collision with root package name */
    private final int f4558j;

    /* renamed from: k  reason: collision with root package name */
    private final int f4559k;

    /* renamed from: l  reason: collision with root package name */
    private final int f4560l;

    /* renamed from: m  reason: collision with root package name */
    private final int f4561m;
    private final int[] n;
    private int o;
    private int p;
    private int q = Integer.MAX_VALUE;
    private int r = Integer.MIN_VALUE;
    private int s = 0;
    private int t = 0;
    private int u = 0;
    private int v = 0;
    private int w = 0;
    private int x;
    private int y;
    private int z;

    ht(Class<?> cls, String str, Object[] objArr) {
        this.f4551c = cls;
        this.a = new it(str);
        this.f4550b = objArr;
        this.f4552d = this.a.b();
        this.f4553e = this.a.b();
        int[] iArr = null;
        if (this.f4553e == 0) {
            this.f4554f = 0;
            this.f4555g = 0;
            this.f4556h = 0;
            this.f4557i = 0;
            this.f4558j = 0;
            this.f4560l = 0;
            this.f4559k = 0;
            this.f4561m = 0;
            this.n = null;
            return;
        }
        this.f4554f = this.a.b();
        this.f4555g = this.a.b();
        this.f4556h = this.a.b();
        this.f4557i = this.a.b();
        this.f4560l = this.a.b();
        this.f4559k = this.a.b();
        this.f4558j = this.a.b();
        this.f4561m = this.a.b();
        int b2 = this.a.b();
        this.n = b2 != 0 ? new int[b2] : iArr;
        this.o = (this.f4554f << 1) + this.f4555g;
    }

    private static Field a(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(name).length() + String.valueOf(arrays).length());
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            sb.append(" not found. Known fields are ");
            sb.append(arrays);
            throw new RuntimeException(sb.toString());
        }
    }

    private final Object p() {
        Object[] objArr = this.f4550b;
        int i2 = this.o;
        this.o = i2 + 1;
        return objArr[i2];
    }

    private final boolean q() {
        return (this.f4552d & 1) == 1;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00d0, code lost:
        if (q() != false) goto L_0x00d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x015e, code lost:
        if (r1 != false) goto L_0x00d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0165, code lost:
        if (q() != false) goto L_0x00d2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a() {
        /*
        // Method dump skipped, instructions count: 370
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ht.a():boolean");
    }

    /* access modifiers changed from: package-private */
    public final int b() {
        return this.x;
    }

    /* access modifiers changed from: package-private */
    public final int c() {
        return this.z;
    }

    /* access modifiers changed from: package-private */
    public final boolean d() {
        return this.z > hr.MAP.h();
    }

    /* access modifiers changed from: package-private */
    public final Field e() {
        int i2 = this.A << 1;
        Object obj = this.f4550b[i2];
        if (obj instanceof Field) {
            return (Field) obj;
        }
        Field a2 = a(this.f4551c, (String) obj);
        this.f4550b[i2] = a2;
        return a2;
    }

    /* access modifiers changed from: package-private */
    public final Field f() {
        int i2 = (this.A << 1) + 1;
        Object obj = this.f4550b[i2];
        if (obj instanceof Field) {
            return (Field) obj;
        }
        Field a2 = a(this.f4551c, (String) obj);
        this.f4550b[i2] = a2;
        return a2;
    }

    /* access modifiers changed from: package-private */
    public final Field g() {
        return this.C;
    }

    /* access modifiers changed from: package-private */
    public final boolean h() {
        return q() && this.z <= hr.GROUP.h();
    }

    /* access modifiers changed from: package-private */
    public final Field i() {
        int i2 = (this.f4554f << 1) + (this.B / 32);
        Object obj = this.f4550b[i2];
        if (obj instanceof Field) {
            return (Field) obj;
        }
        Field a2 = a(this.f4551c, (String) obj);
        this.f4550b[i2] = a2;
        return a2;
    }

    /* access modifiers changed from: package-private */
    public final int j() {
        return this.B % 32;
    }

    /* access modifiers changed from: package-private */
    public final boolean k() {
        return (this.y & 256) != 0;
    }

    /* access modifiers changed from: package-private */
    public final boolean l() {
        return (this.y & 512) != 0;
    }

    /* access modifiers changed from: package-private */
    public final Object m() {
        return this.D;
    }

    /* access modifiers changed from: package-private */
    public final Object n() {
        return this.E;
    }

    /* access modifiers changed from: package-private */
    public final Object o() {
        return this.F;
    }
}
