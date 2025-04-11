package com.google.android.gms.internal.ads;

import android.content.Context;

@k2
public final class i9 {
    public static void a(Context context) {
        if (jc.a(context) && !jc.c()) {
            qc.c("Updating ad debug logging enablement.");
            yc.a((ld) new k9(context).a(), "AdDebugLogUpdater.updateEnablement");
        }
    }
}
