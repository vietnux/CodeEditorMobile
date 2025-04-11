package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.d;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.j;

public final class a0<O extends a.d> extends s {
    private final e<O> a;

    public a0(e<O> eVar) {
        super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
        this.a = eVar;
    }

    @Override // com.google.android.gms.common.api.f
    public final Looper a() {
        return this.a.d();
    }

    @Override // com.google.android.gms.common.api.f
    public final <A extends a.b, R extends j, T extends c<R, A>> T a(T t) {
        this.a.a(t);
        return t;
    }
}
