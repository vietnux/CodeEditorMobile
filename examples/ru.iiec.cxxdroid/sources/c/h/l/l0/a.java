package c.h.l.l0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

public final class a extends ClickableSpan {

    /* renamed from: b  reason: collision with root package name */
    private final int f2436b;

    /* renamed from: c  reason: collision with root package name */
    private final d f2437c;

    /* renamed from: d  reason: collision with root package name */
    private final int f2438d;

    public a(int i2, d dVar, int i3) {
        this.f2436b = i2;
        this.f2437c = dVar;
        this.f2438d = i3;
    }

    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f2436b);
        this.f2437c.a(this.f2438d, bundle);
    }
}
