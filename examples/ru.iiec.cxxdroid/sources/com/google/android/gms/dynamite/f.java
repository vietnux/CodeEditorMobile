package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

final class f implements DynamiteModule.b {
    f() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0083b a(Context context, String str, DynamiteModule.b.a aVar) {
        int i2;
        DynamiteModule.b.C0083b bVar = new DynamiteModule.b.C0083b();
        bVar.a = aVar.a(context, str);
        bVar.f3741b = aVar.a(context, str, true);
        if (bVar.a == 0 && bVar.f3741b == 0) {
            i2 = 0;
        } else if (bVar.a >= bVar.f3741b) {
            i2 = -1;
        } else {
            bVar.f3742c = 1;
            return bVar;
        }
        bVar.f3742c = i2;
        return bVar;
    }
}
