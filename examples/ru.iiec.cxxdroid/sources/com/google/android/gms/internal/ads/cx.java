package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;

public final class cx {

    /* renamed from: d  reason: collision with root package name */
    private static final String[] f4051d = {"/aclk", "/pcs/click"};
    private String a = "ad.doubleclick.net";

    /* renamed from: b  reason: collision with root package name */
    private String[] f4052b = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};

    /* renamed from: c  reason: collision with root package name */
    private yw f4053c;

    public cx(yw ywVar) {
        this.f4053c = ywVar;
    }

    private final Uri a(Uri uri, Context context, String str, boolean z, View view, Activity activity) {
        try {
            boolean c2 = c(uri);
            if (c2) {
                if (uri.toString().contains("dc_ms=")) {
                    throw new dx("Parameter already exists: dc_ms");
                }
            } else if (uri.getQueryParameter("ms") != null) {
                throw new dx("Query parameter already exists: ms");
            }
            String a2 = z ? this.f4053c.a(context, str, view, activity) : this.f4053c.a(context);
            if (c2) {
                String uri2 = uri.toString();
                int indexOf = uri2.indexOf(";adurl");
                if (indexOf != -1) {
                    int i2 = indexOf + 1;
                    return Uri.parse(uri2.substring(0, i2) + "dc_ms" + "=" + a2 + ";" + uri2.substring(i2));
                }
                String encodedPath = uri.getEncodedPath();
                int indexOf2 = uri2.indexOf(encodedPath);
                return Uri.parse(uri2.substring(0, encodedPath.length() + indexOf2) + ";" + "dc_ms" + "=" + a2 + ";" + uri2.substring(indexOf2 + encodedPath.length()));
            }
            String uri3 = uri.toString();
            int indexOf3 = uri3.indexOf("&adurl");
            if (indexOf3 == -1) {
                indexOf3 = uri3.indexOf("?adurl");
            }
            if (indexOf3 == -1) {
                return uri.buildUpon().appendQueryParameter("ms", a2).build();
            }
            int i3 = indexOf3 + 1;
            return Uri.parse(uri3.substring(0, i3) + "ms" + "=" + a2 + "&" + uri3.substring(i3));
        } catch (UnsupportedOperationException unused) {
            throw new dx("Provided Uri is not in a valid state");
        }
    }

    private final boolean c(Uri uri) {
        if (uri != null) {
            try {
                return uri.getHost().equals(this.a);
            } catch (NullPointerException unused) {
                return false;
            }
        } else {
            throw new NullPointerException();
        }
    }

    public final Uri a(Uri uri, Context context) {
        return a(uri, context, null, false, null, null);
    }

    public final Uri a(Uri uri, Context context, View view, Activity activity) {
        try {
            return a(uri, context, uri.getQueryParameter("ai"), true, view, activity);
        } catch (UnsupportedOperationException unused) {
            throw new dx("Provided Uri is not in a valid state");
        }
    }

    public final yw a() {
        return this.f4053c;
    }

    public final void a(MotionEvent motionEvent) {
        this.f4053c.a(motionEvent);
    }

    public final boolean a(Uri uri) {
        if (uri != null) {
            try {
                String host = uri.getHost();
                for (String str : this.f4052b) {
                    if (host.endsWith(str)) {
                        return true;
                    }
                }
            } catch (NullPointerException unused) {
            }
            return false;
        }
        throw new NullPointerException();
    }

    public final boolean b(Uri uri) {
        if (a(uri)) {
            for (String str : f4051d) {
                if (uri.getPath().endsWith(str)) {
                    return true;
                }
            }
        }
        return false;
    }
}
