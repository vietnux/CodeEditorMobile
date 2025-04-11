package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsResult;

final class fg implements DialogInterface.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ JsResult f4320b;

    fg(JsResult jsResult) {
        this.f4320b = jsResult;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        this.f4320b.cancel();
    }
}
