package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import android.widget.ImageButton;
import androidx.appcompat.widget.AppCompatImageButton;
import c.h.l.b0;
import c.h.l.c;
import c.h.l.l0.d;

public class CheckableImageButton extends AppCompatImageButton implements Checkable {

    /* renamed from: e  reason: collision with root package name */
    private static final int[] f6402e = {16842912};

    /* renamed from: d  reason: collision with root package name */
    private boolean f6403d;

    class a extends c {
        a() {
        }

        @Override // c.h.l.c
        public void a(View view, d dVar) {
            super.a(view, dVar);
            dVar.b(true);
            dVar.c(CheckableImageButton.this.isChecked());
        }

        @Override // c.h.l.c
        public void b(View view, AccessibilityEvent accessibilityEvent) {
            super.b(view, accessibilityEvent);
            accessibilityEvent.setChecked(CheckableImageButton.this.isChecked());
        }
    }

    public CheckableImageButton(Context context) {
        this(context, null);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c.a.a.imageButtonStyle);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        b0.a(this, new a());
    }

    public boolean isChecked() {
        return this.f6403d;
    }

    public int[] onCreateDrawableState(int i2) {
        return this.f6403d ? ImageButton.mergeDrawableStates(super.onCreateDrawableState(i2 + f6402e.length), f6402e) : super.onCreateDrawableState(i2);
    }

    public void setChecked(boolean z) {
        if (this.f6403d != z) {
            this.f6403d = z;
            refreshDrawableState();
            sendAccessibilityEvent(2048);
        }
    }

    public void toggle() {
        setChecked(!this.f6403d);
    }
}
