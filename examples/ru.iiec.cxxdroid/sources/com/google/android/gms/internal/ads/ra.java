package com.google.android.gms.internal.ads;

import android.content.DialogInterface;

/* access modifiers changed from: package-private */
public final /* synthetic */ class ra implements DialogInterface.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    private final oa f5417b;

    /* renamed from: c  reason: collision with root package name */
    private final String f5418c;

    ra(oa oaVar, String str) {
        this.f5417b = oaVar;
        this.f5418c = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        this.f5417b.a(this.f5418c, dialogInterface, i2);
    }
}
