package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;

/* access modifiers changed from: package-private */
public final class l10 implements ValueCallback<String> {
    private final /* synthetic */ k10 a;

    l10(k10 k10) {
        this.a = k10;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // android.webkit.ValueCallback
    public final /* synthetic */ void onReceiveValue(String str) {
        k10 k10 = this.a;
        k10.f4748f.a(k10.f4745c, k10.f4746d, str, k10.f4747e);
    }
}
