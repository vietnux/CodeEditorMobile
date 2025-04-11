package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

final class h implements DynamiteModule.b {
    h() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0083b a(Context context, String str, DynamiteModule.b.a aVar) {
        int i2;
        DynamiteModule.b.C0083b bVar = new DynamiteModule.b.C0083b();
        bVar.a = aVar.a(context, str);
        bVar.f3741b = aVar.a(context, str, true);
        if (bVar.a == 0 && bVar.f3741b == 0) {
            i2 = 0;
        } else if (bVar.f3741b >= bVar.a) {
            bVar.f3742c = 1;
            return bVar;
        } else {
            i2 = -1;
        }
        bVar.f3742c = i2;
        return bVar;
    }
}
