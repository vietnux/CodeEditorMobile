package com.google.firebase.iid;

import android.os.Bundle;

/* access modifiers changed from: package-private */
public final class f extends d<Bundle> {
    f(int i2, int i3, Bundle bundle) {
        super(i2, 1, bundle);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.firebase.iid.d
    public final void a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("data");
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        a((Object) bundle2);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.firebase.iid.d
    public final boolean a() {
        return false;
    }
}
