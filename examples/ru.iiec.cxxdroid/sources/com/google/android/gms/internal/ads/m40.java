package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.q.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Set;

@k2
public final class m40 {
    public static final m40 a = new m40();

    protected m40() {
    }

    public static j40 a(Context context, w60 w60) {
        List list;
        Context context2;
        String str;
        Date a2 = w60.a();
        long time = a2 != null ? a2.getTime() : -1;
        String b2 = w60.b();
        int d2 = w60.d();
        Set<String> e2 = w60.e();
        if (!e2.isEmpty()) {
            list = Collections.unmodifiableList(new ArrayList(e2));
            context2 = context;
        } else {
            context2 = context;
            list = null;
        }
        boolean a3 = w60.a(context2);
        int n = w60.n();
        Location f2 = w60.f();
        Bundle a4 = w60.a(AdMobAdapter.class);
        boolean g2 = w60.g();
        String h2 = w60.h();
        a k2 = w60.k();
        if (k2 == null) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                String packageName = applicationContext.getPackageName();
                a50.b();
                str = fc.a(Thread.currentThread().getStackTrace(), packageName);
            } else {
                str = null;
            }
            return new j40(7, time, a4, d2, list, a3, n, g2, h2, null, f2, b2, w60.m(), w60.c(), Collections.unmodifiableList(new ArrayList(w60.o())), w60.j(), str, w60.i());
        }
        new p70(k2);
        throw null;
    }
}
