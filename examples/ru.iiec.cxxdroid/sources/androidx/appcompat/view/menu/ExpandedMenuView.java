package androidx.appcompat.view.menu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.widget.w0;

public final class ExpandedMenuView extends ListView implements g.b, o, AdapterView.OnItemClickListener {

    /* renamed from: d  reason: collision with root package name */
    private static final int[] f275d = {16842964, 16843049};

    /* renamed from: b  reason: collision with root package name */
    private g f276b;

    /* renamed from: c  reason: collision with root package name */
    private int f277c;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842868);
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        w0 a = w0.a(context, attributeSet, f275d, i2, 0);
        if (a.g(0)) {
            setBackgroundDrawable(a.b(0));
        }
        if (a.g(1)) {
            setDivider(a.b(1));
        }
        a.b();
    }

    @Override // androidx.appcompat.view.menu.o
    public void a(g gVar) {
        this.f276b = gVar;
    }

    @Override // androidx.appcompat.view.menu.g.b
    public boolean a(j jVar) {
        return this.f276b.a(jVar, 0);
    }

    public int getWindowAnimations() {
        return this.f277c;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
        a((j) getAdapter().getItem(i2));
    }
}
