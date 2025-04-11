package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final class l80 implements Callable<Void> {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Context f4850b;

    l80(Context context) {
        this.f4850b = context;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Void call() {
        a50.g().a(this.f4850b);
        return null;
    }
}
