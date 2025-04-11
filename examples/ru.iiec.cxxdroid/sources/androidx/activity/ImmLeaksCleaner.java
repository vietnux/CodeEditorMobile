package androidx.activity;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.f;
import androidx.lifecycle.g;
import androidx.lifecycle.i;
import java.lang.reflect.Field;

/* access modifiers changed from: package-private */
public final class ImmLeaksCleaner implements g {

    /* renamed from: b  reason: collision with root package name */
    private static int f79b;

    /* renamed from: c  reason: collision with root package name */
    private static Field f80c;

    /* renamed from: d  reason: collision with root package name */
    private static Field f81d;

    /* renamed from: e  reason: collision with root package name */
    private static Field f82e;
    private Activity a;

    ImmLeaksCleaner(Activity activity) {
        this.a = activity;
    }

    private static void a() {
        try {
            f79b = 2;
            f81d = InputMethodManager.class.getDeclaredField("mServedView");
            f81d.setAccessible(true);
            f82e = InputMethodManager.class.getDeclaredField("mNextServedView");
            f82e.setAccessible(true);
            f80c = InputMethodManager.class.getDeclaredField("mH");
            f80c.setAccessible(true);
            f79b = 1;
        } catch (NoSuchFieldException unused) {
        }
    }

    @Override // androidx.lifecycle.g
    public void a(i iVar, f.b bVar) {
        if (bVar == f.b.ON_DESTROY) {
            if (f79b == 0) {
                a();
            }
            if (f79b == 1) {
                InputMethodManager inputMethodManager = (InputMethodManager) this.a.getSystemService("input_method");
                try {
                    Object obj = f80c.get(inputMethodManager);
                    if (obj != null) {
                        synchronized (obj) {
                            try {
                                View view = (View) f81d.get(inputMethodManager);
                                if (view != null) {
                                    if (!view.isAttachedToWindow()) {
                                        try {
                                            f82e.set(inputMethodManager, null);
                                            inputMethodManager.isActive();
                                        } catch (IllegalAccessException unused) {
                                        }
                                    }
                                }
                            } catch (IllegalAccessException unused2) {
                            } catch (ClassCastException unused3) {
                            }
                        }
                    }
                } catch (IllegalAccessException unused4) {
                }
            }
        }
    }
}
