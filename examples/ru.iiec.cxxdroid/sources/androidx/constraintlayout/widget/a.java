package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import c.f.a.m.e;

public class a extends c {

    /* renamed from: k  reason: collision with root package name */
    private int f846k;

    /* renamed from: l  reason: collision with root package name */
    private int f847l;

    /* renamed from: m  reason: collision with root package name */
    private c.f.a.m.a f848m;

    public a(Context context) {
        super(context);
        super.setVisibility(8);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001f, code lost:
        if (r7 == 6) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        if (r7 == 6) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
        if (r7 == 6) goto L_0x001c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(c.f.a.m.e r6, int r7, boolean r8) {
        /*
            r5 = this;
            r5.f847l = r7
            int r7 = android.os.Build.VERSION.SDK_INT
            r0 = 1
            r1 = 0
            r2 = 6
            r3 = 5
            r4 = 17
            if (r7 >= r4) goto L_0x0016
            int r7 = r5.f846k
            if (r7 != r3) goto L_0x0013
        L_0x0010:
            r5.f847l = r1
            goto L_0x0028
        L_0x0013:
            if (r7 != r2) goto L_0x0028
        L_0x0015:
            goto L_0x001c
        L_0x0016:
            int r7 = r5.f846k
            if (r8 == 0) goto L_0x0022
            if (r7 != r3) goto L_0x001f
        L_0x001c:
            r5.f847l = r0
            goto L_0x0028
        L_0x001f:
            if (r7 != r2) goto L_0x0028
            goto L_0x0010
        L_0x0022:
            if (r7 != r3) goto L_0x0025
            goto L_0x0010
        L_0x0025:
            if (r7 != r2) goto L_0x0028
            goto L_0x0015
        L_0x0028:
            boolean r7 = r6 instanceof c.f.a.m.a
            if (r7 == 0) goto L_0x0033
            c.f.a.m.a r6 = (c.f.a.m.a) r6
            int r7 = r5.f847l
            r6.z(r7)
        L_0x0033:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.a.a(c.f.a.m.e, int, boolean):void");
    }

    /* access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.c
    public void a(AttributeSet attributeSet) {
        super.a(attributeSet);
        this.f848m = new c.f.a.m.a();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, k.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == k.ConstraintLayout_Layout_barrierDirection) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == k.ConstraintLayout_Layout_barrierAllowsGoneWidgets) {
                    this.f848m.e(obtainStyledAttributes.getBoolean(index, true));
                } else if (index == k.ConstraintLayout_Layout_barrierMargin) {
                    this.f848m.A(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f868e = this.f848m;
        b();
    }

    @Override // androidx.constraintlayout.widget.c
    public void a(e eVar, boolean z) {
        a(eVar, this.f846k, z);
    }

    public boolean getAllowsGoneWidget() {
        return this.f848m.X();
    }

    public int getMargin() {
        return this.f848m.Z();
    }

    public int getType() {
        return this.f846k;
    }

    public void setAllowsGoneWidget(boolean z) {
        this.f848m.e(z);
    }

    public void setDpMargin(int i2) {
        c.f.a.m.a aVar = this.f848m;
        aVar.A((int) ((((float) i2) * getResources().getDisplayMetrics().density) + 0.5f));
    }

    public void setMargin(int i2) {
        this.f848m.A(i2);
    }

    public void setType(int i2) {
        this.f846k = i2;
    }
}
