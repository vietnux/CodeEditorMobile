package com.google.android.gms.ads.m;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.a;
import com.google.android.gms.ads.g;
import com.google.android.gms.ads.k;
import com.google.android.gms.ads.l;
import com.google.android.gms.internal.ads.qc;
import com.google.android.gms.internal.ads.y60;

public final class d extends ViewGroup {

    /* renamed from: b  reason: collision with root package name */
    private final y60 f3390b;

    public final a getAdListener() {
        return this.f3390b.b();
    }

    public final com.google.android.gms.ads.d getAdSize() {
        return this.f3390b.c();
    }

    public final com.google.android.gms.ads.d[] getAdSizes() {
        return this.f3390b.d();
    }

    public final String getAdUnitId() {
        return this.f3390b.e();
    }

    public final a getAppEventListener() {
        return this.f3390b.f();
    }

    public final String getMediationAdapterClassName() {
        return this.f3390b.g();
    }

    public final c getOnCustomRenderedAdLoadedListener() {
        return this.f3390b.h();
    }

    public final k getVideoController() {
        return this.f3390b.i();
    }

    public final l getVideoOptions() {
        return this.f3390b.j();
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
            com.google.android.gms.ads.d dVar = null;
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
        this.f3390b.a(aVar);
    }

    public final void setAdSizes(com.google.android.gms.ads.d... dVarArr) {
        if (dVarArr == null || dVarArr.length <= 0) {
            throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
        }
        this.f3390b.b(dVarArr);
    }

    public final void setAdUnitId(String str) {
        this.f3390b.a(str);
    }

    public final void setAppEventListener(a aVar) {
        this.f3390b.a(aVar);
    }

    public final void setCorrelator(g gVar) {
        this.f3390b.a(gVar);
    }

    public final void setManualImpressionsEnabled(boolean z) {
        this.f3390b.a(z);
    }

    public final void setOnCustomRenderedAdLoadedListener(c cVar) {
        this.f3390b.a(cVar);
    }

    public final void setVideoOptions(l lVar) {
        this.f3390b.a(lVar);
    }
}
