package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public final class bx extends ax {
    private bx(Context context, String str, boolean z) {
        super(context, str, z);
    }

    public static bx a(String str, Context context, boolean z) {
        ax.a(context, z);
        return new bx(context, str, z);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.ax
    public final List<Callable<Void>> a(tx txVar, xp xpVar, tm tmVar) {
        if (txVar.c() == null || !this.v) {
            return super.a(txVar, xpVar, tmVar);
        }
        int n = txVar.n();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(super.a(txVar, xpVar, tmVar));
        arrayList.add(new ny(txVar, "1QeH3Cf7T53ayw17Ebbo9YTdhU+IFx0X5nCtC5gZQym4uicOVPXxYWmMK9k58i8n", "bHJRpFJ+2R5LAbYQUBDMyfYpLd1oiGixlpIqMJOBQPY=", xpVar, n, 24));
        return arrayList;
    }
}
