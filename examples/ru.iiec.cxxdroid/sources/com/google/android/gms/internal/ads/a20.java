package com.google.android.gms.internal.ads;

import java.util.Comparator;

public final class a20 implements Comparator<n10> {
    public a20(z10 z10) {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(n10 n10, n10 n102) {
        n10 n103 = n10;
        n10 n104 = n102;
        if (n103.b() < n104.b()) {
            return -1;
        }
        if (n103.b() > n104.b()) {
            return 1;
        }
        if (n103.a() < n104.a()) {
            return -1;
        }
        if (n103.a() > n104.a()) {
            return 1;
        }
        float d2 = (n103.d() - n103.b()) * (n103.c() - n103.a());
        float d3 = (n104.d() - n104.b()) * (n104.c() - n104.a());
        if (d2 > d3) {
            return -1;
        }
        return d2 < d3 ? 1 : 0;
    }
}
