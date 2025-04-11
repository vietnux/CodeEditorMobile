package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.a;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.view.menu.s;
import androidx.appcompat.widget.ActionMenuView;
import c.h.l.b0;
import java.util.ArrayList;
import java.util.List;

public class Toolbar extends ViewGroup {
    private ColorStateList A;
    private ColorStateList B;
    private boolean C;
    private boolean D;
    private final ArrayList<View> E;
    private final ArrayList<View> F;
    private final int[] G;
    f H;
    private final ActionMenuView.e I;
    private x0 J;
    private c K;
    private d L;
    private n.a M;
    private g.a N;
    private boolean O;
    private final Runnable P;

    /* renamed from: b  reason: collision with root package name */
    private ActionMenuView f501b;

    /* renamed from: c  reason: collision with root package name */
    private TextView f502c;

    /* renamed from: d  reason: collision with root package name */
    private TextView f503d;

    /* renamed from: e  reason: collision with root package name */
    private ImageButton f504e;

    /* renamed from: f  reason: collision with root package name */
    private ImageView f505f;

    /* renamed from: g  reason: collision with root package name */
    private Drawable f506g;

    /* renamed from: h  reason: collision with root package name */
    private CharSequence f507h;

    /* renamed from: i  reason: collision with root package name */
    ImageButton f508i;

    /* renamed from: j  reason: collision with root package name */
    View f509j;

    /* renamed from: k  reason: collision with root package name */
    private Context f510k;

    /* renamed from: l  reason: collision with root package name */
    private int f511l;

    /* renamed from: m  reason: collision with root package name */
    private int f512m;
    private int n;
    int o;
    private int p;
    private int q;
    private int r;
    private int s;
    private int t;
    private o0 u;
    private int v;
    private int w;
    private int x;
    private CharSequence y;
    private CharSequence z;

    class a implements ActionMenuView.e {
        a() {
        }

        @Override // androidx.appcompat.widget.ActionMenuView.e
        public boolean onMenuItemClick(MenuItem menuItem) {
            f fVar = Toolbar.this.H;
            if (fVar != null) {
                return fVar.onMenuItemClick(menuItem);
            }
            return false;
        }
    }

    class b implements Runnable {
        b() {
        }

        public void run() {
            Toolbar.this.k();
        }
    }

    /* access modifiers changed from: package-private */
    public class c implements View.OnClickListener {
        c() {
        }

        public void onClick(View view) {
            Toolbar.this.c();
        }
    }

    /* access modifiers changed from: private */
    public class d implements n {

        /* renamed from: b  reason: collision with root package name */
        androidx.appcompat.view.menu.g f515b;

        /* renamed from: c  reason: collision with root package name */
        j f516c;

        d() {
        }

        @Override // androidx.appcompat.view.menu.n
        public void a(Context context, androidx.appcompat.view.menu.g gVar) {
            j jVar;
            androidx.appcompat.view.menu.g gVar2 = this.f515b;
            if (!(gVar2 == null || (jVar = this.f516c) == null)) {
                gVar2.a(jVar);
            }
            this.f515b = gVar;
        }

        @Override // androidx.appcompat.view.menu.n
        public void a(Parcelable parcelable) {
        }

        @Override // androidx.appcompat.view.menu.n
        public void a(androidx.appcompat.view.menu.g gVar, boolean z) {
        }

        @Override // androidx.appcompat.view.menu.n
        public void a(boolean z) {
            if (this.f516c != null) {
                androidx.appcompat.view.menu.g gVar = this.f515b;
                boolean z2 = false;
                if (gVar != null) {
                    int size = gVar.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= size) {
                            break;
                        } else if (this.f515b.getItem(i2) == this.f516c) {
                            z2 = true;
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
                if (!z2) {
                    a(this.f515b, this.f516c);
                }
            }
        }

        @Override // androidx.appcompat.view.menu.n
        public boolean a() {
            return false;
        }

        @Override // androidx.appcompat.view.menu.n
        public boolean a(androidx.appcompat.view.menu.g gVar, j jVar) {
            View view = Toolbar.this.f509j;
            if (view instanceof c.a.o.c) {
                ((c.a.o.c) view).c();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f509j);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f508i);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f509j = null;
            toolbar3.a();
            this.f516c = null;
            Toolbar.this.requestLayout();
            jVar.a(false);
            return true;
        }

