package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.content.Intent;
import com.google.android.gms.ads.internal.x0;

/* access modifiers changed from: package-private */
public final class uk0 implements DialogInterface.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ tk0 f5755b;

    uk0(tk0 tk0) {
        this.f5755b = tk0;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        Intent a = this.f5755b.a();
        x0.f();
        u9.a(this.f5755b.f5637d, a);
    }
}
