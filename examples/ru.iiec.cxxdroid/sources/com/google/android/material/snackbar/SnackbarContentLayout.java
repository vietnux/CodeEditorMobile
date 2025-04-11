package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import c.h.l.b0;
import e.b.b.b.f;
import e.b.b.b.j;

public class SnackbarContentLayout extends LinearLayout implements a {

    /* renamed from: b  reason: collision with root package name */
    private TextView f6493b;

    /* renamed from: c  reason: collision with root package name */
    private Button f6494c;

    /* renamed from: d  reason: collision with root package name */
    private int f6495d;

    /* renamed from: e  reason: collision with root package name */
    private int f6496e;

    public SnackbarContentLayout(Context context) {
        this(context, null);
    }

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.SnackbarLayout);
        this.f6495d = obtainStyledAttributes.getDimensionPixelSize(j.SnackbarLayout_android_maxWidth, -1);
        this.f6496e = obtainStyledAttributes.getDimensionPixelSize(j.SnackbarLayout_maxActionInlineWidth, -1);
        obtainStyledAttributes.recycle();
    }

    private static void a(View view, int i2, int i3) {
        if (b0.K(view)) {
            b0.a(view, b0.w(view), i2, b0.v(view), i3);
        } else {
            view.setPadding(view.getPaddingLeft(), i2, view.getPaddingRight(), i3);
        }
    }

    private boolean a(int i2, int i3, int i4) {
        boolean z;
        if (i2 != getOrientation()) {
            setOrientation(i2);
            z = true;
        } else {
            z = false;
        }
        if (this.f6493b.getPaddingTop() == i3 && this.f6493b.getPaddingBottom() == i4) {
            return z;
        }
        a(this.f6493b, i3, i4);
        return true;
    }

    @Override // com.google.android.material.snackbar.a
    public void a(int i2, int i3) {
        this.f6493b.setAlpha(0.0f);
        long j2 = (long) i3;
        long j3 = (long) i2;
        this.f6493b.animate().alpha(1.0f).setDuration(j2).setStartDelay(j3).start();
        if (this.f6494c.getVisibility() == 0) {
            this.f6494c.setAlpha(0.0f);
            this.f6494c.animate().alpha(1.0f).setDuration(j2).setStartDelay(j3).start();
        }
    }

    @Override // com.google.android.material.snackbar.a
    public void b(int i2, int i3) {
        this.f6493b.setAlpha(1.0f);
        long j2 = (long) i3;
        long j3 = (long) i2;
        this.f6493b.animate().alpha(0.0f).setDuration(j2).setStartDelay(j3).start();
        if (this.f6494c.getVisibility() == 0) {
            this.f6494c.setAlpha(1.0f);
            this.f6494c.animate().alpha(0.0f).setDuration(j2).setStartDelay(j3).start();
        }
    }

    public Button getActionView() {
        return this.f6494c;
    }

    public TextView getMessageView() {
        return this.f6493b;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f6493b = (TextView) findViewById(f.snackbar_text);
        this.f6494c = (Button) findViewById(f.snackbar_action);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0053, code lost:
        if (a(1, r0, r0 - r1) != false) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005e, code lost:
        if (a(0, r0, r0) != false) goto L_0x0062;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r8, int r9) {
        /*
        // Method dump skipped, instructions count: 104
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.SnackbarContentLayout.onMeasure(int, int):void");
    }
}
