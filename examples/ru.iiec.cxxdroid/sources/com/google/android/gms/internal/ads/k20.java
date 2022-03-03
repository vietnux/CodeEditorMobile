package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.x0;
import com.google.android.gms.common.internal.f0.a;
import com.google.android.gms.common.internal.f0.c;
import java.util.List;

@k2
public final class k20 extends a {
    public static final Parcelable.Creator<k20> CREATOR = new l20();

    /* renamed from: b  reason: collision with root package name */
    public final String f4749b;

    /* renamed from: c  reason: collision with root package name */
    private final long f4750c;

    /* renamed from: d  reason: collision with root package name */
    private final String f4751d;

    /* renamed from: e  reason: collision with root package name */
    private final String f4752e;

    /* renamed from: f  reason: collision with root package name */
    private final String f4753f;

    /* renamed from: g  reason: collision with root package name */
    private final Bundle f4754g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f4755h;

    /* renamed from: i  reason: collision with root package name */
    private long f4756i;

    k20(String str, long j2, String str2, String str3, String str4, Bundle bundle, boolean z, long j3) {
        this.f4749b = str;
        this.f4750c = j2;
        String str5 = "";
        this.f4751d = str2 == null ? str5 : str2;
        this.f4752e = str3 == null ? str5 : str3;
        this.f4753f = str4 != null ? str4 : str5;
        this.f4754g = bundle == null ? new Bundle() : bundle;
        this.f4755h = z;
        this.f4756i = j3;
    }

    public static k20 a(Uri uri) {
        try {
            if (!"gcache".equals(uri.getScheme())) {
                return null;
            }
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments.size() != 2) {
                int size = pathSegments.size();
                StringBuilder sb = new StringBuilder(62);
                sb.append("Expected 2 path parts for namespace and id, found :");
                sb.append(size);
                qc.d(sb.toString());
                return null;
            }
            String str = pathSegments.get(0);
            String str2 = pathSegments.get(1);
            String host = uri.getHost();
            String queryParameter = uri.getQueryParameter("url");
            boolean equals = "1".equals(uri.getQueryParameter("read_only"));
            String queryParameter2 = uri.getQueryParameter("expiration");
            long parseLong = queryParameter2 == null ? 0 : Long.parseLong(queryParameter2);
            Bundle bundle = new Bundle();
            for (String str3 : x0.h().a(uri)) {
                if (str3.startsWith("tag.")) {
                    bundle.putString(str3.substring(4), uri.getQueryParameter(str3));
                }
            }
            return new k20(queryParameter, parseLong, host, str, str2, bundle, equals, 0);
        } catch (NullPointerException | NumberFormatException e2) {
            qc.c("Unable to parse Uri into cache offering.", e2);
            return null;
        }
    }

    public static k20 b(String str) {
        return a(Uri.parse(str));
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = c.a(parcel);
        c.a(parcel, 2, this.f4749b, false);
        c.a(parcel, 3, this.f4750c);
        c.a(parcel, 4, this.f4751d, false);
        c.a(parcel, 5, this.f4752e, false);
        c.a(parcel, 6, this.f4753f, false);
        c.a(parcel, 7, this.f4754g, false);
        c.a(parcel, 8, this.f4755h);
        c.a(parcel, 9, this.f4756i);
        c.a(parcel, a);
    }
}
