package com.google.android.gms.internal.ads;

import e.b.a.a;
import e.b.a.b;
import java.util.Date;
import java.util.HashSet;
import java.util.List;

@k2
public final class zj0 {
    public static int a(a aVar) {
        int i2 = ak0.f3819b[aVar.ordinal()];
        if (i2 == 2) {
            return 1;
        }
        if (i2 != 3) {
            return i2 != 4 ? 0 : 3;
        }
        return 2;
    }

    public static com.google.ads.mediation.a a(j40 j40, boolean z) {
        List<String> list = j40.f4678f;
        HashSet hashSet = list != null ? new HashSet(list) : null;
        Date date = new Date(j40.f4675c);
        int i2 = j40.f4677e;
        return new com.google.ads.mediation.a(date, i2 != 1 ? i2 != 2 ? b.UNKNOWN : b.FEMALE : b.MALE, hashSet, z, j40.f4684l);
    }
}
