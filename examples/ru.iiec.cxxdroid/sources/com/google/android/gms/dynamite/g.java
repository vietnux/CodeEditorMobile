package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

final class g implements DynamiteModule.b {
    g() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0083b a(Context context, String str, DynamiteModule.b.a aVar) {
        DynamiteModule.b.C0083b bVar = new DynamiteModule.b.C0083b();
        bVar.a = aVar.a(context, str);
        bVar.f3741b = bVar.a != 0 ? aVar.a(context, str, false) : aVar.a(context, str, true);
        if (bVar.a == 0 && bVar.f3741b == 0) {
            bVar.f3742c = 0;
        } else if (bVar.a >= bVar.f3741b) {
            bVar.f3742c = -1;
        } else {
            bVar.f3742c = 1;
        }
        return bVar;
    }
}
