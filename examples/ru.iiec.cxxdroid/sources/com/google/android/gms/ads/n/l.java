package com.google.android.gms.ads.n;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.internal.ads.db0;
import com.google.android.gms.internal.ads.qc;
import e.b.b.a.b.a;
import e.b.b.a.b.b;

public final class l extends FrameLayout {

    /* renamed from: b  reason: collision with root package name */
    private final FrameLayout f3438b;

    /* renamed from: c  reason: collision with root package name */
    private final db0 f3439c;

    private final View a(String str) {
        try {
            a j2 = this.f3439c.j(str);
            if (j2 != null) {
                return (View) b.y(j2);
            }
            return null;
        } catch (RemoteException e2) {
            qc.b("Unable to call getAssetView on delegate", e2);
            return null;
        }
    }

    private final void a(String str, View view) {
        try {
            this.f3439c.a(str, b.a(view));
        } catch (RemoteException e2) {
            qc.b("Unable to call setAssetView on delegate", e2);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i2, layoutParams);
        super.bringChildToFront(this.f3438b);
    }

    public final void bringChildToFront(View view) {
        super.bringChildToFront(view);
        FrameLayout frameLayout = this.f3438b;
        if (frameLayout != view) {
            super.bringChildToFront(frameLayout);
        }
    }

    public final a getAdChoicesView() {
        View a = a("3011");
        if (a instanceof a) {
            return (a) a;
        }
        return null;
    }

    public final View getAdvertiserView() {
        return a("3005");
    }

    public final View getBodyView() {
        return a("3004");
    }

    public final View getCallToActionView() {
        return a("3002");
    }

    public final View getHeadlineView() {
        return a("3001");
    }

    public final View getIconView() {
        return a("3003");
    }

    public final View getImageView() {
        return a("3008");
    }

    public final b getMediaView() {
        View a = a("3010");
        if (a instanceof b) {
            return (b) a;
        }
        if (a == null) {
            return null;
        }
        qc.b("View is not an instance of MediaView");
        return null;
    }

    public final View getPriceView() {
        return a("3007");
    }

    public final View getStarRatingView() {
        return a("3009");
    }

    public final View getStoreView() {
        return a("3006");
    }

    public final void onVisibilityChanged(View view, int i2) {
        super.onVisibilityChanged(view, i2);
        db0 db0 = this.f3439c;
        if (db0 != null) {
            try {
                db0.d(b.a(view), i2);
            } catch (RemoteException e2) {
                qc.b("Unable to call onVisibilityChanged on delegate", e2);
            }
        }
    }

    public final void removeAllViews() {
        super.removeAllViews();
        super.addView(this.f3438b);
    }

    public final void removeView(View view) {
        if (this.f3438b != view) {
            super.removeView(view);
        }
    }

    public final void setAdChoicesView(a aVar) {
        a("3011", aVar);
    }

    public final void setAdvertiserView(View view) {
        a("3005", view);
    }

    public final void setBodyView(View view) {
        a("3004", view);
    }

    public final void setCallToActionView(View view) {
        a("3002", view);
    }

    public final void setClickConfirmingView(View view) {
        try {
            this.f3439c.e(b.a(view));
        } catch (RemoteException e2) {
            qc.b("Unable to call setClickConfirmingView on delegate", e2);
        }
    }

    public final void setHeadlineView(View view) {
        a("3001", view);
    }

    public final void setIconView(View view) {
        a("3003", view);
    }

    public final void setImageView(View view) {
        a("3008", view);
    }

    public final void setMediaView(b bVar) {
        a("3010", bVar);
    }

    public final void setNativeAd(k kVar) {
        try {
            this.f3439c.d((a) kVar.k());
        } catch (RemoteException e2) {
            qc.b("Unable to call setNativeAd on delegate", e2);
        }
    }

    public final void setPriceView(View view) {
        a("3007", view);
    }

    public final void setStarRatingView(View view) {
        a("3009", view);
    }

    public final void setStoreView(View view) {
        a("3006", view);
    }
}
