package qwe.qweqwe.texteditor;

import android.app.Activity;
import android.content.Context;
import java.lang.ref.WeakReference;
import l.a.c;

/* access modifiers changed from: package-private */
public final class f0 {
    private static final String[] a = {"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"};

    /* renamed from: b  reason: collision with root package name */
    private static l.a.a f9629b;

    /* access modifiers changed from: private */
    public static final class b implements l.a.a {
        private final WeakReference<e0> a;

        /* renamed from: b  reason: collision with root package name */
        private final Runnable f9630b;

        private b(e0 e0Var, Runnable runnable) {
            this.a = new WeakReference<>(e0Var);
            this.f9630b = runnable;
        }

        @Override // l.a.b
        public void a() {
            e0 e0Var = this.a.get();
            if (e0Var != null) {
                androidx.core.app.a.a(e0Var, f0.a, 0);
            }
        }

        @Override // l.a.a
        public void b() {
            e0 e0Var = this.a.get();
            if (e0Var != null) {
                e0Var.a(this.f9630b);
            }
        }

        @Override // l.a.b
        public void cancel() {
            e0 e0Var = this.a.get();
            if (e0Var != null) {
                e0Var.Z();
            }
        }
    }

    static void a(e0 e0Var, int i2, int[] iArr) {
        if (i2 == 0) {
            if (c.a(e0Var) >= 23 || c.a((Context) e0Var, a)) {
                if (c.a(iArr)) {
                    l.a.a aVar = f9629b;
                    if (aVar != null) {
                        aVar.b();
                    }
                } else if (!c.a((Activity) e0Var, a)) {
                    e0Var.X();
                } else {
                    e0Var.Z();
                }
                f9629b = null;
                return;
            }
            e0Var.Z();
        }
    }

    static void a(e0 e0Var, Runnable runnable) {
        if (c.a((Context) e0Var, a)) {
            e0Var.a(runnable);
            return;
        }
        f9629b = new b(e0Var, runnable);
        if (c.a((Activity) e0Var, a)) {
            e0Var.a(f9629b);
        } else {
            androidx.core.app.a.a(e0Var, a, 0);
        }
    }
}
