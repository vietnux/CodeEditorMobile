package com.google.android.gms.internal.ads;

import android.util.JsonWriter;
import java.util.Map;

/* access modifiers changed from: package-private */
public final /* synthetic */ class mc implements pc {
    private final int a;

    /* renamed from: b  reason: collision with root package name */
    private final Map f4944b;

    mc(int i2, Map map) {
        this.a = i2;
        this.f4944b = map;
    }

    @Override // com.google.android.gms.internal.ads.pc
    public final void a(JsonWriter jsonWriter) {
        jc.a(this.a, this.f4944b, jsonWriter);
    }
}
