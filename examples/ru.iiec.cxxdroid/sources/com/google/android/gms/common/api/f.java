package com.google.android.gms.common.api;

import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.c;
import java.util.Collections;
import java.util.WeakHashMap;

public abstract class f {

    public interface a {
        void e(int i2);

        void j(Bundle bundle);
    }

    public interface b {
        void a(com.google.android.gms.common.b bVar);
    }

    static {
        Collections.newSetFromMap(new WeakHashMap());
    }

    public Looper a() {
        throw new UnsupportedOperationException();
    }

    public <A extends a.b, R extends j, T extends c<R, A>> T a(T t) {
        throw new UnsupportedOperationException();
    }
}
