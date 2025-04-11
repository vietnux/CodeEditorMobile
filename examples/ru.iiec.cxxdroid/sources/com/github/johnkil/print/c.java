package com.github.johnkil.print;

import android.graphics.Typeface;

public class c {

    /* renamed from: c  reason: collision with root package name */
    private static c f3075c;
    private final Typeface a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f3076b;

    private c() {
        this(null);
    }

    private c(Typeface typeface) {
        this.a = typeface;
        this.f3076b = typeface != null;
    }

    static c c() {
        if (f3075c == null) {
            f3075c = new c();
        }
        return f3075c;
    }

    /* access modifiers changed from: package-private */
    public Typeface a() {
        return this.a;
    }

    /* access modifiers changed from: package-private */
    public boolean b() {
        return this.f3076b;
    }
}
