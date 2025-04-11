package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.util.Collections;
import java.util.List;

public final class of {
    private final int a;

    /* renamed from: b  reason: collision with root package name */
    private final List<z50> f5159b;

    /* renamed from: c  reason: collision with root package name */
    private final int f5160c;

    /* renamed from: d  reason: collision with root package name */
    private final InputStream f5161d;

    public of(int i2, List<z50> list) {
        this(i2, list, -1, null);
    }

    public of(int i2, List<z50> list, int i3, InputStream inputStream) {
        this.a = i2;
        this.f5159b = list;
        this.f5160c = i3;
        this.f5161d = inputStream;
    }

    public final InputStream a() {
        return this.f5161d;
    }

    public final int b() {
        return this.f5160c;
    }

    public final int c() {
        return this.a;
    }

    public final List<z50> d() {
        return Collections.unmodifiableList(this.f5159b);
    }
}
