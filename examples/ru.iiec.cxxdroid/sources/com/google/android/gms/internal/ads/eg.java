package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsResult;

final class eg implements DialogInterface.OnCancelListener {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ JsResult f4215b;

    eg(JsResult jsResult) {
        this.f4215b = jsResult;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f4215b.cancel();
    }
}
