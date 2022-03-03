package com.google.firebase.iid;

import android.os.Bundle;
import android.util.Log;
import e.b.b.a.e.h;

abstract class d<T> {
    final int a;

    /* renamed from: b  reason: collision with root package name */
    final h<T> f6607b = new h<>();

    /* renamed from: c  reason: collision with root package name */
    final int f6608c;

    /* renamed from: d  reason: collision with root package name */
    final Bundle f6609d;

    d(int i2, int i3, Bundle bundle) {
        this.a = i2;
        this.f6608c = i3;
        this.f6609d = bundle;
    }

    /* access modifiers changed from: package-private */
    public abstract void a(Bundle bundle);

    /* access modifiers changed from: package-private */
    public final void a(e eVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(eVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14 + String.valueOf(valueOf2).length());
            sb.append("Failing ");
            sb.append(valueOf);
            sb.append(" with ");
            sb.append(valueOf2);
            Log.d("MessengerIpcClient", sb.toString());
        }
        this.f6607b.a(eVar);
    }

    /* access modifiers changed from: package-private */
    public final void a(T t) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(t);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 16 + String.valueOf(valueOf2).length());
            sb.append("Finishing ");
            sb.append(valueOf);
            sb.append(" with ");
            sb.append(valueOf2);
            Log.d("MessengerIpcClient", sb.toString());
        }
        this.f6607b.a(t);
    }

    /* access modifiers changed from: package-private */
    public abstract boolean a();

    public String toString() {
        int i2 = this.f6608c;
        int i3 = this.a;
        boolean a2 = a();
        StringBuilder sb = new StringBuilder(55);
        sb.append("Request { what=");
        sb.append(i2);
        sb.append(" id=");
        sb.append(i3);
        sb.append(" oneWay=");
        sb.append(a2);
        sb.append("}");
        return sb.toString();
    }
}
