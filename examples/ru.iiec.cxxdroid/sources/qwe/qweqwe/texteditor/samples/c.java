package qwe.qweqwe.texteditor.samples;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import d.c.d;
import d.c.e;
import d.c.f;
import java.util.ArrayList;
import java.util.List;
import qwe.qweqwe.texteditor.n0;
import qwe.qweqwe.texteditor.o0;
import qwe.qweqwe.texteditor.q0;
import qwe.qweqwe.texteditor.samples.d;

public class c extends RecyclerView.h<a> {

    /* renamed from: d  reason: collision with root package name */
    public final List<? extends d> f9673d;

    /* renamed from: e  reason: collision with root package name */
    private final d.b f9674e;

    /* renamed from: f  reason: collision with root package name */
    private final Activity f9675f;

    /* renamed from: g  reason: collision with root package name */
    private final d f9676g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f9677h;

    public class a extends RecyclerView.e0 {
        public final View u;
        public final TextView v;
        public final TextView w;
        public d.c.d x;

        public a(c cVar, View view) {
            super(view);
            this.u = view;
            this.v = (TextView) view.findViewById(n0.id);
            ImageView imageView = (ImageView) view.findViewById(n0.imageView);
            this.w = (TextView) view.findViewById(n0.content);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.e0
        public String toString() {
            return super.toString() + " '" + ((Object) this.w.getText()) + "'";
        }
    }

    public c(Activity activity, d dVar, List<? extends d.c.d> list, d.b bVar) {
        this.f9675f = activity;
        try {
            this.f9677h = this.f9675f.getIntent().getBooleanExtra("premium_purchased", true);
        } catch (Exception e2) {
            this.f9677h = true;
            e2.printStackTrace();
        }
        this.f9673d = list;
        this.f9674e = bVar;
        this.f9676g = dVar;
    }

    public /* synthetic */ void a(e eVar, View view) {
        if (this.f9674e != null) {
            d dVar = this.f9676g;
            dVar.a(dVar.L(), (ArrayList<? extends d.c.d>) eVar.f6958d, true);
        }
    }

    public /* synthetic */ void a(f fVar, View view) {
        d.b bVar = this.f9674e;
        if (bVar != null) {
            bVar.a(fVar);
        }
    }

    /* renamed from: a */
    public void b(a aVar, int i2) {
        d.c.d dVar = (d.c.d) this.f9673d.get(i2);
        aVar.x = dVar;
        if (dVar instanceof f) {
            f fVar = (f) dVar;
            aVar.v.setText(fVar.a);
            aVar.w.setText(fVar.f6961c);
            aVar.u.setOnClickListener(new b(this, fVar));
        } else if (dVar instanceof e) {
            e eVar = (e) dVar;
            aVar.v.setText(eVar.a);
            boolean z = !eVar.f6957c || this.f9677h;
            aVar.w.setText(z ? eVar.f6956b : this.f9675f.getString(q0.require_premium_libs));
            if (z) {
                aVar.u.setOnClickListener(new a(this, eVar));
                aVar.v.setEnabled(true);
                aVar.w.setEnabled(true);
                return;
            }
            aVar.v.setOnClickListener(null);
            aVar.v.setEnabled(false);
            aVar.w.setEnabled(false);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int b() {
        return this.f9673d.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public a b(ViewGroup viewGroup, int i2) {
        return new a(this, LayoutInflater.from(viewGroup.getContext()).inflate(o0.fragment_sample, viewGroup, false));
    }
}
