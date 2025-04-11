package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.d;
import androidx.appcompat.view.menu.q;
import c.h.l.a0;
import c.h.l.b0;

public class v extends Spinner implements a0 {

    /* renamed from: j  reason: collision with root package name */
    private static final int[] f722j = {16843505};

    /* renamed from: b  reason: collision with root package name */
    private final e f723b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f724c;

    /* renamed from: d  reason: collision with root package name */
    private g0 f725d;

    /* renamed from: e  reason: collision with root package name */
    private SpinnerAdapter f726e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f727f;

    /* renamed from: g  reason: collision with root package name */
    private g f728g;

    /* renamed from: h  reason: collision with root package name */
    int f729h;

    /* renamed from: i  reason: collision with root package name */
    final Rect f730i;

    class a extends g0 {

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ e f731k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(View view, e eVar) {
            super(view);
            this.f731k = eVar;
        }

        @Override // androidx.appcompat.widget.g0
        public q a() {
            return this.f731k;
        }

        @Override // androidx.appcompat.widget.g0
        @SuppressLint({"SyntheticAccessor"})
        public boolean b() {
            if (v.this.getInternalPopup().f()) {
                return true;
            }
            v.this.a();
            return true;
        }
    }

    class b implements ViewTreeObserver.OnGlobalLayoutListener {
        b() {
        }

