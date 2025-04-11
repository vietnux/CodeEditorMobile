package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* access modifiers changed from: package-private */
public final class yf implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f6109b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f6110c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ int f6111d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ wf f6112e;

    yf(wf wfVar, String str, String str2, int i2) {
        this.f6112e = wfVar;
        this.f6109b = str;
        this.f6110c = str2;
        this.f6111d = i2;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheComplete");
        hashMap.put("src", this.f6109b);
        hashMap.put("cachedSrc", this.f6110c);
        hashMap.put("totalBytes", Integer.toString(this.f6111d));
        this.f6112e.a((wf) "onPrecacheEvent", (String) hashMap);
    }
}
