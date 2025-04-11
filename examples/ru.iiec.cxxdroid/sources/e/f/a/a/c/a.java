package e.f.a.a.c;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class a {
    private int a;

    /* renamed from: b  reason: collision with root package name */
    private int f8287b;

    /* renamed from: c  reason: collision with root package name */
    private a f8288c;

    /* renamed from: d  reason: collision with root package name */
    private final List<a> f8289d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    private AbstractC0120a f8290e;

    /* renamed from: f  reason: collision with root package name */
    private b f8291f;

    /* renamed from: g  reason: collision with root package name */
    private c f8292g;

    /* renamed from: h  reason: collision with root package name */
    private Object f8293h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f8294i;

    /* renamed from: e.f.a.a.c.a$a  reason: collision with other inner class name */
    public static abstract class AbstractC0120a<E> {
        protected int containerStyle;
        protected Context context;
        protected a mNode;
        private View mView;
        protected e.f.a.a.d.a tView;

        public AbstractC0120a(Context context2) {
            this.context = context2;
        }

        public abstract View createNodeView(a aVar, E e2);

        public int getContainerStyle() {
            return this.containerStyle;
        }

        public ViewGroup getNodeItemsView() {
            return (ViewGroup) getView().findViewById(e.f.a.a.a.node_items);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: e.f.a.a.c.a$a<E> */
        /* JADX WARN: Multi-variable type inference failed */
        public View getNodeView() {
            a aVar = this.mNode;
            return createNodeView(aVar, aVar.g());
        }

        public e.f.a.a.d.a getTreeView() {
            return this.tView;
        }

        public View getView() {
            View view = this.mView;
            if (view != null) {
                return view;
            }
            View nodeView = getNodeView();
            e.f.a.a.d.b bVar = new e.f.a.a.d.b(nodeView.getContext(), getContainerStyle());
            bVar.a(nodeView);
            this.mView = bVar;
            return this.mView;
        }

        public boolean isInitialized() {
            return this.mView != null;
        }

        public void setContainerStyle(int i2) {
            this.containerStyle = i2;
        }

        public void setTreeViev(e.f.a.a.d.a aVar) {
            this.tView = aVar;
        }

        public void toggle(boolean z) {
        }

        public void toggleSelectionMode(boolean z) {
        }
    }

    public interface b {
        void a(a aVar, Object obj);
    }

    public interface c {
        boolean a(a aVar, Object obj);
    }

    public a(Object obj) {
        this.f8293h = obj;
    }

    private int j() {
        int i2 = this.f8287b + 1;
        this.f8287b = i2;
        return i2;
    }

    public a a(AbstractC0120a aVar) {
        this.f8290e = aVar;
        if (aVar != null) {
            aVar.mNode = this;
        }
        return this;
    }

    public a a(a aVar) {
        aVar.f8288c = this;
        aVar.a = j();
        this.f8289d.add(aVar);
        return this;
    }

    public a a(boolean z) {
        this.f8294i = z;
        return this;
    }

    public List<a> a() {
        return Collections.unmodifiableList(this.f8289d);
    }

    public b b() {
        return this.f8291f;
    }

    public int c() {
        return this.a;
    }

    public int d() {
        int i2 = 0;
        a aVar = this;
        while (true) {
            aVar = aVar.f8288c;
            if (aVar == null) {
                return i2;
            }
            i2++;
        }
    }

    public c e() {
        return this.f8292g;
    }

    public String f() {
        StringBuilder sb = new StringBuilder();
        a aVar = this;
        while (aVar.f8288c != null) {
            sb.append(aVar.c());
            aVar = aVar.f8288c;
            if (aVar.f8288c != null) {
                sb.append(":");
            }
        }
        return sb.toString();
    }

    public Object g() {
        return this.f8293h;
    }

    public AbstractC0120a h() {
        return this.f8290e;
    }

    public boolean i() {
        return this.f8294i;
    }
}
