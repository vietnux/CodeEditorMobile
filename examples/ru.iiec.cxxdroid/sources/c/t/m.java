package c.t;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import c.h.l.b0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class m implements Cloneable {
    private static final int[] H = {2, 1, 3, 4};
    private static final g I = new a();
    private static ThreadLocal<c.e.a<Animator, d>> J = new ThreadLocal<>();
    private boolean A = false;
    private ArrayList<f> B = null;
    private ArrayList<Animator> C = new ArrayList<>();
    p D;
    private e E;
    private c.e.a<String, String> F;
    private g G = I;

    /* renamed from: b  reason: collision with root package name */
    private String f2592b = getClass().getName();

    /* renamed from: c  reason: collision with root package name */
    private long f2593c = -1;

    /* renamed from: d  reason: collision with root package name */
    long f2594d = -1;

    /* renamed from: e  reason: collision with root package name */
    private TimeInterpolator f2595e = null;

    /* renamed from: f  reason: collision with root package name */
    ArrayList<Integer> f2596f = new ArrayList<>();

    /* renamed from: g  reason: collision with root package name */
    ArrayList<View> f2597g = new ArrayList<>();

    /* renamed from: h  reason: collision with root package name */
    private ArrayList<String> f2598h = null;

    /* renamed from: i  reason: collision with root package name */
    private ArrayList<Class> f2599i = null;

    /* renamed from: j  reason: collision with root package name */
    private ArrayList<Integer> f2600j = null;

    /* renamed from: k  reason: collision with root package name */
    private ArrayList<View> f2601k = null;

    /* renamed from: l  reason: collision with root package name */
    private ArrayList<Class> f2602l = null;

    /* renamed from: m  reason: collision with root package name */
    private ArrayList<String> f2603m = null;
    private ArrayList<Integer> n = null;
    private ArrayList<View> o = null;
    private ArrayList<Class> p = null;
    private t q = new t();
    private t r = new t();
    q s = null;
    private int[] t = H;
    private ArrayList<s> u;
    private ArrayList<s> v;
    boolean w = false;
    ArrayList<Animator> x = new ArrayList<>();
    private int y = 0;
    private boolean z = false;

    static class a extends g {
        a() {
        }

        @Override // c.t.g
        public Path a(float f2, float f3, float f4, float f5) {
            Path path = new Path();
            path.moveTo(f2, f3);
            path.lineTo(f4, f5);
            return path;
        }
    }

    /* access modifiers changed from: package-private */
    public class b extends AnimatorListenerAdapter {
        final /* synthetic */ c.e.a a;

        b(c.e.a aVar) {
            this.a = aVar;
        }

        public void onAnimationEnd(Animator animator) {
            this.a.remove(animator);
            m.this.x.remove(animator);
        }

        public void onAnimationStart(Animator animator) {
            m.this.x.add(animator);
        }
    }

    /* access modifiers changed from: package-private */
    public class c extends AnimatorListenerAdapter {
        c() {
        }

        public void onAnimationEnd(Animator animator) {
            m.this.a();
            animator.removeListener(this);
        }
    }

    /* access modifiers changed from: private */
    public static class d {
        View a;

        /* renamed from: b  reason: collision with root package name */
        String f2605b;

        /* renamed from: c  reason: collision with root package name */
        s f2606c;

        /* renamed from: d  reason: collision with root package name */
        l0 f2607d;

        /* renamed from: e  reason: collision with root package name */
        m f2608e;

        d(View view, String str, m mVar, l0 l0Var, s sVar) {
            this.a = view;
            this.f2605b = str;
            this.f2606c = sVar;
            this.f2607d = l0Var;
            this.f2608e = mVar;
        }
    }

    public static abstract class e {
    }

    public interface f {
        void a(m mVar);

        void b(m mVar);

        void c(m mVar);

        void d(m mVar);
    }

    private void a(Animator animator, c.e.a<Animator, d> aVar) {
        if (animator != null) {
            animator.addListener(new b(aVar));
            a(animator);
        }
    }

    private void a(c.e.a<View, s> aVar, c.e.a<View, s> aVar2) {
        for (int i2 = 0; i2 < aVar.size(); i2++) {
            s d2 = aVar.d(i2);
            if (b(d2.f2616b)) {
                this.u.add(d2);
                this.v.add(null);
            }
        }
        for (int i3 = 0; i3 < aVar2.size(); i3++) {
            s d3 = aVar2.d(i3);
            if (b(d3.f2616b)) {
                this.v.add(d3);
                this.u.add(null);
            }
        }
    }

    private void a(c.e.a<View, s> aVar, c.e.a<View, s> aVar2, SparseArray<View> sparseArray, SparseArray<View> sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            View valueAt = sparseArray.valueAt(i2);
            if (valueAt != null && b(valueAt) && (view = sparseArray2.get(sparseArray.keyAt(i2))) != null && b(view)) {
                s sVar = aVar.get(valueAt);
                s sVar2 = aVar2.get(view);
                if (!(sVar == null || sVar2 == null)) {
                    this.u.add(sVar);
                    this.v.add(sVar2);
                    aVar.remove(valueAt);
                    aVar2.remove(view);
                }
            }
        }
    }

    private void a(c.e.a<View, s> aVar, c.e.a<View, s> aVar2, c.e.a<String, View> aVar3, c.e.a<String, View> aVar4) {
        View view;
        int size = aVar3.size();
        for (int i2 = 0; i2 < size; i2++) {
            View d2 = aVar3.d(i2);
            if (d2 != null && b(d2) && (view = aVar4.get(aVar3.b(i2))) != null && b(view)) {
                s sVar = aVar.get(d2);
                s sVar2 = aVar2.get(view);
                if (!(sVar == null || sVar2 == null)) {
                    this.u.add(sVar);
                    this.v.add(sVar2);
                    aVar.remove(d2);
                    aVar2.remove(view);
                }
            }
        }
    }

    private void a(c.e.a<View, s> aVar, c.e.a<View, s> aVar2, c.e.d<View> dVar, c.e.d<View> dVar2) {
        View a2;
        int b2 = dVar.b();
        for (int i2 = 0; i2 < b2; i2++) {
            View c2 = dVar.c(i2);
            if (c2 != null && b(c2) && (a2 = dVar2.a(dVar.a(i2))) != null && b(a2)) {
                s sVar = aVar.get(c2);
                s sVar2 = aVar2.get(a2);
                if (!(sVar == null || sVar2 == null)) {
                    this.u.add(sVar);
                    this.v.add(sVar2);
                    aVar.remove(c2);
                    aVar2.remove(a2);
                }
            }
        }
    }

    private static void a(t tVar, View view, s sVar) {
        tVar.a.put(view, sVar);
        int id = view.getId();
        if (id >= 0) {
            if (tVar.f2618b.indexOfKey(id) >= 0) {
                tVar.f2618b.put(id, null);
            } else {
                tVar.f2618b.put(id, view);
            }
        }
        String A2 = b0.A(view);
        if (A2 != null) {
            if (tVar.f2620d.containsKey(A2)) {
                tVar.f2620d.put(A2, null);
            } else {
                tVar.f2620d.put(A2, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (tVar.f2619c.b(itemIdAtPosition) >= 0) {
                    View a2 = tVar.f2619c.a(itemIdAtPosition);
                    if (a2 != null) {
                        b0.b(a2, false);
                        tVar.f2619c.c(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                b0.b(view, true);
                tVar.f2619c.c(itemIdAtPosition, view);
            }
        }
    }

    private void a(t tVar, t tVar2) {
        c.e.a<View, s> aVar = new c.e.a<>(tVar.a);
        c.e.a<View, s> aVar2 = new c.e.a<>(tVar2.a);
        int i2 = 0;
        while (true) {
            int[] iArr = this.t;
            if (i2 < iArr.length) {
                int i3 = iArr[i2];
                if (i3 == 1) {
                    b(aVar, aVar2);
                } else if (i3 == 2) {
                    a(aVar, aVar2, tVar.f2620d, tVar2.f2620d);
                } else if (i3 == 3) {
                    a(aVar, aVar2, tVar.f2618b, tVar2.f2618b);
                } else if (i3 == 4) {
                    a(aVar, aVar2, tVar.f2619c, tVar2.f2619c);
                }
                i2++;
            } else {
                a(aVar, aVar2);
                return;
            }
        }
    }

    private static boolean a(s sVar, s sVar2, String str) {
        Object obj = sVar.a.get(str);
        Object obj2 = sVar2.a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return true ^ obj.equals(obj2);
    }

    private void b(c.e.a<View, s> aVar, c.e.a<View, s> aVar2) {
        s remove;
        View view;
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View b2 = aVar.b(size);
            if (!(b2 == null || !b(b2) || (remove = aVar2.remove(b2)) == null || (view = remove.f2616b) == null || !b(view))) {
                this.u.add(aVar.c(size));
                this.v.add(remove);
            }
        }
    }

    private void c(View view, boolean z2) {
        if (view != null) {
            int id = view.getId();
            ArrayList<Integer> arrayList = this.f2600j;
            if (arrayList == null || !arrayList.contains(Integer.valueOf(id))) {
                ArrayList<View> arrayList2 = this.f2601k;
                if (arrayList2 == null || !arrayList2.contains(view)) {
                    ArrayList<Class> arrayList3 = this.f2602l;
                    if (arrayList3 != null) {
                        int size = arrayList3.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            if (this.f2602l.get(i2).isInstance(view)) {
                                return;
                            }
                        }
                    }
                    if (view.getParent() instanceof ViewGroup) {
                        s sVar = new s();
                        sVar.f2616b = view;
                        if (z2) {
                            c(sVar);
                        } else {
                            a(sVar);
                        }
                        sVar.f2617c.add(this);
                        b(sVar);
                        a(z2 ? this.q : this.r, view, sVar);
                    }
                    if (view instanceof ViewGroup) {
                        ArrayList<Integer> arrayList4 = this.n;
                        if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id))) {
                            ArrayList<View> arrayList5 = this.o;
                            if (arrayList5 == null || !arrayList5.contains(view)) {
                                ArrayList<Class> arrayList6 = this.p;
                                if (arrayList6 != null) {
                                    int size2 = arrayList6.size();
                                    for (int i3 = 0; i3 < size2; i3++) {
                                        if (this.p.get(i3).isInstance(view)) {
                                            return;
                                        }
                                    }
                                }
                                ViewGroup viewGroup = (ViewGroup) view;
                                for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                                    c(viewGroup.getChildAt(i4), z2);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private static c.e.a<Animator, d> t() {
        c.e.a<Animator, d> aVar = J.get();
        if (aVar != null) {
            return aVar;
        }
        c.e.a<Animator, d> aVar2 = new c.e.a<>();
        J.set(aVar2);
        return aVar2;
    }

    public Animator a(ViewGroup viewGroup, s sVar, s sVar2) {
        return null;
    }

    public m a(long j2) {
        this.f2594d = j2;
        return this;
    }

    public m a(TimeInterpolator timeInterpolator) {
        this.f2595e = timeInterpolator;
        return this;
    }

    public m a(View view) {
        this.f2597g.add(view);
        return this;
    }

    public m a(f fVar) {
        if (this.B == null) {
            this.B = new ArrayList<>();
        }
        this.B.add(fVar);
        return this;
    }

    /* access modifiers changed from: package-private */
    public s a(View view, boolean z2) {
        q qVar = this.s;
        if (qVar != null) {
            return qVar.a(view, z2);
        }
        ArrayList<s> arrayList = z2 ? this.u : this.v;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i2 = -1;
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                break;
            }
            s sVar = arrayList.get(i3);
            if (sVar == null) {
                return null;
            }
            if (sVar.f2616b == view) {
                i2 = i3;
                break;
            }
            i3++;
        }
        if (i2 < 0) {
            return null;
        }
        return (z2 ? this.v : this.u).get(i2);
    }

    /* access modifiers changed from: package-private */
    public String a(String str) {
        String str2 = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.f2594d != -1) {
            str2 = str2 + "dur(" + this.f2594d + ") ";
        }
        if (this.f2593c != -1) {
            str2 = str2 + "dly(" + this.f2593c + ") ";
        }
        if (this.f2595e != null) {
            str2 = str2 + "interp(" + this.f2595e + ") ";
        }
        if (this.f2596f.size() <= 0 && this.f2597g.size() <= 0) {
            return str2;
        }
        String str3 = str2 + "tgts(";
        if (this.f2596f.size() > 0) {
            String str4 = str3;
            for (int i2 = 0; i2 < this.f2596f.size(); i2++) {
                if (i2 > 0) {
                    str4 = str4 + ", ";
                }
                str4 = str4 + this.f2596f.get(i2);
            }
            str3 = str4;
        }
        if (this.f2597g.size() > 0) {
            for (int i3 = 0; i3 < this.f2597g.size(); i3++) {
                if (i3 > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.f2597g.get(i3);
            }
        }
        return str3 + ")";
    }

    /* access modifiers changed from: protected */
    public void a() {
        this.y--;
        if (this.y == 0) {
            ArrayList<f> arrayList = this.B;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.B.clone();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((f) arrayList2.get(i2)).d(this);
                }
            }
            for (int i3 = 0; i3 < this.q.f2619c.b(); i3++) {
                View c2 = this.q.f2619c.c(i3);
                if (c2 != null) {
                    b0.b(c2, false);
                }
            }
            for (int i4 = 0; i4 < this.r.f2619c.b(); i4++) {
                View c3 = this.r.f2619c.c(i4);
                if (c3 != null) {
                    b0.b(c3, false);
                }
            }
            this.A = true;
        }
    }

    /* access modifiers changed from: protected */
    public void a(Animator animator) {
        if (animator == null) {
            a();
            return;
        }
        if (b() >= 0) {
            animator.setDuration(b());
        }
        if (h() >= 0) {
            animator.setStartDelay(h());
        }
        if (d() != null) {
            animator.setInterpolator(d());
        }
        animator.addListener(new c());
        animator.start();
    }

    /* access modifiers changed from: package-private */
    public void a(ViewGroup viewGroup) {
        d dVar;
        this.u = new ArrayList<>();
        this.v = new ArrayList<>();
        a(this.q, this.r);
        c.e.a<Animator, d> t2 = t();
        int size = t2.size();
        l0 d2 = d0.d(viewGroup);
        for (int i2 = size - 1; i2 >= 0; i2--) {
            Animator b2 = t2.b(i2);
            if (!(b2 == null || (dVar = t2.get(b2)) == null || dVar.a == null || !d2.equals(dVar.f2607d))) {
                s sVar = dVar.f2606c;
                View view = dVar.a;
                s b3 = b(view, true);
                s a2 = a(view, true);
                if (!(b3 == null && a2 == null) && dVar.f2608e.a(sVar, a2)) {
                    if (b2.isRunning() || b2.isStarted()) {
                        b2.cancel();
                    } else {
                        t2.remove(b2);
                    }
                }
            }
        }
        a(viewGroup, this.q, this.r, this.u, this.v);
        r();
    }

    /* access modifiers changed from: protected */
    public void a(ViewGroup viewGroup, t tVar, t tVar2, ArrayList<s> arrayList, ArrayList<s> arrayList2) {
        int i2;
        int i3;
        Animator a2;
        View view;
        Animator animator;
        s sVar;
        s sVar2;
        Animator animator2;
        c.e.a<Animator, d> t2 = t();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        long j2 = Long.MAX_VALUE;
        int i4 = 0;
        while (i4 < size) {
            s sVar3 = arrayList.get(i4);
            s sVar4 = arrayList2.get(i4);
            if (sVar3 != null && !sVar3.f2617c.contains(this)) {
                sVar3 = null;
            }
            if (sVar4 != null && !sVar4.f2617c.contains(this)) {
                sVar4 = null;
            }
            if (!(sVar3 == null && sVar4 == null)) {
                if ((sVar3 == null || sVar4 == null || a(sVar3, sVar4)) && (a2 = a(viewGroup, sVar3, sVar4)) != null) {
                    if (sVar4 != null) {
                        view = sVar4.f2616b;
                        String[] q2 = q();
                        if (view == null || q2 == null || q2.length <= 0) {
                            i3 = size;
                            i2 = i4;
                            animator2 = a2;
                            sVar2 = null;
                        } else {
                            sVar2 = new s();
                            sVar2.f2616b = view;
                            i3 = size;
                            s sVar5 = tVar2.a.get(view);
                            if (sVar5 != null) {
                                int i5 = 0;
                                while (i5 < q2.length) {
                                    sVar2.a.put(q2[i5], sVar5.a.get(q2[i5]));
                                    i5++;
                                    i4 = i4;
                                    sVar5 = sVar5;
                                }
                            }
                            i2 = i4;
                            int size2 = t2.size();
                            int i6 = 0;
                            while (true) {
                                if (i6 >= size2) {
                                    animator2 = a2;
                                    break;
                                }
                                d dVar = t2.get(t2.b(i6));
                                if (dVar.f2606c != null && dVar.a == view && dVar.f2605b.equals(e()) && dVar.f2606c.equals(sVar2)) {
                                    animator2 = null;
                                    break;
                                }
                                i6++;
                            }
                        }
                        animator = animator2;
                        sVar = sVar2;
                    } else {
                        i3 = size;
                        i2 = i4;
                        view = sVar3.f2616b;
                        animator = a2;
                        sVar = null;
                    }
                    if (animator != null) {
                        p pVar = this.D;
                        if (pVar != null) {
                            long a3 = pVar.a(viewGroup, this, sVar3, sVar4);
                            sparseIntArray.put(this.C.size(), (int) a3);
                            j2 = Math.min(a3, j2);
                        }
                        t2.put(animator, new d(view, e(), this, d0.d(viewGroup), sVar));
                        this.C.add(animator);
                        j2 = j2;
                    }
                    i4 = i2 + 1;
                    size = i3;
                }
            }
            i3 = size;
            i2 = i4;
            i4 = i2 + 1;
            size = i3;
        }
        if (j2 != 0) {
            for (int i7 = 0; i7 < sparseIntArray.size(); i7++) {
                Animator animator3 = this.C.get(sparseIntArray.keyAt(i7));
                animator3.setStartDelay((((long) sparseIntArray.valueAt(i7)) - j2) + animator3.getStartDelay());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(ViewGroup viewGroup, boolean z2) {
        c.e.a<String, String> aVar;
        ArrayList<String> arrayList;
        ArrayList<Class> arrayList2;
        a(z2);
        if ((this.f2596f.size() > 0 || this.f2597g.size() > 0) && (((arrayList = this.f2598h) == null || arrayList.isEmpty()) && ((arrayList2 = this.f2599i) == null || arrayList2.isEmpty()))) {
            for (int i2 = 0; i2 < this.f2596f.size(); i2++) {
                View findViewById = viewGroup.findViewById(this.f2596f.get(i2).intValue());
                if (findViewById != null) {
                    s sVar = new s();
                    sVar.f2616b = findViewById;
                    if (z2) {
                        c(sVar);
                    } else {
                        a(sVar);
                    }
                    sVar.f2617c.add(this);
                    b(sVar);
                    a(z2 ? this.q : this.r, findViewById, sVar);
                }
            }
            for (int i3 = 0; i3 < this.f2597g.size(); i3++) {
                View view = this.f2597g.get(i3);
                s sVar2 = new s();
                sVar2.f2616b = view;
                if (z2) {
                    c(sVar2);
                } else {
                    a(sVar2);
                }
                sVar2.f2617c.add(this);
                b(sVar2);
                a(z2 ? this.q : this.r, view, sVar2);
            }
        } else {
            c(viewGroup, z2);
        }
        if (!(z2 || (aVar = this.F) == null)) {
            int size = aVar.size();
            ArrayList arrayList3 = new ArrayList(size);
            for (int i4 = 0; i4 < size; i4++) {
                arrayList3.add(this.q.f2620d.remove(this.F.b(i4)));
            }
            for (int i5 = 0; i5 < size; i5++) {
                View view2 = (View) arrayList3.get(i5);
                if (view2 != null) {
                    this.q.f2620d.put(this.F.d(i5), view2);
                }
            }
        }
    }

    public void a(g gVar) {
        if (gVar == null) {
            gVar = I;
        }
        this.G = gVar;
    }

    public void a(e eVar) {
        this.E = eVar;
    }

    public void a(p pVar) {
        this.D = pVar;
    }

    public abstract void a(s sVar);

    /* access modifiers changed from: package-private */
    public void a(boolean z2) {
        t tVar;
        if (z2) {
            this.q.a.clear();
            this.q.f2618b.clear();
            tVar = this.q;
        } else {
            this.r.a.clear();
            this.r.f2618b.clear();
            tVar = this.r;
        }
        tVar.f2619c.a();
    }

    public boolean a(s sVar, s sVar2) {
        if (sVar == null || sVar2 == null) {
            return false;
        }
        String[] q2 = q();
        if (q2 != null) {
            for (String str : q2) {
                if (!a(sVar, sVar2, str)) {
                }
            }
            return false;
        }
        for (String str2 : sVar.a.keySet()) {
            if (a(sVar, sVar2, str2)) {
            }
        }
        return false;
        return true;
    }

    public long b() {
        return this.f2594d;
    }

    public m b(long j2) {
        this.f2593c = j2;
        return this;
    }

    public m b(f fVar) {
        ArrayList<f> arrayList = this.B;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(fVar);
        if (this.B.size() == 0) {
            this.B = null;
        }
        return this;
    }

    public s b(View view, boolean z2) {
        q qVar = this.s;
        if (qVar != null) {
            return qVar.b(view, z2);
        }
        return (z2 ? this.q : this.r).a.get(view);
    }

    /* access modifiers changed from: package-private */
    public void b(s sVar) {
        String[] a2;
        if (this.D != null && !sVar.a.isEmpty() && (a2 = this.D.a()) != null) {
            boolean z2 = false;
            int i2 = 0;
            while (true) {
                if (i2 >= a2.length) {
                    z2 = true;
                    break;
                } else if (!sVar.a.containsKey(a2[i2])) {
                    break;
                } else {
                    i2++;
                }
            }
            if (!z2) {
                this.D.a(sVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean b(View view) {
        ArrayList<Class> arrayList;
        ArrayList<String> arrayList2;
        int id = view.getId();
        ArrayList<Integer> arrayList3 = this.f2600j;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id))) {
            return false;
        }
        ArrayList<View> arrayList4 = this.f2601k;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList<Class> arrayList5 = this.f2602l;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (this.f2602l.get(i2).isInstance(view)) {
                    return false;
                }
            }
        }
        if (!(this.f2603m == null || b0.A(view) == null || !this.f2603m.contains(b0.A(view)))) {
            return false;
        }
        if ((this.f2596f.size() == 0 && this.f2597g.size() == 0 && (((arrayList = this.f2599i) == null || arrayList.isEmpty()) && ((arrayList2 = this.f2598h) == null || arrayList2.isEmpty()))) || this.f2596f.contains(Integer.valueOf(id)) || this.f2597g.contains(view)) {
            return true;
        }
        ArrayList<String> arrayList6 = this.f2598h;
        if (arrayList6 != null && arrayList6.contains(b0.A(view))) {
            return true;
        }
        if (this.f2599i != null) {
            for (int i3 = 0; i3 < this.f2599i.size(); i3++) {
                if (this.f2599i.get(i3).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    public e c() {
        return this.E;
    }

    public void c(View view) {
        if (!this.A) {
            c.e.a<Animator, d> t2 = t();
            int size = t2.size();
            l0 d2 = d0.d(view);
            for (int i2 = size - 1; i2 >= 0; i2--) {
                d d3 = t2.d(i2);
                if (d3.a != null && d2.equals(d3.f2607d)) {
                    a.a(t2.b(i2));
                }
            }
            ArrayList<f> arrayList = this.B;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.B.clone();
                int size2 = arrayList2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    ((f) arrayList2.get(i3)).b(this);
                }
            }
            this.z = true;
        }
    }

    public abstract void c(s sVar);

    @Override // java.lang.Object
    public m clone() {
        try {
            m mVar = (m) super.clone();
            mVar.C = new ArrayList<>();
            mVar.q = new t();
            mVar.r = new t();
            mVar.u = null;
            mVar.v = null;
            return mVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public TimeInterpolator d() {
        return this.f2595e;
    }

    public m d(View view) {
        this.f2597g.remove(view);
        return this;
    }

    public String e() {
        return this.f2592b;
    }

    public void e(View view) {
        if (this.z) {
            if (!this.A) {
                c.e.a<Animator, d> t2 = t();
                int size = t2.size();
                l0 d2 = d0.d(view);
                for (int i2 = size - 1; i2 >= 0; i2--) {
                    d d3 = t2.d(i2);
                    if (d3.a != null && d2.equals(d3.f2607d)) {
                        a.b(t2.b(i2));
                    }
                }
                ArrayList<f> arrayList = this.B;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.B.clone();
                    int size2 = arrayList2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        ((f) arrayList2.get(i3)).c(this);
                    }
                }
            }
            this.z = false;
        }
    }

    public g f() {
        return this.G;
    }

    public p g() {
        return this.D;
    }

    public long h() {
        return this.f2593c;
    }

    public List<Integer> i() {
        return this.f2596f;
    }

    public List<String> j() {
        return this.f2598h;
    }

    public List<Class> k() {
        return this.f2599i;
    }

    public List<View> p() {
        return this.f2597g;
    }

    public String[] q() {
        return null;
    }

    /* access modifiers changed from: protected */
    public void r() {
        s();
        c.e.a<Animator, d> t2 = t();
        Iterator<Animator> it = this.C.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (t2.containsKey(next)) {
                s();
                a(next, t2);
            }
        }
        this.C.clear();
        a();
    }

    /* access modifiers changed from: protected */
    public void s() {
        if (this.y == 0) {
            ArrayList<f> arrayList = this.B;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.B.clone();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((f) arrayList2.get(i2)).a(this);
                }
            }
            this.A = false;
        }
        this.y++;
    }

    public String toString() {
        return a("");
    }
}
