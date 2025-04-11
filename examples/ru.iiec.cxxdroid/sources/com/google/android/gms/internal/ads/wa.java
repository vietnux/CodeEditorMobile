package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

/* access modifiers changed from: package-private */
public final class wa implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Context f5912b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f5913c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ boolean f5914d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ boolean f5915e;

    wa(va vaVar, Context context, String str, boolean z, boolean z2) {
        this.f5912b = context;
        this.f5913c = str;
        this.f5914d = z;
        this.f5915e = z2;
    }

    public final void run() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.f5912b);
        builder.setMessage(this.f5913c);
        builder.setTitle(this.f5914d ? "Error" : "Info");
        if (this.f5915e) {
            builder.setNeutralButton("Dismiss", (DialogInterface.OnClickListener) null);
        } else {
            builder.setPositiveButton("Learn More", new xa(this));
            builder.setNegativeButton("Dismiss", (DialogInterface.OnClickListener) null);
        }
        builder.create().show();
    }
}
