package com.google.android.gms.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.p.c;
import com.google.android.gms.ads.p.d;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.internal.ads.b70;
import com.google.android.gms.internal.ads.d40;

public final class h {
    private final b70 a;

    public h(Context context) {
        this.a = new b70(context);
        y.a(context, "Context cannot be null");
    }

    public final void a(a aVar) {
        this.a.a(aVar);
        if (aVar != null && (aVar instanceof d40)) {
            this.a.a((d40) aVar);
        } else if (aVar == null) {
            this.a.a((d40) null);
        }
    }

    public final void a(c cVar) {
        this.a.a(cVar.a());
    }

    public final void a(c cVar) {
        this.a.a(cVar);
    }

    public final void a(d dVar) {
        this.a.a(dVar);
    }

    public final void a(String str) {
        this.a.a(str);
    }

    public final void a(boolean z) {
        this.a.a(z);
    }

    public final boolean a() {
        return this.a.a();
    }

    public final void b() {
        this.a.b();
    }

    public final void b(boolean z) {
        this.a.b(true);
    }

    public final Bundle c() {
        return this.a.c();
    }
}
