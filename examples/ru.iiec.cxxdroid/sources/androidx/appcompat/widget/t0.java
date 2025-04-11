package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public class t0 extends ContextWrapper {

    /* renamed from: c  reason: collision with root package name */
    private static final Object f710c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private static ArrayList<WeakReference<t0>> f711d;
    private final Resources a;

    /* renamed from: b  reason: collision with root package name */
    private final Resources.Theme f712b;

    private t0(Context context) {
        super(context);
        if (b1.b()) {
            this.a = new b1(this, context.getResources());
            this.f712b = this.a.newTheme();
            this.f712b.setTo(context.getTheme());
            return;
        }
        this.a = new v0(this, context.getResources());
        this.f712b = null;
    }

    private static boolean a(Context context) {
        if ((context instanceof t0) || (context.getResources() instanceof v0) || (context.getResources() instanceof b1)) {
            return false;
        }
        return Build.VERSION.SDK_INT < 21 || b1.b();
    }

    public static Context b(Context context) {
        if (!a(context)) {
            return context;
        }
        synchronized (f710c) {
            if (f711d == null) {
                f711d = new ArrayList<>();
            } else {
                for (int size = f711d.size() - 1; size >= 0; size--) {
                    WeakReference<t0> weakReference = f711d.get(size);
                    if (weakReference == null || weakReference.get() == null) {
                        f711d.remove(size);
                    }
                }
                for (int size2 = f711d.size() - 1; size2 >= 0; size2--) {
                    WeakReference<t0> weakReference2 = f711d.get(size2);
                    t0 t0Var = weakReference2 != null ? weakReference2.get() : null;
                    if (t0Var != null && t0Var.getBaseContext() == context) {
                        return t0Var;
                    }
                }
            }
            t0 t0Var2 = new t0(context);
            f711d.add(new WeakReference<>(t0Var2));
            return t0Var2;
        }
    }

    public AssetManager getAssets() {
        return this.a.getAssets();
    }

    public Resources getResources() {
        return this.a;
    }

    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f712b;
        return theme == null ? super.getTheme() : theme;
    }

    public void setTheme(int i2) {
        Resources.Theme theme = this.f712b;
        if (theme == null) {
            super.setTheme(i2);
        } else {
            theme.applyStyle(i2, true);
        }
    }
}
