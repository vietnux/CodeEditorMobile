package com.mikepenz.aboutlibraries.ui.b;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.Html;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.d;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.card.MaterialCardView;
import e.c.a.e;
import e.c.a.h;
import e.c.a.j;
import g.k;
import g.r.d.i;
import java.util.List;

public final class b extends e.c.b.s.a<a> {

    /* renamed from: d  reason: collision with root package name */
    private final e.c.a.o.a f6699d;

    /* renamed from: e  reason: collision with root package name */
    private final e.c.a.d f6700e;

    public static final class a extends RecyclerView.e0 {
        private TextView A;
        private TextView B;
        private MaterialCardView u;
        private TextView v;
        private TextView w;
        private View x;
        private TextView y;
        private View z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(view);
            i.d(view, "itemView");
            this.u = (MaterialCardView) view;
            View findViewById = view.findViewById(j.libraryName);
            if (findViewById != null) {
                this.v = (TextView) findViewById;
                View findViewById2 = view.findViewById(j.libraryCreator);
                if (findViewById2 != null) {
                    this.w = (TextView) findViewById2;
                    View findViewById3 = view.findViewById(j.libraryDescriptionDivider);
                    i.a((Object) findViewById3, "itemView.findViewById(R.…ibraryDescriptionDivider)");
                    this.x = findViewById3;
                    View findViewById4 = view.findViewById(j.libraryDescription);
                    if (findViewById4 != null) {
                        this.y = (TextView) findViewById4;
                        View findViewById5 = view.findViewById(j.libraryBottomDivider);
                        i.a((Object) findViewById5, "itemView.findViewById(R.id.libraryBottomDivider)");
                        this.z = findViewById5;
                        View findViewById6 = view.findViewById(j.libraryVersion);
                        if (findViewById6 != null) {
                            this.A = (TextView) findViewById6;
                            View findViewById7 = view.findViewById(j.libraryLicense);
                            if (findViewById7 != null) {
                                this.B = (TextView) findViewById7;
                                MaterialCardView materialCardView = this.u;
                                Context context = view.getContext();
                                i.a((Object) context, "itemView.context");
                                materialCardView.setCardBackgroundColor(e.c.a.p.e.a(context, h.about_libraries_card, e.c.a.i.about_libraries_card));
                                TextView textView = this.v;
                                Context context2 = view.getContext();
                                i.a((Object) context2, "itemView.context");
                                textView.setTextColor(e.c.a.p.e.a(context2, h.about_libraries_title_openSource, e.c.a.i.about_libraries_title_openSource));
                                TextView textView2 = this.w;
                                Context context3 = view.getContext();
                                i.a((Object) context3, "itemView.context");
                                textView2.setTextColor(e.c.a.p.e.a(context3, h.about_libraries_text_openSource, e.c.a.i.about_libraries_text_openSource));
                                View view2 = this.x;
                                Context context4 = view.getContext();
                                i.a((Object) context4, "itemView.context");
                                view2.setBackgroundColor(e.c.a.p.e.a(context4, h.about_libraries_dividerLight_openSource, e.c.a.i.about_libraries_dividerLight_openSource));
                                TextView textView3 = this.y;
                                Context context5 = view.getContext();
                                i.a((Object) context5, "itemView.context");
                                textView3.setTextColor(e.c.a.p.e.a(context5, h.about_libraries_text_openSource, e.c.a.i.about_libraries_text_openSource));
                                View view3 = this.z;
                                Context context6 = view.getContext();
                                i.a((Object) context6, "itemView.context");
                                view3.setBackgroundColor(e.c.a.p.e.a(context6, h.about_libraries_dividerLight_openSource, e.c.a.i.about_libraries_dividerLight_openSource));
                                TextView textView4 = this.A;
                                Context context7 = view.getContext();
                                i.a((Object) context7, "itemView.context");
                                textView4.setTextColor(e.c.a.p.e.a(context7, h.about_libraries_text_openSource, e.c.a.i.about_libraries_text_openSource));
                                TextView textView5 = this.B;
                                Context context8 = view.getContext();
                                i.a((Object) context8, "itemView.context");
                                textView5.setTextColor(e.c.a.p.e.a(context8, h.about_libraries_text_openSource, e.c.a.i.about_libraries_text_openSource));
                                return;
                            }
                            throw new k("null cannot be cast to non-null type android.widget.TextView");
                        }
                        throw new k("null cannot be cast to non-null type android.widget.TextView");
                    }
                    throw new k("null cannot be cast to non-null type android.widget.TextView");
                }
                throw new k("null cannot be cast to non-null type android.widget.TextView");
            }
            throw new k("null cannot be cast to non-null type android.widget.TextView");
        }

        public final View D() {
            return this.z;
        }

        public final TextView E() {
            return this.w;
        }

        public final TextView F() {
            return this.y;
        }

        public final TextView G() {
            return this.B;
        }

        public final TextView H() {
            return this.v;
        }

