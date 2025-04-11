package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.view.View;

@TargetApi(18)
public class ha extends ga {
    @Override // com.google.android.gms.internal.ads.aa
    public boolean a(View view) {
        return super.a(view) || view.getWindowId() != null;
    }

    @Override // com.google.android.gms.internal.ads.aa
    public final int c() {
        return 14;
    }
}
