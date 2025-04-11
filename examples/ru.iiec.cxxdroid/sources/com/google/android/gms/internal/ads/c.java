package com.google.android.gms.internal.ads;

import android.content.DialogInterface;

/* access modifiers changed from: package-private */
public final class c implements DialogInterface.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ tk0 f3933b;

    c(tk0 tk0) {
        this.f3933b = tk0;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        this.f3933b.a("Operation denied by user.");
    }
}
