package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.x0;
import com.google.android.gms.common.internal.y;
import e.b.b.a.b.b;
import java.util.List;

@k2
public final class n90 extends RelativeLayout {

    /* renamed from: c  reason: collision with root package name */
    private static final float[] f5077c = {5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f};

    /* renamed from: b  reason: collision with root package name */
    private AnimationDrawable f5078b;

    public n90(Context context, k90 k90, RelativeLayout.LayoutParams layoutParams) {
        super(context);
        y.a(k90);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(f5077c, null, null));
        shapeDrawable.getPaint().setColor(k90.f2());
        setLayoutParams(layoutParams);
        x0.h().a(this, shapeDrawable);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        if (!TextUtils.isEmpty(k90.v())) {
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            TextView textView = new TextView(context);
            textView.setLayoutParams(layoutParams3);
            textView.setId(1195835393);
            textView.setTypeface(Typeface.DEFAULT);
            textView.setText(k90.v());
            textView.setTextColor(k90.g2());
            textView.setTextSize((float) k90.h2());
            a50.b();
            int a = fc.a(context, 4);
            a50.b();
            textView.setPadding(a, 0, fc.a(context, 4), 0);
            addView(textView);
            layoutParams2.addRule(1, textView.getId());
        }
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(layoutParams2);
        imageView.setId(1195835394);
        List<o90> i2 = k90.i2();
        if (i2 != null && i2.size() > 1) {
            this.f5078b = new AnimationDrawable();
            for (o90 o90 : i2) {
                try {
                    this.f5078b.addFrame((Drawable) b.y(o90.j1()), k90.j2());
                } catch (Exception e2) {
                    qc.b("Error while getting drawable.", e2);
                }
            }
            x0.h().a(imageView, this.f5078b);
        } else if (i2.size() == 1) {
            try {
                imageView.setImageDrawable((Drawable) b.y(i2.get(0).j1()));
            } catch (Exception e3) {
                qc.b("Error while getting drawable.", e3);
            }
        }
        addView(imageView);
    }

    public final void onAttachedToWindow() {
        AnimationDrawable animationDrawable = this.f5078b;
        if (animationDrawable != null) {
            animationDrawable.start();
        }
        super.onAttachedToWindow();
    }
}
