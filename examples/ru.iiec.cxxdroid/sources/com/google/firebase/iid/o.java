package com.google.firebase.iid;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* access modifiers changed from: package-private */
public final class o extends Handler {
    private final /* synthetic */ n a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    o(n nVar, Looper looper) {
        super(looper);
        this.a = nVar;
    }

    public final void handleMessage(Message message) {
        this.a.a((n) message);
    }
}
