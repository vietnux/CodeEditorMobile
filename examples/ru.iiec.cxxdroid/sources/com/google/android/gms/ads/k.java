package com.google.android.gms.ads;

import android.os.RemoteException;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.internal.ads.k2;
import com.google.android.gms.internal.ads.o60;
import com.google.android.gms.internal.ads.qc;
import com.google.android.gms.internal.ads.s70;

@k2
public final class k {
    private final Object a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private o60 f3386b;

    /* renamed from: c  reason: collision with root package name */
    private a f3387c;

    public static abstract class a {
        public void a() {
            throw null;
        }

        public void a(boolean z) {
            throw null;
        }

        public void b() {
            throw null;
        }

        public void c() {
            throw null;
        }

        public void d() {
            throw null;
        }
    }

    public final o60 a() {
        o60 o60;
        synchronized (this.a) {
            o60 = this.f3386b;
        }
        return o60;
    }

    public final void a(a aVar) {
        y.a(aVar, "VideoLifecycleCallbacks may not be null.");
        synchronized (this.a) {
            this.f3387c = aVar;
            if (this.f3386b != null) {
                try {
                    this.f3386b.a(new s70(aVar));
                } catch (RemoteException e2) {
                    qc.b("Unable to call setVideoLifecycleCallbacks on video controller.", e2);
                }
            }
        }
    }

    public final void a(o60 o60) {
        synchronized (this.a) {
            this.f3386b = o60;
            if (this.f3387c != null) {
                a(this.f3387c);
            }
        }
    }
}
