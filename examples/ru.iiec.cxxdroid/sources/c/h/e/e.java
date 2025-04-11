package c.h.e;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import c.h.d.d.c;
import c.h.i.f;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class e extends j {

    /* renamed from: b  reason: collision with root package name */
    private static Class<?> f2301b = null;

    /* renamed from: c  reason: collision with root package name */
    private static Constructor<?> f2302c = null;

    /* renamed from: d  reason: collision with root package name */
    private static Method f2303d = null;

    /* renamed from: e  reason: collision with root package name */
    private static Method f2304e = null;

    /* renamed from: f  reason: collision with root package name */
    private static boolean f2305f = false;

    e() {
    }

    private static Typeface a(Object obj) {
        a();
        try {
            Object newInstance = Array.newInstance(f2301b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f2304e.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    private File a(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            String readlink = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                return new File(readlink);
            }
        } catch (ErrnoException unused) {
        }
        return null;
    }

    private static void a() {
        Method method;
        Class<?> cls;
        Method method2;
        if (!f2305f) {
            f2305f = true;
            Constructor<?> constructor = null;
            try {
                cls = Class.forName("android.graphics.FontFamily");
                Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
                method = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
                method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
                constructor = constructor2;
            } catch (ClassNotFoundException | NoSuchMethodException e2) {
                Log.e("TypefaceCompatApi21Impl", e2.getClass().getName(), e2);
                method2 = null;
                cls = null;
                method = null;
            }
            f2302c = constructor;
            f2301b = cls;
            f2303d = method;
            f2304e = method2;
        }
    }

    private static boolean a(Object obj, String str, int i2, boolean z) {
        a();
        try {
            return ((Boolean) f2303d.invoke(obj, str, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    private static Object b() {
        a();
        try {
            return f2302c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // c.h.e.j
    public Typeface a(Context context, CancellationSignal cancellationSignal, f.b[] bVarArr, int i2) {
        if (bVarArr.length < 1) {
            return null;
        }
        f.b a = a(bVarArr, i2);
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(a.c(), "r", cancellationSignal);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            try {
                File a2 = a(openFileDescriptor);
                if (a2 != null) {
                    if (a2.canRead()) {
                        Typeface createFromFile = Typeface.createFromFile(a2);
                        if (openFileDescriptor != null) {
                            openFileDescriptor.close();
                        }
                        return createFromFile;
                    }
                }
                FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                try {
                    Typeface a3 = super.a(context, fileInputStream);
                    fileInputStream.close();
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return a3;
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
        } catch (IOException unused) {
            return null;
        }
        throw th;
        throw th;
    }

    @Override // c.h.e.j
    public Typeface a(Context context, c.b bVar, Resources resources, int i2) {
        Object b2 = b();
        c.C0043c[] a = bVar.a();
        for (c.C0043c cVar : a) {
            File a2 = k.a(context);
            if (a2 == null) {
                return null;
            }
            try {
                if (!k.a(a2, resources, cVar.b())) {
                    a2.delete();
                    return null;
                }
                if (!a(b2, a2.getPath(), cVar.e(), cVar.f())) {
                    return null;
                }
            } catch (RuntimeException unused) {
                return null;
            } finally {
                a2.delete();
            }
        }
        return a(b2);
    }
}
