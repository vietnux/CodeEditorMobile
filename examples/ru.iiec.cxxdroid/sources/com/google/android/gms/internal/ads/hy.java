package com.google.android.gms.internal.ads;

import android.provider.Settings;
import java.lang.reflect.InvocationTargetException;

public final class hy extends ez {
    public hy(tx txVar, String str, String str2, xp xpVar, int i2, int i3) {
        super(txVar, str, str2, xpVar, i2, 49);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.ez
    public final void a() {
        this.f4244e.R = 2;
        try {
            int i2 = 1;
            boolean booleanValue = ((Boolean) this.f4245f.invoke(null, this.f4241b.a())).booleanValue();
            xp xpVar = this.f4244e;
            if (!booleanValue) {
                i2 = 0;
            }
            xpVar.R = Integer.valueOf(i2);
        } catch (InvocationTargetException e2) {
            if (!(e2.getTargetException() instanceof Settings.SettingNotFoundException)) {
                throw e2;
            }
        }
    }
}
