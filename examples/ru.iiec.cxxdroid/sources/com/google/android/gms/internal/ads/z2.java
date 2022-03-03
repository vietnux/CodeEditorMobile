package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.i;

/* access modifiers changed from: package-private */
public final class z2 implements b3 {
    private final /* synthetic */ Context a;

    z2(Context context) {
        this.a = context;
    }

    @Override // com.google.android.gms.internal.ads.b3
    public final boolean a(sc scVar) {
        a50.b();
        boolean c2 = fc.c(this.a);
        boolean z = ((Boolean) a50.g().a(k80.c3)).booleanValue() && scVar.f5532e;
        if (y2.b(this.a, scVar.f5532e) && c2 && !z) {
            if (i.b(this.a)) {
                if (!((Boolean) a50.g().a(k80.H)).booleanValue()) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
}
