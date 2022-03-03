package com.google.android.gms.internal.ads;

import java.util.HashMap;

final class xf implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f6017b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f6018c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ int f6019d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ int f6020e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ boolean f6021f = false;

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ wf f6022g;

    xf(wf wfVar, String str, String str2, int i2, int i3, boolean z) {
        this.f6022g = wfVar;
        this.f6017b = str;
        this.f6018c = str2;
        this.f6019d = i2;
        this.f6020e = i3;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheProgress");
        hashMap.put("src", this.f6017b);
        hashMap.put("cachedSrc", this.f6018c);
        hashMap.put("bytesLoaded", Integer.toString(this.f6019d));
        hashMap.put("totalBytes", Integer.toString(this.f6020e));
        hashMap.put("cacheReady", this.f6021f ? "1" : "0");
        this.f6022g.a((wf) "onPrecacheEvent", (String) hashMap);
    }
}
