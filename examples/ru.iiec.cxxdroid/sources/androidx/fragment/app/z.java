package androidx.fragment.app;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.app.n;
import c.h.l.b0;
import c.h.l.x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* access modifiers changed from: package-private */
public class z {
    private static final int[] a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10};

    /* renamed from: b  reason: collision with root package name */
    static final b0 f1396b = (Build.VERSION.SDK_INT >= 21 ? new a0() : null);

    /* renamed from: c  reason: collision with root package name */
    static final b0 f1397c = a();

    /* access modifiers changed from: package-private */
    public class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ g f1398b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Fragment f1399c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ c.h.h.b f1400d;

        a(g gVar, Fragment fragment, c.h.h.b bVar) {
            this.f1398b = gVar;
            this.f1399c = fragment;
            this.f1400d = bVar;
        }

        public void run() {
            this.f1398b.a(this.f1399c, this.f1400d);
        }
    }

    /* access modifiers changed from: package-private */
    public class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ArrayList f1401b;

        b(ArrayList arrayList) {
            this.f1401b = arrayList;
        }

        public void run() {
            z.a(this.f1401b, 4);
        }
    }

    /* access modifiers changed from: package-private */
    public class c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ g f1402b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Fragment f1403c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ c.h.h.b f1404d;

        c(g gVar, Fragment fragment, c.h.h.b bVar) {
            this.f1402b = gVar;
            this.f1403c = fragment;
            this.f1404d = bVar;
        }

        public void run() {
            this.f1402b.a(this.f1403c, this.f1404d);
        }
    }

    /* access modifiers changed from: package-private */
    public class d implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Object f1405b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ b0 f1406c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ View f1407d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Fragment f1408e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ArrayList f1409f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ ArrayList f1410g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ ArrayList f1411h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ Object f1412i;

        d(Object obj, b0 b0Var, View view, Fragment fragment, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
            this.f1405b = obj;
            this.f1406c = b0Var;
            this.f1407d = view;
            this.f1408e = fragment;
            this.f1409f = arrayList;
            this.f1410g = arrayList2;
            this.f1411h = arrayList3;
            this.f1412i = obj2;
        }

        public void run() {
            Object obj = this.f1405b;
            if (obj != null) {
                this.f1406c.b(obj, this.f1407d);
                this.f1410g.addAll(z.a(this.f1406c, this.f1405b, this.f1408e, this.f1409f, this.f1407d));
            }
            if (this.f1411h != null) {
                if (this.f1412i != null) {
                    ArrayList<View> arrayList = new ArrayList<>();
                    arrayList.add(this.f1407d);
                    this.f1406c.a(this.f1412i, this.f1411h, arrayList);
                }
                this.f1411h.clear();
                this.f1411h.add(this.f1407d);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class e implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Fragment f1413b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Fragment f1414c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f1415d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ c.e.a f1416e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ View f1417f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ b0 f1418g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Rect f1419h;

        e(Fragment fragment, Fragment fragment2, boolean z, c.e.a aVar, View view, b0 b0Var, Rect rect) {
            this.f1413b = fragment;
            this.f1414c = fragment2;
            this.f1415d = z;
            this.f1416e = aVar;
            this.f1417f = view;
            this.f1418g = b0Var;
            this.f1419h = rect;
        }

        public void run() {
            z.a(this.f1413b, this.f1414c, this.f1415d, (c.e.a<String, View>) this.f1416e, false);
            View view = this.f1417f;
            if (view != null) {
                this.f1418g.a(view, this.f1419h);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class f implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b0 f1420b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ c.e.a f1421c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Object f1422d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ h f1423e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ArrayList f1424f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ View f1425g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Fragment f1426h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ Fragment f1427i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ boolean f1428j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ ArrayList f1429k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ Object f1430l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ Rect f1431m;

        f(b0 b0Var, c.e.a aVar, Object obj, h hVar, ArrayList arrayList, View view, Fragment fragment, Fragment fragment2, boolean z, ArrayList arrayList2, Object obj2, Rect rect) {
            this.f1420b = b0Var;
            this.f1421c = aVar;
            this.f1422d = obj;
            this.f1423e = hVar;
            this.f1424f = arrayList;
            this.f1425g = view;
            this.f1426h = fragment;
            this.f1427i = fragment2;
            this.f1428j = z;
            this.f1429k = arrayList2;
            this.f1430l = obj2;
            this.f1431m = rect;
        }

        public void run() {
            c.e.a<String, View> a = z.a(this.f1420b, this.f1421c, this.f1422d, this.f1423e);
            if (a != null) {
                this.f1424f.addAll(a.values());
                this.f1424f.add(this.f1425g);
            }
            z.a(this.f1426h, this.f1427i, this.f1428j, a, false);
            Object obj = this.f1422d;
            if (obj != null) {
                this.f1420b.b(obj, this.f1429k, this.f1424f);
                View a2 = z.a(a, this.f1423e, this.f1430l, this.f1428j);
                if (a2 != null) {
                    this.f1420b.a(a2, this.f1431m);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public interface g {
        void a(Fragment fragment, c.h.h.b bVar);

        void b(Fragment fragment, c.h.h.b bVar);
    }

    /* access modifiers changed from: package-private */
    public static class h {
        public Fragment a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f1432b;

        /* renamed from: c  reason: collision with root package name */
        public a f1433c;

        /* renamed from: d  reason: collision with root package name */
        public Fragment f1434d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f1435e;

        /* renamed from: f  reason: collision with root package name */
        public a f1436f;

        h() {
        }
    }

    static View a(c.e.a<String, View> aVar, h hVar, Object obj, boolean z) {
        ArrayList<String> arrayList;
        a aVar2 = hVar.f1433c;
        if (obj == null || aVar == null || (arrayList = aVar2.f1388m) == null || arrayList.isEmpty()) {
            return null;
        }
        return aVar.get((z ? aVar2.f1388m : aVar2.n).get(0));
    }

    private static b0 a() {
        try {
            return (b0) Class.forName("c.t.e").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    private static b0 a(Fragment fragment, Fragment fragment2) {
        ArrayList arrayList = new ArrayList();
        if (fragment != null) {
            Object r = fragment.r();
            if (r != null) {
                arrayList.add(r);
            }
            Object F = fragment.F();
            if (F != null) {
                arrayList.add(F);
            }
            Object H = fragment.H();
            if (H != null) {
                arrayList.add(H);
            }
        }
        if (fragment2 != null) {
            Object o = fragment2.o();
            if (o != null) {
                arrayList.add(o);
            }
            Object D = fragment2.D();
            if (D != null) {
                arrayList.add(D);
            }
            Object G = fragment2.G();
            if (G != null) {
                arrayList.add(G);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        b0 b0Var = f1396b;
        if (b0Var != null && a(b0Var, arrayList)) {
            return f1396b;
        }
        b0 b0Var2 = f1397c;
        if (b0Var2 != null && a(b0Var2, arrayList)) {
            return f1397c;
        }
        if (f1396b == null && f1397c == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    private static h a(h hVar, SparseArray<h> sparseArray, int i2) {
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h();
        sparseArray.put(i2, hVar2);
        return hVar2;
    }

    private static c.e.a<String, String> a(int i2, ArrayList<a> arrayList, ArrayList<Boolean> arrayList2, int i3, int i4) {
        ArrayList<String> arrayList3;
        ArrayList<String> arrayList4;
        c.e.a<String, String> aVar = new c.e.a<>();
        for (int i5 = i4 - 1; i5 >= i3; i5--) {
            a aVar2 = arrayList.get(i5);
            if (aVar2.b(i2)) {
                boolean booleanValue = arrayList2.get(i5).booleanValue();
                ArrayList<String> arrayList5 = aVar2.f1388m;
                if (arrayList5 != null) {
                    int size = arrayList5.size();
                    if (booleanValue) {
                        arrayList3 = aVar2.f1388m;
                        arrayList4 = aVar2.n;
                    } else {
                        ArrayList<String> arrayList6 = aVar2.f1388m;
                        arrayList3 = aVar2.n;
                        arrayList4 = arrayList6;
                    }
                    for (int i6 = 0; i6 < size; i6++) {
                        String str = arrayList4.get(i6);
                        String str2 = arrayList3.get(i6);
                        String remove = aVar.remove(str2);
                        if (remove != null) {
                            aVar.put(str, remove);
                        } else {
                            aVar.put(str, str2);
                        }
                    }
                }
            }
        }
        return aVar;
    }

    static c.e.a<String, View> a(b0 b0Var, c.e.a<String, String> aVar, Object obj, h hVar) {
        n nVar;
        ArrayList<String> arrayList;
        String a2;
        Fragment fragment = hVar.a;
        View L = fragment.L();
        if (aVar.isEmpty() || obj == null || L == null) {
            aVar.clear();
            return null;
        }
        c.e.a<String, View> aVar2 = new c.e.a<>();
        b0Var.a((Map<String, View>) aVar2, L);
        a aVar3 = hVar.f1433c;
        if (hVar.f1432b) {
            nVar = fragment.s();
            arrayList = aVar3.f1388m;
        } else {
            nVar = fragment.p();
            arrayList = aVar3.n;
        }
        if (arrayList != null) {
            aVar2.a((Collection<?>) arrayList);
            aVar2.a((Collection<?>) aVar.values());
        }
        if (nVar != null) {
            nVar.a(arrayList, aVar2);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = arrayList.get(size);
                View view = aVar2.get(str);
                if (view == null) {
                    String a3 = a(aVar, str);
                    if (a3 != null) {
                        aVar.remove(a3);
                    }
                } else if (!str.equals(b0.A(view)) && (a2 = a(aVar, str)) != null) {
                    aVar.put(a2, b0.A(view));
                }
            }
        } else {
            a(aVar, aVar2);
        }
        return aVar2;
    }

    private static Object a(b0 b0Var, ViewGroup viewGroup, View view, c.e.a<String, String> aVar, h hVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        c.e.a<String, String> aVar2;
        Object obj3;
        Object obj4;
        Rect rect;
        Fragment fragment = hVar.a;
        Fragment fragment2 = hVar.f1434d;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z = hVar.f1432b;
        if (aVar.isEmpty()) {
            aVar2 = aVar;
            obj3 = null;
        } else {
            obj3 = a(b0Var, fragment, fragment2, z);
            aVar2 = aVar;
        }
        c.e.a<String, View> b2 = b(b0Var, aVar2, obj3, hVar);
        if (aVar.isEmpty()) {
            obj4 = null;
        } else {
            arrayList.addAll(b2.values());
            obj4 = obj3;
        }
        if (obj == null && obj2 == null && obj4 == null) {
            return null;
        }
        a(fragment, fragment2, z, b2, true);
        if (obj4 != null) {
            rect = new Rect();
            b0Var.b(obj4, view, arrayList);
            a(b0Var, obj4, obj2, b2, hVar.f1435e, hVar.f1436f);
            if (obj != null) {
                b0Var.a(obj, rect);
            }
        } else {
            rect = null;
        }
        x.a(viewGroup, new f(b0Var, aVar, obj4, hVar, arrayList2, view, fragment, fragment2, z, arrayList, obj, rect));
        return obj4;
    }

    private static Object a(b0 b0Var, Fragment fragment, Fragment fragment2, boolean z) {
        if (fragment == null || fragment2 == null) {
            return null;
        }
        return b0Var.c(b0Var.b(z ? fragment2.H() : fragment.G()));
    }

    private static Object a(b0 b0Var, Fragment fragment, boolean z) {
        if (fragment == null) {
            return null;
        }
        return b0Var.b(z ? fragment.D() : fragment.o());
    }

    private static Object a(b0 b0Var, Object obj, Object obj2, Object obj3, Fragment fragment, boolean z) {
        return (obj == null || obj2 == null || fragment == null) ? true : z ? fragment.h() : fragment.g() ? b0Var.b(obj2, obj, obj3) : b0Var.a(obj2, obj, obj3);
    }

    static String a(c.e.a<String, String> aVar, String str) {
        int size = aVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (str.equals(aVar.d(i2))) {
                return aVar.b(i2);
            }
        }
        return null;
    }

    static ArrayList<View> a(b0 b0Var, Object obj, Fragment fragment, ArrayList<View> arrayList, View view) {
        if (obj == null) {
            return null;
        }
        ArrayList<View> arrayList2 = new ArrayList<>();
        View L = fragment.L();
        if (L != null) {
            b0Var.a(arrayList2, L);
        }
        if (arrayList != null) {
            arrayList2.removeAll(arrayList);
        }
        if (arrayList2.isEmpty()) {
            return arrayList2;
        }
        arrayList2.add(view);
        b0Var.a(obj, arrayList2);
        return arrayList2;
    }

    static void a(Context context, g gVar, ArrayList<a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3, boolean z, g gVar2) {
        ViewGroup viewGroup;
        SparseArray sparseArray = new SparseArray();
        for (int i4 = i2; i4 < i3; i4++) {
            a aVar = arrayList.get(i4);
            if (arrayList2.get(i4).booleanValue()) {
                b(aVar, sparseArray, z);
            } else {
                a(aVar, sparseArray, z);
            }
        }
        if (sparseArray.size() != 0) {
            View view = new View(context);
            int size = sparseArray.size();
            for (int i5 = 0; i5 < size; i5++) {
                int keyAt = sparseArray.keyAt(i5);
                c.e.a<String, String> a2 = a(keyAt, arrayList, arrayList2, i2, i3);
                h hVar = (h) sparseArray.valueAt(i5);
                if (gVar.b() && (viewGroup = (ViewGroup) gVar.a(keyAt)) != null) {
                    if (z) {
                        b(viewGroup, hVar, view, a2, gVar2);
                    } else {
                        a(viewGroup, hVar, view, a2, gVar2);
                    }
                }
            }
        }
    }

    private static void a(ViewGroup viewGroup, h hVar, View view, c.e.a<String, String> aVar, g gVar) {
        Object obj;
        Fragment fragment = hVar.a;
        Fragment fragment2 = hVar.f1434d;
        b0 a2 = a(fragment2, fragment);
        if (a2 != null) {
            boolean z = hVar.f1432b;
            boolean z2 = hVar.f1435e;
            Object a3 = a(a2, fragment, z);
            Object b2 = b(a2, fragment2, z2);
            ArrayList arrayList = new ArrayList();
            ArrayList<View> arrayList2 = new ArrayList<>();
            Object a4 = a(a2, viewGroup, view, aVar, hVar, arrayList, arrayList2, a3, b2);
            if (a3 == null && a4 == null) {
                obj = b2;
                if (obj == null) {
                    return;
                }
            } else {
                obj = b2;
            }
            ArrayList<View> a5 = a(a2, obj, fragment2, arrayList, view);
            if (a5 == null || a5.isEmpty()) {
                obj = null;
            }
            a2.a(a3, view);
            Object a6 = a(a2, a3, obj, a4, fragment, hVar.f1432b);
            if (!(fragment2 == null || a5 == null || (a5.size() <= 0 && arrayList.size() <= 0))) {
                c.h.h.b bVar = new c.h.h.b();
                gVar.b(fragment2, bVar);
                a2.a(fragment2, a6, bVar, new c(gVar, fragment2, bVar));
            }
            if (a6 != null) {
                ArrayList<View> arrayList3 = new ArrayList<>();
                a2.a(a6, a3, arrayList3, obj, a5, a4, arrayList2);
                a(a2, viewGroup, fragment, view, arrayList2, a3, arrayList3, obj, a5);
                a2.a((View) viewGroup, arrayList2, (Map<String, String>) aVar);
                a2.a(viewGroup, a6);
                a2.a(viewGroup, arrayList2, (Map<String, String>) aVar);
            }
        }
    }

    static void a(Fragment fragment, Fragment fragment2, boolean z, c.e.a<String, View> aVar, boolean z2) {
        n p = z ? fragment2.p() : fragment.p();
        if (p != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int size = aVar == null ? 0 : aVar.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList2.add(aVar.b(i2));
                arrayList.add(aVar.d(i2));
            }
            if (z2) {
                p.b(arrayList2, arrayList, null);
            } else {
                p.a(arrayList2, arrayList, null);
            }
        }
    }

    public static void a(a aVar, SparseArray<h> sparseArray, boolean z) {
        int size = aVar.a.size();
        for (int i2 = 0; i2 < size; i2++) {
            a(aVar, aVar.a.get(i2), sparseArray, false, z);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0039, code lost:
        if (r0.f1171m != false) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x006e, code lost:
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0088, code lost:
        if (r0.A == false) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x008a, code lost:
        r9 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x00d7 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:91:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(androidx.fragment.app.a r8, androidx.fragment.app.y.a r9, android.util.SparseArray<androidx.fragment.app.z.h> r10, boolean r11, boolean r12) {
        /*
        // Method dump skipped, instructions count: 226
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.z.a(androidx.fragment.app.a, androidx.fragment.app.y$a, android.util.SparseArray, boolean, boolean):void");
    }

    private static void a(b0 b0Var, ViewGroup viewGroup, Fragment fragment, View view, ArrayList<View> arrayList, Object obj, ArrayList<View> arrayList2, Object obj2, ArrayList<View> arrayList3) {
        x.a(viewGroup, new d(obj, b0Var, view, fragment, arrayList, arrayList2, arrayList3, obj2));
    }

    private static void a(b0 b0Var, Object obj, Fragment fragment, ArrayList<View> arrayList) {
        if (fragment != null && obj != null && fragment.f1171m && fragment.A && fragment.N) {
            fragment.h(true);
            b0Var.a(obj, fragment.L(), arrayList);
            x.a(fragment.H, new b(arrayList));
        }
    }

    private static void a(b0 b0Var, Object obj, Object obj2, c.e.a<String, View> aVar, boolean z, a aVar2) {
        ArrayList<String> arrayList = aVar2.f1388m;
        if (arrayList != null && !arrayList.isEmpty()) {
            View view = aVar.get((z ? aVar2.n : aVar2.f1388m).get(0));
            b0Var.c(obj, view);
            if (obj2 != null) {
                b0Var.c(obj2, view);
            }
        }
    }

    static void a(c.e.a<String, String> aVar, c.e.a<String, View> aVar2) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            if (!aVar2.containsKey(aVar.d(size))) {
                aVar.c(size);
            }
        }
    }

    static void a(ArrayList<View> arrayList, int i2) {
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).setVisibility(i2);
            }
        }
    }

    private static void a(ArrayList<View> arrayList, c.e.a<String, View> aVar, Collection<String> collection) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View d2 = aVar.d(size);
            if (collection.contains(b0.A(d2))) {
                arrayList.add(d2);
            }
        }
    }

    private static boolean a(b0 b0Var, List<Object> list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (!b0Var.a(list.get(i2))) {
                return false;
            }
        }
        return true;
    }

    private static c.e.a<String, View> b(b0 b0Var, c.e.a<String, String> aVar, Object obj, h hVar) {
        n nVar;
        ArrayList<String> arrayList;
        if (aVar.isEmpty() || obj == null) {
            aVar.clear();
            return null;
        }
        Fragment fragment = hVar.f1434d;
        c.e.a<String, View> aVar2 = new c.e.a<>();
        b0Var.a((Map<String, View>) aVar2, fragment.t0());
        a aVar3 = hVar.f1436f;
        if (hVar.f1435e) {
            nVar = fragment.p();
            arrayList = aVar3.n;
        } else {
            nVar = fragment.s();
            arrayList = aVar3.f1388m;
        }
        if (arrayList != null) {
            aVar2.a((Collection<?>) arrayList);
        }
        if (nVar != null) {
            nVar.a(arrayList, aVar2);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = arrayList.get(size);
                View view = aVar2.get(str);
                if (view == null) {
                    aVar.remove(str);
                } else if (!str.equals(b0.A(view))) {
                    aVar.put(b0.A(view), aVar.remove(str));
                }
            }
        } else {
            aVar.a((Collection<?>) aVar2.keySet());
        }
        return aVar2;
    }

    private static Object b(b0 b0Var, ViewGroup viewGroup, View view, c.e.a<String, String> aVar, h hVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object obj3;
        Rect rect;
        View view2;
        Fragment fragment = hVar.a;
        Fragment fragment2 = hVar.f1434d;
        if (fragment != null) {
            fragment.t0().setVisibility(0);
        }
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z = hVar.f1432b;
        Object a2 = aVar.isEmpty() ? null : a(b0Var, fragment, fragment2, z);
        c.e.a<String, View> b2 = b(b0Var, aVar, a2, hVar);
        c.e.a<String, View> a3 = a(b0Var, aVar, a2, hVar);
        if (aVar.isEmpty()) {
            if (b2 != null) {
                b2.clear();
            }
            if (a3 != null) {
                a3.clear();
            }
            obj3 = null;
        } else {
            a(arrayList, b2, aVar.keySet());
            a(arrayList2, a3, aVar.values());
            obj3 = a2;
        }
        if (obj == null && obj2 == null && obj3 == null) {
            return null;
        }
        a(fragment, fragment2, z, b2, true);
        if (obj3 != null) {
            arrayList2.add(view);
            b0Var.b(obj3, view, arrayList);
            a(b0Var, obj3, obj2, b2, hVar.f1435e, hVar.f1436f);
            Rect rect2 = new Rect();
            View a4 = a(a3, hVar, obj, z);
            if (a4 != null) {
                b0Var.a(obj, rect2);
            }
            rect = rect2;
            view2 = a4;
        } else {
            view2 = null;
            rect = null;
        }
        x.a(viewGroup, new e(fragment, fragment2, z, a3, view2, b0Var, rect));
        return obj3;
    }

    private static Object b(b0 b0Var, Fragment fragment, boolean z) {
        if (fragment == null) {
            return null;
        }
        return b0Var.b(z ? fragment.F() : fragment.r());
    }

    private static void b(ViewGroup viewGroup, h hVar, View view, c.e.a<String, String> aVar, g gVar) {
        Object obj;
        Fragment fragment = hVar.a;
        Fragment fragment2 = hVar.f1434d;
        b0 a2 = a(fragment2, fragment);
        if (a2 != null) {
            boolean z = hVar.f1432b;
            boolean z2 = hVar.f1435e;
            ArrayList<View> arrayList = new ArrayList<>();
            ArrayList<View> arrayList2 = new ArrayList<>();
            Object a3 = a(a2, fragment, z);
            Object b2 = b(a2, fragment2, z2);
            Object b3 = b(a2, viewGroup, view, aVar, hVar, arrayList2, arrayList, a3, b2);
            if (a3 == null && b3 == null) {
                obj = b2;
                if (obj == null) {
                    return;
                }
            } else {
                obj = b2;
            }
            ArrayList<View> a4 = a(a2, obj, fragment2, arrayList2, view);
            ArrayList<View> a5 = a(a2, a3, fragment, arrayList, view);
            a(a5, 4);
            Object a6 = a(a2, a3, obj, b3, fragment, z);
            if (!(fragment2 == null || a4 == null || (a4.size() <= 0 && arrayList2.size() <= 0))) {
                c.h.h.b bVar = new c.h.h.b();
                gVar.b(fragment2, bVar);
                a2.a(fragment2, a6, bVar, new a(gVar, fragment2, bVar));
            }
            if (a6 != null) {
                a(a2, obj, fragment2, a4);
                ArrayList<String> a7 = a2.a(arrayList);
                a2.a(a6, a3, a5, obj, a4, b3, arrayList);
                a2.a(viewGroup, a6);
                a2.a(viewGroup, arrayList2, arrayList, a7, aVar);
                a(a5, 0);
                a2.b(b3, arrayList2, arrayList);
            }
        }
    }

    public static void b(a aVar, SparseArray<h> sparseArray, boolean z) {
        if (aVar.q.r().b()) {
            for (int size = aVar.a.size() - 1; size >= 0; size--) {
                a(aVar, aVar.a.get(size), sparseArray, true, z);
            }
        }
    }
}
