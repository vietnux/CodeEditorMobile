package com.google.firebase.iid;

import android.os.Bundle;

final class c extends d<Void> {
    c(int i2, int i3, Bundle bundle) {
        super(i2, 2, bundle);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.firebase.iid.d
    public final void a(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            a((Object) null);
        } else {
            a(new e(4, "Invalid response to one way request"));
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.firebase.iid.d
    public final boolean a() {
        return true;
    }
}
