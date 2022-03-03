package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashMap;

/* access modifiers changed from: package-private */
public final class zf implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f6205b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f6206c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ String f6207d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ String f6208e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ wf f6209f;

    zf(wf wfVar, String str, String str2, String str3, String str4) {
        this.f6209f = wfVar;
        this.f6205b = str;
        this.f6206c = str2;
        this.f6207d = str3;
        this.f6208e = str4;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheCanceled");
        hashMap.put("src", this.f6205b);
        if (!TextUtils.isEmpty(this.f6206c)) {
            hashMap.put("cachedSrc", this.f6206c);
        }
        wf wfVar = this.f6209f;
        hashMap.put("type", wf.b(this.f6207d));
        hashMap.put("reason", this.f6207d);
        if (!TextUtils.isEmpty(this.f6208e)) {
            hashMap.put("message", this.f6208e);
        }
        this.f6209f.a((wf) "onPrecacheEvent", (String) hashMap);
    }
}
