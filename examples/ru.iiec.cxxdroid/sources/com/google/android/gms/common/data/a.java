package com.google.android.gms.common.data;

import java.util.Iterator;

public abstract class a<T> implements b<T> {

    /* renamed from: b  reason: collision with root package name */
    protected final DataHolder f3600b;

    protected a(DataHolder dataHolder) {
        this.f3600b = dataHolder;
    }

    @Override // com.google.android.gms.common.api.h
    public void a() {
        DataHolder dataHolder = this.f3600b;
        if (dataHolder != null) {
            dataHolder.close();
        }
    }

    @Override // com.google.android.gms.common.data.b
    public int getCount() {
        DataHolder dataHolder = this.f3600b;
        if (dataHolder == null) {
            return 0;
        }
        return dataHolder.getCount();
    }

    @Override // com.google.android.gms.common.data.b, java.lang.Iterable
    public Iterator<T> iterator() {
        return new c(this);
    }
}
