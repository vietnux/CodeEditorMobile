package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import c.h.l.b0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class c extends l {
    private static TimeInterpolator s;

    /* renamed from: h  reason: collision with root package name */
    private ArrayList<RecyclerView.e0> f1640h = new ArrayList<>();

    /* renamed from: i  reason: collision with root package name */
    private ArrayList<RecyclerView.e0> f1641i = new ArrayList<>();

    /* renamed from: j  reason: collision with root package name */
    private ArrayList<j> f1642j = new ArrayList<>();

    /* renamed from: k  reason: collision with root package name */
    private ArrayList<i> f1643k = new ArrayList<>();

    /* renamed from: l  reason: collision with root package name */
    ArrayList<ArrayList<RecyclerView.e0>> f1644l = new ArrayList<>();

    /* renamed from: m  reason: collision with root package name */
    ArrayList<ArrayList<j>> f1645m = new ArrayList<>();
    ArrayList<ArrayList<i>> n = new ArrayList<>();
    ArrayList<RecyclerView.e0> o = new ArrayList<>();
    ArrayList<RecyclerView.e0> p = new ArrayList<>();
    ArrayList<RecyclerView.e0> q = new ArrayList<>();
    ArrayList<RecyclerView.e0> r = new ArrayList<>();

    class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ArrayList f1646b;

        a(ArrayList arrayList) {
            this.f1646b = arrayList;
        }

        public void run() {
            Iterator it = this.f1646b.iterator();
            while (it.hasNext()) {
                j jVar = (j) it.next();
                c.this.b(jVar.a, jVar.f1674b, jVar.f1675c, jVar.f1676d, jVar.f1677e);
            }
            this.f1646b.clear();
            c.this.f1645m.remove(this.f1646b);
        }
    }

    class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ArrayList f1648b;

        b(ArrayList arrayList) {
            this.f1648b = arrayList;
        }

        public void run() {
            Iterator it = this.f1648b.iterator();
            while (it.hasNext()) {
                c.this.a((i) it.next());
            }
            this.f1648b.clear();
            c.this.n.remove(this.f1648b);
        }
    }

    /* renamed from: androidx.recyclerview.widget.c$c  reason: collision with other inner class name */
    class RunnableC0025c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ArrayList f1650b;

        RunnableC0025c(ArrayList arrayList) {
            this.f1650b = arrayList;
        }

        public void run() {
            Iterator it = this.f1650b.iterator();
            while (it.hasNext()) {
                c.this.t((RecyclerView.e0) it.next());
            }
            this.f1650b.clear();
            c.this.f1644l.remove(this.f1650b);
        }
    }

    /* access modifiers changed from: package-private */
    public class d extends AnimatorListenerAdapter {
        final /* synthetic */ RecyclerView.e0 a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f1652b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f1653c;

        d(RecyclerView.e0 e0Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.a = e0Var;
            this.f1652b = viewPropertyAnimator;
            this.f1653c = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.f1652b.setListener(null);
            this.f1653c.setAlpha(1.0f);
            c.this.l(this.a);
            c.this.q.remove(this.a);
            c.this.j();
        }

        public void onAnimationStart(Animator animator) {
            c.this.m(this.a);
        }
    }

    /* access modifiers changed from: package-private */
    public class e extends AnimatorListenerAdapter {
        final /* synthetic */ RecyclerView.e0 a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f1655b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f1656c;

        e(RecyclerView.e0 e0Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.a = e0Var;
            this.f1655b = view;
            this.f1656c = viewPropertyAnimator;
        }

        public void onAnimationCancel(Animator animator) {
            this.f1655b.setAlpha(1.0f);
        }

        public void onAnimationEnd(Animator animator) {
            this.f1656c.setListener(null);
            c.this.h(this.a);
            c.this.o.remove(this.a);
            c.this.j();
        }

        public void onAnimationStart(Animator animator) {
            c.this.i(this.a);
        }
    }

    /* access modifiers changed from: package-private */
    public class f extends AnimatorListenerAdapter {
        final /* synthetic */ RecyclerView.e0 a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f1658b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f1659c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f1660d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f1661e;

        f(RecyclerView.e0 e0Var, int i2, View view, int i3, ViewPropertyAnimator viewPropertyAnimator) {
            this.a = e0Var;
            this.f1658b = i2;
            this.f1659c = view;
            this.f1660d = i3;
            this.f1661e = viewPropertyAnimator;
        }

        public void onAnimationCancel(Animator animator) {
            if (this.f1658b != 0) {
                this.f1659c.setTranslationX(0.0f);
            }
            if (this.f1660d != 0) {
                this.f1659c.setTranslationY(0.0f);
            }
        }

        public void onAnimationEnd(Animator animator) {
            this.f1661e.setListener(null);
            c.this.j(this.a);
            c.this.p.remove(this.a);
            c.this.j();
        }

        public void onAnimationStart(Animator animator) {
            c.this.k(this.a);
        }
    }

    /* access modifiers changed from: package-private */
    public class g extends AnimatorListenerAdapter {
        final /* synthetic */ i a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f1663b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f1664c;

        g(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.a = iVar;
            this.f1663b = viewPropertyAnimator;
            this.f1664c = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.f1663b.setListener(null);
            this.f1664c.setAlpha(1.0f);
            this.f1664c.setTranslationX(0.0f);
            this.f1664c.setTranslationY(0.0f);
            c.this.a(this.a.a, true);
            c.this.r.remove(this.a.a);
            c.this.j();
        }

        public void onAnimationStart(Animator animator) {
            c.this.b(this.a.a, true);
        }
    }

    /* access modifiers changed from: package-private */
    public class h extends AnimatorListenerAdapter {
        final /* synthetic */ i a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f1666b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f1667c;

        h(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.a = iVar;
            this.f1666b = viewPropertyAnimator;
            this.f1667c = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.f1666b.setListener(null);
            this.f1667c.setAlpha(1.0f);
            this.f1667c.setTranslationX(0.0f);
            this.f1667c.setTranslationY(0.0f);
            c.this.a(this.a.f1669b, false);
            c.this.r.remove(this.a.f1669b);
            c.this.j();
        }

        public void onAnimationStart(Animator animator) {
            c.this.b(this.a.f1669b, false);
        }
    }

    /* access modifiers changed from: private */
    public static class i {
        public RecyclerView.e0 a;

        /* renamed from: b  reason: collision with root package name */
        public RecyclerView.e0 f1669b;

        /* renamed from: c  reason: collision with root package name */
        public int f1670c;

        /* renamed from: d  reason: collision with root package name */
        public int f1671d;

        /* renamed from: e  reason: collision with root package name */
        public int f1672e;

        /* renamed from: f  reason: collision with root package name */
        public int f1673f;

        private i(RecyclerView.e0 e0Var, RecyclerView.e0 e0Var2) {
            this.a = e0Var;
            this.f1669b = e0Var2;
        }

        i(RecyclerView.e0 e0Var, RecyclerView.e0 e0Var2, int i2, int i3, int i4, int i5) {
            this(e0Var, e0Var2);
            this.f1670c = i2;
            this.f1671d = i3;
            this.f1672e = i4;
            this.f1673f = i5;
        }

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.a + ", newHolder=" + this.f1669b + ", fromX=" + this.f1670c + ", fromY=" + this.f1671d + ", toX=" + this.f1672e + ", toY=" + this.f1673f + '}';
        }
    }

    /* access modifiers changed from: private */
    public static class j {
        public RecyclerView.e0 a;

        /* renamed from: b  reason: collision with root package name */
        public int f1674b;

        /* renamed from: c  reason: collision with root package name */
        public int f1675c;

        /* renamed from: d  reason: collision with root package name */
        public int f1676d;

        /* renamed from: e  reason: collision with root package name */
        public int f1677e;

        j(RecyclerView.e0 e0Var, int i2, int i3, int i4, int i5) {
            this.a = e0Var;
            this.f1674b = i2;
            this.f1675c = i3;
            this.f1676d = i4;
            this.f1677e = i5;
        }
    }

    private void a(List<i> list, RecyclerView.e0 e0Var) {
        for (int size = list.size() - 1; size >= 0; size--) {
            i iVar = list.get(size);
            if (a(iVar, e0Var) && iVar.a == null && iVar.f1669b == null) {
                list.remove(iVar);
            }
        }
    }

    private boolean a(i iVar, RecyclerView.e0 e0Var) {
        boolean z = false;
        if (iVar.f1669b == e0Var) {
            iVar.f1669b = null;
        } else if (iVar.a != e0Var) {
            return false;
        } else {
            iVar.a = null;
            z = true;
        }
        e0Var.a.setAlpha(1.0f);
        e0Var.a.setTranslationX(0.0f);
        e0Var.a.setTranslationY(0.0f);
        a(e0Var, z);
        return true;
    }

    private void b(i iVar) {
        RecyclerView.e0 e0Var = iVar.a;
        if (e0Var != null) {
            a(iVar, e0Var);
        }
        RecyclerView.e0 e0Var2 = iVar.f1669b;
        if (e0Var2 != null) {
            a(iVar, e0Var2);
        }
    }

    private void u(RecyclerView.e0 e0Var) {
        View view = e0Var.a;
        ViewPropertyAnimator animate = view.animate();
        this.q.add(e0Var);
        animate.setDuration(f()).alpha(0.0f).setListener(new d(e0Var, animate, view)).start();
    }

    private void v(RecyclerView.e0 e0Var) {
        if (s == null) {
            s = new ValueAnimator().getInterpolator();
        }
        e0Var.a.animate().setInterpolator(s);
        c(e0Var);
    }

    /* access modifiers changed from: package-private */
    public void a(i iVar) {
        RecyclerView.e0 e0Var = iVar.a;
        View view = null;
        View view2 = e0Var == null ? null : e0Var.a;
        RecyclerView.e0 e0Var2 = iVar.f1669b;
        if (e0Var2 != null) {
            view = e0Var2.a;
        }
        if (view2 != null) {
            ViewPropertyAnimator duration = view2.animate().setDuration(d());
            this.r.add(iVar.a);
            duration.translationX((float) (iVar.f1672e - iVar.f1670c));
            duration.translationY((float) (iVar.f1673f - iVar.f1671d));
            duration.alpha(0.0f).setListener(new g(iVar, duration, view2)).start();
        }
        if (view != null) {
            ViewPropertyAnimator animate = view.animate();
            this.r.add(iVar.f1669b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(d()).alpha(1.0f).setListener(new h(iVar, animate, view)).start();
        }
    }

    /* access modifiers changed from: package-private */
    public void a(List<RecyclerView.e0> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).a.animate().cancel();
        }
    }

    @Override // androidx.recyclerview.widget.l
    public boolean a(RecyclerView.e0 e0Var, int i2, int i3, int i4, int i5) {
        View view = e0Var.a;
        int translationX = i2 + ((int) view.getTranslationX());
        int translationY = i3 + ((int) e0Var.a.getTranslationY());
        v(e0Var);
        int i6 = i4 - translationX;
        int i7 = i5 - translationY;
        if (i6 == 0 && i7 == 0) {
            j(e0Var);
            return false;
        }
        if (i6 != 0) {
            view.setTranslationX((float) (-i6));
        }
        if (i7 != 0) {
            view.setTranslationY((float) (-i7));
        }
        this.f1642j.add(new j(e0Var, translationX, translationY, i4, i5));
        return true;
    }

    @Override // androidx.recyclerview.widget.l
    public boolean a(RecyclerView.e0 e0Var, RecyclerView.e0 e0Var2, int i2, int i3, int i4, int i5) {
        if (e0Var == e0Var2) {
            return a(e0Var, i2, i3, i4, i5);
        }
        float translationX = e0Var.a.getTranslationX();
        float translationY = e0Var.a.getTranslationY();
        float alpha = e0Var.a.getAlpha();
        v(e0Var);
        int i6 = (int) (((float) (i4 - i2)) - translationX);
        int i7 = (int) (((float) (i5 - i3)) - translationY);
        e0Var.a.setTranslationX(translationX);
        e0Var.a.setTranslationY(translationY);
        e0Var.a.setAlpha(alpha);
        if (e0Var2 != null) {
            v(e0Var2);
            e0Var2.a.setTranslationX((float) (-i6));
            e0Var2.a.setTranslationY((float) (-i7));
            e0Var2.a.setAlpha(0.0f);
        }
        this.f1643k.add(new i(e0Var, e0Var2, i2, i3, i4, i5));
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean a(RecyclerView.e0 e0Var, List<Object> list) {
        return !list.isEmpty() || super.a(e0Var, list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void b() {
        int size = this.f1642j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            j jVar = this.f1642j.get(size);
            View view = jVar.a.a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            j(jVar.a);
            this.f1642j.remove(size);
        }
        for (int size2 = this.f1640h.size() - 1; size2 >= 0; size2--) {
            l(this.f1640h.get(size2));
            this.f1640h.remove(size2);
        }
        int size3 = this.f1641i.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.e0 e0Var = this.f1641i.get(size3);
            e0Var.a.setAlpha(1.0f);
            h(e0Var);
            this.f1641i.remove(size3);
        }
        for (int size4 = this.f1643k.size() - 1; size4 >= 0; size4--) {
            b(this.f1643k.get(size4));
        }
        this.f1643k.clear();
        if (g()) {
            for (int size5 = this.f1645m.size() - 1; size5 >= 0; size5--) {
                ArrayList<j> arrayList = this.f1645m.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    j jVar2 = arrayList.get(size6);
                    View view2 = jVar2.a.a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    j(jVar2.a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f1645m.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.f1644l.size() - 1; size7 >= 0; size7--) {
                ArrayList<RecyclerView.e0> arrayList2 = this.f1644l.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.e0 e0Var2 = arrayList2.get(size8);
                    e0Var2.a.setAlpha(1.0f);
                    h(e0Var2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f1644l.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.n.size() - 1; size9 >= 0; size9--) {
                ArrayList<i> arrayList3 = this.n.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    b(arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.n.remove(arrayList3);
                    }
                }
            }
            a(this.q);
            a(this.p);
            a(this.o);
            a(this.r);
            a();
        }
    }

    /* access modifiers changed from: package-private */
    public void b(RecyclerView.e0 e0Var, int i2, int i3, int i4, int i5) {
        View view = e0Var.a;
        int i6 = i4 - i2;
        int i7 = i5 - i3;
        if (i6 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i7 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator animate = view.animate();
        this.p.add(e0Var);
        animate.setDuration(e()).setListener(new f(e0Var, i6, view, i7, animate)).start();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void c(RecyclerView.e0 e0Var) {
        View view = e0Var.a;
        view.animate().cancel();
        int size = this.f1642j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (this.f1642j.get(size).a == e0Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                j(e0Var);
                this.f1642j.remove(size);
            }
        }
        a(this.f1643k, e0Var);
        if (this.f1640h.remove(e0Var)) {
            view.setAlpha(1.0f);
            l(e0Var);
        }
        if (this.f1641i.remove(e0Var)) {
            view.setAlpha(1.0f);
            h(e0Var);
        }
        for (int size2 = this.n.size() - 1; size2 >= 0; size2--) {
            ArrayList<i> arrayList = this.n.get(size2);
            a(arrayList, e0Var);
            if (arrayList.isEmpty()) {
                this.n.remove(size2);
            }
        }
        for (int size3 = this.f1645m.size() - 1; size3 >= 0; size3--) {
            ArrayList<j> arrayList2 = this.f1645m.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (arrayList2.get(size4).a == e0Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    j(e0Var);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f1645m.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.f1644l.size() - 1; size5 >= 0; size5--) {
            ArrayList<RecyclerView.e0> arrayList3 = this.f1644l.get(size5);
            if (arrayList3.remove(e0Var)) {
                view.setAlpha(1.0f);
                h(e0Var);
                if (arrayList3.isEmpty()) {
                    this.f1644l.remove(size5);
                }
            }
        }
        this.q.remove(e0Var);
        this.o.remove(e0Var);
        this.r.remove(e0Var);
        this.p.remove(e0Var);
        j();
    }

    @Override // androidx.recyclerview.widget.l
    public boolean f(RecyclerView.e0 e0Var) {
        v(e0Var);
        e0Var.a.setAlpha(0.0f);
        this.f1641i.add(e0Var);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean g() {
        return !this.f1641i.isEmpty() || !this.f1643k.isEmpty() || !this.f1642j.isEmpty() || !this.f1640h.isEmpty() || !this.p.isEmpty() || !this.q.isEmpty() || !this.o.isEmpty() || !this.r.isEmpty() || !this.f1645m.isEmpty() || !this.f1644l.isEmpty() || !this.n.isEmpty();
    }

    @Override // androidx.recyclerview.widget.l
    public boolean g(RecyclerView.e0 e0Var) {
        v(e0Var);
        this.f1640h.add(e0Var);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void i() {
        boolean z = !this.f1640h.isEmpty();
        boolean z2 = !this.f1642j.isEmpty();
        boolean z3 = !this.f1643k.isEmpty();
        boolean z4 = !this.f1641i.isEmpty();
        if (z || z2 || z4 || z3) {
            Iterator<RecyclerView.e0> it = this.f1640h.iterator();
            while (it.hasNext()) {
                u(it.next());
            }
            this.f1640h.clear();
            if (z2) {
                ArrayList<j> arrayList = new ArrayList<>();
                arrayList.addAll(this.f1642j);
                this.f1645m.add(arrayList);
                this.f1642j.clear();
                a aVar = new a(arrayList);
                if (z) {
                    b0.a(arrayList.get(0).a.a, aVar, f());
                } else {
                    aVar.run();
                }
            }
            if (z3) {
                ArrayList<i> arrayList2 = new ArrayList<>();
                arrayList2.addAll(this.f1643k);
                this.n.add(arrayList2);
                this.f1643k.clear();
                b bVar = new b(arrayList2);
                if (z) {
                    b0.a(arrayList2.get(0).a.a, bVar, f());
                } else {
                    bVar.run();
                }
            }
            if (z4) {
                ArrayList<RecyclerView.e0> arrayList3 = new ArrayList<>();
                arrayList3.addAll(this.f1641i);
                this.f1644l.add(arrayList3);
                this.f1641i.clear();
                RunnableC0025c cVar = new RunnableC0025c(arrayList3);
                if (z || z2 || z3) {
                    long j2 = 0;
                    long f2 = z ? f() : 0;
                    long e2 = z2 ? e() : 0;
                    if (z3) {
                        j2 = d();
                    }
                    b0.a(arrayList3.get(0).a, cVar, f2 + Math.max(e2, j2));
                    return;
                }
                cVar.run();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void j() {
        if (!g()) {
            a();
        }
    }

    /* access modifiers changed from: package-private */
    public void t(RecyclerView.e0 e0Var) {
        View view = e0Var.a;
        ViewPropertyAnimator animate = view.animate();
        this.o.add(e0Var);
        animate.alpha(1.0f).setDuration(c()).setListener(new e(e0Var, view, animate)).start();
    }
}