        @Override // androidx.appcompat.view.menu.n
        public boolean a(s sVar) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.n
        public Parcelable b() {
            return null;
        }

        @Override // androidx.appcompat.view.menu.n
        public boolean b(androidx.appcompat.view.menu.g gVar, j jVar) {
            Toolbar.this.e();
            ViewParent parent = Toolbar.this.f508i.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f508i);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f508i);
            }
            Toolbar.this.f509j = jVar.getActionView();
            this.f516c = jVar;
            ViewParent parent2 = Toolbar.this.f509j.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f509j);
                }
                e generateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                generateDefaultLayoutParams.a = 8388611 | (toolbar4.o & 112);
                generateDefaultLayoutParams.f518b = 2;
                toolbar4.f509j.setLayoutParams(generateDefaultLayoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f509j);
            }
            Toolbar.this.j();
            Toolbar.this.requestLayout();
            jVar.a(true);
            View view = Toolbar.this.f509j;
            if (view instanceof c.a.o.c) {
                ((c.a.o.c) view).b();
            }
            return true;
        }

        @Override // androidx.appcompat.view.menu.n
        public int getId() {
            return 0;
        }
    }

    public static class e extends a.C0006a {

        /* renamed from: b  reason: collision with root package name */
        int f518b = 0;

        public e(int i2, int i3) {
            super(i2, i3);
            this.a = 8388627;
        }

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            a(marginLayoutParams);
        }

        public e(a.C0006a aVar) {
            super(aVar);
        }

        public e(e eVar) {
            super((a.C0006a) eVar);
            this.f518b = eVar.f518b;
        }

        /* access modifiers changed from: package-private */
        public void a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }
    }

    public interface f {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public static class g extends c.j.a.a {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* renamed from: d  reason: collision with root package name */
        int f519d;

        /* renamed from: e  reason: collision with root package name */
        boolean f520e;

        class a implements Parcelable.ClassLoaderCreator<g> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            public g createFromParcel(Parcel parcel) {
                return new g(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new g(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public g[] newArray(int i2) {
                return new g[i2];
            }
        }

        public g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f519d = parcel.readInt();
            this.f520e = parcel.readInt() != 0;
        }

        public g(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // c.j.a.a
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f519d);
            parcel.writeInt(this.f520e ? 1 : 0);
        }
    }

    public Toolbar(Context context) {
        this(context, null);
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c.a.a.toolbarStyle);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.x = 8388627;
        this.E = new ArrayList<>();
        this.F = new ArrayList<>();
        this.G = new int[2];
        this.I = new a();
        this.P = new b();
        w0 a2 = w0.a(getContext(), attributeSet, c.a.j.Toolbar, i2, 0);
        b0.a(this, context, c.a.j.Toolbar, attributeSet, a2.a(), i2, 0);
        this.f512m = a2.g(c.a.j.Toolbar_titleTextAppearance, 0);
        this.n = a2.g(c.a.j.Toolbar_subtitleTextAppearance, 0);
        this.x = a2.e(c.a.j.Toolbar_android_gravity, this.x);
        this.o = a2.e(c.a.j.Toolbar_buttonGravity, 48);
        int b2 = a2.b(c.a.j.Toolbar_titleMargin, 0);
        b2 = a2.g(c.a.j.Toolbar_titleMargins) ? a2.b(c.a.j.Toolbar_titleMargins, b2) : b2;
        this.t = b2;
        this.s = b2;
        this.r = b2;
        this.q = b2;
        int b3 = a2.b(c.a.j.Toolbar_titleMarginStart, -1);
        if (b3 >= 0) {
            this.q = b3;
        }
        int b4 = a2.b(c.a.j.Toolbar_titleMarginEnd, -1);
        if (b4 >= 0) {
            this.r = b4;
        }
        int b5 = a2.b(c.a.j.Toolbar_titleMarginTop, -1);
        if (b5 >= 0) {
            this.s = b5;
        }
        int b6 = a2.b(c.a.j.Toolbar_titleMarginBottom, -1);
        if (b6 >= 0) {
            this.t = b6;
        }
        this.p = a2.c(c.a.j.Toolbar_maxButtonHeight, -1);
        int b7 = a2.b(c.a.j.Toolbar_contentInsetStart, Integer.MIN_VALUE);
        int b8 = a2.b(c.a.j.Toolbar_contentInsetEnd, Integer.MIN_VALUE);
        int c2 = a2.c(c.a.j.Toolbar_contentInsetLeft, 0);
        int c3 = a2.c(c.a.j.Toolbar_contentInsetRight, 0);
        l();
        this.u.a(c2, c3);
        if (!(b7 == Integer.MIN_VALUE && b8 == Integer.MIN_VALUE)) {
            this.u.b(b7, b8);
        }
        this.v = a2.b(c.a.j.Toolbar_contentInsetStartWithNavigation, Integer.MIN_VALUE);
        this.w = a2.b(c.a.j.Toolbar_contentInsetEndWithActions, Integer.MIN_VALUE);
        this.f506g = a2.b(c.a.j.Toolbar_collapseIcon);
        this.f507h = a2.e(c.a.j.Toolbar_collapseContentDescription);
        CharSequence e2 = a2.e(c.a.j.Toolbar_title);
        if (!TextUtils.isEmpty(e2)) {
            setTitle(e2);
        }
        CharSequence e3 = a2.e(c.a.j.Toolbar_subtitle);
        if (!TextUtils.isEmpty(e3)) {
            setSubtitle(e3);
        }
        this.f510k = getContext();
        setPopupTheme(a2.g(c.a.j.Toolbar_popupTheme, 0));
        Drawable b9 = a2.b(c.a.j.Toolbar_navigationIcon);
        if (b9 != null) {
            setNavigationIcon(b9);
        }
        CharSequence e4 = a2.e(c.a.j.Toolbar_navigationContentDescription);
        if (!TextUtils.isEmpty(e4)) {
            setNavigationContentDescription(e4);
        }
        Drawable b10 = a2.b(c.a.j.Toolbar_logo);
        if (b10 != null) {
            setLogo(b10);
        }
        CharSequence e5 = a2.e(c.a.j.Toolbar_logoDescription);
        if (!TextUtils.isEmpty(e5)) {
            setLogoDescription(e5);
        }
        if (a2.g(c.a.j.Toolbar_titleTextColor)) {
            setTitleTextColor(a2.a(c.a.j.Toolbar_titleTextColor));
        }
        if (a2.g(c.a.j.Toolbar_subtitleTextColor)) {
            setSubtitleTextColor(a2.a(c.a.j.Toolbar_subtitleTextColor));
        }
        if (a2.g(c.a.j.Toolbar_menu)) {
            a(a2.g(c.a.j.Toolbar_menu, 0));
        }
        a2.b();
    }

    private int a(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return c.h.l.j.b(marginLayoutParams) + c.h.l.j.a(marginLayoutParams);
    }

    private int a(View view, int i2) {
        e eVar = (e) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i3 = i2 > 0 ? (measuredHeight - i2) / 2 : 0;
        int c2 = c(eVar.a);
        if (c2 == 48) {
            return getPaddingTop() - i3;
        }
        if (c2 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin) - i3;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i4 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i5 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
        if (i4 < i5) {
            i4 = i5;
        } else {
            int i6 = (((height - paddingBottom) - measuredHeight) - i4) - paddingTop;
            int i7 = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
            if (i6 < i7) {
                i4 = Math.max(0, i4 - (i7 - i6));
            }
        }
        return paddingTop + i4;
    }

    private int a(View view, int i2, int i3, int i4, int i5, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i6 = marginLayoutParams.leftMargin - iArr[0];
        int i7 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i6) + Math.max(0, i7);
        iArr[0] = Math.max(0, -i6);
        iArr[1] = Math.max(0, -i7);
        view.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + max + i3, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i4, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i5, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    private int a(View view, int i2, int[] iArr, int i3) {
        e eVar = (e) view.getLayoutParams();
        int i4 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin - iArr[0];
        int max = i2 + Math.max(0, i4);
        iArr[0] = Math.max(0, -i4);
        int a2 = a(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, a2, max + measuredWidth, view.getMeasuredHeight() + a2);
        return max + measuredWidth + ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
    }

    private int a(List<View> list, int[] iArr) {
        int i2 = iArr[0];
        int i3 = iArr[1];
        int size = list.size();
        int i4 = i3;
        int i5 = i2;
        int i6 = 0;
        int i7 = 0;
        while (i6 < size) {
            View view = list.get(i6);
            e eVar = (e) view.getLayoutParams();
            int i8 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin - i5;
            int i9 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin - i4;
            int max = Math.max(0, i8);
            int max2 = Math.max(0, i9);
            int max3 = Math.max(0, -i8);
            int max4 = Math.max(0, -i9);
            i7 += max + view.getMeasuredWidth() + max2;
            i6++;
            i4 = max4;
            i5 = max3;
        }
        return i7;
    }

    private void a(View view, int i2, int i3, int i4, int i5, int i6) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i4, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i5, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i6 >= 0) {
            if (mode != 0) {
                i6 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i6);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    private void a(View view, boolean z2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        e generateDefaultLayoutParams = layoutParams == null ? generateDefaultLayoutParams() : !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (e) layoutParams;
        generateDefaultLayoutParams.f518b = 1;
        if (!z2 || this.f509j == null) {
            addView(view, generateDefaultLayoutParams);
            return;
        }
        view.setLayoutParams(generateDefaultLayoutParams);
        this.F.add(view);
    }

    private void a(List<View> list, int i2) {
        boolean z2 = b0.r(this) == 1;
        int childCount = getChildCount();
        int a2 = c.h.l.g.a(i2, b0.r(this));
        list.clear();
        if (z2) {
            for (int i3 = childCount - 1; i3 >= 0; i3--) {
                View childAt = getChildAt(i3);
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.f518b == 0 && d(childAt) && b(eVar.a) == a2) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt2 = getChildAt(i4);
            e eVar2 = (e) childAt2.getLayoutParams();
            if (eVar2.f518b == 0 && d(childAt2) && b(eVar2.a) == a2) {
                list.add(childAt2);
            }
        }
    }

    private int b(int i2) {
        int r2 = b0.r(this);
        int a2 = c.h.l.g.a(i2, r2) & 7;
        return (a2 == 1 || a2 == 3 || a2 == 5) ? a2 : r2 == 1 ? 5 : 3;
    }

    private int b(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private int b(View view, int i2, int[] iArr, int i3) {
        e eVar = (e) view.getLayoutParams();
        int i4 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin - iArr[1];
        int max = i2 - Math.max(0, i4);
        iArr[1] = Math.max(0, -i4);
        int a2 = a(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, a2, max, view.getMeasuredHeight() + a2);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) eVar).leftMargin);
    }

    private int c(int i2) {
        int i3 = i2 & 112;
        return (i3 == 16 || i3 == 48 || i3 == 80) ? i3 : this.x & 112;
    }

    private boolean c(View view) {
        return view.getParent() == this || this.F.contains(view);
    }

    private boolean d(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    private MenuInflater getMenuInflater() {
        return new c.a.o.g(getContext());
    }

    private void l() {
        if (this.u == null) {
            this.u = new o0();
        }
    }

    private void m() {
        if (this.f505f == null) {
            this.f505f = new m(getContext());
        }
    }

    private void n() {
        o();
        if (this.f501b.j() == null) {
            androidx.appcompat.view.menu.g gVar = (androidx.appcompat.view.menu.g) this.f501b.getMenu();
            if (this.L == null) {
                this.L = new d();
            }
            this.f501b.setExpandedActionViewsExclusive(true);
            gVar.a(this.L, this.f510k);
        }
    }

    private void o() {
        if (this.f501b == null) {
            this.f501b = new ActionMenuView(getContext());
            this.f501b.setPopupTheme(this.f511l);
            this.f501b.setOnMenuItemClickListener(this.I);
            this.f501b.a(this.M, this.N);
            e generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.a = 8388613 | (this.o & 112);
            this.f501b.setLayoutParams(generateDefaultLayoutParams);
            a((View) this.f501b, false);
        }
    }

    private void p() {
        if (this.f504e == null) {
            this.f504e = new AppCompatImageButton(getContext(), null, c.a.a.toolbarNavigationButtonStyle);
            e generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.a = 8388611 | (this.o & 112);
            this.f504e.setLayoutParams(generateDefaultLayoutParams);
        }
    }

    private void q() {
        removeCallbacks(this.P);
        post(this.P);
    }

    private boolean r() {
        if (!this.O) {
            return false;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (d(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        for (int size = this.F.size() - 1; size >= 0; size--) {
            addView(this.F.get(size));
        }
        this.F.clear();
    }

    public void a(int i2) {
        getMenuInflater().inflate(i2, getMenu());
    }

    public void a(int i2, int i3) {
        l();
        this.u.b(i2, i3);
    }

    public void a(Context context, int i2) {
        this.n = i2;
        TextView textView = this.f503d;
        if (textView != null) {
            textView.setTextAppearance(context, i2);
        }
    }

    public void a(androidx.appcompat.view.menu.g gVar, c cVar) {
        if (gVar != null || this.f501b != null) {
            o();
            androidx.appcompat.view.menu.g j2 = this.f501b.j();
            if (j2 != gVar) {
                if (j2 != null) {
                    j2.b(this.K);
                    j2.b(this.L);
                }
                if (this.L == null) {
                    this.L = new d();
                }
                cVar.b(true);
                if (gVar != null) {
                    gVar.a(cVar, this.f510k);
                    gVar.a(this.L, this.f510k);
                } else {
                    cVar.a(this.f510k, (androidx.appcompat.view.menu.g) null);
                    this.L.a(this.f510k, (androidx.appcompat.view.menu.g) null);
                    cVar.a(true);
                    this.L.a(true);
                }
                this.f501b.setPopupTheme(this.f511l);
                this.f501b.setPresenter(cVar);
                this.K = cVar;
            }
        }
    }

    public void a(n.a aVar, g.a aVar2) {
        this.M = aVar;
        this.N = aVar2;
        ActionMenuView actionMenuView = this.f501b;
        if (actionMenuView != null) {
            actionMenuView.a(aVar, aVar2);
        }
    }

    public void b(Context context, int i2) {
        this.f512m = i2;
        TextView textView = this.f502c;
        if (textView != null) {
            textView.setTextAppearance(context, i2);
        }
    }

    public boolean b() {
        ActionMenuView actionMenuView;
        return getVisibility() == 0 && (actionMenuView = this.f501b) != null && actionMenuView.i();
    }

    public void c() {
        d dVar = this.L;
        j jVar = dVar == null ? null : dVar.f516c;
        if (jVar != null) {
            jVar.collapseActionView();
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof e);
    }

    public void d() {
        ActionMenuView actionMenuView = this.f501b;
        if (actionMenuView != null) {
            actionMenuView.d();
        }
    }

    /* access modifiers changed from: package-private */
    public void e() {
        if (this.f508i == null) {
            this.f508i = new AppCompatImageButton(getContext(), null, c.a.a.toolbarNavigationButtonStyle);
            this.f508i.setImageDrawable(this.f506g);
            this.f508i.setContentDescription(this.f507h);
            e generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.a = 8388611 | (this.o & 112);
            generateDefaultLayoutParams.f518b = 2;
            this.f508i.setLayoutParams(generateDefaultLayoutParams);
            this.f508i.setOnClickListener(new c());
        }
    }

    public boolean f() {
        d dVar = this.L;
        return (dVar == null || dVar.f516c == null) ? false : true;
    }

    public boolean g() {
        ActionMenuView actionMenuView = this.f501b;
        return actionMenuView != null && actionMenuView.f();
    }

    /* access modifiers changed from: protected */
    public e generateDefaultLayoutParams() {
        return new e(-2, -2);
    }

    @Override // android.view.ViewGroup
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public e generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e ? new e((e) layoutParams) : layoutParams instanceof a.C0006a ? new e((a.C0006a) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new e((ViewGroup.MarginLayoutParams) layoutParams) : new e(layoutParams);
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.f508i;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.f508i;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        o0 o0Var = this.u;
        if (o0Var != null) {
            return o0Var.a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i2 = this.w;
        return i2 != Integer.MIN_VALUE ? i2 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        o0 o0Var = this.u;
        if (o0Var != null) {
            return o0Var.b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        o0 o0Var = this.u;
        if (o0Var != null) {
            return o0Var.c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        o0 o0Var = this.u;
        if (o0Var != null) {
            return o0Var.d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i2 = this.v;
        return i2 != Integer.MIN_VALUE ? i2 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        androidx.appcompat.view.menu.g j2;
        ActionMenuView actionMenuView = this.f501b;
        return actionMenuView != null && (j2 = actionMenuView.j()) != null && j2.hasVisibleItems() ? Math.max(getContentInsetEnd(), Math.max(this.w, 0)) : getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        return b0.r(this) == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return b0.r(this) == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.v, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f505f;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f505f;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        n();
        return this.f501b.getMenu();
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f504e;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f504e;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public c getOuterActionMenuPresenter() {
        return this.K;
    }

    public Drawable getOverflowIcon() {
        n();
        return this.f501b.getOverflowIcon();
    }

    /* access modifiers changed from: package-private */
    public Context getPopupContext() {
        return this.f510k;
    }

    public int getPopupTheme() {
        return this.f511l;
    }

    public CharSequence getSubtitle() {
        return this.z;
    }

    /* access modifiers changed from: package-private */
    public final TextView getSubtitleTextView() {
        return this.f503d;
    }

    public CharSequence getTitle() {
        return this.y;
    }

    public int getTitleMarginBottom() {
        return this.t;
    }

    public int getTitleMarginEnd() {
        return this.r;
    }

    public int getTitleMarginStart() {
        return this.q;
    }

    public int getTitleMarginTop() {
        return this.s;
    }

    /* access modifiers changed from: package-private */
    public final TextView getTitleTextView() {
        return this.f502c;
    }

    public c0 getWrapper() {
        if (this.J == null) {
            this.J = new x0(this, true);
        }
        return this.J;
    }

    public boolean h() {
        ActionMenuView actionMenuView = this.f501b;
        return actionMenuView != null && actionMenuView.g();
    }

    public boolean i() {
        ActionMenuView actionMenuView = this.f501b;
        return actionMenuView != null && actionMenuView.h();
    }

    /* access modifiers changed from: package-private */
    public void j() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (!(((e) childAt.getLayoutParams()).f518b == 2 || childAt == this.f501b)) {
                removeViewAt(childCount);
                this.F.add(childAt);
            }
        }
    }

    public boolean k() {
        ActionMenuView actionMenuView = this.f501b;
        return actionMenuView != null && actionMenuView.k();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.P);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.D = false;
        }
        if (!this.D) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.D = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.D = false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x029c A[LOOP:0: B:106:0x029a->B:107:0x029c, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x02be A[LOOP:1: B:109:0x02bc->B:110:0x02be, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02e9  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x02f8 A[LOOP:2: B:117:0x02f6->B:118:0x02f8, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x019e  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01af  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0222  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
        // Method dump skipped, instructions count: 781
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        char c2;
        char c3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int[] iArr = this.G;
        if (c1.a(this)) {
            c3 = 1;
            c2 = 0;
        } else {
            c3 = 0;
            c2 = 1;
        }
        if (d(this.f504e)) {
            a(this.f504e, i2, 0, i3, 0, this.p);
            i6 = this.f504e.getMeasuredWidth() + a(this.f504e);
            i5 = Math.max(0, this.f504e.getMeasuredHeight() + b(this.f504e));
            i4 = View.combineMeasuredStates(0, this.f504e.getMeasuredState());
        } else {
            i6 = 0;
            i5 = 0;
            i4 = 0;
        }
        if (d(this.f508i)) {
            a(this.f508i, i2, 0, i3, 0, this.p);
            i6 = this.f508i.getMeasuredWidth() + a(this.f508i);
            i5 = Math.max(i5, this.f508i.getMeasuredHeight() + b(this.f508i));
            i4 = View.combineMeasuredStates(i4, this.f508i.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = 0 + Math.max(currentContentInsetStart, i6);
        iArr[c3] = Math.max(0, currentContentInsetStart - i6);
        if (d(this.f501b)) {
            a(this.f501b, i2, max, i3, 0, this.p);
            i7 = this.f501b.getMeasuredWidth() + a(this.f501b);
            i5 = Math.max(i5, this.f501b.getMeasuredHeight() + b(this.f501b));
            i4 = View.combineMeasuredStates(i4, this.f501b.getMeasuredState());
        } else {
            i7 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = max + Math.max(currentContentInsetEnd, i7);
        iArr[c2] = Math.max(0, currentContentInsetEnd - i7);
        if (d(this.f509j)) {
            max2 += a(this.f509j, i2, max2, i3, 0, iArr);
            i5 = Math.max(i5, this.f509j.getMeasuredHeight() + b(this.f509j));
            i4 = View.combineMeasuredStates(i4, this.f509j.getMeasuredState());
        }
        if (d(this.f505f)) {
            max2 += a(this.f505f, i2, max2, i3, 0, iArr);
            i5 = Math.max(i5, this.f505f.getMeasuredHeight() + b(this.f505f));
            i4 = View.combineMeasuredStates(i4, this.f505f.getMeasuredState());
        }
        int childCount = getChildCount();
        int i11 = i5;
        int i12 = max2;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (((e) childAt.getLayoutParams()).f518b == 0 && d(childAt)) {
                i12 += a(childAt, i2, i12, i3, 0, iArr);
                i11 = Math.max(i11, childAt.getMeasuredHeight() + b(childAt));
                i4 = View.combineMeasuredStates(i4, childAt.getMeasuredState());
            }
        }
        int i14 = this.s + this.t;
        int i15 = this.q + this.r;
        if (d(this.f502c)) {
            a(this.f502c, i2, i12 + i15, i3, i14, iArr);
            int measuredWidth = this.f502c.getMeasuredWidth() + a(this.f502c);
            i8 = this.f502c.getMeasuredHeight() + b(this.f502c);
            i10 = View.combineMeasuredStates(i4, this.f502c.getMeasuredState());
            i9 = measuredWidth;
        } else {
            i10 = i4;
            i9 = 0;
            i8 = 0;
        }
        if (d(this.f503d)) {
            i9 = Math.max(i9, a(this.f503d, i2, i12 + i15, i3, i8 + i14, iArr));
            i8 += this.f503d.getMeasuredHeight() + b(this.f503d);
            i10 = View.combineMeasuredStates(i10, this.f503d.getMeasuredState());
        }
        int max3 = Math.max(i11, i8);
        int paddingLeft = i12 + i9 + getPaddingLeft() + getPaddingRight();
        int paddingTop = max3 + getPaddingTop() + getPaddingBottom();
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i2, -16777216 & i10);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i3, i10 << 16);
        if (r()) {
            resolveSizeAndState2 = 0;
        }
        setMeasuredDimension(resolveSizeAndState, resolveSizeAndState2);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.a());
        ActionMenuView actionMenuView = this.f501b;
        androidx.appcompat.view.menu.g j2 = actionMenuView != null ? actionMenuView.j() : null;
        int i2 = gVar.f519d;
        if (!(i2 == 0 || this.L == null || j2 == null || (findItem = j2.findItem(i2)) == null)) {
            findItem.expandActionView();
        }
        if (gVar.f520e) {
            q();
        }
    }

    public void onRtlPropertiesChanged(int i2) {
        if (Build.VERSION.SDK_INT >= 17) {
            super.onRtlPropertiesChanged(i2);
        }
        l();
        o0 o0Var = this.u;
        boolean z2 = true;
        if (i2 != 1) {
            z2 = false;
        }
        o0Var.a(z2);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        j jVar;
        g gVar = new g(super.onSaveInstanceState());
        d dVar = this.L;
        if (!(dVar == null || (jVar = dVar.f516c) == null)) {
            gVar.f519d = jVar.getItemId();
        }
        gVar.f520e = i();
        return gVar;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.C = false;
        }
        if (!this.C) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.C = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.C = false;
        }
        return true;
    }

    public void setCollapseContentDescription(int i2) {
        setCollapseContentDescription(i2 != 0 ? getContext().getText(i2) : null);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            e();
        }
        ImageButton imageButton = this.f508i;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(int i2) {
        setCollapseIcon(c.a.k.a.a.c(getContext(), i2));
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            e();
            this.f508i.setImageDrawable(drawable);
            return;
        }
        ImageButton imageButton = this.f508i;
        if (imageButton != null) {
            imageButton.setImageDrawable(this.f506g);
        }
    }

    public void setCollapsible(boolean z2) {
        this.O = z2;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i2) {
        if (i2 < 0) {
            i2 = Integer.MIN_VALUE;
        }
        if (i2 != this.w) {
            this.w = i2;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i2) {
        if (i2 < 0) {
            i2 = Integer.MIN_VALUE;
        }
        if (i2 != this.v) {
            this.v = i2;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i2) {
        setLogo(c.a.k.a.a.c(getContext(), i2));
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            m();
            if (!c(this.f505f)) {
                a((View) this.f505f, true);
            }
        } else {
            ImageView imageView = this.f505f;
            if (imageView != null && c(imageView)) {
                removeView(this.f505f);
                this.F.remove(this.f505f);
            }
        }
        ImageView imageView2 = this.f505f;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(int i2) {
        setLogoDescription(getContext().getText(i2));
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m();
        }
        ImageView imageView = this.f505f;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(int i2) {
        setNavigationContentDescription(i2 != 0 ? getContext().getText(i2) : null);
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            p();
        }
        ImageButton imageButton = this.f504e;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(int i2) {
        setNavigationIcon(c.a.k.a.a.c(getContext(), i2));
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            p();
            if (!c(this.f504e)) {
                a((View) this.f504e, true);
            }
        } else {
            ImageButton imageButton = this.f504e;
            if (imageButton != null && c(imageButton)) {
                removeView(this.f504e);
                this.F.remove(this.f504e);
            }
        }
        ImageButton imageButton2 = this.f504e;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        p();
        this.f504e.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(f fVar) {
        this.H = fVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        n();
        this.f501b.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i2) {
        if (this.f511l != i2) {
            this.f511l = i2;
            if (i2 == 0) {
                this.f510k = getContext();
            } else {
                this.f510k = new ContextThemeWrapper(getContext(), i2);
            }
        }
    }

    public void setSubtitle(int i2) {
        setSubtitle(getContext().getText(i2));
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f503d == null) {
                Context context = getContext();
                this.f503d = new y(context);
                this.f503d.setSingleLine();
                this.f503d.setEllipsize(TextUtils.TruncateAt.END);
                int i2 = this.n;
                if (i2 != 0) {
                    this.f503d.setTextAppearance(context, i2);
                }
                ColorStateList colorStateList = this.B;
                if (colorStateList != null) {
                    this.f503d.setTextColor(colorStateList);
                }
            }
            if (!c(this.f503d)) {
                a((View) this.f503d, true);
            }
        } else {
            TextView textView = this.f503d;
            if (textView != null && c(textView)) {
                removeView(this.f503d);
                this.F.remove(this.f503d);
            }
        }
        TextView textView2 = this.f503d;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.z = charSequence;
    }

    public void setSubtitleTextColor(int i2) {
        setSubtitleTextColor(ColorStateList.valueOf(i2));
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.B = colorStateList;
        TextView textView = this.f503d;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(int i2) {
        setTitle(getContext().getText(i2));
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f502c == null) {
                Context context = getContext();
                this.f502c = new y(context);
                this.f502c.setSingleLine();
                this.f502c.setEllipsize(TextUtils.TruncateAt.END);
                int i2 = this.f512m;
                if (i2 != 0) {
                    this.f502c.setTextAppearance(context, i2);
                }
                ColorStateList colorStateList = this.A;
                if (colorStateList != null) {
                    this.f502c.setTextColor(colorStateList);
                }
            }
            if (!c(this.f502c)) {
                a((View) this.f502c, true);
            }
        } else {
            TextView textView = this.f502c;
            if (textView != null && c(textView)) {
                removeView(this.f502c);
                this.F.remove(this.f502c);
            }
        }
        TextView textView2 = this.f502c;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.y = charSequence;
    }

    public void setTitleMarginBottom(int i2) {
        this.t = i2;
        requestLayout();
    }

    public void setTitleMarginEnd(int i2) {
        this.r = i2;
        requestLayout();
    }

    public void setTitleMarginStart(int i2) {
        this.q = i2;
        requestLayout();
    }

    public void setTitleMarginTop(int i2) {
        this.s = i2;
        requestLayout();
    }

    public void setTitleTextColor(int i2) {
        setTitleTextColor(ColorStateList.valueOf(i2));
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.A = colorStateList;
        TextView textView = this.f502c;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }
}
