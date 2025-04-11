package c.h.e;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import c.e.g;
import c.h.d.d.c;
import c.h.i.f;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;

class f extends j {

    /* renamed from: b  reason: collision with root package name */
    private static final Class<?> f2306b;

    /* renamed from: c  reason: collision with root package name */
    private static final Constructor<?> f2307c;

    /* renamed from: d  reason: collision with root package name */
    private static final Method f2308d;

    /* renamed from: e  reason: collision with root package name */
    private static final Method f2309e;

    static {
        Method method;
        Method method2;
        Class<?> cls;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            method = cls.getMethod("addFontWeightStyle", ByteBuffer.class, Integer.TYPE, List.class, Integer.TYPE, Boolean.TYPE);
            method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi24Impl", e2.getClass().getName(), e2);
            cls = null;
            method2 = null;
            method = null;
        }
        f2307c = constructor;
        f2306b = cls;
        f2308d = method;
        f2309e = method2;
    }

    f() {
    }

    private static Typeface a(Object obj) {
        try {
            Object newInstance = Array.newInstance(f2306b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f2309e.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public static boolean a() {
        if (f2308d == null) {
            Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        return f2308d != null;
    }

    private static boolean a(Object obj, ByteBuffer byteBuffer, int i2, int i3, boolean z) {
        try {
            return ((Boolean) f2308d.invoke(obj, byteBuffer, Integer.valueOf(i2), null, Integer.valueOf(i3), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private static Object b() {
        try {
            return f2307c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // c.h.e.j
    public Typeface a(Context context, CancellationSignal cancellationSignal, f.b[] bVarArr, int i2) {
        Object b2 = b();
        if (b2 == null) {
            return null;
        }
        g gVar = new g();
        for (f.b bVar : bVarArr) {
            Uri c2 = bVar.c();
            ByteBuffer byteBuffer = (ByteBuffer) gVar.get(c2);
            if (byteBuffer == null) {
                byteBuffer = k.a(context, cancellationSignal, c2);
                gVar.put(c2, byteBuffer);
            }
            if (byteBuffer == null || !a(b2, byteBuffer, bVar.b(), bVar.d(), bVar.e())) {
                return null;
            }
        }
        Typeface a = a(b2);
        if (a == null) {
            return null;
        }
        return Typeface.create(a, i2);
    }

    @Override // c.h.e.j
    public Typeface a(Context context, c.b bVar, Resources resources, int i2) {
        Object b2 = b();
        if (b2 == null) {
            return null;
        }
        c.C0043c[] a = bVar.a();
        for (c.C0043c cVar : a) {
            ByteBuffer a2 = k.a(context, resources, cVar.b());
            if (a2 == null || !a(b2, a2, cVar.c(), cVar.e(), cVar.f())) {
                return null;
            }
        }
        return a(b2);
    }
}
