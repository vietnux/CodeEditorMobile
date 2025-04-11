package c.h.e;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import c.h.d.d.c;
import c.h.i.f;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;

public class g extends e {

    /* renamed from: g  reason: collision with root package name */
    protected final Class<?> f2310g;

    /* renamed from: h  reason: collision with root package name */
    protected final Constructor<?> f2311h;

    /* renamed from: i  reason: collision with root package name */
    protected final Method f2312i;

    /* renamed from: j  reason: collision with root package name */
    protected final Method f2313j;

    /* renamed from: k  reason: collision with root package name */
    protected final Method f2314k;

    /* renamed from: l  reason: collision with root package name */
    protected final Method f2315l;

    /* renamed from: m  reason: collision with root package name */
    protected final Method f2316m;

    public g() {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Constructor<?> constructor;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> a = a();
            constructor = e(a);
            method4 = b(a);
            method3 = c(a);
            method2 = f(a);
            method = a(a);
            method5 = d(a);
            cls = a;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class " + e2.getClass().getName(), e2);
            method5 = null;
            constructor = null;
            method4 = null;
            method3 = null;
            method2 = null;
            method = null;
        }
        this.f2310g = cls;
        this.f2311h = constructor;
        this.f2312i = method4;
        this.f2313j = method3;
        this.f2314k = method2;
        this.f2315l = method;
        this.f2316m = method5;
    }

    private boolean a(Context context, Object obj, String str, int i2, int i3, int i4, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f2312i.invoke(obj, context.getAssets(), str, 0, false, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean a(Object obj, ByteBuffer byteBuffer, int i2, int i3, int i4) {
        try {
            return ((Boolean) this.f2313j.invoke(obj, byteBuffer, Integer.valueOf(i2), null, Integer.valueOf(i3), Integer.valueOf(i4))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private void b(Object obj) {
        try {
            this.f2315l.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    private boolean b() {
        if (this.f2312i == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.f2312i != null;
    }

    private Object c() {
        try {
            return this.f2311h.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    private boolean c(Object obj) {
        try {
            return ((Boolean) this.f2314k.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    @Override // c.h.e.j
    public Typeface a(Context context, Resources resources, int i2, String str, int i3) {
        if (!b()) {
            return super.a(context, resources, i2, str, i3);
        }
        Object c2 = c();
        if (c2 == null) {
            return null;
        }
        if (!a(context, c2, str, 0, -1, -1, null)) {
            b(c2);
            return null;
        } else if (!c(c2)) {
            return null;
        } else {
            return a(c2);
        }
    }

    @Override // c.h.e.j, c.h.e.e
    public Typeface a(Context context, CancellationSignal cancellationSignal, f.b[] bVarArr, int i2) {
        Typeface a;
        if (bVarArr.length < 1) {
            return null;
        }
        if (!b()) {
            f.b a2 = a(bVarArr, i2);
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(a2.c(), "r", cancellationSignal);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(a2.d()).setItalic(a2.e()).build();
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return build;
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            } catch (IOException unused) {
                return null;
            }
        } else {
            Map<Uri, ByteBuffer> a3 = k.a(context, bVarArr, cancellationSignal);
            Object c2 = c();
            if (c2 == null) {
                return null;
            }
            boolean z = false;
            for (f.b bVar : bVarArr) {
                ByteBuffer byteBuffer = a3.get(bVar.c());
                if (byteBuffer != null) {
                    if (!a(c2, byteBuffer, bVar.b(), bVar.d(), bVar.e() ? 1 : 0)) {
                        b(c2);
                        return null;
                    }
                    z = true;
                }
            }
            if (!z) {
                b(c2);
                return null;
            } else if (c(c2) && (a = a(c2)) != null) {
                return Typeface.create(a, i2);
            } else {
                return null;
            }
        }
        throw th;
    }

    @Override // c.h.e.j, c.h.e.e
    public Typeface a(Context context, c.b bVar, Resources resources, int i2) {
        if (!b()) {
            return super.a(context, bVar, resources, i2);
        }
        Object c2 = c();
        if (c2 == null) {
            return null;
        }
        c.C0043c[] a = bVar.a();
        for (c.C0043c cVar : a) {
            if (!a(context, c2, cVar.a(), cVar.c(), cVar.e(), cVar.f() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(cVar.d()))) {
                b(c2);
                return null;
            }
        }
        if (!c(c2)) {
            return null;
        }
        return a(c2);
    }

    /* access modifiers changed from: protected */
    public Typeface a(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f2310g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f2316m.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public Class<?> a() {
        return Class.forName("android.graphics.FontFamily");
    }

    /* access modifiers changed from: protected */
    public Method a(Class<?> cls) {
        return cls.getMethod("abortCreation", new Class[0]);
    }

    /* access modifiers changed from: protected */
    public Method b(Class<?> cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, Integer.TYPE, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    /* access modifiers changed from: protected */
    public Method c(Class<?> cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    /* access modifiers changed from: protected */
    public Method d(Class<?> cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    /* access modifiers changed from: protected */
    public Constructor<?> e(Class<?> cls) {
        return cls.getConstructor(new Class[0]);
    }

    /* access modifiers changed from: protected */
    public Method f(Class<?> cls) {
        return cls.getMethod("freeze", new Class[0]);
    }
}
