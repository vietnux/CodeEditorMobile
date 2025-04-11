package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.gmsg.e0;
import com.google.android.gms.common.util.o;

final /* synthetic */ class zf0 implements o {
    private final e0 a;

    zf0(e0 e0Var) {
        this.a = e0Var;
    }

    @Override // com.google.android.gms.common.util.o
    public final boolean a(Object obj) {
        e0 e0Var = (e0) obj;
        return (e0Var instanceof fg0) && ((fg0) e0Var).a.equals(this.a);
    }
}
