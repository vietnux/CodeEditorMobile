package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import c.h.l.d0;
import c.h.l.x;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@SuppressLint({"UnknownNullness"})
public abstract class b0 {

    class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f1209b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ArrayList f1210c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ArrayList f1211d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ArrayList f1212e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ArrayList f1213f;

        a(b0 b0Var, int i2, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.f1209b = i2;
            this.f1210c = arrayList;
            this.f1211d = arrayList2;
            this.f1212e = arrayList3;
            this.f1213f = arrayList4;
        }

        public void run() {
            for (int i2 = 0; i2 < this.f1209b; i2++) {
                c.h.l.b0.a((View) this.f1210c.get(i2), (String) this.f1211d.get(i2));
                c.h.l.b0.a((View) this.f1212e.get(i2), (String) this.f1213f.get(i2));
            }
        }
    }

    class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ArrayList f1214b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Map f1215c;

        b(b0 b0Var, ArrayList arrayList, Map map) {
            this.f1214b = arrayList;
            this.f1215c = map;
        }

        public void run() {
            int size = this.f1214b.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = (View) this.f1214b.get(i2);
                String A = c.h.l.b0.A(view);
                if (A != null) {
                    c.h.l.b0.a(view, b0.a(this.f1215c, A));
                }
            }
        }
    }

    class c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ArrayList f1216b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Map f1217c;

        c(b0 b0Var, ArrayList arrayList, Map map) {
            this.f1216b = arrayList;
            this.f1217c = map;
        }

        public void run() {
            int size = this.f1216b.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = (View) this.f1216b.get(i2);
                c.h.l.b0.a(view, (String) this.f1217c.get(c.h.l.b0.A(view)));
            }
        }
    }

    static String a(Map<String, String> map, String str) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (str.equals(entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }

    protected static void a(List<View> list, View view) {
        int size = list.size();
        if (!a(list, view, size)) {
            if (c.h.l.b0.A(view) != null) {
                list.add(view);
            }
            for (int i2 = size; i2 < list.size(); i2++) {
                View view2 = list.get(i2);
                if (view2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view2;
                    int childCount = viewGroup.getChildCount();
                    for (int i3 = 0; i3 < childCount; i3++) {
                        View childAt = viewGroup.getChildAt(i3);
                        if (!a(list, childAt, size) && c.h.l.b0.A(childAt) != null) {
                            list.add(childAt);
                        }
                    }
                }
            }
        }
    }

    protected static boolean a(List list) {
        return list == null || list.isEmpty();
    }

    private static boolean a(List<View> list, View view, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            if (list.get(i3) == view) {
                return true;
            }
        }
        return false;
    }

    public abstract Object a(Object obj, Object obj2, Object obj3);

    /* access modifiers changed from: package-private */
    public ArrayList<String> a(ArrayList<View> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view = arrayList.get(i2);
            arrayList2.add(c.h.l.b0.A(view));
            c.h.l.b0.a(view, (String) null);
        }
        return arrayList2;
    }

    /* access modifiers changed from: protected */
    public void a(View view, Rect rect) {
        if (c.h.l.b0.H(view)) {
            RectF rectF = new RectF();
            rectF.set(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
            view.getMatrix().mapRect(rectF);
            rectF.offset((float) view.getLeft(), (float) view.getTop());
            ViewParent parent = view.getParent();
            while (parent instanceof View) {
                View view2 = (View) parent;
                rectF.offset((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
                view2.getMatrix().mapRect(rectF);
                rectF.offset((float) view2.getLeft(), (float) view2.getTop());
                parent = view2.getParent();
            }
            int[] iArr = new int[2];
            view.getRootView().getLocationOnScreen(iArr);
            rectF.offset((float) iArr[0], (float) iArr[1]);
            rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        }
    }

    /* access modifiers changed from: package-private */
    public void a(View view, ArrayList<View> arrayList, ArrayList<View> arrayList2, ArrayList<String> arrayList3, Map<String, String> map) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i2 = 0; i2 < size; i2++) {
            View view2 = arrayList.get(i2);
            String A = c.h.l.b0.A(view2);
            arrayList4.add(A);
            if (A != null) {
                c.h.l.b0.a(view2, (String) null);
                String str = map.get(A);
                int i3 = 0;
                while (true) {
                    if (i3 >= size) {
                        break;
                    } else if (str.equals(arrayList3.get(i3))) {
                        c.h.l.b0.a(arrayList2.get(i3), A);
                        break;
                    } else {
                        i3++;
                    }
                }
            }
        }
        x.a(view, new a(this, size, arrayList2, arrayList3, arrayList, arrayList4));
    }

    /* access modifiers changed from: package-private */
    public void a(View view, ArrayList<View> arrayList, Map<String, String> map) {
        x.a(view, new b(this, arrayList, map));
    }

    public abstract void a(ViewGroup viewGroup, Object obj);

    /* access modifiers changed from: package-private */
    public void a(ViewGroup viewGroup, ArrayList<View> arrayList, Map<String, String> map) {
        x.a(viewGroup, new c(this, arrayList, map));
    }

    public void a(Fragment fragment, Object obj, c.h.h.b bVar, Runnable runnable) {
        runnable.run();
    }

    public abstract void a(Object obj, Rect rect);

    public abstract void a(Object obj, View view);

    public abstract void a(Object obj, View view, ArrayList<View> arrayList);

    public abstract void a(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    public abstract void a(Object obj, ArrayList<View> arrayList);

    public abstract void a(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.ArrayList<android.view.View> */
    /* JADX WARN: Multi-variable type inference failed */
    /* access modifiers changed from: package-private */
    public void a(ArrayList<View> arrayList, View view) {
        if (view.getVisibility() == 0) {
            boolean z = view instanceof ViewGroup;
            ViewGroup viewGroup = view;
            if (z) {
                ViewGroup viewGroup2 = (ViewGroup) view;
                boolean a2 = d0.a(viewGroup2);
                viewGroup = viewGroup2;
                if (!a2) {
                    int childCount = viewGroup2.getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        a(arrayList, viewGroup2.getChildAt(i2));
                    }
                    return;
                }
            }
            arrayList.add(viewGroup == 1 ? 1 : 0);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(Map<String, View> map, View view) {
        if (view.getVisibility() == 0) {
            String A = c.h.l.b0.A(view);
            if (A != null) {
                map.put(A, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    a(map, viewGroup.getChildAt(i2));
                }
            }
        }
    }

    public abstract boolean a(Object obj);

    public abstract Object b(Object obj);

    public abstract Object b(Object obj, Object obj2, Object obj3);

    public abstract void b(Object obj, View view);

    public abstract void b(Object obj, View view, ArrayList<View> arrayList);

    public abstract void b(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    public abstract Object c(Object obj);

    public abstract void c(Object obj, View view);
}
