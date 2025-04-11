package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

final class d implements DynamiteModule.b {
    d() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0083b a(Context context, String str, DynamiteModule.b.a aVar) {
        DynamiteModule.b.C0083b bVar = new DynamiteModule.b.C0083b();
        bVar.f3741b = aVar.a(context, str, true);
        if (bVar.f3741b != 0) {
            bVar.f3742c = 1;
        } else {
            bVar.a = aVar.a(context, str);
            if (bVar.a != 0) {
                bVar.f3742c = -1;
            }
        }
        return bVar;
    }
}
