package com.google.android.gms.internal.ads;

import android.content.DialogInterface;

/* access modifiers changed from: package-private */
public final class i implements DialogInterface.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ g f4568b;

    i(g gVar) {
        this.f4568b = gVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        this.f4568b.a("User canceled the download.");
    }
}
