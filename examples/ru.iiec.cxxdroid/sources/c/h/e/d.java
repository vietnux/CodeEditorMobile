package c.h.e;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import c.e.e;
import c.h.d.d.c;
import c.h.d.d.f;
import c.h.i.f;

public class d {
    private static final j a;

    /* renamed from: b  reason: collision with root package name */
    private static final e<String, Typeface> f2300b = new e<>(16);

    public static class a extends f.c {
        private f.c a;

        public a(f.c cVar) {
            this.a = cVar;
        }

        @Override // c.h.i.f.c
        public void a(int i2) {
            f.c cVar = this.a;
            if (cVar != null) {
                cVar.a(i2);
            }
        }

        @Override // c.h.i.f.c
        public void a(Typeface typeface) {
            f.c cVar = this.a;
            if (cVar != null) {
                cVar.a(typeface);
            }
        }
    }

    static {
        int i2 = Build.VERSION.SDK_INT;
        a = i2 >= 29 ? new i() : i2 >= 28 ? new h() : i2 >= 26 ? new g() : (i2 < 24 || !f.a()) ? Build.VERSION.SDK_INT >= 21 ? new e() : new j() : new f();
    }

    public static Typeface a(Context context, Resources resources, int i2, String str, int i3) {
        Typeface a2 = a.a(context, resources, i2, str, i3);
        if (a2 != null) {
            f2300b.a(a(resources, i2, i3), a2);
        }
        return a2;
    }

    public static Typeface a(Context context, Typeface typeface, int i2) {
        Typeface b2;
        if (context != null) {
            return (Build.VERSION.SDK_INT >= 21 || (b2 = b(context, typeface, i2)) == null) ? Typeface.create(typeface, i2) : b2;
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    public static Typeface a(Context context, CancellationSignal cancellationSignal, f.b[] bVarArr, int i2) {
        return a.a(context, cancellationSignal, bVarArr, i2);
    }

    public static Typeface a(Context context, c.a aVar, Resources resources, int i2, int i3, f.c cVar, Handler handler, boolean z) {
        Typeface typeface;
        if (aVar instanceof c.d) {
            c.d dVar = (c.d) aVar;
            Typeface a2 = a(dVar.c());
            if (a2 != null) {
                if (cVar != null) {
                    cVar.a(a2, handler);
                }
                return a2;
            }
            typeface = c.h.i.f.a(context, dVar.b(), i3, !z ? cVar == null : dVar.a() == 0, z ? dVar.d() : -1, f.c.a(handler), new a(cVar));
        } else {
            typeface = a.a(context, (c.b) aVar, resources, i3);
            if (cVar != null) {
                if (typeface != null) {
                    cVar.a(typeface, handler);
                } else {
                    cVar.a(-3, handler);
                }
            }
        }
        if (typeface != null) {
            f2300b.a(a(resources, i2, i3), typeface);
        }
        return typeface;
    }

    private static Typeface a(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        Typeface create = Typeface.create(str, 0);
        Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
        if (create == null || create.equals(create2)) {
            return null;
        }
        return create;
    }

    private static String a(Resources resources, int i2, int i3) {
        return resources.getResourcePackageName(i2) + "-" + i2 + "-" + i3;
    }

    private static Typeface b(Context context, Typeface typeface, int i2) {
        c.b a2 = a.a(typeface);
        if (a2 == null) {
            return null;
        }
        return a.a(context, a2, context.getResources(), i2);
    }

    public static Typeface b(Resources resources, int i2, int i3) {
        return f2300b.b(a(resources, i2, i3));
    }
}
