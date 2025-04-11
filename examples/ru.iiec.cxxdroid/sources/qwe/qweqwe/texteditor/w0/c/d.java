package qwe.qweqwe.texteditor.w0.c;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import qwe.qweqwe.texteditor.n0;
import qwe.qweqwe.texteditor.o0;
import qwe.qweqwe.texteditor.settings.SettingsActivity;
import qwe.qweqwe.texteditor.u0.a0;

public class d extends RecyclerView.h<a> {

    /* renamed from: d  reason: collision with root package name */
    private final boolean f9799d;

    /* renamed from: e  reason: collision with root package name */
    private List<c> f9800e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f9801f = false;

    /* access modifiers changed from: package-private */
    public class a extends RecyclerView.e0 {
        View u;
        TextView v;

        a(d dVar, View view) {
            super(view);
            this.v = (TextView) view.findViewById(n0.textView);
            this.u = view.findViewById(n0.separator);
        }
    }

    public d(List<c> list, Context context, boolean z) {
        this.f9800e = list;
        this.f9801f = SettingsActivity.f(context);
        this.f9799d = z;
    }

    public void a(List<c> list) {
        this.f9800e.clear();
        if (list != null) {
            boolean z = false;
            if (this.f9799d) {
                this.f9800e.add(new k());
            }
            for (c cVar : list) {
                if (cVar.f9798c) {
                    this.f9800e.add(cVar);
                    z = true;
                }
            }
            this.f9800e.add(new g());
            if (!z) {
                this.f9800e.clear();
            }
        }
        e();
    }

    /* renamed from: a */
    public void b(a aVar, int i2) {
        boolean z;
        String str;
        c cVar = this.f9800e.get(i2);
        aVar.u.setVisibility(cVar instanceof g ? 8 : 0);
        aVar.v.setVisibility(0);
        if (!this.f9801f || !(cVar instanceof j)) {
            aVar.v.setText(cVar.a);
            if ((cVar instanceof j) && ((j) cVar).f9823f) {
                aVar.u.setVisibility(8);
                aVar.v.setVisibility(8);
                return;
            }
            return;
        }
        j jVar = (j) cVar;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        boolean z2 = true;
        if (jVar.a.length() > 0) {
            String str2 = jVar.a;
            z = j.b().contains(Character.valueOf(str2.charAt(str2.length() - 1)));
        } else {
            z = false;
        }
        if (z) {
            String str3 = jVar.a;
            char charAt = str3.charAt(str3.length() - 1);
            String str4 = jVar.f9821d;
            if (str4 != null) {
                a0.a(spannableStringBuilder, jVar.c(str4), -1);
                spannableStringBuilder.append(' ');
            }
            String str5 = jVar.a;
            a0.a(spannableStringBuilder, str5.substring(0, str5.length() - 1), -1);
            for (String str6 : jVar.f9822e) {
                if (z2) {
                    z2 = false;
                } else {
                    a0.a(spannableStringBuilder, ", ", -1);
                }
                a0.a(spannableStringBuilder, jVar.c(str6), jVar.a());
            }
            str = String.valueOf(charAt);
        } else {
            str = jVar.c(jVar.a);
        }
        a0.a(spannableStringBuilder, str, -1);
        aVar.v.setText(spannableStringBuilder, TextView.BufferType.SPANNABLE);
    }

    public boolean a(Context context) {
        this.f9801f = !this.f9801f;
        SettingsActivity.e(context, this.f9801f);
        e();
        return this.f9801f;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int b() {
        return this.f9800e.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public a b(ViewGroup viewGroup, int i2) {
        return new a(this, LayoutInflater.from(viewGroup.getContext()).inflate(o0.autocomplete_item, viewGroup, false));
    }

    public c c(int i2) {
        return this.f9800e.get(i2);
    }

    public void f() {
        this.f9800e.clear();
        e();
    }
}
