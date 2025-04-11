package com.google.android.gms.internal.ads;

import android.util.JsonWriter;
import java.util.Map;

/* access modifiers changed from: package-private */
public final /* synthetic */ class kc implements pc {
    private final String a;

    /* renamed from: b  reason: collision with root package name */
    private final String f4814b;

    /* renamed from: c  reason: collision with root package name */
    private final Map f4815c;

    /* renamed from: d  reason: collision with root package name */
    private final byte[] f4816d;

    kc(String str, String str2, Map map, byte[] bArr) {
        this.a = str;
        this.f4814b = str2;
        this.f4815c = map;
        this.f4816d = bArr;
    }

    @Override // com.google.android.gms.internal.ads.pc
    public final void a(JsonWriter jsonWriter) {
        jc.a(this.a, this.f4814b, this.f4815c, this.f4816d, jsonWriter);
    }
}
