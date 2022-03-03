package com.google.android.gms.internal.ads;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* access modifiers changed from: package-private */
public final class ju {
    private static final Logger a = Logger.getLogger(ju.class.getName());

    /* renamed from: b  reason: collision with root package name */
    private static final Unsafe f4730b = d();

    /* renamed from: c  reason: collision with root package name */
    private static final Class<?> f4731c = aq.b();

    /* renamed from: d  reason: collision with root package name */
    private static final boolean f4732d = c(Long.TYPE);

    /* renamed from: e  reason: collision with root package name */
    private static final boolean f4733e = c(Integer.TYPE);

    /* renamed from: f  reason: collision with root package name */
    private static final d f4734f;

    /* renamed from: g  reason: collision with root package name */
    private static final boolean f4735g = f();

    /* renamed from: h  reason: collision with root package name */
    private static final boolean f4736h = e();

    /* renamed from: i  reason: collision with root package name */
    private static final long f4737i = ((long) a(byte[].class));

    /* renamed from: j  reason: collision with root package name */
    private static final boolean f4738j = (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN);

    static final class a extends d {
        a(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.ads.ju.d
        public final void a(Object obj, long j2, byte b2) {
            if (ju.f4738j) {
                ju.a(obj, j2, b2);
            } else {
                ju.b(obj, j2, b2);
            }
        }

        @Override // com.google.android.gms.internal.ads.ju.d
        public final void a(Object obj, long j2, double d2) {
            a(obj, j2, Double.doubleToLongBits(d2));
        }

        @Override // com.google.android.gms.internal.ads.ju.d
        public final void a(Object obj, long j2, float f2) {
            a(obj, j2, Float.floatToIntBits(f2));
        }

        @Override // com.google.android.gms.internal.ads.ju.d
        public final void a(Object obj, long j2, boolean z) {
            if (ju.f4738j) {
                ju.b(obj, j2, z);
            } else {
                ju.c(obj, j2, z);
            }
        }

        @Override // com.google.android.gms.internal.ads.ju.d
        public final boolean c(Object obj, long j2) {
            return ju.f4738j ? ju.i(obj, j2) : ju.j(obj, j2);
        }

        @Override // com.google.android.gms.internal.ads.ju.d
        public final float d(Object obj, long j2) {
            return Float.intBitsToFloat(a(obj, j2));
        }

        @Override // com.google.android.gms.internal.ads.ju.d
        public final double e(Object obj, long j2) {
            return Double.longBitsToDouble(b(obj, j2));
        }

        @Override // com.google.android.gms.internal.ads.ju.d
        public final byte f(Object obj, long j2) {
            return ju.f4738j ? ju.g(obj, j2) : ju.h(obj, j2);
        }
    }

    static final class b extends d {
        b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.ads.ju.d
        public final void a(Object obj, long j2, byte b2) {
            if (ju.f4738j) {
                ju.a(obj, j2, b2);
            } else {
                ju.b(obj, j2, b2);
            }
        }

        @Override // com.google.android.gms.internal.ads.ju.d
        public final void a(Object obj, long j2, double d2) {
            a(obj, j2, Double.doubleToLongBits(d2));
        }

        @Override // com.google.android.gms.internal.ads.ju.d
        public final void a(Object obj, long j2, float f2) {
            a(obj, j2, Float.floatToIntBits(f2));
        }

        @Override // com.google.android.gms.internal.ads.ju.d
        public final void a(Object obj, long j2, boolean z) {
            if (ju.f4738j) {
                ju.b(obj, j2, z);
            } else {
                ju.c(obj, j2, z);
            }
        }

        @Override // com.google.android.gms.internal.ads.ju.d
        public final boolean c(Object obj, long j2) {
            return ju.f4738j ? ju.i(obj, j2) : ju.j(obj, j2);
        }

        @Override // com.google.android.gms.internal.ads.ju.d
        public final float d(Object obj, long j2) {
            return Float.intBitsToFloat(a(obj, j2));
        }

        @Override // com.google.android.gms.internal.ads.ju.d
        public final double e(Object obj, long j2) {
            return Double.longBitsToDouble(b(obj, j2));
        }

        @Override // com.google.android.gms.internal.ads.ju.d
        public final byte f(Object obj, long j2) {
            return ju.f4738j ? ju.g(obj, j2) : ju.h(obj, j2);
        }
    }

    static final class c extends d {
        c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.ads.ju.d
        public final void a(Object obj, long j2, byte b2) {
            this.a.putByte(obj, j2, b2);
        }

        @Override // com.google.android.gms.internal.ads.ju.d
        public final void a(Object obj, long j2, double d2) {
            this.a.putDouble(obj, j2, d2);
        }

