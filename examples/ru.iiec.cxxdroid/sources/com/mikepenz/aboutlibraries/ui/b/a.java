package com.mikepenz.aboutlibraries.ui.b;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Html;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.d;
import androidx.recyclerview.widget.RecyclerView;
import e.c.a.c;
import e.c.a.e;
import e.c.a.h;
import e.c.a.j;
import g.k;
import g.n;
import g.r.c.l;
import g.r.d.i;
import java.util.List;

public final class a extends e.c.b.s.a<C0093a> {

    /* renamed from: d  reason: collision with root package name */
    private Integer f6687d;

    /* renamed from: e  reason: collision with root package name */
    private String f6688e;

    /* renamed from: f  reason: collision with root package name */
    private Drawable f6689f;

    /* renamed from: g  reason: collision with root package name */
    private e.c.a.d f6690g;

    /* renamed from: com.mikepenz.aboutlibraries.ui.b.a$a  reason: collision with other inner class name */
    public static final class C0093a extends RecyclerView.e0 {
        private TextView A;
        private View B;
        private TextView C;
        private ImageView u;
        private TextView v;
        private View w;
        private Button x;
        private Button y;
        private Button z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0093a(View view) {
            super(view);
            i.d(view, "headerView");
            View findViewById = view.findViewById(j.aboutIcon);
            if (findViewById != null) {
                this.u = (ImageView) findViewById;
                View findViewById2 = view.findViewById(j.aboutName);
                if (findViewById2 != null) {
                    this.v = (TextView) findViewById2;
                    View findViewById3 = view.findViewById(j.aboutSpecialContainer);
                    i.a((Object) findViewById3, "headerView.findViewById(…id.aboutSpecialContainer)");
                    this.w = findViewById3;
                    View findViewById4 = view.findViewById(j.aboutSpecial1);
                    if (findViewById4 != null) {
                        this.x = (Button) findViewById4;
                        View findViewById5 = view.findViewById(j.aboutSpecial2);
                        if (findViewById5 != null) {
                            this.y = (Button) findViewById5;
                            View findViewById6 = view.findViewById(j.aboutSpecial3);
                            if (findViewById6 != null) {
                                this.z = (Button) findViewById6;
                                View findViewById7 = view.findViewById(j.aboutVersion);
                                if (findViewById7 != null) {
                                    this.A = (TextView) findViewById7;
                                    View findViewById8 = view.findViewById(j.aboutDivider);
                                    i.a((Object) findViewById8, "headerView.findViewById(R.id.aboutDivider)");
                                    this.B = findViewById8;
                                    View findViewById9 = view.findViewById(j.aboutDescription);
                                    if (findViewById9 != null) {
                                        this.C = (TextView) findViewById9;
                                        TextView textView = this.v;
                                        Context context = view.getContext();
                                        i.a((Object) context, "headerView.context");
                                        textView.setTextColor(e.c.a.p.e.a(context, h.about_libraries_title_description, e.c.a.i.about_libraries_title_description));
                                        TextView textView2 = this.A;
                                        Context context2 = view.getContext();
                                        i.a((Object) context2, "headerView.context");
                                        textView2.setTextColor(e.c.a.p.e.a(context2, h.about_libraries_text_description, e.c.a.i.about_libraries_text_description));
                                        View view2 = this.B;
                                        Context context3 = view.getContext();
                                        i.a((Object) context3, "headerView.context");
                                        view2.setBackgroundColor(e.c.a.p.e.a(context3, h.about_libraries_divider_description, e.c.a.i.about_libraries_divider_description));
                                        TextView textView3 = this.C;
                                        Context context4 = view.getContext();
                                        i.a((Object) context4, "headerView.context");
                                        textView3.setTextColor(e.c.a.p.e.a(context4, h.about_libraries_text_description, e.c.a.i.about_libraries_text_description));
                                        Button button = this.x;
                                        Context context5 = view.getContext();
                                        i.a((Object) context5, "headerView.context");
                                        button.setTextColor(e.c.a.p.e.a(context5, h.about_libraries_special_button_openSource, e.c.a.i.about_libraries_special_button_openSource));
                                        Button button2 = this.y;
                                        Context context6 = view.getContext();
                                        i.a((Object) context6, "headerView.context");
                                        button2.setTextColor(e.c.a.p.e.a(context6, h.about_libraries_special_button_openSource, e.c.a.i.about_libraries_special_button_openSource));
                                        Button button3 = this.z;
                                        Context context7 = view.getContext();
                                        i.a((Object) context7, "headerView.context");
                                        button3.setTextColor(e.c.a.p.e.a(context7, h.about_libraries_special_button_openSource, e.c.a.i.about_libraries_special_button_openSource));
                                        View view3 = this.B;
                                        Context context8 = view.getContext();
                                        i.a((Object) context8, "headerView.context");
                                        view3.setBackgroundColor(e.c.a.p.e.a(context8, h.about_libraries_dividerLight_openSource, e.c.a.i.about_libraries_dividerLight_openSource));
                                        return;
                                    }
                                    throw new k("null cannot be cast to non-null type android.widget.TextView");
                                }
                                throw new k("null cannot be cast to non-null type android.widget.TextView");
                            }
                            throw new k("null cannot be cast to non-null type android.widget.Button");
                        }
                        throw new k("null cannot be cast to non-null type android.widget.Button");
                    }
                    throw new k("null cannot be cast to non-null type android.widget.Button");
                }
                throw new k("null cannot be cast to non-null type android.widget.TextView");
            }
            throw new k("null cannot be cast to non-null type android.widget.ImageView");
        }

