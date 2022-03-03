package com.crashlytics.android;

import com.crashlytics.android.c.b;
import com.crashlytics.android.d.c;
import com.crashlytics.android.e.l;
import f.a.a.a.i;
import f.a.a.a.j;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class a extends i<Void> implements j {

    /* renamed from: h  reason: collision with root package name */
    public final Collection<? extends i> f2786h;

    public a() {
        this(new b(), new c(), new l());
    }

    a(b bVar, c cVar, l lVar) {
        this.f2786h = Collections.unmodifiableCollection(Arrays.asList(bVar, cVar, lVar));
    }

    @Override // f.a.a.a.j
    public Collection<? extends i> a() {
        return this.f2786h;
    }

    /* access modifiers changed from: protected */
    @Override // f.a.a.a.i
    public Void i() {
        return null;
    }

    @Override // f.a.a.a.i
    public String n() {
        return "com.crashlytics.sdk.android:crashlytics";
    }

    @Override // f.a.a.a.i
    public String p() {
        return "2.9.1.23";
    }
}