        @Override // com.google.android.gms.internal.ads.ju.d
        public final void a(Object obj, long j2, float f2) {
            this.a.putFloat(obj, j2, f2);
        }

        @Override // com.google.android.gms.internal.ads.ju.d
        public final void a(Object obj, long j2, boolean z) {
            this.a.putBoolean(obj, j2, z);
        }

        @Override // com.google.android.gms.internal.ads.ju.d
        public final boolean c(Object obj, long j2) {
            return this.a.getBoolean(obj, j2);
        }

        @Override // com.google.android.gms.internal.ads.ju.d
        public final float d(Object obj, long j2) {
            return this.a.getFloat(obj, j2);
        }

        @Override // com.google.android.gms.internal.ads.ju.d
        public final double e(Object obj, long j2) {
            return this.a.getDouble(obj, j2);
        }

        @Override // com.google.android.gms.internal.ads.ju.d
        public final byte f(Object obj, long j2) {
            return this.a.getByte(obj, j2);
        }
    }

    /* access modifiers changed from: package-private */
    public static abstract class d {
        Unsafe a;

        d(Unsafe unsafe) {
            this.a = unsafe;
        }

        public final int a(Object obj, long j2) {
            return this.a.getInt(obj, j2);
        }

        public final long a(Field field) {
            return this.a.objectFieldOffset(field);
        }

        public abstract void a(Object obj, long j2, byte b2);

        public abstract void a(Object obj, long j2, double d2);

        public abstract void a(Object obj, long j2, float f2);

        public final void a(Object obj, long j2, int i2) {
            this.a.putInt(obj, j2, i2);
        }

        public final void a(Object obj, long j2, long j3) {
            this.a.putLong(obj, j2, j3);
        }

        public abstract void a(Object obj, long j2, boolean z);

        public final long b(Object obj, long j2) {
            return this.a.getLong(obj, j2);
        }

        public abstract boolean c(Object obj, long j2);

        public abstract float d(Object obj, long j2);

        public abstract double e(Object obj, long j2);

