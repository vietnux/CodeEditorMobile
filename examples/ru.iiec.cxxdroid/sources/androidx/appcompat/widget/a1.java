package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import c.a.d;
import c.a.f;
import c.a.g;
import c.a.i;

class a1 {
    private final Context a;

    /* renamed from: b  reason: collision with root package name */
    private final View f538b;

    /* renamed from: c  reason: collision with root package name */
    private final TextView f539c;

    /* renamed from: d  reason: collision with root package name */
    private final WindowManager.LayoutParams f540d = new WindowManager.LayoutParams();

    /* renamed from: e  reason: collision with root package name */
    private final Rect f541e = new Rect();

    /* renamed from: f  reason: collision with root package name */
    private final int[] f542f = new int[2];

    /* renamed from: g  reason: collision with root package name */
    private final int[] f543g = new int[2];

    a1(Context context) {
        this.a = context;
        this.f538b = LayoutInflater.from(this.a).inflate(g.abc_tooltip, (ViewGroup) null);
        this.f539c = (TextView) this.f538b.findViewById(f.message);
        this.f540d.setTitle(a1.class.getSimpleName());
        this.f540d.packageName = this.a.getPackageName();
        WindowManager.LayoutParams layoutParams = this.f540d;
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = i.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }

    private static View a(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if ((layoutParams instanceof WindowManager.LayoutParams) && ((WindowManager.LayoutParams) layoutParams).type == 2) {
            return rootView;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return ((Activity) context).getWindow().getDecorView();
            }
        }
        return rootView;
    }

    private void a(View view, int i2, int i3, boolean z, WindowManager.LayoutParams layoutParams) {
        int i4;
        int i5;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.a.getResources().getDimensionPixelOffset(d.tooltip_precise_anchor_threshold);
        if (view.getWidth() < dimensionPixelOffset) {
            i2 = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.a.getResources().getDimensionPixelOffset(d.tooltip_precise_anchor_extra_offset);
            i5 = i3 + dimensionPixelOffset2;
            i4 = i3 - dimensionPixelOffset2;
        } else {
            i5 = view.getHeight();
            i4 = 0;
        }
        layoutParams.gravity = 49;
        int dimensionPixelOffset3 = this.a.getResources().getDimensionPixelOffset(z ? d.tooltip_y_offset_touch : d.tooltip_y_offset_non_touch);
        View a2 = a(view);
        if (a2 == null) {
            Log.e("TooltipPopup", "Cannot find app view");
            return;
        }
        a2.getWindowVisibleDisplayFrame(this.f541e);
        Rect rect = this.f541e;
        if (rect.left < 0 && rect.top < 0) {
            Resources resources = this.a.getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            this.f541e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        a2.getLocationOnScreen(this.f543g);
        view.getLocationOnScreen(this.f542f);
        int[] iArr = this.f542f;
        int i6 = iArr[0];
        int[] iArr2 = this.f543g;
        iArr[0] = i6 - iArr2[0];
        iArr[1] = iArr[1] - iArr2[1];
        layoutParams.x = (iArr[0] + i2) - (a2.getWidth() / 2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f538b.measure(makeMeasureSpec, makeMeasureSpec);
        int measuredHeight = this.f538b.getMeasuredHeight();
        int[] iArr3 = this.f542f;
        int i7 = ((iArr3[1] + i4) - dimensionPixelOffset3) - measuredHeight;
        int i8 = iArr3[1] + i5 + dimensionPixelOffset3;
        if (!z ? measuredHeight + i8 > this.f541e.height() : i7 >= 0) {
            layoutParams.y = i7;
        } else {
            layoutParams.y = i8;
        }
    }

    /* access modifiers changed from: package-private */
    public void a() {
        if (b()) {
            ((WindowManager) this.a.getSystemService("window")).removeView(this.f538b);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(View view, int i2, int i3, boolean z, CharSequence charSequence) {
        if (b()) {
            a();
        }
        this.f539c.setText(charSequence);
        a(view, i2, i3, z, this.f540d);
        ((WindowManager) this.a.getSystemService("window")).addView(this.f538b, this.f540d);
    }

    /* access modifiers changed from: package-private */
    public boolean b() {
        return this.f538b.getParent() != null;
    }
}
