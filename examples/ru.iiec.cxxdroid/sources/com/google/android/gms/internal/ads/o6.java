package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.p.a;

@k2
public final class o6 implements a {
    private final a6 a;

    public o6(a6 a6Var) {
        this.a = a6Var;
    }

    @Override // com.google.android.gms.ads.p.a
    public final int J() {
        a6 a6Var = this.a;
        if (a6Var == null) {
            return 0;
        }
        try {
            return a6Var.J();
        } catch (RemoteException e2) {
            qc.c("Could not forward getAmount to RewardItem", e2);
            return 0;
        }
    }

    @Override // com.google.android.gms.ads.p.a
    public final String a() {
        a6 a6Var = this.a;
        if (a6Var == null) {
            return null;
        }
        try {
            return a6Var.a();
        } catch (RemoteException e2) {
            qc.c("Could not forward getType to RewardItem", e2);
            return null;
        }
    }
}
