package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.core.app.n;
import androidx.fragment.app.e0;
import androidx.fragment.app.f;
import c.h.h.b;
import c.h.l.b0;
import c.h.l.d0;
import c.h.l.x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

class c extends e0 {

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a = new int[e0.e.c.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        static {
            /*
                androidx.fragment.app.e0$e$c[] r0 = androidx.fragment.app.e0.e.c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.fragment.app.c.a.a = r0
                int[] r0 = androidx.fragment.app.c.a.a     // Catch:{ NoSuchFieldError -> 0x0014 }
                androidx.fragment.app.e0$e$c r1 = androidx.fragment.app.e0.e.c.GONE     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = androidx.fragment.app.c.a.a     // Catch:{ NoSuchFieldError -> 0x001f }
                androidx.fragment.app.e0$e$c r1 = androidx.fragment.app.e0.e.c.INVISIBLE     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = androidx.fragment.app.c.a.a     // Catch:{ NoSuchFieldError -> 0x002a }
                androidx.fragment.app.e0$e$c r1 = androidx.fragment.app.e0.e.c.REMOVED     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = androidx.fragment.app.c.a.a     // Catch:{ NoSuchFieldError -> 0x0035 }
                androidx.fragment.app.e0$e$c r1 = androidx.fragment.app.e0.e.c.VISIBLE     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.c.a.<clinit>():void");
        }
    }

    class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f1218b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ e0.e f1219c;

        b(List list, e0.e eVar) {
            this.f1218b = list;
            this.f1219c = eVar;
        }

        public void run() {
            if (this.f1218b.contains(this.f1219c)) {
                this.f1218b.remove(this.f1219c);
                c.this.a(this.f1219c);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.c$c  reason: collision with other inner class name */
    public class C0018c extends AnimatorListenerAdapter {
        final /* synthetic */ ViewGroup a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f1221b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f1222c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ e0.e f1223d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ k f1224e;

        C0018c(c cVar, ViewGroup viewGroup, View view, boolean z, e0.e eVar, k kVar) {
            this.a = viewGroup;
            this.f1221b = view;
            this.f1222c = z;
            this.f1223d = eVar;
            this.f1224e = kVar;
        }

        public void onAnimationEnd(Animator animator) {
            this.a.endViewTransition(this.f1221b);
            if (this.f1222c) {
                this.f1223d.c().a(this.f1221b);
            }
            this.f1224e.a();
        }
    }

    /* access modifiers changed from: package-private */
    public class d implements b.a {
        final /* synthetic */ Animator a;

        d(c cVar, Animator animator) {
            this.a = animator;
        }

        @Override // c.h.h.b.a
        public void a() {
            this.a.end();
        }
    }

    /* access modifiers changed from: package-private */
    public class e implements Animation.AnimationListener {
        final /* synthetic */ ViewGroup a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f1225b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ k f1226c;

        class a implements Runnable {
            a() {
            }

            public void run() {
                e eVar = e.this;
                eVar.a.endViewTransition(eVar.f1225b);
                e.this.f1226c.a();
            }
        }

        e(c cVar, ViewGroup viewGroup, View view, k kVar) {
            this.a = viewGroup;
            this.f1225b = view;
            this.f1226c = kVar;
        }

        public void onAnimationEnd(Animation animation) {
            this.a.post(new a());
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* access modifiers changed from: package-private */
    public class f implements b.a {
        final /* synthetic */ View a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ViewGroup f1228b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ k f1229c;

        f(c cVar, View view, ViewGroup viewGroup, k kVar) {
            this.a = view;
            this.f1228b = viewGroup;
            this.f1229c = kVar;
        }

        @Override // c.h.h.b.a
        public void a() {
            this.a.clearAnimation();
            this.f1228b.endViewTransition(this.a);
            this.f1229c.a();
        }
    }

    /* access modifiers changed from: package-private */
    public class g implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e0.e f1230b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ e0.e f1231c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f1232d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ c.e.a f1233e;

        g(c cVar, e0.e eVar, e0.e eVar2, boolean z, c.e.a aVar) {
            this.f1230b = eVar;
            this.f1231c = eVar2;
            this.f1232d = z;
            this.f1233e = aVar;
        }

        public void run() {
            z.a(this.f1230b.d(), this.f1231c.d(), this.f1232d, (c.e.a<String, View>) this.f1233e, false);
        }
    }

    /* access modifiers changed from: package-private */
    public class h implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b0 f1234b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f1235c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Rect f1236d;

        h(c cVar, b0 b0Var, View view, Rect rect) {
            this.f1234b = b0Var;
            this.f1235c = view;
            this.f1236d = rect;
        }

        public void run() {
            this.f1234b.a(this.f1235c, this.f1236d);
        }
    }

    /* access modifiers changed from: package-private */
    public class i implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ArrayList f1237b;

        i(c cVar, ArrayList arrayList) {
            this.f1237b = arrayList;
        }

        public void run() {
            z.a(this.f1237b, 4);
        }
    }

    /* access modifiers changed from: package-private */
    public class j implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ m f1238b;

        j(c cVar, m mVar) {
            this.f1238b = mVar;
        }

        public void run() {
            this.f1238b.a();
        }
    }

