package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.b;

/* access modifiers changed from: package-private */
public final class u implements b.a {
    private final /* synthetic */ e a;

    u(e eVar) {
        this.a = eVar;
    }

    @Override // com.google.android.gms.common.api.internal.b.a
    public final void a(boolean z) {
        this.a.f3517m.sendMessage(this.a.f3517m.obtainMessage(1, Boolean.valueOf(z)));
    }
}
