package com.google.android.gms.common.api;

import com.google.android.gms.common.e;

public final class m extends UnsupportedOperationException {

    /* renamed from: b  reason: collision with root package name */
    private final e f3575b;

    public m(e eVar) {
        this.f3575b = eVar;
    }

    public final String getMessage() {
        String valueOf = String.valueOf(this.f3575b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 8);
        sb.append("Missing ");
        sb.append(valueOf);
        return sb.toString();
    }
}
