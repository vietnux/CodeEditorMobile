package c.t;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import c.h.l.b0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

public class o {
    private static m a = new b();

    /* renamed from: b  reason: collision with root package name */
    private static ThreadLocal<WeakReference<c.e.a<ViewGroup, ArrayList<m>>>> f2609b = new ThreadLocal<>();

    /* renamed from: c  reason: collision with root package name */
    static ArrayList<ViewGroup> f2610c = new ArrayList<>();

    /* access modifiers changed from: private */
    public static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* renamed from: b  reason: collision with root package name */
        m f2611b;

        /* renamed from: c  reason: collision with root package name */
        ViewGroup f2612c;

        /* renamed from: c.t.o$a$a  reason: collision with other inner class name */
        class C0064a extends n {
            final /* synthetic */ c.e.a a;

            C0064a(c.e.a aVar) {
                this.a = aVar;
            }

            @Override // c.t.m.f
            public void d(m mVar) {
                ((ArrayList) this.a.get(a.this.f2612c)).remove(mVar);
            }
        }

        a(m mVar, ViewGroup viewGroup) {
            this.f2611b = mVar;
            this.f2612c = viewGroup;
        }

        private void a() {
            this.f2612c.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f2612c.removeOnAttachStateChangeListener(this);
        }

        public boolean onPreDraw() {
            a();
            if (!o.f2610c.remove(this.f2612c)) {
                return true;
            }
            c.e.a<ViewGroup, ArrayList<m>> a = o.a();
            ArrayList<m> arrayList = a.get(this.f2612c);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                a.put(this.f2612c, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.f2611b);
            this.f2611b.a(new C0064a(a));
            this.f2611b.a(this.f2612c, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((m) it.next()).e(this.f2612c);
                }
            }
            this.f2611b.a(this.f2612c);
            return true;
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            a();
            o.f2610c.remove(this.f2612c);
            ArrayList<m> arrayList = o.a().get(this.f2612c);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator<m> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().e(this.f2612c);
                }
            }
            this.f2611b.a(true);
        }
    }

    static c.e.a<ViewGroup, ArrayList<m>> a() {
        c.e.a<ViewGroup, ArrayList<m>> aVar;
        WeakReference<c.e.a<ViewGroup, ArrayList<m>>> weakReference = f2609b.get();
        if (weakReference != null && (aVar = weakReference.get()) != null) {
            return aVar;
        }
        c.e.a<ViewGroup, ArrayList<m>> aVar2 = new c.e.a<>();
        f2609b.set(new WeakReference<>(aVar2));
        return aVar2;
    }

    public static void a(ViewGroup viewGroup, m mVar) {
        if (!f2610c.contains(viewGroup) && b0.I(viewGroup)) {
            f2610c.add(viewGroup);
            if (mVar == null) {
                mVar = a;
            }
            m clone = mVar.clone();
            c(viewGroup, clone);
            l.a(viewGroup, null);
            b(viewGroup, clone);
        }
    }

    private static void b(ViewGroup viewGroup, m mVar) {
        if (mVar != null && viewGroup != null) {
            a aVar = new a(mVar, viewGroup);
            viewGroup.addOnAttachStateChangeListener(aVar);
            viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
        }
    }

    private static void c(ViewGroup viewGroup, m mVar) {
        ArrayList<m> arrayList = a().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<m> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().c(viewGroup);
            }
        }
        if (mVar != null) {
            mVar.a(viewGroup, true);
        }
        l a2 = l.a(viewGroup);
        if (a2 != null) {
            a2.a();
        }
    }
}
