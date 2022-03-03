package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
public final class it {
    private final String a;

    /* renamed from: b  reason: collision with root package name */
    private int f4645b = 0;

    it(String str) {
        this.a = str;
    }

    /* access modifiers changed from: package-private */
    public final boolean a() {
        return this.f4645b < this.a.length();
    }

    /* access modifiers changed from: package-private */
    public final int b() {
        String str = this.a;
        int i2 = this.f4645b;
        this.f4645b = i2 + 1;
        char charAt = str.charAt(i2);
        if (charAt < 55296) {
            return charAt;
        }
        int i3 = charAt & 8191;
        int i4 = 13;
        while (true) {
            String str2 = this.a;
            int i5 = this.f4645b;
            this.f4645b = i5 + 1;
            char charAt2 = str2.charAt(i5);
            if (charAt2 < 55296) {
                return i3 | (charAt2 << i4);
            }
            i3 |= (charAt2 & 8191) << i4;
            i4 += 13;
        }
    }
}
