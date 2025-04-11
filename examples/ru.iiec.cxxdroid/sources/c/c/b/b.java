package c.c.b;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import b.a.a.a;

public class b {
    private final b.a.a.b a;

    /* renamed from: b  reason: collision with root package name */
    private final ComponentName f1887b;

    class a extends a.AbstractBinderC0027a {

        /* renamed from: b  reason: collision with root package name */
        private Handler f1888b = new Handler(Looper.getMainLooper());

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ a f1889c;

        /* renamed from: c.c.b.b$a$a  reason: collision with other inner class name */
        class RunnableC0037a implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f1890b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ Bundle f1891c;

            RunnableC0037a(int i2, Bundle bundle) {
                this.f1890b = i2;
                this.f1891c = bundle;
            }

            public void run() {
                a.this.f1889c.a(this.f1890b, this.f1891c);
                throw null;
            }
        }

        /* renamed from: c.c.b.b$a$b  reason: collision with other inner class name */
        class RunnableC0038b implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f1893b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ Bundle f1894c;

            RunnableC0038b(String str, Bundle bundle) {
                this.f1893b = str;
                this.f1894c = bundle;
            }

            public void run() {
                a.this.f1889c.a(this.f1893b, this.f1894c);
                throw null;
            }
        }

        class c implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Bundle f1896b;

            c(Bundle bundle) {
                this.f1896b = bundle;
            }

            public void run() {
                a.this.f1889c.a(this.f1896b);
                throw null;
            }
        }

        class d implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f1898b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ Bundle f1899c;

            d(String str, Bundle bundle) {
                this.f1898b = str;
                this.f1899c = bundle;
            }

            public void run() {
                a.this.f1889c.b(this.f1898b, this.f1899c);
                throw null;
            }
        }

        class e implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f1901b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ Uri f1902c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ boolean f1903d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ Bundle f1904e;

            e(int i2, Uri uri, boolean z, Bundle bundle) {
                this.f1901b = i2;
                this.f1902c = uri;
                this.f1903d = z;
                this.f1904e = bundle;
            }

            public void run() {
                a.this.f1889c.a(this.f1901b, this.f1902c, this.f1903d, this.f1904e);
                throw null;
            }
        }

        a(b bVar, a aVar) {
            this.f1889c = aVar;
        }

        @Override // b.a.a.a
        public void a(int i2, Uri uri, boolean z, Bundle bundle) {
            if (this.f1889c != null) {
                this.f1888b.post(new e(i2, uri, z, bundle));
            }
        }

        @Override // b.a.a.a
        public void a(String str, Bundle bundle) {
            if (this.f1889c != null) {
                this.f1888b.post(new RunnableC0038b(str, bundle));
            }
        }

        @Override // b.a.a.a
        public void b(int i2, Bundle bundle) {
            if (this.f1889c != null) {
                this.f1888b.post(new RunnableC0037a(i2, bundle));
            }
        }

        @Override // b.a.a.a
        public void b(String str, Bundle bundle) {
            if (this.f1889c != null) {
                this.f1888b.post(new d(str, bundle));
            }
        }

        @Override // b.a.a.a
        public void f(Bundle bundle) {
            if (this.f1889c != null) {
                this.f1888b.post(new c(bundle));
            }
        }
    }

    b(b.a.a.b bVar, ComponentName componentName) {
        this.a = bVar;
        this.f1887b = componentName;
    }

    public static boolean a(Context context, String str, d dVar) {
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, dVar, 33);
    }

    public e a(a aVar) {
        a aVar2 = new a(this, aVar);
        try {
            if (!this.a.a(aVar2)) {
                return null;
            }
            return new e(this.a, aVar2, this.f1887b);
        } catch (RemoteException unused) {
            return null;
        }
    }

    public boolean a(long j2) {
        try {
            return this.a.a(j2);
        } catch (RemoteException unused) {
            return false;
        }
    }
}
