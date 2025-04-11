package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.view.View;
import android.view.ViewGroup;

@TargetApi(19)
public class ja extends ha {
    @Override // com.google.android.gms.internal.ads.aa, com.google.android.gms.internal.ads.ha
    public final boolean a(View view) {
        return view.isAttachedToWindow();
    }

    @Override // com.google.android.gms.internal.ads.aa
    public final ViewGroup.LayoutParams d() {
        return new ViewGroup.LayoutParams(-1, -1);
    }
}
