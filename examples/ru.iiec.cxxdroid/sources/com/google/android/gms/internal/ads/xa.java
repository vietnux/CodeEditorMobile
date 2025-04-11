package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.net.Uri;
import com.google.android.gms.ads.internal.x0;

final class xa implements DialogInterface.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ wa f6014b;

    xa(wa waVar) {
        this.f6014b = waVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        x0.f();
        u9.a(this.f6014b.f5912b, Uri.parse("https://support.google.com/dfp_premium/answer/7160685#push"));
    }
}
