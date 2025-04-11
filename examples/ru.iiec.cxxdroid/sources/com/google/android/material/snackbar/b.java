package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* access modifiers changed from: package-private */
public class b {

    /* renamed from: e  reason: collision with root package name */
    private static b f6497e;
    private final Object a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final Handler f6498b = new Handler(Looper.getMainLooper(), new a());

    /* renamed from: c  reason: collision with root package name */
    private c f6499c;

    /* renamed from: d  reason: collision with root package name */
    private c f6500d;

    class a implements Handler.Callback {
        a() {
        }

        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            b.this.a((c) message.obj);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.snackbar.b$b  reason: collision with other inner class name */
    public interface AbstractC0091b {
        void a(int i2);

        void e();
    }

    /* access modifiers changed from: private */
    public static class c {
        final WeakReference<AbstractC0091b> a;

        /* renamed from: b  reason: collision with root package name */
        int f6501b;

        /* renamed from: c  reason: collision with root package name */
        boolean f6502c;

        c(int i2, AbstractC0091b bVar) {
            this.a = new WeakReference<>(bVar);
            this.f6501b = i2;
        }

        /* access modifiers changed from: package-private */
        public boolean a(AbstractC0091b bVar) {
            return bVar != null && this.a.get() == bVar;
        }
    }

    private b() {
    }

    static b a() {
        if (f6497e == null) {
            f6497e = new b();
        }
        return f6497e;
    }

    private boolean a(c cVar, int i2) {
        AbstractC0091b bVar = cVar.a.get();
        if (bVar == null) {
            return false;
        }
        this.f6498b.removeCallbacksAndMessages(cVar);
        bVar.a(i2);
        return true;
    }

    private void b() {
        c cVar = this.f6500d;
        if (cVar != null) {
            this.f6499c = cVar;
            this.f6500d = null;
            AbstractC0091b bVar = this.f6499c.a.get();
            if (bVar != null) {
                bVar.e();
            } else {
                this.f6499c = null;
            }
        }
    }

    private void b(c cVar) {
        int i2 = cVar.f6501b;
        if (i2 != -2) {
            if (i2 <= 0) {
                i2 = i2 == -1 ? 1500 : 2750;
            }
            this.f6498b.removeCallbacksAndMessages(cVar);
            Handler handler = this.f6498b;
            handler.sendMessageDelayed(Message.obtain(handler, 0, cVar), (long) i2);
        }
    }

    private boolean f(AbstractC0091b bVar) {
        c cVar = this.f6499c;
        return cVar != null && cVar.a(bVar);
    }

    private boolean g(AbstractC0091b bVar) {
        c cVar = this.f6500d;
        return cVar != null && cVar.a(bVar);
    }

    public void a(int i2, AbstractC0091b bVar) {
        synchronized (this.a) {
            if (f(bVar)) {
                this.f6499c.f6501b = i2;
                this.f6498b.removeCallbacksAndMessages(this.f6499c);
                b(this.f6499c);
                return;
            }
            if (g(bVar)) {
                this.f6500d.f6501b = i2;
            } else {
                this.f6500d = new c(i2, bVar);
            }
            if (this.f6499c == null || !a(this.f6499c, 4)) {
                this.f6499c = null;
                b();
            }
        }
    }

    public void a(AbstractC0091b bVar, int i2) {
        c cVar;
        synchronized (this.a) {
            if (f(bVar)) {
                cVar = this.f6499c;
            } else if (g(bVar)) {
                cVar = this.f6500d;
            }
            a(cVar, i2);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(c cVar) {
        synchronized (this.a) {
            if (this.f6499c == cVar || this.f6500d == cVar) {
                a(cVar, 2);
            }
        }
    }

    public boolean a(AbstractC0091b bVar) {
        boolean z;
        synchronized (this.a) {
            if (!f(bVar)) {
                if (!g(bVar)) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    public void b(AbstractC0091b bVar) {
        synchronized (this.a) {
            if (f(bVar)) {
                this.f6499c = null;
                if (this.f6500d != null) {
                    b();
                }
            }
        }
    }

    public void c(AbstractC0091b bVar) {
        synchronized (this.a) {
            if (f(bVar)) {
                b(this.f6499c);
            }
        }
    }

    public void d(AbstractC0091b bVar) {
        synchronized (this.a) {
            if (f(bVar) && !this.f6499c.f6502c) {
                this.f6499c.f6502c = true;
                this.f6498b.removeCallbacksAndMessages(this.f6499c);
            }
        }
    }

    public void e(AbstractC0091b bVar) {
        synchronized (this.a) {
            if (f(bVar) && this.f6499c.f6502c) {
                this.f6499c.f6502c = false;
                b(this.f6499c);
            }
        }
    }
}
