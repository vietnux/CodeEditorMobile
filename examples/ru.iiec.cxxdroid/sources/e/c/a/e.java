package e.c.a;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.mikepenz.aboutlibraries.ui.b.a;
import com.mikepenz.aboutlibraries.ui.b.b;
import e.c.a.c;
import g.n;
import g.r.c.l;
import g.r.d.j;
import g.r.d.m;
import g.r.d.o;
import g.t.g;

public final class e {

    /* renamed from: g  reason: collision with root package name */
    private static final g.d f8107g = g.e.a(a.f8114c);

    /* renamed from: h  reason: collision with root package name */
    public static final b f8108h = new b(null);
    private d a;

    /* renamed from: b  reason: collision with root package name */
    private f f8109b;

    /* renamed from: c  reason: collision with root package name */
    private AbstractC0117e f8110c;

    /* renamed from: d  reason: collision with root package name */
    private RecyclerView.m f8111d;

    /* renamed from: e  reason: collision with root package name */
    private a f8112e;

    /* renamed from: f  reason: collision with root package name */
    private l<? super TextView, n> f8113f;

    static final class a extends j implements g.r.c.a<e> {

        /* renamed from: c  reason: collision with root package name */
        public static final a f8114c = new a();

        a() {
            super(0);
        }

        @Override // g.r.c.a
        public final e c() {
            return c.f8115b.a();
        }
    }

    public static final class b {
        static final /* synthetic */ g[] a;

        static {
            m mVar = new m(o.a(b.class), "instance", "getInstance()Lcom/mikepenz/aboutlibraries/LibsConfiguration;");
            o.a(mVar);
            a = new g[]{mVar};
        }

        private b() {
        }

        public /* synthetic */ b(g.r.d.g gVar) {
            this();
        }

        public final e a() {
            g.d dVar = e.f8107g;
            b bVar = e.f8108h;
            g gVar = a[0];
            return (e) dVar.getValue();
        }
    }

    /* access modifiers changed from: private */
    public static final class c {
        private static final e a = new e(null);

        /* renamed from: b  reason: collision with root package name */
        public static final c f8115b = new c();

        private c() {
        }

        public final e a() {
            return a;
        }
    }

    public interface d {
        void a(View view);

        boolean a(View view, c.d dVar);

        boolean a(View view, e.c.a.o.a aVar);

        boolean b(View view);

        boolean b(View view, e.c.a.o.a aVar);

        boolean c(View view, e.c.a.o.a aVar);

        boolean d(View view, e.c.a.o.a aVar);

        boolean e(View view, e.c.a.o.a aVar);

        boolean f(View view, e.c.a.o.a aVar);
    }

    /* renamed from: e.c.a.e$e  reason: collision with other inner class name */
    public interface AbstractC0117e {
        void a(a.C0093a aVar);

        void a(b.a aVar);
    }

    public interface f {
        View a(View view);

        View b(View view);
    }

    private e() {
    }

    public /* synthetic */ e(g.r.d.g gVar) {
        this();
    }

    public final RecyclerView.m a() {
        return this.f8111d;
    }

    public final a b() {
        return this.f8112e;
    }

    public final AbstractC0117e c() {
        return this.f8110c;
    }

    public final d d() {
        return this.a;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: g.r.c.l<? super android.widget.TextView, g.n>, g.r.c.l<android.widget.TextView, g.n> */
    public final l<TextView, n> e() {
        return this.f8113f;
    }

    public final f f() {
        return this.f8109b;
    }
}
