package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.e;
import com.google.android.gms.common.b;
import java.util.Collections;

final class z implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ b f3573b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ e.c f3574c;

    z(e.c cVar, b bVar) {
        this.f3574c = cVar;
        this.f3573b = bVar;
    }

    public final void run() {
        if (this.f3573b.x()) {
            this.f3574c.f3534e = true;
            if (this.f3574c.a.i()) {
                this.f3574c.a();
            } else {
                this.f3574c.a.a(null, Collections.emptySet());
            }
        } else {
            ((e.a) e.this.f3513i.get(this.f3574c.f3531b)).a(this.f3573b);
        }
    }
}
