package com.google.android.gms.internal.ads;

import android.content.DialogInterface;

/* access modifiers changed from: package-private */
public final /* synthetic */ class qa implements DialogInterface.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    private final oa f5332b;

    /* renamed from: c  reason: collision with root package name */
    private final int f5333c;

    /* renamed from: d  reason: collision with root package name */
    private final int f5334d;

    /* renamed from: e  reason: collision with root package name */
    private final int f5335e;

    qa(oa oaVar, int i2, int i3, int i4) {
        this.f5332b = oaVar;
        this.f5333c = i2;
        this.f5334d = i3;
        this.f5335e = i4;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        this.f5332b.a(this.f5333c, this.f5334d, this.f5335e, dialogInterface, i2);
    }
}
