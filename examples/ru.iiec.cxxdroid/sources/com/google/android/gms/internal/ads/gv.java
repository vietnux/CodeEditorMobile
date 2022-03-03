package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;

public final class gv {
    protected static final Charset a = Charset.forName("UTF-8");

    /* renamed from: b  reason: collision with root package name */
    public static final Object f4443b = new Object();

    static {
        Charset.forName("ISO-8859-1");
    }

    public static void a(cv cvVar, cv cvVar2) {
        ev evVar = cvVar.f4045b;
        if (evVar != null) {
            cvVar2.f4045b = (ev) evVar.clone();
        }
    }
}
