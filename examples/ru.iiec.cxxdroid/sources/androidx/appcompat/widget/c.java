package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.view.menu.o;
import androidx.appcompat.view.menu.q;
import androidx.appcompat.view.menu.s;
import androidx.appcompat.widget.ActionMenuView;
import c.h.l.d;
import java.util.ArrayList;

/* access modifiers changed from: package-private */
public class c extends androidx.appcompat.view.menu.b implements d.a {
    RunnableC0011c A;
    private b B;
    final f C = new f();
    int D;

    /* renamed from: k  reason: collision with root package name */
    d f545k;

    /* renamed from: l  reason: collision with root package name */
    private Drawable f546l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f547m;
    private boolean n;
    private boolean o;
    private int p;
    private int q;
    private int r;
    private boolean s;
    private boolean t;
    private boolean u;
    private boolean v;
    private int w;
    private final SparseBooleanArray x = new SparseBooleanArray();
    e y;
    a z;

    /* access modifiers changed from: private */
    public class a extends m {
        public a(Context context, s sVar, View view) {
            super(context, sVar, view, false, c.a.a.actionOverflowMenuStyle);
            if (!((j) sVar.getItem()).h()) {
                View view2 = c.this.f545k;
                a(view2 == null ? (View) ((androidx.appcompat.view.menu.b) c.this).f309i : view2);
            }
            a(c.this.C);
        }

        /* access modifiers changed from: protected */
        @Override // androidx.appcompat.view.menu.m
        public void d() {
            c cVar = c.this;
            cVar.z = null;
            cVar.D = 0;
            super.d();
        }
    }

    private class b extends ActionMenuItemView.b {
        b() {
        }

        @Override // androidx.appcompat.view.menu.ActionMenuItemView.b
        public q a() {
            a aVar = c.this.z;
            if (aVar != null) {
                return aVar.b();
            }
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.c$c  reason: collision with other inner class name */
    public class RunnableC0011c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        private e f549b;

        public RunnableC0011c(e eVar) {
            this.f549b = eVar;
        }

        public void run() {
            if (((androidx.appcompat.view.menu.b) c.this).f304d != null) {
                ((androidx.appcompat.view.menu.b) c.this).f304d.a();
            }
            View view = (View) ((androidx.appcompat.view.menu.b) c.this).f309i;
            if (!(view == null || view.getWindowToken() == null || !this.f549b.f())) {
                c.this.y = this.f549b;
            }
            c.this.A = null;
        }
    }

    /* access modifiers changed from: private */
    public class d extends m implements ActionMenuView.a {

        class a extends g0 {
            a(View view, c cVar) {
                super(view);
            }

            @Override // androidx.appcompat.widget.g0
            public q a() {
                e eVar = c.this.y;
                if (eVar == null) {
                    return null;
                }
                return eVar.b();
            }

            @Override // androidx.appcompat.widget.g0
            public boolean b() {
                c.this.j();
                return true;
            }

            @Override // androidx.appcompat.widget.g0
            public boolean c() {
                c cVar = c.this;
                if (cVar.A != null) {
                    return false;
                }
                cVar.f();
                return true;
            }
        }

