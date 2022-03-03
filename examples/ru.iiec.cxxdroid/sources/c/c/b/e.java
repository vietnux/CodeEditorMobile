package c.c.b;

import android.content.ComponentName;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import b.a.a.a;
import b.a.a.b;
import java.util.List;

public final class e {
    private final b a;

    /* renamed from: b  reason: collision with root package name */
    private final a f1910b;

    /* renamed from: c  reason: collision with root package name */
    private final ComponentName f1911c;

    e(b bVar, a aVar, ComponentName componentName) {
        this.a = bVar;
        this.f1910b = aVar;
        this.f1911c = componentName;
    }

    /* access modifiers changed from: package-private */
    public IBinder a() {
        return this.f1910b.asBinder();
    }

    public boolean a(Uri uri, Bundle bundle, List<Bundle> list) {
        try {
            return this.a.a(this.f1910b, uri, bundle, list);
        } catch (RemoteException unused) {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public ComponentName b() {
        return this.f1911c;
    }
}
