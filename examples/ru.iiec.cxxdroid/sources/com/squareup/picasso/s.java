package com.squareup.picasso;

import android.content.Context;
import i.a0;
import i.e;
import i.v;
import i.y;
import java.io.File;

public final class s implements j {
    final e.a a;

    public s(Context context) {
        this(d0.b(context));
    }

    public s(v vVar) {
        this.a = vVar;
        vVar.b();
    }

    public s(File file) {
        this(file, d0.a(file));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public s(java.io.File r3, long r4) {
        /*
            r2 = this;
            i.v$b r0 = new i.v$b
            r0.<init>()
            i.c r1 = new i.c
            r1.<init>(r3, r4)
            r0.a(r1)
            i.v r3 = r0.a()
            r2.<init>(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.s.<init>(java.io.File, long):void");
    }

    @Override // com.squareup.picasso.j
    public a0 a(y yVar) {
        return this.a.a(yVar).o();
    }
}
