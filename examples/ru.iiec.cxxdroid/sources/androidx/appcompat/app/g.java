package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.b;
import androidx.appcompat.widget.Toolbar;
import c.a.o.b;
import c.e.b;
import java.lang.ref.WeakReference;
import java.util.Iterator;

public abstract class g {

    /* renamed from: b  reason: collision with root package name */
    private static int f177b = -100;

    /* renamed from: c  reason: collision with root package name */
    private static final b<WeakReference<g>> f178c = new b<>();

    /* renamed from: d  reason: collision with root package name */
    private static final Object f179d = new Object();

    g() {
    }

    public static g a(Activity activity, f fVar) {
        return new h(activity, fVar);
    }

    public static g a(Dialog dialog, f fVar) {
        return new h(dialog, fVar);
    }

    static void a(g gVar) {
        synchronized (f179d) {
            c(gVar);
            f178c.add(new WeakReference<>(gVar));
        }
    }

    static void b(g gVar) {
        synchronized (f179d) {
            c(gVar);
        }
    }

    private static void c(g gVar) {
        synchronized (f179d) {
            Iterator<WeakReference<g>> it = f178c.iterator();
            while (it.hasNext()) {
                g gVar2 = it.next().get();
                if (gVar2 == gVar || gVar2 == null) {
                    it.remove();
                }
            }
        }
    }

    public static void e(int i2) {
        if (i2 != -1 && i2 != 0 && i2 != 1 && i2 != 2 && i2 != 3) {
            Log.d("AppCompatDelegate", "setDefaultNightMode() called with an unknown mode");
        } else if (f177b != i2) {
            f177b = i2;
            l();
        }
    }

    private static void l() {
        synchronized (f179d) {
            Iterator<WeakReference<g>> it = f178c.iterator();
            while (it.hasNext()) {
                g gVar = it.next().get();
                if (gVar != null) {
                    gVar.a();
                }
            }
        }
    }

    public static int m() {
        return f177b;
    }

    public abstract <T extends View> T a(int i2);

    public abstract c.a.o.b a(b.a aVar);

    @Deprecated
    public void a(Context context) {
    }

    public abstract void a(Configuration configuration);

    public abstract void a(Bundle bundle);

    public abstract void a(View view);

    public abstract void a(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void a(Toolbar toolbar);

    public abstract void a(CharSequence charSequence);

    public abstract boolean a();

    public Context b(Context context) {
        a(context);
        return context;
    }

    public abstract b.AbstractC0007b b();

    public abstract void b(Bundle bundle);

    public abstract void b(View view, ViewGroup.LayoutParams layoutParams);

    public abstract boolean b(int i2);

    public int c() {
        return -100;
    }

    public abstract void c(int i2);

    public abstract void c(Bundle bundle);

    public abstract MenuInflater d();

    public void d(int i2) {
    }

    public abstract a e();

    public abstract void f();

    public abstract void g();

    public abstract void h();

    public abstract void i();

    public abstract void j();

    public abstract void k();
}