        public final TextView D() {
            return this.C;
        }

        public final TextView E() {
            return this.v;
        }

        public final View F() {
            return this.B;
        }

        public final ImageView G() {
            return this.u;
        }

        public final Button H() {
            return this.x;
        }

        public final Button I() {
            return this.y;
        }

        public final Button J() {
            return this.z;
        }

        public final View K() {
            return this.w;
        }

        public final TextView L() {
            return this.A;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        public static final b f6691b = new b();

        b() {
        }

        public final void onClick(View view) {
            e.d d2 = e.c.a.e.f8108h.a().d();
            if (d2 != null) {
                i.a((Object) view, "it");
                d2.a(view);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c implements View.OnLongClickListener {

        /* renamed from: b  reason: collision with root package name */
        public static final c f6692b = new c();

        c() {
        }

        public final boolean onLongClick(View view) {
            boolean z;
            if (e.c.a.e.f8108h.a().d() == null) {
                return false;
            }
            e.d d2 = e.c.a.e.f8108h.a().d();
            if (d2 != null) {
                i.a((Object) view, "v");
                z = d2.b(view);
            } else {
                z = false;
            }
            return z;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f6693b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f6694c;

        d(a aVar, Context context) {
            this.f6693b = aVar;
            this.f6694c = context;
        }

        public final void onClick(View view) {
            boolean z;
            e.d d2 = e.c.a.e.f8108h.a().d();
            if (d2 != null) {
                i.a((Object) view, "v");
                z = d2.a(view, c.d.SPECIAL1);
            } else {
                z = false;
            }
            if (!z && !TextUtils.isEmpty(this.f6693b.e().d())) {
                try {
                    d.a aVar = new d.a(this.f6694c);
                    aVar.a(Html.fromHtml(this.f6693b.e().d()));
                    androidx.appcompat.app.d a = aVar.a();
                    i.a((Object) a, "AlertDialog.Builder(ctx)…                .create()");
                    a.show();
                    TextView textView = (TextView) a.findViewById(16908299);
                    if (textView != null) {
                        textView.setMovementMethod(LinkMovementMethod.getInstance());
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f6695b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f6696c;

        e(a aVar, Context context) {
            this.f6695b = aVar;
            this.f6696c = context;
        }

        public final void onClick(View view) {
            boolean z;
            e.d d2 = e.c.a.e.f8108h.a().d();
            if (d2 != null) {
                i.a((Object) view, "v");
                z = d2.a(view, c.d.SPECIAL2);
            } else {
                z = false;
            }
            if (!z && !TextUtils.isEmpty(this.f6695b.e().f())) {
                try {
                    d.a aVar = new d.a(this.f6696c);
                    aVar.a(Html.fromHtml(this.f6695b.e().f()));
                    androidx.appcompat.app.d a = aVar.a();
                    i.a((Object) a, "AlertDialog.Builder(ctx)…                .create()");
                    a.show();
                    TextView textView = (TextView) a.findViewById(16908299);
                    if (textView != null) {
                        textView.setMovementMethod(LinkMovementMethod.getInstance());
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f6697b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f6698c;

        f(a aVar, Context context) {
            this.f6697b = aVar;
            this.f6698c = context;
        }

        public final void onClick(View view) {
            boolean z;
            e.d d2 = e.c.a.e.f8108h.a().d();
            if (d2 != null) {
                i.a((Object) view, "v");
                z = d2.a(view, c.d.SPECIAL3);
            } else {
                z = false;
            }
            if (!z && !TextUtils.isEmpty(this.f6697b.e().h())) {
                try {
                    d.a aVar = new d.a(this.f6698c);
                    aVar.a(Html.fromHtml(this.f6697b.e().h()));
                    androidx.appcompat.app.d a = aVar.a();
                    i.a((Object) a, "AlertDialog.Builder(ctx)…                .create()");
                    a.show();
                    TextView textView = (TextView) a.findViewById(16908299);
                    if (textView != null) {
                        textView.setMovementMethod(LinkMovementMethod.getInstance());
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    public a(e.c.a.d dVar) {
        i.d(dVar, "libsBuilder");
        this.f6690g = dVar;
    }

    @Override // e.c.b.l
    public int a() {
        return j.header_item_id;
    }

    @Override // e.c.b.s.a
    public C0093a a(View view) {
        i.d(view, "v");
        return new C0093a(view);
    }

    public final a a(Drawable drawable) {
        this.f6689f = drawable;
        return this;
    }

    public final a a(Integer num) {
        this.f6687d = num;
        return this;
    }

    public final a a(String str) {
        this.f6688e = str;
        return this;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$e0, java.util.List] */
    @Override // e.c.b.l, e.c.b.s.a
    public /* bridge */ /* synthetic */ void a(C0093a aVar, List list) {
        a(aVar, (List<Object>) list);
    }

    public void a(C0093a aVar, List<Object> list) {
        StringBuilder sb;
        TextView textView;
        i.d(aVar, "holder");
        i.d(list, "payloads");
        super.a((RecyclerView.e0) aVar, list);
        View view = aVar.a;
        i.a((Object) view, "holder.itemView");
        Context context = view.getContext();
        if (!this.f6690g.j() || this.f6689f == null) {
            aVar.G().setVisibility(8);
        } else {
            aVar.G().setImageDrawable(this.f6689f);
            aVar.G().setOnClickListener(b.f6691b);
            aVar.G().setOnLongClickListener(c.f6692b);
        }
        String b2 = this.f6690g.b();
        boolean z = true;
        if (!(b2 == null || b2.length() == 0)) {
            aVar.E().setText(this.f6690g.b());
        } else {
            aVar.E().setVisibility(8);
        }
        aVar.K().setVisibility(8);
        aVar.H().setVisibility(8);
        aVar.I().setVisibility(8);
        aVar.J().setVisibility(8);
        if (!TextUtils.isEmpty(this.f6690g.c()) && (!TextUtils.isEmpty(this.f6690g.d()) || e.c.a.e.f8108h.a().d() != null)) {
            aVar.H().setText(this.f6690g.c());
            l<TextView, n> e2 = e.c.a.e.f8108h.a().e();
            if (e2 != null) {
                e2.a(aVar.H());
            }
            aVar.H().setVisibility(0);
            aVar.H().setOnClickListener(new d(this, context));
            aVar.K().setVisibility(0);
        }
        if (!TextUtils.isEmpty(this.f6690g.e()) && (!TextUtils.isEmpty(this.f6690g.f()) || e.c.a.e.f8108h.a().d() != null)) {
            aVar.I().setText(this.f6690g.e());
            l<TextView, n> e3 = e.c.a.e.f8108h.a().e();
            if (e3 != null) {
                e3.a(aVar.I());
            }
            aVar.I().setVisibility(0);
            aVar.I().setOnClickListener(new e(this, context));
            aVar.K().setVisibility(0);
        }
        if (!TextUtils.isEmpty(this.f6690g.g()) && (!TextUtils.isEmpty(this.f6690g.h()) || e.c.a.e.f8108h.a().d() != null)) {
            aVar.J().setText(this.f6690g.g());
            l<TextView, n> e4 = e.c.a.e.f8108h.a().e();
            if (e4 != null) {
                e4.a(aVar.J());
            }
            aVar.J().setVisibility(0);
            aVar.J().setOnClickListener(new f(this, context));
            aVar.K().setVisibility(0);
        }
        if (this.f6690g.n().length() > 0) {
            aVar.L().setText(this.f6690g.n());
        } else {
            if (this.f6690g.k()) {
                textView = aVar.L();
                sb = new StringBuilder();
                sb.append(context.getString(e.c.a.l.version));
                sb.append(' ');
                sb.append(this.f6688e);
                sb.append(" (");
                sb.append(this.f6687d);
                sb.append(')');
            } else if (this.f6690g.m()) {
                textView = aVar.L();
                sb = new StringBuilder();
                sb.append(context.getString(e.c.a.l.version));
                sb.append(' ');
                sb.append(this.f6688e);
            } else if (this.f6690g.l()) {
                textView = aVar.L();
                sb = new StringBuilder();
                sb.append(context.getString(e.c.a.l.version));
                sb.append(' ');
                sb.append(this.f6687d);
            } else {
                aVar.L().setVisibility(8);
            }
            textView.setText(sb.toString());
        }
        String i2 = this.f6690g.i();
        if (!(i2 == null || i2.length() == 0)) {
            z = false;
        }
        TextView D = aVar.D();
        if (!z) {
            D.setText(Html.fromHtml(this.f6690g.i()));
            l<TextView, n> e5 = e.c.a.e.f8108h.a().e();
            if (e5 != null) {
                e5.a(aVar.D());
            }
            aVar.D().setMovementMethod(e.c.a.p.d.f8143b.a());
        } else {
            D.setVisibility(8);
        }
        if ((!this.f6690g.j() && !this.f6690g.k()) || TextUtils.isEmpty(this.f6690g.i())) {
            aVar.F().setVisibility(8);
        }
        e.AbstractC0117e c2 = e.c.a.e.f8108h.a().c();
        if (c2 != null) {
            c2.a(aVar);
        }
    }

    @Override // e.c.b.l
    public int c() {
        return e.c.a.k.listheader_opensource;
    }

    public final e.c.a.d e() {
        return this.f6690g;
    }
}
