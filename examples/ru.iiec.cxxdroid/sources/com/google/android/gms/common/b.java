package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.f0.a;
import com.google.android.gms.common.internal.f0.c;
import com.google.android.gms.common.internal.x;

public final class b extends a {
    public static final Parcelable.Creator<b> CREATOR = new c();

    /* renamed from: f  reason: collision with root package name */
    public static final b f3576f = new b(0);

    /* renamed from: b  reason: collision with root package name */
    private final int f3577b;

    /* renamed from: c  reason: collision with root package name */
    private final int f3578c;

    /* renamed from: d  reason: collision with root package name */
    private final PendingIntent f3579d;

    /* renamed from: e  reason: collision with root package name */
    private final String f3580e;

    public b(int i2) {
        this(i2, null, null);
    }

    b(int i2, int i3, PendingIntent pendingIntent, String str) {
        this.f3577b = i2;
        this.f3578c = i3;
        this.f3579d = pendingIntent;
        this.f3580e = str;
    }

    public b(int i2, PendingIntent pendingIntent) {
        this(i2, pendingIntent, null);
    }

    public b(int i2, PendingIntent pendingIntent, String str) {
        this(1, i2, pendingIntent, str);
    }

    static String c(int i2) {
        if (i2 == 99) {
            return "UNFINISHED";
        }
        if (i2 == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i2) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i2) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    default:
                        StringBuilder sb = new StringBuilder(31);
                        sb.append("UNKNOWN_ERROR_CODE(");
                        sb.append(i2);
                        sb.append(")");
                        return sb.toString();
                }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f3578c == bVar.f3578c && x.a(this.f3579d, bVar.f3579d) && x.a(this.f3580e, bVar.f3580e);
    }

    public final int hashCode() {
        return x.a(Integer.valueOf(this.f3578c), this.f3579d, this.f3580e);
    }

    public final int t() {
        return this.f3578c;
    }

    public final String toString() {
        x.a a = x.a(this);
        a.a("statusCode", c(this.f3578c));
        a.a("resolution", this.f3579d);
        a.a("message", this.f3580e);
        return a.toString();
    }

    public final String u() {
        return this.f3580e;
    }

    public final PendingIntent v() {
        return this.f3579d;
    }

    public final boolean w() {
        return (this.f3578c == 0 || this.f3579d == null) ? false : true;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = c.a(parcel);
        c.a(parcel, 1, this.f3577b);
        c.a(parcel, 2, t());
        c.a(parcel, 3, (Parcelable) v(), i2, false);
        c.a(parcel, 4, u(), false);
        c.a(parcel, a);
    }

    public final boolean x() {
        return this.f3578c == 0;
    }
}
