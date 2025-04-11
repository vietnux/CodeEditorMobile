package com.google.android.gms.ads.n;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.internal.ads.db0;
import com.google.android.gms.internal.ads.qc;
import e.b.b.a.b.a;
import e.b.b.a.b.b;

public class e extends FrameLayout {

    /* renamed from: b  reason: collision with root package name */
    private final FrameLayout f3432b;

    /* renamed from: c  reason: collision with root package name */
    private final db0 f3433c;

    /* access modifiers changed from: protected */
    public final View a(String str) {
        try {
            a j2 = this.f3433c.j(str);
            if (j2 != null) {
                return (View) b.y(j2);
            }
            return null;
        } catch (RemoteException e2) {
            qc.b("Unable to call getAssetView on delegate", e2);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final void a(String str, View view) {
        try {
            this.f3433c.a(str, b.a(view));
        } catch (RemoteException e2) {
            qc.b("Unable to call setAssetView on delegate", e2);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i2, layoutParams);
        super.bringChildToFront(this.f3432b);
    }

    public void bringChildToFront(View view) {
        super.bringChildToFront(view);
        FrameLayout frameLayout = this.f3432b;
        if (frameLayout != view) {
            super.bringChildToFront(frameLayout);
        }
    }

    public a getAdChoicesView() {
        View a = a("1098");
        if (a instanceof a) {
            return (a) a;
        }
        return null;
    }

    public void onVisibilityChanged(View view, int i2) {
        super.onVisibilityChanged(view, i2);
        db0 db0 = this.f3433c;
        if (db0 != null) {
            try {
                db0.d(b.a(view), i2);
            } catch (RemoteException e2) {
                qc.b("Unable to call onVisibilityChanged on delegate", e2);
            }
        }
    }

    public void removeAllViews() {
        super.removeAllViews();
        super.addView(this.f3432b);
    }

    public void removeView(View view) {
        if (this.f3432b != view) {
            super.removeView(view);
        }
    }

    public void setAdChoicesView(a aVar) {
        a("1098", aVar);
    }

    public void setNativeAd(c cVar) {
        try {
            this.f3433c.d((a) cVar.a());
        } catch (RemoteException e2) {
            qc.b("Unable to call setNativeAd on delegate", e2);
        }
    }
}
