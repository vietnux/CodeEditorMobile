package com.crashlytics.android.c;

import android.content.Context;
import f.a.a.a.n.b.i;
import f.a.a.a.n.b.p;
import java.util.Map;
import java.util.UUID;

/* access modifiers changed from: package-private */
public class d0 {
    private final Context a;

    /* renamed from: b  reason: collision with root package name */
    private final p f2840b;

    /* renamed from: c  reason: collision with root package name */
    private final String f2841c;

    /* renamed from: d  reason: collision with root package name */
    private final String f2842d;

    public d0(Context context, p pVar, String str, String str2) {
        this.a = context;
        this.f2840b = pVar;
        this.f2841c = str;
        this.f2842d = str2;
    }

    public b0 a() {
        Map<p.a, String> g2 = this.f2840b.g();
        return new b0(this.f2840b.e(), UUID.randomUUID().toString(), this.f2840b.f(), g2.get(p.a.ANDROID_ID), g2.get(p.a.ANDROID_ADVERTISING_ID), this.f2840b.m(), g2.get(p.a.FONT_TOKEN), i.n(this.a), this.f2840b.l(), this.f2840b.i(), this.f2841c, this.f2842d);
    }
}