        public void onGlobalLayout() {
            if (!v.this.getInternalPopup().f()) {
                v.this.a();
            }
            ViewTreeObserver viewTreeObserver = v.this.getViewTreeObserver();
            if (viewTreeObserver == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 16) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            } else {
                viewTreeObserver.removeGlobalOnLayoutListener(this);
            }
        }
    }

    class c implements g, DialogInterface.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        androidx.appcompat.app.d f734b;

        /* renamed from: c  reason: collision with root package name */
        private ListAdapter f735c;

        /* renamed from: d  reason: collision with root package name */
        private CharSequence f736d;

        c() {
        }

        @Override // androidx.appcompat.widget.v.g
        public int a() {
            return 0;
        }

        @Override // androidx.appcompat.widget.v.g
        public void a(int i2) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.v.g
        public void a(int i2, int i3) {
            if (this.f735c != null) {
                d.a aVar = new d.a(v.this.getPopupContext());
                CharSequence charSequence = this.f736d;
                if (charSequence != null) {
                    aVar.b(charSequence);
                }
                aVar.a(this.f735c, v.this.getSelectedItemPosition(), this);
                this.f734b = aVar.a();
                ListView b2 = this.f734b.b();
                if (Build.VERSION.SDK_INT >= 17) {
                    b2.setTextDirection(i2);
                    b2.setTextAlignment(i3);
                }
                this.f734b.show();
            }
        }

        @Override // androidx.appcompat.widget.v.g
        public void a(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.v.g
        public void a(ListAdapter listAdapter) {
            this.f735c = listAdapter;
        }

        @Override // androidx.appcompat.widget.v.g
        public void a(CharSequence charSequence) {
            this.f736d = charSequence;
        }

        @Override // androidx.appcompat.widget.v.g
        public Drawable b() {
            return null;
        }

        @Override // androidx.appcompat.widget.v.g
        public void b(int i2) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.v.g
        public int c() {
            return 0;
        }

        @Override // androidx.appcompat.widget.v.g
        public void c(int i2) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.v.g
        public CharSequence d() {
            return this.f736d;
        }

        @Override // androidx.appcompat.widget.v.g
        public void dismiss() {
            androidx.appcompat.app.d dVar = this.f734b;
            if (dVar != null) {
                dVar.dismiss();
                this.f734b = null;
            }
        }

        @Override // androidx.appcompat.widget.v.g
        public boolean f() {
            androidx.appcompat.app.d dVar = this.f734b;
            if (dVar != null) {
                return dVar.isShowing();
            }
            return false;
        }

        public void onClick(DialogInterface dialogInterface, int i2) {
            v.this.setSelection(i2);
            if (v.this.getOnItemClickListener() != null) {
                v.this.performItemClick(null, i2, this.f735c.getItemId(i2));
            }
            dismiss();
        }
    }

    /* access modifiers changed from: private */
    public static class d implements ListAdapter, SpinnerAdapter {

        /* renamed from: b  reason: collision with root package name */
        private SpinnerAdapter f738b;

        /* renamed from: c  reason: collision with root package name */
        private ListAdapter f739c;

        public d(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f738b = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f739c = (ListAdapter) spinnerAdapter;
            }
            if (theme == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 23 && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                    themedSpinnerAdapter.setDropDownViewTheme(theme);
                }
            } else if (spinnerAdapter instanceof s0) {
                s0 s0Var = (s0) spinnerAdapter;
                if (s0Var.getDropDownViewTheme() == null) {
                    s0Var.setDropDownViewTheme(theme);
                }
            }
        }

        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f739c;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f738b;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        public View getDropDownView(int i2, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f738b;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i2, view, viewGroup);
        }

        public Object getItem(int i2) {
            SpinnerAdapter spinnerAdapter = this.f738b;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i2);
        }

        public long getItemId(int i2) {
            SpinnerAdapter spinnerAdapter = this.f738b;
            if (spinnerAdapter == null) {
                return -1;
            }
            return spinnerAdapter.getItemId(i2);
        }

        public int getItemViewType(int i2) {
            return 0;
        }

        public View getView(int i2, View view, ViewGroup viewGroup) {
            return getDropDownView(i2, view, viewGroup);
        }

        public int getViewTypeCount() {
            return 1;
        }

        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f738b;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        public boolean isEmpty() {
            return getCount() == 0;
        }

        public boolean isEnabled(int i2) {
            ListAdapter listAdapter = this.f739c;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i2);
            }
            return true;
        }

        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f738b;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f738b;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    class e extends i0 implements g {
        private CharSequence J;
        ListAdapter K;
        private final Rect L = new Rect();
        private int M;

        class a implements AdapterView.OnItemClickListener {
            a(v vVar) {
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
                v.this.setSelection(i2);
                if (v.this.getOnItemClickListener() != null) {
                    e eVar = e.this;
                    v.this.performItemClick(view, i2, eVar.K.getItemId(i2));
                }
                e.this.dismiss();
            }
        }

        class b implements ViewTreeObserver.OnGlobalLayoutListener {
            b() {
            }

            public void onGlobalLayout() {
                e eVar = e.this;
                if (!eVar.b(v.this)) {
                    e.this.dismiss();
                    return;
                }
                e.this.m();
                e.super.e();
            }
        }

        class c implements PopupWindow.OnDismissListener {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f742b;

            c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f742b = onGlobalLayoutListener;
            }

            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = v.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f742b);
                }
            }
        }

        public e(Context context, AttributeSet attributeSet, int i2) {
            super(context, attributeSet, i2);
            a(v.this);
            a(true);
            h(0);
            a(new a(v.this));
        }

        @Override // androidx.appcompat.widget.v.g
        public void a(int i2, int i3) {
            ViewTreeObserver viewTreeObserver;
            boolean f2 = f();
            m();
            g(2);
            super.e();
            ListView g2 = g();
            g2.setChoiceMode(1);
            if (Build.VERSION.SDK_INT >= 17) {
                g2.setTextDirection(i2);
                g2.setTextAlignment(i3);
            }
            i(v.this.getSelectedItemPosition());
            if (!f2 && (viewTreeObserver = v.this.getViewTreeObserver()) != null) {
                b bVar = new b();
                viewTreeObserver.addOnGlobalLayoutListener(bVar);
                a(new c(bVar));
            }
        }

        @Override // androidx.appcompat.widget.v.g, androidx.appcompat.widget.i0
        public void a(ListAdapter listAdapter) {
            super.a(listAdapter);
            this.K = listAdapter;
        }

        @Override // androidx.appcompat.widget.v.g
        public void a(CharSequence charSequence) {
            this.J = charSequence;
        }

        @Override // androidx.appcompat.widget.v.g
        public void b(int i2) {
            this.M = i2;
        }

        /* access modifiers changed from: package-private */
        public boolean b(View view) {
            return b0.H(view) && view.getGlobalVisibleRect(this.L);
        }

        @Override // androidx.appcompat.widget.v.g
        public CharSequence d() {
            return this.J;
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x008d  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x009a  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void m() {
            /*
            // Method dump skipped, instructions count: 164
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.v.e.m():void");
        }

        public int n() {
            return this.M;
        }
    }

    /* access modifiers changed from: package-private */
    public static class f extends View.BaseSavedState {
        public static final Parcelable.Creator<f> CREATOR = new a();

        /* renamed from: b  reason: collision with root package name */
        boolean f744b;

        class a implements Parcelable.Creator<f> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            public f createFromParcel(Parcel parcel) {
                return new f(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public f[] newArray(int i2) {
                return new f[i2];
            }
        }

        f(Parcel parcel) {
            super(parcel);
            this.f744b = parcel.readByte() != 0;
        }

        f(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeByte(this.f744b ? (byte) 1 : 0);
        }
    }

    /* access modifiers changed from: package-private */
    public interface g {
        int a();

        void a(int i2);

        void a(int i2, int i3);

        void a(Drawable drawable);

        void a(ListAdapter listAdapter);

        void a(CharSequence charSequence);

        Drawable b();

        void b(int i2);

        int c();

        void c(int i2);

        CharSequence d();

        void dismiss();

        boolean f();
    }

    public v(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c.a.a.spinnerStyle);
    }

    public v(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, -1);
    }

    public v(Context context, AttributeSet attributeSet, int i2, int i3) {
        this(context, attributeSet, i2, i3, null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004d, code lost:
        if (r11 != null) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004f, code lost:
        r11.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0061, code lost:
        if (r11 != null) goto L_0x004f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x003d A[SYNTHETIC, Splitter:B:10:0x003d] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00db  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public v(android.content.Context r7, android.util.AttributeSet r8, int r9, int r10, android.content.res.Resources.Theme r11) {
        /*
        // Method dump skipped, instructions count: 230
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.v.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }

    /* access modifiers changed from: package-private */
    public int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i2 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i3 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i2) {
                view = null;
                i2 = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i3 = Math.max(i3, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i3;
        }
        drawable.getPadding(this.f730i);
        Rect rect = this.f730i;
        return i3 + rect.left + rect.right;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        if (Build.VERSION.SDK_INT >= 17) {
            this.f728g.a(getTextDirection(), getTextAlignment());
        } else {
            this.f728g.a(-1, -1);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f723b;
        if (eVar != null) {
            eVar.a();
        }
    }

    public int getDropDownHorizontalOffset() {
        g gVar = this.f728g;
        if (gVar != null) {
            return gVar.a();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownHorizontalOffset();
        }
        return 0;
    }

    public int getDropDownVerticalOffset() {
        g gVar = this.f728g;
        if (gVar != null) {
            return gVar.c();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownVerticalOffset();
        }
        return 0;
    }

    public int getDropDownWidth() {
        if (this.f728g != null) {
            return this.f729h;
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownWidth();
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    public final g getInternalPopup() {
        return this.f728g;
    }

    public Drawable getPopupBackground() {
        g gVar = this.f728g;
        if (gVar != null) {
            return gVar.b();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getPopupBackground();
        }
        return null;
    }

    public Context getPopupContext() {
        return this.f724c;
    }

    public CharSequence getPrompt() {
        g gVar = this.f728g;
        return gVar != null ? gVar.d() : super.getPrompt();
    }

    @Override // c.h.l.a0
    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f723b;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    @Override // c.h.l.a0
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f723b;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g gVar = this.f728g;
        if (gVar != null && gVar.f()) {
            this.f728g.dismiss();
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.f728g != null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i2)), getMeasuredHeight());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        f fVar = (f) parcelable;
        super.onRestoreInstanceState(fVar.getSuperState());
        if (fVar.f744b && (viewTreeObserver = getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new b());
        }
    }

    public Parcelable onSaveInstanceState() {
        f fVar = new f(super.onSaveInstanceState());
        g gVar = this.f728g;
        fVar.f744b = gVar != null && gVar.f();
        return fVar;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        g0 g0Var = this.f725d;
        if (g0Var == null || !g0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public boolean performClick() {
        g gVar = this.f728g;
        if (gVar == null) {
            return super.performClick();
        }
        if (gVar.f()) {
            return true;
        }
        a();
        return true;
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f727f) {
            this.f726e = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f728g != null) {
            Context context = this.f724c;
            if (context == null) {
                context = getContext();
            }
            this.f728g.a(new d(spinnerAdapter, context.getTheme()));
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f723b;
        if (eVar != null) {
            eVar.a(drawable);
        }
    }

    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        e eVar = this.f723b;
        if (eVar != null) {
            eVar.a(i2);
        }
    }

    public void setDropDownHorizontalOffset(int i2) {
        g gVar = this.f728g;
        if (gVar != null) {
            gVar.b(i2);
            this.f728g.c(i2);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownHorizontalOffset(i2);
        }
    }

    public void setDropDownVerticalOffset(int i2) {
        g gVar = this.f728g;
        if (gVar != null) {
            gVar.a(i2);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownVerticalOffset(i2);
        }
    }

    public void setDropDownWidth(int i2) {
        if (this.f728g != null) {
            this.f729h = i2;
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownWidth(i2);
        }
    }

    public void setPopupBackgroundDrawable(Drawable drawable) {
        g gVar = this.f728g;
        if (gVar != null) {
            gVar.a(drawable);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    public void setPopupBackgroundResource(int i2) {
        setPopupBackgroundDrawable(c.a.k.a.a.c(getPopupContext(), i2));
    }

    public void setPrompt(CharSequence charSequence) {
        g gVar = this.f728g;
        if (gVar != null) {
            gVar.a(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    @Override // c.h.l.a0
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f723b;
        if (eVar != null) {
            eVar.b(colorStateList);
        }
    }

    @Override // c.h.l.a0
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f723b;
        if (eVar != null) {
            eVar.a(mode);
        }
    }
}
