package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.google.android.gms.common.util.n;

@k2
public final class cf extends ve {
    @Override // com.google.android.gms.internal.ads.ve
    public final ue a(Context context, kf kfVar, int i2, boolean z, x80 x80, jf jfVar) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (!(n.b() && (applicationInfo == null || applicationInfo.targetSdkVersion >= 11))) {
            return null;
        }
        return new ie(context, z, kfVar.g0().b(), jfVar, new lf(context, kfVar.p0(), kfVar.A0(), x80, kfVar.D0()));
    }
}