        public abstract byte f(Object obj, long j2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00c3  */
    static {
        /*
        // Method dump skipped, instructions count: 199
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ju.<clinit>():void");
    }

    private ju() {
    }

    static byte a(byte[] bArr, long j2) {
        return f4734f.f(bArr, f4737i + j2);
    }

    private static int a(Class<?> cls) {
        if (f4736h) {
            return f4734f.a.arrayBaseOffset(cls);
        }
        return -1;
    }

    static int a(Object obj, long j2) {
        return f4734f.a(obj, j2);
    }

    static long a(Field field) {
        return f4734f.a(field);
    }

    private static Field a(Class<?> cls, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    public static void a(Object obj, long j2, byte b2) {
        long j3 = -4 & j2;
        int a2 = a(obj, j3);
        int i2 = ((~((int) j2)) & 3) << 3;
        a(obj, j3, ((255 & b2) << i2) | (a2 & (~(255 << i2))));
    }

    static void a(Object obj, long j2, double d2) {
        f4734f.a(obj, j2, d2);
    }

    static void a(Object obj, long j2, float f2) {
        f4734f.a(obj, j2, f2);
    }

    static void a(Object obj, long j2, int i2) {
        f4734f.a(obj, j2, i2);
    }

    static void a(Object obj, long j2, long j3) {
        f4734f.a(obj, j2, j3);
    }

    static void a(Object obj, long j2, Object obj2) {
        f4734f.a.putObject(obj, j2, obj2);
    }

    static void a(Object obj, long j2, boolean z) {
        f4734f.a(obj, j2, z);
    }

    static void a(byte[] bArr, long j2, byte b2) {
        f4734f.a((Object) bArr, f4737i + j2, b2);
    }

    private static int b(Class<?> cls) {
        if (f4736h) {
            return f4734f.a.arrayIndexScale(cls);
        }
        return -1;
    }

    static long b(Object obj, long j2) {
        return f4734f.b(obj, j2);
    }

    private static long b(Field field) {
        d dVar;
        if (field == null || (dVar = f4734f) == null) {
            return -1;
        }
        return dVar.a(field);
    }

    /* access modifiers changed from: private */
    public static void b(Object obj, long j2, byte b2) {
        long j3 = -4 & j2;
        int i2 = (((int) j2) & 3) << 3;
        a(obj, j3, ((255 & b2) << i2) | (a(obj, j3) & (~(255 << i2))));
    }

    /* access modifiers changed from: private */
    public static void b(Object obj, long j2, boolean z) {
        a(obj, j2, z ? (byte) 1 : 0);
    }

    static boolean b() {
        return f4736h;
    }

    /* access modifiers changed from: private */
    public static void c(Object obj, long j2, boolean z) {
        b(obj, j2, z ? (byte) 1 : 0);
    }

    static boolean c() {
        return f4735g;
    }

    private static boolean c(Class<?> cls) {
        if (!aq.a()) {
            return false;
        }
        try {
            Class<?> cls2 = f4731c;
            cls2.getMethod("peekLong", cls, Boolean.TYPE);
            cls2.getMethod("pokeLong", cls, Long.TYPE, Boolean.TYPE);
            cls2.getMethod("pokeInt", cls, Integer.TYPE, Boolean.TYPE);
            cls2.getMethod("peekInt", cls, Boolean.TYPE);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, Integer.TYPE, Integer.TYPE);
            cls2.getMethod("peekByteArray", cls, byte[].class, Integer.TYPE, Integer.TYPE);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    static boolean c(Object obj, long j2) {
        return f4734f.c(obj, j2);
    }

    static float d(Object obj, long j2) {
        return f4734f.d(obj, j2);
    }

    static Unsafe d() {
        try {
            return (Unsafe) AccessController.doPrivileged(new ku());
        } catch (Throwable unused) {
            return null;
        }
    }

    static double e(Object obj, long j2) {
        return f4734f.e(obj, j2);
    }

    private static boolean e() {
        Unsafe unsafe = f4730b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            cls.getMethod("getInt", Object.class, Long.TYPE);
            cls.getMethod("putInt", Object.class, Long.TYPE, Integer.TYPE);
            cls.getMethod("getLong", Object.class, Long.TYPE);
            cls.getMethod("putLong", Object.class, Long.TYPE, Long.TYPE);
            cls.getMethod("getObject", Object.class, Long.TYPE);
            cls.getMethod("putObject", Object.class, Long.TYPE, Object.class);
            if (aq.a()) {
                return true;
            }
            cls.getMethod("getByte", Object.class, Long.TYPE);
            cls.getMethod("putByte", Object.class, Long.TYPE, Byte.TYPE);
            cls.getMethod("getBoolean", Object.class, Long.TYPE);
            cls.getMethod("putBoolean", Object.class, Long.TYPE, Boolean.TYPE);
            cls.getMethod("getFloat", Object.class, Long.TYPE);
            cls.getMethod("putFloat", Object.class, Long.TYPE, Float.TYPE);
            cls.getMethod("getDouble", Object.class, Long.TYPE);
            cls.getMethod("putDouble", Object.class, Long.TYPE, Double.TYPE);
            return true;
        } catch (Throwable th) {
            Logger logger = a;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(valueOf);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", sb.toString());
            return false;
        }
    }

    static Object f(Object obj, long j2) {
        return f4734f.a.getObject(obj, j2);
    }

    private static boolean f() {
        Unsafe unsafe = f4730b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("getLong", Object.class, Long.TYPE);
            if (g() == null) {
                return false;
            }
            if (aq.a()) {
                return true;
            }
            cls.getMethod("getByte", Long.TYPE);
            cls.getMethod("putByte", Long.TYPE, Byte.TYPE);
            cls.getMethod("getInt", Long.TYPE);
            cls.getMethod("putInt", Long.TYPE, Integer.TYPE);
            cls.getMethod("getLong", Long.TYPE);
            cls.getMethod("putLong", Long.TYPE, Long.TYPE);
            cls.getMethod("copyMemory", Long.TYPE, Long.TYPE, Long.TYPE);
            cls.getMethod("copyMemory", Object.class, Long.TYPE, Object.class, Long.TYPE, Long.TYPE);
            return true;
        } catch (Throwable th) {
            Logger logger = a;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(valueOf);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", sb.toString());
            return false;
        }
    }

    /* access modifiers changed from: private */
    public static byte g(Object obj, long j2) {
        return (byte) (a(obj, -4 & j2) >>> ((int) (((~j2) & 3) << 3)));
    }

    private static Field g() {
        Field a2;
        if (aq.a() && (a2 = a(Buffer.class, "effectiveDirectAddress")) != null) {
            return a2;
        }
        Field a3 = a(Buffer.class, "address");
        if (a3 == null || a3.getType() != Long.TYPE) {
            return null;
        }
        return a3;
    }

    /* access modifiers changed from: private */
    public static byte h(Object obj, long j2) {
        return (byte) (a(obj, -4 & j2) >>> ((int) ((j2 & 3) << 3)));
    }

    /* access modifiers changed from: private */
    public static boolean i(Object obj, long j2) {
        return g(obj, j2) != 0;
    }

    /* access modifiers changed from: private */
    public static boolean j(Object obj, long j2) {
        return h(obj, j2) != 0;
    }
}
