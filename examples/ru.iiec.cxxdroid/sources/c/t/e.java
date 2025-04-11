package c.t;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.b0;
import c.t.m;
import java.util.ArrayList;
import java.util.List;

public class e extends b0 {

    class a extends m.e {
        a(e eVar, Rect rect) {
        }
    }

    class b implements m.f {
        final /* synthetic */ View a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ArrayList f2559b;

        b(e eVar, View view, ArrayList arrayList) {
            this.a = view;
            this.f2559b = arrayList;
        }

        @Override // c.t.m.f
        public void a(m mVar) {
        }

        @Override // c.t.m.f
        public void b(m mVar) {
        }

        @Override // c.t.m.f
        public void c(m mVar) {
        }

        @Override // c.t.m.f
        public void d(m mVar) {
            mVar.b(this);
            this.a.setVisibility(8);
            int size = this.f2559b.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((View) this.f2559b.get(i2)).setVisibility(0);
            }
        }
    }

    class c implements m.f {
        final /* synthetic */ Object a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ArrayList f2560b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Object f2561c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ArrayList f2562d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Object f2563e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ArrayList f2564f;

        c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.a = obj;
            this.f2560b = arrayList;
            this.f2561c = obj2;
            this.f2562d = arrayList2;
            this.f2563e = obj3;
            this.f2564f = arrayList3;
        }

        @Override // c.t.m.f
        public void a(m mVar) {
            Object obj = this.a;
            if (obj != null) {
                e.this.a(obj, this.f2560b, (ArrayList<View>) null);
            }
            Object obj2 = this.f2561c;
            if (obj2 != null) {
                e.this.a(obj2, this.f2562d, (ArrayList<View>) null);
            }
            Object obj3 = this.f2563e;
            if (obj3 != null) {
                e.this.a(obj3, this.f2564f, (ArrayList<View>) null);
            }
        }

        @Override // c.t.m.f
        public void b(m mVar) {
        }

        @Override // c.t.m.f
        public void c(m mVar) {
        }

        @Override // c.t.m.f
        public void d(m mVar) {
        }
    }

    class d extends m.e {
        d(e eVar, Rect rect) {
        }
    }

    private static boolean a(m mVar) {
        return !b0.a(mVar.i()) || !b0.a(mVar.j()) || !b0.a(mVar.k());
    }

    @Override // androidx.fragment.app.b0
    public Object a(Object obj, Object obj2, Object obj3) {
        m mVar = (m) obj;
        m mVar2 = (m) obj2;
        m mVar3 = (m) obj3;
        if (mVar != null && mVar2 != null) {
            q qVar = new q();
            qVar.a(mVar);
            qVar.a(mVar2);
            qVar.b(1);
            mVar = qVar;
        } else if (mVar == null) {
            mVar = mVar2 != null ? mVar2 : null;
        }
        if (mVar3 == null) {
            return mVar;
        }
        q qVar2 = new q();
        if (mVar != null) {
            qVar2.a(mVar);
        }
        qVar2.a(mVar3);
        return qVar2;
    }

    @Override // androidx.fragment.app.b0
    public void a(ViewGroup viewGroup, Object obj) {
        o.a(viewGroup, (m) obj);
    }

    @Override // androidx.fragment.app.b0
    public void a(Object obj, Rect rect) {
        if (obj != null) {
            ((m) obj).a(new d(this, rect));
        }
    }

    @Override // androidx.fragment.app.b0
    public void a(Object obj, View view) {
        if (obj != null) {
            ((m) obj).a(view);
        }
    }

    @Override // androidx.fragment.app.b0
    public void a(Object obj, View view, ArrayList<View> arrayList) {
        ((m) obj).a(new b(this, view, arrayList));
    }

    @Override // androidx.fragment.app.b0
    public void a(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((m) obj).a(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // androidx.fragment.app.b0
    public void a(Object obj, ArrayList<View> arrayList) {
        m mVar = (m) obj;
        if (mVar != null) {
            int i2 = 0;
            if (mVar instanceof q) {
                q qVar = (q) mVar;
                int t = qVar.t();
                while (i2 < t) {
                    a(qVar.a(i2), arrayList);
                    i2++;
                }
            } else if (!a(mVar) && b0.a((List) mVar.p())) {
                int size = arrayList.size();
                while (i2 < size) {
                    mVar.a(arrayList.get(i2));
                    i2++;
                }
            }
        }
    }

    @Override // androidx.fragment.app.b0
    public void a(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        m mVar = (m) obj;
        int i2 = 0;
        if (mVar instanceof q) {
            q qVar = (q) mVar;
            int t = qVar.t();
            while (i2 < t) {
                a((Object) qVar.a(i2), arrayList, arrayList2);
                i2++;
            }
        } else if (!a(mVar)) {
            List<View> p = mVar.p();
            if (p.size() == arrayList.size() && p.containsAll(arrayList)) {
                int size = arrayList2 == null ? 0 : arrayList2.size();
                while (i2 < size) {
                    mVar.a(arrayList2.get(i2));
                    i2++;
                }
                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    mVar.d(arrayList.get(size2));
                }
            }
        }
    }

    @Override // androidx.fragment.app.b0
    public boolean a(Object obj) {
        return obj instanceof m;
    }

    @Override // androidx.fragment.app.b0
    public Object b(Object obj) {
        if (obj != null) {
            return ((m) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.b0
    public Object b(Object obj, Object obj2, Object obj3) {
        q qVar = new q();
        if (obj != null) {
            qVar.a((m) obj);
        }
        if (obj2 != null) {
            qVar.a((m) obj2);
        }
        if (obj3 != null) {
            qVar.a((m) obj3);
        }
        return qVar;
    }

    @Override // androidx.fragment.app.b0
    public void b(Object obj, View view) {
        if (obj != null) {
            ((m) obj).d(view);
        }
    }

    @Override // androidx.fragment.app.b0
    public void b(Object obj, View view, ArrayList<View> arrayList) {
        q qVar = (q) obj;
        List<View> p = qVar.p();
        p.clear();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            b0.a(p, arrayList.get(i2));
        }
        p.add(view);
        arrayList.add(view);
        a(qVar, arrayList);
    }

    @Override // androidx.fragment.app.b0
    public void b(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        q qVar = (q) obj;
        if (qVar != null) {
            qVar.p().clear();
            qVar.p().addAll(arrayList2);
            a((Object) qVar, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.b0
    public Object c(Object obj) {
        if (obj == null) {
            return null;
        }
        q qVar = new q();
        qVar.a((m) obj);
        return qVar;
    }

    @Override // androidx.fragment.app.b0
    public void c(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            a(view, rect);
            ((m) obj).a(new a(this, rect));
        }
    }
}
