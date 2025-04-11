package com.google.android.gms.internal.ads;

import android.text.TextUtils;

@k2
public final class p80 {
    public static void a(n80 n80, m80 m80) {
        if (m80.a() == null) {
            throw new IllegalArgumentException("Context can't be null. Please set up context in CsiConfiguration.");
        } else if (!TextUtils.isEmpty(m80.b())) {
            n80.a(m80.a(), m80.b(), m80.c(), m80.d());
        } else {
            throw new IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
        }
    }
}
