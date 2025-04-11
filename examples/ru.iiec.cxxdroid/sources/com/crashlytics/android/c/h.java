package com.crashlytics.android.c;

import f.a.a.a.n.c.o.b;
import f.a.a.a.n.c.o.c;
import f.a.a.a.n.c.o.e;
import f.a.a.a.n.d.f;
import java.io.File;
import java.util.List;

class h implements f {
    private final x a;

    /* renamed from: b  reason: collision with root package name */
    private final u f2845b;

    h(x xVar, u uVar) {
        this.a = xVar;
        this.f2845b = uVar;
    }

    public static h a(x xVar) {
        return new h(xVar, new u(new e(new t(new c(1000, 8), 0.1d), new b(5))));
    }

    @Override // f.a.a.a.n.d.f
    public boolean a(List<File> list) {
        long nanoTime = System.nanoTime();
        if (this.f2845b.a(nanoTime)) {
            if (this.a.a(list)) {
                this.f2845b.a();
                return true;
            }
            this.f2845b.b(nanoTime);
        }
        return false;
    }
}
