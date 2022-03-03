package com.google.android.gms.internal.ads;

import android.content.Context;

@k2
public final class w7 implements c8 {
    private d8 a;

    public w7(d8 d8Var) {
        this.a = d8Var;
    }

    @Override // com.google.android.gms.internal.ads.c8
    public final b8 a(Context context, sc scVar, n3 n3Var) {
        y7 y7Var = n3Var.O;
        if (y7Var == null) {
            return null;
        }
        return new q7(context, scVar, y7Var, n3Var.f5025d, this.a);
    }
}
