package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.File;
import java.util.regex.Pattern;

@k2
public final class ya extends i8 {

    /* renamed from: d  reason: collision with root package name */
    private final Context f6101d;

    private ya(Context context, pg pgVar) {
        super(pgVar);
        this.f6101d = context;
    }

    public static bg0 a(Context context) {
        bg0 bg0 = new bg0(new lb(new File(context.getCacheDir(), "admob_volley")), new ya(context, new qh()));
        bg0.a();
        return bg0;
    }

    @Override // com.google.android.gms.internal.ads.i8, com.google.android.gms.internal.ads.a70
    public final ba0 a(bc0<?> bc0) {
        if (bc0.n() && bc0.h() == 0) {
            if (Pattern.matches((String) a50.g().a(k80.I2), bc0.i())) {
                a50.b();
                if (fc.c(this.f6101d)) {
                    ba0 a = new ld0(this.f6101d).a(bc0);
                    if (a != null) {
                        String valueOf = String.valueOf(bc0.i());
                        l9.e(valueOf.length() != 0 ? "Got gmscore asset response: ".concat(valueOf) : new String("Got gmscore asset response: "));
                        return a;
                    }
                    String valueOf2 = String.valueOf(bc0.i());
                    l9.e(valueOf2.length() != 0 ? "Failed to get gmscore asset response: ".concat(valueOf2) : new String("Failed to get gmscore asset response: "));
                }
            }
        }
        return super.a(bc0);
    }
}
