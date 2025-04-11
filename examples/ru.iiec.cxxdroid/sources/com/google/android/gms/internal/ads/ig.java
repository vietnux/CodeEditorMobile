package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;

final class ig implements DialogInterface.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ JsPromptResult f4631b;

    ig(JsPromptResult jsPromptResult) {
        this.f4631b = jsPromptResult;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        this.f4631b.cancel();
    }
}
