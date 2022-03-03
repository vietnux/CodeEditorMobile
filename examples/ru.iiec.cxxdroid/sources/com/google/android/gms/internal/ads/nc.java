package com.google.android.gms.internal.ads;

import android.util.JsonWriter;

/* access modifiers changed from: package-private */
public final /* synthetic */ class nc implements pc {
    private final byte[] a;

    nc(byte[] bArr) {
        this.a = bArr;
    }

    @Override // com.google.android.gms.internal.ads.pc
    public final void a(JsonWriter jsonWriter) {
        jc.a(this.a, jsonWriter);
    }
}
