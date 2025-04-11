package com.google.android.gms.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.a50;
import com.google.android.gms.internal.ads.fc;
import com.google.android.gms.internal.ads.n40;

public final class d {

    /* renamed from: d  reason: collision with root package name */
    public static final d f3103d = new d(320, 50, "320x50_mb");

    /* renamed from: e  reason: collision with root package name */
    public static final d f3104e = new d(468, 60, "468x60_as");

    /* renamed from: f  reason: collision with root package name */
    public static final d f3105f = new d(320, 100, "320x100_as");

    /* renamed from: g  reason: collision with root package name */
    public static final d f3106g = new d(728, 90, "728x90_as");

    /* renamed from: h  reason: collision with root package name */
    public static final d f3107h = new d(300, 250, "300x250_as");

    /* renamed from: i  reason: collision with root package name */
    public static final d f3108i = new d(160, 600, "160x600_as");

    /* renamed from: j  reason: collision with root package name */
    public static final d f3109j = new d(-1, -2, "smart_banner");

    /* renamed from: k  reason: collision with root package name */
    public static final d f3110k = new d(-3, -4, "fluid");

    /* renamed from: l  reason: collision with root package name */
    public static final d f3111l = new d(50, 50, "50x50_mb");
    private final int a;

    /* renamed from: b  reason: collision with root package name */
    private final int f3112b;

    /* renamed from: c  reason: collision with root package name */
    private final String f3113c;

    static {
        new d(-3, 0, "search_v2");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public d(int r5, int r6) {
        /*
            r4 = this;
            r0 = -1
            if (r5 != r0) goto L_0x0006
            java.lang.String r0 = "FULL"
            goto L_0x000a
        L_0x0006:
            java.lang.String r0 = java.lang.String.valueOf(r5)
        L_0x000a:
            r1 = -2
            if (r6 != r1) goto L_0x0010
            java.lang.String r1 = "AUTO"
            goto L_0x0014
        L_0x0010:
            java.lang.String r1 = java.lang.String.valueOf(r6)
        L_0x0014:
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r2 = r2.length()
            int r2 = r2 + 4
            java.lang.String r3 = java.lang.String.valueOf(r1)
            int r3 = r3.length()
            int r2 = r2 + r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            r3.append(r0)
            java.lang.String r0 = "x"
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = "_as"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r4.<init>(r5, r6, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.d.<init>(int, int):void");
    }

    d(int i2, int i3, String str) {
        if (i2 < 0 && i2 != -1 && i2 != -3) {
            StringBuilder sb = new StringBuilder(37);
            sb.append("Invalid width for AdSize: ");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        } else if (i3 >= 0 || i3 == -2 || i3 == -4) {
            this.a = i2;
            this.f3112b = i3;
            this.f3113c = str;
        } else {
            StringBuilder sb2 = new StringBuilder(38);
            sb2.append("Invalid height for AdSize: ");
            sb2.append(i3);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    public final int a() {
        return this.f3112b;
    }

    public final int a(Context context) {
        int i2 = this.f3112b;
        if (i2 == -4 || i2 == -3) {
            return -1;
        }
        if (i2 == -2) {
            return n40.b(context.getResources().getDisplayMetrics());
        }
        a50.b();
        return fc.a(context, this.f3112b);
    }

    public final int b() {
        return this.a;
    }

    public final int b(Context context) {
        int i2 = this.a;
        if (i2 == -4 || i2 == -3) {
            return -1;
        }
        if (i2 == -1) {
            return n40.a(context.getResources().getDisplayMetrics());
        }
        a50.b();
        return fc.a(context, this.a);
    }

    public final boolean c() {
        return this.a == -3 && this.f3112b == -4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.a == dVar.a && this.f3112b == dVar.f3112b && this.f3113c.equals(dVar.f3113c);
    }

    public final int hashCode() {
        return this.f3113c.hashCode();
    }

    public final String toString() {
        return this.f3113c;
    }
}
