package com.google.android.gms.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.c70;
import com.google.android.gms.internal.ads.e70;

public class i {

    public static final class a {
        /* access modifiers changed from: package-private */
        public final e70 a() {
            throw null;
        }
    }

    public static void a(float f2) {
        c70.a().a(f2);
    }

    public static void a(Context context) {
        a(context, null, null);
    }

    @Deprecated
    public static void a(Context context, String str, a aVar) {
        c70 a2 = c70.a();
        if (aVar == null) {
            a2.a(context, str, null);
        } else {
            aVar.a();
            throw null;
        }
    }
}
