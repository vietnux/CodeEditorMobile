package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.internal.ads.k2;
import com.google.android.gms.internal.ads.l9;

@k2
public final class r extends d {
    public r(Activity activity) {
        super(activity);
    }

    @Override // com.google.android.gms.ads.internal.overlay.d, com.google.android.gms.internal.ads.r
    public final void i(Bundle bundle) {
        l9.e("AdOverlayParcel is null or does not contain valid overlay type.");
        this.n = 3;
        this.f3275b.finish();
    }
}
