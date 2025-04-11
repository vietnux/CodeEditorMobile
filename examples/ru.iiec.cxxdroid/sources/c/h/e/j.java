package c.h.e;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.util.Log;
import c.h.d.d.c;
import c.h.i.f;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;

/* access modifiers changed from: package-private */
public class j {
    @SuppressLint({"BanConcurrentHashMap"})
    private ConcurrentHashMap<Long, c.b> a = new ConcurrentHashMap<>();

    /* access modifiers changed from: package-private */
    public class a implements c<f.b> {
        a(j jVar) {
        }

        public int a(f.b bVar) {
            return bVar.d();
        }

        public boolean b(f.b bVar) {
            return bVar.e();
        }
    }

    /* access modifiers changed from: package-private */
    public class b implements c<c.C0043c> {
        b(j jVar) {
        }

        public int a(c.C0043c cVar) {
            return cVar.e();
        }

        public boolean b(c.C0043c cVar) {
            return cVar.f();
        }
    }

    /* access modifiers changed from: private */
    public interface c<T> {
        int a(T t);

        boolean b(T t);
    }

    j() {
    }

    private c.C0043c a(c.b bVar, int i2) {
        return (c.C0043c) a(bVar.a(), i2, new b(this));
    }

    private static <T> T a(T[] tArr, int i2, c<T> cVar) {
        int i3 = (i2 & 1) == 0 ? 400 : 700;
        boolean z = (i2 & 2) != 0;
        T t = null;
        int i4 = Integer.MAX_VALUE;
        for (T t2 : tArr) {
            int abs = (Math.abs(cVar.a(t2) - i3) * 2) + (cVar.b(t2) == z ? 0 : 1);
            if (t == null || i4 > abs) {
                t = t2;
                i4 = abs;
            }
        }
        return t;
    }

    private void a(Typeface typeface, c.b bVar) {
        long b2 = b(typeface);
        if (b2 != 0) {
            this.a.put(Long.valueOf(b2), bVar);
        }
    }

    private static long b(Typeface typeface) {
        if (typeface == null) {
            return 0;
        }
        try {
            Field declaredField = Typeface.class.getDeclaredField("native_instance");
            declaredField.setAccessible(true);
            return ((Number) declaredField.get(typeface)).longValue();
        } catch (NoSuchFieldException e2) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e2);
            return 0;
        } catch (IllegalAccessException e3) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e3);
            return 0;
        }
    }

    public Typeface a(Context context, Resources resources, int i2, String str, int i3) {
        File a2 = k.a(context);
        if (a2 == null) {
            return null;
        }
        try {
            if (!k.a(a2, resources, i2)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(a2.getPath());
            a2.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            a2.delete();
        }
    }

    public Typeface a(Context context, CancellationSignal cancellationSignal, f.b[] bVarArr, int i2) {
        InputStream inputStream;
        Throwable th;
        InputStream inputStream2 = null;
        if (bVarArr.length < 1) {
            return null;
        }
        try {
            inputStream = context.getContentResolver().openInputStream(a(bVarArr, i2).c());
            try {
                Typeface a2 = a(context, inputStream);
                k.a(inputStream);
                return a2;
            } catch (IOException unused) {
                k.a(inputStream);
                return null;
            } catch (Throwable th2) {
                th = th2;
                inputStream2 = inputStream;
                k.a(inputStream2);
                throw th;
            }
        } catch (IOException unused2) {
            inputStream = null;
            k.a(inputStream);
            return null;
        } catch (Throwable th3) {
            th = th3;
            k.a(inputStream2);
            throw th;
        }
    }

    public Typeface a(Context context, c.b bVar, Resources resources, int i2) {
        c.C0043c a2 = a(bVar, i2);
        if (a2 == null) {
            return null;
        }
        Typeface a3 = d.a(context, resources, a2.b(), a2.a(), i2);
        a(a3, bVar);
        return a3;
    }

    /* access modifiers changed from: protected */
    public Typeface a(Context context, InputStream inputStream) {
        File a2 = k.a(context);
        if (a2 == null) {
            return null;
        }
        try {
            if (!k.a(a2, inputStream)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(a2.getPath());
            a2.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            a2.delete();
        }
    }

    /* access modifiers changed from: package-private */
    public c.b a(Typeface typeface) {
        long b2 = b(typeface);
        if (b2 == 0) {
            return null;
        }
        return this.a.get(Long.valueOf(b2));
    }

    /* access modifiers changed from: protected */
    public f.b a(f.b[] bVarArr, int i2) {
        return (f.b) a(bVarArr, i2, new a(this));
    }
}
