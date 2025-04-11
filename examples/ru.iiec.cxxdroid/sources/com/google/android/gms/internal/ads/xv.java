package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import c.c.b.b;
import c.c.b.d;
import java.lang.ref.WeakReference;

public final class xv extends d {
    private WeakReference<yv> a;

    public xv(yv yvVar) {
        this.a = new WeakReference<>(yvVar);
    }

    @Override // c.c.b.d
    public final void a(ComponentName componentName, b bVar) {
        yv yvVar = this.a.get();
        if (yvVar != null) {
            yvVar.a(bVar);
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        yv yvVar = this.a.get();
        if (yvVar != null) {
            yvVar.a();
        }
    }
}
