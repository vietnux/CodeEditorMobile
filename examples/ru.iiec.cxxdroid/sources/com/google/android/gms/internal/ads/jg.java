package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;
import android.widget.EditText;

final class jg implements DialogInterface.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ JsPromptResult f4709b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ EditText f4710c;

    jg(JsPromptResult jsPromptResult, EditText editText) {
        this.f4709b = jsPromptResult;
        this.f4710c = editText;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        this.f4709b.confirm(this.f4710c.getText().toString());
    }
}
