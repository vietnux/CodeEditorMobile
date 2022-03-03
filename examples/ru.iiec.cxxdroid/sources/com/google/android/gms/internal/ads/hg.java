package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;

final class hg implements DialogInterface.OnCancelListener {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ JsPromptResult f4519b;

    hg(JsPromptResult jsPromptResult) {
        this.f4519b = jsPromptResult;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f4519b.cancel();
    }
}
