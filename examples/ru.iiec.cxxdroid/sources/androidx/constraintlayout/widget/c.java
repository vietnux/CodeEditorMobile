package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import c.f.a.m.e;
import c.f.a.m.h;
import java.util.Arrays;
import java.util.HashMap;

public abstract class c extends View {

    /* renamed from: b  reason: collision with root package name */
    protected int[] f865b = new int[32];

    /* renamed from: c  reason: collision with root package name */
    protected int f866c;

    /* renamed from: d  reason: collision with root package name */
    protected Context f867d;

    /* renamed from: e  reason: collision with root package name */
    protected h f868e;

    /* renamed from: f  reason: collision with root package name */
    protected boolean f869f = false;

    /* renamed from: g  reason: collision with root package name */
    protected String f870g;

    /* renamed from: h  reason: collision with root package name */
    protected String f871h;

    /* renamed from: i  reason: collision with root package name */
    private View[] f872i = null;

    /* renamed from: j  reason: collision with root package name */
    protected HashMap<Integer, String> f873j = new HashMap<>();

    public c(Context context) {
        super(context);
        this.f867d = context;
        a((AttributeSet) null);
    }

    private int a(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        if (str == null || constraintLayout == null || (resources = this.f867d.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = constraintLayout.getChildAt(i2);
            if (childAt.getId() != -1) {
                String str2 = null;
                try {
                    str2 = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                }
                if (str.equals(str2)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    private void a(int i2) {
        if (i2 != getId()) {
            int i3 = this.f866c + 1;
            int[] iArr = this.f865b;
            if (i3 > iArr.length) {
                this.f865b = Arrays.copyOf(iArr, iArr.length * 2);
            }
            int[] iArr2 = this.f865b;
            int i4 = this.f866c;
            iArr2[i4] = i2;
            this.f866c = i4 + 1;
        }
    }

    private void a(String str) {
        if (str != null && str.length() != 0 && this.f867d != null) {
            String trim = str.trim();
            if (getParent() instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) getParent();
            }
            int c2 = c(trim);
            if (c2 != 0) {
                this.f873j.put(Integer.valueOf(c2), trim);
                a(c2);
                return;
            }
            Log.w("ConstraintHelper", "Could not find id of \"" + trim + "\"");
        }
    }

    private void b(String str) {
        if (!(str == null || str.length() == 0 || this.f867d == null)) {
            String trim = str.trim();
            ConstraintLayout constraintLayout = null;
            if (getParent() instanceof ConstraintLayout) {
                constraintLayout = (ConstraintLayout) getParent();
            }
            if (constraintLayout == null) {
                Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
                return;
            }
            int childCount = constraintLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = constraintLayout.getChildAt(i2);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if ((layoutParams instanceof ConstraintLayout.b) && trim.equals(((ConstraintLayout.b) layoutParams).Z)) {
                    if (childAt.getId() == -1) {
                        Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                    } else {
                        a(childAt.getId());
                    }
                }
            }
        }
    }

    private int c(String str) {
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int i2 = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object a = constraintLayout.a(0, str);
            if (a instanceof Integer) {
                i2 = ((Integer) a).intValue();
            }
        }
        if (i2 == 0 && constraintLayout != null) {
            i2 = a(constraintLayout, str);
        }
        if (i2 == 0) {
            try {
                i2 = j.class.getField(str).getInt(null);
            } catch (Exception unused) {
            }
        }
        return i2 == 0 ? this.f867d.getResources().getIdentifier(str, "id", this.f867d.getPackageName()) : i2;
    }

    /* access modifiers changed from: protected */
    public void a() {
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof ConstraintLayout)) {
            a((ConstraintLayout) parent);
        }
    }

    /* access modifiers changed from: protected */
    public void a(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, k.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == k.ConstraintLayout_Layout_constraint_referenced_ids) {
                    this.f870g = obtainStyledAttributes.getString(index);
                    setIds(this.f870g);
                } else if (index == k.ConstraintLayout_Layout_constraint_referenced_tags) {
                    this.f871h = obtainStyledAttributes.getString(index);
                    setReferenceTags(this.f871h);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* access modifiers changed from: protected */
    public void a(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = Build.VERSION.SDK_INT >= 21 ? getElevation() : 0.0f;
        for (int i2 = 0; i2 < this.f866c; i2++) {
            View a = constraintLayout.a(this.f865b[i2]);
            if (a != null) {
                a.setVisibility(visibility);
                if (elevation > 0.0f && Build.VERSION.SDK_INT >= 21) {
                    a.setTranslationZ(a.getTranslationZ() + elevation);
                }
            }
        }
    }

    public void a(e eVar, boolean z) {
    }

    public void b() {
        if (this.f868e != null) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams instanceof ConstraintLayout.b) {
                ((ConstraintLayout.b) layoutParams).s0 = (e) this.f868e;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void b(ConstraintLayout constraintLayout) {
    }

    /* access modifiers changed from: protected */
    public View[] c(ConstraintLayout constraintLayout) {
        View[] viewArr = this.f872i;
        if (viewArr == null || viewArr.length != this.f866c) {
            this.f872i = new View[this.f866c];
        }
        for (int i2 = 0; i2 < this.f866c; i2++) {
            this.f872i[i2] = constraintLayout.a(this.f865b[i2]);
        }
        return this.f872i;
    }

    public void d(ConstraintLayout constraintLayout) {
    }

    public void e(ConstraintLayout constraintLayout) {
    }

    public void f(ConstraintLayout constraintLayout) {
    }

    public void g(ConstraintLayout constraintLayout) {
        String str;
        int a;
        if (isInEditMode()) {
            setIds(this.f870g);
        }
        h hVar = this.f868e;
        if (hVar != null) {
            hVar.a();
            for (int i2 = 0; i2 < this.f866c; i2++) {
                int i3 = this.f865b[i2];
                View a2 = constraintLayout.a(i3);
                if (a2 == null && (a = a(constraintLayout, (str = this.f873j.get(Integer.valueOf(i3))))) != 0) {
                    this.f865b[i2] = a;
                    this.f873j.put(Integer.valueOf(a), str);
                    a2 = constraintLayout.a(a);
                }
                if (a2 != null) {
                    this.f868e.a(constraintLayout.a(a2));
                }
            }
            this.f868e.a(constraintLayout.f817d);
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f865b, this.f866c);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f870g;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f871h;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    public void onDraw(Canvas canvas) {
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        if (this.f869f) {
            super.onMeasure(i2, i3);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    /* access modifiers changed from: protected */
    public void setIds(String str) {
        this.f870g = str;
        if (str != null) {
            int i2 = 0;
            this.f866c = 0;
            while (true) {
                int indexOf = str.indexOf(44, i2);
                if (indexOf == -1) {
                    a(str.substring(i2));
                    return;
                } else {
                    a(str.substring(i2, indexOf));
                    i2 = indexOf + 1;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void setReferenceTags(String str) {
        this.f871h = str;
        if (str != null) {
            int i2 = 0;
            this.f866c = 0;
            while (true) {
                int indexOf = str.indexOf(44, i2);
                if (indexOf == -1) {
                    b(str.substring(i2));
                    return;
                } else {
                    b(str.substring(i2, indexOf));
                    i2 = indexOf + 1;
                }
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f870g = null;
        this.f866c = 0;
        for (int i2 : iArr) {
            a(i2);
        }
    }

    public void setTag(int i2, Object obj) {
        super.setTag(i2, obj);
        if (obj == null && this.f870g == null) {
            a(i2);
        }
    }
}
