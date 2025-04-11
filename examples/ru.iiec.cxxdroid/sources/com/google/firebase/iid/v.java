package com.google.firebase.iid;

import android.content.Intent;

final class v implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Intent f6668b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ Intent f6669c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ u f6670d;

    v(u uVar, Intent intent, Intent intent2) {
        this.f6670d = uVar;
        this.f6668b = intent;
        this.f6669c = intent2;
    }

    public final void run() {
        this.f6670d.c(this.f6668b);
        this.f6670d.d(this.f6669c);
    }
}
