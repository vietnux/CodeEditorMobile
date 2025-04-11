package e.f.a.a.d;

import android.content.Context;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import e.f.a.a.c.a;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class a {
    protected e.f.a.a.c.a a;

    /* renamed from: b  reason: collision with root package name */
    private Context f8295b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f8296c;

    /* renamed from: d  reason: collision with root package name */
    private int f8297d = 0;

    /* renamed from: e  reason: collision with root package name */
    private Class<? extends a.AbstractC0120a> f8298e = e.f.a.a.b.a.class;

    /* renamed from: f  reason: collision with root package name */
    private a.b f8299f;

    /* renamed from: g  reason: collision with root package name */
    private a.c f8300g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f8301h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f8302i = false;

    /* renamed from: j  reason: collision with root package name */
    private boolean f8303j = false;

    /* renamed from: k  reason: collision with root package name */
    private boolean f8304k = true;

    /* access modifiers changed from: package-private */
    /* renamed from: e.f.a.a.d.a$a  reason: collision with other inner class name */
    public class C0121a extends a.AbstractC0120a {
        final /* synthetic */ LinearLayout a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0121a(a aVar, Context context, LinearLayout linearLayout) {
            super(context);
            this.a = linearLayout;
        }

        @Override // e.f.a.a.c.a.AbstractC0120a
        public View createNodeView(e.f.a.a.c.a aVar, Object obj) {
            return null;
        }

        @Override // e.f.a.a.c.a.AbstractC0120a
        public ViewGroup getNodeItemsView() {
            return this.a;
        }
    }

    /* access modifiers changed from: package-private */
    public class b implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e.f.a.a.c.a f8305b;

        b(e.f.a.a.c.a aVar) {
            this.f8305b = aVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:9:0x002f  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onClick(android.view.View r3) {
            /*
                r2 = this;
                e.f.a.a.c.a r3 = r2.f8305b
                e.f.a.a.c.a$b r3 = r3.b()
                if (r3 == 0) goto L_0x0018
                e.f.a.a.c.a r3 = r2.f8305b
                e.f.a.a.c.a$b r3 = r3.b()
            L_0x000e:
                e.f.a.a.c.a r0 = r2.f8305b
                java.lang.Object r1 = r0.g()
                r3.a(r0, r1)
                goto L_0x0027
            L_0x0018:
                e.f.a.a.d.a r3 = e.f.a.a.d.a.this
                e.f.a.a.c.a$b r3 = e.f.a.a.d.a.a(r3)
                if (r3 == 0) goto L_0x0027
                e.f.a.a.d.a r3 = e.f.a.a.d.a.this
                e.f.a.a.c.a$b r3 = e.f.a.a.d.a.a(r3)
                goto L_0x000e
            L_0x0027:
                e.f.a.a.d.a r3 = e.f.a.a.d.a.this
                boolean r3 = e.f.a.a.d.a.b(r3)
                if (r3 == 0) goto L_0x0036
                e.f.a.a.d.a r3 = e.f.a.a.d.a.this
                e.f.a.a.c.a r0 = r2.f8305b
                r3.b(r0)
            L_0x0036:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: e.f.a.a.d.a.b.onClick(android.view.View):void");
        }
    }

    /* access modifiers changed from: package-private */
    public class c implements View.OnLongClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e.f.a.a.c.a f8307b;

        c(e.f.a.a.c.a aVar) {
            this.f8307b = aVar;
        }

        public boolean onLongClick(View view) {
            a.c cVar;
            if (this.f8307b.e() != null) {
                cVar = this.f8307b.e();
            } else if (a.this.f8300g != null) {
                cVar = a.this.f8300g;
            } else if (!a.this.f8304k) {
                return false;
            } else {
                a.this.b(this.f8307b);
                return false;
            }
            e.f.a.a.c.a aVar = this.f8307b;
            return cVar.a(aVar, aVar.g());
        }
    }

    /* access modifiers changed from: package-private */
    public static class d extends Animation {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f8309b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f8310c;

        d(View view, int i2) {
            this.f8309b = view;
            this.f8310c = i2;
        }

        /* access modifiers changed from: protected */
        public void applyTransformation(float f2, Transformation transformation) {
            this.f8309b.getLayoutParams().height = f2 == 1.0f ? -2 : (int) (((float) this.f8310c) * f2);
            this.f8309b.requestLayout();
        }

        public boolean willChangeBounds() {
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public static class e extends Animation {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f8311b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f8312c;

        e(View view, int i2) {
            this.f8311b = view;
            this.f8312c = i2;
        }

        /* access modifiers changed from: protected */
        public void applyTransformation(float f2, Transformation transformation) {
            if (f2 == 1.0f) {
                this.f8311b.setVisibility(8);
                return;
            }
            ViewGroup.LayoutParams layoutParams = this.f8311b.getLayoutParams();
            int i2 = this.f8312c;
            layoutParams.height = i2 - ((int) (((float) i2) * f2));
            this.f8311b.requestLayout();
        }

        public boolean willChangeBounds() {
            return true;
        }
    }

    public a(Context context, e.f.a.a.c.a aVar) {
        this.a = aVar;
        this.f8295b = context;
    }

    private static void a(View view) {
        int measuredHeight = view.getMeasuredHeight();
        e eVar = new e(view, measuredHeight);
        eVar.setDuration((long) ((int) (((float) measuredHeight) / view.getContext().getResources().getDisplayMetrics().density)));
        view.startAnimation(eVar);
    }

    private void a(ViewGroup viewGroup, e.f.a.a.c.a aVar) {
        a.AbstractC0120a c2 = c(aVar);
        View view = c2.getView();
        viewGroup.addView(view);
        boolean z = this.f8301h;
        if (z) {
            c2.toggleSelectionMode(z);
        }
        view.setOnClickListener(new b(aVar));
        view.setOnLongClickListener(new c(aVar));
    }

    private void a(e.f.a.a.c.a aVar, Set<String> set) {
        for (e.f.a.a.c.a aVar2 : aVar.a()) {
            if (set.contains(aVar2.f())) {
                a(aVar2);
                a(aVar2, set);
            }
        }
    }

    private void a(e.f.a.a.c.a aVar, boolean z) {
        aVar.a(false);
        a.AbstractC0120a c2 = c(aVar);
        if (this.f8302i) {
            a(c2.getNodeItemsView());
        } else {
            c2.getNodeItemsView().setVisibility(8);
        }
        c2.toggle(false);
        if (z) {
            for (e.f.a.a.c.a aVar2 : aVar.a()) {
                a(aVar2, z);
            }
        }
    }

    private static void b(View view) {
        view.measure(-1, -2);
        int measuredHeight = view.getMeasuredHeight();
        view.getLayoutParams().height = 0;
        view.setVisibility(0);
        d dVar = new d(view, measuredHeight);
        dVar.setDuration((long) ((int) (((float) measuredHeight) / view.getContext().getResources().getDisplayMetrics().density)));
        view.startAnimation(dVar);
    }

    private void b(e.f.a.a.c.a aVar, boolean z) {
        aVar.a(true);
        a.AbstractC0120a c2 = c(aVar);
        c2.getNodeItemsView().removeAllViews();
        c2.toggle(true);
        for (e.f.a.a.c.a aVar2 : aVar.a()) {
            a(c2.getNodeItemsView(), aVar2);
            if (aVar2.i() || z) {
                b(aVar2, z);
            }
        }
        if (this.f8302i) {
            b(c2.getNodeItemsView());
        } else {
            c2.getNodeItemsView().setVisibility(0);
        }
    }

    private a.AbstractC0120a c(e.f.a.a.c.a aVar) {
        a.AbstractC0120a h2 = aVar.h();
        if (h2 == null) {
            try {
                h2 = (a.AbstractC0120a) this.f8298e.getConstructor(Context.class).newInstance(this.f8295b);
                aVar.a(h2);
            } catch (Exception unused) {
                throw new RuntimeException("Could not instantiate class " + this.f8298e);
            }
        }
        if (h2.getContainerStyle() <= 0) {
            h2.setContainerStyle(this.f8297d);
        }
        if (h2.getTreeView() == null) {
            h2.setTreeViev(this);
        }
        return h2;
    }

    public View a(int i2) {
        ViewGroup viewGroup;
        if (i2 > 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(this.f8295b, i2);
            viewGroup = this.f8303j ? new c(contextThemeWrapper) : new ScrollView(contextThemeWrapper);
        } else {
            viewGroup = this.f8303j ? new c(this.f8295b) : new ScrollView(this.f8295b);
        }
        Context context = this.f8295b;
        int i3 = this.f8297d;
        if (i3 != 0 && this.f8296c) {
            context = new ContextThemeWrapper(context, i3);
        }
        LinearLayout linearLayout = new LinearLayout(context, null, this.f8297d);
        linearLayout.setId(e.f.a.a.a.tree_items);
        linearLayout.setOrientation(1);
        viewGroup.addView(linearLayout);
        this.a.a(new C0121a(this, this.f8295b, linearLayout));
        b(this.a, false);
        return viewGroup;
    }

    public void a() {
        for (e.f.a.a.c.a aVar : this.a.a()) {
            a(aVar, true);
        }
    }

    public void a(int i2, boolean z) {
        this.f8297d = i2;
        this.f8296c = z;
    }

    public void a(a.b bVar) {
        this.f8299f = bVar;
    }

    public void a(e.f.a.a.c.a aVar) {
        b(aVar, false);
    }

    public void a(Class<? extends a.AbstractC0120a> cls) {
        this.f8298e = cls;
    }

    public void a(String str) {
        if (!TextUtils.isEmpty(str)) {
            a();
            a(this.a, new HashSet(Arrays.asList(str.split(";"))));
        }
    }

    public void a(boolean z) {
        this.f8302i = z;
    }

    public View b() {
        return a(-1);
    }

    public void b(int i2) {
        a(i2, false);
    }

    public void b(e.f.a.a.c.a aVar) {
        if (aVar.i()) {
            a(aVar, false);
        } else {
            b(aVar, false);
        }
    }
}
