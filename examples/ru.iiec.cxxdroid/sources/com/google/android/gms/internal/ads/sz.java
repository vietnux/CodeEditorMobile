package com.google.android.gms.internal.ads;

import android.database.ContentObserver;
import android.os.Handler;

/* access modifiers changed from: package-private */
public final class sz extends ContentObserver {
    private final /* synthetic */ pz a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sz(pz pzVar, Handler handler) {
        super(handler);
        this.a = pzVar;
    }

    public final void onChange(boolean z) {
        super.onChange(z);
        this.a.d();
    }
}
