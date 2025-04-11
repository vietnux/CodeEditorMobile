package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

class g {
    boolean a = true;

    /* renamed from: b  reason: collision with root package name */
    int f1705b;

    /* renamed from: c  reason: collision with root package name */
    int f1706c;

    /* renamed from: d  reason: collision with root package name */
    int f1707d;

    /* renamed from: e  reason: collision with root package name */
    int f1708e;

    /* renamed from: f  reason: collision with root package name */
    int f1709f = 0;

    /* renamed from: g  reason: collision with root package name */
    int f1710g = 0;

    /* renamed from: h  reason: collision with root package name */
    boolean f1711h;

    /* renamed from: i  reason: collision with root package name */
    boolean f1712i;

    g() {
    }

    /* access modifiers changed from: package-private */
    public View a(RecyclerView.w wVar) {
        View d2 = wVar.d(this.f1706c);
        this.f1706c += this.f1707d;
        return d2;
    }

    /* access modifiers changed from: package-private */
    public boolean a(RecyclerView.b0 b0Var) {
        int i2 = this.f1706c;
        return i2 >= 0 && i2 < b0Var.a();
    }

    public String toString() {
        return "LayoutState{mAvailable=" + this.f1705b + ", mCurrentPosition=" + this.f1706c + ", mItemDirection=" + this.f1707d + ", mLayoutDirection=" + this.f1708e + ", mStartLine=" + this.f1709f + ", mEndLine=" + this.f1710g + '}';
    }
}
