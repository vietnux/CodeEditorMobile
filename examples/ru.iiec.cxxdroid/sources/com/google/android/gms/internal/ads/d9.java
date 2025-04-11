package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.x0;

@k2
public final class d9 {
    private final Object a;

    /* renamed from: b  reason: collision with root package name */
    private int f4087b;

    /* renamed from: c  reason: collision with root package name */
    private int f4088c;

    /* renamed from: d  reason: collision with root package name */
    private final e9 f4089d;

    /* renamed from: e  reason: collision with root package name */
    private final String f4090e;

    private d9(e9 e9Var, String str) {
        this.a = new Object();
        this.f4089d = e9Var;
        this.f4090e = str;
    }

    public d9(String str) {
        this(x0.k(), str);
    }

    public final Bundle a() {
        Bundle bundle;
        synchronized (this.a) {
            bundle = new Bundle();
            bundle.putInt("pmnli", this.f4087b);
            bundle.putInt("pmnll", this.f4088c);
        }
        return bundle;
    }

    public final void a(int i2, int i3) {
        synchronized (this.a) {
            this.f4087b = i2;
            this.f4088c = i3;
            this.f4089d.a(this);
        }
    }

    public final String b() {
        return this.f4090e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d9.class == obj.getClass()) {
            String str = this.f4090e;
            String str2 = ((d9) obj).f4090e;
            if (str != null) {
                return str.equals(str2);
            }
            if (str2 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f4090e;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }
}