        public d(Context context) {
            super(context, null, c.a.a.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            y0.a(this, getContentDescription());
            setOnTouchListener(new a(this, c.this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean b() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean c() {
            return false;
        }

        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            c.this.j();
            return true;
        }

        /* access modifiers changed from: protected */
        public boolean setFrame(int i2, int i3, int i4, int i5) {
            boolean frame = super.setFrame(i2, i3, i4, i5);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (!(drawable == null || background == null)) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                androidx.core.graphics.drawable.a.a(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    /* access modifiers changed from: private */
    public class e extends m {
        public e(Context context, androidx.appcompat.view.menu.g gVar, View view, boolean z) {
            super(context, gVar, view, z, c.a.a.actionOverflowMenuStyle);
            a(8388613);
            a(c.this.C);
        }

        /* access modifiers changed from: protected */
        @Override // androidx.appcompat.view.menu.m
        public void d() {
            if (((androidx.appcompat.view.menu.b) c.this).f304d != null) {
                ((androidx.appcompat.view.menu.b) c.this).f304d.close();
            }
            c.this.y = null;
            super.d();
        }
    }

    private class f implements n.a {
        f() {
        }

        @Override // androidx.appcompat.view.menu.n.a
        public void a(androidx.appcompat.view.menu.g gVar, boolean z) {
            if (gVar instanceof s) {
                gVar.m().a(false);
            }
            n.a c2 = c.this.c();
            if (c2 != null) {
                c2.a(gVar, z);
            }
        }

        @Override // androidx.appcompat.view.menu.n.a
        public boolean a(androidx.appcompat.view.menu.g gVar) {
            if (gVar == ((androidx.appcompat.view.menu.b) c.this).f304d) {
                return false;
            }
            c.this.D = ((s) gVar).getItem().getItemId();
            n.a c2 = c.this.c();
            if (c2 != null) {
                return c2.a(gVar);
            }
            return false;
        }
    }

    /* access modifiers changed from: private */
    @SuppressLint({"BanParcelableUsage"})
    public static class g implements Parcelable {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* renamed from: b  reason: collision with root package name */
        public int f555b;

        class a implements Parcelable.Creator<g> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            public g createFromParcel(Parcel parcel) {
                return new g(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public g[] newArray(int i2) {
                return new g[i2];
            }
        }

        g() {
        }

        g(Parcel parcel) {
            this.f555b = parcel.readInt();
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeInt(this.f555b);
        }
    }

    public c(Context context) {
        super(context, c.a.g.abc_action_menu_layout, c.a.g.abc_action_menu_item_layout);
    }

    private View a(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f309i;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if ((childAt instanceof o.a) && ((o.a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    @Override // androidx.appcompat.view.menu.b
    public View a(j jVar, View view, ViewGroup viewGroup) {
        View actionView = jVar.getActionView();
        if (actionView == null || jVar.f()) {
            actionView = super.a(jVar, view, viewGroup);
        }
        actionView.setVisibility(jVar.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    @Override // androidx.appcompat.view.menu.n, androidx.appcompat.view.menu.b
    public void a(Context context, androidx.appcompat.view.menu.g gVar) {
        super.a(context, gVar);
        Resources resources = context.getResources();
        c.a.o.a a2 = c.a.o.a.a(context);
        if (!this.o) {
            this.n = a2.g();
        }
        if (!this.u) {
            this.p = a2.b();
        }
        if (!this.s) {
            this.r = a2.c();
        }
        int i2 = this.p;
        if (this.n) {
            if (this.f545k == null) {
                this.f545k = new d(this.f302b);
                if (this.f547m) {
                    this.f545k.setImageDrawable(this.f546l);
                    this.f546l = null;
                    this.f547m = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f545k.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i2 -= this.f545k.getMeasuredWidth();
        } else {
            this.f545k = null;
        }
        this.q = i2;
        this.w = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    public void a(Configuration configuration) {
        if (!this.s) {
            this.r = c.a.o.a.a(this.f303c).c();
        }
        androidx.appcompat.view.menu.g gVar = this.f304d;
        if (gVar != null) {
            gVar.b(true);
        }
    }

    public void a(Drawable drawable) {
        d dVar = this.f545k;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
            return;
        }
        this.f547m = true;
        this.f546l = drawable;
    }

    @Override // androidx.appcompat.view.menu.n
    public void a(Parcelable parcelable) {
        int i2;
        MenuItem findItem;
        if ((parcelable instanceof g) && (i2 = ((g) parcelable).f555b) > 0 && (findItem = this.f304d.findItem(i2)) != null) {
            a((s) findItem.getSubMenu());
        }
    }

    @Override // androidx.appcompat.view.menu.n, androidx.appcompat.view.menu.b
    public void a(androidx.appcompat.view.menu.g gVar, boolean z2) {
        d();
        super.a(gVar, z2);
    }

    @Override // androidx.appcompat.view.menu.b
    public void a(j jVar, o.a aVar) {
        aVar.a(jVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f309i);
        if (this.B == null) {
            this.B = new b();
        }
        actionMenuItemView.setPopupCallback(this.B);
    }

    public void a(ActionMenuView actionMenuView) {
        this.f309i = actionMenuView;
        actionMenuView.a(this.f304d);
    }

    @Override // androidx.appcompat.view.menu.n, androidx.appcompat.view.menu.b
    public void a(boolean z2) {
        o oVar;
        super.a(z2);
        ((View) this.f309i).requestLayout();
        androidx.appcompat.view.menu.g gVar = this.f304d;
        boolean z3 = false;
        if (gVar != null) {
            ArrayList<j> c2 = gVar.c();
            int size = c2.size();
            for (int i2 = 0; i2 < size; i2++) {
                c.h.l.d a2 = c2.get(i2).a();
                if (a2 != null) {
                    a2.a(this);
                }
            }
        }
        androidx.appcompat.view.menu.g gVar2 = this.f304d;
        ArrayList<j> j2 = gVar2 != null ? gVar2.j() : null;
        if (this.n && j2 != null) {
            int size2 = j2.size();
            if (size2 == 1) {
                z3 = !j2.get(0).isActionViewExpanded();
            } else if (size2 > 0) {
                z3 = true;
            }
        }
        d dVar = this.f545k;
        if (z3) {
            if (dVar == null) {
                this.f545k = new d(this.f302b);
            }
            ViewGroup viewGroup = (ViewGroup) this.f545k.getParent();
            if (viewGroup != this.f309i) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f545k);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f309i;
                actionMenuView.addView(this.f545k, actionMenuView.e());
            }
        } else if (dVar != null && dVar.getParent() == (oVar = this.f309i)) {
            ((ViewGroup) oVar).removeView(this.f545k);
        }
        ((ActionMenuView) this.f309i).setOverflowReserved(this.n);
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean a() {
        int i2;
        ArrayList<j> arrayList;
        int i3;
        int i4;
        int i5;
        c cVar = this;
        androidx.appcompat.view.menu.g gVar = cVar.f304d;
        View view = null;
        int i6 = 0;
        if (gVar != null) {
            arrayList = gVar.n();
            i2 = arrayList.size();
        } else {
            arrayList = null;
            i2 = 0;
        }
        int i7 = cVar.r;
        int i8 = cVar.q;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) cVar.f309i;
        int i9 = i7;
        boolean z2 = false;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < i2; i12++) {
            j jVar = arrayList.get(i12);
            if (jVar.k()) {
                i10++;
            } else if (jVar.j()) {
                i11++;
            } else {
                z2 = true;
            }
            if (cVar.v && jVar.isActionViewExpanded()) {
                i9 = 0;
            }
        }
        if (cVar.n && (z2 || i11 + i10 > i9)) {
            i9--;
        }
        int i13 = i9 - i10;
        SparseBooleanArray sparseBooleanArray = cVar.x;
        sparseBooleanArray.clear();
        if (cVar.t) {
            int i14 = cVar.w;
            i3 = i8 / i14;
            i4 = i14 + ((i8 % i14) / i3);
        } else {
            i4 = 0;
            i3 = 0;
        }
        int i15 = i8;
        int i16 = 0;
        int i17 = 0;
        while (i16 < i2) {
            j jVar2 = arrayList.get(i16);
            if (jVar2.k()) {
                View a2 = cVar.a(jVar2, view, viewGroup);
                if (cVar.t) {
                    i3 -= ActionMenuView.a(a2, i4, i3, makeMeasureSpec, i6);
                } else {
                    a2.measure(makeMeasureSpec, makeMeasureSpec);
                }
                int measuredWidth = a2.getMeasuredWidth();
                i15 -= measuredWidth;
                if (i17 != 0) {
                    measuredWidth = i17;
                }
                int groupId = jVar2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                jVar2.d(true);
                i17 = measuredWidth;
                i5 = i2;
            } else if (jVar2.j()) {
                int groupId2 = jVar2.getGroupId();
                boolean z3 = sparseBooleanArray.get(groupId2);
                boolean z4 = (i13 > 0 || z3) && i15 > 0 && (!cVar.t || i3 > 0);
                boolean z5 = z4;
                i5 = i2;
                if (z4) {
                    View a3 = cVar.a(jVar2, null, viewGroup);
                    if (cVar.t) {
                        int a4 = ActionMenuView.a(a3, i4, i3, makeMeasureSpec, 0);
                        i3 -= a4;
                        z5 = a4 == 0 ? false : z5;
                    } else {
                        a3.measure(makeMeasureSpec, makeMeasureSpec);
                    }
                    int measuredWidth2 = a3.getMeasuredWidth();
                    i15 -= measuredWidth2;
                    if (i17 == 0) {
                        i17 = measuredWidth2;
                    }
                    z4 = z5 & (!cVar.t ? i15 + i17 > 0 : i15 >= 0);
                }
                if (z4 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z3) {
                    sparseBooleanArray.put(groupId2, false);
                    for (int i18 = 0; i18 < i16; i18++) {
                        j jVar3 = arrayList.get(i18);
                        if (jVar3.getGroupId() == groupId2) {
                            if (jVar3.h()) {
                                i13++;
                            }
                            jVar3.d(false);
                        }
                    }
                }
                if (z4) {
                    i13--;
                }
                jVar2.d(z4);
            } else {
                i5 = i2;
                jVar2.d(false);
                i16++;
                i2 = i5;
                view = null;
                i6 = 0;
                cVar = this;
            }
            i16++;
            i2 = i5;
            view = null;
            i6 = 0;
            cVar = this;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.b
    public boolean a(int i2, j jVar) {
        return jVar.h();
    }

    @Override // androidx.appcompat.view.menu.b
    public boolean a(ViewGroup viewGroup, int i2) {
        if (viewGroup.getChildAt(i2) == this.f545k) {
            return false;
        }
        return super.a(viewGroup, i2);
    }

    @Override // androidx.appcompat.view.menu.n, androidx.appcompat.view.menu.b
    public boolean a(s sVar) {
        boolean z2 = false;
        if (!sVar.hasVisibleItems()) {
            return false;
        }
        s sVar2 = sVar;
        while (sVar2.t() != this.f304d) {
            sVar2 = (s) sVar2.t();
        }
        View a2 = a(sVar2.getItem());
        if (a2 == null) {
            return false;
        }
        this.D = sVar.getItem().getItemId();
        int size = sVar.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            MenuItem item = sVar.getItem(i2);
            if (item.isVisible() && item.getIcon() != null) {
                z2 = true;
                break;
            }
            i2++;
        }
        this.z = new a(this.f303c, sVar, a2);
        this.z.a(z2);
        this.z.e();
        super.a(sVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.n
    public Parcelable b() {
        g gVar = new g();
        gVar.f555b = this.D;
        return gVar;
    }

    @Override // androidx.appcompat.view.menu.b
    public o b(ViewGroup viewGroup) {
        o oVar = this.f309i;
        o b2 = super.b(viewGroup);
        if (oVar != b2) {
            ((ActionMenuView) b2).setPresenter(this);
        }
        return b2;
    }

    public void b(boolean z2) {
        this.v = z2;
    }

    public void c(boolean z2) {
        this.n = z2;
        this.o = true;
    }

    public boolean d() {
        return f() | g();
    }

    public Drawable e() {
        d dVar = this.f545k;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (this.f547m) {
            return this.f546l;
        }
        return null;
    }

    public boolean f() {
        o oVar;
        RunnableC0011c cVar = this.A;
        if (cVar == null || (oVar = this.f309i) == null) {
            e eVar = this.y;
            if (eVar == null) {
                return false;
            }
            eVar.a();
            return true;
        }
        ((View) oVar).removeCallbacks(cVar);
        this.A = null;
        return true;
    }

    public boolean g() {
        a aVar = this.z;
        if (aVar == null) {
            return false;
        }
        aVar.a();
        return true;
    }

    public boolean h() {
        return this.A != null || i();
    }

    public boolean i() {
        e eVar = this.y;
        return eVar != null && eVar.c();
    }

    public boolean j() {
        androidx.appcompat.view.menu.g gVar;
        if (!this.n || i() || (gVar = this.f304d) == null || this.f309i == null || this.A != null || gVar.j().isEmpty()) {
            return false;
        }
        this.A = new RunnableC0011c(new e(this.f303c, this.f304d, this.f545k, true));
        ((View) this.f309i).post(this.A);
        return true;
    }
}
