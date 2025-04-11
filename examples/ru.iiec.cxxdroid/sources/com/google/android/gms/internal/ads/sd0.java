package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.ArrayList;
import java.util.List;

public final class sd0 {
    private final List<se0> a = new ArrayList();

    sd0() {
    }

    public final void a(te0 te0) {
        Handler handler = u9.f5718h;
        for (se0 se0 : this.a) {
            handler.post(new re0(this, se0, te0));
        }
        this.a.clear();
    }
}
