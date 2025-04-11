package com.google.android.gms.ads;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.m.a;
import com.google.android.gms.internal.ads.d40;
import com.google.android.gms.internal.ads.qc;
import com.google.android.gms.internal.ads.y60;

/* access modifiers changed from: package-private */
public class f extends ViewGroup {

    /* renamed from: b  reason: collision with root package name */
    protected final y60 f3114b;

    public f(Context context, int i2) {
        super(context);
        this.f3114b = new y60(this, i2);
    }

    public void a() {
        this.f3114b.a();
    }

    public void a(c cVar) {
        this.f3114b.a(cVar.a());
    }

    public void b() {
        this.f3114b.k();
    }

    public void c() {
        this.f3114b.l();
    }

    public a getAdListener() {
        return this.f3114b.b();
    }

    public d getAdSize() {
        return this.f3114b.c();
    }

    public String getAdUnitId() {
        return this.f3114b.e();
    }

    public String getMediationAdapterClassName() {
        return this.f3114b.g();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
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
    public void onMeasure(int i2, int i3) {
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

    public void setAdListener(a aVar) {
        this.f3114b.a(aVar);
        if (aVar == null) {
            this.f3114b.a((d40) null);
            this.f3114b.a((a) null);
            return;
        }
        if (aVar instanceof d40) {
            this.f3114b.a((d40) aVar);
        }
        if (aVar instanceof a) {
            this.f3114b.a((a) aVar);
        }
    }

    public void setAdSize(d dVar) {
        this.f3114b.a(dVar);
    }

    public void setAdUnitId(String str) {
        this.f3114b.a(str);
    }
}
