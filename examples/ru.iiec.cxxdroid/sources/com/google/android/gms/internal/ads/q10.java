package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* access modifiers changed from: package-private */
public final class q10 implements Comparator<w10> {
    q10(p10 p10) {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(w10 w10, w10 w102) {
        w10 w103 = w10;
        w10 w104 = w102;
        int i2 = w103.f5869c - w104.f5869c;
        return i2 != 0 ? i2 : (int) (w103.a - w104.a);
    }
}
