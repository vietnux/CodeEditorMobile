package com.google.firebase.iid;

import android.os.Handler;
import android.os.Message;

/* access modifiers changed from: package-private */
public final /* synthetic */ class o0 implements Handler.Callback {
    private final n0 a;

    o0(n0 n0Var) {
        this.a = n0Var;
    }

    public final boolean handleMessage(Message message) {
        return this.a.a(message);
    }
}
