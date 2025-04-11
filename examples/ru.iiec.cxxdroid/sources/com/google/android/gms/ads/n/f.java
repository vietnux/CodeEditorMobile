package com.google.android.gms.ads.n;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.internal.ads.hb0;
import com.google.android.gms.internal.ads.qc;
import e.b.b.a.b.a;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

public final class f {

    /* renamed from: c  reason: collision with root package name */
    public static WeakHashMap<View, f> f3434c = new WeakHashMap<>();
    private hb0 a;

    /* renamed from: b  reason: collision with root package name */
    private WeakReference<View> f3435b;

    private final void a(a aVar) {
        WeakReference<View> weakReference = this.f3435b;
        View view = weakReference != null ? weakReference.get() : null;
        if (view == null) {
            qc.d("NativeAdViewHolder.setNativeAd containerView doesn't exist, returning");
            return;
        }
        if (!f3434c.containsKey(view)) {
            f3434c.put(view, this);
        }
        hb0 hb0 = this.a;
        if (hb0 != null) {
            try {
                hb0.d(aVar);
            } catch (RemoteException e2) {
                qc.b("Unable to call setNativeAd on delegate", e2);
            }
        }
    }

    public final void a(c cVar) {
        a((a) cVar.a());
    }

    public final void a(k kVar) {
        a((a) kVar.k());
    }
}
