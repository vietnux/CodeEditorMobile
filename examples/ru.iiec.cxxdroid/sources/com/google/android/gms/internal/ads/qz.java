package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* access modifiers changed from: package-private */
public final class qz extends BroadcastReceiver {
    private final /* synthetic */ pz a;

    qz(pz pzVar) {
        this.a = pzVar;
    }

    public final void onReceive(Context context, Intent intent) {
        this.a.a(3);
    }
}