    /* access modifiers changed from: private */
    public static class k extends l {

        /* renamed from: c  reason: collision with root package name */
        private boolean f1239c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f1240d = false;

        /* renamed from: e  reason: collision with root package name */
        private f.d f1241e;

        k(e0.e eVar, c.h.h.b bVar, boolean z) {
            super(eVar, bVar);
            this.f1239c = z;
        }

        /* access modifiers changed from: package-private */
        public f.d a(Context context) {
            if (this.f1240d) {
                return this.f1241e;
            }
            this.f1241e = f.a(context, b().d(), b().c() == e0.e.c.VISIBLE, this.f1239c);
            this.f1240d = true;
            return this.f1241e;
        }
    }

    /* access modifiers changed from: private */
    public static class l {
        private final e0.e a;

        /* renamed from: b  reason: collision with root package name */
        private final c.h.h.b f1242b;

        l(e0.e eVar, c.h.h.b bVar) {
            this.a = eVar;
            this.f1242b = bVar;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            this.a.a(this.f1242b);
        }

        /* access modifiers changed from: package-private */
        public e0.e b() {
            return this.a;
        }

        /* access modifiers changed from: package-private */
        public c.h.h.b c() {
            return this.f1242b;
        }

        /* access modifiers changed from: package-private */
        public boolean d() {
            e0.e.c cVar;
            e0.e.c b2 = e0.e.c.b(this.a.d().I);
            e0.e.c c2 = this.a.c();
            return b2 == c2 || !(b2 == (cVar = e0.e.c.VISIBLE) || c2 == cVar);
        }
    }

    /* access modifiers changed from: private */
    public static class m extends l {

        /* renamed from: c  reason: collision with root package name */
        private final Object f1243c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f1244d;

        /* renamed from: e  reason: collision with root package name */
        private final Object f1245e;

        m(e0.e eVar, c.h.h.b bVar, boolean z, boolean z2) {
            super(eVar, bVar);
            boolean z3;
            Object obj;
            if (eVar.c() == e0.e.c.VISIBLE) {
                Fragment d2 = eVar.d();
                this.f1243c = z ? d2.D() : d2.o();
                Fragment d3 = eVar.d();
                z3 = z ? d3.h() : d3.g();
            } else {
                Fragment d4 = eVar.d();
                this.f1243c = z ? d4.F() : d4.r();
                z3 = true;
            }
            this.f1244d = z3;
            if (z2) {
                Fragment d5 = eVar.d();
                obj = z ? d5.H() : d5.G();
            } else {
                obj = null;
            }
            this.f1245e = obj;
        }

        private b0 a(Object obj) {
            if (obj == null) {
                return null;
            }
            b0 b0Var = z.f1396b;
            if (b0Var != null && b0Var.a(obj)) {
                return z.f1396b;
            }
            b0 b0Var2 = z.f1397c;
            if (b0Var2 != null && b0Var2.a(obj)) {
                return z.f1397c;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + b().d() + " is not a valid framework Transition or AndroidX Transition");
        }

        /* access modifiers changed from: package-private */
        public b0 e() {
            b0 a = a(this.f1243c);
            b0 a2 = a(this.f1245e);
            if (a == null || a2 == null || a == a2) {
                return a != null ? a : a2;
            }
            throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + b().d() + " returned Transition " + this.f1243c + " which uses a different Transition  type than its shared element transition " + this.f1245e);
        }

        public Object f() {
            return this.f1245e;
        }

        /* access modifiers changed from: package-private */
        public Object g() {
            return this.f1243c;
        }

        public boolean h() {
            return this.f1245e != null;
        }

