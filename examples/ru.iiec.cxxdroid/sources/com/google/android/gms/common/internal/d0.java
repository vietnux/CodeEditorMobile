package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.api.a;

public class d0<T extends IInterface> extends l<T> {
    private final a.h<T> y;

    public a.h<T> B() {
        return this.y;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.d
    public T a(IBinder iBinder) {
        return this.y.a(iBinder);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.d
    public void a(int i2, T t) {
        this.y.a(i2, t);
    }

    @Override // com.google.android.gms.common.api.a.f, com.google.android.gms.common.internal.l, com.google.android.gms.common.internal.d
    public int c() {
        return super.c();
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.d
    public String x() {
        return this.y.j();
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.d
    public String y() {
        return this.y.k();
    }
}
