package com.google.android.gms.internal.ads;

import android.text.TextUtils;

public final class z50 {
    private final String a;

    /* renamed from: b  reason: collision with root package name */
    private final String f6184b;

    public z50(String str, String str2) {
        this.a = str;
        this.f6184b = str2;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.f6184b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && z50.class == obj.getClass()) {
            z50 z50 = (z50) obj;
            return TextUtils.equals(this.a, z50.a) && TextUtils.equals(this.f6184b, z50.f6184b);
        }
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.f6184b.hashCode();
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.f6184b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 20 + String.valueOf(str2).length());
        sb.append("Header[name=");
        sb.append(str);
        sb.append(",value=");
        sb.append(str2);
        sb.append("]");
        return sb.toString();
    }
}
