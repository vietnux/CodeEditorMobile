package e.c.a;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.c;
import e.c.a.e;
import e.c.b.b;
import e.c.b.l;
import g.k;
import g.n;
import g.r.d.i;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public final class f {
    private b<l<?>> a;

    /* renamed from: b  reason: collision with root package name */
    private e.c.b.r.a<l<?>> f8116b;

    /* renamed from: c  reason: collision with root package name */
    private d f8117c;

    /* renamed from: d  reason: collision with root package name */
    private ArrayList<e.c.a.o.a> f8118d = new ArrayList<>();

    /* renamed from: e  reason: collision with root package name */
    private Comparator<e.c.a.o.a> f8119e;

    /* renamed from: f  reason: collision with root package name */
    private a f8120f;

    public final class a extends AsyncTask<String, n, n> {
        private String a;

        /* renamed from: b  reason: collision with root package name */
        private Integer f8121b;

        /* renamed from: c  reason: collision with root package name */
        private Drawable f8122c;

        /* renamed from: d  reason: collision with root package name */
        private Context f8123d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ f f8124e;

        public a(f fVar, Context context) {
            i.d(context, "ctx");
            this.f8124e = fVar;
            this.f8123d = context;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(n nVar) {
            i.d(nVar, "nothing");
            f.d(this.f8124e).e();
            boolean z = f.a(this.f8124e).k() || f.a(this.f8124e).m() || f.a(this.f8124e).l();
            if (f.a(this.f8124e).j() && z) {
                e.c.b.r.a d2 = f.d(this.f8124e);
                com.mikepenz.aboutlibraries.ui.b.a aVar = new com.mikepenz.aboutlibraries.ui.b.a(f.a(this.f8124e));
                aVar.a(this.a);
                aVar.a(this.f8121b);
                aVar.a(this.f8122c);
                d2.a((Object[]) new l[]{aVar});
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f8124e.f8118d.iterator();
            while (it.hasNext()) {
                e.c.a.o.a aVar2 = (e.c.a.o.a) it.next();
                i.a((Object) aVar2, "library");
                arrayList.add(new com.mikepenz.aboutlibraries.ui.b.b(aVar2, f.a(this.f8124e)));
            }
            f.d(this.f8124e).a((List) arrayList);
            super.onPostExecute(nVar);
            a b2 = e.f8108h.a().b();
            if (b2 != null) {
                b2.a(f.d(this.f8124e));
            }
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Removed duplicated region for block: B:69:0x02c5  */
        /* JADX WARNING: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void a(java.lang.String... r13) {
            /*
            // Method dump skipped, instructions count: 722
            */
            throw new UnsupportedOperationException("Method not decompiled: e.c.a.f.a.a(java.lang.String[]):void");
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object[]] */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ n doInBackground(String[] strArr) {
            a(strArr);
            return n.a;
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            a b2 = e.f8108h.a().b();
            if (b2 != null) {
                b2.a();
            }
        }
    }

    public static final /* synthetic */ d a(f fVar) {
        d dVar = fVar.f8117c;
        if (dVar != null) {
            return dVar;
        }
        i.e("builder");
        throw null;
    }

    public static final /* synthetic */ e.c.b.r.a d(f fVar) {
        e.c.b.r.a<l<?>> aVar = fVar.f8116b;
        if (aVar != null) {
            return aVar;
        }
        i.e("mItemAdapter");
        throw null;
    }

    public final View a(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, Bundle bundle2) {
        RecyclerView recyclerView;
        View view;
        i.d(context, "context");
        i.d(layoutInflater, "inflater");
        if (bundle2 != null) {
            Serializable serializable = bundle2.getSerializable("data");
            if (serializable != null) {
                this.f8117c = (d) serializable;
                View inflate = layoutInflater.inflate(k.fragment_opensource, viewGroup, false);
                e.f f2 = e.f8108h.a().f();
                if (f2 != null) {
                    i.a((Object) inflate, "view");
                    View b2 = f2.b(inflate);
                    if (b2 != null) {
                        inflate = b2;
                    }
                }
                i.a((Object) inflate, "view");
                int id = inflate.getId();
                int i2 = j.cardListView;
                if (id == i2) {
                    recyclerView = (RecyclerView) inflate;
                } else {
                    View findViewById = inflate.findViewById(i2);
                    if (findViewById != null) {
                        recyclerView = (RecyclerView) findViewById;
                    } else {
                        throw new k("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
                    }
                }
                recyclerView.setLayoutManager(new LinearLayoutManager(context));
                recyclerView.setItemAnimator(e.f8108h.a().a() != null ? e.f8108h.a().a() : new c());
                this.f8116b = new e.c.b.r.a<>();
                b.a aVar = b.w;
                e.c.b.r.a<l<?>> aVar2 = this.f8116b;
                if (aVar2 != null) {
                    this.a = aVar.a(aVar2);
                    b<l<?>> bVar = this.a;
                    if (bVar != null) {
                        recyclerView.setAdapter(bVar);
                        d dVar = this.f8117c;
                        if (dVar != null) {
                            if (dVar.z()) {
                                e.c.b.r.a<l<?>> aVar3 = this.f8116b;
                                if (aVar3 != null) {
                                    aVar3.a((Object[]) new l[]{new com.mikepenz.aboutlibraries.ui.b.c()});
                                } else {
                                    i.e("mItemAdapter");
                                    throw null;
                                }
                            }
                            e.f f3 = e.f8108h.a().f();
                            if (f3 == null || (view = f3.a(inflate)) == null) {
                                view = inflate;
                            }
                            i.a((Object) view, "view");
                            return view;
                        }
                        i.e("builder");
                        throw null;
                    }
                    i.e("mAdapter");
                    throw null;
                }
                i.e("mItemAdapter");
                throw null;
            }
            throw new k("null cannot be cast to non-null type com.mikepenz.aboutlibraries.LibsBuilder");
        }
        Log.e("AboutLibraries", "The AboutLibraries fragment can't be build without the bundle containing the LibsBuilder");
        return new View(context);
    }

    public final void a() {
        a aVar = this.f8120f;
        if (aVar != null) {
            if (aVar != null) {
                aVar.cancel(true);
            }
            this.f8120f = null;
        }
    }

    public final void a(View view, Bundle bundle) {
        i.d(view, "view");
        if (view.getContext() != null) {
            Context context = view.getContext();
            i.a((Object) context, "view.context");
            Context applicationContext = context.getApplicationContext();
            i.a((Object) applicationContext, "view.context.applicationContext");
            this.f8120f = new a(this, applicationContext);
            a(this.f8120f);
        }
    }

    /* access modifiers changed from: protected */
    public final void a(a aVar) {
        if (aVar != null) {
            d dVar = this.f8117c;
            if (dVar != null) {
                int i2 = g.a[dVar.t().ordinal()];
                if (i2 == 1) {
                    aVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
                } else if (i2 == 2) {
                    aVar.executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new String[0]);
                } else if (i2 == 3) {
                    aVar.execute(new String[0]);
                }
            } else {
                i.e("builder");
                throw null;
            }
        }
    }
}
