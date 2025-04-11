package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import com.google.android.gms.internal.ads.a50;
import com.google.android.gms.internal.ads.fc;
import com.google.android.gms.internal.ads.k2;

@k2
public final class o extends FrameLayout implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    private final ImageButton f3296b;

    /* renamed from: c  reason: collision with root package name */
    private final w f3297c;

    public o(Context context, p pVar, w wVar) {
        super(context);
        this.f3297c = wVar;
        setOnClickListener(this);
        this.f3296b = new ImageButton(context);
        this.f3296b.setImageResource(17301527);
        this.f3296b.setBackgroundColor(0);
        this.f3296b.setOnClickListener(this);
        ImageButton imageButton = this.f3296b;
        a50.b();
        int a = fc.a(context, pVar.a);
        a50.b();
        int a2 = fc.a(context, 0);
        a50.b();
        int a3 = fc.a(context, pVar.f3298b);
        a50.b();
        imageButton.setPadding(a, a2, a3, fc.a(context, pVar.f3299c));
        this.f3296b.setContentDescription("Interstitial close button");
        a50.b();
        fc.a(context, pVar.f3300d);
        ImageButton imageButton2 = this.f3296b;
        a50.b();
        int a4 = fc.a(context, pVar.f3300d + pVar.a + pVar.f3298b);
        a50.b();
        addView(imageButton2, new FrameLayout.LayoutParams(a4, fc.a(context, pVar.f3300d + pVar.f3299c), 17));
    }

    public final void a(boolean z) {
        ImageButton imageButton;
        int i2;
        if (z) {
            imageButton = this.f3296b;
            i2 = 8;
        } else {
            imageButton = this.f3296b;
            i2 = 0;
        }
        imageButton.setVisibility(i2);
    }

    public final void onClick(View view) {
        w wVar = this.f3297c;
        if (wVar != null) {
            wVar.T1();
        }
    }
}