        /* access modifiers changed from: package-private */
        public boolean i() {
            return this.f1244d;
        }
    }

    c(ViewGroup viewGroup) {
        super(viewGroup);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:151:0x0012 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [androidx.fragment.app.c] */
    private Map<e0.e, Boolean> a(List<m> list, List<e0.e> list2, boolean z, e0.e eVar, e0.e eVar2) {
        Iterator<m> it;
        ArrayList<View> arrayList;
        ArrayList<View> arrayList2;
        View view;
        HashMap hashMap;
        Object obj;
        Object obj2;
        View view2;
        e0.e eVar3;
        Object obj3;
        c.e.a aVar;
        HashMap hashMap2;
        b0 b0Var;
        e0.e eVar4;
        ArrayList<View> arrayList3;
        View view3;
        ArrayList<View> arrayList4;
        c cVar;
        Rect rect;
        e0.e eVar5;
        n nVar;
        n nVar2;
        ArrayList<String> arrayList5;
        int i2;
        View view4;
        View view5;
        String a2;
        ArrayList<String> arrayList6;
        c cVar2 = this;
        boolean z2 = z;
        e0.e eVar6 = eVar;
        e0.e eVar7 = eVar2;
        HashMap hashMap3 = new HashMap();
        b0 b0Var2 = 0;
        for (m mVar : list) {
            if (!mVar.d()) {
                b0 e2 = mVar.e();
                if (b0Var2 == null) {
                    b0Var2 = e2;
                } else if (!(e2 == null || b0Var2 == e2)) {
                    throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + mVar.b().d() + " returned Transition " + mVar.g() + " which uses a different Transition  type than other Fragments.");
                }
            }
        }
        if (b0Var2 == null) {
            for (m mVar2 : list) {
                hashMap3.put(mVar2.b(), false);
                mVar2.a();
            }
            return hashMap3;
        }
        View view6 = new View(d().getContext());
        Rect rect2 = new Rect();
        ArrayList<View> arrayList7 = new ArrayList<>();
        ArrayList<View> arrayList8 = new ArrayList<>();
        c.e.a aVar2 = new c.e.a();
        Object obj4 = null;
        View view7 = null;
        boolean z3 = false;
        for (m mVar3 : list) {
            if (!mVar3.h() || eVar6 == null || eVar7 == null) {
                aVar = aVar2;
                eVar5 = eVar7;
                b0Var = b0Var2;
                arrayList3 = arrayList8;
                hashMap2 = hashMap3;
                rect = rect2;
                eVar4 = eVar6;
                view3 = view6;
                arrayList4 = arrayList7;
                cVar = cVar2;
                view7 = view7;
            } else {
                Object c2 = b0Var2.c(b0Var2.b(mVar3.f()));
                ArrayList<String> I = eVar2.d().I();
                ArrayList<String> I2 = eVar.d().I();
                int i3 = 0;
                for (ArrayList<String> J = eVar.d().J(); i3 < J.size(); J = J) {
                    int indexOf = I.indexOf(J.get(i3));
                    if (indexOf != -1) {
                        I.set(indexOf, I2.get(i3));
                    }
                    i3++;
                }
                ArrayList<String> J2 = eVar2.d().J();
                Fragment d2 = eVar.d();
                if (!z2) {
                    nVar2 = d2.s();
                    nVar = eVar2.d().p();
                } else {
                    nVar2 = d2.p();
                    nVar = eVar2.d().s();
                }
                int i4 = 0;
                for (int size = I.size(); i4 < size; size = size) {
                    aVar2.put(I.get(i4), J2.get(i4));
                    i4++;
                }
                c.e.a aVar3 = new c.e.a();
                cVar2.a(aVar3, eVar.d().I);
                aVar3.a((Collection<?>) I);
                if (nVar2 != null) {
                    nVar2.a(I, aVar3);
                    int size2 = I.size() - 1;
                    while (size2 >= 0) {
                        String str = I.get(size2);
                        View view8 = (View) aVar3.get(str);
                        if (view8 == null) {
                            aVar2.remove(str);
                            arrayList6 = I;
                        } else {
                            arrayList6 = I;
                            if (!str.equals(b0.A(view8))) {
                                aVar2.put(b0.A(view8), (String) aVar2.remove(str));
                            }
                        }
                        size2--;
                        I = arrayList6;
                    }
                    arrayList5 = I;
                } else {
                    arrayList5 = I;
                    aVar2.a((Collection<?>) aVar3.keySet());
                }
                c.e.a aVar4 = new c.e.a();
                cVar2.a(aVar4, eVar2.d().I);
                aVar4.a((Collection<?>) J2);
                aVar4.a(aVar2.values());
                if (nVar != null) {
                    nVar.a(J2, aVar4);
                    for (int size3 = J2.size() - 1; size3 >= 0; size3--) {
                        String str2 = J2.get(size3);
                        View view9 = (View) aVar4.get(str2);
                        if (view9 == null) {
                            String a3 = z.a(aVar2, str2);
                            if (a3 != null) {
                                aVar2.remove(a3);
                            }
                        } else if (!str2.equals(b0.A(view9)) && (a2 = z.a(aVar2, str2)) != null) {
                            aVar2.put(a2, b0.A(view9));
                        }
                    }
                } else {
                    z.a(aVar2, aVar4);
                }
                cVar2.a(aVar3, aVar2.keySet());
                cVar2.a(aVar4, aVar2.values());
                if (aVar2.isEmpty()) {
                    arrayList7.clear();
                    arrayList8.clear();
                    aVar = aVar2;
                    arrayList3 = arrayList8;
                    rect = rect2;
                    view3 = view6;
                    b0Var = b0Var2;
                    view7 = view7;
                    obj4 = null;
                    eVar5 = eVar2;
                    hashMap2 = hashMap3;
                    eVar4 = eVar;
                    arrayList4 = arrayList7;
                    cVar = cVar2;
                } else {
                    z.a(eVar2.d(), eVar.d(), z2, (c.e.a<String, View>) aVar3, true);
                    aVar = aVar2;
                    arrayList4 = arrayList7;
                    x.a(d(), new g(this, eVar2, eVar, z, aVar4));
                    arrayList4.addAll(aVar3.values());
                    if (!arrayList5.isEmpty()) {
                        i2 = 0;
                        view7 = (View) aVar3.get(arrayList5.get(0));
                        b0Var2.c(c2, view7);
                    } else {
                        i2 = 0;
                        view7 = view7;
                    }
                    arrayList8.addAll(aVar4.values());
                    if (J2.isEmpty() || (view5 = (View) aVar4.get(J2.get(i2))) == null) {
                        cVar = this;
                        view4 = view6;
                    } else {
                        cVar = this;
                        x.a(d(), new h(cVar, b0Var2, view5, rect2));
                        view4 = view6;
                        z3 = true;
                    }
                    b0Var2.b(c2, view4, arrayList4);
                    rect = rect2;
                    view3 = view4;
                    arrayList3 = arrayList8;
                    b0Var = b0Var2;
                    b0Var2.a(c2, null, null, null, null, c2, arrayList3);
                    eVar4 = eVar;
                    hashMap2 = hashMap3;
                    hashMap2.put(eVar4, true);
                    eVar5 = eVar2;
                    hashMap2.put(eVar5, true);
                    obj4 = c2;
                }
            }
            z2 = z;
            rect2 = rect;
            view6 = view3;
            arrayList8 = arrayList3;
            eVar6 = eVar4;
            hashMap3 = hashMap2;
            eVar7 = eVar5;
            b0Var2 = b0Var;
            aVar2 = aVar;
            cVar2 = cVar;
            arrayList7 = arrayList4;
        }
        View view10 = view7;
        boolean z4 = false;
        ArrayList<View> arrayList9 = arrayList8;
        HashMap hashMap4 = hashMap3;
        View view11 = view6;
        ArrayList<View> arrayList10 = arrayList7;
        ArrayList arrayList11 = new ArrayList();
        Iterator<m> it2 = list.iterator();
        Object obj5 = null;
        Object obj6 = null;
        while (it2.hasNext()) {
            m next = it2.next();
            if (next.d()) {
                it = it2;
                hashMap4.put(next.b(), Boolean.valueOf(z4));
                next.a();
            } else {
                it = it2;
                Object b2 = b0Var2.b(next.g());
                e0.e b3 = next.b();
                boolean z5 = obj4 != null && (b3 == eVar6 || b3 == eVar7);
                if (b2 == null) {
                    if (!z5) {
                        hashMap4.put(b3, Boolean.valueOf(z4));
                        next.a();
                    }
                    arrayList2 = arrayList10;
                    view = view11;
                    arrayList = arrayList9;
                    obj = obj5;
                    obj2 = obj6;
                    hashMap = hashMap4;
                    view2 = view10;
                } else {
                    ArrayList<View> arrayList12 = new ArrayList<>();
                    cVar2.a(arrayList12, b3.d().I);
                    if (z5) {
                        if (b3 == eVar6) {
                            arrayList12.removeAll(arrayList10);
                        } else {
                            arrayList12.removeAll(arrayList9);
                        }
                    }
                    if (arrayList12.isEmpty()) {
                        b0Var2.a(b2, view11);
                        arrayList2 = arrayList10;
                        view = view11;
                        arrayList = arrayList9;
                        eVar3 = b3;
                        obj2 = obj6;
                        hashMap = hashMap4;
                        obj3 = obj5;
                    } else {
                        b0Var2.a(b2, arrayList12);
                        view = view11;
                        obj3 = obj5;
                        arrayList2 = arrayList10;
                        obj2 = obj6;
                        arrayList = arrayList9;
                        hashMap = hashMap4;
                        b0Var2.a(b2, b2, arrayList12, null, null, null, null);
                        if (b3.c() == e0.e.c.GONE) {
                            eVar3 = b3;
                            list2.remove(eVar3);
                            ArrayList<View> arrayList13 = new ArrayList<>(arrayList12);
                            arrayList13.remove(eVar3.d().I);
                            b0Var2.a(b2, eVar3.d().I, arrayList13);
                            x.a(d(), new i(cVar2, arrayList12));
                        } else {
                            eVar3 = b3;
                        }
                    }
                    if (eVar3.c() == e0.e.c.VISIBLE) {
                        arrayList11.addAll(arrayList12);
                        if (z3) {
                            b0Var2.a(b2, rect2);
                        }
                        view2 = view10;
                    } else {
                        view2 = view10;
                        b0Var2.c(b2, view2);
                    }
                    hashMap.put(eVar3, true);
                    if (next.i()) {
                        obj2 = b0Var2.b(obj2, b2, (Object) null);
                        obj = obj3;
                    } else {
                        obj = b0Var2.b(obj3, b2, (Object) null);
                    }
                }
                view10 = view2;
                obj6 = obj2;
                obj5 = obj;
                hashMap4 = hashMap;
                view11 = view;
                arrayList10 = arrayList2;
                arrayList9 = arrayList;
                z4 = false;
            }
            it2 = it;
        }
        Object a4 = b0Var2.a(obj6, obj5, obj4);
        for (m mVar4 : list) {
            if (!mVar4.d()) {
                Object g2 = mVar4.g();
                e0.e b4 = mVar4.b();
                boolean z6 = obj4 != null && (b4 == eVar6 || b4 == eVar7);
                if (g2 != null || z6) {
                    if (!b0.I(d())) {
                        if (n.d(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Container " + d() + " has not been laid out. Completing operation " + b4);
                        }
                        mVar4.a();
                    } else {
                        b0Var2.a(mVar4.b().d(), a4, mVar4.c(), new j(cVar2, mVar4));
                    }
                }
            }
        }
        if (!b0.I(d())) {
            return hashMap4;
        }
        z.a(arrayList11, 4);
        ArrayList<String> a5 = b0Var2.a(arrayList9);
        b0Var2.a(d(), a4);
        b0Var2.a(d(), arrayList10, arrayList9, a5, aVar2);
        z.a(arrayList11, 0);
        b0Var2.b(obj4, arrayList10, arrayList9);
        return hashMap4;
    }

    private void a(List<k> list, List<e0.e> list2, boolean z, Map<e0.e, Boolean> map) {
        StringBuilder sb;
        String str;
        f.d a2;
        ViewGroup d2 = d();
        Context context = d2.getContext();
        ArrayList arrayList = new ArrayList();
        boolean z2 = false;
        for (k kVar : list) {
            if (!kVar.d() && (a2 = kVar.a(context)) != null) {
                Animator animator = a2.f1293b;
                if (animator == null) {
                    arrayList.add(kVar);
                } else {
                    e0.e b2 = kVar.b();
                    Fragment d3 = b2.d();
                    if (Boolean.TRUE.equals(map.get(b2))) {
                        if (n.d(2)) {
                            Log.v("FragmentManager", "Ignoring Animator set on " + d3 + " as this Fragment was involved in a Transition.");
                        }
                        kVar.a();
                    } else {
                        boolean z3 = b2.c() == e0.e.c.GONE;
                        if (z3) {
                            list2.remove(b2);
                        }
                        View view = d3.I;
                        d2.startViewTransition(view);
                        animator.addListener(new C0018c(this, d2, view, z3, b2, kVar));
                        animator.setTarget(view);
                        animator.start();
                        kVar.c().a(new d(this, animator));
                        z2 = true;
                    }
                }
            } else {
                kVar.a();
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            k kVar2 = (k) it.next();
            e0.e b3 = kVar2.b();
            Fragment d4 = b3.d();
            if (z) {
                if (n.d(2)) {
                    sb = new StringBuilder();
                    sb.append("Ignoring Animation set on ");
                    sb.append(d4);
                    str = " as Animations cannot run alongside Transitions.";
                }
                kVar2.a();
            } else if (z2) {
                if (n.d(2)) {
                    sb = new StringBuilder();
                    sb.append("Ignoring Animation set on ");
                    sb.append(d4);
                    str = " as Animations cannot run alongside Animators.";
                }
                kVar2.a();
            } else {
                View view2 = d4.I;
                f.d a3 = kVar2.a(context);
                c.h.k.h.a(a3);
                Animation animation = a3.a;
                c.h.k.h.a(animation);
                Animation animation2 = animation;
                if (b3.c() != e0.e.c.REMOVED) {
                    view2.startAnimation(animation2);
                    kVar2.a();
                } else {
                    d2.startViewTransition(view2);
                    f.e eVar = new f.e(animation2, d2, view2);
                    eVar.setAnimationListener(new e(this, d2, view2, kVar2));
                    view2.startAnimation(eVar);
                }
                kVar2.c().a(new f(this, view2, d2, kVar2));
            }
            sb.append(str);
            Log.v("FragmentManager", sb.toString());
            kVar2.a();
        }
    }

    /* access modifiers changed from: package-private */
    public void a(e0.e eVar) {
        eVar.c().a(eVar.d().I);
    }

    /* access modifiers changed from: package-private */
    public void a(c.e.a<String, View> aVar, Collection<String> collection) {
        Iterator<Map.Entry<String, View>> it = aVar.entrySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(b0.A(it.next().getValue()))) {
                it.remove();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(ArrayList<View> arrayList, View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (!d0.a(viewGroup)) {
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = viewGroup.getChildAt(i2);
                    if (childAt.getVisibility() == 0) {
                        a(arrayList, childAt);
                    }
                }
            } else if (!arrayList.contains(view)) {
                arrayList.add(viewGroup);
            }
        } else if (!arrayList.contains(view)) {
            arrayList.add(view);
        }
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.fragment.app.e0
    public void a(List<e0.e> list, boolean z) {
        e0.e eVar = null;
        e0.e eVar2 = null;
        for (e0.e eVar3 : list) {
            e0.e.c b2 = e0.e.c.b(eVar3.d().I);
            int i2 = a.a[eVar3.c().ordinal()];
            if (i2 == 1 || i2 == 2 || i2 == 3) {
                if (b2 == e0.e.c.VISIBLE && eVar == null) {
                    eVar = eVar3;
                }
            } else if (i2 == 4 && b2 != e0.e.c.VISIBLE) {
                eVar2 = eVar3;
            }
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList<e0.e> arrayList3 = new ArrayList(list);
        for (e0.e eVar4 : list) {
            c.h.h.b bVar = new c.h.h.b();
            eVar4.b(bVar);
            arrayList.add(new k(eVar4, bVar, z));
            c.h.h.b bVar2 = new c.h.h.b();
            eVar4.b(bVar2);
            boolean z2 = false;
            if (z) {
                if (eVar4 != eVar) {
                    arrayList2.add(new m(eVar4, bVar2, z, z2));
                    eVar4.a(new b(arrayList3, eVar4));
                }
            } else if (eVar4 != eVar2) {
                arrayList2.add(new m(eVar4, bVar2, z, z2));
                eVar4.a(new b(arrayList3, eVar4));
            }
            z2 = true;
            arrayList2.add(new m(eVar4, bVar2, z, z2));
            eVar4.a(new b(arrayList3, eVar4));
        }
        Map<e0.e, Boolean> a2 = a(arrayList2, arrayList3, z, eVar, eVar2);
        a(arrayList, arrayList3, a2.containsValue(true), a2);
        for (e0.e eVar5 : arrayList3) {
            a(eVar5);
        }
        arrayList3.clear();
    }

    /* access modifiers changed from: package-private */
    public void a(Map<String, View> map, View view) {
        String A = b0.A(view);
        if (A != null) {
            map.put(A, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                if (childAt.getVisibility() == 0) {
                    a(map, childAt);
                }
            }
        }
    }
}
