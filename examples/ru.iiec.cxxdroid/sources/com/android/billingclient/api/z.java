package com.android.billingclient.api;

import android.text.TextUtils;

public final class z {
    private String a;

    /* synthetic */ z(y yVar) {
    }

    public final a0 a() {
        if (!TextUtils.isEmpty(this.a)) {
            return new a0(this.a, null, null);
        }
        throw new IllegalArgumentException("SKU must be set.");
    }

    public final z a(String str) {
        this.a = str;
        return this;
    }
}
