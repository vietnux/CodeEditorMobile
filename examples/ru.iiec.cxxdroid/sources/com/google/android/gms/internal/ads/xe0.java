package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.n1;
import java.util.Arrays;

/* access modifiers changed from: package-private */
@k2
public final class xe0 {
    private final Object[] a;

    xe0(j40 j40, String str, int i2) {
        this.a = n1.a((String) a50.g().a(k80.T0), j40, str, i2, null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof xe0)) {
            return false;
        }
        return Arrays.equals(this.a, ((xe0) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        String arrays = Arrays.toString(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(arrays).length() + 24);
        sb.append("[InterstitialAdPoolKey ");
        sb.append(arrays);
        sb.append("]");
        return sb.toString();
    }
}
