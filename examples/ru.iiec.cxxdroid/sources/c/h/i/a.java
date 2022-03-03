package c.h.i;

import android.graphics.Typeface;
import android.os.Handler;
import c.h.i.e;
import c.h.i.f;

/* access modifiers changed from: package-private */
public class a {
    private final f.c a;

    /* renamed from: b  reason: collision with root package name */
    private final Handler f2320b;

    /* access modifiers changed from: package-private */
    /* renamed from: c.h.i.a$a  reason: collision with other inner class name */
    public class RunnableC0044a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ f.c f2321b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Typeface f2322c;

        RunnableC0044a(a aVar, f.c cVar, Typeface typeface) {
            this.f2321b = cVar;
            this.f2322c = typeface;
        }

        public void run() {
            this.f2321b.a(this.f2322c);
        }
    }

    /* access modifiers changed from: package-private */
    public class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ f.c f2323b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f2324c;

        b(a aVar, f.c cVar, int i2) {
            this.f2323b = cVar;
            this.f2324c = i2;
        }

        public void run() {
            this.f2323b.a(this.f2324c);
        }
    }

    a(f.c cVar, Handler handler) {
        this.a = cVar;
        this.f2320b = handler;
    }

    private void a(int i2) {
        this.f2320b.post(new b(this, this.a, i2));
    }

    private void a(Typeface typeface) {
        this.f2320b.post(new RunnableC0044a(this, this.a, typeface));
    }

    /* access modifiers changed from: package-private */
    public void a(e.C0045e eVar) {
        if (eVar.a()) {
            a(eVar.a);
        } else {
            a(eVar.f2341b);
        }
    }
}
