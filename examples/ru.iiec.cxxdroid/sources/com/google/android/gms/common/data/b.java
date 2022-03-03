package com.google.android.gms.common.data;

import com.google.android.gms.common.api.h;
import java.util.Iterator;

public interface b<T> extends h, Iterable<T> {
    T get(int i2);

    int getCount();

    @Override // java.lang.Iterable
    Iterator<T> iterator();
}
