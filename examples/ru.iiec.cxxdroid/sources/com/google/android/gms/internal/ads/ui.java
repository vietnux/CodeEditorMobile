package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.text.TextUtils;

/* access modifiers changed from: package-private */
@k2
public final class ui {
    private static final String[] a = {"UNKNOWN", "HOST_LOOKUP", "UNSUPPORTED_AUTH_SCHEME", "AUTHENTICATION", "PROXY_AUTHENTICATION", "CONNECT", "IO", "TIMEOUT", "REDIRECT_LOOP", "UNSUPPORTED_SCHEME", "FAILED_SSL_HANDSHAKE", "BAD_URL", "FILE", "FILE_NOT_FOUND", "TOO_MANY_REQUESTS"};

    /* renamed from: b  reason: collision with root package name */
    private static final String[] f5752b = {"NOT_YET_VALID", "EXPIRED", "ID_MISMATCH", "UNTRUSTED", "DATE_INVALID", "INVALID"};

    ui() {
    }

    private static void a(String str, String str2, String str3) {
        String str4;
        if (((Boolean) a50.g().a(k80.r1)).booleanValue()) {
            Bundle bundle = new Bundle();
            bundle.putString("err", str);
            bundle.putString("code", str2);
            if (!TextUtils.isEmpty(str3)) {
                Uri parse = Uri.parse(str3);
                if (parse.getHost() != null) {
                    str4 = parse.getHost();
                    bundle.putString("host", str4);
                }
            }
            str4 = "";
            bundle.putString("host", str4);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, String str) {
        String str2;
        if (i2 < 0) {
            int i3 = (-i2) - 1;
            String[] strArr = a;
            if (i3 < strArr.length) {
                str2 = strArr[i3];
                a("http_err", str2, str);
            }
        }
        str2 = String.valueOf(i2);
        a("http_err", str2, str);
    }

    /* access modifiers changed from: package-private */
    public final void a(SslError sslError) {
        String str;
        if (sslError != null) {
            int primaryError = sslError.getPrimaryError();
            if (primaryError >= 0) {
                String[] strArr = f5752b;
                if (primaryError < strArr.length) {
                    str = strArr[primaryError];
                    a("ssl_err", str, sslError.getUrl());
                }
            }
            str = String.valueOf(primaryError);
            a("ssl_err", str, sslError.getUrl());
        }
    }
}
