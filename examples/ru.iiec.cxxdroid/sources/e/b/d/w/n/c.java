package e.b.d.w.n;

import e.b.d.k;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;

final class c extends b {

    /* renamed from: d  reason: collision with root package name */
    private static Class f8026d;

    /* renamed from: b  reason: collision with root package name */
    private final Object f8027b = c();

    /* renamed from: c  reason: collision with root package name */
    private final Field f8028c = b();

    c() {
    }

    private static Field b() {
        try {
            return AccessibleObject.class.getDeclaredField("override");
        } catch (NoSuchFieldException unused) {
            return null;
        }
    }

    private static Object c() {
        try {
            f8026d = Class.forName("sun.misc.Unsafe");
            Field declaredField = f8026d.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            return declaredField.get(null);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // e.b.d.w.n.b
    public void a(AccessibleObject accessibleObject) {
        if (!b(accessibleObject)) {
            try {
                accessibleObject.setAccessible(true);
            } catch (SecurityException e2) {
                throw new k("Gson couldn't modify fields for " + accessibleObject + "\nand sun.misc.Unsafe not found.\nEither write a custom type adapter, or make fields accessible, or include sun.misc.Unsafe.", e2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean b(AccessibleObject accessibleObject) {
        if (!(this.f8027b == null || this.f8028c == null)) {
            try {
                long longValue = ((Long) f8026d.getMethod("objectFieldOffset", Field.class).invoke(this.f8027b, this.f8028c)).longValue();
                f8026d.getMethod("putBoolean", Object.class, Long.TYPE, Boolean.TYPE).invoke(this.f8027b, accessibleObject, Long.valueOf(longValue), true);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }
}