        public final TextView I() {
            return this.A;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.mikepenz.aboutlibraries.ui.b.b$b  reason: collision with other inner class name */
    public static final class View$OnClickListenerC0094b implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f6701b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f6702c;

        View$OnClickListenerC0094b(b bVar, Context context) {
            this.f6701b = bVar;
            this.f6702c = context;
        }

        public final void onClick(View view) {
            boolean z;
            e.d d2 = e.c.a.e.f8108h.a().d();
            if (d2 != null) {
                i.a((Object) view, "view");
                z = d2.d(view, this.f6701b.f6699d);
            } else {
                z = false;
            }
            if (!z) {
                b bVar = this.f6701b;
                Context context = this.f6702c;
                i.a((Object) context, "ctx");
                bVar.a((b) context, (Context) this.f6701b.f6699d.h());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c implements View.OnLongClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f6703b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f6704c;

        c(b bVar, Context context) {
            this.f6703b = bVar;
            this.f6704c = context;
        }

        public final boolean onLongClick(View view) {
            boolean z;
            e.d d2 = e.c.a.e.f8108h.a().d();
            if (d2 != null) {
                i.a((Object) view, "v");
                z = d2.e(view, this.f6703b.f6699d);
            } else {
                z = false;
            }
            if (z) {
                return z;
            }
            b bVar = this.f6703b;
            Context context = this.f6704c;
            i.a((Object) context, "ctx");
            bVar.a((b) context, (Context) this.f6703b.f6699d.h());
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f6705b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f6706c;

        d(b bVar, Context context) {
            this.f6705b = bVar;
            this.f6706c = context;
        }

        public final void onClick(View view) {
            boolean z;
            e.d d2 = e.c.a.e.f8108h.a().d();
            if (d2 != null) {
                i.a((Object) view, "v");
                z = d2.b(view, this.f6705b.f6699d);
            } else {
                z = false;
            }
            if (!z) {
                b bVar = this.f6705b;
                Context context = this.f6706c;
                i.a((Object) context, "ctx");
                bVar.b(context, this.f6705b.f6699d.n());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e implements View.OnLongClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f6707b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f6708c;

        e(b bVar, Context context) {
            this.f6707b = bVar;
            this.f6708c = context;
        }

        public final boolean onLongClick(View view) {
            boolean z;
            e.d d2 = e.c.a.e.f8108h.a().d();
            if (d2 != null) {
                i.a((Object) view, "v");
                z = d2.f(view, this.f6707b.f6699d);
            } else {
                z = false;
            }
            if (z) {
                return z;
            }
            b bVar = this.f6707b;
            Context context = this.f6708c;
            i.a((Object) context, "ctx");
            bVar.b(context, this.f6707b.f6699d.n());
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f6709b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f6710c;

        f(b bVar, Context context) {
            this.f6709b = bVar;
            this.f6710c = context;
        }

        public final void onClick(View view) {
            boolean z;
            e.d d2 = e.c.a.e.f8108h.a().d();
            if (d2 != null) {
                i.a((Object) view, "view");
                z = d2.a(view, this.f6709b.f6699d);
            } else {
                z = false;
            }
            if (!z) {
                b bVar = this.f6709b;
                Context context = this.f6710c;
                i.a((Object) context, "ctx");
                bVar.a((b) context, (Context) this.f6709b.f6700e, (e.c.a.d) this.f6709b.f6699d);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class g implements View.OnLongClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f6711b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f6712c;

        g(b bVar, Context context) {
            this.f6711b = bVar;
            this.f6712c = context;
        }

        public final boolean onLongClick(View view) {
            boolean z;
            e.d d2 = e.c.a.e.f8108h.a().d();
            if (d2 != null) {
                i.a((Object) view, "v");
                z = d2.c(view, this.f6711b.f6699d);
            } else {
                z = false;
            }
            if (z) {
                return z;
            }
            b bVar = this.f6711b;
            Context context = this.f6712c;
            i.a((Object) context, "ctx");
            bVar.a((b) context, (Context) this.f6711b.f6700e, (e.c.a.d) this.f6711b.f6699d);
            return true;
        }
    }

    public b(e.c.a.o.a aVar, e.c.a.d dVar) {
        i.d(aVar, "library");
        i.d(dVar, "libsBuilder");
        this.f6699d = aVar;
        this.f6700e = dVar;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(Context context, e.c.a.d dVar, e.c.a.o.a aVar) {
        e.c.a.o.b o;
        String b2;
        try {
            String str = null;
            if (!(!dVar.y() || (o = aVar.o()) == null || (b2 = o.b()) == null)) {
                if (b2.length() > 0) {
                    d.a aVar2 = new d.a(context);
                    e.c.a.o.b o2 = aVar.o();
                    if (o2 != null) {
                        str = o2.b();
                    }
                    aVar2.a(Html.fromHtml(str));
                    aVar2.a().show();
                    return;
                }
            }
            e.c.a.o.b o3 = aVar.o();
            if (o3 != null) {
                str = o3.e();
            }
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(Context context, String str) {
        try {
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void b(Context context, String str) {
        try {
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        } catch (Exception unused) {
        }
    }

    @Override // e.c.b.l
    public int a() {
        return j.library_item_id;
    }

    @Override // e.c.b.s.a
    public a a(View view) {
        i.d(view, "v");
        return new a(view);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$e0, java.util.List] */
    @Override // e.c.b.l, e.c.b.s.a
    public /* bridge */ /* synthetic */ void a(a aVar, List list) {
        a(aVar, (List<Object>) list);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0099, code lost:
        if ((r3.length() == 0) != true) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01eb, code lost:
        if (r1 != true) goto L_0x01ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01f3, code lost:
        if (r6.f6700e.y() != false) goto L_0x01f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01f5, code lost:
        r7.G().setOnClickListener(new com.mikepenz.aboutlibraries.ui.b.b.f(r6, r8));
        r7.G().setOnLongClickListener(new com.mikepenz.aboutlibraries.ui.b.b.g(r6, r8));
     */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0168  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0189  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x018b  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x018e  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01d6  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x022f  */
    /* JADX WARNING: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.mikepenz.aboutlibraries.ui.b.b.a r7, java.util.List<java.lang.Object> r8) {
        /*
        // Method dump skipped, instructions count: 563
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mikepenz.aboutlibraries.ui.b.b.a(com.mikepenz.aboutlibraries.ui.b.b$a, java.util.List):void");
    }

    @Override // e.c.b.l
    public int c() {
        return e.c.a.k.listitem_opensource;
    }
}
