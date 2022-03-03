package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.appcompat.app.a;
import androidx.appcompat.widget.h0;

public class p0 extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* renamed from: b  reason: collision with root package name */
    Runnable f675b;

    /* renamed from: c  reason: collision with root package name */
    private c f676c;

    /* renamed from: d  reason: collision with root package name */
    h0 f677d;

    /* renamed from: e  reason: collision with root package name */
    private Spinner f678e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f679f;

    /* renamed from: g  reason: collision with root package name */
    int f680g;

    /* renamed from: h  reason: collision with root package name */
    int f681h;

    /* renamed from: i  reason: collision with root package name */
    private int f682i;

    /* renamed from: j  reason: collision with root package name */
    private int f683j;

    /* access modifiers changed from: package-private */
    public class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f684b;

        a(View view) {
            this.f684b = view;
        }

        public void run() {
            p0.this.smoothScrollTo(this.f684b.getLeft() - ((p0.this.getWidth() - this.f684b.getWidth()) / 2), 0);
            p0.this.f675b = null;
        }
    }

    /* access modifiers changed from: private */
    public class b extends BaseAdapter {
        b() {
        }

        public int getCount() {
            return p0.this.f677d.getChildCount();
        }

        public Object getItem(int i2) {
            return ((d) p0.this.f677d.getChildAt(i2)).a();
        }

        public long getItemId(int i2) {
            return (long) i2;
        }

        public View getView(int i2, View view, ViewGroup viewGroup) {
            if (view == null) {
                return p0.this.a((a.d) getItem(i2), true);
            }
            ((d) view).a((a.d) getItem(i2));
            return view;
        }
    }

    /* access modifiers changed from: private */
    public class c implements View.OnClickListener {
        c() {
        }

        public void onClick(View view) {
            ((d) view).a().e();
            int childCount = p0.this.f677d.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = p0.this.f677d.getChildAt(i2);
                childAt.setSelected(childAt == view);
            }
        }
    }

    /* access modifiers changed from: private */
    public class d extends LinearLayout {

        /* renamed from: b  reason: collision with root package name */
        private final int[] f688b = {16842964};

        /* renamed from: c  reason: collision with root package name */
        private a.d f689c;

        /* renamed from: d  reason: collision with root package name */
        private TextView f690d;

        /* renamed from: e  reason: collision with root package name */
        private ImageView f691e;

        /* renamed from: f  reason: collision with root package name */
        private View f692f;

        public d(Context context, a.d dVar, boolean z) {
            super(context, null, c.a.a.actionBarTabStyle);
            this.f689c = dVar;
            w0 a = w0.a(context, null, this.f688b, c.a.a.actionBarTabStyle, 0);
            if (a.g(0)) {
                setBackgroundDrawable(a.b(0));
            }
            a.b();
            if (z) {
                setGravity(8388627);
            }
            b();
        }

        public a.d a() {
            return this.f689c;
        }

        public void a(a.d dVar) {
            this.f689c = dVar;
            b();
        }

        public void b() {
            a.d dVar = this.f689c;
            View b2 = dVar.b();
            CharSequence charSequence = null;
            if (b2 != null) {
                ViewParent parent = b2.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(b2);
                    }
                    addView(b2);
                }
                this.f692f = b2;
                TextView textView = this.f690d;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f691e;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f691e.setImageDrawable(null);
                    return;
                }
                return;
            }
            View view = this.f692f;
            if (view != null) {
                removeView(view);
                this.f692f = null;
            }
            Drawable c2 = dVar.c();
            CharSequence d2 = dVar.d();
            if (c2 != null) {
                if (this.f691e == null) {
                    m mVar = new m(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    mVar.setLayoutParams(layoutParams);
                    addView(mVar, 0);
                    this.f691e = mVar;
                }
                this.f691e.setImageDrawable(c2);
                this.f691e.setVisibility(0);
            } else {
                ImageView imageView2 = this.f691e;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.f691e.setImageDrawable(null);
                }
            }
            boolean z = !TextUtils.isEmpty(d2);
            if (z) {
                if (this.f690d == null) {
                    y yVar = new y(getContext(), null, c.a.a.actionBarTabTextStyle);
                    yVar.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    yVar.setLayoutParams(layoutParams2);
                    addView(yVar);
                    this.f690d = yVar;
                }
                this.f690d.setText(d2);
                this.f690d.setVisibility(0);
            } else {
                TextView textView2 = this.f690d;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    this.f690d.setText((CharSequence) null);
                }
            }
            ImageView imageView3 = this.f691e;
            if (imageView3 != null) {
                imageView3.setContentDescription(dVar.a());
            }
            if (!z) {
                charSequence = dVar.a();
            }
            y0.a(this, charSequence);
        }

        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        public void onMeasure(int i2, int i3) {
            int i4;
            super.onMeasure(i2, i3);
            if (p0.this.f680g > 0 && getMeasuredWidth() > (i4 = p0.this.f680g)) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), i3);
            }
        }

        public void setSelected(boolean z) {
            boolean z2 = isSelected() != z;
            super.setSelected(z);
            if (z2 && z) {
                sendAccessibilityEvent(4);
            }
        }
    }

    static {
        new DecelerateInterpolator();
    }

    private Spinner a() {
        v vVar = new v(getContext(), null, c.a.a.actionDropDownStyle);
        vVar.setLayoutParams(new h0.a(-2, -1));
        vVar.setOnItemSelectedListener(this);
        return vVar;
    }

    private boolean b() {
        Spinner spinner = this.f678e;
        return spinner != null && spinner.getParent() == this;
    }

    private void c() {
        if (!b()) {
            if (this.f678e == null) {
                this.f678e = a();
            }
            removeView(this.f677d);
            addView(this.f678e, new ViewGroup.LayoutParams(-2, -1));
            if (this.f678e.getAdapter() == null) {
                this.f678e.setAdapter((SpinnerAdapter) new b());
            }
            Runnable runnable = this.f675b;
            if (runnable != null) {
                removeCallbacks(runnable);
                this.f675b = null;
            }
            this.f678e.setSelection(this.f683j);
        }
    }

    private boolean d() {
        if (!b()) {
            return false;
        }
        removeView(this.f678e);
        addView(this.f677d, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.f678e.getSelectedItemPosition());
        return false;
    }

    /* access modifiers changed from: package-private */
    public d a(a.d dVar, boolean z) {
        d dVar2 = new d(getContext(), dVar, z);
        if (z) {
            dVar2.setBackgroundDrawable(null);
            dVar2.setLayoutParams(new AbsListView.LayoutParams(-1, this.f682i));
        } else {
            dVar2.setFocusable(true);
            if (this.f676c == null) {
                this.f676c = new c();
            }
            dVar2.setOnClickListener(this.f676c);
        }
        return dVar2;
    }

    public void a(int i2) {
        View childAt = this.f677d.getChildAt(i2);
        Runnable runnable = this.f675b;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        this.f675b = new a(childAt);
        post(this.f675b);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f675b;
        if (runnable != null) {
            post(runnable);
        }
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        c.a.o.a a2 = c.a.o.a.a(getContext());
        setContentHeight(a2.e());
        this.f681h = a2.d();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f675b;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j2) {
        ((d) view).a().e();
    }

    public void onMeasure(int i2, int i3) {
        int i4;
        int mode = View.MeasureSpec.getMode(i2);
        boolean z = true;
        boolean z2 = mode == 1073741824;
        setFillViewport(z2);
        int childCount = this.f677d.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            i4 = -1;
        } else {
            if (childCount > 2) {
                this.f680g = (int) (((float) View.MeasureSpec.getSize(i2)) * 0.4f);
            } else {
                this.f680g = View.MeasureSpec.getSize(i2) / 2;
            }
            i4 = Math.min(this.f680g, this.f681h);
        }
        this.f680g = i4;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f682i, 1073741824);
        if (z2 || !this.f679f) {
            z = false;
        }
        if (z) {
            this.f677d.measure(0, makeMeasureSpec);
            if (this.f677d.getMeasuredWidth() > View.MeasureSpec.getSize(i2)) {
                c();
                int measuredWidth = getMeasuredWidth();
                super.onMeasure(i2, makeMeasureSpec);
                int measuredWidth2 = getMeasuredWidth();
                if (z2 && measuredWidth != measuredWidth2) {
                    setTabSelected(this.f683j);
                    return;
                }
            }
        }
        d();
        int measuredWidth3 = getMeasuredWidth();
        super.onMeasure(i2, makeMeasureSpec);
        int measuredWidth22 = getMeasuredWidth();
        if (z2) {
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void setAllowCollapse(boolean z) {
        this.f679f = z;
    }

    public void setContentHeight(int i2) {
        this.f682i = i2;
        requestLayout();
    }

    public void setTabSelected(int i2) {
        this.f683j = i2;
        int childCount = this.f677d.getChildCount();
        int i3 = 0;
        while (i3 < childCount) {
            View childAt = this.f677d.getChildAt(i3);
            boolean z = i3 == i2;
            childAt.setSelected(z);
            if (z) {
                a(i2);
            }
            i3++;
        }
        Spinner spinner = this.f678e;
        if (spinner != null && i2 >= 0) {
            spinner.setSelection(i2);
        }
    }
}
