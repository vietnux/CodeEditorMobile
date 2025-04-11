package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.File;
import java.util.Map;

@k2
public final class eb {
    private static bg0 a;

    /* renamed from: b  reason: collision with root package name */
    private static final Object f4201b = new Object();

    static {
        new fb();
    }

    public eb(Context context) {
        a(context.getApplicationContext() != null ? context.getApplicationContext() : context);
    }

    private static bg0 a(Context context) {
        bg0 bg0;
        bg0 bg02;
        synchronized (f4201b) {
            if (a == null) {
                k80.a(context);
                if (((Boolean) a50.g().a(k80.H2)).booleanValue()) {
                    bg02 = ya.a(context);
                } else {
                    bg02 = new bg0(new lb(new File(context.getCacheDir(), "volley")), new i8((h7) new qh()));
                    bg02.a();
                }
                a = bg02;
            }
            bg0 = a;
        }
        return bg0;
    }

    public final ld<String> a(int i2, String str, Map<String, String> map, byte[] bArr) {
        mb mbVar = new mb(null);
        ib ibVar = new ib(this, str, mbVar);
        jc jcVar = new jc(null);
        jb jbVar = new jb(this, i2, str, mbVar, ibVar, bArr, map, jcVar);
        if (jc.a()) {
            try {
                jcVar.a(str, "GET", jbVar.a(), jbVar.m());
            } catch (a e2) {
                qc.d(e2.getMessage());
            }
        }
        a.a(jbVar);
        return mbVar;
    }

    @Deprecated
    public final <T> ld<T> a(String str, kb<T> kbVar) {
        wd wdVar = new wd();
        a.a(new nb(str, wdVar));
        return ad.a(ad.a(wdVar, new hb(this, kbVar), s9.a), Throwable.class, new gb(this, kbVar), rd.f5433b);
    }

    public final ld<String> a(String str, Map<String, String> map) {
        return a(0, str, map, null);
    }
}
