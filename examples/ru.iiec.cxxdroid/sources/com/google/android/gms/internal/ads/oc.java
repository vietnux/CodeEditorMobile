package com.google.android.gms.internal.ads;

import android.util.JsonWriter;

/* access modifiers changed from: package-private */
public final /* synthetic */ class oc implements pc {
    private final String a;

    oc(String str) {
        this.a = str;
    }

    @Override // com.google.android.gms.internal.ads.pc
    public final void a(JsonWriter jsonWriter) {
        jc.a(this.a, jsonWriter);
    }
}
