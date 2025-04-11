package com.google.android.gms.ads;

import android.content.Context;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.internal.ads.y60;

public final class e extends f {
    public e(Context context) {
        super(context, 0);
        y.a(context, "Context cannot be null");
    }

    @Override // com.google.android.gms.ads.f
    public final /* bridge */ /* synthetic */ a getAdListener() {
        return super.getAdListener();
    }

    @Override // com.google.android.gms.ads.f
    public final /* bridge */ /* synthetic */ d getAdSize() {
        return super.getAdSize();
    }

    @Override // com.google.android.gms.ads.f
    public final /* bridge */ /* synthetic */ String getAdUnitId() {
        return super.getAdUnitId();
    }

    @Override // com.google.android.gms.ads.f
    public final /* bridge */ /* synthetic */ String getMediationAdapterClassName() {
        return super.getMediationAdapterClassName();
    }

    public final k getVideoController() {
        y60 y60 = this.f3114b;
        if (y60 != null) {
            return y60.i();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.f
    public final /* bridge */ /* synthetic */ void setAdListener(a aVar) {
        super.setAdListener(aVar);
    }

    @Override // com.google.android.gms.ads.f
    public final /* bridge */ /* synthetic */ void setAdSize(d dVar) {
        super.setAdSize(dVar);
    }

    @Override // com.google.android.gms.ads.f
    public final /* bridge */ /* synthetic */ void setAdUnitId(String str) {
        super.setAdUnitId(str);
    }
}
