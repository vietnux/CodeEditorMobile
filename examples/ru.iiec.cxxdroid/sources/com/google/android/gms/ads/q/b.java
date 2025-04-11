package com.google.android.gms.ads.q;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.a;
import com.google.android.gms.ads.d;
import com.google.android.gms.internal.ads.k2;
import com.google.android.gms.internal.ads.qc;
import com.google.android.gms.internal.ads.y60;

@k2
public final class b extends ViewGroup {

    /* renamed from: b  reason: collision with root package name */
    private final y60 f3440b;

    public final a getAdListener() {
        return this.f3440b.b();
    }

    public final d getAdSize() {
        return this.f3440b.c();
    }

    public final String getAdUnitId() {
        return this.f3440b.e();
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        View childAt = getChildAt(0);
        if (childAt != null && childAt.getVisibility() != 8) {
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            int i6 = ((i4 - i2) - measuredWidth) / 2;
            int i7 = ((i5 - i3) - measuredHeight) / 2;
            childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i2, int i3) {
        int i4;
        int i5 = 0;
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            d dVar = null;
            try {
                dVar = getAdSize();
            } catch (NullPointerException e2) {
                qc.b("Unable to retrieve ad size.", e2);
            }
            if (dVar != null) {
                Context context = getContext();
                int b2 = dVar.b(context);
                i4 = dVar.a(context);
                i5 = b2;
            } else {
                i4 = 0;
            }
        } else {
            measureChild(childAt, i2, i3);
            i5 = childAt.getMeasuredWidth();
            i4 = childAt.getMeasuredHeight();
        }
        setMeasuredDimension(View.resolveSize(Math.max(i5, getSuggestedMinimumWidth()), i2), View.resolveSize(Math.max(i4, getSuggestedMinimumHeight()), i3));
    }

    public final void setAdListener(a aVar) {
        this.f3440b.a(aVar);
    }

    public final void setAdSize(d dVar) {
        this.f3440b.a(dVar);
    }

    public final void setAdUnitId(String str) {
        this.f3440b.a(str);
    }
}
