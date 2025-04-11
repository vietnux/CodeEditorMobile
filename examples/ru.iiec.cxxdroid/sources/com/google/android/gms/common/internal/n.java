package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;

public abstract class n {
    private static final Object a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static n f3690b;

    /* access modifiers changed from: protected */
    public static final class a {
        private final String a;

        /* renamed from: b  reason: collision with root package name */
        private final String f3691b;

        /* renamed from: c  reason: collision with root package name */
        private final ComponentName f3692c = null;

        /* renamed from: d  reason: collision with root package name */
        private final int f3693d;

        public a(String str, String str2, int i2) {
            y.b(str);
            this.a = str;
            y.b(str2);
            this.f3691b = str2;
            this.f3693d = i2;
        }

        public final int a() {
            return this.f3693d;
        }

        public final Intent a(Context context) {
            String str = this.a;
            return str != null ? new Intent(str).setPackage(this.f3691b) : new Intent().setComponent(this.f3692c);
        }

        public final ComponentName b() {
            return this.f3692c;
        }

        public final String c() {
            return this.f3691b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return x.a(this.a, aVar.a) && x.a(this.f3691b, aVar.f3691b) && x.a(this.f3692c, aVar.f3692c) && this.f3693d == aVar.f3693d;
        }

        public final int hashCode() {
            return x.a(this.a, this.f3691b, this.f3692c, Integer.valueOf(this.f3693d));
        }

        public final String toString() {
            String str = this.a;
            return str == null ? this.f3692c.flattenToString() : str;
        }
    }

    public static n a(Context context) {
        synchronized (a) {
            if (f3690b == null) {
                f3690b = new k0(context.getApplicationContext());
            }
        }
        return f3690b;
    }

    /* access modifiers changed from: protected */
    public abstract boolean a(a aVar, ServiceConnection serviceConnection, String str);

    public boolean a(String str, String str2, int i2, ServiceConnection serviceConnection, String str3) {
        return a(new a(str, str2, i2), serviceConnection, str3);
    }

    /* access modifiers changed from: protected */
    public abstract void b(a aVar, ServiceConnection serviceConnection, String str);

    public void b(String str, String str2, int i2, ServiceConnection serviceConnection, String str3) {
        b(new a(str, str2, i2), serviceConnection, str3);
    }
}
