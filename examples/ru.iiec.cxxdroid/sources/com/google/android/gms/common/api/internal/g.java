package com.google.android.gms.common.api.internal;

import android.app.Activity;
import androidx.fragment.app.e;
import com.google.android.gms.common.internal.y;

public class g {
    private final Object a;

    public g(Activity activity) {
        y.a(activity, "Activity must not be null");
        this.a = activity;
    }

    public final boolean a() {
        return this.a instanceof e;
    }

    public final boolean b() {
        return this.a instanceof Activity;
    }

    public final Activity c() {
        return (Activity) this.a;
    }

    public final e d() {
        return (e) this.a;
    }
}
