package com.google.android.gms.common.internal;

import android.content.Context;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.h;

public class q {
    private final SparseIntArray a = new SparseIntArray();

    /* renamed from: b  reason: collision with root package name */
    private h f3696b;

    public q(h hVar) {
        y.a(hVar);
        this.f3696b = hVar;
    }

    public int a(Context context, a.f fVar) {
        y.a(context);
        y.a(fVar);
        if (!fVar.b()) {
            return 0;
        }
        int c2 = fVar.c();
        int i2 = this.a.get(c2, -1);
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        while (true) {
            if (i3 < this.a.size()) {
                int keyAt = this.a.keyAt(i3);
                if (keyAt > c2 && this.a.get(keyAt) == 0) {
                    i2 = 0;
                    break;
                }
                i3++;
            } else {
                break;
            }
        }
        if (i2 == -1) {
            i2 = this.f3696b.a(context, c2);
        }
        this.a.put(c2, i2);
        return i2;
    }

    public void a() {
        this.a.clear();
    }
}
