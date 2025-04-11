package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* access modifiers changed from: package-private */
public final class cc extends BroadcastReceiver {
    private final /* synthetic */ bc a;

    cc(bc bcVar) {
        this.a = bcVar;
    }

    public final void onReceive(Context context, Intent intent) {
        this.a.a((bc) context, (Context) intent);
    }
}
