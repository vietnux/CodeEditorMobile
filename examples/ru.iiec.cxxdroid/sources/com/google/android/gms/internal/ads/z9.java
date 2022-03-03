package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* access modifiers changed from: package-private */
public final class z9 extends BroadcastReceiver {
    private final /* synthetic */ u9 a;

    private z9(u9 u9Var) {
        this.a = u9Var;
    }

    /* synthetic */ z9(u9 u9Var, v9 v9Var) {
        this(u9Var);
    }

    public final void onReceive(Context context, Intent intent) {
        if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            this.a.f5719b = true;
        } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            this.a.f5719b = false;
        }
    }
}
