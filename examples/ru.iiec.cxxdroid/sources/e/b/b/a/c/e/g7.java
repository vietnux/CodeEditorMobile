package e.b.b.a.c.e;

import android.net.Uri;

public final class g7 {
    private final Uri a;

    /* renamed from: b  reason: collision with root package name */
    private final String f7287b;

    /* renamed from: c  reason: collision with root package name */
    private final String f7288c;

    public g7(Uri uri) {
        this(null, uri, "", "", false, false);
    }

    private g7(String str, Uri uri, String str2, String str3, boolean z, boolean z2) {
        this.a = uri;
        this.f7287b = str2;
        this.f7288c = str3;
    }

    public final w6<Double> a(String str, double d2) {
        return w6.b(this, str, d2);
    }

    public final w6<Integer> a(String str, int i2) {
        return w6.b(this, str, i2);
    }

    public final w6<Long> a(String str, long j2) {
        return w6.b(this, str, j2);
    }

    public final w6<String> a(String str, String str2) {
        return w6.b(this, str, str2);
    }

    public final w6<Boolean> a(String str, boolean z) {
        return w6.b(this, str, z);
    }
}
