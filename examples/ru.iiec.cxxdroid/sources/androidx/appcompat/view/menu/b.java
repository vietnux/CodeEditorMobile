package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.view.menu.o;
import java.util.ArrayList;

public abstract class b implements n {

    /* renamed from: b  reason: collision with root package name */
    protected Context f302b;

    /* renamed from: c  reason: collision with root package name */
    protected Context f303c;

    /* renamed from: d  reason: collision with root package name */
    protected g f304d;

    /* renamed from: e  reason: collision with root package name */
    protected LayoutInflater f305e;

    /* renamed from: f  reason: collision with root package name */
    private n.a f306f;

    /* renamed from: g  reason: collision with root package name */
    private int f307g;

    /* renamed from: h  reason: collision with root package name */
    private int f308h;

    /* renamed from: i  reason: collision with root package name */
    protected o f309i;

    /* renamed from: j  reason: collision with root package name */
    private int f310j;

    public b(Context context, int i2, int i3) {
        this.f302b = context;
        this.f305e = LayoutInflater.from(context);
        this.f307g = i2;
        this.f308h = i3;
    }

    public View a(j jVar, View view, ViewGroup viewGroup) {
        o.a a = view instanceof o.a ? (o.a) view : a(viewGroup);
        a(jVar, a);
        return (View) a;
    }

    public o.a a(ViewGroup viewGroup) {
        return (o.a) this.f305e.inflate(this.f308h, viewGroup, false);
    }

    public void a(int i2) {
        this.f310j = i2;
    }

    @Override // androidx.appcompat.view.menu.n
    public void a(Context context, g gVar) {
        this.f303c = context;
        LayoutInflater.from(this.f303c);
        this.f304d = gVar;
    }

    /* access modifiers changed from: protected */
    public void a(View view, int i2) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f309i).addView(view, i2);
    }

    @Override // androidx.appcompat.view.menu.n
    public void a(g gVar, boolean z) {
        n.a aVar = this.f306f;
        if (aVar != null) {
            aVar.a(gVar, z);
        }
    }

    public abstract void a(j jVar, o.a aVar);

    @Override // androidx.appcompat.view.menu.n
    public void a(n.a aVar) {
        this.f306f = aVar;
    }

    @Override // androidx.appcompat.view.menu.n
    public void a(boolean z) {
        ViewGroup viewGroup = (ViewGroup) this.f309i;
        if (viewGroup != null) {
            g gVar = this.f304d;
            int i2 = 0;
            if (gVar != null) {
                gVar.b();
                ArrayList<j> n = this.f304d.n();
                int size = n.size();
                int i3 = 0;
                for (int i4 = 0; i4 < size; i4++) {
                    j jVar = n.get(i4);
                    if (a(i3, jVar)) {
                        View childAt = viewGroup.getChildAt(i3);
                        j itemData = childAt instanceof o.a ? ((o.a) childAt).getItemData() : null;
                        View a = a(jVar, childAt, viewGroup);
                        if (jVar != itemData) {
                            a.setPressed(false);
                            a.jumpDrawablesToCurrentState();
                        }
                        if (a != childAt) {
                            a(a, i3);
                        }
                        i3++;
                    }
                }
                i2 = i3;
            }
            while (i2 < viewGroup.getChildCount()) {
                if (!a(viewGroup, i2)) {
                    i2++;
                }
            }
        }
    }

    public abstract boolean a(int i2, j jVar);

    /* access modifiers changed from: protected */
    public boolean a(ViewGroup viewGroup, int i2) {
        viewGroup.removeViewAt(i2);
        return true;
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean a(g gVar, j jVar) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.appcompat.view.menu.g] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // androidx.appcompat.view.menu.n
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(androidx.appcompat.view.menu.s r2) {
        /*
            r1 = this;
            androidx.appcompat.view.menu.n$a r0 = r1.f306f
            if (r0 == 0) goto L_0x000e
            if (r2 == 0) goto L_0x0007
            goto L_0x0009
        L_0x0007:
            androidx.appcompat.view.menu.g r2 = r1.f304d
        L_0x0009:
            boolean r2 = r0.a(r2)
            return r2
        L_0x000e:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.b.a(androidx.appcompat.view.menu.s):boolean");
    }

    public o b(ViewGroup viewGroup) {
        if (this.f309i == null) {
            this.f309i = (o) this.f305e.inflate(this.f307g, viewGroup, false);
            this.f309i.a(this.f304d);
            a(true);
        }
        return this.f309i;
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean b(g gVar, j jVar) {
        return false;
    }

    public n.a c() {
        return this.f306f;
    }

    @Override // androidx.appcompat.view.menu.n
    public int getId() {
        return this.f310j;
    }
}
